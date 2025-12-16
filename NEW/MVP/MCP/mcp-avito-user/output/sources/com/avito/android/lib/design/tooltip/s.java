package com.avito.android.lib.design.tooltip;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;

/* compiled from: TooltipUtils.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/tooltip/s;", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final s f181270a = new s();

    @SuppressLint({"RtlHardcoded"})
    public static int a(@Y61.k Rect rect, @Y61.k Rect rect2) {
        if (rect.bottom <= rect2.bottom) {
            return 48;
        }
        if (rect.top >= rect2.top) {
            return 80;
        }
        return rect.right <= rect2.right ? 3 : 5;
    }

    public static void b(@Y61.k Rect rect, @Y61.k Rect rect2) {
        rect.offset(Math.max(rect.left, rect2.left) - rect.left, 0);
        rect.offset(Math.min(rect.right, rect2.right) - rect.right, 0);
        rect.offset(0, Math.max(rect.top, rect2.top) - rect.top);
        rect.offset(0, Math.min(rect.bottom, rect2.bottom) - rect.bottom);
    }

    @Y61.k
    public static Rect c(@Y61.k View view) {
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        int i12 = iArr[0];
        rect.left = i12;
        rect.top = iArr[1];
        rect.right = view.getMeasuredWidth() + i12;
        rect.bottom = view.getMeasuredHeight() + iArr[1];
        return rect;
    }

    public static boolean d(@Y61.k n nVar, @Y61.k Rect rect) {
        int i12 = nVar.getLayoutParams().width;
        int iMakeMeasureSpec = i12 != -2 ? i12 != -1 ? View.MeasureSpec.makeMeasureSpec(nVar.getPaddingRight() + nVar.getPaddingLeft() + nVar.getLayoutParams().width, 1073741824) : View.MeasureSpec.makeMeasureSpec(rect.width(), 1073741824) : View.MeasureSpec.makeMeasureSpec(rect.width(), BeduinInputModel.MIN_TEXT_VERSION);
        int i13 = nVar.getLayoutParams().height;
        int iMakeMeasureSpec2 = i13 != -2 ? i13 != -1 ? View.MeasureSpec.makeMeasureSpec(nVar.getPaddingBottom() + nVar.getPaddingTop() + nVar.getLayoutParams().height, 1073741824) : View.MeasureSpec.makeMeasureSpec(rect.height(), 1073741824) : View.MeasureSpec.makeMeasureSpec(rect.height(), BeduinInputModel.MIN_TEXT_VERSION);
        nVar.measure(nVar.getLayoutParams().width == -2 ? View.MeasureSpec.makeMeasureSpec(0, 0) : iMakeMeasureSpec, nVar.getLayoutParams().height == -2 ? View.MeasureSpec.makeMeasureSpec(0, 0) : iMakeMeasureSpec2);
        boolean z12 = nVar.getMeasuredHeight() <= rect.height() ? nVar.getMeasuredWidth() <= rect.width() : false;
        nVar.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        return z12;
    }
}
