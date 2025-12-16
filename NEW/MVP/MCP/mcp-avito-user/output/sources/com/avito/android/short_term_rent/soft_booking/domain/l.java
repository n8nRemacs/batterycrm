package com.avito.android.short_term_rent.soft_booking.domain;

import Xv0.InterfaceC17053a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.remote.d1;
import com.avito.android.remote.model.RefundToggle;
import com.google.gson.Gson;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.X;
import pw0.C47157a;
import pw0.C47159c;
import pw0.k;

/* compiled from: StrSoftBookingDetailsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/domain/l;", "Lcom/avito/android/short_term_rent/soft_booking/domain/k;", "a", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l implements k {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f282625g = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d1 f282626a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f282627b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC17053a f282628c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Gson f282629d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.short_term_rent.utils.d f282630e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final AtomicBoolean f282631f = new AtomicBoolean(false);

    /* compiled from: StrSoftBookingDetailsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/short_term_rent/soft_booking/domain/l$a;", "", "<init>", "()V", "", "PAYMENT_TYPES_SEPARATOR", "Ljava/lang/String;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public l(@Y61.k d1 d1Var, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k InterfaceC17053a interfaceC17053a, @Y61.k Gson gson, @Y61.k com.avito.android.short_term_rent.utils.d dVar) {
        this.f282626a = d1Var;
        this.f282627b = screenPerformanceTracker;
        this.f282628c = interfaceC17053a;
        this.f282629d = gson;
        this.f282630e = dVar;
    }

    public static k.a b(RefundToggle.Button button) {
        if (button == null) {
            return null;
        }
        String priceWithDiscount = button.getPriceWithDiscount();
        String discount = button.getDiscount();
        if (priceWithDiscount != null && discount != null) {
            return new k.a(button.getTooltip(), button.getId(), button.getText(), priceWithDiscount, discount, button.getTotalPrice());
        }
        return new k.a(button.getTooltip(), button.getId(), button.getText(), button.getTotalPrice(), null, null);
    }

    @Override // com.avito.android.short_term_rent.soft_booking.domain.k
    @Y61.k
    public final X a(@Y61.k C47157a c47157a, @Y61.k C47159c c47159c, @Y61.l pw0.j jVar, @Y61.l pw0.g gVar, @Y61.l pw0.i iVar, @Y61.l pw0.h hVar, @Y61.l Boolean bool) {
        return new X(new C43137a0(new o(2, null), com.avito.android.analytics.screens.utils.m.a(C43175k.G(new n(c47157a, this, iVar, hVar, bool, c47159c, jVar, gVar, null)), this.f282627b, "performance_track_calculate_details")), new p(3, null));
    }
}
