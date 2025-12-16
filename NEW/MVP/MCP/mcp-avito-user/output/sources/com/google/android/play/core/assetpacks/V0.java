package com.google.android.play.core.assetpacks;

import com.google.android.gms.tasks.C37028k;
import com.google.android.play.core.common.LocalTestingException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
public final /* synthetic */ class V0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C37106a1 f358245b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f358246c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C37028k f358247d;

    public /* synthetic */ V0(C37106a1 c37106a1, List list, C37028k c37028k) {
        this.f358245b = c37106a1;
        this.f358246c = list;
        this.f358247d = c37028k;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        C37028k c37028k;
        C37106a1 c37106a1 = this.f358245b;
        c37106a1.getClass();
        HashMap map = new HashMap();
        List<String> list = this.f358246c;
        Iterator it = list.iterator();
        long j12 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            c37028k = this.f358247d;
            if (!zHasNext) {
                break;
            }
            String str = (String) it.next();
            try {
                AssetPackState assetPackStateJ = c37106a1.j(1, str);
                j12 += ((X) assetPackStateJ).f358263e;
                map.put(str, assetPackStateJ);
            } catch (LocalTestingException e12) {
                c37028k.a(e12);
                return;
            }
        }
        for (String str2 : list) {
            try {
                int andIncrement = C37106a1.f358290i.getAndIncrement();
                c37106a1.i(andIncrement, 1, str2);
                c37106a1.i(andIncrement, 2, str2);
                c37106a1.i(andIncrement, 3, str2);
            } catch (LocalTestingException e13) {
                c37028k.a(e13);
                return;
            }
        }
        c37028k.b(new Y(j12, map));
    }
}
