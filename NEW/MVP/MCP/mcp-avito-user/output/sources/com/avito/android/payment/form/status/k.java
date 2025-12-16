package com.avito.android.payment.form.status;

import android.net.Uri;
import com.avito.android.payment.form.status.A;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.observable.H0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: PaymentStatusFormPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/payment/form/status/k;", "Lcom/avito/android/payment/form/status/j;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.payment.form.status.e f214420a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h f214421b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f214422c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<A> f214423d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f214424e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f214425f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f214426g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f214427h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Uri> f214428i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f214429j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f214430k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f214431l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f214432m;

    /* compiled from: PaymentStatusFormPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/payment/form/status/A;", "kotlin.jvm.PlatformType", "currentState", "Lio/reactivex/rxjava3/core/E;", "apply", "(Lcom/avito/android/payment/form/status/A;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {
        public a() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            A a12 = (A) obj;
            if (a12 instanceof A.a) {
                return H0.f403644b;
            }
            boolean z12 = a12 instanceof A.c;
            k kVar = k.this;
            if (z12) {
                return kVar.f214420a.a().d0(new o(kVar));
            }
            if (a12 instanceof A.b) {
                return kVar.f214426g.d0(n.f214442b);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: PaymentStatusFormPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/payment/form/status/A;", "screenState", "Lkotlin/G0;", "accept", "(Lcom/avito/android/payment/form/status/A;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            k.this.f214423d.accept((A) obj);
        }
    }

    /* compiled from: PaymentStatusFormPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "throwable", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T> f214435b = new c<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.j("PaymentStatusFormPresenter", "Error while processing state", (Throwable) obj);
        }
    }

    /* compiled from: PaymentStatusFormPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/net/Uri;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Landroid/net/Uri;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p f214436b;

        public d(p pVar) {
            this.f214436b = pVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            this.f214436b.b((Uri) obj);
        }
    }

    /* compiled from: PaymentStatusFormPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u00020\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "kotlin.jvm.PlatformType", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p f214437b;

        public e(p pVar) {
            this.f214437b = pVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            this.f214437b.o8();
        }
    }

    /* compiled from: Observables.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "T", "t1", "t2", "", "test", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "com/avito/android/util/rx3/P", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T1, T2> implements l41.d {

        /* renamed from: a, reason: collision with root package name */
        public static final f<T1, T2> f214438a = new f<>();

        @Override // l41.d
        public final boolean a(@Y61.k A a12, @Y61.k A a13) {
            return a12.getClass().equals(a13.getClass());
        }
    }

    public k(@Y61.k com.avito.android.payment.form.status.e eVar, @Y61.k h hVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f214420a = eVar;
        this.f214421b = hVar;
        this.f214422c = interfaceC35745a5;
        com.jakewharton.rxrelay3.b<A> bVarN0 = com.jakewharton.rxrelay3.b.N0(new A.c());
        this.f214423d = bVarN0;
        com.jakewharton.rxrelay3.c<G0> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f214424e = cVar;
        com.jakewharton.rxrelay3.c<G0> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f214425f = cVar2;
        this.f214426g = new com.jakewharton.rxrelay3.c<>();
        com.jakewharton.rxrelay3.c<G0> cVar3 = new com.jakewharton.rxrelay3.c<>();
        this.f214427h = cVar3;
        this.f214428i = new com.jakewharton.rxrelay3.c<>();
        this.f214429j = new io.reactivex.rxjava3.disposables.c();
        this.f214430k = new io.reactivex.rxjava3.disposables.c();
        io.reactivex.rxjava3.disposables.c cVar4 = new io.reactivex.rxjava3.disposables.c();
        this.f214431l = cVar4;
        this.f214432m = new l(cVar3);
        cVar.t0(cVar2);
        io.reactivex.rxjava3.core.z<R> zVarY0 = bVarN0.B(f.f214438a).y0(new a());
        b bVar = new b();
        l41.g<? super Throwable> gVar = c.f214435b;
        zVarY0.getClass();
        cVar4.b(zVarY0.v0(bVar, gVar, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.payment.form.status.z
    @Y61.k
    public final Y41.a<G0> a() {
        return this.f214432m;
    }

    @Override // com.avito.android.payment.form.status.j
    public final void b(@Y61.k p pVar) {
        io.reactivex.rxjava3.disposables.d dVarT0 = this.f214428i.t0(new d(pVar));
        io.reactivex.rxjava3.disposables.c cVar = this.f214429j;
        cVar.b(dVarT0);
        cVar.b(this.f214425f.t0(new e(pVar)));
    }

    @Override // com.avito.android.payment.form.status.j
    public final void c(@Y61.k y yVar) {
        io.reactivex.rxjava3.disposables.d dVarT0 = yVar.f214461g.t0(this.f214424e);
        io.reactivex.rxjava3.disposables.c cVar = this.f214430k;
        cVar.b(dVarT0);
        cVar.b(yVar.f214462h.t0(this.f214426g));
        cVar.b(this.f214423d.j0(this.f214422c.e()).t0(yVar.f214465k));
    }

    @Override // com.avito.android.payment.form.status.j
    public final void c0() {
        this.f214429j.e();
    }

    @Override // com.avito.android.payment.form.status.j
    public final void dispose() {
        this.f214431l.dispose();
    }

    @Override // com.avito.android.payment.form.status.j
    public final void e0() {
        this.f214430k.e();
    }
}
