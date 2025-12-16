package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.media3.exoplayer.source.UnrecognizedInputFormatException;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import one.me.chats.list.ChatsListWidget;
import one.me.sdk.emoji.sprite.IllegalWidthSpriteException;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final class ka5 implements oj1, lua, rm8, hbe, k1e, ou1, gu3 {
    public static final n7 d = new n7();
    public Object a;
    public Object b;
    public Object c;

    public /* synthetic */ ka5(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public static jae h(Class cls, jy0 jy0Var) {
        try {
            return (jae) cls.getConstructor(jy0.class).newInstance(jy0Var);
        } catch (Exception e) {
            throw new IllegalStateException("Downloader factory missing", e);
        }
    }

    @Override // defpackage.oj1
    public void H(float f, float f2) {
        Context context;
        yp5 yp5Var = (yp5) this.a;
        qj1 qj1Var = yp5Var.g;
        WindowManager windowManagerB = null;
        ViewGroup.LayoutParams layoutParams = qj1Var != null ? qj1Var.getLayoutParams() : null;
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.x = (int) f;
            layoutParams2.y = (int) f2;
        } else {
            layoutParams2 = null;
        }
        qj1 qj1Var2 = (qj1) this.b;
        wqi.c("FakePipController", "update call local pip", new Object[0]);
        if (layoutParams2 == null) {
            wqi.c("FakePipController", "update call local pip was skip due to layout params are null", new Object[0]);
            return;
        }
        try {
            qj1 qj1Var3 = yp5Var.g;
            if (qj1Var3 != null && (context = qj1Var3.getContext()) != null) {
                windowManagerB = e6j.b(context);
            }
            if (windowManagerB != null) {
                windowManagerB.updateViewLayout(qj1Var2, layoutParams2);
            }
        } catch (IllegalArgumentException e) {
            wqi.e("FakePipController", "can't update call local pip", e);
        }
    }

    @Override // defpackage.k1e
    public void a() {
        f1e f1eVar = (f1e) ((cm6) this.a).invoke();
        if (f1eVar == null) {
            return;
        }
        ((gda) ((k18) this.c).getValue()).f(f1eVar, (qmb) ((cm6) this.b).invoke());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [em6, u08] */
    @Override // defpackage.gu3
    public void accept(Object obj) {
        Long l = (Long) ((uid) this.a).a;
        if (l != null) {
            ?? r0 = (u08) this.b;
            y8g y8gVar = (y8g) this.c;
            r0.invoke(Long.valueOf(y8gVar.getMsSinceBoot() - l.longValue()));
        }
    }

    @Override // defpackage.lua
    public void b(jm jmVar) {
        ((kob) this.c).X = jmVar;
    }

    @Override // defpackage.lua
    public void c() {
        ys4 ys4Var = (ys4) this.a;
        ys4Var.getClass();
        qk3 qk3VarH = new kk3(2, new u64(ys4Var, new m2(3, ys4Var))).h(u0e.b());
        n42 n42Var = new n42(1);
        qk3VarH.f(n42Var);
        ((zl3) ys4Var.d).a(n42Var);
        z3e z3eVar = z3e.c;
        ((ll) ys4Var.b).getClass();
        ys4Var.c(z3eVar.b("CGPGAGLGDIHBABABA"));
        ((bu4) this.b).e = true;
    }

    @Override // defpackage.rm8
    public void d(String str, List list) {
        l42 l42Var = (l42) this.c;
        wxb wxbVar = (wxb) this.a;
        yy7[] yy7VarArr = wxb.E0;
        wxbVar.u().i = null;
        if (fni.a(str, (String) this.b)) {
            l42Var.resumeWith(list);
            return;
        }
        CancellationException cancellationException = new CancellationException("Nothing found");
        cancellationException.initCause(null);
        l42Var.resumeWith(new ipd(cancellationException));
    }

    public ac0 e() {
        String strConcat = ((String) this.a) == null ? " backendName" : "";
        if (((l9c) this.c) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new ac0((String) this.a, (byte[]) this.b, (l9c) this.c);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    public u25 g(r25 r25Var) {
        jae jaeVarN;
        wz8 wz8Var;
        q25 q25Var;
        a09 a09Var;
        vz8 vz8Var;
        oz8 oz8Var;
        wz8 wz8Var2;
        a09 a09Var2;
        vz8 vz8Var2;
        ExecutorService executorService = (ExecutorService) this.b;
        jy0 jy0Var = (jy0) this.a;
        Uri uri = r25Var.b;
        int iL = zxg.L(uri, r25Var.c);
        boolean z = true;
        if (iL != 0 && iL != 1 && iL != 2) {
            if (iL != 4) {
                throw new IllegalArgumentException(ho7.f(iL, "Unsupported type: "));
            }
            p25 p25Var = r25Var.Z;
            oz8 oz8Var2 = new oz8();
            uz8 uz8Var = new uz8();
            List list = Collections.EMPTY_LIST;
            zjd zjdVar = zjd.o;
            wz8 wz8Var3 = new wz8();
            d09 d09Var = d09.d;
            String str = r25Var.X;
            if (uz8Var.b != null && uz8Var.a == null) {
                z = false;
            }
            hsi.g(z);
            if (uri != null) {
                if (uz8Var.a != null) {
                    vz8Var2 = new vz8(uz8Var);
                    oz8Var = oz8Var2;
                } else {
                    oz8Var = oz8Var2;
                    vz8Var2 = null;
                }
                wz8Var2 = wz8Var3;
                a09Var2 = new a09(uri, null, vz8Var2, null, list, str, zjdVar, -9223372036854775807L);
            } else {
                oz8Var = oz8Var2;
                wz8Var2 = wz8Var3;
                a09Var2 = null;
            }
            return new unc(new k09("", new sz8(oz8Var), a09Var2, new yz8(wz8Var2), w19.K, d09Var), jy0Var, executorService, p25Var != null ? p25Var.a : 0L, p25Var != null ? p25Var.b : -1L);
        }
        SparseArray sparseArray = (SparseArray) this.c;
        if (zxg.k(sparseArray, iL)) {
            jaeVarN = (jae) sparseArray.get(iL);
        } else {
            try {
                jaeVarN = n(iL, jy0Var);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException(ho7.f(iL, "Module missing for content type "), e);
            }
        }
        oz8 oz8Var3 = new oz8();
        uz8 uz8Var2 = new uz8();
        List listUnmodifiableList = Collections.EMPTY_LIST;
        zjd zjdVar2 = zjd.o;
        wz8 wz8Var4 = new wz8();
        d09 d09Var2 = d09.d;
        q25 q25Var2 = r25Var.s0;
        List list2 = r25Var.d;
        if (list2 != null && !list2.isEmpty()) {
            listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list2));
        }
        List list3 = listUnmodifiableList;
        String str2 = r25Var.X;
        if (uz8Var2.b != null && uz8Var2.a == null) {
            z = false;
        }
        hsi.g(z);
        if (uri != null) {
            if (uz8Var2.a != null) {
                vz8Var = new vz8(uz8Var2);
                wz8Var = wz8Var4;
            } else {
                wz8Var = wz8Var4;
                vz8Var = null;
            }
            q25Var = q25Var2;
            a09Var = new a09(uri, null, vz8Var, null, list3, str2, zjdVar2, -9223372036854775807L);
        } else {
            wz8Var = wz8Var4;
            q25Var = q25Var2;
            a09Var = null;
        }
        k09 k09Var = new k09("", new sz8(oz8Var3), a09Var, new yz8(wz8Var), w19.K, d09Var2);
        if (q25Var != null) {
            jaeVarN.d(q25Var.a).b(q25Var.b);
        }
        return jaeVarN.c(executorService).a(k09Var);
    }

    @Override // defpackage.ou1
    public void i(mbd mbdVar, ood oodVar) {
        i5i i5iVar = (i5i) this.b;
        ((vua) this.a).e = SystemClock.elapsedRealtime();
        qod qodVar = oodVar.Y;
        try {
            try {
                try {
                    if (oodVar.l()) {
                        long jW = qodVar.w();
                        if (jW < 0) {
                            jW = 0;
                        }
                        i5iVar.p(qodVar.l(), (int) jW);
                        qodVar.close();
                        return;
                    }
                    dd ddVarA = ((t1b) zm.a()).a();
                    int i = oodVar.d;
                    if (!ddVarA.a().e()) {
                        ddVarA.f("HTTP_ERROR", String.valueOf(i));
                    }
                    IOException iOException = new IOException("Unexpected HTTP code " + oodVar);
                    if (mbdVar.v0) {
                        tu5 tu5Var = (tu5) i5iVar.a;
                        tu5Var.a().k(tu5Var.b, "NetworkFetchProducer");
                        tu5Var.a.c();
                    } else {
                        i5iVar.o(iOException);
                    }
                    if (qodVar != null) {
                        try {
                            qodVar.close();
                        } catch (Exception e) {
                            op5.k(e);
                        }
                    }
                } catch (Throwable th) {
                    if (qodVar != null) {
                        try {
                            qodVar.close();
                        } catch (Exception e2) {
                            op5.k(e2);
                        }
                    }
                    throw th;
                }
            } catch (Exception e3) {
                if (mbdVar.v0) {
                    tu5 tu5Var2 = (tu5) i5iVar.a;
                    tu5Var2.a().k(tu5Var2.b, "NetworkFetchProducer");
                    tu5Var2.a.c();
                } else {
                    i5iVar.o(e3);
                }
                if (qodVar != null) {
                    qodVar.close();
                }
            }
        } catch (Exception e4) {
            op5.k(e4);
        }
    }

    @Override // defpackage.ou1
    public void j(mbd mbdVar, IOException iOException) {
        dd ddVarA = ((t1b) zm.a()).a();
        if (!ddVarA.a().e()) {
            ddVarA.f("HTTP_ERROR", iOException.getClass().getSimpleName());
        }
        if (iOException.getMessage() == null || !iOException.getMessage().toLowerCase().contains("canceled")) {
            wqi.g("OkHttpNetworkFetchProducer", iOException, "onFailure for request %s", (zmd) this.c);
        }
        i5i i5iVar = (i5i) this.b;
        if (!mbdVar.v0) {
            i5iVar.o(iOException);
            return;
        }
        tu5 tu5Var = (tu5) i5iVar.a;
        tu5Var.a().k(tu5Var.b, "NetworkFetchProducer");
        tu5Var.a.c();
    }

    public long k() {
        nm4 nm4Var = (nm4) this.c;
        if (nm4Var != null) {
            return nm4Var.d;
        }
        return -1L;
    }

    public yfh l(ca3 ca3Var, String str) {
        boolean zIsInstance;
        yfh yfhVarA;
        lyd lydVar;
        l48 l48Var;
        dgh dghVar = (dgh) this.b;
        fgh fghVar = (fgh) this.a;
        yfh yfhVar = (yfh) fghVar.a.get(str);
        Class clsF = ca3Var.a;
        Integer num = (Integer) ca3.b.get(clsF);
        if (num != null) {
            zIsInstance = uog.g(num.intValue(), yfhVar);
        } else {
            if (clsF.isPrimitive()) {
                clsF = uoi.F(vid.a(clsF));
            }
            zIsInstance = clsF.isInstance(yfhVar);
        }
        if (zIsInstance) {
            if ((dghVar instanceof lyd) && (l48Var = (lydVar = (lyd) dghVar).d) != null) {
                j8.a(yfhVar, lydVar.e, l48Var);
            }
            return yfhVar;
        }
        d8a d8aVar = new d8a((aa4) this.c);
        d8aVar.a(r8j.B0, str);
        try {
            try {
                yfhVarA = dghVar.c(ca3Var, d8aVar);
            } catch (AbstractMethodError unused) {
                yfhVarA = dghVar.b(ca3Var.a(), d8aVar);
            }
        } catch (AbstractMethodError unused2) {
            yfhVarA = dghVar.a(ca3Var.a());
        }
        yfh yfhVar2 = (yfh) fghVar.a.put(str, yfhVarA);
        if (yfhVar2 != null) {
            yfhVar2.b();
        }
        return yfhVarA;
    }

    public void m(se4 se4Var, Uri uri, Map map, long j, long j2, goc gocVar) throws UnrecognizedInputFormatException {
        nm4 nm4Var = new nm4(se4Var, j, j2);
        this.c = nm4Var;
        if (((gp5) this.b) != null) {
            return;
        }
        gp5[] gp5VarArrI = ((lp5) this.a).i(uri, map);
        int length = gp5VarArrI.length;
        t76 t76Var = wg7.b;
        u4j.a(length, "expectedSize");
        tg7 tg7Var = new tg7(length);
        boolean z = true;
        if (gp5VarArrI.length == 1) {
            this.b = gp5VarArrI[0];
        } else {
            int length2 = gp5VarArrI.length;
            int i = 0;
            while (true) {
                if (i >= length2) {
                    break;
                }
                gp5 gp5Var = gp5VarArrI[i];
                try {
                } catch (EOFException unused) {
                    if (((gp5) this.b) != null || nm4Var.d == j) {
                    }
                } catch (Throwable th) {
                    if (((gp5) this.b) == null && nm4Var.d != j) {
                        z = false;
                    }
                    hsi.g(z);
                    nm4Var.X = 0;
                    throw th;
                }
                if (gp5Var.i(nm4Var)) {
                    this.b = gp5Var;
                    nm4Var.X = 0;
                    break;
                } else {
                    tg7Var.d(gp5Var.l());
                    boolean z2 = ((gp5) this.b) != null || nm4Var.d == j;
                    hsi.g(z2);
                    nm4Var.X = 0;
                    i++;
                }
            }
            if (((gp5) this.b) == null) {
                String str = "None of the available extractors (" + new d47(", ", 1).d(lqi.d(new uy0(20), wg7.k(gp5VarArrI))) + ") could read the stream.";
                uri.getClass();
                zjd zjdVarI = tg7Var.i();
                UnrecognizedInputFormatException unrecognizedInputFormatException = new UnrecognizedInputFormatException(str, null, false, 1);
                wg7.j(zjdVarI);
                throw unrecognizedInputFormatException;
            }
        }
        ((gp5) this.b).w(gocVar);
    }

    public jae n(int i, jy0 jy0Var) {
        jae jaeVarH;
        if (i == 0) {
            jaeVarH = h(wc4.class.asSubclass(jae.class), jy0Var);
        } else if (i == 1) {
            jaeVarH = h(Class.forName("androidx.media3.exoplayer.smoothstreaming.offline.SsDownloader$Factory").asSubclass(jae.class), jy0Var);
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(ho7.f(i, "Unsupported type: "));
            }
            jaeVarH = h(n47.class.asSubclass(jae.class), jy0Var);
        }
        ((SparseArray) this.c).put(i, jaeVarH);
        return jaeVarH;
    }

    public Bitmap o(nb5 nb5Var) {
        Bitmap bitmap = (Bitmap) ((ac5) this.a).b.c(nb5Var);
        if (bitmap != null && !bitmap.isRecycled()) {
            return bitmap;
        }
        int i = nb5Var.a;
        Bitmap bitmap2 = ((ac5) this.a).a[i];
        if (bitmap2 != null) {
            dc5 dc5Var = (dc5) this.b;
            int iD = i == 24 ? kti.d(dc5Var.a() * 1) : kti.d(dc5Var.a() * 13);
            boolean z = bitmap2.getWidth() == iD;
            if (!z) {
                String name = dc5.class.getName();
                StringBuilder sbK = wy1.k("Sprite is not width enough - index: ", i, "; width: ", bitmap2.getWidth(), "; requiredWidth: ");
                sbK.append(iD);
                wqi.e(name, "Sprite is not width enough, may be a problem of extracting emoji", new IllegalWidthSpriteException(sbK.toString()));
            }
            if (z) {
                float f = nb5Var.b;
                dc5 dc5Var2 = (dc5) this.b;
                int iD2 = kti.d(((Number) dc5Var2.b.getValue()).floatValue() * f);
                int iD3 = kti.d(((Number) dc5Var2.b.getValue()).floatValue() * nb5Var.c);
                int iD4 = kti.d(dc5Var2.a());
                Rect rect = dc5.c;
                rect.left = 0;
                rect.top = 0;
                rect.right = iD4;
                rect.bottom = iD4;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap2, n7j.c(iD2, 0, bitmap2.getWidth() - iD4), n7j.c(iD3, 0, bitmap2.getHeight() - iD4), iD4, iD4);
                ((ac5) this.a).b.d(new nb5(nb5Var.a, nb5Var.b, nb5Var.c), bitmapCreateBitmap);
                return bitmapCreateBitmap;
            }
        }
        String name2 = ka5.class.getName();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name2, xc0.f("Cannot resolve SpriteBitmap. It's null - ", bitmap2 == null), null);
            }
        }
        cc5 cc5Var = (cc5) this.c;
        cc5Var.g.computeIfAbsent(Integer.valueOf(i), new ni(13, new p8(cc5Var, i, 2)));
        return null;
    }

    public void p(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.a = str;
    }

    public void q(TextPaint textPaint) {
        t5g t5gVar = dpg.n;
        Context context = ((ChatsListWidget) this.a).getContext();
        EndlessRecyclerView2 endlessRecyclerView2 = (EndlessRecyclerView2) this.c;
        t5g.c(t5gVar, context, textPaint, endlessRecyclerView2.getResources().getDisplayMetrics(), null, 8);
        textPaint.setColor(a93.s0.y(endlessRecyclerView2).getText().i);
    }

    @Override // defpackage.oj1
    public PointF t() {
        qj1 qj1Var = ((yp5) this.a).g;
        ViewGroup.LayoutParams layoutParams = qj1Var != null ? qj1Var.getLayoutParams() : null;
        return (layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null) != null ? new PointF(r1.x, r1.y) : mfh.e((Context) this.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ka5(uid uidVar, em6 em6Var, y8g y8gVar) {
        this.a = uidVar;
        this.b = (u08) em6Var;
        this.c = y8gVar;
    }

    public ka5(int i) {
        switch (i) {
            case 10:
                int i2 = 24;
                this.a = new kce(i2);
                this.b = new kce(i2);
                this.c = rd5.a;
                break;
            default:
                this.a = new AtomicInteger(0);
                break;
        }
    }

    public ka5(cm6 cm6Var, cm6 cm6Var2, int i) {
        cm6Var2 = (i & 2) != 0 ? new nte(16) : cm6Var2;
        bwf bwfVarD = tdf.a.getAccessor().d(151);
        this.a = cm6Var;
        this.b = cm6Var2;
        this.c = bwfVarD;
    }

    public ka5(f1e f1eVar) {
        this(new prd(23, f1eVar), (cm6) null, 6);
    }

    public ka5(Runnable runnable) {
        this.b = new CopyOnWriteArrayList();
        this.c = new HashMap();
        this.a = runnable;
    }
}
