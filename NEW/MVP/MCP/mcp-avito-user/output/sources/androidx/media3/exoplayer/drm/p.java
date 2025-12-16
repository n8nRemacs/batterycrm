package androidx.media3.exoplayer.drm;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.C23097k;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.datasource.o;
import androidx.media3.datasource.r;
import androidx.media3.exoplayer.drm.l;
import com.google.common.collect.AbstractC37412t1;
import j.P;
import java.util.Collections;
import java.util.HashMap;
import java.util.UUID;

/* compiled from: HttpMediaDrmCallback.java */
@J
/* loaded from: classes.dex */
public final class p implements r {

    /* renamed from: a, reason: collision with root package name */
    public final r.b f49134a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public final String f49135b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f49136c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f49137d;

    public p(@P String str, boolean z12, r.b bVar) {
        C23110a.b((z12 && TextUtils.isEmpty(str)) ? false : true);
        this.f49134a = bVar;
        this.f49135b = str;
        this.f49136c = z12;
        this.f49137d = new HashMap();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:11|34|12|(1:24)|(2:26|27)(2:39|29)) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        r3 = r1.f48178e;
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (r3 == 307) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        r5 = r3.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        if (r5 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        r10 = r10 + 1;
        r9 = r9.a();
        r9.f48255a = android.net.Uri.parse(r5);
        r9 = r9.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        androidx.media3.common.util.M.h(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        r8 = move-exception;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] c(androidx.media3.datasource.r.b r8, java.lang.String r9, @j.P byte[] r10, java.util.Map r11) throws androidx.media3.exoplayer.drm.MediaDrmCallbackException {
        /*
            androidx.media3.datasource.z r0 = new androidx.media3.datasource.z
            androidx.media3.datasource.j r8 = r8.a()
            r0.<init>(r8)
            androidx.media3.datasource.o$b r8 = new androidx.media3.datasource.o$b
            r8.<init>()
            android.net.Uri r9 = android.net.Uri.parse(r9)
            r8.f48255a = r9
            r8.f48259e = r11
            r9 = 2
            r8.f48257c = r9
            r8.f48258d = r10
            r9 = 1
            r8.f48263i = r9
            androidx.media3.datasource.o r2 = r8.a()
            r8 = 0
            r10 = r8
            r9 = r2
        L25:
            androidx.media3.datasource.m r11 = new androidx.media3.datasource.m     // Catch: java.lang.Exception -> L32
            r11.<init>(r0, r9)     // Catch: java.lang.Exception -> L32
            byte[] r8 = androidx.media3.common.util.M.N(r11)     // Catch: java.lang.Throwable -> L35 androidx.media3.datasource.HttpDataSource.InvalidResponseCodeException -> L37
            androidx.media3.common.util.M.h(r11)     // Catch: java.lang.Exception -> L32
            return r8
        L32:
            r8 = move-exception
            r7 = r8
            goto L7c
        L35:
            r8 = move-exception
            goto L78
        L37:
            r1 = move-exception
            int r3 = r1.f48178e     // Catch: java.lang.Throwable -> L35
            r4 = 307(0x133, float:4.3E-43)
            r5 = 0
            if (r3 == r4) goto L43
            r4 = 308(0x134, float:4.32E-43)
            if (r3 != r4) goto L61
        L43:
            r3 = 5
            if (r10 >= r3) goto L61
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r3 = r1.f48179f     // Catch: java.lang.Throwable -> L35
            if (r3 == 0) goto L61
            java.lang.String r4 = "Location"
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L35
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L35
            if (r3 == 0) goto L61
            boolean r4 = r3.isEmpty()     // Catch: java.lang.Throwable -> L35
            if (r4 != 0) goto L61
            java.lang.Object r3 = r3.get(r8)     // Catch: java.lang.Throwable -> L35
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L35
        L61:
            if (r5 == 0) goto L77
            int r10 = r10 + 1
            androidx.media3.datasource.o$b r9 = r9.a()     // Catch: java.lang.Throwable -> L35
            android.net.Uri r1 = android.net.Uri.parse(r5)     // Catch: java.lang.Throwable -> L35
            r9.f48255a = r1     // Catch: java.lang.Throwable -> L35
            androidx.media3.datasource.o r9 = r9.a()     // Catch: java.lang.Throwable -> L35
            androidx.media3.common.util.M.h(r11)     // Catch: java.lang.Exception -> L32
            goto L25
        L77:
            throw r1     // Catch: java.lang.Throwable -> L35
        L78:
            androidx.media3.common.util.M.h(r11)     // Catch: java.lang.Exception -> L32
            throw r8     // Catch: java.lang.Exception -> L32
        L7c:
            androidx.media3.exoplayer.drm.MediaDrmCallbackException r8 = new androidx.media3.exoplayer.drm.MediaDrmCallbackException
            android.net.Uri r3 = r0.f48320c
            r3.getClass()
            androidx.media3.datasource.j r9 = r0.f48318a
            java.util.Map r4 = r9.c()
            long r5 = r0.f48319b
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.drm.p.c(androidx.media3.datasource.r$b, java.lang.String, byte[], java.util.Map):byte[]");
    }

    @Override // androidx.media3.exoplayer.drm.r
    public final byte[] a(UUID uuid, l.b bVar) throws MediaDrmCallbackException {
        String str = bVar.f49121b;
        if (this.f49136c || TextUtils.isEmpty(str)) {
            str = this.f49135b;
        }
        if (TextUtils.isEmpty(str)) {
            o.b bVar2 = new o.b();
            Uri uri = Uri.EMPTY;
            bVar2.f48255a = uri;
            throw new MediaDrmCallbackException(bVar2.a(), uri, AbstractC37412t1.n(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = C23097k.f47670e;
        map.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : C23097k.f47668c.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f49137d) {
            map.putAll(this.f49137d);
        }
        return c(this.f49134a, str, bVar.f49120a, map);
    }

    @Override // androidx.media3.exoplayer.drm.r
    public final byte[] b(l.h hVar) {
        return c(this.f49134a, hVar.f49123b + "&signedRequest=" + M.o(hVar.f49122a), null, Collections.emptyMap());
    }
}
