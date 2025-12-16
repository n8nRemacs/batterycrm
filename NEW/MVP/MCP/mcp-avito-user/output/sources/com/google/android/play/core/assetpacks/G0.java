package com.google.android.play.core.assetpacks;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
public final /* synthetic */ class G0 implements P0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Q0 f358132a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f358133b;

    public /* synthetic */ G0(Q0 q02, List list) {
        this.f358132a = q02;
        this.f358133b = list;
    }

    @Override // com.google.android.play.core.assetpacks.P0
    public final Object a() {
        final Q0 q02 = this.f358132a;
        q02.getClass();
        List<String> list = this.f358133b;
        Map map = (Map) q02.c(new C0(q02, list));
        HashMap map2 = new HashMap();
        for (String str : list) {
            final N0 n02 = (N0) map.get(str);
            if (n02 == null) {
                map2.put(str, 8);
            } else {
                M0 m02 = n02.f358186c;
                int i12 = m02.f358180d;
                if (i12 == 1 || i12 == 7 || i12 == 2 || i12 == 3) {
                    try {
                        m02.f358180d = 6;
                        ((Executor) q02.f358221f.a()).execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.J0
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i13 = n02.f358184a;
                                Q0 q03 = q02;
                                q03.getClass();
                                q03.c(new D0(q03, i13));
                            }
                        });
                        q02.f358217b.b(str);
                    } catch (C37184v0 unused) {
                        Q0.f358215g.d("Session %d with pack %s does not exist, no need to cancel.", Integer.valueOf(n02.f358184a), str);
                    }
                }
                map2.put(str, Integer.valueOf(m02.f358180d));
            }
        }
        return map2;
    }
}
