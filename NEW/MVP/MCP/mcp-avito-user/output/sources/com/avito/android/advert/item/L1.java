package com.avito.android.advert.item;

import android.animation.ObjectAnimator;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: AdvertDetailsView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class L1 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.h<LinearLayout> f71773l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ObjectAnimator f71774m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L1(l0.h<LinearLayout> hVar, ObjectAnimator objectAnimator) {
        super(0);
        this.f71773l = hVar;
        this.f71774m = objectAnimator;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        this.f71773l.f406842b.setAlpha(1.0f);
        this.f71774m.start();
        return kotlin.G0.f406611a;
    }
}
