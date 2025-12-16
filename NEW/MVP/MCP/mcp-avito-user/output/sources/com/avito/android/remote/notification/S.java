package com.avito.android.remote.notification;

import Cq0.C13343b;
import Go0.InterfaceC13902a;
import com.avito.android.analytics.event.C28449x0;
import com.avito.android.saved_searches.model.SubscriptionUnreadCount;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import hz.InterfaceC41196a;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import jz.InterfaceC42451b;
import kotlin.Metadata;
import pZ.C47037b;
import rZ.InterfaceC47619a;

/* compiled from: UnreadNotificationsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/notification/S;", "Lcom/avito/android/remote/notification/M;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class S implements M {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.db.n f253979a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47619a f253980b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final f90.K f253981c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC13902a> f253982d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f253983e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41196a f253984f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e<C28449x0> f253985g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e<C47037b> f253986h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e<Integer> f253987i;

    /* compiled from: UnreadNotificationsInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LpZ/b;", "it", "Lkotlin/G0;", "accept", "(LpZ/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            S.this.f253986h.onNext((C47037b) obj);
        }
    }

    /* compiled from: UnreadNotificationsInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f253989b = new b<>();

        @Override // l41.g
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* compiled from: UnreadNotificationsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Integer;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            S.this.f253987i.onNext((Integer) obj);
        }
    }

    /* compiled from: UnreadNotificationsInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final d<T> f253991b = new d<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Failed to observe expired adverts count", (Throwable) obj);
        }
    }

    public S(@Y61.k TV.f fVar, @Y61.k pZ.d dVar, @Y61.k eH0.h hVar, @Y61.k com.avito.android.db.n nVar, @Y61.k InterfaceC47619a interfaceC47619a, @Y61.k f90.K k12, @Y61.k h31.e<InterfaceC13902a> eVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC41196a interfaceC41196a) {
        this.f253979a = nVar;
        this.f253980b = interfaceC47619a;
        this.f253981c = k12;
        this.f253982d = eVar;
        this.f253983e = interfaceC35745a5;
        this.f253984f = interfaceC41196a;
        io.reactivex.rxjava3.subjects.e<C28449x0> eVar2 = new io.reactivex.rxjava3.subjects.e<>();
        this.f253985g = eVar2;
        io.reactivex.rxjava3.subjects.e<C47037b> eVar3 = new io.reactivex.rxjava3.subjects.e<>();
        this.f253986h = eVar3;
        io.reactivex.rxjava3.subjects.e<Integer> eVar4 = new io.reactivex.rxjava3.subjects.e<>();
        this.f253987i = eVar4;
        dVar.getF197729a().c(eVar3);
        fVar.getF15686a().c(eVar2);
        hVar.b().c(eVar4);
    }

    @Override // com.avito.android.remote.notification.M
    public final void a() {
        B0 b0D0 = io.reactivex.rxjava3.core.z.W(new N(this, 0)).d0(Q.f253978b);
        InterfaceC35745a5 interfaceC35745a5 = this.f253983e;
        b0D0.x0(interfaceC35745a5.a()).u0(new a(), b.f253989b);
        io.reactivex.rxjava3.core.z.W(new N(this, 2)).x0(interfaceC35745a5.a()).u0(new c(), d.f253991b);
    }

    @Override // com.avito.android.remote.notification.M
    @Y61.k
    public final B0 b() {
        C41982q1 c41982q1X0 = io.reactivex.rxjava3.core.z.W(new N(this, 2)).x0(this.f253983e.a());
        io.reactivex.rxjava3.subjects.e<Integer> eVar = this.f253987i;
        eVar.getClass();
        return io.reactivex.rxjava3.core.z.q(c41982q1X0, eVar).d0(O.f253972b);
    }

    @Override // com.avito.android.remote.notification.M
    @Y61.k
    public final io.reactivex.rxjava3.core.z<C47037b> c() {
        C41982q1 c41982q1X0 = io.reactivex.rxjava3.core.z.W(new N(this, 0)).d0(Q.f253978b).x0(this.f253983e.a());
        io.reactivex.rxjava3.subjects.e<C47037b> eVar = this.f253986h;
        eVar.getClass();
        return io.reactivex.rxjava3.core.z.q(c41982q1X0, eVar);
    }

    @Override // com.avito.android.remote.notification.M
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.O d() {
        io.reactivex.rxjava3.core.z zVarC0;
        if (kotlin.jvm.internal.L.f(this.f253984f.a(), InterfaceC42451b.a.f405966a)) {
            zVarC0 = new io.reactivex.rxjava3.internal.operators.observable.F(new C13343b(this, 10));
        } else {
            SubscriptionUnreadCount.f258383b.getClass();
            zVarC0 = io.reactivex.rxjava3.core.z.c0(new SubscriptionUnreadCount(0));
        }
        return zVarC0.x0(this.f253983e.a()).K(new T(this));
    }

    @Override // com.avito.android.remote.notification.M
    @Y61.k
    public final io.reactivex.rxjava3.core.z<C28449x0> e() {
        C41982q1 c41982q1X0 = (kotlin.jvm.internal.L.f(this.f253984f.a(), InterfaceC42451b.a.f405966a) ? io.reactivex.rxjava3.core.z.W(new N(this, 1)) : io.reactivex.rxjava3.core.z.c0(0)).d0(P.f253973b).x0(this.f253983e.a());
        io.reactivex.rxjava3.subjects.e<C28449x0> eVar = this.f253985g;
        eVar.getClass();
        return io.reactivex.rxjava3.core.z.q(c41982q1X0, eVar);
    }
}
