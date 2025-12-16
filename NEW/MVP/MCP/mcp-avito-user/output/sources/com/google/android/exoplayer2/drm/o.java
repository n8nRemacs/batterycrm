package com.google.android.exoplayer2.drm;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.C36526i;
import com.google.android.exoplayer2.drm.k;
import com.google.android.exoplayer2.upstream.p;
import com.google.android.exoplayer2.upstream.v;
import com.google.android.exoplayer2.util.U;
import com.google.common.base.C37262f;
import com.google.common.collect.AbstractC37412t1;
import j.P;
import java.util.Collections;
import java.util.HashMap;
import java.util.UUID;

/* compiled from: HttpMediaDrmCallback.java */
/* loaded from: classes6.dex */
public final class o implements q {

    /* renamed from: a, reason: collision with root package name */
    public final v.b f344358a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public final String f344359b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f344360c = new HashMap();

    public o(@P String str, v.b bVar) {
        this.f344358a = bVar;
        this.f344359b = str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:11|34|12|(1:24)|(2:26|27)(2:39|29)) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        r3 = r1.f347735e;
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
        r9.f347939a = android.net.Uri.parse(r5);
        r9 = r9.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        com.google.android.exoplayer2.util.U.h(r11);
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
    public static byte[] c(com.google.android.exoplayer2.upstream.v.b r8, java.lang.String r9, @j.P byte[] r10, java.util.Map r11) throws com.google.android.exoplayer2.drm.MediaDrmCallbackException {
        /*
            com.google.android.exoplayer2.upstream.J r0 = new com.google.android.exoplayer2.upstream.J
            com.google.android.exoplayer2.upstream.m r8 = r8.a()
            r0.<init>(r8)
            com.google.android.exoplayer2.upstream.p$b r8 = new com.google.android.exoplayer2.upstream.p$b
            r8.<init>()
            android.net.Uri r9 = android.net.Uri.parse(r9)
            r8.f347939a = r9
            r8.f347943e = r11
            r9 = 2
            r8.f347941c = r9
            r8.f347942d = r10
            r9 = 1
            r8.f347947i = r9
            com.google.android.exoplayer2.upstream.p r2 = r8.a()
            r8 = 0
            r10 = r8
            r9 = r2
        L25:
            com.google.android.exoplayer2.upstream.n r11 = new com.google.android.exoplayer2.upstream.n     // Catch: java.lang.Exception -> L32
            r11.<init>(r0, r9)     // Catch: java.lang.Exception -> L32
            byte[] r8 = com.google.android.exoplayer2.util.U.Q(r11)     // Catch: java.lang.Throwable -> L35 com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException -> L37
            com.google.android.exoplayer2.util.U.h(r11)     // Catch: java.lang.Exception -> L32
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
            int r3 = r1.f347735e     // Catch: java.lang.Throwable -> L35
            r4 = 307(0x133, float:4.3E-43)
            r5 = 0
            if (r3 == r4) goto L43
            r4 = 308(0x134, float:4.32E-43)
            if (r3 != r4) goto L61
        L43:
            r3 = 5
            if (r10 >= r3) goto L61
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r3 = r1.f347736f     // Catch: java.lang.Throwable -> L35
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
            com.google.android.exoplayer2.upstream.p$b r9 = r9.a()     // Catch: java.lang.Throwable -> L35
            android.net.Uri r1 = android.net.Uri.parse(r5)     // Catch: java.lang.Throwable -> L35
            r9.f347939a = r1     // Catch: java.lang.Throwable -> L35
            com.google.android.exoplayer2.upstream.p r9 = r9.a()     // Catch: java.lang.Throwable -> L35
            com.google.android.exoplayer2.util.U.h(r11)     // Catch: java.lang.Exception -> L32
            goto L25
        L77:
            throw r1     // Catch: java.lang.Throwable -> L35
        L78:
            com.google.android.exoplayer2.util.U.h(r11)     // Catch: java.lang.Exception -> L32
            throw r8     // Catch: java.lang.Exception -> L32
        L7c:
            com.google.android.exoplayer2.drm.MediaDrmCallbackException r8 = new com.google.android.exoplayer2.drm.MediaDrmCallbackException
            android.net.Uri r3 = r0.f347753c
            r3.getClass()
            com.google.android.exoplayer2.upstream.m r9 = r0.f347751a
            java.util.Map r4 = r9.c()
            long r5 = r0.f347752b
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.o.c(com.google.android.exoplayer2.upstream.v$b, java.lang.String, byte[], java.util.Map):byte[]");
    }

    @Override // com.google.android.exoplayer2.drm.q
    public final byte[] a(UUID uuid, k.b bVar) throws MediaDrmCallbackException {
        String str = bVar.f344345b;
        if (TextUtils.isEmpty(str)) {
            str = this.f344359b;
        }
        if (TextUtils.isEmpty(str)) {
            p.b bVar2 = new p.b();
            Uri uri = Uri.EMPTY;
            bVar2.f347939a = uri;
            throw new MediaDrmCallbackException(bVar2.a(), uri, AbstractC37412t1.n(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = C36526i.f345421e;
        map.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : C36526i.f345419c.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f344360c) {
            map.putAll(this.f344360c);
        }
        return c(this.f344358a, str, bVar.f344344a, map);
    }

    @Override // com.google.android.exoplayer2.drm.q
    public final byte[] b(k.h hVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(hVar.f344347b);
        sb2.append("&signedRequest=");
        int i12 = U.f348106a;
        sb2.append(new String(hVar.f344346a, C37262f.f359034c));
        return c(this.f344358a, sb2.toString(), null, Collections.emptyMap());
    }
}
