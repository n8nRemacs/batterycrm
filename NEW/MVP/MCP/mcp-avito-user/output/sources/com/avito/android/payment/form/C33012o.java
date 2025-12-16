package com.avito.android.payment.form;

import com.avito.android.payment.ParametersTree;
import com.avito.android.payment.form.P;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PaymentGenericFormPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/payment/form/o;", "Lcom/avito/android/payment/form/l;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.payment.form.o, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C33012o implements InterfaceC33009l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.recycler.data_aware.c f214366a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33003f f214367b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33006i f214368c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f214369d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Kundle f214370e;

    /* renamed from: f, reason: collision with root package name */
    public ParametersTree f214371f;

    /* renamed from: g, reason: collision with root package name */
    public C32998a f214372g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<P> f214373h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f214374i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f214375j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f214376k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.payment.items.phone_item.g> f214377l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f214378m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f214379n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f214380o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f214381p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f214382q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f214383r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final Y41.l<com.avito.android.payment.items.phone_item.g, G0> f214384s;

    /* compiled from: PaymentGenericFormPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u00020\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "kotlin.jvm.PlatformType", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.payment.form.o$a */
    public static final class a<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ E f214385b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C33012o f214386c;

        public a(E e12, C33012o c33012o) {
            this.f214385b = e12;
            this.f214386c = c33012o;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C33012o c33012o = this.f214386c;
            C32998a c32998a = c33012o.f214372g;
            String str = (c32998a == null ? null : c32998a).f214351d;
            if (c32998a == null) {
                c32998a = null;
            }
            String str2 = c32998a.f214352e;
            ParametersTree parametersTree = c33012o.f214371f;
            this.f214385b.F0(str, str2, parametersTree != null ? parametersTree : null);
        }
    }

    /* compiled from: PaymentGenericFormPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u00020\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "kotlin.jvm.PlatformType", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.payment.form.o$b */
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ E f214387b;

        public b(E e12) {
            this.f214387b = e12;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            this.f214387b.E0();
        }
    }

    /* compiled from: PaymentGenericFormPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/payment/form/P;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/payment/form/P;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.payment.form.o$c */
    public static final class c<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ E f214388b;

        public c(E e12) {
            this.f214388b = e12;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            P p12 = (P) obj;
            if (p12 instanceof P.b) {
                this.f214388b.G0(((P.b) p12).f214339a);
            }
        }
    }

    public C33012o(@Y61.k com.avito.android.recycler.data_aware.c cVar, @Y61.k InterfaceC33003f interfaceC33003f, @Y61.k InterfaceC33006i interfaceC33006i, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.l Kundle kundle) {
        this.f214366a = cVar;
        this.f214367b = interfaceC33003f;
        this.f214368c = interfaceC33006i;
        this.f214369d = interfaceC35745a5;
        this.f214370e = kundle;
        com.jakewharton.rxrelay3.b<P> bVarN0 = com.jakewharton.rxrelay3.b.N0(new P.c());
        this.f214373h = bVarN0;
        this.f214374i = new com.jakewharton.rxrelay3.c<>();
        this.f214375j = new com.jakewharton.rxrelay3.c<>();
        com.jakewharton.rxrelay3.c<G0> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f214376k = cVar2;
        this.f214377l = new com.jakewharton.rxrelay3.c<>();
        this.f214378m = new com.jakewharton.rxrelay3.c<>();
        this.f214379n = new com.jakewharton.rxrelay3.c<>();
        this.f214380o = new io.reactivex.rxjava3.disposables.c();
        this.f214381p = new io.reactivex.rxjava3.disposables.c();
        io.reactivex.rxjava3.disposables.c cVar3 = new io.reactivex.rxjava3.disposables.c();
        this.f214382q = cVar3;
        this.f214383r = new C33011n(cVar2);
        cVar3.b(bVarN0.B(C.f214320a).y0(new C33010m(this)).t0(bVarN0));
        this.f214384s = new z(this);
    }

    @Override // com.avito.android.payment.form.L
    @Y61.k
    public final Y41.a<G0> a() {
        return this.f214383r;
    }

    @Override // com.avito.android.payment.form.InterfaceC33009l
    public final void b(@Y61.k J j12) {
        io.reactivex.rxjava3.disposables.d dVarT0 = j12.f214330f.t0(this.f214374i);
        io.reactivex.rxjava3.disposables.c cVar = this.f214381p;
        cVar.b(dVarT0);
        cVar.b(j12.f214331g.t0(this.f214375j));
        InterfaceC35745a5 interfaceC35745a5 = this.f214369d;
        io.reactivex.rxjava3.core.H hE2 = interfaceC35745a5.e();
        com.jakewharton.rxrelay3.b<P> bVar = this.f214373h;
        cVar.b(bVar.j0(hE2).t0(j12.f214332h));
        cVar.b(bVar.j0(interfaceC35745a5.e()).t0(new C33013p(this)));
    }

    @Override // com.avito.android.payment.form.L
    @Y61.k
    public final Y41.l<com.avito.android.payment.items.phone_item.g, G0> c() {
        return this.f214384s;
    }

    @Override // com.avito.android.payment.form.InterfaceC33009l
    public final void c0() {
        this.f214380o.e();
    }

    @Override // com.avito.android.payment.form.InterfaceC33009l
    public final void d(@Y61.k E e12) {
        io.reactivex.rxjava3.disposables.d dVarT0 = this.f214378m.t0(new a(e12, this));
        io.reactivex.rxjava3.disposables.c cVar = this.f214380o;
        cVar.b(dVarT0);
        cVar.b(this.f214374i.t0(new b(e12)));
        cVar.b(this.f214373h.t0(new c(e12)));
    }

    @Override // com.avito.android.payment.form.InterfaceC33009l
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        ParametersTree parametersTree = this.f214371f;
        if (parametersTree != null) {
            kundle.j(parametersTree, "PaymentGenericFormPresenterImpl_entered_params");
        }
        return kundle;
    }

    @Override // com.avito.android.payment.form.InterfaceC33009l
    public final void dispose() {
        this.f214382q.dispose();
    }

    @Override // com.avito.android.payment.form.InterfaceC33009l
    public final void e0() {
        this.f214381p.e();
    }
}
