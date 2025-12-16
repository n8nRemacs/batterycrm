package com.yandex.div.core.view2.divs;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import kotlin.Metadata;

/* compiled from: DivContainerBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/div2/W0;", "it", "Lkotlin/G0;", "invoke", "(Lcom/yandex/div2/W0;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* renamed from: com.yandex.div.core.view2.divs.p0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C37987p0 extends kotlin.jvm.internal.N implements Y41.l<com.yandex.div2.W0, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f368598l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f368599m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.e f368600n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C37987p0(Y41.l<? super Drawable, kotlin.G0> lVar, ViewGroup viewGroup, com.yandex.div.json.expressions.e eVar) {
        super(1);
        this.f368598l = (kotlin.jvm.internal.N) lVar;
        this.f368599m = viewGroup;
        this.f368600n = eVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.l
    public final kotlin.G0 invoke(com.yandex.div2.W0 w02) {
        this.f368598l.invoke(C37931a.K(w02, this.f368599m.getResources().getDisplayMetrics(), this.f368600n));
        return kotlin.G0.f406611a;
    }
}
