package com.avito.android.comparison;

import android.view.MotionEvent;
import kotlin.Metadata;

/* compiled from: ComparisonView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/MotionEvent;", "it", "Lkotlin/G0;", "accept", "(Landroid/view/MotionEvent;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class j<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f124076b;

    public j(l lVar) {
        this.f124076b = lVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f124076b.f124084g.getHeaderRecycler().dispatchTouchEvent((MotionEvent) obj);
    }
}
