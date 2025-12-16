package com.google.android.exoplayer2.text.span;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: TextEmphasisSpan.java */
/* loaded from: classes6.dex */
public final class f implements com.google.android.exoplayer2.text.span.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f346949a;

    /* renamed from: b, reason: collision with root package name */
    public final int f346950b;

    /* renamed from: c, reason: collision with root package name */
    public final int f346951c;

    /* compiled from: TextEmphasisSpan.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* compiled from: TextEmphasisSpan.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public f(int i12, int i13, int i14) {
        this.f346949a = i12;
        this.f346950b = i13;
        this.f346951c = i14;
    }
}
