package com.avito.android.sbc.autodispatches;

import Xo0.InterfaceC17032a;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C1;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SbcAutoDispatchesInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/autodispatches/v;", "Lcom/avito/android/sbc/autodispatches/m;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class v implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34468d f258964a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC17032a f258965b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f258966c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f258967d;

    @Inject
    public v(@Y61.k InterfaceC34468d interfaceC34468d, @Y61.k InterfaceC17032a interfaceC17032a, @Y61.k R0 r02, @Y61.k com.avito.android.server_time.f fVar) {
        this.f258964a = interfaceC34468d;
        this.f258965b = interfaceC17032a;
        this.f258966c = r02;
        this.f258967d = fVar;
    }

    @Override // com.avito.android.sbc.autodispatches.m
    @Y61.k
    public final C43137a0 a(boolean z12) {
        return new C43137a0(new p(2, null), d(o.f258948l, new n(z12)));
    }

    @Override // com.avito.android.sbc.autodispatches.m
    public final void b() {
        this.f258964a.invalidate();
    }

    @Override // com.avito.android.sbc.autodispatches.m
    @Y61.k
    public final C43137a0 c() {
        return new C43137a0(new t(2, null), d(s.f258956l, r.f258955l));
    }

    public final C1 d(Y41.a aVar, Y41.p pVar) {
        j.f258912a.getClass();
        InterfaceC43160i interfaceC43160iG = C43175k.G(new q(this, j.f258913b, null));
        R0 r02 = this.f258966c;
        return new C1(C43175k.I(r02.a(), interfaceC43160iG), C43175k.I(r02.a(), C43175k.G(new q(this, j.f258914c, null))), new u(this, pVar, aVar, null));
    }
}
