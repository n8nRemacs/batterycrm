package defpackage;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.tamtam.android.services.NotificationTamService;

/* loaded from: classes2.dex */
public final /* synthetic */ class nh2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nh2(Object obj, long j, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, java.util.Map] */
    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.a) {
            case 0:
                ((qh2) this.c).b.c(this.b, (Collection) this.d);
                return;
            case 1:
                ea7 ea7Var = (ea7) this.c;
                String str = (String) this.d;
                long j = this.b;
                if (ea7Var.Z.get()) {
                    return;
                }
                wqi.c("fa7", "onFileUploadCompleted: completed upload. response =%s, totalBytes=%d", str, Long.valueOf(j));
                vta vtaVar = ea7Var.Y;
                vtaVar.f(new da7(true, str, 100.0f, j));
                vtaVar.b();
                ea7Var.a(false);
                return;
            case 2:
                NotificationTamService notificationTamService = (NotificationTamService) this.c;
                long j2 = this.b;
                NotificationTamService.a(j2, notificationTamService, (CharSequence) this.d, ((jrd) notificationTamService.X.getValue()).c().e(j2));
                return;
            case 3:
                l2e l2eVar = (l2e) this.c;
                List list = (List) this.d;
                long j3 = this.b;
                synchronized (l2eVar) {
                    LinkedHashMap linkedHashMap = l2eVar.c;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        nt1 nt1Var = ((u61) it.next()).a;
                        ti1 ti1Var = nt1Var.b;
                        boolean z = nt1Var.a == cdh.b;
                        boolean zContainsKey = linkedHashMap.containsKey(ti1Var);
                        if (z && !zContainsKey) {
                            linkedHashMap.put(ti1Var, Long.valueOf(j3));
                        }
                    }
                    l2eVar.a(list);
                }
                return;
            case 4:
                ((n81) ((l2e) this.c).a).c("screen_share_first_frame", EventItemValueKt.toEventItemValue(this.b), new EventItemsMap((Map<String, ? extends EventItemValue>) this.d));
                return;
            case 5:
                rve rveVar = (rve) this.c;
                nz9 nz9Var = (nz9) this.d;
                long j4 = this.b;
                r5j r5jVar = rveVar.f;
                if (r5jVar != null) {
                    ((CopyOnWriteArraySet) r5jVar.b).add(new q8i(j4, nz9Var));
                    return;
                }
                return;
            case 6:
                enb enbVar = (enb) this.c;
                Object obj = this.d;
                long j5 = this.b;
                xl5 xl5Var = (xl5) enbVar.c;
                int i = xxg.a;
                dm5 dm5Var = xl5Var.a;
                mj4 mj4Var = dm5Var.B0;
                hd hdVarJ = mj4Var.J();
                mj4Var.K(hdVarJ, 26, new ny1(hdVarJ, obj, j5));
                if (dm5Var.W0 == obj) {
                    dm5Var.w0.j(26, new dm4(27));
                    return;
                }
                return;
            default:
                vhb vhbVar = (vhb) this.c;
                Object obj2 = this.d;
                long j6 = this.b;
                yl5 yl5Var = (yl5) vhbVar.c;
                String str2 = zxg.a;
                em5 em5Var = yl5Var.a;
                nj4 nj4Var = em5Var.D0;
                id idVarH = nj4Var.H();
                nj4Var.I(idVarH, 26, new pv3(idVarH, obj2, j6, 1));
                if (em5Var.b1 == obj2) {
                    em5Var.x0.f(26, new dm4(28));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ nh2(Object obj, Object obj2, long j, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }
}
