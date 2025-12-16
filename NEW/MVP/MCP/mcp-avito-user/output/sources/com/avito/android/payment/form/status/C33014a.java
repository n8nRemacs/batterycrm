package com.avito.android.payment.form.status;

import A60.b;
import android.os.Parcelable;
import com.avito.android.payment.ModalState;
import com.avito.android.payment.form.M;
import com.avito.android.payment.form.O;
import com.avito.android.remote.model.SimpleUserDialog;
import com.avito.android.remote.model.payment.status.PaymentStatusResult;
import com.avito.android.util.Kundle;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ActiveStatusWrappingPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/payment/form/status/a;", "Lcom/avito/android/payment/form/status/B;", "Lcom/avito/android/payment/form/M;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.payment.form.status.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C33014a implements B, M {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final M f214409a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<ModalState> f214410b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f214411c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f214412d;

    /* compiled from: ActiveStatusWrappingPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u00020\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "kotlin.jvm.PlatformType", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.payment.form.status.a$a, reason: collision with other inner class name */
    public static final class C6430a<T> implements l41.g {
        public C6430a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C33014a.this.f214410b.accept(ModalState.a.f213981b);
        }
    }

    public C33014a(@Y61.k M m12, @Y61.l Kundle kundle) {
        Object obj;
        this.f214409a = m12;
        if (kundle == null || !kundle.f318647b.containsKey("ActiveStatusWrappingPresenter_ModalState") || (obj = (ModalState.NotifyingDialog) kundle.d("ActiveStatusWrappingPresenter_ModalState")) == null) {
            obj = ModalState.a.f213981b;
        }
        this.f214410b = com.jakewharton.rxrelay3.b.N0(obj);
        com.jakewharton.rxrelay3.c<G0> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f214411c = cVar;
        this.f214412d = new io.reactivex.rxjava3.disposables.c();
        cVar.t0(new C6430a());
    }

    @Override // com.avito.android.payment.form.M
    public final void a(@Y61.k A60.b bVar) {
        G0 g02;
        if (bVar instanceof b.c) {
            PaymentStatusResult.PaymentStatus paymentStatus = ((b.c) bVar).f106a;
            if (L.f(paymentStatus.getState(), "active")) {
                SimpleUserDialog userDialog = paymentStatus.getUserDialog();
                com.jakewharton.rxrelay3.b<ModalState> bVar2 = this.f214410b;
                if (userDialog != null) {
                    bVar2.accept(new ModalState.NotifyingDialog(userDialog, false, null, 6, null));
                    g02 = G0.f406611a;
                } else {
                    g02 = null;
                }
                if (g02 == null) {
                    bVar2.accept(ModalState.a.f213981b);
                    return;
                }
                return;
            }
        }
        this.f214409a.a(bVar);
    }

    @Override // com.avito.android.payment.form.status.B
    public final void b(@Y61.k y yVar) {
        io.reactivex.rxjava3.disposables.d dVarT0 = this.f214410b.t0(yVar.f214463i);
        io.reactivex.rxjava3.disposables.c cVar = this.f214412d;
        cVar.b(dVarT0);
        cVar.b(yVar.f214464j.t0(this.f214411c));
    }

    @Override // com.avito.android.payment.form.M
    public final void c(@Y61.k com.avito.android.payment.b bVar) {
        this.f214409a.c(bVar);
    }

    @Override // com.avito.android.payment.form.M
    public final void c0() {
        this.f214409a.c0();
    }

    @Override // com.avito.android.payment.form.M
    public final void d(@Y61.k O o12) {
        this.f214409a.d(o12);
    }

    @Override // com.avito.android.payment.form.status.B
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        Object obj = (ModalState) this.f214410b.f364266b.get();
        if (obj instanceof ModalState.NotifyingDialog) {
            kundle.j((Parcelable) obj, "ActiveStatusWrappingPresenter_ModalState");
        }
        return kundle;
    }

    @Override // com.avito.android.payment.form.M
    public final void e0() {
        this.f214412d.e();
        this.f214409a.e0();
    }
}
