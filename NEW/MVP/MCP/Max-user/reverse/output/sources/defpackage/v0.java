package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.fresco.ui.common.ControllerListener2;
import com.facebook.fresco.ui.common.ForwardingControllerListener2;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class v0 implements i45, es4 {
    public static final Map s = bh7.a("component_tag", "drawee");
    public static final Map t = bh7.b(HasExtraData.KEY_ORIGIN, "memory_bitmap", HasExtraData.KEY_ORIGIN_SUBCATEGORY, "shortcut");
    public static final Class u = v0.class;
    public final k45 a;
    public final fs4 b;
    public final Executor c;
    public jc7 d;
    public nr6 e;
    public n54 f;
    public final ForwardingControllerListener2 g;
    public gr6 h;
    public qg4 i;
    public String j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public pe4 o;
    public Object p;
    public boolean q;
    public Drawable r;

    public v0(fs4 fs4Var, Executor executor) {
        this.a = k45.c ? new k45() : k45.b;
        this.g = new ForwardingControllerListener2();
        this.q = true;
        this.b = fs4Var;
        this.c = executor;
        f(null);
    }

    public final void a(n54 n54Var) {
        n54Var.getClass();
        n54 n54Var2 = this.f;
        if (n54Var2 instanceof u0) {
            ((u0) n54Var2).a(n54Var);
            return;
        }
        if (n54Var2 == null) {
            this.f = n54Var;
            return;
        }
        ml6.i();
        u0 u0Var = new u0();
        u0Var.a(n54Var2);
        u0Var.a(n54Var);
        ml6.i();
        this.f = u0Var;
    }

    public abstract Drawable b(Object obj);

    public final n54 c() {
        n54 n54Var = this.f;
        return n54Var == null ? kj0.a : n54Var;
    }

    public abstract pe7 d(Object obj);

    public final gr6 e() {
        gr6 gr6Var = this.h;
        if (gr6Var != null) {
            return gr6Var;
        }
        throw new IllegalStateException("mSettableDraweeHierarchy is null; Caller context: null");
    }

    public final synchronized void f(String str) {
        fs4 fs4Var;
        try {
            ml6.i();
            this.a.a(j45.X);
            if (!this.q && (fs4Var = this.b) != null) {
                fs4Var.a(this);
            }
            this.k = false;
            n();
            this.n = false;
            jc7 jc7Var = this.d;
            if (jc7Var != null) {
                jc7Var.b = false;
                jc7Var.a = 4;
                jc7Var.c = 0;
            }
            nr6 nr6Var = this.e;
            if (nr6Var != null) {
                nr6Var.a = null;
                nr6Var.c = false;
                nr6Var.d = false;
                nr6Var.a = this;
            }
            n54 n54Var = this.f;
            if (n54Var instanceof u0) {
                u0 u0Var = (u0) n54Var;
                synchronized (u0Var) {
                    u0Var.a.clear();
                }
            } else {
                this.f = null;
            }
            gr6 gr6Var = this.h;
            if (gr6Var != null) {
                gr6Var.f.o(gr6Var.a);
                gr6Var.g();
                qsd qsdVar = this.h.d;
                qsdVar.o = null;
                qsdVar.invalidateSelf();
                this.h = null;
            }
            this.i = null;
            if (op5.a.h(2)) {
                op5.f(u, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.j, str);
            }
            this.j = str;
            ml6.i();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean g(String str, pe4 pe4Var) {
        if (pe4Var == null && this.o == null) {
            return true;
        }
        return str.equals(this.j) && pe4Var == this.o && this.l;
    }

    public final void h(String str, Throwable th) {
        if (op5.a.h(2)) {
            Integer numValueOf = Integer.valueOf(System.identityHashCode(this));
            String str2 = this.j;
            if (op5.a.h(2)) {
                op5.a.v(u.getSimpleName(), String.format(null, "controller %x %s: %s: failure: %s", numValueOf, str2, str, th));
            }
        }
    }

    public final void i(Object obj, String str) {
        if (op5.a.h(2)) {
            Integer numValueOf = Integer.valueOf(System.identityHashCode(this));
            String str2 = this.j;
            String simpleName = obj != null ? obj.getClass().getSimpleName() : "<null>";
            vc3 vc3Var = (vc3) obj;
            Object[] objArr = {numValueOf, str2, str, simpleName, Integer.valueOf((vc3Var == null || !vc3Var.h0()) ? 0 : System.identityHashCode(vc3Var.b.a()))};
            if (op5.a.h(2)) {
                op5.a.v(u.getSimpleName(), String.format(null, "controller %x %s: %s: image: %s %x", objArr));
            }
        }
    }

    public final ControllerListener2.Extras j(Map map, Map map2, Uri uri) {
        String strValueOf;
        gr6 gr6Var = this.h;
        if (gr6Var != null) {
            strValueOf = String.valueOf(!(gr6Var.e(2) instanceof qyd) ? null : gr6Var.f(2).o);
            if (gr6Var.e(2) instanceof qyd) {
                gr6Var.f(2).getClass();
            }
        } else {
            strValueOf = null;
        }
        gr6 gr6Var2 = this.h;
        Rect bounds = gr6Var2 == null ? null : gr6Var2.d.getBounds();
        ControllerListener2.Extras extras = new ControllerListener2.Extras();
        if (bounds != null) {
            extras.viewportWidth = bounds.width();
            extras.viewportHeight = bounds.height();
        }
        extras.scaleType = strValueOf;
        extras.callerContext = null;
        extras.logWithHighSamplingRate = false;
        extras.mainUri = uri;
        extras.datasourceExtras = map;
        extras.imageExtras = map2;
        extras.shortcutExtras = t;
        extras.componentExtras = s;
        extras.imageSourceExtras = null;
        return extras;
    }

    public final void k(String str, pe4 pe4Var, Throwable th, boolean z) {
        Drawable drawable;
        ml6.i();
        if (!g(str, pe4Var)) {
            h("ignore_old_datasource @ onFailure", th);
            pe4Var.close();
            ml6.i();
            return;
        }
        this.a.a(z ? j45.w0 : j45.x0);
        ForwardingControllerListener2 forwardingControllerListener2 = this.g;
        if (z) {
            h("final_failed @ onFailure", th);
            this.o = null;
            this.m = true;
            gr6 gr6Var = this.h;
            if (gr6Var != null) {
                up5 up5Var = gr6Var.e;
                if (this.n && (drawable = this.r) != null) {
                    gr6Var.j(drawable, 1.0f, true);
                } else if (q()) {
                    up5Var.B0++;
                    gr6Var.c();
                    if (up5Var.c(4) != null) {
                        gr6Var.b(4);
                    } else {
                        gr6Var.b(1);
                    }
                    up5Var.a();
                } else {
                    up5Var.B0++;
                    gr6Var.c();
                    if (up5Var.c(5) != null) {
                        gr6Var.b(5);
                    } else {
                        gr6Var.b(1);
                    }
                    up5Var.a();
                }
            }
            ControllerListener2.Extras extrasJ = j(pe4Var == null ? null : ((r0) pe4Var).a, null, null);
            c().d(this.j, th);
            forwardingControllerListener2.onFailure(this.j, th, extrasJ);
        } else {
            h("intermediate_failed @ onFailure", th);
            c().j(this.j, th);
            forwardingControllerListener2.onIntermediateImageFailed(this.j);
        }
        ml6.i();
    }

    public final void l(String str, pe4 pe4Var, Object obj, float f, boolean z, boolean z2, boolean z3) {
        try {
            ml6.i();
            if (!g(str, pe4Var)) {
                i(obj, "ignore_old_datasource @ onNewResult");
                vc3.P((vc3) obj);
                pe4Var.close();
                ml6.i();
                return;
            }
            this.a.a(z ? j45.u0 : j45.v0);
            try {
                Drawable drawableB = b(obj);
                Object obj2 = this.p;
                Object obj3 = this.r;
                this.p = obj;
                this.r = drawableB;
                try {
                    if (z) {
                        i(obj, "set_final_result @ onNewResult");
                        this.o = null;
                        e().j(drawableB, 1.0f, z2);
                        p(str, obj, pe4Var);
                    } else if (z3) {
                        i(obj, "set_temporary_result @ onNewResult");
                        e().j(drawableB, 1.0f, z2);
                        p(str, obj, pe4Var);
                    } else {
                        i(obj, "set_intermediate_result @ onNewResult");
                        e().j(drawableB, f, z2);
                        pe7 pe7VarD = d(obj);
                        c().onIntermediateImageSet(str, pe7VarD);
                        this.g.onIntermediateImageSet(str, pe7VarD);
                    }
                    if (obj3 != null && obj3 != drawableB && (obj3 instanceof g45)) {
                        ((g45) obj3).a();
                    }
                    if (obj2 != null && obj2 != obj) {
                        i(obj2, "release_previous_result @ onNewResult");
                        vc3.P((vc3) obj2);
                    }
                    ml6.i();
                } catch (Throwable th) {
                    if (obj3 != null && obj3 != drawableB && (obj3 instanceof g45)) {
                        ((g45) obj3).a();
                    }
                    if (obj2 != null && obj2 != obj) {
                        i(obj2, "release_previous_result @ onNewResult");
                        vc3.P((vc3) obj2);
                    }
                    throw th;
                }
            } catch (Exception e) {
                i(obj, "drawable_failed @ onNewResult");
                vc3.P((vc3) obj);
                k(str, pe4Var, e, z);
                ml6.i();
            }
        } catch (Throwable th2) {
            ml6.i();
            throw th2;
        }
    }

    public final void m() {
        this.a.a(j45.s0);
        jc7 jc7Var = this.d;
        if (jc7Var != null) {
            jc7Var.c = 0;
        }
        nr6 nr6Var = this.e;
        if (nr6Var != null) {
            nr6Var.c = false;
            nr6Var.d = false;
        }
        gr6 gr6Var = this.h;
        if (gr6Var != null) {
            gr6Var.f.o(gr6Var.a);
            gr6Var.g();
        }
        n();
    }

    public final void n() {
        Map map;
        Map extras;
        boolean z = this.l;
        this.l = false;
        this.m = false;
        pe4 pe4Var = this.o;
        if (pe4Var != null) {
            map = ((r0) pe4Var).a;
            pe4Var.close();
            this.o = null;
        } else {
            map = null;
        }
        Object obj = this.r;
        if (obj != null && (obj instanceof g45)) {
            ((g45) obj).a();
        }
        this.r = null;
        Object obj2 = this.p;
        if (obj2 != null) {
            pe7 pe7VarD = d(obj2);
            extras = pe7VarD == null ? null : pe7VarD.getExtras();
            i(this.p, "release");
            vc3.P((vc3) this.p);
            this.p = null;
        } else {
            extras = null;
        }
        if (z) {
            c().e(this.j);
            this.g.onRelease(this.j, j(map, extras, null));
        }
    }

    public final void o(pe4 pe4Var, pe7 pe7Var) {
        c().g(this.j);
        String str = this.j;
        b2c b2cVar = (b2c) this;
        rf7 rf7Var = b2cVar.B;
        rf7 rf7Var2 = b2cVar.C;
        Uri uri = rf7Var != null ? rf7Var.b : null;
        if (uri == null) {
            uri = rf7Var2 != null ? rf7Var2.b : null;
        }
        this.g.onSubmit(str, null, j(pe4Var == null ? null : ((r0) pe4Var).a, pe7Var == null ? null : pe7Var.getExtras(), uri));
    }

    public final void p(String str, Object obj, pe4 pe4Var) {
        pe7 pe7VarD = d(obj);
        n54 n54VarC = c();
        Object obj2 = this.r;
        n54VarC.b(str, pe7VarD, obj2 instanceof Animatable ? (Animatable) obj2 : null);
        this.g.onFinalImageSet(str, pe7VarD, j(pe4Var == null ? null : ((r0) pe4Var).a, pe7VarD == null ? null : pe7VarD.getExtras(), null));
    }

    public final boolean q() {
        jc7 jc7Var;
        return this.m && (jc7Var = this.d) != null && jc7Var.b && jc7Var.c < jc7Var.a;
    }

    public final void r() {
        vc3 vc3Var;
        jp0 jp0Var;
        ml6.i();
        b2c b2cVar = (b2c) this;
        ml6.i();
        try {
            jf9 jf9Var = b2cVar.x;
            if (jf9Var == null || (jp0Var = b2cVar.y) == null) {
                vc3Var = null;
            } else {
                vc3 vc3Var2 = jf9Var.get(jp0Var);
                if (vc3Var2 == null || ((fh7) ((sc3) vc3Var2.Z()).getQualityInfo()).c) {
                    ml6.i();
                    vc3Var = vc3Var2;
                } else {
                    vc3Var2.close();
                    vc3Var = null;
                }
            }
            if (vc3Var != null) {
                ml6.i();
                this.o = null;
                this.l = true;
                this.m = false;
                this.a.a(j45.C0);
                o(this.o, d(vc3Var));
                synchronized (b2cVar) {
                    try {
                    } catch (Throwable th) {
                        th = th;
                        while (true) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                }
                l(this.j, this.o, vc3Var, 1.0f, true, true, true);
                ml6.i();
                ml6.i();
                return;
            }
            this.a.a(j45.t0);
            gr6 gr6Var = this.h;
            up5 up5Var = gr6Var.e;
            if (up5Var.c(3) != null) {
                up5Var.B0++;
                gr6Var.l(0.0f);
                up5Var.b();
                up5Var.a();
            }
            this.l = true;
            this.m = false;
            ml6.i();
            if (op5.a.h(2)) {
                op5.d(b2c.class, Integer.valueOf(System.identityHashCode(b2cVar)), "controller %x: getDataSource");
            }
            pe4 pe4Var = (pe4) b2cVar.z.get();
            ml6.i();
            this.o = pe4Var;
            o(pe4Var, null);
            if (op5.a.h(2)) {
                op5.f(u, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.j, Integer.valueOf(System.identityHashCode(this.o)));
            }
            ((r0) this.o).l(new t0(this, this.j, this.o.e()), this.c);
            ml6.i();
        } finally {
            ml6.i();
        }
    }

    public String toString() {
        hc8 hc8VarC = yyi.c(this);
        hc8VarC.p("isAttached", this.k);
        hc8VarC.p("isRequestSubmitted", this.l);
        hc8VarC.p("hasFetchFailed", this.m);
        vc3 vc3Var = (vc3) this.p;
        hc8VarC.c((vc3Var == null || !vc3Var.h0()) ? 0 : System.identityHashCode(vc3Var.b.a()), "fetchedImage");
        hc8VarC.r(this.a.a.toString(), "events");
        return hc8VarC.toString();
    }
}
