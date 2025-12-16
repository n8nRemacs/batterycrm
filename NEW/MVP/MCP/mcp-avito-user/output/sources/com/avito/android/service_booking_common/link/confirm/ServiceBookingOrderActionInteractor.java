package com.avito.android.service_booking_common.link.confirm;

import Y61.k;
import com.avito.android.remote.model.SimpleMessageResult;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.core.z;
import kotlin.Metadata;

/* compiled from: ServiceBookingOrderActionInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_common/link/confirm/ServiceBookingOrderActionInteractor;", "", "Action", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ServiceBookingOrderActionInteractor {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ServiceBookingOrderActionInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_common/link/confirm/ServiceBookingOrderActionInteractor$Action;", "", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Action {

        /* renamed from: c, reason: collision with root package name */
        public static final Action f276597c;

        /* renamed from: d, reason: collision with root package name */
        public static final Action f276598d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Action[] f276599e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f276600f;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f276601b;

        static {
            Action action = new Action("CONFIRM", 0, "confirmBooking");
            f276597c = action;
            Action action2 = new Action("CANCEL", 1, "cancelBooking");
            f276598d = action2;
            Action[] actionArr = {action, action2};
            f276599e = actionArr;
            f276600f = kotlin.enums.c.a(actionArr);
        }

        public Action(String str, int i12, String str2) {
            this.f276601b = str2;
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) f276599e.clone();
        }
    }

    @k
    z<P2<SimpleMessageResult>> a(@k Action action, @k String str, @k String str2);
}
