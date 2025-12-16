package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.internal.C36703g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
final class U extends AbstractRunnableC36623a0 {

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f349058c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C36626b0 f349059d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(C36626b0 c36626b0, ArrayList arrayList) {
        super(c36626b0, null);
        this.f349059d = c36626b0;
        this.f349058c = arrayList;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractRunnableC36623a0
    @j.l0
    public final void a() {
        Set setEmptySet;
        C36626b0 c36626b0 = this.f349059d;
        C36653k0 c36653k0 = c36626b0.f349077a.f349201z;
        C36661o0 c36661o0 = c36626b0.f349077a;
        C36703g c36703g = c36626b0.f349094r;
        if (c36703g == null) {
            setEmptySet = Collections.emptySet();
        } else {
            HashSet hashSet = new HashSet(c36703g.f349425b);
            Map map = c36703g.f349427d;
            for (C36616a c36616a : map.keySet()) {
                if (!c36661o0.f349195t.containsKey(c36616a.f348911b)) {
                    ((com.google.android.gms.common.internal.K) map.get(c36616a)).getClass();
                    hashSet.addAll(null);
                }
            }
            setEmptySet = hashSet;
        }
        c36653k0.f349161p = setEmptySet;
        ArrayList arrayList = this.f349058c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            ((C36616a.f) arrayList.get(i12)).getRemoteService(c36626b0.f349091o, c36661o0.f349201z.f349161p);
        }
    }
}
