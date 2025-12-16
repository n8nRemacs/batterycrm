package androidx.media3.extractor.text.ttml;

import aZ0.InterfaceC19845a;
import android.text.Layout;
import j.P;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: TtmlStyle.java */
/* loaded from: classes.dex */
final class g {

    /* renamed from: a, reason: collision with root package name */
    @P
    public String f51406a;

    /* renamed from: b, reason: collision with root package name */
    public int f51407b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f51408c;

    /* renamed from: d, reason: collision with root package name */
    public int f51409d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f51410e;

    /* renamed from: k, reason: collision with root package name */
    public float f51416k;

    /* renamed from: l, reason: collision with root package name */
    @P
    public String f51417l;

    /* renamed from: o, reason: collision with root package name */
    @P
    public Layout.Alignment f51420o;

    /* renamed from: p, reason: collision with root package name */
    @P
    public Layout.Alignment f51421p;

    /* renamed from: r, reason: collision with root package name */
    @P
    public androidx.media3.extractor.text.ttml.b f51423r;

    /* renamed from: f, reason: collision with root package name */
    public int f51411f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f51412g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f51413h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f51414i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f51415j = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f51418m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f51419n = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f51422q = -1;

    /* renamed from: s, reason: collision with root package name */
    public float f51424s = Float.MAX_VALUE;

    /* compiled from: TtmlStyle.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* compiled from: TtmlStyle.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* compiled from: TtmlStyle.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    @InterfaceC19845a
    public final void a(@P g gVar) {
        int i12;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f51408c && gVar.f51408c) {
                this.f51407b = gVar.f51407b;
                this.f51408c = true;
            }
            if (this.f51413h == -1) {
                this.f51413h = gVar.f51413h;
            }
            if (this.f51414i == -1) {
                this.f51414i = gVar.f51414i;
            }
            if (this.f51406a == null && (str = gVar.f51406a) != null) {
                this.f51406a = str;
            }
            if (this.f51411f == -1) {
                this.f51411f = gVar.f51411f;
            }
            if (this.f51412g == -1) {
                this.f51412g = gVar.f51412g;
            }
            if (this.f51419n == -1) {
                this.f51419n = gVar.f51419n;
            }
            if (this.f51420o == null && (alignment2 = gVar.f51420o) != null) {
                this.f51420o = alignment2;
            }
            if (this.f51421p == null && (alignment = gVar.f51421p) != null) {
                this.f51421p = alignment;
            }
            if (this.f51422q == -1) {
                this.f51422q = gVar.f51422q;
            }
            if (this.f51415j == -1) {
                this.f51415j = gVar.f51415j;
                this.f51416k = gVar.f51416k;
            }
            if (this.f51423r == null) {
                this.f51423r = gVar.f51423r;
            }
            if (this.f51424s == Float.MAX_VALUE) {
                this.f51424s = gVar.f51424s;
            }
            if (!this.f51410e && gVar.f51410e) {
                this.f51409d = gVar.f51409d;
                this.f51410e = true;
            }
            if (this.f51418m != -1 || (i12 = gVar.f51418m) == -1) {
                return;
            }
            this.f51418m = i12;
        }
    }
}
