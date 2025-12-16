package com.avito.android.messenger;

import com.avito.android.C30277e1;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.util.InterfaceC35745a5;
import hz.InterfaceC41196a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MessengerUserIdInteractor.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/g0;", "Lcom/avito/android/messenger/w0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g0 implements w0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.G f196359a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC34401z0> f196360b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f196361c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f196362d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.O f196363e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41196a f196364f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<Boolean> f196365g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f196366h = new com.jakewharton.rxrelay3.c();

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f196367i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b f196368j;

    @Inject
    public g0(@Y61.k com.avito.android.account.G g12, @Y61.k h31.e<InterfaceC34401z0> eVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k C30277e1 c30277e1, @Y61.k com.avito.android.account.O o12, @Y61.k InterfaceC41196a interfaceC41196a) {
        this.f196359a = g12;
        this.f196360b = eVar;
        this.f196361c = interfaceC35745a5;
        this.f196362d = c30277e1;
        this.f196363e = o12;
        this.f196364f = interfaceC41196a;
        this.f196365g = g12.g();
        com.jakewharton.rxrelay3.c<G0> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f196367i = cVar;
        com.jakewharton.rxrelay3.b bVar = new com.jakewharton.rxrelay3.b();
        this.f196368j = bVar;
        a().B(Z.f186183a).q0(1L).t0(new a0(this));
        io.reactivex.rxjava3.core.z.k(g12.getF68055j().j0(interfaceC35745a5.a()).B(V.f186177a).y0(new Y(this, new AtomicReference(null))), kotlinx.coroutines.rx3.y.b(new kotlinx.coroutines.flow.Y(new P(2, null), interfaceC41196a.h())), new d0()).N(new T(this)).d0(new U(this)).D(io.reactivex.rxjava3.internal.functions.a.f401991a).t0(bVar);
        new io.reactivex.rxjava3.internal.operators.observable.Z(cVar.j0(interfaceC35745a5.a()).C0(15000L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b), new c0(this)).r().u();
    }

    @Override // com.avito.android.messenger.w0
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.L a() {
        return io.reactivex.rxjava3.core.z.k(this.f196359a.getF68055j(), kotlinx.coroutines.rx3.y.b(new kotlinx.coroutines.flow.Y(new P(2, null), this.f196364f.h())), new d0()).N(new Q(this)).d0(new S(this)).D(io.reactivex.rxjava3.internal.functions.a.f401991a);
    }

    @Override // com.avito.android.messenger.w0
    @Y61.k
    public final io.reactivex.rxjava3.core.z<Boolean> b() {
        return this.f196365g;
    }

    @Override // com.avito.android.messenger.w0
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.L c() {
        return this.f196368j.d0(O.f186170b).D(io.reactivex.rxjava3.internal.functions.a.f401991a);
    }

    @Override // com.avito.android.messenger.w0
    public final void d() {
        this.f196367i.accept(G0.f406611a);
    }

    @Override // com.avito.android.messenger.w0
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.L e() {
        return g().d0(M.f186162b).D(io.reactivex.rxjava3.internal.functions.a.f401991a);
    }

    @Override // com.avito.android.messenger.w0
    /* renamed from: f, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF196366h() {
        return this.f196366h;
    }

    @Override // com.avito.android.messenger.w0
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.L g() {
        return this.f196368j.d0(N.f186169b).D(io.reactivex.rxjava3.internal.functions.a.f401991a);
    }
}
