package org.akashdev.SerenityHotel.service.interfac;

import org.akashdev.SerenityHotel.dto.Response;
import org.akashdev.SerenityHotel.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}