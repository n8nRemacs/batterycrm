package com.google.android.datatransport.runtime.backends;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import j.P;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: MetadataBackendRegistry.java */
@Singleton
/* loaded from: classes10.dex */
class k implements e {

    /* renamed from: a, reason: collision with root package name */
    public final a f343106a;

    /* renamed from: b, reason: collision with root package name */
    public final i f343107b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f343108c;

    /* compiled from: MetadataBackendRegistry.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f343109a;

        /* renamed from: b, reason: collision with root package name */
        public Map<String, String> f343110b = null;

        public a(Context context) {
            this.f343109a = context;
        }

        @P
        public final d a(String str) {
            Map<String, String> mapEmptyMap;
            PackageManager packageManager;
            ServiceInfo serviceInfo;
            if (this.f343110b == null) {
                Context context = this.f343109a;
                try {
                    packageManager = context.getPackageManager();
                } catch (PackageManager.NameNotFoundException unused) {
                }
                Bundle bundle = (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128)) == null) ? null : serviceInfo.metaData;
                if (bundle == null) {
                    mapEmptyMap = Collections.emptyMap();
                } else {
                    HashMap map = new HashMap();
                    for (String str2 : bundle.keySet()) {
                        Object obj = bundle.get(str2);
                        if ((obj instanceof String) && str2.startsWith("backend:")) {
                            for (String str3 : ((String) obj).split(",", -1)) {
                                String strTrim = str3.trim();
                                if (!strTrim.isEmpty()) {
                                    map.put(strTrim, str2.substring(8));
                                }
                            }
                        }
                    }
                    mapEmptyMap = map;
                }
                this.f343110b = mapEmptyMap;
            }
            String str4 = this.f343110b.get(str);
            if (str4 == null) {
                return null;
            }
            try {
                return (d) Class.forName(str4).asSubclass(d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException unused2) {
                StringBuilder sb2 = new StringBuilder("Class ");
                sb2.append(str4);
                sb2.append(" is not found.");
                return null;
            } catch (IllegalAccessException unused3) {
                StringBuilder sb3 = new StringBuilder("Could not instantiate ");
                sb3.append(str4);
                sb3.append(".");
                return null;
            } catch (InstantiationException unused4) {
                StringBuilder sb4 = new StringBuilder("Could not instantiate ");
                sb4.append(str4);
                sb4.append(".");
                return null;
            } catch (NoSuchMethodException unused5) {
                "Could not instantiate ".concat(str4);
                return null;
            } catch (InvocationTargetException unused6) {
                "Could not instantiate ".concat(str4);
                return null;
            }
        }
    }

    @Inject
    public k(Context context, i iVar) {
        a aVar = new a(context);
        this.f343108c = new HashMap();
        this.f343106a = aVar;
        this.f343107b = iVar;
    }

    @Override // com.google.android.datatransport.runtime.backends.e
    @P
    public final synchronized m get(String str) {
        if (this.f343108c.containsKey(str)) {
            return (m) this.f343108c.get(str);
        }
        d dVarA = this.f343106a.a(str);
        if (dVarA == null) {
            return null;
        }
        i iVar = this.f343107b;
        m mVarCreate = dVarA.create(new c(iVar.f343100a, iVar.f343101b, iVar.f343102c, str));
        this.f343108c.put(str, mVarCreate);
        return mVarCreate;
    }
}
