package androidx.media3.exoplayer.drm;

import androidx.media3.common.DrmInitData;
import androidx.media3.common.util.J;
import androidx.media3.exoplayer.analytics.w;
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
@J
/* loaded from: classes.dex */
public interface l {

    /* compiled from: ExoMediaDrm.java */
    public static final class a implements g {
        @Override // androidx.media3.exoplayer.drm.l.g
        public final l c(UUID uuid) {
            throw null;
        }
    }

    /* compiled from: ExoMediaDrm.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f49120a;

        /* renamed from: b, reason: collision with root package name */
        public final String f49121b;

        /* compiled from: ExoMediaDrm.java */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public b(String str, byte[] bArr) {
            this.f49120a = bArr;
            this.f49121b = str;
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
        l c(UUID uuid);
    }

    /* compiled from: ExoMediaDrm.java */
    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f49122a;

        /* renamed from: b, reason: collision with root package name */
        public final String f49123b;

        public h(String str, byte[] bArr) {
            this.f49122a = bArr;
            this.f49123b = str;
        }
    }

    Map<String, String> a(byte[] bArr);

    void b(byte[] bArr, byte[] bArr2);

    @P
    byte[] c(byte[] bArr, byte[] bArr2);

    void d(byte[] bArr);

    androidx.media3.decoder.c e(byte[] bArr);

    void f(byte[] bArr);

    b g(byte[] bArr, @P List<DrmInitData.SchemeData> list, int i12, @P HashMap<String, String> map);

    h h();

    byte[] i();

    boolean j(String str, byte[] bArr);

    int k();

    void m(@P d dVar);

    void release();

    default void l(byte[] bArr, w wVar) {
    }
}
