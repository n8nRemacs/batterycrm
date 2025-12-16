package coil.request;

import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import kotlin.Metadata;
import kotlinx.coroutines.N0;

/* compiled from: RequestDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/request/a;", "Lcoil/request/v;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: coil.request.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27244a implements v {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Lifecycle f58620b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final N0 f58621c;

    public C27244a(@Y61.k Lifecycle lifecycle, @Y61.k N0 n02) {
        this.f58620b = lifecycle;
        this.f58621c = n02;
    }

    @Override // androidx.view.InterfaceC23057q
    public final void onDestroy(@Y61.k InterfaceC22983P interfaceC22983P) {
        this.f58621c.c(null);
    }

    @Override // coil.request.v
    public final void q3() {
        this.f58620b.c(this);
    }

    @Override // coil.request.v
    public final void start() {
        this.f58620b.a(this);
    }
}
