package rk;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: B2bBusinessTripAnalyticsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrk/b;", "Lrk/a;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rk.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C47670b implements InterfaceC47669a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f430156a;

    @Inject
    public C47670b(@k InterfaceC28373a interfaceC28373a) {
        this.f430156a = interfaceC28373a;
    }

    @Override // rk.InterfaceC47669a
    public final void a(@k Long[] lArr) {
        this.f430156a.c(new e(lArr));
    }

    @Override // rk.InterfaceC47669a
    public final void b() {
        this.f430156a.c(new f());
    }

    @Override // rk.InterfaceC47669a
    public final void c() {
        this.f430156a.c(new g());
    }
}
