package com.yandex.div.core.view2.animations;

import androidx.transition.L;
import androidx.transition.T;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: Transitions.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"div_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class i {
    public static final void a(@Y61.k T t12, @Y61.k ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            t12.N((L) it.next());
        }
    }
}
