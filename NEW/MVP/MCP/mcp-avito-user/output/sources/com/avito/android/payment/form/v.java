package com.avito.android.payment.form;

import com.avito.android.payment.ParametersTree;
import kotlin.Metadata;

/* compiled from: PaymentGenericFormPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/PretendResult;", "it", "Lcom/avito/android/payment/form/P$a;", "apply", "(Lcom/avito/android/remote/model/PretendResult;)Lcom/avito/android/payment/form/P$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class v<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33012o f214470b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C32998a f214471c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametersTree f214472d;

    public v(C33012o c33012o, C32998a c32998a, ParametersTree parametersTree) {
        this.f214470b = c33012o;
        this.f214471c = c32998a;
        this.f214472d = parametersTree;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return this.f214470b.f214368c.a(this.f214471c, this.f214472d, false);
    }
}
