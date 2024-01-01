package com.devsuperior.desafioSpringBootComponentesEInjecao.services;

import com.devsuperior.desafioSpringBootComponentesEInjecao.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment (Order order) {
      if (order.getBasic() >= 200.0) {
          return 0;
      }
      else if (order.getBasic() >= 100.0) {
          return 12.0;
      }
      else {
          return 20.0;
      }
    }

}
