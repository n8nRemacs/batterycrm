package com.google.android.exoplayer2.ui;

import android.view.View;
import j.P;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: AdOverlayInfo.java */
/* renamed from: com.google.android.exoplayer2.ui.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36563a {

    /* renamed from: a, reason: collision with root package name */
    public final View f347447a;

    /* renamed from: b, reason: collision with root package name */
    public final int f347448b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final String f347449c;

    /* compiled from: AdOverlayInfo.java */
    /* renamed from: com.google.android.exoplayer2.ui.a$a, reason: collision with other inner class name */
    public static final class C10609a {
    }

    /* compiled from: AdOverlayInfo.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.ui.a$b */
    public @interface b {
    }

    @Deprecated
    public C36563a(View view, int i12, @P String str) {
        this.f347447a = view;
        this.f347448b = i12;
        this.f347449c = str;
    }
}
