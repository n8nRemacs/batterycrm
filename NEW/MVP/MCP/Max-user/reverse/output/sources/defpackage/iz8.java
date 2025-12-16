package defpackage;

import android.net.Uri;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import one.me.sdk.media.transformer.impl.MediaInfoRetriever$InvalidMediaException;

/* loaded from: classes2.dex */
public final class iz8 implements kp5 {
    public Object X;
    public final ArrayList a;
    public long b;
    public boolean c;
    public Object d;
    public Object o;

    public iz8() {
        this.b = -1L;
        this.X = new ecg(this);
        this.a = new ArrayList();
    }

    @Override // defpackage.kp5
    /* renamed from: B */
    public sfg mo163B(int i, int i2) {
        jz8 jz8Var = new jz8();
        if (i2 == 1) {
            ((ArrayList) this.d).add(jz8Var);
            return jz8Var;
        }
        if (i2 != 2) {
            ((ArrayList) this.o).add(jz8Var);
            return jz8Var;
        }
        this.a.add(jz8Var);
        return jz8Var;
    }

    @Override // defpackage.kp5
    public void Q(i9e i9eVar) {
        this.X = i9eVar;
    }

    public void a() {
        if (this.c) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((dhh) it.next()).b();
            }
            this.c = false;
        }
    }

    public void b() {
        View view;
        if (this.c) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            dhh dhhVar = (dhh) it.next();
            long j = this.b;
            if (j >= 0) {
                dhhVar.c(j);
            }
            Interpolator interpolator = (Interpolator) this.d;
            if (interpolator != null && (view = (View) dhhVar.a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (((ehh) this.o) != null) {
                dhhVar.d((ecg) this.X);
            }
            View view2 = (View) dhhVar.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.c = true;
    }

    @Override // defpackage.kp5
    public void w() {
        this.c = true;
    }

    public iz8(hz8 hz8Var) {
        gz8 gz8Var = hz8Var.b;
        this.b = hz8Var.d;
        this.a = new ArrayList();
        this.d = new ArrayList();
        this.o = new ArrayList();
        hz8Var.w(this);
        n7 n7Var = new n7();
        while (true) {
            gp5 gp5Var = hz8Var.a;
            nm4 nm4Var = gz8Var.c;
            if (nm4Var != null) {
                int iY = gp5Var.y(nm4Var, n7Var);
                boolean z = this.c;
                if (z && ((i9e) this.X) != null) {
                    return;
                }
                if (iY == 1) {
                    long j = n7Var.a;
                    Uri uri = gz8Var.a.getUri();
                    if (uri != null) {
                        gz8Var.close();
                        gz8Var.H(new ze4(uri, 0L, 1, null, Collections.EMPTY_MAP, j, -1L, null, 0));
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    if (iY == -1 && z) {
                        return;
                    }
                    if (iY == -1) {
                        throw new MediaInfoRetriever$InvalidMediaException(ctd.i(hz8Var.c, "Invalid media specified="));
                    }
                }
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }
}
