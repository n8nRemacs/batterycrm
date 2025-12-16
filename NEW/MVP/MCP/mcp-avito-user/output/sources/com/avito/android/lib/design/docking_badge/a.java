package com.avito.android.lib.design.docking_badge;

import Y61.k;
import android.content.Context;
import com.avito.android.R;
import com.avito.android.lib.design.docking_badge.DockingBadgeType;
import com.avito.android.lib.util.f;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: DockingBadgeExt.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_components"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: DockingBadgeExt.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.design.docking_badge.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C5268a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f179144a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f179145b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f179146c;

        static {
            int[] iArr = new int[DockingBadgeSize.values().length];
            try {
                iArr[DockingBadgeSize.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DockingBadgeSize.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f179144a = iArr;
            int[] iArr2 = new int[DockingBadgeEdgeType.values().length];
            try {
                iArr2[DockingBadgeEdgeType.Square.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[DockingBadgeEdgeType.Flag.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DockingBadgeEdgeType.Pipka.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[DockingBadgeEdgeType.Pyramid.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[DockingBadgeEdgeType.AntiPyramid.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            f179145b = iArr2;
            int[] iArr3 = new int[DockingBadgeType.Predefined.values().length];
            try {
                iArr3[DockingBadgeType.Predefined.Green.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[DockingBadgeType.Predefined.Violet.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[DockingBadgeType.Predefined.Blue.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[DockingBadgeType.Predefined.Gray.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[DockingBadgeType.Predefined.Red.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[DockingBadgeType.Predefined.Black.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            f179146c = iArr3;
        }
    }

    public static final int a(@k DockingBadge dockingBadge, @k DockingBadgeEdgeType dockingBadgeEdgeType, @k DockingBadgeSize dockingBadgeSize) {
        int i12;
        Context context = dockingBadge.getContext();
        int i13 = C5268a.f179144a[dockingBadgeSize.ordinal()];
        if (i13 == 1) {
            int i14 = C5268a.f179145b[dockingBadgeEdgeType.ordinal()];
            if (i14 == 1) {
                i12 = R.attr.dockingBadgeEdgeSquareSmall;
            } else if (i14 == 2) {
                i12 = R.attr.dockingBadgeEdgeFlagSmall;
            } else if (i14 == 3) {
                i12 = R.attr.dockingBadgeEdgePipkaSmall;
            } else if (i14 == 4) {
                i12 = R.attr.dockingBadgeEdgePyramidSmall;
            } else {
                if (i14 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                i12 = R.attr.dockingBadgeEdgeAntiPyramidSmall;
            }
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i15 = C5268a.f179145b[dockingBadgeEdgeType.ordinal()];
            if (i15 == 1) {
                i12 = R.attr.dockingBadgeEdgeSquareMedium;
            } else if (i15 == 2) {
                i12 = R.attr.dockingBadgeEdgeFlagMedium;
            } else if (i15 == 3) {
                i12 = R.attr.dockingBadgeEdgePipkaMedium;
            } else if (i15 == 4) {
                i12 = R.attr.dockingBadgeEdgePyramidMedium;
            } else {
                if (i15 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                i12 = R.attr.dockingBadgeEdgeAntiPyramidMedium;
            }
        }
        return f.s(i12, context);
    }
}
