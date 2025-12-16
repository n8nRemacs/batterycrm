package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class bg3 {
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public final aie a;
    public final int b;
    public final int c;
    public final int d;
    public final Uri e;
    public final CharSequence f;
    public final Bundle g;
    public final rg7 h;
    public final boolean i;

    static {
        String str = zxg.a;
        j = Integer.toString(0, 36);
        k = Integer.toString(1, 36);
        l = Integer.toString(2, 36);
        m = Integer.toString(3, 36);
        n = Integer.toString(4, 36);
        o = Integer.toString(5, 36);
        p = Integer.toString(6, 36);
        q = Integer.toString(7, 36);
        r = Integer.toString(8, 36);
    }

    public bg3(aie aieVar, int i, int i2, int i3, Uri uri, CharSequence charSequence, Bundle bundle, boolean z, rg7 rg7Var) {
        this.a = aieVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = uri;
        this.f = charSequence;
        this.g = new Bundle(bundle);
        this.i = z;
        this.h = rg7Var;
    }

    public static boolean a(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (((bg3) list.get(i2)).h.a(0) == i) {
                return true;
            }
        }
        return false;
    }

    public static zjd c(List list, bie bieVar, o3c o3cVar) {
        int i;
        tg7 tg7Var = new tg7(4);
        for (int i2 = 0; i2 < list.size(); i2++) {
            bg3 bg3Var = (bg3) list.get(i2);
            aie aieVar = bg3Var.a;
            if ((aieVar == null || !bieVar.a.contains(aieVar)) && ((i = bg3Var.b) == -1 || !o3cVar.a(i))) {
                if (bg3Var.i) {
                    bg3Var = new bg3(bg3Var.a, bg3Var.b, bg3Var.c, bg3Var.d, bg3Var.e, bg3Var.f, new Bundle(bg3Var.g), false, bg3Var.h);
                }
                tg7Var.a(bg3Var);
            } else {
                tg7Var.a(bg3Var);
            }
        }
        return tg7Var.i();
    }

    public static bg3 d(int i, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(j);
        aie aieVarA = bundle2 == null ? null : aie.a(bundle2);
        int i2 = bundle.getInt(k, -1);
        int i3 = bundle.getInt(l, 0);
        CharSequence charSequence = bundle.getCharSequence(m, "");
        Bundle bundle3 = bundle.getBundle(n);
        boolean z = i < 3 || bundle.getBoolean(o, true);
        Uri uri = (Uri) bundle.getParcelable(p);
        int i4 = bundle.getInt(q, 0);
        int[] intArray = bundle.getIntArray(r);
        ag3 ag3Var = new ag3(i4, i3);
        if (aieVarA != null) {
            hsi.a("playerCommands is already set. Only one of sessionCommand and playerCommand should be set.", ag3Var.c == -1);
            ag3Var.b = aieVarA;
        }
        if (i2 != -1) {
            ag3Var.c(i2);
        }
        if (uri != null && (Objects.equals(uri.getScheme(), "content") || Objects.equals(uri.getScheme(), "android.resource"))) {
            ag3Var.b(uri);
        }
        ag3Var.f = charSequence;
        if (bundle3 == null) {
            bundle3 = Bundle.EMPTY;
        }
        ag3Var.g = new Bundle(bundle3);
        ag3Var.h = z;
        if (intArray == null) {
            intArray = new int[]{6};
        }
        hsi.b(intArray.length != 0);
        rg7 rg7Var = rg7.c;
        ag3Var.i = intArray.length == 0 ? rg7.c : new rg7(Arrays.copyOf(intArray, intArray.length));
        return ag3Var.a();
    }

    public static zjd e(List list, boolean z, boolean z2) {
        aie aieVar;
        aie aieVar2;
        int iA;
        if (list.isEmpty()) {
            t76 t76Var = wg7.b;
            return zjd.o;
        }
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < list.size(); i3++) {
            bg3 bg3Var = (bg3) list.get(i3);
            boolean z3 = bg3Var.i;
            rg7 rg7Var = bg3Var.h;
            if (z3 && (aieVar2 = bg3Var.a) != null && aieVar2.a == 0) {
                int i4 = 0;
                while (true) {
                    if (i4 >= rg7Var.b || (iA = rg7Var.a(i4)) == 6) {
                        break;
                    }
                    if (z && i == -1 && iA == 2) {
                        i = i3;
                        break;
                    }
                    if (z2 && i2 == -1 && iA == 3) {
                        i2 = i3;
                        break;
                    }
                    i4++;
                }
            }
        }
        tg7 tg7VarI = wg7.i();
        if (i != -1) {
            tg7VarI.a(((bg3) list.get(i)).b(rg7.b(2)));
        }
        if (i2 != -1) {
            tg7VarI.a(((bg3) list.get(i2)).b(rg7.b(3)));
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            bg3 bg3Var2 = (bg3) list.get(i5);
            if (bg3Var2.i && (aieVar = bg3Var2.a) != null && aieVar.a == 0 && i5 != i && i5 != i2) {
                rg7 rg7Var2 = bg3Var2.h;
                rg7Var2.getClass();
                int i6 = 0;
                while (true) {
                    if (i6 >= rg7Var2.b) {
                        i6 = -1;
                        break;
                    }
                    if (rg7Var2.a[i6] == 6) {
                        break;
                    }
                    i6++;
                }
                if (i6 >= 0) {
                    tg7VarI.a(bg3Var2.b(rg7.b(6)));
                }
            }
        }
        return tg7VarI.i();
    }

    public static zjd f(List list, o3c o3cVar, Bundle bundle) {
        if (list.isEmpty()) {
            t76 t76Var = wg7.b;
            return zjd.o;
        }
        boolean zA = o3cVar.a.a(7, 6);
        boolean zA2 = o3cVar.a.a(9, 8);
        boolean z = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
        boolean z2 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        int i = (zA || z) ? -1 : 0;
        int i2 = (zA2 || z2) ? -1 : i == 0 ? 1 : 0;
        tg7 tg7VarI = wg7.i();
        for (int i3 = 0; i3 < list.size(); i3++) {
            bg3 bg3Var = (bg3) list.get(i3);
            if (i3 == i) {
                if (i2 == -1) {
                    tg7VarI.a(bg3Var.b(new rg7(new int[]{2, 6})));
                } else {
                    tg7VarI.a(bg3Var.b(new rg7(new int[]{2, 3, 6})));
                }
            } else if (i3 == i2) {
                tg7VarI.a(bg3Var.b(new rg7(new int[]{3, 6})));
            } else {
                tg7VarI.a(bg3Var.b(rg7.b(6)));
            }
        }
        return tg7VarI.i();
    }

    public final bg3 b(rg7 rg7Var) {
        if (this.h.equals(rg7Var)) {
            return this;
        }
        return new bg3(this.a, this.b, this.c, this.d, this.e, this.f, new Bundle(this.g), this.i, rg7Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg3)) {
            return false;
        }
        bg3 bg3Var = (bg3) obj;
        return Objects.equals(this.a, bg3Var.a) && this.b == bg3Var.b && this.c == bg3Var.c && this.d == bg3Var.d && Objects.equals(this.e, bg3Var.e) && TextUtils.equals(this.f, bg3Var.f) && this.i == bg3Var.i && this.h.equals(bg3Var.h);
    }

    public final Bundle g() {
        Bundle bundle = new Bundle();
        aie aieVar = this.a;
        if (aieVar != null) {
            bundle.putBundle(j, aieVar.b());
        }
        int i = this.b;
        if (i != -1) {
            bundle.putInt(k, i);
        }
        int i2 = this.c;
        if (i2 != 0) {
            bundle.putInt(q, i2);
        }
        int i3 = this.d;
        if (i3 != 0) {
            bundle.putInt(l, i3);
        }
        CharSequence charSequence = this.f;
        if (charSequence != "") {
            bundle.putCharSequence(m, charSequence);
        }
        Bundle bundle2 = this.g;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(n, bundle2);
        }
        Uri uri = this.e;
        if (uri != null) {
            bundle.putParcelable(p, uri);
        }
        boolean z = this.i;
        if (!z) {
            bundle.putBoolean(o, z);
        }
        rg7 rg7Var = this.h;
        if (rg7Var.b == 1 && rg7Var.a(0) == 6) {
            return bundle;
        }
        bundle.putIntArray(r, Arrays.copyOfRange(rg7Var.a, 0, rg7Var.b));
        return bundle;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.f, Boolean.valueOf(this.i), this.e, this.h);
    }
}
