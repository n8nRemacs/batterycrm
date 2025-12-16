package com.avito.android.payment.form;

import com.avito.android.payment.ParametersTree;
import kotlin.Metadata;

/* compiled from: PaymentGenericFormPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/G0;", "kotlin.jvm.PlatformType", "it", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/remote/model/PretendResult;", "apply", "(Lkotlin/G0;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class y<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33012o f214475b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ParametersTree f214476c;

    public y(C33012o c33012o, ParametersTree parametersTree) {
        this.f214475b = c33012o;
        this.f214476c = parametersTree;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return this.f214475b.f214367b.a(this.f214476c);
    }
}
