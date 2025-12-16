package yv;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PriceReductionAnalyticsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyv/d;", "Lyv/c;", "_avito_delivery-abuse_price-reduction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final long f443602a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28373a f443603b;

    @Inject
    public d(@com.avito.android.delivery_abuse.price_reduction.di.b long j12, @k InterfaceC28373a interfaceC28373a) {
        this.f443602a = j12;
        this.f443603b = interfaceC28373a;
    }

    @Override // yv.c
    public final void a() {
        this.f443603b.c(new b(this.f443602a));
    }

    @Override // yv.c
    public final void b() {
        this.f443603b.c(new C50306a(this.f443602a));
    }

    @Override // yv.c
    public final void c() {
        this.f443603b.c(new f(this.f443602a));
    }
}
