package com.yandex.mobile.ads.exo.drm;

import android.net.Uri;
import android.text.TextUtils;
import com.yandex.mobile.ads.exo.drm.m;
import com.yandex.mobile.ads.impl.a71;
import com.yandex.mobile.ads.impl.db;
import com.yandex.mobile.ads.impl.g10;
import com.yandex.mobile.ads.impl.gn;
import com.yandex.mobile.ads.impl.in;
import com.yandex.mobile.ads.impl.kn;
import com.yandex.mobile.ads.impl.pc0;
import com.yandex.mobile.ads.impl.pc1;
import com.yandex.mobile.ads.impl.wo;
import com.yandex.mobile.ads.impl.xg;
import j.P;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes8.dex */
public final class o implements p {

    /* renamed from: a, reason: collision with root package name */
    private final gn.a f382928a;

    /* renamed from: b, reason: collision with root package name */
    @P
    private final String f382929b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f382930c;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f382931d;

    public o(@P String str, boolean z12, wo.a aVar) {
        db.a((z12 && TextUtils.isEmpty(str)) ? false : true);
        this.f382928a = aVar;
        this.f382929b = str;
        this.f382930c = z12;
        this.f382931d = new HashMap();
    }

    public final byte[] a(m.d dVar) {
        return a(this.f382928a, dVar.b() + "&signedRequest=" + pc1.a(dVar.a()), null, Collections.emptyMap());
    }

    public final byte[] a(UUID uuid, m.a aVar) throws pc0 {
        String str;
        String strB = aVar.b();
        if (this.f382930c || TextUtils.isEmpty(strB)) {
            strB = this.f382929b;
        }
        if (!TextUtils.isEmpty(strB)) {
            HashMap map = new HashMap();
            UUID uuid2 = xg.f391721e;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else {
                str = xg.f391719c.equals(uuid) ? "application/json" : "application/octet-stream";
            }
            map.put("Content-Type", str);
            if (uuid2.equals(uuid)) {
                map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (this.f382931d) {
                map.putAll(this.f382931d);
            }
            return a(this.f382928a, strB, aVar.a(), map);
        }
        kn.a aVar2 = new kn.a();
        Uri uri = Uri.EMPTY;
        throw new pc0(aVar2.a(uri).a(), uri, com.yandex.mobile.ads.embedded.guava.collect.q.h(), 0L, new IllegalStateException("No license URL"));
    }

    public final void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        synchronized (this.f382931d) {
            this.f382931d.put(str, str2);
        }
    }

    private static byte[] a(gn.a aVar, String str, @P byte[] bArr, Map<String, String> map) throws pc0 {
        Map<String, List<String>> map2;
        List<String> list;
        a71 a71Var = new a71(aVar.a());
        kn knVarA = new kn.a().b(str).a(map).b().a(bArr).a(1).a();
        int i12 = 0;
        int i13 = 0;
        kn knVarA2 = knVarA;
        while (true) {
            try {
                in inVar = new in(a71Var, knVarA2);
                try {
                    try {
                        int i14 = pc1.f388768a;
                        byte[] bArr2 = new byte[4096];
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        while (true) {
                            int i15 = inVar.read(bArr2);
                            if (i15 != -1) {
                                byteArrayOutputStream.write(bArr2, i12, i15);
                            } else {
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                pc1.a((Closeable) inVar);
                                return byteArray;
                            }
                        }
                    } catch (g10 e12) {
                        int i16 = e12.f385546d;
                        String str2 = ((i16 != 307 && i16 != 308) || i13 >= 5 || (map2 = e12.f385547e) == null || (list = map2.get("Location")) == null || list.isEmpty()) ? null : list.get(i12);
                        if (str2 != null) {
                            i13++;
                            knVarA2 = knVarA2.a().b(str2).a();
                            pc1.a((Closeable) inVar);
                        } else {
                            throw e12;
                        }
                    }
                } catch (Throwable th2) {
                    pc1.a((Closeable) inVar);
                    throw th2;
                }
            } catch (Exception e13) {
                Uri uriG = a71Var.g();
                uriG.getClass();
                throw new pc0(knVarA, uriG, a71Var.b(), a71Var.f(), e13);
            }
        }
    }
}
