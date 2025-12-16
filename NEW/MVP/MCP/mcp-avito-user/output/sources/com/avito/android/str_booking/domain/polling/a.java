package com.avito.android.str_booking.domain.polling;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import mx0.InterfaceC44149a;

/* compiled from: BookingPollingEvent.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/str_booking/domain/polling/a;", "Lmx0/a;", "", "eventId", "", ChannelContext.Item.USER_ID, "Lcom/avito/android/str_booking/domain/polling/a$a;", "body", "<init>", "(Ljava/lang/String;ILcom/avito/android/str_booking/domain/polling/a$a;)V", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "I", "getUserId", "()I", "Lcom/avito/android/str_booking/domain/polling/a$a;", "getBody", "()Lcom/avito/android/str_booking/domain/polling/a$a;", "a", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements InterfaceC44149a {

    @com.google.gson.annotations.c("body")
    @k
    private final C8550a body;

    @com.google.gson.annotations.c("eventID")
    @k
    private final String eventId;

    @com.google.gson.annotations.c("userID")
    private final int userId;

    /* compiled from: BookingPollingEvent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/str_booking/domain/polling/a$a;", "", "", "bookingId", "", "reason", "<init>", "(JLjava/lang/String;)V", "J", "getBookingId", "()J", "Ljava/lang/String;", "getReason", "()Ljava/lang/String;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.str_booking.domain.polling.a$a, reason: collision with other inner class name */
    public static final /* data */ class C8550a {

        @com.google.gson.annotations.c("bookingID")
        private final long bookingId;

        @com.google.gson.annotations.c("reason")
        @k
        private final String reason;

        public C8550a(long j12, @k String str) {
            this.bookingId = j12;
            this.reason = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8550a)) {
                return false;
            }
            C8550a c8550a = (C8550a) obj;
            return this.bookingId == c8550a.bookingId && L.f(this.reason, c8550a.reason);
        }

        public final int hashCode() {
            return this.reason.hashCode() + (Long.hashCode(this.bookingId) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Body(bookingId=");
            sb2.append(this.bookingId);
            sb2.append(", reason=");
            return C22026a.c(sb2, this.reason, ')');
        }
    }

    public a(@k String str, int i12, @k C8550a c8550a) {
        this.eventId = str;
        this.userId = i12;
        this.body = c8550a;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.eventId, aVar.eventId) && this.userId == aVar.userId && L.f(this.body, aVar.body);
    }

    public final int hashCode() {
        return this.body.hashCode() + r.e(this.userId, this.eventId.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        return "BookingPollingEvent(eventId=" + this.eventId + ", userId=" + this.userId + ", body=" + this.body + ')';
    }
}
