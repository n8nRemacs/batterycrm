package com.google.android.exoplayer2.text.ttml;

import com.google.common.collect.H1;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Pattern;

/* compiled from: TextEmphasis.java */
/* loaded from: classes6.dex */
final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f346996d = Pattern.compile("\\s+");

    /* renamed from: e, reason: collision with root package name */
    public static final H1<String> f346997e = H1.I("auto", "none");

    /* renamed from: f, reason: collision with root package name */
    public static final H1<String> f346998f = H1.K("dot", "sesame", "circle");

    /* renamed from: g, reason: collision with root package name */
    public static final H1<String> f346999g = H1.I("filled", "open");

    /* renamed from: h, reason: collision with root package name */
    public static final H1<String> f347000h = H1.K("after", "before", "outside");

    /* renamed from: a, reason: collision with root package name */
    public final int f347001a;

    /* renamed from: b, reason: collision with root package name */
    public final int f347002b;

    /* renamed from: c, reason: collision with root package name */
    public final int f347003c;

    /* compiled from: TextEmphasis.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public b(int i12, int i13, int i14) {
        this.f347001a = i12;
        this.f347002b = i13;
        this.f347003c = i14;
    }
}
