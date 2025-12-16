package defpackage;

import android.os.Handler;
import android.os.Message;
import android.widget.SeekBar;
import androidx.mediarouter.app.d;
import androidx.mediarouter.app.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class f69 extends Handler {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ h69 c;

    public f69(h69 h69Var) {
        this.c = h69Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0020. Please report as an issue. */
    public static void a(e69 e69Var, int i, Object obj) {
        y6i y6iVarB;
        y59 y59Var;
        e eVar;
        l69 l69Var = e69Var.a;
        t49 t49Var = e69Var.b;
        int i2 = 65280 & i;
        if (i2 != 256) {
            if (i2 != 512) {
                if (i2 == 768 && i == 769) {
                    if (obj != null) {
                        throw new ClassCastException();
                    }
                    switch (t49Var.a) {
                    }
                    return;
                }
                return;
            }
            switch (i) {
                case 513:
                    switch (t49Var.a) {
                        case 0:
                            ((v49) t49Var.b).b();
                            return;
                        default:
                            return;
                    }
                case 514:
                    switch (t49Var.a) {
                        case 0:
                            ((v49) t49Var.b).b();
                            return;
                        default:
                            return;
                    }
                case 515:
                    switch (t49Var.a) {
                        case 0:
                            ((v49) t49Var.b).b();
                            return;
                        default:
                            return;
                    }
                default:
                    return;
            }
        }
        k69 k69Var = (i == 264 || i == 262) ? (k69) ((kmb) obj).b : (k69) obj;
        if (i == 264 || i == 262) {
        }
        if (k69Var != null) {
            if ((e69Var.d & 2) == 0 && !k69Var.h(e69Var.c)) {
                l69.c();
                return;
            }
            switch (i) {
                case 257:
                    switch (t49Var.a) {
                        case 0:
                            ((v49) t49Var.b).b();
                            return;
                        case 1:
                            ((x49) t49Var.b).f();
                            return;
                        case 2:
                        default:
                            return;
                        case 3:
                            ((o59) t49Var.b).f();
                            return;
                        case 4:
                            ((x59) t49Var.b).n();
                            return;
                    }
                case 258:
                    switch (t49Var.a) {
                        case 0:
                            ((v49) t49Var.b).b();
                            return;
                        case 1:
                            ((x49) t49Var.b).f();
                            return;
                        case 2:
                        default:
                            return;
                        case 3:
                            ((o59) t49Var.b).f();
                            return;
                        case 4:
                            ((x59) t49Var.b).n();
                            return;
                    }
                case 259:
                    switch (t49Var.a) {
                        case 0:
                            ((v49) t49Var.b).b();
                            return;
                        case 1:
                            ((x49) t49Var.b).f();
                            return;
                        case 2:
                            ((d) t49Var.b).r(true);
                            return;
                        case 3:
                            ((o59) t49Var.b).f();
                            return;
                        default:
                            x59 x59Var = (x59) t49Var.b;
                            if (k69Var == x59Var.s0 && k69.a() != null) {
                                j69 j69Var = k69Var.a;
                                j69Var.getClass();
                                l69.b();
                                for (k69 k69Var2 : Collections.unmodifiableList(j69Var.b)) {
                                    if (!Collections.unmodifiableList(x59Var.s0.u).contains(k69Var2) && (y6iVarB = x59Var.s0.b(k69Var2)) != null && (y59Var = (y59) y6iVarB.b) != null && y59Var.d && !x59Var.u0.contains(k69Var2)) {
                                        x59Var.o();
                                        x59Var.m();
                                        return;
                                    }
                                }
                            }
                            x59Var.n();
                            return;
                    }
                case 260:
                    switch (t49Var.a) {
                        case 2:
                            d dVar = (d) t49Var.b;
                            SeekBar seekBar = (SeekBar) dVar.a1.get(k69Var);
                            int i3 = k69Var.o;
                            if (d.y1) {
                                u45.o(i3, "onRouteVolumeChanged(), route.getVolume:", "MediaRouteCtrlDialog");
                            }
                            if (seekBar == null || dVar.V0 == k69Var) {
                                return;
                            }
                            seekBar.setProgress(i3);
                            return;
                        case 3:
                        default:
                            return;
                        case 4:
                            int i4 = k69Var.o;
                            if (x59.d1) {
                                u45.o(i4, "onRouteVolumeChanged(), route.getVolume:", "MediaRouteCtrlDialog");
                            }
                            x59 x59Var2 = (x59) t49Var.b;
                            if (x59Var2.G0 == k69Var || (eVar = (e) x59Var2.F0.get(k69Var.c)) == null) {
                                return;
                            }
                            int i5 = eVar.E0.o;
                            eVar.A(i5 == 0);
                            eVar.G0.setProgress(i5);
                            return;
                    }
                case 261:
                    t49Var.getClass();
                    return;
                case 262:
                    t49Var.h(k69Var);
                    return;
                case 263:
                    switch (t49Var.a) {
                        case 0:
                            ((v49) t49Var.b).b();
                            return;
                        case 1:
                        case 3:
                        default:
                            return;
                        case 2:
                            ((d) t49Var.b).r(false);
                            return;
                        case 4:
                            ((x59) t49Var.b).n();
                            return;
                    }
                case 264:
                    t49Var.h(k69Var);
                    return;
                default:
                    return;
            }
        }
    }

    public final void b(int i, Object obj) {
        obtainMessage(i, obj).sendToTarget();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int iL;
        ArrayList arrayList = this.a;
        h69 h69Var = this.c;
        ArrayList arrayList2 = h69Var.f;
        int i = message.what;
        Object obj = message.obj;
        if (i == 259 && h69Var.e().c.equals(((k69) obj).c)) {
            h69Var.m(true);
        }
        ArrayList arrayList3 = this.b;
        if (i == 262) {
            k69 k69Var = (k69) ((kmb) obj).b;
            h69Var.c.r(k69Var);
            if (h69Var.p != null && k69Var.d()) {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    h69Var.c.q((k69) it.next());
                }
                arrayList3.clear();
            }
        } else if (i != 264) {
            switch (i) {
                case 257:
                    h69Var.c.p((k69) obj);
                    break;
                case 258:
                    h69Var.c.q((k69) obj);
                    break;
                case 259:
                    exf exfVar = h69Var.c;
                    k69 k69Var2 = (k69) obj;
                    exfVar.getClass();
                    if (k69Var2.c() != exfVar && (iL = exfVar.l(k69Var2)) >= 0) {
                        exfVar.w((hxf) exfVar.B0.get(iL));
                        break;
                    }
                    break;
            }
        } else {
            k69 k69Var3 = (k69) ((kmb) obj).b;
            arrayList3.add(k69Var3);
            h69Var.c.p(k69Var3);
            h69Var.c.r(k69Var3);
        }
        try {
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size < 0) {
                    int size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        a((e69) arrayList.get(i2), i, obj);
                    }
                    arrayList.clear();
                    return;
                }
                l69 l69Var = (l69) ((WeakReference) arrayList2.get(size)).get();
                if (l69Var == null) {
                    arrayList2.remove(size);
                } else {
                    arrayList.addAll(l69Var.b);
                }
            }
        } catch (Throwable th) {
            arrayList.clear();
            throw th;
        }
    }
}
