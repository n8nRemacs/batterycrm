package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
import java.util.WeakHashMap;
import java.util.zip.ZipEntry;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class s55 implements Comparator {
    public final /* synthetic */ int a;
    public static final s55 b = new s55(0);
    public static final s55 c = new s55(1);
    public static final s55 d = new s55(2);
    public static final s55 o = new s55(3);
    public static final s55 X = new s55(4);
    public static final /* synthetic */ s55 Y = new s55(5);
    public static final /* synthetic */ s55 Z = new s55(6);

    public /* synthetic */ s55(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                y55 y55Var = (y55) obj;
                y55 y55Var2 = (y55) obj2;
                String str = y55Var2.a;
                String str2 = y55Var2.b;
                int iCompareTo = y55Var.a.compareTo(str);
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = y55Var.b.compareTo(str2);
                if (iCompareTo2 != 0) {
                    return iCompareTo2;
                }
                return 0;
            case 1:
                return ((k69) obj).d.compareToIgnoreCase(((k69) obj2).d);
            case 2:
                return ((k69) obj).d.compareToIgnoreCase(((k69) obj2).d);
            case 3:
                return ((k69) obj).d.compareToIgnoreCase(((k69) obj2).d);
            case 4:
                kc9 kc9Var = (kc9) obj;
                kc9 kc9Var2 = (kc9) obj2;
                boolean z = kc9Var.t0;
                boolean z2 = kc9Var2.t0;
                if (z != z2) {
                    return Boolean.compare(z2, z);
                }
                boolean z3 = kc9Var.s0;
                boolean z4 = kc9Var2.s0;
                return z3 != z4 ? Boolean.compare(z4, z3) : fni.c(kc9Var2.X, kc9Var.X);
            case 5:
                return ((Scope) obj).b.compareTo(((Scope) obj2).b);
            case 6:
                qt5 qt5Var = (qt5) obj;
                qt5 qt5Var2 = (qt5) obj2;
                return !qt5Var.a.equals(qt5Var2.a) ? qt5Var.a.compareTo(qt5Var2.a) : (qt5Var.b() > qt5Var2.b() ? 1 : (qt5Var.b() == qt5Var2.b() ? 0 : -1));
            case 7:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
            case 8:
                throw null;
            case 9:
                return b5j.b(((fm) obj).a, ((fm) obj2).a);
            case 10:
                return Integer.compare(((bq0) obj).a, ((bq0) obj2).a);
            case 11:
                return b5j.b(Long.valueOf(((v71) obj2).a), Long.valueOf(((v71) obj).a));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return b5j.b(Boolean.valueOf(((hh1) obj).d), Boolean.valueOf(((hh1) obj2).d));
            case 13:
                return b5j.b(Boolean.valueOf(((hh1) obj).X), Boolean.valueOf(((hh1) obj2).X));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return b5j.b(((ZipEntry) obj).getName(), ((ZipEntry) obj2).getName());
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return b5j.b(Long.valueOf(((gl9) obj).i), Long.valueOf(((gl9) obj2).i));
            case 16:
                return b5j.b(Long.valueOf(((gl9) obj).i), Long.valueOf(((gl9) obj2).i));
            case LangUtils.HASH_SEED /* 17 */:
                return b5j.b(Long.valueOf(((hs2) obj2).w0), Long.valueOf(((hs2) obj).w0));
            case 18:
                return b5j.b(Boolean.valueOf(((xx3) obj2).Z), Boolean.valueOf(((xx3) obj).Z));
            case 19:
                String str3 = (String) obj;
                String str4 = (String) obj2;
                int iMin = Math.min(str3.length(), str4.length());
                int i = 4;
                while (true) {
                    if (i >= iMin) {
                        int length = str3.length();
                        int length2 = str4.length();
                        if (length == length2) {
                            return 0;
                        }
                        if (length >= length2) {
                            return 1;
                        }
                    } else {
                        char cCharAt = str3.charAt(i);
                        char cCharAt2 = str4.charAt(i);
                        if (cCharAt == cCharAt2) {
                            i++;
                        } else if (fni.b(cCharAt, cCharAt2) >= 0) {
                            return 1;
                        }
                    }
                }
                return -1;
            case 20:
                return ((cf3) obj2).b() - ((cf3) obj).b();
            case 21:
                WeakHashMap weakHashMap = hfh.a;
                float fM = veh.m((View) obj);
                float fM2 = veh.m((View) obj2);
                if (fM > fM2) {
                    return -1;
                }
                return fM < fM2 ? 1 : 0;
            case 22:
                Thread thread = (Thread) obj;
                Thread thread2 = (Thread) obj2;
                if (fni.a(thread != null ? thread.getName() : null, "main")) {
                    return -1;
                }
                if (fni.a(thread2 != null ? thread2.getName() : null, "main")) {
                    return 1;
                }
                return iv6.o.compare(thread, thread2);
            case 23:
                return b5j.b(Long.valueOf(((g94) obj).a), Long.valueOf(((g94) obj2).a));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return b5j.b(((Thread) obj).getName(), ((Thread) obj2).getName());
            case 25:
                long jA = ((gl4) obj).a();
                long jA2 = ((gl4) obj2).a();
                if (jA < jA2) {
                    return -1;
                }
                return jA2 == jA ? 0 : 1;
            case 26:
                return ((lw4) obj).a - ((lw4) obj2).a;
            case 27:
                return b5j.b(Long.valueOf(((yx4) obj2).a), Long.valueOf(((yx4) obj).a));
            case 28:
                return b5j.b((Long) ((imb) obj).b, (Long) ((imb) obj2).b);
            default:
                vq6 vq6Var = (vq6) obj;
                vq6 vq6Var2 = (vq6) obj2;
                RecyclerView recyclerView = vq6Var.d;
                if ((recyclerView == null) == (vq6Var2.d == null)) {
                    boolean z5 = vq6Var.a;
                    if (z5 == vq6Var2.a) {
                        int i2 = vq6Var2.b - vq6Var.b;
                        if (i2 != 0) {
                            return i2;
                        }
                        int i3 = vq6Var.c - vq6Var2.c;
                        if (i3 != 0) {
                            return i3;
                        }
                        return 0;
                    }
                    if (!z5) {
                        return 1;
                    }
                } else if (recyclerView == null) {
                    return 1;
                }
                return -1;
        }
    }
}
