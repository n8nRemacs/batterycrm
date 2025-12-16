package com.huawei.updatesdk.b.a.b;

import android.content.pm.PackageInfo;
import android.util.ArrayMap;
import android.util.ArraySet;
import com.huawei.updatesdk.a.a.d.h;
import com.huawei.updatesdk.b.a.b.a;
import com.huawei.updatesdk.b.a.b.c;
import java.io.File;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private static b f363814b;

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, a> f363815a = new HashMap();

    private b() {
    }

    public static synchronized b a() {
        try {
            if (f363814b == null) {
                f363814b = new b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f363814b;
    }

    private static ArrayList<String> b(PackageInfo packageInfo) {
        ArraySet<String> arraySet;
        a aVar = new a();
        aVar.a(packageInfo.packageName);
        File file = new File(packageInfo.applicationInfo.sourceDir);
        if (!file.exists()) {
            return null;
        }
        aVar.a(file.lastModified());
        c.a aVarA = c.a(file);
        ArrayMap<String, ArraySet<PublicKey>> arrayMap = aVarA.f363816a;
        if (arrayMap == null || arrayMap.isEmpty() || (arraySet = aVarA.f363817b) == null || arraySet.isEmpty()) {
            a(aVar);
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (Map.Entry<String, ArraySet<PublicKey>> entry : aVarA.f363816a.entrySet()) {
            if (aVarA.f363817b.contains(entry.getKey())) {
                Iterator<PublicKey> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    arrayList.add(h.a(it.next().getEncoded()));
                }
            }
        }
        a.C10760a c10760a = new a.C10760a();
        c10760a.a(arrayList);
        aVar.a(c10760a);
        a(aVar);
        return arrayList;
    }

    public List<String> a(PackageInfo packageInfo) {
        String str;
        if (packageInfo == null || (str = packageInfo.applicationInfo.sourceDir) == null) {
            return null;
        }
        long jLastModified = new File(str).lastModified();
        a aVar = a().f363815a.get(packageInfo.packageName);
        if (aVar == null || aVar.b() != jLastModified) {
            return b(packageInfo);
        }
        if (aVar.a() == null) {
            return null;
        }
        return aVar.a().a();
    }

    private static void a(a aVar) {
        a().f363815a.put(aVar.c(), aVar);
    }
}
