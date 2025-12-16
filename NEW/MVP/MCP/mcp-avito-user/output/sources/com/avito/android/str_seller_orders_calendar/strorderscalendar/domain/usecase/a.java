package com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.usecase;

import Iz0.InterfaceC14179a;
import Tz0.C15434h;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.R0;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.C43259k;

/* compiled from: LoadBookingsUseCase.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/domain/usecase/a;", "", "a", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC14179a f290794a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ScreenPerformanceTracker f290795b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC28373a f290796c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final R0 f290797d;

    /* compiled from: LoadBookingsUseCase.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/domain/usecase/a$a;", "", "<init>", "()V", "", "BOOKINGS_LOADING_TRACKER_TYPE", "Ljava/lang/String;", "CANT_LOAD_ORDERS_ERROR", "", "DEFAULT_BOOKINGS_LIMIT", "J", "a", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.usecase.a$a, reason: collision with other inner class name */
    public static final class C8797a {

        /* compiled from: LoadBookingsUseCase.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/domain/usecase/a$a$a;", "", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.usecase.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C8798a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final Map<String, List<C15434h>> f290798a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f290799b;

            /* JADX WARN: Multi-variable type inference failed */
            public C8798a(@k Map<String, ? extends List<C15434h>> map, boolean z12) {
                this.f290798a = map;
                this.f290799b = z12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C8798a)) {
                    return false;
                }
                C8798a c8798a = (C8798a) obj;
                return L.f(this.f290798a, c8798a.f290798a) && this.f290799b == c8798a.f290799b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f290799b) + (this.f290798a.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Result(itemIdToBookingsMap=");
                sb2.append(this.f290798a);
                sb2.append(", areAllItemsLoaded=");
                return r.x(sb2, this.f290799b, ')');
            }
        }

        public /* synthetic */ C8797a(C42822w c42822w) {
            this();
        }

        public C8797a() {
        }
    }

    static {
        new C8797a(null);
    }

    @Inject
    public a(@k InterfaceC14179a interfaceC14179a, @k ScreenPerformanceTracker screenPerformanceTracker, @k InterfaceC28373a interfaceC28373a, @k R0 r02) {
        this.f290794a = interfaceC14179a;
        this.f290795b = screenPerformanceTracker;
        this.f290796c = interfaceC28373a;
        this.f290797d = r02;
    }

    @l
    public final Object a(@k Date date, @k Date date2, @k SuspendLambda suspendLambda) {
        return C43259k.g(this.f290797d.a(), new b(this, date, date2, null), suspendLambda);
    }
}
