package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class dce {
    public final sxg h;
    public final h79 i;
    public CharSequence j;
    public int k;
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final Set c = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set d = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set e = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set f = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set g = Collections.newSetFromMap(new ConcurrentHashMap());
    public final CopyOnWriteArraySet l = new CopyOnWriteArraySet();

    public dce(sxg sxgVar, h79 h79Var) {
        this.h = sxgVar;
        this.i = h79Var;
        if (sxgVar.g.getBoolean("app.send.media.as.collage", true)) {
            this.k = 3;
        } else {
            this.k = 1;
        }
    }

    public static boolean k(pd8 pd8Var, fce fceVar) {
        pd8 pd8Var2 = fceVar.a;
        if (pd8Var2 == null || pd8Var == null) {
            return false;
        }
        if ((pd8Var instanceof g00) && (pd8Var2 instanceof g00)) {
            return l8g.a(((g00) pd8Var).t0.r, ((g00) pd8Var2).t0.r);
        }
        if (pd8Var2.b == pd8Var.b) {
            return true;
        }
        return goi.a(pd8Var.c(), pd8Var2.c());
    }

    public final int a(pd8 pd8Var, int i) {
        RuntimeException runtimeException;
        boolean zJ = j(pd8Var);
        CopyOnWriteArraySet copyOnWriteArraySet = this.a;
        if (zJ) {
            return copyOnWriteArraySet.size();
        }
        fce fceVarH = h(pd8Var);
        if (fceVarH != null) {
            fceVarH.f = true;
            return g(pd8Var);
        }
        fce fceVar = new fce(pd8Var);
        fceVar.c = (zub) this.b.get(Long.valueOf(pd8Var.b));
        Set set = this.e;
        if (i < 0 || i >= copyOnWriteArraySet.size()) {
            copyOnWriteArraySet.add(fceVar);
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    try {
                        ((kq6) it.next()).b(fceVar);
                    } finally {
                    }
                }
            }
            n();
            return copyOnWriteArraySet.size();
        }
        ArrayList arrayList = new ArrayList(copyOnWriteArraySet);
        arrayList.add(i, fceVar);
        copyOnWriteArraySet.clear();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            fce fceVar2 = (fce) it2.next();
            copyOnWriteArraySet.add(fceVar2);
            if (set != null) {
                Iterator it3 = set.iterator();
                while (it3.hasNext()) {
                    try {
                        ((kq6) it3.next()).b(fceVar2);
                    } finally {
                    }
                }
            }
            n();
        }
        return i + 1;
    }

    public final int b() {
        return c().size();
    }

    public final List c() {
        CopyOnWriteArraySet copyOnWriteArraySet = this.a;
        if (copyOnWriteArraySet != null && copyOnWriteArraySet.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                if (((fce) next).f) {
                    arrayList.add(next);
                }
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        return arrayList;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            fce fceVar = (fce) it.next();
            boolean z = fceVar.f;
            pd8 pd8Var = fceVar.a;
            if (z) {
                if (!(pd8Var instanceof g00) || zub.b(fceVar.c, pd8Var)) {
                    String strF = f(fceVar);
                    if (strF != null) {
                        int i = pd8Var.a;
                        if (this.k == 2) {
                            i = 7;
                        }
                        arrayList.add(new l1f(i, strF));
                    } else {
                        arrayList.add(l(fceVar));
                    }
                } else {
                    arrayList.add(new h00(pd8Var.a, pd8Var.a(), ((g00) pd8Var).t0));
                }
            }
        }
        return arrayList;
    }

    public final zub e(pd8 pd8Var) {
        fce fceVarH = h(pd8Var);
        zub zubVar = fceVarH != null ? fceVarH.c : null;
        if (zubVar == null) {
            return (zub) this.b.get(Long.valueOf(pd8Var.b));
        }
        return zubVar;
    }

    public final String f(fce fceVar) {
        zub zubVar = fceVar.c;
        Uri uri = zubVar != null ? zubVar.o : null;
        Uri uri2 = zubVar != null ? zubVar.b : null;
        Uri uri3 = zubVar != null ? zubVar.a : null;
        if (uri == null) {
            if (uri2 != null) {
                return uri2.getPath();
            }
            if (uri3 != null) {
                return uri3.getPath();
            }
            return null;
        }
        Uri uriA = zub.a(zubVar, fceVar.a);
        try {
            h79 h79Var = this.i;
            Bitmap bitmapY = h79Var.y(uriA, true);
            Bitmap bitmapY2 = h79Var.y(uri, false);
            Canvas canvas = new Canvas(bitmapY);
            float width = bitmapY.getWidth() / bitmapY2.getWidth();
            canvas.scale(width, width);
            canvas.drawBitmap(bitmapY2, 0.0f, 0.0f, (Paint) null);
            File fileA = ((qx5) h79Var.c).a("jpg");
            tfi.m(fileA.getAbsolutePath(), bitmapY, 100, Bitmap.CompressFormat.JPEG);
            return fileA.getAbsolutePath();
        } catch (Exception e) {
            wqi.e("dce", "getMediasForSend: exception", e);
            return uriA.toString();
        }
    }

    public final int g(pd8 pd8Var) {
        if (!j(pd8Var)) {
            return 0;
        }
        Iterator it = this.a.iterator();
        int i = 1;
        while (it.hasNext()) {
            fce fceVar = (fce) it.next();
            if (fceVar.f) {
                if (k(pd8Var, fceVar)) {
                    break;
                }
                i++;
            }
        }
        return i;
    }

    public final fce h(pd8 pd8Var) {
        Object next;
        CopyOnWriteArraySet copyOnWriteArraySet = this.a;
        if (copyOnWriteArraySet == null) {
            next = null;
        } else {
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                next = it.next();
                try {
                    if (k(pd8Var, (fce) next)) {
                        break;
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            next = null;
        }
        return (fce) next;
    }

    public final fce i(int i) {
        List list;
        CopyOnWriteArraySet copyOnWriteArraySet = this.a;
        if (copyOnWriteArraySet == null || !copyOnWriteArraySet.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                try {
                    if (((fce) next).f) {
                        arrayList.add(next);
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            list = arrayList;
        } else {
            list = Collections.EMPTY_LIST;
        }
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return (fce) list.get(i);
    }

    public final boolean j(pd8 pd8Var) {
        CopyOnWriteArraySet<fce> copyOnWriteArraySet = this.a;
        if (copyOnWriteArraySet != null && copyOnWriteArraySet.isEmpty()) {
            return false;
        }
        for (fce fceVar : copyOnWriteArraySet) {
            try {
                if (fceVar.f && k(pd8Var, fceVar)) {
                    return true;
                }
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        return false;
    }

    public final l1f l(fce fceVar) {
        int i;
        pd8 pd8Var = fceVar.a;
        if (this.k != 2 && (i = pd8Var.a) == 3 && fceVar.b != null) {
            return new y4h(i, pd8Var.a(), fceVar.b, l8g.c(fceVar.d) ? pd8Var.d : fceVar.d);
        }
        int i2 = pd8Var.a;
        String strA = pd8Var.a();
        if (this.k == 2) {
            i2 = 7;
        }
        return new l1f(i2, strA);
    }

    public final void m(fce fceVar) {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((ace) it.next()).R(fceVar);
        }
    }

    public final void n() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((bce) it.next()).X(Collections.unmodifiableSet(this.a));
        }
    }

    public final void o(pd8 pd8Var, File file) {
        a(pd8Var, this.a.size());
        fce fceVarH = h(pd8Var);
        if (fceVarH == null) {
            return;
        }
        pd8 pd8Var2 = fceVarH.a;
        if (pd8Var2 instanceof g00) {
            g00 g00Var = (g00) pd8Var2;
            g00Var.getClass();
            wqi.c("g00", "Set downloaded file " + file.getPath(), new Object[0]);
            g00Var.w0 = file;
            String str = g00Var.t0.s;
            if (str == null || str.length() == 0) {
                x00 x00VarI = g00Var.t0.i();
                x00VarI.m = file.getPath();
                g00Var.t0 = x00VarI.a();
            }
        }
        m(fceVarH);
    }

    public final void p(int i) {
        if (b() > 1) {
            sxg sxgVar = this.h;
            if (i == 3) {
                sxgVar.f("app.send.media.as.collage", true);
            } else if (i == 1) {
                sxgVar.f("app.send.media.as.collage", false);
            }
        }
        this.k = i;
        for (eaa eaaVar : this.d) {
            int i2 = this.k;
            pd8 pd8Var = eaaVar.o;
            if (pd8Var != null) {
                int i3 = pd8Var.a;
                if (i2 == 2) {
                    if (i3 == 1) {
                        eaaVar.P0(new lz1(7));
                    } else if (pd8Var.b()) {
                        eaaVar.P0(new lz1(8));
                    }
                } else if (i3 == 1) {
                    eaaVar.P0(new lz1(9));
                } else if (pd8Var.b()) {
                    eaaVar.P0(new lz1(10));
                }
            }
        }
    }

    public final void q(pd8 pd8Var, p2h p2hVar) {
        a(pd8Var, this.a.size());
        fce fceVarH = h(pd8Var);
        if (fceVarH != null) {
            fceVarH.b = p2hVar;
        }
        m(fceVarH);
    }

    public final int r(pd8 pd8Var) {
        int iA;
        RuntimeException runtimeException;
        fce fceVar;
        CopyOnWriteArraySet copyOnWriteArraySet = this.l;
        if (copyOnWriteArraySet != null) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                try {
                    ((xp6) it.next()).a(cce.a);
                } finally {
                }
            }
        }
        CopyOnWriteArraySet copyOnWriteArraySet2 = this.a;
        int size = copyOnWriteArraySet2.size();
        boolean zJ = j(pd8Var);
        Set set = this.e;
        if (zJ) {
            Iterator it2 = copyOnWriteArraySet2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    fceVar = null;
                    break;
                }
                fceVar = (fce) it2.next();
                if (k(pd8Var, fceVar)) {
                    copyOnWriteArraySet2.remove(fceVar);
                    break;
                }
            }
            if (fceVar != null && set != null) {
                Iterator it3 = set.iterator();
                while (it3.hasNext()) {
                    try {
                        ((kq6) it3.next()).a(fceVar);
                    } finally {
                    }
                }
            }
            n();
            if (fceVar != null && !pd8Var.c.equals(zub.a(fceVar.c, pd8Var).toString())) {
                m(fceVar);
            }
            iA = 0;
        } else {
            fce fceVarH = h(pd8Var);
            if (fceVarH != null) {
                copyOnWriteArraySet2.remove(fceVarH);
                copyOnWriteArraySet2.add(fceVarH);
                fceVarH.f = true;
                if (set != null) {
                    Iterator it4 = set.iterator();
                    while (it4.hasNext()) {
                        try {
                            ((kq6) it4.next()).b(fceVarH);
                        } finally {
                        }
                    }
                }
                n();
                iA = g(pd8Var);
            } else {
                iA = a(pd8Var, size);
            }
        }
        if (copyOnWriteArraySet != null) {
            Iterator it5 = copyOnWriteArraySet.iterator();
            while (it5.hasNext()) {
                try {
                    ((xp6) it5.next()).a(cce.b);
                } finally {
                }
            }
        }
        return iA;
    }
}
