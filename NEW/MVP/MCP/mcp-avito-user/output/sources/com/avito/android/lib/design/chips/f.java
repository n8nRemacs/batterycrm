package com.avito.android.lib.design.chips;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.avito.android.lib.design.chips.e;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import m.C43852a;

/* compiled from: ChipImage.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_components"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f {
    @Y61.l
    public static final Drawable a(@Y61.k e eVar, @Y61.k Context context) {
        if (eVar instanceof e.c) {
            int i12 = ((e.c) eVar).f178739a;
            Integer numValueOf = Integer.valueOf(i12);
            if (i12 <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                return C43852a.a(context, numValueOf.intValue());
            }
            return null;
        }
        if (!(eVar instanceof e.b)) {
            if (eVar instanceof e.a) {
                return ((e.a) eVar).f178737a;
            }
            throw new NoWhenBranchMatchedException();
        }
        int i13 = ((e.b) eVar).f178738a;
        Integer numValueOf2 = Integer.valueOf(i13);
        if (i13 <= 0) {
            numValueOf2 = null;
        }
        if (numValueOf2 != null) {
            return C35835l0.h(numValueOf2.intValue(), context);
        }
        return null;
    }
}
