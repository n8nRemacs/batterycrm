package com.avito.android.payment.form;

import com.avito.android.payment.ParametersTree;
import kotlin.Metadata;

/* compiled from: PaymentGenericFormPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/G0;", "kotlin.jvm.PlatformType", "it", "Lcom/avito/android/payment/form/P$a;", "apply", "(Lkotlin/G0;)Lcom/avito/android/payment/form/P$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class q<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33012o f214390b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C32998a f214391c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametersTree f214392d;

    public q(C33012o c33012o, C32998a c32998a, ParametersTree parametersTree) {
        this.f214390b = c33012o;
        this.f214391c = c32998a;
        this.f214392d = parametersTree;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return this.f214390b.f214368c.a(this.f214391c, this.f214392d, false);
    }
}
