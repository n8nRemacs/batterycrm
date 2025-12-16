package com.avito.android.beduin.common.container.spread;

import android.view.View;
import android.view.ViewGroup;
import com.avito.android.beduin.common.alignment.VerticalAlignment;
import com.avito.android.beduin.common.utils.J;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinSpreadLayout.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h {

    /* compiled from: BeduinSpreadLayout.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f103201a;

        static {
            int[] iArr = new int[VerticalAlignment.values().length];
            try {
                iArr[VerticalAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerticalAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VerticalAlignment.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f103201a = iArr;
        }
    }

    public static final int a(@Y61.k View view, @Y61.k ViewGroup viewGroup, @Y61.k VerticalAlignment verticalAlignment, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int paddingTop = viewGroup.getPaddingTop();
        int paddingBottom = (i13 - i12) - viewGroup.getPaddingBottom();
        int i14 = a.f103201a[verticalAlignment.ordinal()];
        if (i14 == 1) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            return view.getMeasuredHeight() + paddingTop + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        }
        if (i14 == 2) {
            return (view.getMeasuredHeight() / 2) + J.a(view, paddingTop, paddingBottom);
        }
        if (i14 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        return paddingBottom - (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
    }

    public static final int b(@Y61.k View view, @Y61.k ViewGroup viewGroup, @Y61.k VerticalAlignment verticalAlignment, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int paddingTop = viewGroup.getPaddingTop();
        int paddingBottom = (i13 - i12) - viewGroup.getPaddingBottom();
        int i14 = a.f103201a[verticalAlignment.ordinal()];
        if (i14 == 1) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            return paddingTop + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        }
        if (i14 == 2) {
            return J.a(view, paddingTop, paddingBottom) - (view.getMeasuredHeight() / 2);
        }
        if (i14 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        return (paddingBottom - (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0)) - view.getMeasuredHeight();
    }
}
