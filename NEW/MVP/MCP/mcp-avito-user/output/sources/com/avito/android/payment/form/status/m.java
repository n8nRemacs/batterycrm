package com.avito.android.payment.form.status;

import com.avito.android.remote.model.payment.status.form.PaymentStatusFormResult;
import kotlin.Metadata;

/* compiled from: PaymentStatusFormPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u00020\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "kotlin.jvm.PlatformType", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class m<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f214440b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PaymentStatusFormResult.StatusForm f214441c;

    public m(k kVar, PaymentStatusFormResult.StatusForm statusForm) {
        this.f214440b = kVar;
        this.f214441c = statusForm;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f214440b.f214428i.accept(this.f214441c.getAction().getLink());
    }
}
