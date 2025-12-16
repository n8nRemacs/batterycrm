package com.yandex.mobile.ads.exo.drm;

import com.yandex.mobile.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.impl.jt0;
import com.yandex.mobile.ads.impl.tm;
import j.P;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes8.dex */
public interface m {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f382919a;

        /* renamed from: b, reason: collision with root package name */
        private final String f382920b;

        public a(String str, byte[] bArr) {
            this.f382919a = bArr;
            this.f382920b = str;
        }

        public final byte[] a() {
            return this.f382919a;
        }

        public final String b() {
            return this.f382920b;
        }
    }

    public interface b {
    }

    public interface c {
        m a(UUID uuid);
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f382921a;

        /* renamed from: b, reason: collision with root package name */
        private final String f382922b;

        public d(String str, byte[] bArr) {
            this.f382921a = bArr;
            this.f382922b = str;
        }

        public final byte[] a() {
            return this.f382921a;
        }

        public final String b() {
            return this.f382922b;
        }
    }

    a a(byte[] bArr, @P List<DrmInitData.SchemeData> list, int i12, @P HashMap<String, String> map);

    d a();

    Map<String, String> a(byte[] bArr);

    void a(@P b bVar);

    default void a(byte[] bArr, jt0 jt0Var) {
    }

    void a(byte[] bArr, byte[] bArr2);

    boolean a(String str, byte[] bArr);

    int b();

    void b(byte[] bArr);

    @P
    byte[] b(byte[] bArr, byte[] bArr2);

    void c(byte[] bArr);

    byte[] c();

    tm d(byte[] bArr);

    void release();
}
