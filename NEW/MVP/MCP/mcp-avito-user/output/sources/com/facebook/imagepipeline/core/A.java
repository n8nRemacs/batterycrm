package com.facebook.imagepipeline.core;

import android.content.ContentResolver;
import android.net.Uri;
import cX0.C27123f;
import com.facebook.imagepipeline.cache.B;
import com.facebook.imagepipeline.cache.C36378k;
import com.facebook.imagepipeline.producers.B0;
import com.facebook.imagepipeline.producers.C0;
import com.facebook.imagepipeline.producers.C36393a;
import com.facebook.imagepipeline.producers.C36394a0;
import com.facebook.imagepipeline.producers.C36403f;
import com.facebook.imagepipeline.producers.C36405g;
import com.facebook.imagepipeline.producers.C36406h;
import com.facebook.imagepipeline.producers.C36409k;
import com.facebook.imagepipeline.producers.C36411m;
import com.facebook.imagepipeline.producers.C36412n;
import com.facebook.imagepipeline.producers.C36418u;
import com.facebook.imagepipeline.producers.C36419v;
import com.facebook.imagepipeline.producers.C36420w;
import com.facebook.imagepipeline.producers.C36421x;
import com.facebook.imagepipeline.producers.J;
import com.facebook.imagepipeline.producers.K;
import com.facebook.imagepipeline.producers.L;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;
import com.facebook.imagepipeline.producers.M;
import com.facebook.imagepipeline.producers.N;
import com.facebook.imagepipeline.producers.O;
import com.facebook.imagepipeline.producers.Q;
import com.facebook.imagepipeline.producers.U;
import com.facebook.imagepipeline.producers.V;
import com.facebook.imagepipeline.producers.Z;
import com.facebook.imagepipeline.producers.i0;
import com.facebook.imagepipeline.producers.o0;
import com.facebook.imagepipeline.producers.w0;
import com.facebook.imagepipeline.producers.y0;
import com.facebook.imagepipeline.producers.z0;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.Nullsafe;
import j.P;
import j.k0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import vW0.C49274a;

/* compiled from: ProducerSequenceFactory.java */
@Nullsafe
/* loaded from: classes12.dex */
public class A {

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f340262a;

    /* renamed from: b, reason: collision with root package name */
    public final z f340263b;

    /* renamed from: c, reason: collision with root package name */
    public final V f340264c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f340265d;

    /* renamed from: e, reason: collision with root package name */
    public final y0 f340266e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f340267f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f340268g;

    /* renamed from: h, reason: collision with root package name */
    public final C27123f f340269h;

    /* renamed from: i, reason: collision with root package name */
    @k0
    @P
    public i0<com.facebook.common.references.a<YW0.b>> f340270i;

    /* renamed from: j, reason: collision with root package name */
    @P
    public i0<YW0.d> f340271j;

    /* renamed from: k, reason: collision with root package name */
    @k0
    @P
    public i0<com.facebook.common.references.a<YW0.b>> f340272k;

    /* renamed from: l, reason: collision with root package name */
    @k0
    @P
    public i0<com.facebook.common.references.a<YW0.b>> f340273l;

    /* renamed from: m, reason: collision with root package name */
    @k0
    @P
    public i0<com.facebook.common.references.a<YW0.b>> f340274m;

    /* renamed from: n, reason: collision with root package name */
    @k0
    @P
    public i0<com.facebook.common.references.a<YW0.b>> f340275n;

    /* renamed from: o, reason: collision with root package name */
    @k0
    @P
    public i0<com.facebook.common.references.a<YW0.b>> f340276o;

    /* renamed from: p, reason: collision with root package name */
    @k0
    @P
    public i0<com.facebook.common.references.a<YW0.b>> f340277p;

    /* renamed from: q, reason: collision with root package name */
    @k0
    @P
    public i0<com.facebook.common.references.a<YW0.b>> f340278q;

    /* renamed from: r, reason: collision with root package name */
    @k0
    public final HashMap f340279r = new HashMap();

    public A(ContentResolver contentResolver, z zVar, V v12, boolean z12, y0 y0Var, boolean z13, boolean z14, C27123f c27123f) {
        this.f340262a = contentResolver;
        this.f340263b = zVar;
        this.f340264c = v12;
        this.f340265d = z12;
        new HashMap();
        new HashMap();
        this.f340266e = y0Var;
        this.f340267f = z13;
        this.f340268g = z14;
        this.f340269h = c27123f;
    }

    public final synchronized i0<YW0.d> a() {
        try {
            com.facebook.imagepipeline.systrace.b.a();
            if (this.f340271j == null) {
                com.facebook.imagepipeline.systrace.b.a();
                z zVar = this.f340263b;
                C36393a c36393a = new C36393a(l(new U(zVar.f340379j, zVar.f340373d, this.f340264c)));
                this.f340271j = c36393a;
                this.f340271j = this.f340263b.a(c36393a, this.f340265d && !this.f340267f, this.f340269h);
                com.facebook.imagepipeline.systrace.b.a();
            }
            com.facebook.imagepipeline.systrace.b.a();
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f340271j;
    }

    public final synchronized i0<com.facebook.common.references.a<YW0.b>> b() {
        try {
            if (this.f340277p == null) {
                z zVar = this.f340263b;
                zVar.getClass();
                C36411m c36411m = new C36411m(com.facebook.common.executors.a.f339811b, zVar.f340379j);
                boolean z12 = zW0.c.f444048a;
                this.f340277p = j(this.f340263b.a(new C36393a(c36411m), true, this.f340269h));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f340277p;
    }

    public final i0<com.facebook.common.references.a<YW0.b>> c(ImageRequest imageRequest) {
        i0<com.facebook.common.references.a<YW0.b>> i0VarG;
        boolean z12 = true;
        com.facebook.imagepipeline.systrace.b.a();
        try {
            com.facebook.imagepipeline.systrace.b.a();
            imageRequest.getClass();
            Uri uri = imageRequest.f340782b;
            com.facebook.common.internal.o.c(uri, "Uri is null.");
            int i12 = imageRequest.f340783c;
            if (i12 != 0) {
                switch (i12) {
                    case 2:
                        i0VarG = g();
                        break;
                    case 3:
                        synchronized (this) {
                            try {
                                if (this.f340272k == null) {
                                    z zVar = this.f340263b;
                                    N n12 = new N(zVar.f340378i.b(), zVar.f340379j);
                                    z zVar2 = this.f340263b;
                                    this.f340272k = k(n12, new C0[]{new LocalExifThumbnailProducer(zVar2.f340378i.d(), zVar2.f340379j, zVar2.f340370a)});
                                }
                                i0VarG = this.f340272k;
                                break;
                            } finally {
                            }
                        }
                    case 4:
                        String type = this.f340262a.getType(uri);
                        Map<String, String> map = C49274a.f440819a;
                        if (type == null || !type.startsWith("video/")) {
                            z12 = false;
                        }
                        if (!z12) {
                            i0VarG = e();
                            break;
                        } else {
                            i0VarG = g();
                            break;
                        }
                        break;
                    case 5:
                        i0VarG = d();
                        break;
                    case 6:
                        i0VarG = f();
                        break;
                    case 7:
                        i0VarG = b();
                        break;
                    case 8:
                        i0VarG = h();
                        break;
                    default:
                        StringBuilder sb2 = new StringBuilder("Unsupported uri scheme! Uri is: ");
                        String strValueOf = String.valueOf(uri);
                        if (strValueOf.length() > 30) {
                            strValueOf = strValueOf.substring(0, 30) + "...";
                        }
                        sb2.append(strValueOf);
                        throw new IllegalArgumentException(sb2.toString());
                }
            } else {
                synchronized (this) {
                    try {
                        com.facebook.imagepipeline.systrace.b.a();
                        if (this.f340270i == null) {
                            com.facebook.imagepipeline.systrace.b.a();
                            this.f340270i = j(a());
                            com.facebook.imagepipeline.systrace.b.a();
                        }
                        com.facebook.imagepipeline.systrace.b.a();
                        i0VarG = this.f340270i;
                    } finally {
                    }
                }
            }
            com.facebook.imagepipeline.systrace.b.a();
            if (imageRequest.f340793m != null) {
                synchronized (this) {
                    i0<com.facebook.common.references.a<YW0.b>> i0Var = (i0) this.f340279r.get(i0VarG);
                    if (i0Var == null) {
                        z zVar3 = this.f340263b;
                        C36394a0 c36394a0 = new C36394a0(i0VarG, zVar3.f340385p, zVar3.f340378i.a());
                        z zVar4 = this.f340263b;
                        Z z13 = new Z(zVar4.f340383n, zVar4.f340384o, c36394a0);
                        this.f340279r.put(i0VarG, z13);
                        i0VarG = z13;
                    } else {
                        i0VarG = i0Var;
                    }
                }
            }
            com.facebook.imagepipeline.systrace.b.a();
            return i0VarG;
        } catch (Throwable th2) {
            com.facebook.imagepipeline.systrace.b.a();
            throw th2;
        }
    }

    public final synchronized i0<com.facebook.common.references.a<YW0.b>> d() {
        try {
            if (this.f340276o == null) {
                z zVar = this.f340263b;
                J j12 = new J(zVar.f340378i.b(), zVar.f340379j, zVar.f340372c);
                z zVar2 = this.f340263b;
                this.f340276o = k(j12, new C0[]{new LocalExifThumbnailProducer(zVar2.f340378i.d(), zVar2.f340379j, zVar2.f340370a)});
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f340276o;
    }

    public final synchronized i0<com.facebook.common.references.a<YW0.b>> e() {
        try {
            if (this.f340274m == null) {
                z zVar = this.f340263b;
                K k12 = new K(zVar.f340378i.b(), zVar.f340379j, zVar.f340370a);
                z zVar2 = this.f340263b;
                zVar2.getClass();
                L l12 = new L(zVar2.f340378i.b(), zVar2.f340379j, zVar2.f340370a);
                z zVar3 = this.f340263b;
                this.f340274m = k(k12, new C0[]{l12, new LocalExifThumbnailProducer(zVar3.f340378i.d(), zVar3.f340379j, zVar3.f340370a)});
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f340274m;
    }

    public final synchronized i0<com.facebook.common.references.a<YW0.b>> f() {
        try {
            if (this.f340275n == null) {
                z zVar = this.f340263b;
                O o12 = new O(zVar.f340378i.b(), zVar.f340379j, zVar.f340371b);
                z zVar2 = this.f340263b;
                this.f340275n = k(o12, new C0[]{new LocalExifThumbnailProducer(zVar2.f340378i.d(), zVar2.f340379j, zVar2.f340370a)});
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f340275n;
    }

    public final synchronized i0<com.facebook.common.references.a<YW0.b>> g() {
        try {
            if (this.f340273l == null) {
                z zVar = this.f340263b;
                this.f340273l = i(new Q(zVar.f340378i.b(), zVar.f340370a));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f340273l;
    }

    public final synchronized i0<com.facebook.common.references.a<YW0.b>> h() {
        try {
            if (this.f340278q == null) {
                z zVar = this.f340263b;
                o0 o0Var = new o0(zVar.f340378i.b(), zVar.f340379j, zVar.f340370a);
                z zVar2 = this.f340263b;
                this.f340278q = k(o0Var, new C0[]{new LocalExifThumbnailProducer(zVar2.f340378i.d(), zVar2.f340379j, zVar2.f340370a)});
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f340278q;
    }

    public final i0<com.facebook.common.references.a<YW0.b>> i(i0<com.facebook.common.references.a<YW0.b>> i0Var) {
        z zVar = this.f340263b;
        B b12 = zVar.f340383n;
        com.facebook.imagepipeline.cache.o oVar = zVar.f340384o;
        return new C36403f(zVar.f340383n, oVar, new w0(new C36405g(oVar, new C36406h(b12, oVar, i0Var)), this.f340266e));
    }

    public final i0<com.facebook.common.references.a<YW0.b>> j(i0<YW0.d> i0Var) {
        com.facebook.imagepipeline.systrace.b.a();
        z zVar = this.f340263b;
        ExecutorService executorServiceE = zVar.f340378i.e();
        com.facebook.common.internal.r<Boolean> rVar = com.facebook.common.internal.t.f339828a;
        i0<com.facebook.common.references.a<YW0.b>> i0VarI = i(new C36412n(zVar.f340373d, executorServiceE, zVar.f340374e, zVar.f340375f, zVar.f340376g, zVar.f340377h, i0Var, zVar.f340387r, zVar.f340386q, rVar));
        com.facebook.imagepipeline.systrace.b.a();
        return i0VarI;
    }

    public final i0 k(M m12, C0[] c0Arr) {
        C36393a c36393a = new C36393a(l(m12));
        C27123f c27123f = this.f340269h;
        z zVar = this.f340263b;
        return j(new C36409k(zVar.a(new B0(c0Arr), true, c27123f), new z0(zVar.f340378i.c(), zVar.a(c36393a, true, c27123f))));
    }

    public final C36420w l(i0 i0Var) {
        boolean z12 = zW0.c.f444048a;
        boolean z13 = this.f340268g;
        z zVar = this.f340263b;
        if (z13) {
            com.facebook.imagepipeline.systrace.b.a();
            com.facebook.imagepipeline.cache.o oVar = zVar.f340384o;
            C36378k c36378k = zVar.f340380k;
            C36378k c36378k2 = zVar.f340381l;
            i0Var = new C36418u(c36378k, c36378k2, oVar, new C36419v(c36378k, c36378k2, oVar, i0Var));
            com.facebook.imagepipeline.systrace.b.a();
        }
        B b12 = zVar.f340382m;
        com.facebook.imagepipeline.cache.o oVar2 = zVar.f340384o;
        return new C36420w(oVar2, new C36421x(b12, oVar2, i0Var));
    }
}
