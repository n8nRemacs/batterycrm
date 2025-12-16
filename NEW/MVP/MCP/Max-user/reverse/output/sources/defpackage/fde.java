package defpackage;

import android.content.SharedPreferences;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.common.PlaybackException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class fde implements dbd, fvf, nhh {
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ fde(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public static boolean e(Editable editable, KeyEvent keyEvent, boolean z) {
        apg[] apgVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (apgVarArr = (apg[]) editable.getSpans(selectionStart, selectionEnd, apg.class)) != null && apgVarArr.length > 0) {
                for (apg apgVar : apgVarArr) {
                    int spanStart = editable.getSpanStart(apgVar);
                    int spanEnd = editable.getSpanEnd(apgVar);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean A(u69 u69Var, int i) {
        dr3 dr3Var;
        synchronized (this.a) {
            dr3Var = (dr3) ((us) this.c).get(u69Var);
        }
        if (dr3Var == null) {
            return false;
        }
        bie bieVar = dr3Var.d;
        bieVar.getClass();
        boolean z = false;
        hsi.a("Use contains(Command) for custom command", i != 0);
        Iterator<E> it = bieVar.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (((aie) it.next()).a == i) {
                z = true;
                break;
            }
        }
        return z;
    }

    public boolean B(u69 u69Var, aie aieVar) {
        dr3 dr3Var;
        synchronized (this.a) {
            dr3Var = (dr3) ((us) this.c).get(u69Var);
        }
        if (dr3Var == null) {
            return false;
        }
        hh7 hh7Var = dr3Var.d.a;
        aieVar.getClass();
        return hh7Var.contains(aieVar);
    }

    public void C(cm6 cm6Var) {
        EGLDisplay eGLDisplay = (EGLDisplay) this.a;
        if (fni.a((EGLContext) this.c, EGL14.EGL_NO_CONTEXT)) {
            return;
        }
        EGLSurface eGLSurface = (EGLSurface) this.d;
        boolean zEglMakeCurrent = EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, (EGLContext) this.c);
        gke.b("eglMakeCurrent", 12291, 12297, 12299);
        if (zEglMakeCurrent) {
            try {
                cm6Var.invoke();
                EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
                gke.b("eglMakeCurrent", new int[0]);
            } catch (Throwable th) {
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
                gke.b("eglMakeCurrent", new int[0]);
                throw th;
            }
        }
    }

    @Override // defpackage.bbd
    public Object D(Object obj, yy7 yy7Var) {
        return kaj.b((SharedPreferences) this.c, (String) this.a, this.b, (ca3) this.d);
    }

    public void E(long j) {
        ((AtomicReference) this.d).updateAndGet(new jx9(j, 3));
    }

    public void F(yyb yybVar) {
        ((AtomicReference) this.d).updateAndGet(new k11(9, yybVar));
    }

    public Object G(CharSequence charSequence, int i, int i2, int i3, boolean z, ub5 ub5Var) {
        int i4;
        char c;
        vp0 vp0Var = new vp0(((hz9) this.b).c, (int[]) this.d);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zR = true;
        int iCharCount = i;
        loop0: while (true) {
            i4 = iCharCount;
            while (iCharCount < i2 && i5 < i3 && zR) {
                SparseArray sparseArray = ((gz9) vp0Var.o).a;
                gz9 gz9Var = sparseArray == null ? null : (gz9) sparseArray.get(iCodePointAt);
                if (vp0Var.a == 2) {
                    if (gz9Var != null) {
                        vp0Var.o = gz9Var;
                        vp0Var.c++;
                    } else {
                        if (iCodePointAt == 65038) {
                            vp0Var.d();
                        } else if (iCodePointAt != 65039) {
                            gz9 gz9Var2 = (gz9) vp0Var.o;
                            if (gz9Var2.b != null) {
                                if (vp0Var.c != 1) {
                                    vp0Var.X = gz9Var2;
                                    vp0Var.d();
                                } else if (vp0Var.e()) {
                                    vp0Var.X = (gz9) vp0Var.o;
                                    vp0Var.d();
                                } else {
                                    vp0Var.d();
                                }
                                c = 3;
                            } else {
                                vp0Var.d();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (gz9Var == null) {
                    vp0Var.d();
                    c = 1;
                } else {
                    vp0Var.a = 2;
                    vp0Var.o = gz9Var;
                    vp0Var.c = 1;
                    c = 2;
                }
                vp0Var.b = iCodePointAt;
                if (c == 1) {
                    iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (iCharCount < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                } else if (c == 2) {
                    int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                    if (iCharCount2 < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                    iCharCount = iCharCount2;
                } else if (c == 3) {
                    if (z || !w(charSequence, i4, iCharCount, ((gz9) vp0Var.X).b)) {
                        zR = ub5Var.r(charSequence, i4, iCharCount, ((gz9) vp0Var.X).b);
                        i5++;
                    }
                }
            }
            break loop0;
        }
        if (vp0Var.a == 2 && ((gz9) vp0Var.o).b != null && ((vp0Var.c > 1 || vp0Var.e()) && i5 < i3 && zR && (z || !w(charSequence, i4, iCharCount, ((gz9) vp0Var.o).b)))) {
            ub5Var.r(charSequence, i4, iCharCount, ((gz9) vp0Var.o).b);
        }
        return ub5Var.d();
    }

    public void H(u69 u69Var) {
        synchronized (this.a) {
            try {
                dr3 dr3Var = (dr3) ((us) this.c).remove(u69Var);
                if (dr3Var == null) {
                    return;
                }
                ((us) this.b).remove(dr3Var.a);
                dr3Var.b.release();
                o79 o79Var = (o79) ((WeakReference) this.d).get();
                if (o79Var == null || o79Var.j()) {
                    return;
                }
                zxg.a0(o79Var.l, new ar3(o79Var, u69Var, 0));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.dbd
    public void O(Object obj, yy7 yy7Var, Object obj2) {
        SharedPreferences.Editor editorEdit = ((SharedPreferences) this.c).edit();
        kaj.c(editorEdit, (String) this.a, obj2);
        editorEdit.apply();
    }

    public void a(Object obj, u69 u69Var, bie bieVar, o3c o3cVar) {
        synchronized (this.a) {
            try {
                u69 u69VarQ = q(obj);
                if (u69VarQ == null) {
                    ((us) this.b).put(obj, u69Var);
                    ((us) this.c).put(u69Var, new dr3(obj, new dy(), bieVar, o3cVar));
                } else {
                    dr3 dr3Var = (dr3) ((us) this.c).get(u69VarQ);
                    hsi.h(dr3Var);
                    dr3Var.d = bieVar;
                    dr3Var.e = o3cVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(u69 u69Var, int i, cr3 cr3Var) {
        synchronized (this.a) {
            try {
                dr3 dr3Var = (dr3) ((us) this.c).get(u69Var);
                if (dr3Var != null) {
                    o3c o3cVar = dr3Var.g;
                    o3cVar.getClass();
                    y16 y16Var = new y16(1);
                    y16Var.b(o3cVar.a);
                    y16Var.a(i);
                    dr3Var.g = new o3c(y16Var.e());
                    dr3Var.c.add(cr3Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public f90 c() {
        if (!"".isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(""));
        }
        int iIntValue = ((Integer) this.a).intValue();
        int iIntValue2 = ((Integer) this.b).intValue();
        int iIntValue3 = ((Integer) this.c).intValue();
        int iIntValue4 = ((Integer) this.d).intValue();
        f90 f90Var = new f90(iIntValue, iIntValue2, iIntValue3, iIntValue4);
        String strI = iIntValue == -1 ? " audioSource" : "";
        if (iIntValue2 <= 0) {
            strI = strI.concat(" sampleRate");
        }
        if (iIntValue3 <= 0) {
            strI = az1.i(strI, " channelCount");
        }
        if (iIntValue4 == -1) {
            strI = az1.i(strI, " audioFormat");
        }
        if (strI.isEmpty()) {
            return f90Var;
        }
        throw new IllegalArgumentException("Required settings missing or non-positive:".concat(strI));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.sk0[] d(android.os.Handler r12, defpackage.xl5 r13, defpackage.xl5 r14, defpackage.xl5 r15, defpackage.xl5 r16) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fde.d(android.os.Handler, xl5, xl5, xl5, xl5):sk0[]");
    }

    @Override // defpackage.nhh
    public void dispose() {
        bj bjVar = (bj) this.d;
        lda ldaVar = (lda) this.c;
        SparseArray sparseArray = (SparseArray) bjVar.c;
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            if (((lda) sparseArray.valueAt(size)) == ldaVar) {
                sparseArray.removeAt(size);
            }
        }
    }

    public void f(dr3 dr3Var) {
        o79 o79Var = (o79) ((WeakReference) this.d).get();
        if (o79Var == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        while (atomicBoolean.get()) {
            atomicBoolean.set(false);
            cr3 cr3Var = (cr3) dr3Var.c.poll();
            if (cr3Var == null) {
                dr3Var.f = false;
                return;
            }
            AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
            dr3 dr3Var2 = dr3Var;
            zxg.a0(o79Var.l, new k79(o79Var, q(dr3Var.a), new ev1(this, cr3Var, atomicBoolean2, dr3Var2, atomicBoolean, 1)));
            atomicBoolean2.set(false);
            dr3Var = dr3Var2;
        }
    }

    @Override // defpackage.fvf
    public int g() {
        gdb gdbVar = (gdb) this.c;
        if ((((cdb) ((i40) this.a).d).o.a & 1) != 0) {
            return gdbVar.getMeasuredHeight();
        }
        return u45.q(12, vw4.d().getDisplayMetrics().density, ((gvf) this.d).getMeasuredHeight() - gdbVar.getMeasuredHeight());
    }

    @Override // defpackage.fvf
    public int h() {
        gdb gdbVar = (gdb) this.c;
        return (((cdb) ((i40) this.a).d).o.a & 1) != 0 ? gdbVar.getBottom() : gdbVar.getTop();
    }

    @Override // defpackage.nhh
    public int i(int i) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        int iIndexOfKey = sparseIntArray.indexOfKey(i);
        if (iIndexOfKey >= 0) {
            return sparseIntArray.valueAt(iIndexOfKey);
        }
        StringBuilder sbM = ho7.m(i, "requested global type ", " does not belong to the adapter:");
        sbM.append(((lda) this.c).c);
        throw new IllegalStateException(sbM.toString());
    }

    @Override // defpackage.fvf
    public void j() {
        Handler handler = icb.a;
        icb.b((fcb) ((i40) this.a).h, ecb.b);
    }

    @Override // defpackage.nhh
    public int k(int i) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.a;
        int iIndexOfKey = sparseIntArray.indexOfKey(i);
        if (iIndexOfKey > -1) {
            return sparseIntArray.valueAt(iIndexOfKey);
        }
        bj bjVar = (bj) this.d;
        lda ldaVar = (lda) this.c;
        int i2 = bjVar.b;
        bjVar.b = i2 + 1;
        ((SparseArray) bjVar.c).put(i2, ldaVar);
        sparseIntArray.put(i, i2);
        ((SparseIntArray) this.b).put(i2, i);
        return i2;
    }

    public void l(final u69 u69Var) {
        synchronized (this.a) {
            try {
                dr3 dr3Var = (dr3) ((us) this.c).get(u69Var);
                if (dr3Var == null) {
                    return;
                }
                final o3c o3cVar = dr3Var.g;
                dr3Var.g = o3c.b;
                dr3Var.c.add(new cr3(u69Var, o3cVar) { // from class: br3
                    public final /* synthetic */ u69 b;

                    @Override // defpackage.cr3
                    public final ha8 run() {
                        o79 o79Var = (o79) ((WeakReference) this.a.d).get();
                        if (o79Var != null) {
                            o79Var.q(this.b);
                        }
                        return bg7.b;
                    }
                });
                if (dr3Var.f) {
                    return;
                }
                dr3Var.f = true;
                f(dr3Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.fvf
    public View m() {
        return (gdb) this.c;
    }

    public o3c n(u69 u69Var) {
        synchronized (this.a) {
            try {
                dr3 dr3Var = (dr3) ((us) this.c).get(u69Var);
                if (dr3Var == null) {
                    return null;
                }
                return dr3Var.e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.fvf
    public int o() {
        if ((((cdb) ((i40) this.a).d).o.a & 1) != 0) {
            return 0;
        }
        return ((gvf) this.d).getMeasuredHeight();
    }

    @Override // defpackage.fvf
    public void onDismiss() {
        i40 i40Var = (i40) this.a;
        ViewGroup viewGroup = (ViewGroup) ((WeakReference) i40Var.c).get();
        if (viewGroup != null) {
            viewGroup.post(new k79(i40Var, 18, (uid) this.b));
        }
        Handler handler = icb.a;
        fcb fcbVar = (fcb) i40Var.h;
        AtomicBoolean atomicBoolean = icb.d;
        if (atomicBoolean.compareAndSet(false, true)) {
            hcb hcbVar = icb.b;
            if (hcbVar != null ? fni.a(hcbVar.b.get(), fcbVar) : false) {
                icb.b = null;
                if (icb.c != null) {
                    icb.d();
                }
            }
            atomicBoolean.set(false);
        }
    }

    public wg7 p() {
        wg7 wg7VarJ;
        synchronized (this.a) {
            wg7VarJ = wg7.j(((us) this.b).values());
        }
        return wg7VarJ;
    }

    public u69 q(Object obj) {
        u69 u69Var;
        synchronized (this.a) {
            u69Var = (u69) ((us) this.b).get(obj);
        }
        return u69Var;
    }

    public Set r() {
        return (Set) ((AtomicReference) this.d).get();
    }

    public PlaybackException s(u69 u69Var) {
        synchronized (this.a) {
            try {
                return ((dr3) ((us) this.c).get(u69Var)) != null ? null : null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public q4c t(u69 u69Var) {
        synchronized (this.a) {
            try {
                return ((dr3) ((us) this.c).get(u69Var)) != null ? null : null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d4, code lost:
    
        if (r0 == r15) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00d4 -> B:42:0x00d7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable u(defpackage.q44 r17) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fde.u(q44):java.io.Serializable");
    }

    public dy v(u69 u69Var) {
        dr3 dr3Var;
        synchronized (this.a) {
            dr3Var = (dr3) ((us) this.c).get(u69Var);
        }
        if (dr3Var != null) {
            return dr3Var.b;
        }
        return null;
    }

    public boolean w(CharSequence charSequence, int i, int i2, zog zogVar) {
        if ((zogVar.c & 3) == 0) {
            qa5 qa5Var = (qa5) this.c;
            zy9 zy9VarB = zogVar.b();
            int iA = zy9VarB.a(8);
            if (iA != 0) {
                ((ByteBuffer) zy9VarB.d).getShort(iA + zy9VarB.a);
            }
            sm4 sm4Var = (sm4) qa5Var;
            sm4Var.getClass();
            ThreadLocal threadLocal = sm4.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = sm4Var.a;
            String string = sb.toString();
            int i3 = hmb.a;
            boolean zA = gmb.a(textPaint, string);
            int i4 = zogVar.c & 4;
            zogVar.c = zA ? i4 | 2 : i4 | 1;
        }
        return (zogVar.c & 3) == 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object x(long r27, java.lang.String r29, defpackage.dx0 r30, defpackage.yw0 r31, defpackage.q44 r32) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fde.x(long, java.lang.String, dx0, yw0, q44):java.lang.Object");
    }

    public boolean y(u69 u69Var) {
        boolean z;
        synchronized (this.a) {
            z = ((us) this.c).get(u69Var) != null;
        }
        return z;
    }

    public boolean z(u69 u69Var, int i) {
        dr3 dr3Var;
        synchronized (this.a) {
            dr3Var = (dr3) ((us) this.c).get(u69Var);
        }
        o79 o79Var = (o79) ((WeakReference) this.d).get();
        return dr3Var != null && dr3Var.e.a(i) && o79Var != null && o79Var.t.z().a(i);
    }

    public fde(k18 k18Var, k18 k18Var2, Set set) {
        this.b = k18Var2;
        this.a = set;
        this.c = k18Var;
        AtomicReference atomicReference = new AtomicReference(rd5.a);
        this.d = atomicReference;
        if (set.isEmpty()) {
            return;
        }
        atomicReference.updateAndGet(new j11(this, 3, new LinkedHashSet(set.size())));
    }

    public /* synthetic */ fde(k18 k18Var, k18 k18Var2, int i) {
        this(k18Var, (i & 2) != 0 ? null : k18Var2, rd5.a);
    }

    public fde(o79 o79Var) {
        this.b = new us(0);
        this.c = new us(0);
        this.a = new Object();
        this.d = new WeakReference(o79Var);
    }
}
