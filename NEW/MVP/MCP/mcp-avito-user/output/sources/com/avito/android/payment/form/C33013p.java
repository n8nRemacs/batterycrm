package com.avito.android.payment.form;

import com.avito.android.payment.form.P;
import kotlin.Metadata;

/* compiled from: PaymentGenericFormPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/payment/form/P;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/payment/form/P;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.payment.form.p, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C33013p<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33012o f214389b;

    public C33013p(C33012o c33012o) {
        this.f214389b = c33012o;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        P p12 = (P) obj;
        if (p12 instanceof P.a) {
            this.f214389b.f214366a.c(new UV0.c(((P.a) p12).f214337b));
        }
    }
}
