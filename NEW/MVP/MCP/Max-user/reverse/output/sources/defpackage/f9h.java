package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Path;
import android.graphics.Region;
import android.util.Log;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class f9h {
    public int a;
    public int b;
    public final Object c;
    public Object d;
    public Object e;

    public f9h() {
        this.c = new Path();
        this.d = new Region();
        this.e = new Region();
        this.a = -1;
        this.b = -1;
    }

    public static String b(h06 h06Var) {
        h06Var.a();
        q06 q06Var = h06Var.c;
        String str = q06Var.e;
        if (str != null) {
            return str;
        }
        h06Var.a();
        String str2 = q06Var.b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public static ArrayList d(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(mt.a);
        arrayList2.add(mt.c);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList2.contains(rational)) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        arrayList2.add(rational);
                        break;
                    }
                    if (mt.a(size, (Rational) it2.next(), d4f.c)) {
                        break;
                    }
                }
            }
        }
        return arrayList2;
    }

    public static Rational f(int i, boolean z) {
        if (i == -1) {
            return null;
        }
        if (i == 0) {
            return z ? mt.a : mt.b;
        }
        if (i == 1) {
            return z ? mt.c : mt.d;
        }
        gri.b("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i);
        return null;
    }

    public static HashMap g(ArrayList arrayList) {
        HashMap map = new HashMap();
        Iterator it = d(arrayList).iterator();
        while (it.hasNext()) {
            map.put((Rational) it.next(), new ArrayList());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Size size = (Size) it2.next();
            for (Rational rational : map.keySet()) {
                if (mt.a(size, rational, d4f.c)) {
                    ((List) map.get(rational)).add(size);
                }
            }
        }
        return map;
    }

    public static void j(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = (Size) list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z) {
            list.addAll(arrayList);
        }
    }

    public static void k(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Size size2 = (Size) list.get(i);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z) {
            list.addAll(arrayList);
        }
    }

    public synchronized String a() {
        try {
            if (((String) this.d) == null) {
                i();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.d;
    }

    public PackageInfo c(String str) {
        try {
            return ((Context) this.c).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Failed to find package " + e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList e(defpackage.xwg r14) {
        /*
            Method dump skipped, instructions count: 959
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f9h.e(xwg):java.util.ArrayList");
    }

    public boolean h() {
        int i;
        synchronized (this) {
            i = this.b;
            if (i == 0) {
                PackageManager packageManager = ((Context) this.c).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i = 0;
                } else {
                    Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent.setPackage("com.google.android.gms");
                    List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.size() <= 0) {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        this.b = 2;
                    } else {
                        this.b = 2;
                    }
                    i = 2;
                }
            }
        }
        return i != 0;
    }

    public synchronized void i() {
        PackageInfo packageInfoC = c(((Context) this.c).getPackageName());
        if (packageInfoC != null) {
            this.d = Integer.toString(packageInfoC.versionCode);
            this.e = packageInfoC.versionName;
        }
    }

    public f9h(Context context) {
        this.b = 0;
        this.c = context;
    }

    public f9h(l22 l22Var, Size size) {
        Rational rational;
        this.c = l22Var;
        this.a = l22Var.b();
        this.b = l22Var.h();
        if (size != null) {
            rational = new Rational(size.getWidth(), size.getHeight());
        } else {
            List listP = l22Var.p(256);
            if (listP.isEmpty()) {
                rational = null;
            } else {
                Size size2 = (Size) Collections.max(listP, new zi3(false));
                rational = new Rational(size2.getWidth(), size2.getHeight());
            }
        }
        this.d = rational;
        this.e = new kz6(l22Var, rational);
    }
}
