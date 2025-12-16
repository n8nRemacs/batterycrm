package com.avito.android.beduin.common.component.docking_badge;

import Y61.k;
import Y61.l;
import android.content.Context;
import com.avito.android.lib.design.docking_badge.DockingBadgeSize;
import com.avito.android.lib.design.docking_badge.DockingBadgeType;
import com.avito.android.lib.util.f;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: CustomBadgeType.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e {

    /* compiled from: CustomBadgeType.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101112a;

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
            f101112a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [com.avito.android.lib.design.docking_badge.DockingBadgeType$CustomColors] */
    @k
    public static final DockingBadgeType a(@k Context context, @l CustomBadgeType customBadgeType, @l DockingBadgeType.Predefined predefined, @l DockingBadgeSize dockingBadgeSize) {
        String str;
        if (customBadgeType != null) {
            if (dockingBadgeSize == null) {
                dockingBadgeSize = DockingBadgeSize.MEDIUM;
            }
            int i12 = a.f101112a[dockingBadgeSize.ordinal()];
            if (i12 == 1) {
                str = "greenSmall";
            } else {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "greenMedium";
            }
            int iF2 = f.f(context, str);
            UniversalColor textColor = customBadgeType.getTextColor();
            C48063a c48063a = C48063a.f437606a;
            int iA2 = c48063a.a(context, textColor);
            int iA3 = c48063a.a(context, customBadgeType.getBackgroundColor());
            String textStyle = customBadgeType.getTextStyle();
            Integer numQ = textStyle != null ? f.q(textStyle) : null;
            Float textVerticalOffset = customBadgeType.getTextVerticalOffset();
            predefined = new DockingBadgeType.CustomColors(iF2, Integer.valueOf(iA3), Integer.valueOf(iA2), numQ, textVerticalOffset != null ? Integer.valueOf(y6.a(textVerticalOffset.floatValue())) : null);
        }
        return predefined == null ? DockingBadgeType.Predefined.Green : predefined;
    }
}
