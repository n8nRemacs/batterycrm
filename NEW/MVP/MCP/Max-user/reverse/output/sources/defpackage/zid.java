package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.WindowManager;
import androidx.appcompat.widget.Toolbar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public final class zid implements b9e, tm6, tf9, i4h, s0i, ikd, yci {
    public final Object a;

    public /* synthetic */ zid(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.i4h
    public void a(ehg ehgVar) {
        ehgVar.f(((WindowManager) this.a).getDefaultDisplay());
    }

    @Override // defpackage.ikd
    public void accept(Object obj, Object obj2) {
        n2g n2gVar = (n2g) obj2;
        xbi xbiVar = (xbi) ((cci) obj).o();
        j3g j3gVar = (j3g) this.a;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(xbiVar.e);
        cbi.c(parcelObtain, j3gVar);
        try {
            xbiVar.d.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            n2gVar.b(null);
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        Object objApply = ((ukd) ((hs8) this.a).c).apply(new Object[]{obj});
        Objects.requireNonNull(objApply, "The zipper returned a null value");
        return objApply;
    }

    @Override // defpackage.tf9
    public boolean b(vf9 vf9Var, MenuItem menuItem) {
        return false;
    }

    @Override // defpackage.i4h
    public void c() {
    }

    @Override // defpackage.yci
    public Object d() {
        qni qniVar = (qni) ((yci) this.a).d();
        if (qniVar != null) {
            return qniVar;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public StaticLayout e(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, boolean z, TextUtils.TruncateAt truncateAt, int i2, float f) {
        int i3;
        int i4;
        yi5 yi5Var = (yi5) this.a;
        CharSequence string = charSequence;
        boolean z2 = false;
        while (true) {
            try {
                int length = string.length();
                if (z2) {
                    i4 = length;
                    i3 = 0;
                } else {
                    i3 = length;
                    i4 = 0;
                }
                return qbj.a(string, i4, i3, textPaint, i, alignment, f, z, truncateAt, i, i2, z2 ? y3g.e : y3g.c);
            } catch (IllegalArgumentException e) {
                wqi.e("zid", "seems we work with RTL text", e);
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                if (z2 || !vmf.s(message, "fromIndex", false) || !vmf.s(message, "toIndex", false)) {
                    final String str = "unknown: " + ((Object) charSequence);
                    throw new RuntimeException(str, e) { // from class: ru.ok.tamtam.messages.rendering.StaticLayoutFactory$StaticLayoutCreateException
                    };
                }
                if (yi5Var != null) {
                    final String str2 = "check range exception: " + ((Object) charSequence);
                    ((y3b) yi5Var).a(new RuntimeException(str2, e) { // from class: ru.ok.tamtam.messages.rendering.StaticLayoutFactory$StaticLayoutCreateException
                    });
                }
                z2 = true;
            } catch (IndexOutOfBoundsException e2) {
                if (string instanceof String) {
                    final String str3 = "strange: " + ((Object) charSequence);
                    throw new RuntimeException(str3, e2) { // from class: ru.ok.tamtam.messages.rendering.StaticLayoutFactory$StaticLayoutCreateException
                    };
                }
                final String str4 = "zid. Hit bug #35412, retrying with Spannables removed: " + ((Object) charSequence);
                wqi.b("zid", str4, e2);
                if (yi5Var != null) {
                    ((y3b) yi5Var).a(new RuntimeException(str4, e2) { // from class: ru.ok.tamtam.messages.rendering.StaticLayoutFactory$StaticLayoutCreateException
                    });
                } else {
                    wqi.e("zid", str4, e2);
                }
                string = string.toString();
            }
        }
    }

    @Override // defpackage.tf9
    public void f(vf9 vf9Var) {
        Toolbar toolbar = (Toolbar) this.a;
        h7 h7Var = toolbar.a.o;
        if (h7Var == null || !h7Var.j()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.T0.b).iterator();
            while (it.hasNext()) {
                ((ki6) it.next()).a.t(vf9Var);
            }
        }
        hfd hfdVar = toolbar.b1;
        if (hfdVar != null) {
            hfdVar.f(vf9Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    @Override // defpackage.b9e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int g(int r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.a
            one.me.sdk.sections.SectionRecyclerWidget r0 = (one.me.sdk.sections.SectionRecyclerWidget) r0
            androidx.recyclerview.widget.RecyclerView r1 = r0.z0()
            phd r1 = r1.getAdapter()
            r2 = 0
            if (r1 != 0) goto L10
            return r2
        L10:
            int r3 = r1.j()
            if (r8 < r3) goto L17
            return r2
        L17:
            if (r8 >= 0) goto L1a
            return r2
        L1a:
            boolean r3 = r1 instanceof defpackage.zm3
            r4 = 0
            if (r3 == 0) goto L23
            r3 = r1
            zm3 r3 = (defpackage.zm3) r3
            goto L24
        L23:
            r3 = r4
        L24:
            if (r3 == 0) goto L45
            android.util.Pair r3 = r3.D(r8)
            java.lang.Object r5 = r3.first
            koe r6 = r0.getD()
            boolean r5 = defpackage.fni.a(r5, r6)
            if (r5 == 0) goto L37
            goto L38
        L37:
            r3 = r4
        L38:
            if (r3 == 0) goto L45
            java.lang.Object r3 = r3.second
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L45
            int r8 = r3.intValue()
            goto L4f
        L45:
            koe r3 = r0.getD()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Ld0
        L4f:
            if (r8 > 0) goto L53
            r1 = r4
            goto L6b
        L53:
            koe r1 = r0.getD()
            iv r1 = r1.d
            java.util.List r1 = r1.f
            int r2 = r8 + (-1)
            java.lang.Object r1 = r1.get(r2)
            ioe r1 = (defpackage.ioe) r1
            int r1 = r1.t()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L6b:
            koe r2 = r0.getD()
            iv r2 = r2.d
            java.util.List r2 = r2.f
            java.lang.Object r2 = r2.get(r8)
            ioe r2 = (defpackage.ioe) r2
            int r2 = r2.t()
            koe r3 = r0.getD()
            iv r3 = r3.d
            java.util.List r3 = r3.f
            int r3 = r3.size()
            r5 = 1
            int r3 = r3 - r5
            if (r8 != r3) goto L8e
            goto La5
        L8e:
            koe r0 = r0.getD()
            iv r0 = r0.d
            java.util.List r0 = r0.f
            int r8 = r8 + r5
            java.lang.Object r8 = r0.get(r8)
            ioe r8 = (defpackage.ioe) r8
            int r8 = r8.t()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
        La5:
            if (r1 != 0) goto La8
            goto Lae
        La8:
            int r8 = r1.intValue()
            if (r8 == r2) goto Lb9
        Lae:
            if (r4 != 0) goto Lb1
            goto Lb7
        Lb1:
            int r8 = r4.intValue()
            if (r2 == r8) goto Lb9
        Lb7:
            r8 = 4
            return r8
        Lb9:
            if (r1 != 0) goto Lbc
            goto Lc2
        Lbc:
            int r8 = r1.intValue()
            if (r8 == r2) goto Lc3
        Lc2:
            return r5
        Lc3:
            if (r4 != 0) goto Lc6
            goto Lcc
        Lc6:
            int r8 = r4.intValue()
            if (r2 == r8) goto Lce
        Lcc:
            r8 = 3
            return r8
        Lce:
            r8 = 2
            return r8
        Ld0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zid.g(int):int");
    }

    @Override // defpackage.s0i
    public boolean h() {
        return ((pe8) ((pb3) ((aeh) this.a).Z.getValue())).O();
    }

    public yfh i(ca3 ca3Var) {
        String str;
        ka5 ka5Var = (ka5) this.a;
        HashMap map = ca3.c;
        Class cls = ca3Var.a;
        String canonicalName = null;
        if (!cls.isAnonymousClass() && !cls.isLocalClass()) {
            if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) map.get(componentType.getName())) != null) {
                    canonicalName = str.concat("Array");
                }
                if (canonicalName == null) {
                    canonicalName = "kotlin.Array";
                }
            } else {
                canonicalName = (String) map.get(cls.getName());
                if (canonicalName == null) {
                    canonicalName = cls.getCanonicalName();
                }
            }
        }
        if (canonicalName != null) {
            return ka5Var.l(ca3Var, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // defpackage.s0i
    public void j() {
        Object value;
        aeh aehVar = (aeh) this.a;
        String name = aeh.class.getName();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            aehVar.getClass();
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, "videoWebView: onPageFinishLoading: " + aehVar.v0.a.getValue(), null);
            }
        }
        tcf tcfVar = aehVar.u0;
        do {
            value = tcfVar.getValue();
            zlb zlbVar = (zlb) value;
            if (!(zlbVar instanceof xlb) && !(zlbVar instanceof wlb) && zlbVar != null) {
                return;
            }
        } while (!tcfVar.c(value, new xlb()));
    }

    @Override // defpackage.s0i
    public void k() {
        aeh aehVar = (aeh) this.a;
        String name = aeh.class.getName();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            aehVar.getClass();
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, "videoWebView: onPageLoadingError: " + aehVar.v0.a.getValue(), null);
            }
        }
        aehVar.u0.m(null, vlb.a);
    }

    @Override // defpackage.s0i
    public boolean l(Uri uri) {
        return false;
    }

    public boolean m(CharSequence charSequence, qub qubVar) {
        String str = qubVar.b;
        if (str.length() != 0) {
            Matcher matcher = ((ao6) this.a).k(str).matcher(charSequence);
            return matcher.lookingAt() && matcher.matches();
        }
        return false;
    }

    @Override // defpackage.s0i
    public void q(String str) {
        ((aeh) this.a).v(str, false);
    }

    public zid(int i) {
        switch (i) {
            case 1:
                this.a = new LinkedHashSet();
                break;
            default:
                this.a = new ao6(100);
                break;
        }
    }

    public zid(fgh fghVar, dgh dghVar) {
        this(fghVar, dghVar, y94.b);
    }

    public zid(fgh fghVar, dgh dghVar, aa4 aa4Var) {
        this.a = new ka5(fghVar, dghVar, aa4Var);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zid(ggh gghVar) {
        dgh dghVarD;
        aa4 aa4VarE;
        fgh fghVarH = gghVar.h();
        boolean z = gghVar instanceof s07;
        if (z) {
            dghVarD = ((s07) gghVar).d();
        } else {
            dghVarD = vr4.a;
        }
        if (z) {
            aa4VarE = ((s07) gghVar).e();
        } else {
            aa4VarE = y94.b;
        }
        this(fghVarH, dghVarD, aa4VarE);
    }
}
