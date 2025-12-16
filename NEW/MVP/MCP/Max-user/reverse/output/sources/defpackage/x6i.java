package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.media3.exoplayer.dash.DashManifestStaleException;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class x6i implements mv, f91, gof, pkf, jc8, bbd, gu3, vva, bz9, tm6, fu7 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ x6i(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static Object i(String str) {
        ClassLoader classLoader = x6i.class.getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        return classLoader.loadClass(str).getField("INSTANCE").get(null);
    }

    public static x6i k() {
        boolean z;
        synchronized (ica.class) {
            z = ica.a;
        }
        if (!z && ica.class.getClassLoader() != ClassLoader.getSystemClassLoader()) {
            l();
            throw null;
        }
        synchronized (x6i.class) {
            o("JNI");
            throw null;
        }
    }

    public static x6i l() {
        if (!byg.b) {
            synchronized (x6i.class) {
                o("JavaSafe");
                throw null;
            }
        }
        try {
            synchronized (x6i.class) {
                o("JavaUnsafe");
                throw null;
            }
        } finally {
        }
    }

    public static void o(String str) {
        try {
            new x6i(str);
            throw null;
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.bbd
    public Object D(Object obj, yy7 yy7Var) {
        long jLongValue = ((Number) ((wt5) this.b).D(obj, yy7Var)).longValue();
        int i = s65.d;
        return new s65(v9j.i(jLongValue, y65.SECONDS));
    }

    @Override // defpackage.mv
    public void L(long j, List list) throws Throwable {
        ((mk3) this.b).makeCompleting$kotlinx_coroutines_core(list);
    }

    @Override // defpackage.vva
    public /* synthetic */ void a(Object obj) {
        ((z11) this.b).invoke(obj);
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        y6i y6iVar = (y6i) this.b;
        Objects.requireNonNull((Throwable) obj, "error is null");
        wp7 wp7Var = (wp7) y6iVar.b;
        wp7Var.d.f(wp7Var);
        wp7Var.l.compareAndSet(true, false);
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        dlb dlbVar = (dlb) this.b;
        dlbVar.f.invoke("run routine #" + jLongValue);
        return new wk3(2, new xu9(9, dlbVar));
    }

    @Override // defpackage.jc8
    public void b() throws IOException {
        sd4 sd4Var = (sd4) this.b;
        sd4Var.A.b();
        DashManifestStaleException dashManifestStaleException = sd4Var.C;
        if (dashManifestStaleException != null) {
            throw dashManifestStaleException;
        }
    }

    @Override // defpackage.bz9
    public int c() {
        return ((ByteBuffer) this.b).getInt();
    }

    @Override // defpackage.fu7
    public void d(ce5 ce5Var, int i) throws IOException {
        wnd wndVar = (wnd) this.b;
        hj0 hj0Var = wndVar.b;
        if (ce5Var == null) {
            hj0Var.g(i, null);
            return;
        }
        uf7 uf7Var = wndVar.d;
        ce5Var.i0();
        tf7 tf7VarCreateImageTranscoder = uf7Var.createImageTranscoder(ce5Var.b, wndVar.c);
        tf7VarCreateImageTranscoder.getClass();
        oac oacVar = wndVar.e;
        mk0 mk0Var = (mk0) oacVar;
        mk0Var.c.j(oacVar, "ResizeAndRotateProducer");
        rf7 rf7Var = mk0Var.a;
        py0 py0Var = wndVar.h.b;
        py0Var.getClass();
        of9 of9Var = new of9((mf9) py0Var.b);
        try {
            try {
                ysd ysdVar = rf7Var.i;
                ynd yndVar = rf7Var.h;
                ce5Var.i0();
                l16 l16VarB = tf7VarCreateImageTranscoder.b(ce5Var, of9Var, ysdVar, yndVar, ce5Var.s0);
                int i2 = l16VarB.b;
                if (i2 == 2) {
                    throw new RuntimeException("Error while transcoding the image");
                }
                bh7 bh7VarM = wndVar.m(ce5Var, rf7Var.h, l16VarB, tf7VarCreateImageTranscoder.a());
                qk4 qk4VarJ0 = vc3.j0(of9Var.w());
                try {
                    ce5 ce5Var2 = new ce5(qk4VarJ0);
                    ce5Var2.b = mn4.a;
                    try {
                        ce5Var2.P();
                        ((mk0) oacVar).c.a(oacVar, "ResizeAndRotateProducer", bh7VarM);
                        if (i2 != 1) {
                            i |= 16;
                        }
                        hj0Var.g(i, ce5Var2);
                        qk4VarJ0.close();
                        of9Var.close();
                    } finally {
                        ce5Var2.close();
                    }
                } catch (Throwable th) {
                    vc3.P(qk4VarJ0);
                    throw th;
                }
            } catch (Throwable th2) {
                of9Var.close();
                throw th2;
            }
        } catch (Exception e) {
            ((mk0) oacVar).c.d(oacVar, "ResizeAndRotateProducer", e, null);
            if (hj0.a(i)) {
                hj0Var.e(e);
            }
            of9Var.close();
        }
    }

    @Override // defpackage.gof
    public int e(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // defpackage.f91
    public int f() {
        ViewPager2 viewPager2 = ((i91) this.b).I0;
        int measuredHeight = viewPager2.getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = viewPager2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i = measuredHeight - (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        ViewGroup.LayoutParams layoutParams2 = viewPager2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        return i - (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
    }

    @Override // defpackage.gof
    public long g(int i) {
        fsi.b(i == 0);
        return 0L;
    }

    @Override // defpackage.bz9
    public long getPosition() {
        return ((ByteBuffer) this.b).position();
    }

    @Override // defpackage.bz9
    public long h() {
        return ((ByteBuffer) this.b).getInt() & 4294967295L;
    }

    public String j(gr0 gr0Var, gx3 gx3Var) {
        return (gx3Var == null || ((pf2) this.b) == pf2.a) ? wy1.h("/", gr0Var.b) : u45.k(m6g.b(gx3Var.v0), " /", gr0Var.b);
    }

    @Override // defpackage.gof
    public List m(long j) {
        return j >= 0 ? (List) this.b : Collections.EMPTY_LIST;
    }

    @Override // defpackage.pkf
    public Object n(int i) {
        if (i >= 0) {
            return (CharSequence) ((ia) this.b).invoke(Integer.valueOf(i));
        }
        return null;
    }

    public void p(Exception exc) {
        pai.c("MediaCodecAudioRenderer", "Audio sink error", exc);
        xt4 xt4Var = ((lw8) this.b).P1;
        Handler handler = (Handler) xt4Var.b;
        if (handler != null) {
            handler.post(new p50(xt4Var, exc, 6));
        }
    }

    public void q(ty0 ty0Var, boolean z) {
        gge ggeVar = (gge) this.b;
        synchronized (ggeVar) {
            try {
                if (z) {
                    ((LinkedHashSet) ggeVar.o).add(ty0Var);
                } else {
                    ((LinkedHashSet) ggeVar.o).remove(ty0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.pkf
    public jkf r(ViewGroup viewGroup) {
        return new et2(new TextView(viewGroup.getContext()));
    }

    @Override // defpackage.bz9
    public int readUnsignedShort() {
        return ((ByteBuffer) this.b).getShort() & 65535;
    }

    @Override // defpackage.gof
    public int s() {
        return 1;
    }

    @Override // defpackage.pkf
    public void t(jkf jkfVar, int i) {
        ((et2) jkfVar).d.setText((CharSequence) n(i));
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return x6i.class.getSimpleName() + ":" + ((String) this.b);
            default:
                return super.toString();
        }
    }

    public void u(Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            ((Handler) this.b).post(new d8c(this, 28, runnable));
        } else {
            try {
                runnable.run();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // defpackage.bz9
    public void v(int i) {
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        byteBuffer.position(byteBuffer.position() + i);
    }

    public void w(int i) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.u(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    public /* synthetic */ x6i(int i, boolean z) {
        this.a = i;
    }

    public x6i(Looper looper) {
        this.a = 29;
        this.b = new Handler(looper, null);
    }

    public x6i(rha rhaVar) {
        this.a = 9;
        this.b = new t9f(10, rhaVar);
    }

    public x6i(i17 i17Var) {
        this.a = 16;
        this.b = (CaptureSessionOnClosedNotCalledQuirk) i17Var.e(CaptureSessionOnClosedNotCalledQuirk.class);
    }

    public x6i(int i) {
        this.a = i;
        switch (i) {
            case 19:
                this.b = new umb(10);
                break;
            case 20:
            default:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                this.b = new z95(b3g.h);
                break;
            case 21:
                this.b = new LinkedHashMap(0, 0.75f, true);
                break;
        }
    }

    public x6i(String str) {
        this.a = 0;
        this.b = str;
        if (i("net.jpountz.xxhash.XXHash32".concat(str)) == null) {
            if (i("net.jpountz.xxhash.StreamingXXHash32" + str + "$Factory") == null) {
                if (i("net.jpountz.xxhash.XXHash64".concat(str)) == null) {
                    if (i("net.jpountz.xxhash.StreamingXXHash64" + str + "$Factory") == null) {
                        Random random = new Random();
                        random.nextBytes(new byte[100]);
                        random.nextInt();
                        throw null;
                    }
                    throw new ClassCastException();
                }
                throw new ClassCastException();
            }
            throw new ClassCastException();
        }
        throw new ClassCastException();
    }

    public x6i(ByteBuffer byteBuffer) {
        this.a = 24;
        this.b = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }
}
