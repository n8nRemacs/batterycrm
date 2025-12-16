package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import j.P;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: DataSpec.java */
@J
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f48245a;

    /* renamed from: b, reason: collision with root package name */
    public final long f48246b;

    /* renamed from: c, reason: collision with root package name */
    public final int f48247c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final byte[] f48248d;

    /* renamed from: e, reason: collision with root package name */
    public final Map<String, String> f48249e;

    /* renamed from: f, reason: collision with root package name */
    public final long f48250f;

    /* renamed from: g, reason: collision with root package name */
    public final long f48251g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public final String f48252h;

    /* renamed from: i, reason: collision with root package name */
    public final int f48253i;

    /* renamed from: j, reason: collision with root package name */
    @P
    public final Object f48254j;

    /* compiled from: DataSpec.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    /* compiled from: DataSpec.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    static {
        androidx.media3.common.A.a("media3.datasource");
    }

    public static String b(int i12) {
        if (i12 == 1) {
            return "GET";
        }
        if (i12 == 2) {
            return "POST";
        }
        if (i12 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public final b a() {
        return new b(this, null);
    }

    public final boolean c(int i12) {
        return (this.f48253i & i12) == i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        sb2.append(b(this.f48247c));
        sb2.append(" ");
        sb2.append(this.f48245a);
        sb2.append(", ");
        sb2.append(this.f48250f);
        sb2.append(", ");
        sb2.append(this.f48251g);
        sb2.append(", ");
        sb2.append(this.f48252h);
        sb2.append(", ");
        return AK.c.i(this.f48253i, "]", sb2);
    }

    public o(Uri uri, long j12, int i12, @P byte[] bArr, Map<String, String> map, long j13, long j14, @P String str, int i13, @P Object obj) {
        byte[] bArr2 = bArr;
        C23110a.b(j12 + j13 >= 0);
        C23110a.b(j13 >= 0);
        C23110a.b(j14 > 0 || j14 == -1);
        this.f48245a = uri;
        this.f48246b = j12;
        this.f48247c = i12;
        this.f48248d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f48249e = Collections.unmodifiableMap(new HashMap(map));
        this.f48250f = j13;
        this.f48251g = j14;
        this.f48252h = str;
        this.f48253i = i13;
        this.f48254j = obj;
    }

    /* compiled from: DataSpec.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @P
        public Uri f48255a;

        /* renamed from: b, reason: collision with root package name */
        public final long f48256b;

        /* renamed from: c, reason: collision with root package name */
        public int f48257c;

        /* renamed from: d, reason: collision with root package name */
        @P
        public byte[] f48258d;

        /* renamed from: e, reason: collision with root package name */
        public Map<String, String> f48259e;

        /* renamed from: f, reason: collision with root package name */
        public long f48260f;

        /* renamed from: g, reason: collision with root package name */
        public long f48261g;

        /* renamed from: h, reason: collision with root package name */
        @P
        public String f48262h;

        /* renamed from: i, reason: collision with root package name */
        public int f48263i;

        /* renamed from: j, reason: collision with root package name */
        @P
        public final Object f48264j;

        public b() {
            this.f48257c = 1;
            this.f48259e = Collections.emptyMap();
            this.f48261g = -1L;
        }

        public final o a() {
            if (this.f48255a != null) {
                return new o(this.f48255a, this.f48256b, this.f48257c, this.f48258d, this.f48259e, this.f48260f, this.f48261g, this.f48262h, this.f48263i, this.f48264j);
            }
            throw new IllegalStateException("The uri must be set.");
        }

        public b(o oVar, a aVar) {
            this.f48255a = oVar.f48245a;
            this.f48256b = oVar.f48246b;
            this.f48257c = oVar.f48247c;
            this.f48258d = oVar.f48248d;
            this.f48259e = oVar.f48249e;
            this.f48260f = oVar.f48250f;
            this.f48261g = oVar.f48251g;
            this.f48262h = oVar.f48252h;
            this.f48263i = oVar.f48253i;
            this.f48264j = oVar.f48254j;
        }
    }
}
