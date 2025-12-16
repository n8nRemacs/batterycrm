package defpackage;

import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import com.google.android.exoplayer2.source.dash.DashManifestStaleException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import one.me.calls.ui.view.mode.grid.CallGridLayoutManager;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import ru.ok.android.api.http.NoHttpApiEndpointException;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.mediabar.FrgLocalVideo;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public class t9f implements cx5, xe, mv, j7a, f91, yf9, uc3, f97, dbd, ic8, qz4, p1c, tm6, nyg, gu3, vz4 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ t9f(int i) {
        this.a = i;
    }

    @Override // defpackage.j7a
    public void A() {
        switch (this.a) {
            case 4:
                f50.e((f50) this.b);
                break;
            default:
                ((e4c) this.b).a();
                break;
        }
    }

    @Override // defpackage.bbd
    public Object D(Object obj, yy7 yy7Var) {
        return (qt7) ((AtomicReference) this.b).get();
    }

    @Override // defpackage.mv
    public void L(long j, List list) {
        xw xwVar = (xw) this.b;
        xwVar.z();
        xwVar.l(list, j, true, false, false);
    }

    @Override // defpackage.dbd
    public void O(Object obj, yy7 yy7Var, Object obj2) {
        qt7 qt7Var = (qt7) ((AtomicReference) this.b).accumulateAndGet((qt7) obj2, new b84());
        if (qt7Var != null) {
            qt7Var.start();
        }
    }

    @Override // defpackage.p1c
    public void a() {
        ((yp5) this.b).c();
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        List<fh9> list = (List) obj;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (fh9 fh9Var : list) {
            List list2 = fh9Var.z0;
            String str = fh9Var.Y;
            if (list2 != null && !list2.isEmpty()) {
                if (str != null && str.length() != 0) {
                    for (aj9 aj9Var : fh9Var.z0) {
                        short s = aj9Var.d;
                        if (s < 0 || s + aj9Var.o > str.length()) {
                            p(fh9Var);
                            break;
                        }
                    }
                } else {
                    p(fh9Var);
                }
            }
        }
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        List list = (List) obj;
        Collections.sort(list, (Comparator) this.b);
        return list;
    }

    @Override // defpackage.ic8
    public void b() throws IOException {
        rd4 rd4Var = (rd4) this.b;
        rd4Var.A.b();
        DashManifestStaleException dashManifestStaleException = rd4Var.C;
        if (dashManifestStaleException != null) {
            throw dashManifestStaleException;
        }
    }

    @Override // defpackage.qz4, defpackage.vz4
    public void c() {
        ql6 ql6VarB0;
        switch (this.a) {
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ((s6b) ((tz4) this.b).e).d();
                break;
            default:
                yaa yaaVar = ((w9a) this.b).t0;
                if (yaaVar != null) {
                    Iterator it = ((Set) yaaVar.a).iterator();
                    while (it.hasNext()) {
                        FrgLocalVideo frgLocalVideo = ((iaa) it.next()).Y;
                        if (frgLocalVideo != null && (ql6VarB0 = frgLocalVideo.B0()) != null) {
                            ((ActLocalMedias) ql6VarB0).Z();
                        }
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.yf9
    public void d(vf9 vf9Var, MenuItem menuItem) {
        ((z52) this.b).X.removeCallbacksAndMessages(vf9Var);
    }

    @Override // defpackage.j7a
    public void e() {
        switch (this.a) {
            case 4:
                f50.e((f50) this.b);
                break;
            default:
                ((e4c) this.b).a();
                break;
        }
    }

    @Override // defpackage.cx5
    public void error(String str, Throwable th) {
        wqi.e(((c4) this.b).f, str, th);
    }

    @Override // defpackage.f91
    public int f() {
        return ((CallGridLayoutManager) this.b).M.getResources().getDisplayMetrics().heightPixels;
    }

    @Override // defpackage.j7a
    public void g() {
        switch (this.a) {
            case 4:
                f50.e((f50) this.b);
                break;
            default:
                ((e4c) this.b).a();
                break;
        }
    }

    public void h() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(((HashMap) this.b).values());
            ((HashMap) this.b).clear();
        }
        for (int i = 0; i < arrayList.size(); i++) {
            ce5 ce5Var = (ce5) arrayList.get(i);
            if (ce5Var != null) {
                ce5Var.close();
            }
        }
    }

    @Override // defpackage.qz4, defpackage.vz4
    public void i(int i) {
        switch (this.a) {
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                tz4.a((tz4) this.b, true, i * 10);
                break;
            default:
                w9a w9aVar = (w9a) this.b;
                w9aVar.c.c = 0;
                w9a.L0(w9aVar, true, i * 10);
                break;
        }
    }

    public synchronized ce5 j(c1f c1fVar) {
        ce5 ce5VarC = (ce5) ((HashMap) this.b).get(c1fVar);
        if (ce5VarC != null) {
            synchronized (ce5VarC) {
                if (!ce5.h0(ce5VarC)) {
                    ((HashMap) this.b).remove(c1fVar);
                    op5.j(t9f.class, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(ce5VarC)), c1fVar.a, Integer.valueOf(System.identityHashCode(c1fVar)));
                    return null;
                }
                ce5VarC = ce5.c(ce5VarC);
            }
        }
        return ce5VarC;
    }

    @Override // defpackage.yf9
    public void k(vf9 vf9Var, zf9 zf9Var) {
        z52 z52Var = (z52) this.b;
        Handler handler = z52Var.X;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = z52Var.Z;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (vf9Var == ((y52) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new b6i(this, i2 < arrayList.size() ? (y52) arrayList.get(i2) : null, zf9Var, vf9Var, 1), vf9Var, SystemClock.uptimeMillis() + 200);
    }

    @Override // defpackage.nyg
    public int l(Object obj) {
        return ((nyg) this.b).l(((v84) obj).b.Z());
    }

    @Override // defpackage.cx5
    public void log(String str) {
    }

    @Override // defpackage.uc3
    public void m() {
        ((rha) this.b).getClass();
    }

    @Override // defpackage.j7a
    public void n() {
        switch (this.a) {
            case 4:
                f50.e((f50) this.b);
                break;
            default:
                ((e4c) this.b).a();
                break;
        }
    }

    @Override // defpackage.uc3
    public void o(vve vveVar, Throwable th) {
        ((rha) this.b).getClass();
        Object objA = vveVar.a();
        op5.m("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(vveVar)), objA != null ? objA.getClass().getName() : "<value is null>", th == null ? "" : Log.getStackTraceString(th));
    }

    public void p(fh9 fh9Var) {
        String str = fh9Var.Y;
        wqi.c("t9f", "got broken message element, text: %s, elements: %s", Integer.valueOf(str != null ? str.length() : 0), fh9Var.z0);
        ((dd) this.b).e("MENTION_BROKEN_RANGE");
    }

    public synchronized void q() {
        op5.d(t9f.class, Integer.valueOf(((HashMap) this.b).size()), "Count = %d");
    }

    @Override // defpackage.j7a
    public void r() {
        switch (this.a) {
            case 4:
                f50.e((f50) this.b);
                break;
            default:
                ((e4c) this.b).a();
                break;
        }
    }

    @Override // defpackage.xe
    public fs3 s(ywf ywfVar, Rect rect) {
        AnimatedFactoryV2Impl animatedFactoryV2Impl = (AnimatedFactoryV2Impl) this.b;
        if (animatedFactoryV2Impl.g == null) {
            animatedFactoryV2Impl.g = new kk4(13);
        }
        return new fs3(animatedFactoryV2Impl.g, ywfVar, rect, animatedFactoryV2Impl.d);
    }

    public void t(int i, boolean z) {
        ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) this.b;
        yy7[] yy7VarArr = ChatMediaViewerScreen.Q0;
        yq2 yq2VarQ0 = chatMediaViewerScreen.Q0();
        yq2VarQ0.getClass();
        if (z) {
            return;
        }
        yq2VarQ0.q1.O(yq2VarQ0, yq2.u1[5], xfh.o(yq2VarQ0, null, new eq2(i, yq2VarQ0, null), 1));
    }

    @Override // defpackage.j7a
    public void u(long j) {
        k09 k09Var;
        w19 w19Var;
        Integer num;
        w19 w19Var2;
        Integer num2;
        switch (this.a) {
            case 4:
                f50 f50Var = (f50) this.b;
                b8a b8aVar = (b8a) f50Var.c;
                boolean z = b8aVar.m() && !((h49) ((e5c) f50Var.X.getValue())).e(j);
                k09 k09Var2 = b8aVar.L0;
                if ((k09Var2 != null && (w19Var2 = k09Var2.d) != null && (num2 = w19Var2.H) != null && num2.intValue() == 2) || (((k09Var = b8aVar.L0) != null && (w19Var = k09Var.d) != null && (num = w19Var.H) != null && num.intValue() == 3) || b8aVar.F0 == 1 || z)) {
                    wqi.c(f50Var.o, "Close player on ending", new Object[0]);
                    f50Var.Y.h(n0a.a);
                    break;
                }
                break;
            default:
                ((e4c) this.b).a();
                break;
        }
    }

    @Override // defpackage.f97
    public Uri v(String str) {
        str.getClass();
        if (str.equals("api")) {
            return ((tn5) this.b).f().a();
        }
        throw new NoHttpApiEndpointException(str);
    }

    @Override // defpackage.j7a
    public void w() {
        switch (this.a) {
            case 4:
                f50.e((f50) this.b);
                break;
            default:
                ((e4c) this.b).a();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x(defpackage.mid r9, defpackage.kt r10, defpackage.kt r11) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.b
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r0.getClass()
            r1 = 0
            r9.w(r1)
            uhd r1 = r0.Z0
            r2 = r1
            un4 r2 = (defpackage.un4) r2
            if (r10 == 0) goto L22
            r2.getClass()
            int r4 = r10.b
            int r6 = r11.b
            if (r4 != r6) goto L24
            int r1 = r10.c
            int r3 = r11.c
            if (r1 == r3) goto L22
            goto L24
        L22:
            r3 = r9
            goto L2e
        L24:
            int r5 = r10.c
            int r7 = r11.c
            r3 = r9
            boolean r9 = r2.h(r3, r4, r5, r6, r7)
            goto L3d
        L2e:
            r2.n(r3)
            android.view.View r9 = r3.a
            r10 = 0
            r9.setAlpha(r10)
            java.util.ArrayList r9 = r2.i
            r9.add(r3)
            r9 = 1
        L3d:
            if (r9 == 0) goto L42
            r0.i0()
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t9f.x(mid, kt, kt):void");
    }

    public void y(mid midVar, kt ktVar, kt ktVar2) {
        boolean zH;
        RecyclerView recyclerView = (RecyclerView) this.b;
        recyclerView.c.l(midVar);
        recyclerView.i(midVar);
        midVar.w(false);
        un4 un4Var = (un4) recyclerView.Z0;
        un4Var.getClass();
        int i = ktVar.b;
        int i2 = ktVar.c;
        View view = midVar.a;
        int left = ktVar2 == null ? view.getLeft() : ktVar2.b;
        int top = ktVar2 == null ? view.getTop() : ktVar2.c;
        if (midVar.q() || (i == left && i2 == top)) {
            un4Var.n(midVar);
            un4Var.h.add(midVar);
            zH = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zH = un4Var.h(midVar, i, i2, left, top);
        }
        if (zH) {
            recyclerView.i0();
        }
    }

    public synchronized void z(c1f c1fVar, ce5 ce5Var) {
        ce5Var.getClass();
        if (!ce5.h0(ce5Var)) {
            throw new IllegalArgumentException();
        }
        ce5 ce5Var2 = (ce5) ((HashMap) this.b).get(c1fVar);
        if (ce5Var2 == null) {
            return;
        }
        vc3 vc3VarY = vc3.y(ce5Var2.a);
        vc3 vc3VarY2 = vc3.y(ce5Var.a);
        if (vc3VarY != null && vc3VarY2 != null) {
            try {
                if (vc3VarY.Z() == vc3VarY2.Z()) {
                    ((HashMap) this.b).remove(c1fVar);
                    vc3VarY2.close();
                    vc3VarY.close();
                    ce5Var2.close();
                    q();
                    return;
                }
            } catch (Throwable th) {
                vc3VarY2.close();
                vc3VarY.close();
                ce5Var2.close();
                throw th;
            }
        }
        vc3.P(vc3VarY2);
        vc3.P(vc3VarY);
        ce5Var2.close();
    }

    public /* synthetic */ t9f(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public t9f() {
        this.a = 20;
        this.b = new qyg(10);
    }

    public t9f(TextView textView) {
        this.a = 15;
        this.b = new hc5(textView);
    }

    public t9f(zk8 zk8Var, nyg nygVar) {
        this.a = 22;
        this.b = nygVar;
    }

    public t9f(UUID uuid, int i, byte[] bArr) {
        this.a = 28;
        this.b = uuid;
    }
}
