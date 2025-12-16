package DF0;

import Y61.k;
import com.avito.android.travel_time_calculator.data.TransportType;
import kotlin.Metadata;

/* compiled from: TravelTimeCalculator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LDF0/c;", "", "a", "_avito_travel-time-calculator_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface c {

    /* compiled from: TravelTimeCalculator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDF0/c$a;", "", "_avito_travel-time-calculator_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: TravelTimeCalculator.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: DF0.c$a$a, reason: collision with other inner class name */
        public static final class C0163a {
        }

        void a(@k TransportType transportType, long j12);

        void b(@k TransportType transportType, boolean z12);
    }

    @k
    d a(@k b bVar, @k b bVar2, long j12, @k a aVar);

    void onStop();
}
