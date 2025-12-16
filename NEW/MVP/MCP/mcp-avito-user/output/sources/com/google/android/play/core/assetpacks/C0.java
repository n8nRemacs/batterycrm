package com.google.android.play.core.assetpacks;

import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
public final /* synthetic */ class C0 implements P0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Q0 f358098a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f358099b;

    public /* synthetic */ C0(Q0 q02, List list) {
        this.f358098a = q02;
        this.f358099b = list;
    }

    @Override // com.google.android.play.core.assetpacks.P0
    public final Object a() {
        Q0 q02 = this.f358098a;
        q02.getClass();
        HashMap map = new HashMap();
        for (N0 n02 : q02.f358218c.values()) {
            M0 m02 = n02.f358186c;
            List list = this.f358099b;
            String str = m02.f358177a;
            if (list.contains(str)) {
                N0 n03 = (N0) map.get(str);
                if ((n03 == null ? -1 : n03.f358184a) < n02.f358184a) {
                    map.put(str, n02);
                }
            }
        }
        return map;
    }
}
