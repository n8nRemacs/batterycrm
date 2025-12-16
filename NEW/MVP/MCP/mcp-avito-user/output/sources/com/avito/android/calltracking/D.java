package com.avito.android.calltracking;

import androidx.view.AbstractC22991Y;
import androidx.view.InterfaceC23040h0;
import com.avito.android.calltracking.remote.model.CalltrackingResponse;
import com.avito.android.util.P2;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CalltrackingPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/calltracking/D;", "Lcom/avito/android/calltracking/y;", "_avito_calltracking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class D implements y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final M f113566a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f113567b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC29287o f113568c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f113569d = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: CalltrackingPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC23040h0, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f113570b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l lVar) {
            this.f113570b = (kotlin.jvm.internal.N) lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof kotlin.jvm.internal.D)) {
                return this.f113570b.equals(((kotlin.jvm.internal.D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f113570b;
        }

        public final int hashCode() {
            return this.f113570b.hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f113570b.invoke(obj);
        }
    }

    @Inject
    public D(@Y61.k M m12, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k InterfaceC29287o interfaceC29287o) {
        this.f113566a = m12;
        this.f113567b = aVar;
        this.f113568c = interfaceC29287o;
    }

    @Override // com.avito.android.calltracking.y
    public final void a(@Y61.k K k12) {
        com.jakewharton.rxrelay3.c<G0> cVar = k12.f113583d;
        io.reactivex.rxjava3.disposables.d dVarT0 = com.avito.android.advert.item.delivery_suggests.l.l(cVar, cVar).t0(new z(this));
        io.reactivex.rxjava3.disposables.c cVar2 = this.f113569d;
        cVar2.b(dVarT0);
        com.jakewharton.rxrelay3.c<G0> cVar3 = k12.f113584e;
        cVar2.b(com.avito.android.advert.item.delivery_suggests.l.l(cVar3, cVar3).t0(new A(this)));
        M m12 = this.f113566a;
        AbstractC22991Y<P2<CalltrackingResponse>> abstractC22991YP8 = m12.p8();
        InterfaceC29287o interfaceC29287o = this.f113568c;
        abstractC22991YP8.observe(interfaceC29287o.b(), new a(new B(this, k12)));
        m12.jd().observe(interfaceC29287o.b(), new a(new C(k12)));
    }

    @Override // com.avito.android.calltracking.y
    public final void t() {
        this.f113569d.dispose();
        M m12 = this.f113566a;
        AbstractC22991Y<P2<CalltrackingResponse>> abstractC22991YP8 = m12.p8();
        InterfaceC29287o interfaceC29287o = this.f113568c;
        abstractC22991YP8.removeObservers(interfaceC29287o.b());
        m12.jd().removeObservers(interfaceC29287o.b());
    }
}
