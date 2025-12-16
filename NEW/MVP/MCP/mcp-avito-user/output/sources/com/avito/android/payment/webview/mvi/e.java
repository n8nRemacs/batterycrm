package com.avito.android.payment.webview.mvi;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import kotlin.Metadata;

/* compiled from: WebPaymentMviActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u00020\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "kotlin.jvm.PlatformType", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class e<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebPaymentMviActivity f214918b;

    public e(WebPaymentMviActivity webPaymentMviActivity) {
        this.f214918b = webPaymentMviActivity;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        y yVar = this.f214918b.f214842y;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
    }
}
