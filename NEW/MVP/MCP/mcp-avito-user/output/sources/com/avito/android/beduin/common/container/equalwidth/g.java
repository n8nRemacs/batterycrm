package com.avito.android.beduin.common.container.equalwidth;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.view.C22829k0;
import androidx.core.view.C22833m0;
import com.avito.android.beduin.common.utils.I;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: EqualWidthLayout.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/avito/android/beduin/common/container/equalwidth/g;", "Landroid/widget/LinearLayout;", "", "interItemSpacing", "Lkotlin/G0;", "setInterItemSpacing", "(I)V", "b", "I", "getChildrenLayoutParamsHeight", "()I", "setChildrenLayoutParamsHeight", "childrenLayoutParamsHeight", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g extends LinearLayout {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int childrenLayoutParamsHeight;

    @Override // android.view.ViewGroup
    public final void addView(@k View view) {
        FrameLayout frameLayout = new FrameLayout(getContext(), null);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(0, this.childrenLayoutParamsHeight, 1.0f));
        frameLayout.addView(view);
        I.b(frameLayout);
        super.addView(frameLayout);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(@k View view) {
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild != -1) {
            super.bringChildToFront(getChildAt(iIndexOfChild));
        }
    }

    public final int getChildrenLayoutParamsHeight() {
        return this.childrenLayoutParamsHeight;
    }

    @Override // android.view.ViewGroup
    public final int indexOfChild(@k View view) {
        Iterator<View> it = new C22829k0(this).iterator();
        int i12 = 0;
        while (it.hasNext()) {
            View next = it.next();
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            View view2 = next;
            if ((view2 instanceof FrameLayout) && (L.f(view2, view) || ((ViewGroup) view2).indexOfChild(view) != -1)) {
                return i12;
            }
            i12++;
        }
        return -1;
    }

    public final void setChildrenLayoutParamsHeight(int i12) {
        this.childrenLayoutParamsHeight = i12;
    }

    public final void setInterItemSpacing(int interItemSpacing) {
        Iterator<View> it = new C22829k0(this).iterator();
        int i12 = 0;
        while (true) {
            C22833m0 c22833m0 = (C22833m0) it;
            if (!c22833m0.hasNext()) {
                return;
            }
            Object next = c22833m0.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            D6.c((View) next, Integer.valueOf(i12 != 0 ? y6.b(interItemSpacing) : 0), null, null, null, 14);
            i12 = i13;
        }
    }
}
