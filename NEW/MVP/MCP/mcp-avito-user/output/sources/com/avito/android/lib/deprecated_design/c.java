package com.avito.android.lib.deprecated_design;

import Y61.k;
import android.content.Context;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: Contexts.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_deprecated-components"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c {
    @k
    @InterfaceC42830m
    public static final int[] a(@k Context context, boolean z12) {
        List listSingletonList = z12 ? Collections.singletonList(Integer.valueOf(R.attr.components_control_text_primary)) : C42745f0.U(Integer.valueOf(R.attr.blue), Integer.valueOf(R.attr.violet), Integer.valueOf(R.attr.green), Integer.valueOf(R.attr.red));
        ArrayList arrayList = new ArrayList(C42745f0.q(listSingletonList, 10));
        Iterator it = listSingletonList.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(C35835l0.d(((Number) it.next()).intValue(), context)));
        }
        return C42745f0.L0(arrayList);
    }
}
