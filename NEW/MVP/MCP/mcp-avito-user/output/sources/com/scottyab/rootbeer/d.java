package com.scottyab.rootbeer;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.appcompat.app.r;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: RootBeer.java */
/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f366285a;

    public d(Context context) {
        this.f366285a = context;
    }

    public static boolean a(String str) {
        boolean z12 = false;
        for (String str2 : b.a()) {
            String strQ = r.q(str2, str);
            if (new File(str2, str).exists()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strQ);
                sb2.append(" binary detected!");
                B11.a.b();
                z12 = true;
            }
        }
        return z12;
    }

    public final boolean b(ArrayList arrayList) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = this.f366285a.getPackageManager();
        Iterator it = arrayList.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                packageManager.getPackageInfo(str, 0);
                B11.a.a(str + " ROOT management app detected!");
                z12 = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return z12;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0203  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c() {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scottyab.rootbeer.d.c():boolean");
    }
}
