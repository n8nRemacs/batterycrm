package com.avito.android.search.filter;

import android.view.ViewTreeObserver;
import kotlin.Metadata;

/* compiled from: KeyboardVisibilityDetector.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/ViewTreeObserver;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/ViewTreeObserver;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class p1 extends kotlin.jvm.internal.N implements Y41.l<ViewTreeObserver, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o1 f263750l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(o1 o1Var) {
        super(1);
        this.f263750l = o1Var;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnGlobalLayoutListener(this.f263750l.f263740b);
        return kotlin.G0.f406611a;
    }
}
