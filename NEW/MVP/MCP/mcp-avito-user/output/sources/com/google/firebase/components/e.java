package com.google.firebase.components;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import j.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: ComponentDiscovery.java */
/* loaded from: classes13.dex */
public final class e<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f360741a;

    /* renamed from: b, reason: collision with root package name */
    public final b f360742b;

    /* compiled from: ComponentDiscovery.java */
    public static class b implements c<Context> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<? extends Service> f360743a;

        public b() {
            throw null;
        }

        public b(Class cls, a aVar) {
            this.f360743a = cls;
        }
    }

    /* compiled from: ComponentDiscovery.java */
    @k0
    public interface c<T> {
    }

    @k0
    public e(Context context, b bVar) {
        this.f360741a = context;
        this.f360742b = bVar;
    }

    public static e<Context> b(Context context, Class<? extends Service> cls) {
        return new e<>(context, new b(cls, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    public final ArrayList a() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        b bVar = this.f360742b;
        Context context = this.f360741a;
        Class<? extends Service> cls = bVar.f360743a;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, cls), 128);
                if (serviceInfo == null) {
                    Objects.toString(cls);
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (bundle == null) {
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new d((String) it.next(), 0));
        }
        return arrayList2;
    }
}
