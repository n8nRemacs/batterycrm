package com.google.android.exoplayer2.text.webvtt;

import j.InterfaceC42156l;
import j.P;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.Set;

/* compiled from: WebvttCssStyle.java */
/* loaded from: classes6.dex */
public final class d {

    /* renamed from: f, reason: collision with root package name */
    @InterfaceC42156l
    public int f347087f;

    /* renamed from: h, reason: collision with root package name */
    public int f347089h;

    /* renamed from: o, reason: collision with root package name */
    public float f347096o;

    /* renamed from: a, reason: collision with root package name */
    public String f347082a = "";

    /* renamed from: b, reason: collision with root package name */
    public String f347083b = "";

    /* renamed from: c, reason: collision with root package name */
    public Set<String> f347084c = Collections.emptySet();

    /* renamed from: d, reason: collision with root package name */
    public String f347085d = "";

    /* renamed from: e, reason: collision with root package name */
    @P
    public String f347086e = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f347088g = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f347090i = false;

    /* renamed from: j, reason: collision with root package name */
    public final int f347091j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f347092k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f347093l = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f347094m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f347095n = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f347097p = -1;

    /* renamed from: q, reason: collision with root package name */
    public boolean f347098q = false;

    /* compiled from: WebvttCssStyle.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* compiled from: WebvttCssStyle.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public static int a(int i12, int i13, String str, @P String str2) {
        if (str.isEmpty() || i12 == -1) {
            return i12;
        }
        if (str.equals(str2)) {
            return i12 + i13;
        }
        return -1;
    }
}
