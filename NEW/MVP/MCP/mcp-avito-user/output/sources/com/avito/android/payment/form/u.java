package com.avito.android.payment.form;

import com.avito.android.payment.ParametersTree;
import com.avito.android.remote.model.PretendResult;
import kotlin.Metadata;

/* compiled from: PaymentGenericFormPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/PretendResult;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/PretendResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class u<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametersTree f214469b;

    public u(ParametersTree parametersTree) {
        this.f214469b = parametersTree;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f214469b.applyPretendResult(((PretendResult) obj).getErrors());
    }
}
