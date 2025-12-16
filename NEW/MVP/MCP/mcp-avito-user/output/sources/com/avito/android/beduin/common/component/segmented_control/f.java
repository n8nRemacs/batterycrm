package com.avito.android.beduin.common.component.segmented_control;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.select_option.Option;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinSegmentedControlModels.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f {
    public static final int a(@l String str, @k List<Option> list) {
        int i12 = 0;
        if (str == null) {
            return 0;
        }
        Iterator<Option> it = list.iterator();
        while (it.hasNext()) {
            if (L.f(it.next().getId(), str)) {
                return i12;
            }
            i12++;
        }
        return -1;
    }
}
