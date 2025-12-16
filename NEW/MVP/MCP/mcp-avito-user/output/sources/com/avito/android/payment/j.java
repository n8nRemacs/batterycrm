package com.avito.android.payment;

import android.view.View;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PaymentTabletViews.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "containerWidth", "Lkotlin/G0;", "accept", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class j<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f214515b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Integer, G0> f214516c;

    /* JADX WARN: Multi-variable type inference failed */
    public j(View view, Y41.l<? super Integer, G0> lVar) {
        this.f214515b = view;
        this.f214516c = lVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f214516c.invoke(Integer.valueOf((((Number) obj).intValue() - this.f214515b.getResources().getDimensionPixelSize(R.dimen.vas_item_fixed_width)) / 2));
    }
}
