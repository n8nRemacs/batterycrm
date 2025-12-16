package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.DrmInitData;
import j.P;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: ExoMediaDrm.java */
/* loaded from: classes6.dex */
public interface k {

    /* compiled from: ExoMediaDrm.java */
    public static final class a implements g {
        @Override // com.google.android.exoplayer2.drm.k.g
        public final k c(UUID uuid) {
            throw null;
        }
    }

    /* compiled from: ExoMediaDrm.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f344344a;

        /* renamed from: b, reason: collision with root package name */
        public final String f344345b;

        /* compiled from: ExoMediaDrm.java */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public b(String str, byte[] bArr) {
            this.f344344a = bArr;
            this.f344345b = str;
        }
    }

    /* compiled from: ExoMediaDrm.java */
    public static final class c {
    }

    /* compiled from: ExoMediaDrm.java */
    public interface d {
    }

    /* compiled from: ExoMediaDrm.java */
    public interface e {
    }

    /* compiled from: ExoMediaDrm.java */
    public interface f {
    }

    /* compiled from: ExoMediaDrm.java */
    public interface g {
        k c(UUID uuid);
    }

    /* compiled from: ExoMediaDrm.java */
    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f344346a;

        /* renamed from: b, reason: collision with root package name */
        public final String f344347b;

        public h(String str, byte[] bArr) {
            this.f344346a = bArr;
            this.f344347b = str;
        }
    }

    Map<String, String> a(byte[] bArr);

    void b(byte[] bArr, byte[] bArr2);

    @P
    byte[] c(byte[] bArr, byte[] bArr2);

    void d(byte[] bArr);

    com.google.android.exoplayer2.decoder.c e(byte[] bArr);

    void f(byte[] bArr);

    b g(byte[] bArr, @P List<DrmInitData.SchemeData> list, int i12, @P HashMap<String, String> map);

    h h();

    byte[] i();

    boolean j(String str, byte[] bArr);

    int k();

    void l(@P d dVar);

    void release();

    default void m(byte[] bArr, com.google.android.exoplayer2.analytics.p pVar) {
    }
}
