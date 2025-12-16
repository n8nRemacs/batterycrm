package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.my.tracker.obfuscated.h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37834h {

    /* renamed from: b, reason: collision with root package name */
    private List<PackageInfo> f365650b;

    /* renamed from: c, reason: collision with root package name */
    private String f365651c;

    /* renamed from: a, reason: collision with root package name */
    private List<a> f365649a = Collections.EMPTY_LIST;

    /* renamed from: d, reason: collision with root package name */
    private boolean f365652d = false;

    /* renamed from: com.my.tracker.obfuscated.h$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f365653a;

        /* renamed from: b, reason: collision with root package name */
        public final long f365654b;

        public a(String str, long j12) {
            this.f365653a = str;
            this.f365654b = j12;
        }
    }

    private static String a(List<a> list) {
        StringBuilder sb2 = new StringBuilder();
        boolean z12 = false;
        for (a aVar : list) {
            if (z12) {
                sb2.append(",");
            } else {
                z12 = true;
            }
            sb2.append(aVar.f365653a);
        }
        return sb2.toString();
    }

    private static List<a> b(List<PackageInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (PackageInfo packageInfo : list) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if ((applicationInfo.flags & 1) == 0) {
                arrayList.add(new a(applicationInfo.packageName, c2.b(packageInfo.firstInstallTime)));
            }
        }
        return arrayList;
    }

    public void c(List<PackageInfo> list) {
        this.f365650b = list;
    }

    public void a(Context context) {
        String str;
        this.f365652d = false;
        List<PackageInfo> list = this.f365650b;
        if (list == null || list.isEmpty()) {
            return;
        }
        List<a> listB = b(this.f365650b);
        this.f365649a = listB;
        String strA = a(listB);
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        String strF = z0.a(context).f();
        String strA2 = C37846u.a(strA);
        this.f365651c = strA2;
        if (strF.equals(strA2)) {
            str = "Apps hash did not changed";
        } else {
            this.f365652d = true;
            str = "Apps hash changed";
        }
        e2.a(str);
    }

    public void b(Context context) {
        if (this.f365652d) {
            z0.a(context).h(this.f365651c);
            this.f365652d = false;
        }
    }

    public void a(a1 a1Var, Context context) {
        if (!this.f365652d || this.f365649a.isEmpty()) {
            return;
        }
        a1Var.a(this.f365649a);
    }
}
