package androidx.media3.extractor.mp4;

import androidx.media3.common.C23108t;
import androidx.media3.common.util.J;
import j.P;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Track.java */
@J
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f51041a;

    /* renamed from: b, reason: collision with root package name */
    public final int f51042b;

    /* renamed from: c, reason: collision with root package name */
    public final long f51043c;

    /* renamed from: d, reason: collision with root package name */
    public final long f51044d;

    /* renamed from: e, reason: collision with root package name */
    public final long f51045e;

    /* renamed from: f, reason: collision with root package name */
    public final C23108t f51046f;

    /* renamed from: g, reason: collision with root package name */
    public final int f51047g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public final long[] f51048h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public final long[] f51049i;

    /* renamed from: j, reason: collision with root package name */
    public final int f51050j;

    /* renamed from: k, reason: collision with root package name */
    @P
    public final l[] f51051k;

    /* compiled from: Track.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public k(int i12, int i13, long j12, long j13, long j14, C23108t c23108t, int i14, @P l[] lVarArr, int i15, @P long[] jArr, @P long[] jArr2) {
        this.f51041a = i12;
        this.f51042b = i13;
        this.f51043c = j12;
        this.f51044d = j13;
        this.f51045e = j14;
        this.f51046f = c23108t;
        this.f51047g = i14;
        this.f51051k = lVarArr;
        this.f51050j = i15;
        this.f51048h = jArr;
        this.f51049i = jArr2;
    }
}
