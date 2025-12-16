package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class un {
    public static final tn a = new tn(new ex4(4));
    public static final int b = -100;
    public static we8 c = null;
    public static we8 d = null;
    public static Boolean o = null;
    public static boolean X = false;
    public static final xs Y = new xs(0);
    public static final Object Z = new Object();
    public static final Object s0 = new Object();

    public static boolean d(Context context) {
        if (o == null) {
            try {
                int i = eq.a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) eq.class), dq.a() | 128).metaData;
                if (bundle != null) {
                    o = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                o = Boolean.FALSE;
            }
        }
        return o.booleanValue();
    }

    public static void h(ho hoVar) {
        synchronized (Z) {
            try {
                xs xsVar = Y;
                xsVar.getClass();
                qs qsVar = new qs(xsVar);
                while (qsVar.hasNext()) {
                    un unVar = (un) ((WeakReference) qsVar.next()).get();
                    if (unVar == hoVar || unVar == null) {
                        qsVar.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public abstract void c();

    public abstract void e();

    public abstract void g();

    public abstract boolean i(int i);

    public abstract void j(int i);

    public abstract void k(View view);

    public abstract void l(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void m(CharSequence charSequence);
}
