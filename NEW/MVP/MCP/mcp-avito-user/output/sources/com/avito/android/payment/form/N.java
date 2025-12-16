package com.avito.android.payment.form;

import A60.b;
import kotlin.Metadata;

/* compiled from: PaymentStatusProcessingPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/payment/form/N;", "Lcom/avito/android/payment/form/M;", "<init>", "()V", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class N implements M {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public com.avito.android.payment.b f214334a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public O f214335b;

    @Override // com.avito.android.payment.form.M
    public final void a(@Y61.k A60.b bVar) {
        if (bVar instanceof b.c) {
            O o12 = this.f214335b;
            if (o12 != null) {
                o12.a(((b.c) bVar).f106a);
                return;
            }
            return;
        }
        if (bVar instanceof b.d) {
            O o13 = this.f214335b;
            if (o13 != null) {
                o13.c(((b.d) bVar).f107a);
                return;
            }
            return;
        }
        if (!(bVar instanceof b.C0008b)) {
            boolean z12 = bVar instanceof b.a;
            return;
        }
        com.avito.android.payment.b bVar2 = this.f214334a;
        if (bVar2 != null) {
            bVar2.a(((b.C0008b) bVar).f105a);
        }
    }

    @Override // com.avito.android.payment.form.M
    public final void c(@Y61.k com.avito.android.payment.b bVar) {
        this.f214334a = bVar;
    }

    @Override // com.avito.android.payment.form.M
    public final void c0() {
        this.f214335b = null;
    }

    @Override // com.avito.android.payment.form.M
    public final void d(@Y61.k O o12) {
        this.f214335b = o12;
    }

    @Override // com.avito.android.payment.form.M
    public final void e0() {
        this.f214334a = null;
    }
}
