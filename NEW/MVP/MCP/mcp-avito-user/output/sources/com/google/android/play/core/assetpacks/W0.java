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
public final /* synthetic */ class W0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C37106a1 f358254b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f358255c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ N f358256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C37028k f358257e;

    public /* synthetic */ W0(C37106a1 c37106a1, List list, N n12, C37028k c37028k) {
        this.f358254b = c37106a1;
        this.f358255c = list;
        this.f358256d = n12;
        this.f358257e = c37028k;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        C37106a1 c37106a1 = this.f358254b;
        c37106a1.getClass();
        HashMap map = new HashMap();
        Iterator it = this.f358255c.iterator();
        long j12 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            C37028k c37028k = this.f358257e;
            if (!zHasNext) {
                c37028k.b(new Y(j12, map));
                return;
            }
            String str = (String) it.next();
            Q q12 = ((I1) this.f358256d).f358148a.f358188a;
            q12.getClass();
            try {
                q12.m(str);
            } catch (IOException unused) {
            }
            int i12 = q12.m(str) != null ? 4 : 8;
            try {
                AssetPackState assetPackStateJ = c37106a1.j(i12, str);
                j12 += ((X) assetPackStateJ).f358263e;
                map.put(str, assetPackStateJ);
            } catch (LocalTestingException e12) {
                c37028k.a(e12);
                return;
            }
        }
    }
}
