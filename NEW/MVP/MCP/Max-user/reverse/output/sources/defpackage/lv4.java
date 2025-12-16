package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.Size;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class lv4 {
    public static volatile nv4 l = null;
    public static int m = -1;
    public static Size n;
    public final Context a;
    public final z7c b;
    public final k18 c;
    public PowerManager d;
    public final und e = new und(new e44(9, this));
    public final alf f;
    public final k18 g;
    public final k18 h;
    public final k18 i;
    public cxg j;
    public final AtomicReference k;

    public lv4(Context context, z7c z7cVar, alf alfVar, k18 k18Var, k18 k18Var2, k18 k18Var3) {
        this.a = context;
        this.b = z7cVar;
        WeakReference weakReference = new WeakReference(this);
        l5c l5cVar = z7cVar.b;
        l5cVar.n.add(new jv4(this, 0, weakReference));
        this.c = k18Var3;
        this.f = alfVar;
        this.g = k18Var;
        this.h = k18Var2;
        this.i = k18Var3;
        this.k = new AtomicReference(null);
    }

    public static Size h(Context context) {
        Size size = n;
        if (size == null) {
            size = new Size(i9j.a(context).getWidth(), i9j.a(context).getHeight());
        }
        n = size;
        return size;
    }

    public final String a() {
        String string;
        z7c z7cVar = this.b;
        pe8 pe8Var = z7cVar.a;
        String str = (String) pe8Var.W.D(pe8Var, w4e.m0[40]);
        if (!l8g.c(str)) {
            return str;
        }
        wqi.c("lv4", "New device id generated", new Object[0]);
        String strG = null;
        try {
            string = Settings.Secure.getString(this.a.getContentResolver(), "android_id");
        } catch (Exception e) {
            wqi.e("lv4", "Can't get hardware device id", e);
            string = null;
        }
        if (l8g.c(string)) {
            vxf vxfVar = (vxf) this.h.getValue();
            vxfVar.getClass();
            try {
                strG = vxfVar.g();
            } catch (Exception e2) {
                wqi.e(vxfVar.b, "error while get instance id", e2);
            }
            string = !l8g.c(strG) ? strG : UUID.randomUUID().toString();
        }
        pe8 pe8Var2 = z7cVar.a;
        pe8Var2.W.O(pe8Var2, w4e.m0[40], string);
        return string;
    }

    public final nv4 b() {
        if (l == null) {
            l = c9j.b(this.a);
        }
        return l;
    }

    public final boolean c() {
        tih tihVar = (tih) this.i.getValue();
        return tihVar != null && tihVar.h > 0;
    }

    public final boolean d() {
        return ((tih) this.c.getValue()).d();
    }

    public final void e() {
        k18 k18Var = this.g;
        ((eza) k18Var.getValue()).getClass();
        ((eza) k18Var.getValue()).getClass();
    }

    public final void f(String str) {
        tih tihVar = (tih) this.i.getValue();
        if (tihVar != null) {
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, "tih", "onForegroundServiceStarted:".concat(str), null);
                }
            }
            tihVar.h++;
        }
    }

    public final void g(String str) {
        int i;
        tih tihVar = (tih) this.i.getValue();
        if (tihVar != null) {
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, "tih", "onForegroundServiceStropped:".concat(str), null);
                }
            }
            if (tihVar.h <= 0) {
                i = 0;
            } else {
                i = tihVar.h - 1;
                tihVar.h = i;
            }
            tihVar.h = i;
        }
    }

    public final int i() throws Resources.NotFoundException {
        int i = m;
        if (i != -1) {
            return i;
        }
        Context context = this.a;
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(identifier);
        m = dimensionPixelSize;
        return dimensionPixelSize;
    }

    public final cxg j() {
        String str;
        z7c z7cVar = this.b;
        pe8 pe8Var = z7cVar.a;
        uv4 uv4Var = pe8Var.h;
        boolean zBooleanValue = (uv4Var == null || !uv4Var.a) ? ((Boolean) pe8Var.j0.D(pe8Var, w4e.m0[53])).booleanValue() : false;
        k18 k18Var = this.g;
        if (zBooleanValue) {
            ((eza) k18Var.getValue()).getClass();
        } else {
            ((eza) k18Var.getValue()).getClass();
        }
        cxg cxgVar = this.j;
        if (!fni.a(cxgVar != null ? cxgVar.b : null, "25.19.0")) {
            this.j = null;
        }
        cxg cxgVar2 = this.j;
        if (cxgVar2 != null) {
            return cxgVar2;
        }
        String str2 = (String) ys.w(Build.SUPPORTED_ABIS);
        if (str2 == null) {
            str2 = "UNKNOWN";
        }
        String str3 = str2;
        String str4 = String.format(Locale.ENGLISH, "Android %s", Arrays.copyOf(new Object[]{Build.VERSION.RELEASE}, 1));
        String strO = z7cVar.a.o();
        if (l8g.c(strO)) {
            strO = Resources.getSystem().getConfiguration().getLocales().get(0).getLanguage();
        }
        String str5 = strO;
        String language = Resources.getSystem().getConfiguration().getLocales().get(0).getLanguage();
        String strK = u45.k(Build.MANUFACTURER, " ", Build.MODEL);
        DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
        int i = displayMetrics.densityDpi;
        if (i == 120) {
            str = "ldpi";
        } else if (i == 160) {
            str = "mdpi";
        } else if (i == 240) {
            str = "hdpi";
        } else if (i == 320) {
            str = "xhdpi";
        } else if (i == 480) {
            str = "xxhdpi";
        } else if (i != 640) {
            str = i + "dpi";
        } else {
            str = "xxxhdpi";
        }
        String str6 = str + " " + i + "dpi " + displayMetrics.widthPixels + "x" + displayMetrics.heightPixels;
        this.f.getClass();
        cxg cxgVar3 = new cxg(str4, str3, str5, language, strK, str6);
        this.j = cxgVar3;
        return cxgVar3;
    }
}
