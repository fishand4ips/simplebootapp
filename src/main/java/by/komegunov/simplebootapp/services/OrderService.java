package by.komegunov.simplebootapp.services;


import by.komegunov.simplebootapp.entities.Order;
import by.komegunov.simplebootapp.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private OrderRepository orderRepository;

    @Autowired
    public void setOrderRepository(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }
}
