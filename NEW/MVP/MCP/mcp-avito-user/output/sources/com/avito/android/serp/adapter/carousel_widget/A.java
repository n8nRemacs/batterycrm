package com.avito.android.serp.adapter.carousel_widget;

import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: CarouselItemsWidgetView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class A<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C34699i f269242b;

    public A(C34699i c34699i) {
        this.f269242b = c34699i;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C34699i c34699i = this.f269242b;
        c34699i.f269384m.setMinimumHeight(((Number) c34699i.f269359F.getValue()).intValue() + c34699i.f269396y);
        V2.f318762a.a("DEFAULT_TAG", "Bad request of highest item", (Throwable) obj);
    }
}
