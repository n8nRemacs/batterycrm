package com.avito.android.beduin.common.utils;

import android.view.ViewGroup;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.component.model.BeduinLayoutParams;
import com.avito.android.beduin.common.component.model.BeduinLayoutSize;
import com.avito.android.beduin.common.container.BeduinContainerBackground;
import com.avito.android.beduin.common.container.Corners;
import com.avito.android.util.y6;
import com.google.android.material.shape.q;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ViewGroups.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class I {
    public static final void a(q.b bVar, BeduinContainerBackground beduinContainerBackground) {
        if (beduinContainerBackground.getCornerRadius() == null) {
            Corners corners = beduinContainerBackground.getCorners();
            if (corners == null) {
                return;
            }
            if (corners.g() == null && corners.h() == null && corners.e() == null && corners.d() == null) {
                return;
            }
        }
        Float fValueOf = Wh.b.c(beduinContainerBackground) != null ? Float.valueOf(y6.d(r0.intValue())) : null;
        if (fValueOf != null) {
            bVar.k(fValueOf.floatValue());
        }
        Float fValueOf2 = Wh.b.d(beduinContainerBackground) != null ? Float.valueOf(y6.d(r0.intValue())) : null;
        if (fValueOf2 != null) {
            bVar.n(fValueOf2.floatValue());
        }
        Float fValueOf3 = Wh.b.b(beduinContainerBackground) != null ? Float.valueOf(y6.d(r0.intValue())) : null;
        if (fValueOf3 != null) {
            bVar.h(fValueOf3.floatValue());
        }
        Float fValueOf4 = Wh.b.a(beduinContainerBackground) != null ? Float.valueOf(y6.d(r3.intValue())) : null;
        if (fValueOf4 != null) {
            bVar.e(fValueOf4.floatValue());
        }
    }

    public static final void b(@Y61.k ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(@Y61.k android.view.ViewGroup r12, @Y61.l com.avito.android.beduin.common.container.BeduinContainerBackground r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.common.utils.I.c(android.view.ViewGroup, com.avito.android.beduin.common.container.BeduinContainerBackground, boolean):void");
    }

    public static final void d(@Y61.k ViewGroup viewGroup, @Y61.k BeduinLayoutParams beduinLayoutParams, @Y61.k ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = f(beduinLayoutParams.getWidth());
        layoutParams.height = f(beduinLayoutParams.getHeight());
        Integer minHeight = beduinLayoutParams.getMinHeight();
        viewGroup.setMinimumHeight(minHeight != null ? y6.d(minHeight.intValue()) : 0);
        Integer minWidth = beduinLayoutParams.getMinWidth();
        viewGroup.setMinimumWidth(minWidth != null ? y6.d(minWidth.intValue()) : 0);
        viewGroup.setLayoutParams(layoutParams);
    }

    public static final void e(@Y61.k ViewGroup viewGroup, @Y61.l BeduinContainerIndent beduinContainerIndent) {
        viewGroup.setPadding(y6.d(com.avito.android.beduin.common.component.model.a.b(beduinContainerIndent)), y6.d(com.avito.android.beduin.common.component.model.a.d(beduinContainerIndent)), y6.d(com.avito.android.beduin.common.component.model.a.c(beduinContainerIndent)), y6.d(com.avito.android.beduin.common.component.model.a.a(beduinContainerIndent)));
    }

    public static final int f(BeduinLayoutSize beduinLayoutSize) {
        if (beduinLayoutSize instanceof BeduinLayoutSize.MatchParent) {
            return -1;
        }
        if (beduinLayoutSize instanceof BeduinLayoutSize.WrapContent) {
            return -2;
        }
        if (beduinLayoutSize instanceof BeduinLayoutSize.Fixed) {
            return y6.d(((BeduinLayoutSize.Fixed) beduinLayoutSize).getParams().getValue());
        }
        throw new UnsupportedOperationException("Параметр " + beduinLayoutSize + " необходимо поддержать в setupLayoutParams");
    }
}
