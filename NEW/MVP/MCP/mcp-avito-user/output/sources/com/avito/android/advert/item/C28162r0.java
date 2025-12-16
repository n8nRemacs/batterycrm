package com.avito.android.advert.item;

import com.avito.android.util.InterfaceC35745a5;
import kotlin.Metadata;
import kv.C43501a;

/* compiled from: AdvertDetailsPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/reactivex/rxjava3/core/z;", "Lkv/a;", "resultStream", "Lkotlin/G0;", "invoke", "(Lio/reactivex/rxjava3/core/z;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.advert.item.r0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28162r0 extends kotlin.jvm.internal.N implements Y41.l<io.reactivex.rxjava3.core.z<C43501a>, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C28136i0 f78295l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28162r0(C28136i0 c28136i0) {
        super(1);
        this.f78295l = c28136i0;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(io.reactivex.rxjava3.core.z<C43501a> zVar) {
        io.reactivex.rxjava3.core.z<C43501a> zVar2 = zVar;
        C28136i0 c28136i0 = this.f78295l;
        c28136i0.f76345g.w(zVar2);
        c28136i0.f76343f0.w(zVar2);
        c28136i0.f76346g0.w(zVar2);
        c28136i0.f76349h0.w(zVar2);
        c28136i0.f76331b0.w(zVar2);
        io.reactivex.rxjava3.internal.operators.observable.W wN2 = zVar2.N(J0.f71761b);
        InterfaceC35745a5 interfaceC35745a5 = c28136i0.f76391w;
        io.reactivex.rxjava3.disposables.d dVarT0 = wN2.j0(interfaceC35745a5.e()).t0(new K0(c28136i0));
        io.reactivex.rxjava3.disposables.c cVar = c28136i0.f76314T0;
        cVar.b(dVarT0);
        cVar.b(zVar2.N(N0.f71781b).j0(interfaceC35745a5.e()).t0(new O0(c28136i0)));
        cVar.b(zVar2.N(L0.f71772b).t0(new M0(c28136i0)));
        cVar.b(zVar2.N(A0.f71310b).d0(B0.f71591b).t0(new C0(c28136i0)));
        cVar.b(zVar2.N(F0.f71622b).N(G0.f71627b).t0(new H0(c28136i0)));
        return kotlin.G0.f406611a;
    }
}
