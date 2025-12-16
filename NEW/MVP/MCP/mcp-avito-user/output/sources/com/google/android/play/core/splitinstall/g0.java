package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import com.google.android.play.core.splitinstall.internal.s0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
public final class g0 {

    /* renamed from: c, reason: collision with root package name */
    public static final s0 f358715c = new s0("SplitInstallInfoProvider");

    /* renamed from: a, reason: collision with root package name */
    public final Context f358716a;

    /* renamed from: b, reason: collision with root package name */
    public final String f358717b;

    public g0(Context context) {
        this.f358716a = context;
        this.f358717b = context.getPackageName();
    }

    public static boolean c(String str) {
        return str.startsWith("config.") || str.contains(".config.");
    }

    public static final HashSet d(PackageInfo packageInfo) {
        HashSet hashSet = new HashSet();
        Iterator it = f(packageInfo).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!c(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    public static final HashSet f(PackageInfo packageInfo) {
        Bundle bundle = packageInfo.applicationInfo.metaData;
        HashSet hashSet = new HashSet();
        s0 s0Var = f358715c;
        if (bundle != null) {
            String string = bundle.getString("com.android.dynamic.apk.fused.modules");
            if (string == null || string.isEmpty()) {
                s0Var.a("App has no fused modules.", new Object[0]);
            } else {
                Collections.addAll(hashSet, string.split(",", -1));
                hashSet.remove("");
                hashSet.remove("base");
            }
        }
        String[] strArr = packageInfo.splitNames;
        if (strArr != null) {
            s0Var.a("Adding splits from package manager: %s", Arrays.toString(strArr));
            Collections.addAll(hashSet, strArr);
        } else {
            s0Var.a("No splits are found or app cannot be found in package manager.", new Object[0]);
        }
        e0 e0Var = (e0) f0.f358714a.get();
        if (e0Var != null) {
            hashSet.addAll(e0Var.zza());
        }
        return hashSet;
    }

    @j.P
    public final Z a(@j.P Bundle bundle) throws Resources.NotFoundException {
        Z zB2 = null;
        s0 s0Var = f358715c;
        if (bundle == null) {
            s0Var.e("No metadata found in Context.", new Object[0]);
            return null;
        }
        int i12 = bundle.getInt("com.android.vending.splits");
        if (i12 == 0) {
            s0Var.e("No metadata found in AndroidManifest.", new Object[0]);
            return null;
        }
        try {
            XmlResourceParser xml = this.f358716a.getResources().getXml(i12);
            X x12 = new X();
            while (xml.next() != 1) {
                try {
                    if (xml.getEventType() == 2) {
                        if (xml.getName().equals("splits")) {
                            while (xml.next() != 3) {
                                if (xml.getEventType() == 2) {
                                    if (xml.getName().equals("module")) {
                                        String strA = P.a("name", xml);
                                        if (strA != null) {
                                            while (xml.next() != 3) {
                                                if (xml.getEventType() == 2) {
                                                    if (xml.getName().equals("language")) {
                                                        while (xml.next() != 3) {
                                                            if (xml.getEventType() == 2) {
                                                                if (xml.getName().equals("entry")) {
                                                                    String strA2 = P.a("key", xml);
                                                                    String strA3 = P.a("split", xml);
                                                                    P.b(xml);
                                                                    if (strA2 != null && strA3 != null) {
                                                                        x12.a(strA, strA2, strA3);
                                                                    }
                                                                } else {
                                                                    P.b(xml);
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        P.b(xml);
                                                    }
                                                }
                                            }
                                        } else {
                                            P.b(xml);
                                        }
                                    } else {
                                        P.b(xml);
                                    }
                                }
                            }
                        } else {
                            P.b(xml);
                        }
                    }
                } catch (IOException | IllegalStateException | XmlPullParserException unused) {
                }
            }
            zB2 = x12.b();
            if (zB2 == null) {
                s0Var.e("Can't parse languages metadata.", new Object[0]);
            }
            return zB2;
        } catch (Resources.NotFoundException unused2) {
            s0Var.e("Resource with languages metadata doesn't exist.", new Object[0]);
            return null;
        }
    }

    public final HashSet b() {
        PackageInfo packageInfoE = e();
        return (packageInfoE == null || packageInfoE.applicationInfo == null) ? new HashSet() : d(packageInfoE);
    }

    @j.P
    public final PackageInfo e() {
        try {
            return this.f358716a.getPackageManager().getPackageInfo(this.f358717b, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            f358715c.b("App is not found in PackageManager", new Object[0]);
            return null;
        }
    }
}
