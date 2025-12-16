package com.google.android.exoplayer2.text;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.android.exoplayer2.InterfaceC36525h;
import com.google.android.exoplayer2.util.C36585a;
import j.InterfaceC42156l;
import j.P;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

/* compiled from: Cue.java */
/* loaded from: classes6.dex */
public final class a implements InterfaceC36525h {

    /* renamed from: s, reason: collision with root package name */
    public static final a f346715s;

    /* renamed from: t, reason: collision with root package name */
    public static final com.google.android.exoplayer2.analytics.h f346716t;

    /* renamed from: b, reason: collision with root package name */
    @P
    public final CharSequence f346717b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final Layout.Alignment f346718c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final Layout.Alignment f346719d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public final Bitmap f346720e;

    /* renamed from: f, reason: collision with root package name */
    public final float f346721f;

    /* renamed from: g, reason: collision with root package name */
    public final int f346722g;

    /* renamed from: h, reason: collision with root package name */
    public final int f346723h;

    /* renamed from: i, reason: collision with root package name */
    public final float f346724i;

    /* renamed from: j, reason: collision with root package name */
    public final int f346725j;

    /* renamed from: k, reason: collision with root package name */
    public final float f346726k;

    /* renamed from: l, reason: collision with root package name */
    public final float f346727l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f346728m;

    /* renamed from: n, reason: collision with root package name */
    public final int f346729n;

    /* renamed from: o, reason: collision with root package name */
    public final int f346730o;

    /* renamed from: p, reason: collision with root package name */
    public final float f346731p;

    /* renamed from: q, reason: collision with root package name */
    public final int f346732q;

    /* renamed from: r, reason: collision with root package name */
    public final float f346733r;

    /* compiled from: Cue.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* compiled from: Cue.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    /* compiled from: Cue.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    /* compiled from: Cue.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    static {
        c cVar = new c();
        cVar.f346734a = "";
        f346715s = cVar.a();
        f346716t = new com.google.android.exoplayer2.analytics.h(27);
    }

    public a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f12, int i12, int i13, float f13, int i14, int i15, float f14, float f15, float f16, boolean z12, int i16, int i17, float f17, C10598a c10598a) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            C36585a.b(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f346717b = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f346717b = charSequence.toString();
        } else {
            this.f346717b = null;
        }
        this.f346718c = alignment;
        this.f346719d = alignment2;
        this.f346720e = bitmap;
        this.f346721f = f12;
        this.f346722g = i12;
        this.f346723h = i13;
        this.f346724i = f13;
        this.f346725j = i14;
        this.f346726k = f15;
        this.f346727l = f16;
        this.f346728m = z12;
        this.f346729n = i16;
        this.f346730o = i15;
        this.f346731p = f14;
        this.f346732q = i17;
        this.f346733r = f17;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (TextUtils.equals(this.f346717b, aVar.f346717b) && this.f346718c == aVar.f346718c && this.f346719d == aVar.f346719d) {
            Bitmap bitmap = aVar.f346720e;
            Bitmap bitmap2 = this.f346720e;
            if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                if (this.f346721f == aVar.f346721f && this.f346722g == aVar.f346722g && this.f346723h == aVar.f346723h && this.f346724i == aVar.f346724i && this.f346725j == aVar.f346725j && this.f346726k == aVar.f346726k && this.f346727l == aVar.f346727l && this.f346728m == aVar.f346728m && this.f346729n == aVar.f346729n && this.f346730o == aVar.f346730o && this.f346731p == aVar.f346731p && this.f346732q == aVar.f346732q && this.f346733r == aVar.f346733r) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f346717b, this.f346718c, this.f346719d, this.f346720e, Float.valueOf(this.f346721f), Integer.valueOf(this.f346722g), Integer.valueOf(this.f346723h), Float.valueOf(this.f346724i), Integer.valueOf(this.f346725j), Float.valueOf(this.f346726k), Float.valueOf(this.f346727l), Boolean.valueOf(this.f346728m), Integer.valueOf(this.f346729n), Integer.valueOf(this.f346730o), Float.valueOf(this.f346731p), Integer.valueOf(this.f346732q), Float.valueOf(this.f346733r)});
    }

    /* compiled from: Cue.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @P
        public CharSequence f346734a;

        /* renamed from: b, reason: collision with root package name */
        @P
        public Bitmap f346735b;

        /* renamed from: c, reason: collision with root package name */
        @P
        public Layout.Alignment f346736c;

        /* renamed from: d, reason: collision with root package name */
        @P
        public Layout.Alignment f346737d;

        /* renamed from: e, reason: collision with root package name */
        public float f346738e;

        /* renamed from: f, reason: collision with root package name */
        public int f346739f;

        /* renamed from: g, reason: collision with root package name */
        public int f346740g;

        /* renamed from: h, reason: collision with root package name */
        public float f346741h;

        /* renamed from: i, reason: collision with root package name */
        public int f346742i;

        /* renamed from: j, reason: collision with root package name */
        public int f346743j;

        /* renamed from: k, reason: collision with root package name */
        public float f346744k;

        /* renamed from: l, reason: collision with root package name */
        public float f346745l;

        /* renamed from: m, reason: collision with root package name */
        public float f346746m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f346747n;

        /* renamed from: o, reason: collision with root package name */
        @InterfaceC42156l
        public int f346748o;

        /* renamed from: p, reason: collision with root package name */
        public int f346749p;

        /* renamed from: q, reason: collision with root package name */
        public float f346750q;

        public c() {
            this.f346734a = null;
            this.f346735b = null;
            this.f346736c = null;
            this.f346737d = null;
            this.f346738e = -3.4028235E38f;
            this.f346739f = BeduinInputModel.MIN_TEXT_VERSION;
            this.f346740g = BeduinInputModel.MIN_TEXT_VERSION;
            this.f346741h = -3.4028235E38f;
            this.f346742i = BeduinInputModel.MIN_TEXT_VERSION;
            this.f346743j = BeduinInputModel.MIN_TEXT_VERSION;
            this.f346744k = -3.4028235E38f;
            this.f346745l = -3.4028235E38f;
            this.f346746m = -3.4028235E38f;
            this.f346747n = false;
            this.f346748o = -16777216;
            this.f346749p = BeduinInputModel.MIN_TEXT_VERSION;
        }

        public final a a() {
            return new a(this.f346734a, this.f346736c, this.f346737d, this.f346735b, this.f346738e, this.f346739f, this.f346740g, this.f346741h, this.f346742i, this.f346743j, this.f346744k, this.f346745l, this.f346746m, this.f346747n, this.f346748o, this.f346749p, this.f346750q, null);
        }

        public c(a aVar, C10598a c10598a) {
            this.f346734a = aVar.f346717b;
            this.f346735b = aVar.f346720e;
            this.f346736c = aVar.f346718c;
            this.f346737d = aVar.f346719d;
            this.f346738e = aVar.f346721f;
            this.f346739f = aVar.f346722g;
            this.f346740g = aVar.f346723h;
            this.f346741h = aVar.f346724i;
            this.f346742i = aVar.f346725j;
            this.f346743j = aVar.f346730o;
            this.f346744k = aVar.f346731p;
            this.f346745l = aVar.f346726k;
            this.f346746m = aVar.f346727l;
            this.f346747n = aVar.f346728m;
            this.f346748o = aVar.f346729n;
            this.f346749p = aVar.f346732q;
            this.f346750q = aVar.f346733r;
        }
    }
}
