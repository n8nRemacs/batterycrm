package com.google.android.exoplayer2.text.ttml;

import android.text.Layout;
import j.P;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: TtmlStyle.java */
/* loaded from: classes6.dex */
final class g {

    /* renamed from: a, reason: collision with root package name */
    @P
    public String f347043a;

    /* renamed from: b, reason: collision with root package name */
    public int f347044b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f347045c;

    /* renamed from: d, reason: collision with root package name */
    public int f347046d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f347047e;

    /* renamed from: k, reason: collision with root package name */
    public float f347053k;

    /* renamed from: l, reason: collision with root package name */
    @P
    public String f347054l;

    /* renamed from: o, reason: collision with root package name */
    @P
    public Layout.Alignment f347057o;

    /* renamed from: p, reason: collision with root package name */
    @P
    public Layout.Alignment f347058p;

    /* renamed from: r, reason: collision with root package name */
    @P
    public com.google.android.exoplayer2.text.ttml.b f347060r;

    /* renamed from: f, reason: collision with root package name */
    public int f347048f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f347049g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f347050h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f347051i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f347052j = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f347055m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f347056n = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f347059q = -1;

    /* renamed from: s, reason: collision with root package name */
    public float f347061s = Float.MAX_VALUE;

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

    public final void a(@P g gVar) {
        int i12;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f347045c && gVar.f347045c) {
                this.f347044b = gVar.f347044b;
                this.f347045c = true;
            }
            if (this.f347050h == -1) {
                this.f347050h = gVar.f347050h;
            }
            if (this.f347051i == -1) {
                this.f347051i = gVar.f347051i;
            }
            if (this.f347043a == null && (str = gVar.f347043a) != null) {
                this.f347043a = str;
            }
            if (this.f347048f == -1) {
                this.f347048f = gVar.f347048f;
            }
            if (this.f347049g == -1) {
                this.f347049g = gVar.f347049g;
            }
            if (this.f347056n == -1) {
                this.f347056n = gVar.f347056n;
            }
            if (this.f347057o == null && (alignment2 = gVar.f347057o) != null) {
                this.f347057o = alignment2;
            }
            if (this.f347058p == null && (alignment = gVar.f347058p) != null) {
                this.f347058p = alignment;
            }
            if (this.f347059q == -1) {
                this.f347059q = gVar.f347059q;
            }
            if (this.f347052j == -1) {
                this.f347052j = gVar.f347052j;
                this.f347053k = gVar.f347053k;
            }
            if (this.f347060r == null) {
                this.f347060r = gVar.f347060r;
            }
            if (this.f347061s == Float.MAX_VALUE) {
                this.f347061s = gVar.f347061s;
            }
            if (!this.f347047e && gVar.f347047e) {
                this.f347046d = gVar.f347046d;
                this.f347047e = true;
            }
            if (this.f347055m != -1 || (i12 = gVar.f347055m) == -1) {
                return;
            }
            this.f347055m = i12;
        }
    }
}
