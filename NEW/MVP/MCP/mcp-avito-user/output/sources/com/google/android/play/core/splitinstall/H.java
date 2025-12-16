package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
final class H extends K {
    @Override // com.google.android.play.core.splitinstall.K, com.google.android.play.core.splitinstall.internal.P
    public final void U2(ArrayList arrayList) {
        super.U2(arrayList);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(AbstractC37204f.n((Bundle) it.next()));
        }
        this.f358683a.d(arrayList2);
    }
}
