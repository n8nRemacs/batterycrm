package com.bumptech.glide.load.model;

import android.net.Uri;
import android.text.TextUtils;
import j.N;
import j.P;
import java.net.URL;
import java.security.MessageDigest;

/* compiled from: GlideUrl.java */
/* loaded from: classes5.dex */
public class g implements com.bumptech.glide.load.h {

    /* renamed from: b, reason: collision with root package name */
    public final j f339219b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final URL f339220c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final String f339221d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public String f339222e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public URL f339223f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public volatile byte[] f339224g;

    /* renamed from: h, reason: collision with root package name */
    public int f339225h;

    public g(URL url) {
        j jVar = h.f339226a;
        com.bumptech.glide.util.k.c(url, "Argument must not be null");
        this.f339220c = url;
        this.f339221d = null;
        com.bumptech.glide.util.k.c(jVar, "Argument must not be null");
        this.f339219b = jVar;
    }

    @Override // com.bumptech.glide.load.h
    public final void b(@N MessageDigest messageDigest) {
        if (this.f339224g == null) {
            this.f339224g = c().getBytes(com.bumptech.glide.load.h.f339193a);
        }
        messageDigest.update(this.f339224g);
    }

    public final String c() {
        String str = this.f339221d;
        if (str != null) {
            return str;
        }
        URL url = this.f339220c;
        com.bumptech.glide.util.k.c(url, "Argument must not be null");
        return url.toString();
    }

    public final URL d() {
        if (this.f339223f == null) {
            if (TextUtils.isEmpty(this.f339222e)) {
                String string = this.f339221d;
                if (TextUtils.isEmpty(string)) {
                    URL url = this.f339220c;
                    com.bumptech.glide.util.k.c(url, "Argument must not be null");
                    string = url.toString();
                }
                this.f339222e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f339223f = new URL(this.f339222e);
        }
        return this.f339223f;
    }

    @Override // com.bumptech.glide.load.h
    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return c().equals(gVar.c()) && this.f339219b.equals(gVar.f339219b);
    }

    @Override // com.bumptech.glide.load.h
    public final int hashCode() {
        if (this.f339225h == 0) {
            int iHashCode = c().hashCode();
            this.f339225h = iHashCode;
            this.f339225h = this.f339219b.f339227b.hashCode() + (iHashCode * 31);
        }
        return this.f339225h;
    }

    public final String toString() {
        return c();
    }

    public g(String str) {
        this(str, h.f339226a);
    }

    public g(String str, j jVar) {
        this.f339220c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f339221d = str;
            com.bumptech.glide.util.k.c(jVar, "Argument must not be null");
            this.f339219b = jVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
