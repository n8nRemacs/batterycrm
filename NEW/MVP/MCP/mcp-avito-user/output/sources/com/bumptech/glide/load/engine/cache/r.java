package com.bumptech.glide.load.engine.cache;

import androidx.core.util.y;
import com.bumptech.glide.util.pool.a;
import j.N;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: SafeKeyGenerator.java */
/* loaded from: classes5.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.util.h<com.bumptech.glide.load.h, String> f338980a = new com.bumptech.glide.util.h<>(1000);

    /* renamed from: b, reason: collision with root package name */
    public final y.a<b> f338981b = com.bumptech.glide.util.pool.a.a(10, new a());

    /* compiled from: SafeKeyGenerator.java */
    public class a implements a.b<b> {
        @Override // com.bumptech.glide.util.pool.a.b
        public final b create() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e12) {
                throw new RuntimeException(e12);
            }
        }
    }

    /* compiled from: SafeKeyGenerator.java */
    public static final class b implements a.d {

        /* renamed from: b, reason: collision with root package name */
        public final MessageDigest f338982b;

        /* renamed from: c, reason: collision with root package name */
        public final com.bumptech.glide.util.pool.e f338983c = com.bumptech.glide.util.pool.e.a();

        public b(MessageDigest messageDigest) {
            this.f338982b = messageDigest;
        }

        @Override // com.bumptech.glide.util.pool.a.d
        @N
        public final com.bumptech.glide.util.pool.e a() {
            return this.f338983c;
        }
    }

    public final String a(com.bumptech.glide.load.h hVar) {
        String strB;
        synchronized (this.f338980a) {
            strB = this.f338980a.b(hVar);
        }
        if (strB == null) {
            b bVarB = this.f338981b.b();
            com.bumptech.glide.util.k.c(bVarB, "Argument must not be null");
            b bVar = bVarB;
            try {
                hVar.b(bVar.f338982b);
                byte[] bArrDigest = bVar.f338982b.digest();
                char[] cArr = com.bumptech.glide.util.m.f339650b;
                synchronized (cArr) {
                    for (int i12 = 0; i12 < bArrDigest.length; i12++) {
                        byte b12 = bArrDigest[i12];
                        int i13 = i12 * 2;
                        char[] cArr2 = com.bumptech.glide.util.m.f339649a;
                        cArr[i13] = cArr2[(b12 & 255) >>> 4];
                        cArr[i13 + 1] = cArr2[b12 & 15];
                    }
                    strB = new String(cArr);
                }
            } finally {
                this.f338981b.a(bVar);
            }
        }
        synchronized (this.f338980a) {
            this.f338980a.e(hVar, strB);
        }
        return strB;
    }
}
