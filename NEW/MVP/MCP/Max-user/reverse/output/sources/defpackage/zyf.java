package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zyf implements eh6 {
    public final ao6 b;
    public b4 c;
    public knd d;
    public final ArrayList o;
    public final ArrayDeque a = new ArrayDeque();
    public boolean X = false;

    public zyf(ao6 ao6Var) {
        jei.b();
        this.b = ao6Var;
        this.o = new ArrayList();
    }

    @Override // defpackage.eh6
    public final void a(fh6 fh6Var) {
        ayi.d().execute(new yyf(this, 1));
    }

    public final void b() {
        jei.b();
        ImageCaptureException imageCaptureException = new ImageCaptureException("Camera is closed.", null);
        ArrayDeque arrayDeque = this.a;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            yb0 yb0Var = (yb0) it.next();
            yb0Var.b.execute(new aee(yb0Var, 22, imageCaptureException));
        }
        arrayDeque.clear();
        Iterator it2 = new ArrayList(this.o).iterator();
        while (it2.hasNext()) {
            knd kndVar = (knd) it2.next();
            kndVar.getClass();
            jei.b();
            if (!kndVar.d.b.isDone()) {
                jei.b();
                kndVar.g = true;
                q72 q72Var = kndVar.i;
                Objects.requireNonNull(q72Var);
                q72Var.cancel(true);
                kndVar.e.d(imageCaptureException);
                kndVar.f.b(null);
                jei.b();
                yb0 yb0Var2 = kndVar.a;
                yb0Var2.b.execute(new aee(yb0Var2, 22, imageCaptureException));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        b4 b4Var;
        f52 f52Var;
        jei.b();
        Log.d("TakePictureManager", "Issue the next TakePictureRequest.");
        if (this.d != null) {
            Log.d("TakePictureManager", "There is already a request in-flight.");
            return;
        }
        if (this.X) {
            Log.d("TakePictureManager", "The class is paused.");
            return;
        }
        b4 b4Var2 = this.c;
        b4Var2.getClass();
        jei.b();
        if (((kw6) b4Var2.c).b() == 0) {
            Log.d("TakePictureManager", "Too many acquire images. Close image to be able to process next.");
            return;
        }
        yb0 yb0Var = (yb0) this.a.poll();
        if (yb0Var == null) {
            Log.d("TakePictureManager", "No new request.");
            return;
        }
        knd kndVar = new knd(yb0Var, this);
        int i = 0;
        boolean z = true;
        z5j.f(null, !(this.d != null));
        this.d = kndVar;
        jei.b();
        kndVar.c.b.d(new yyf(this, i), ayi.a());
        this.o.add(kndVar);
        jei.b();
        kndVar.d.b.d(new aee(this, 21, kndVar), ayi.a());
        b4 b4Var3 = this.c;
        jei.b();
        wu1 wu1Var = kndVar.c;
        b4Var3.getClass();
        jei.b();
        f52 f52Var2 = (f52) ((fe7) b4Var3.a).d(fe7.d, new f52(Arrays.asList(new q52())));
        Objects.requireNonNull(f52Var2);
        int i2 = b4.Y;
        b4.Y = i2 + 1;
        q90 q90Var = (q90) b4Var3.o;
        ArrayList arrayList = new ArrayList();
        String strValueOf = String.valueOf(f52Var2.hashCode());
        List<q52> list = f52Var2.a;
        Objects.requireNonNull(list);
        for (q52 q52Var : list) {
            w30 w30Var = new w30();
            h52 h52Var = (h52) b4Var3.b;
            int i3 = i;
            w30Var.c = h52Var.c;
            w30Var.c(h52Var.b);
            w30Var.a(yb0Var.i);
            cg7 cg7Var = q90Var.b;
            Objects.requireNonNull(cg7Var);
            ((HashSet) w30Var.e).add(cg7Var);
            w30Var.a = q90Var.c != null ? z : i3;
            if (pfi.d(q90Var.e)) {
                if (((ImageCaptureRotationOptionQuirk) ov4.a.e(ImageCaptureRotationOptionQuirk.class)) != null) {
                    s90 s90Var = h52.i;
                } else {
                    ((x8a) w30Var.f).n(h52.i, Integer.valueOf(yb0Var.f));
                }
                s90 s90Var2 = h52.j;
                Rect rect = yb0Var.d;
                Size size = q90Var.d;
                RectF rectF = bhg.a;
                b4Var = b4Var3;
                if (rect.left == 0 && rect.top == 0) {
                    f52Var = f52Var2;
                    if (rect.width() == size.getWidth()) {
                        rect.height();
                        size.getHeight();
                    }
                } else {
                    f52Var = f52Var2;
                }
                ((x8a) w30Var.f).n(s90Var2, Integer.valueOf(yb0Var.g));
            } else {
                b4Var = b4Var3;
                f52Var = f52Var2;
            }
            w30Var.c(q52Var.a.b);
            ((g9a) w30Var.g).a.put(strValueOf, Integer.valueOf(i3));
            ((g9a) w30Var.g).a.put("CAPTURE_CONFIG_ID_KEY", Integer.valueOf(i2));
            w30Var.b(q90Var.a);
            arrayList.add(w30Var.d());
            i = i3;
            b4Var3 = b4Var;
            f52Var2 = f52Var;
            z = true;
        }
        int i4 = i;
        h79 h79Var = new h79(arrayList, 10, kndVar);
        iac iacVar = new iac(f52Var2, yb0Var.d, yb0Var.f, yb0Var.g, yb0Var.e, kndVar, wu1Var, i2);
        b4 b4Var4 = this.c;
        b4Var4.getClass();
        jei.b();
        ((q90) b4Var4.o).h.accept(iacVar);
        jei.b();
        ee7 ee7Var = (ee7) this.b.b;
        synchronized (ee7Var.q) {
            try {
                if (ee7Var.q.get() == null) {
                    ee7Var.q.set(Integer.valueOf(ee7Var.H()));
                }
            } finally {
            }
        }
        ee7 ee7Var2 = (ee7) this.b.b;
        jei.b();
        q72 q72VarL = wsf.l(ee7Var2.d().i(arrayList, ee7Var2.p, ee7Var2.r), new usd(19, new lz1(6)), ayi.a());
        wsf.b(q72VarL, new aqc(this, 9, h79Var), ayi.d());
        jei.b();
        z5j.f("CaptureRequestFuture can only be set once.", kndVar.i == null ? 1 : i4);
        kndVar.i = q72VarL;
    }

    public final void d(yb0 yb0Var) {
        jei.b();
        gri.a("TakePictureManager", "Add a new request for retrying.");
        this.a.addFirst(yb0Var);
        c();
    }
}
