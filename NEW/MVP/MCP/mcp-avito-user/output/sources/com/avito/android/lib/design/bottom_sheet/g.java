package com.avito.android.lib.design.bottom_sheet;

import android.view.MotionEvent;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BottomSheetDialog.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "targetView", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "invoke", "(Landroid/view/View;Landroid/view/MotionEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class g extends N implements Y41.p<View, MotionEvent, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final g f178538l = new g();

    public g() {
        super(2);
    }

    @Override // Y41.p
    public final Boolean invoke(View view, MotionEvent motionEvent) {
        View view2 = view;
        MotionEvent motionEvent2 = motionEvent;
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int left = view2.getLeft();
        int right = view2.getRight();
        int iB2 = kotlin.math.b.b(motionEvent2.getX());
        boolean z12 = left <= iB2 && iB2 <= right;
        int top = view2.getTop() + iArr[1];
        int bottom = view2.getBottom() + iArr[1];
        int iB3 = kotlin.math.b.b(motionEvent2.getY());
        return Boolean.valueOf((z12 && (top <= iB3 && iB3 <= bottom)) ? false : true);
    }
}
