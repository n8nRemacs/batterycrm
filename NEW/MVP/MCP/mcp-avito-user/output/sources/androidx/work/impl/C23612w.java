package androidx.work.impl;

import androidx.annotation.RestrictTo;
import androidx.work.C23538b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Schedulers.java */
@RestrictTo
/* renamed from: androidx.work.impl.w, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C23612w {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f56044a = 0;

    static {
        androidx.work.G.b("Schedulers");
    }

    public static void a(androidx.work.impl.model.I i12, androidx.work.X x12, List list) {
        if (list.size() > 0) {
            x12.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i12.x(jCurrentTimeMillis, ((androidx.work.impl.model.H) it.next()).f55795a);
            }
        }
    }

    public static void b(@j.N C23538b c23538b, @j.N WorkDatabase workDatabase, @j.P List<InterfaceC23590u> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        androidx.work.impl.model.I iA2 = workDatabase.A();
        workDatabase.c();
        try {
            ArrayList arrayListU = iA2.u();
            a(iA2, c23538b.f55450d, arrayListU);
            ArrayList arrayListF = iA2.F(c23538b.f55460n);
            a(iA2, c23538b.f55450d, arrayListF);
            arrayListF.addAll(arrayListU);
            ArrayList arrayListC = iA2.C();
            workDatabase.s();
            workDatabase.l();
            if (arrayListF.size() > 0) {
                androidx.work.impl.model.H[] hArr = (androidx.work.impl.model.H[]) arrayListF.toArray(new androidx.work.impl.model.H[arrayListF.size()]);
                for (InterfaceC23590u interfaceC23590u : list) {
                    if (interfaceC23590u.i()) {
                        interfaceC23590u.j(hArr);
                    }
                }
            }
            if (arrayListC.size() > 0) {
                androidx.work.impl.model.H[] hArr2 = (androidx.work.impl.model.H[]) arrayListC.toArray(new androidx.work.impl.model.H[arrayListC.size()]);
                for (InterfaceC23590u interfaceC23590u2 : list) {
                    if (!interfaceC23590u2.i()) {
                        interfaceC23590u2.j(hArr2);
                    }
                }
            }
        } catch (Throwable th2) {
            workDatabase.l();
            throw th2;
        }
    }
}
