package com.avito.android.serp.adapter.top_sellers_serp;

import kotlin.Metadata;

/* compiled from: TopSellersSerpWidgetView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class g<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f272476b;

    public g(i iVar) {
        this.f272476b = iVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        i iVar = this.f272476b;
        iVar.f272480d.getLayoutParams().height = iIntValue;
        iVar.f272480d.requestLayout();
    }
}
