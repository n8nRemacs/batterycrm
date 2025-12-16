package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class l69 {
    public static final boolean c = Log.isLoggable("MediaRouter", 3);
    public static h69 d;
    public final Context a;
    public final ArrayList b = new ArrayList();

    public l69(Context context) {
        this.a = context;
    }

    public static void b() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }

    public static h69 c() {
        h69 h69Var = d;
        if (h69Var == null) {
            return null;
        }
        Context context = h69Var.a;
        if (!h69Var.b) {
            h69Var.b = true;
            if (Build.VERSION.SDK_INT >= 30) {
                int i = ga9.b;
                Intent intent = new Intent(context, (Class<?>) ga9.class);
                intent.setPackage(context.getPackageName());
                h69Var.d = context.getPackageManager().queryBroadcastReceivers(intent, 0).size() > 0;
            } else {
                h69Var.d = false;
            }
            if (h69Var.d) {
                h69Var.e = new r49(context, new t9f(24, h69Var));
            } else {
                h69Var.e = null;
            }
            h69Var.c = new exf(context, h69Var);
            h69Var.o = new m69(new r98(7, h69Var));
            h69Var.a(h69Var.c);
            r49 r49Var = h69Var.e;
            if (r49Var != null) {
                h69Var.a(r49Var);
            }
            f54 f54Var = new f54(context, h69Var);
            Handler handler = (Handler) f54Var.e;
            if (!f54Var.b) {
                f54Var.b = true;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
                intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
                intentFilter.addDataScheme("package");
                ((Context) f54Var.c).registerReceiver((eo) f54Var.g, intentFilter, null, handler);
                handler.post((r98) f54Var.i);
            }
        }
        return d;
    }

    public static l69 d(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        b();
        if (d == null) {
            d = new h69(context.getApplicationContext());
        }
        ArrayList arrayList = d.f;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                l69 l69Var = new l69(context);
                arrayList.add(new WeakReference(l69Var));
                return l69Var;
            }
            l69 l69Var2 = (l69) ((WeakReference) arrayList.get(size)).get();
            if (l69Var2 == null) {
                arrayList.remove(size);
            } else if (l69Var2.a == context) {
                return l69Var2;
            }
        }
    }

    public static boolean e(d69 d69Var) {
        if (d69Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        b();
        h69 h69VarC = c();
        ArrayList arrayList = h69VarC.g;
        if (!d69Var.c()) {
            if (h69VarC.n) {
                return true;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                k69 k69Var = (k69) arrayList.get(i);
                if (!k69Var.d() && k69Var.h(d69Var)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void g(int i) {
        if (i < 0 || i > 3) {
            throw new IllegalArgumentException("Unsupported reason to unselect route");
        }
        b();
        h69 h69VarC = c();
        k69 k69VarC = h69VarC.c();
        if (h69VarC.e() != k69VarC) {
            h69VarC.g(k69VarC, i);
        }
    }

    public final void a(d69 d69Var, t49 t49Var, int i) {
        e69 e69Var;
        d69 d69Var2;
        if (d69Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (t49Var == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        b();
        if (c) {
            Log.d("MediaRouter", "addCallback: selector=" + d69Var + ", callback=" + t49Var + ", flags=" + Integer.toHexString(i));
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((e69) arrayList.get(i2)).b == t49Var) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            e69Var = new e69(this, t49Var);
            arrayList.add(e69Var);
        } else {
            e69Var = (e69) arrayList.get(i2);
        }
        boolean z2 = true;
        if (i != e69Var.d) {
            e69Var.d = i;
            z = true;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if ((i & 1) != 0) {
            z = true;
        }
        e69Var.e = jElapsedRealtime;
        d69 d69Var3 = e69Var.c;
        d69Var3.a();
        d69Var.a();
        if (d69Var3.b.containsAll(d69Var.b)) {
            z2 = z;
        } else {
            d69 d69Var4 = e69Var.c;
            if (d69Var4 == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            d69Var4.a();
            ArrayList<String> arrayList2 = !d69Var4.b.isEmpty() ? new ArrayList<>(d69Var4.b) : null;
            ArrayList arrayListB = d69Var.b();
            if (!arrayListB.isEmpty()) {
                Iterator it = arrayListB.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (str == null) {
                        throw new IllegalArgumentException("category must not be null");
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    if (!arrayList2.contains(str)) {
                        arrayList2.add(str);
                    }
                }
            }
            if (arrayList2 == null) {
                d69Var2 = d69.c;
            } else {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("controlCategories", arrayList2);
                d69Var2 = new d69(bundle, arrayList2);
            }
            e69Var.c = d69Var2;
        }
        if (z2) {
            c().i();
        }
    }

    public final void f(t49 t49Var) {
        if (t49Var == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        b();
        if (c) {
            Log.d("MediaRouter", "removeCallback: callback=" + t49Var);
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (((e69) arrayList.get(i)).b == t49Var) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            arrayList.remove(i);
            c().i();
        }
    }
}
