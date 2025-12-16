package defpackage;

import android.util.LruCache;
import android.util.SparseArray;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import kotlin.NoWhenBranchMatchedException;
import one.me.stickersshowcase.StickersShowcaseScreen;
import ru.ok.tamtam.android.widgets.quickcamera.CameraExceptionImpl;

/* loaded from: classes.dex */
public final class s6b implements snc, q22, zhf, rn6, tm6, lva {
    public Object a;

    public /* synthetic */ s6b(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.rn6, defpackage.v2f
    public /* bridge */ /* synthetic */ void a(Object obj) {
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        ((Number) obj).longValue();
        y87 y87Var = (y87) this.a;
        y87Var.getClass();
        return new wk3(2, new u4e(12, y87Var)).m(de.a());
    }

    @Override // defpackage.snc
    public void b(float f) {
        snc sncVar = (snc) this.a;
        if (sncVar != null) {
            sncVar.b(f);
        }
    }

    public void c(CameraExceptionImpl cameraExceptionImpl) {
        Object value;
        buc bucVar = ((ytc) this.a).d;
        Object obj = null;
        if (bucVar == null) {
            bucVar = null;
        }
        bucVar.getClass();
        wqi.e("QuickCameraViewModel", "onCameraError", cameraExceptionImpl.getCause());
        tcf tcfVar = bucVar.t0;
        ntc ntcVar = (ntc) tcfVar.getValue();
        boolean zA = fni.a(ntcVar, ktc.a);
        jtc jtcVar = jtc.a;
        if (zA) {
            obj = jtcVar;
        } else {
            boolean z = ntcVar instanceof ltc;
            mtc mtcVar = mtc.a;
            if (z) {
                obj = mtcVar;
            } else if (!fni.a(ntcVar, jtcVar) && !fni.a(ntcVar, mtcVar)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (obj != null) {
            do {
                value = tcfVar.getValue();
            } while (!tcfVar.c(value, obj));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.a
            one.me.chatmedia.viewer.video.VideoViewerWidget r0 = (one.me.chatmedia.viewer.video.VideoViewerWidget) r0
            yy7[] r1 = one.me.chatmedia.viewer.video.VideoViewerWidget.u0
            rdh r0 = r0.A0()
            if (r0 == 0) goto L4a
            one.me.chatmedia.viewer.ChatMediaViewerScreen r0 = (one.me.chatmedia.viewer.ChatMediaViewerScreen) r0
            yq2 r1 = r0.Q0()
            cbh r0 = r0.O0()
            boolean r0 = r0.d()
            tcf r1 = r1.h1
        L1c:
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            w54 r3 = (defpackage.w54) r3
            int r3 = r3.ordinal()
            w54 r4 = defpackage.w54.b
            if (r3 == 0) goto L44
            r5 = 1
            w54 r6 = defpackage.w54.a
            if (r3 == r5) goto L3f
            r5 = 2
            if (r3 == r5) goto L3d
            r5 = 3
            if (r3 != r5) goto L37
            goto L44
        L37:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L3d:
            r4 = r6
            goto L44
        L3f:
            if (r0 == 0) goto L42
            goto L3d
        L42:
            w54 r4 = defpackage.w54.d
        L44:
            boolean r2 = r1.c(r2, r4)
            if (r2 == 0) goto L1c
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s6b.d():void");
    }

    @Override // defpackage.zhf
    public void e(fff fffVar) {
        w7c w7cVar = (w7c) ((r91) this.a).Z;
        w7cVar.getClass();
        djf djfVar = djf.c;
        long j = fffVar.a;
        StickersShowcaseScreen stickersShowcaseScreen = (StickersShowcaseScreen) w7cVar.a;
        yy7[] yy7VarArr = StickersShowcaseScreen.u0;
        hs hsVar = stickersShowcaseScreen.a;
        yy7 yy7Var = StickersShowcaseScreen.u0[0];
        long jLongValue = ((Number) hsVar.a(stickersShowcaseScreen)).longValue();
        ii4 ii4VarP0 = djfVar.p0();
        StringBuilder sbL = az1.l(j, ":stickers/preview?sticker_id=", "&chat_id=");
        sbL.append(jLongValue);
        ii4VarP0.b(sbL.toString(), null);
    }

    public boolean f(List list) {
        ArrayList arrayList = new ArrayList(we3.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((l9f) it.next()).c));
        }
        Set setH0 = ue3.h0(arrayList);
        boolean z = !setH0.equals((Set) this.a);
        this.a = setH0;
        return z;
    }

    @Override // defpackage.zhf
    public void g(fff fffVar) {
        StickersShowcaseScreen stickersShowcaseScreen = (StickersShowcaseScreen) ((w7c) ((r91) this.a).Z).a;
        yy7[] yy7VarArr = StickersShowcaseScreen.u0;
        njf njfVarZ0 = stickersShowcaseScreen.z0();
        long j = njfVarZ0.b;
        if (j > 0) {
            ((c6i) njfVarZ0.Y.getValue()).b(new yge(new xge(1, j, fffVar.a)));
            xfh.r(njfVarZ0.s0, jc3.b);
        }
        uh7 uh7Var = (uh7) cjf.a.getAccessor().f();
        if (uh7Var != null) {
            uh7Var.f(gke.h(new th7(rh7.b, 1), new th7(rh7.X, 1)), f1e.CHAT);
        }
    }

    @Override // defpackage.zhf
    public void i(dgf dgfVar) {
        StickersShowcaseScreen stickersShowcaseScreen = (StickersShowcaseScreen) ((w7c) ((r91) this.a).Z).a;
        yy7[] yy7VarArr = StickersShowcaseScreen.u0;
        njf njfVarZ0 = stickersShowcaseScreen.z0();
        us usVar = njfVarZ0.v0;
        long j = dgfVar.a;
        qt7 qt7Var = (qt7) usVar.get(Long.valueOf(j));
        if (qt7Var == null || !qt7Var.isActive()) {
            usVar.put(Long.valueOf(j), xfh.o(njfVarZ0, ((q2b) njfVarZ0.d).b(), new mjf(njfVarZ0, dgfVar, null), 2));
        }
    }

    @Override // defpackage.rn6
    public void onFailure(Throwable th) {
        awf awfVar;
        awf awfVar2 = (awf) this.a;
        synchronized (awfVar2.a) {
            try {
                List list = awfVar2.k;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((zr4) it.next()).b();
                    }
                    awfVar2.k = null;
                }
            } finally {
            }
        }
        awfVar2.u.d();
        lz9 lz9Var = awfVar2.b;
        Iterator it2 = lz9Var.h().iterator();
        while (it2.hasNext() && (awfVar = (awf) it2.next()) != awfVar2) {
            synchronized (awfVar.a) {
                try {
                    List list2 = awfVar.k;
                    if (list2 != null) {
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            ((zr4) it3.next()).b();
                        }
                        awfVar.k = null;
                    }
                } finally {
                }
            }
            awfVar.u.d();
        }
        synchronized (lz9Var.b) {
            ((LinkedHashSet) lz9Var.o).remove(awfVar2);
        }
    }

    @Override // defpackage.lva
    public void p(Task task) {
        ((CountDownLatch) this.a).countDown();
    }

    public s6b(int i) {
        switch (i) {
            case 8:
                this.a = rd5.a;
                break;
            case 11:
                this.a = new SparseArray();
                break;
            default:
                this.a = new LruCache(10);
                break;
        }
    }
}
