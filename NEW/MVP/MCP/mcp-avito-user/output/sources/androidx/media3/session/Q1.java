package androidx.media3.session;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.media3.session.P1;
import java.util.Arrays;

/* compiled from: SessionTokenImplBase.java */
/* loaded from: classes.dex */
final class Q1 implements P1.a {

    /* renamed from: k, reason: collision with root package name */
    public static final String f52244k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f52245l;

    /* renamed from: m, reason: collision with root package name */
    public static final String f52246m;

    /* renamed from: n, reason: collision with root package name */
    public static final String f52247n;

    /* renamed from: o, reason: collision with root package name */
    public static final String f52248o;

    /* renamed from: p, reason: collision with root package name */
    public static final String f52249p;

    /* renamed from: q, reason: collision with root package name */
    public static final String f52250q;

    /* renamed from: r, reason: collision with root package name */
    public static final String f52251r;

    /* renamed from: s, reason: collision with root package name */
    public static final String f52252s;

    /* renamed from: t, reason: collision with root package name */
    public static final M1 f52253t;

    /* renamed from: b, reason: collision with root package name */
    public final int f52254b;

    /* renamed from: c, reason: collision with root package name */
    public final int f52255c;

    /* renamed from: d, reason: collision with root package name */
    public final int f52256d;

    /* renamed from: e, reason: collision with root package name */
    public final int f52257e;

    /* renamed from: f, reason: collision with root package name */
    public final String f52258f;

    /* renamed from: g, reason: collision with root package name */
    public final String f52259g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    public final ComponentName f52260h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    public final IBinder f52261i;

    /* renamed from: j, reason: collision with root package name */
    public final Bundle f52262j;

    static {
        int i12 = androidx.media3.common.util.M.f47887a;
        f52244k = Integer.toString(0, 36);
        f52245l = Integer.toString(1, 36);
        f52246m = Integer.toString(2, 36);
        f52247n = Integer.toString(3, 36);
        f52248o = Integer.toString(4, 36);
        f52249p = Integer.toString(5, 36);
        f52250q = Integer.toString(6, 36);
        f52251r = Integer.toString(7, 36);
        f52252s = Integer.toString(8, 36);
        f52253t = new M1(1);
    }

    public Q1(int i12, int i13, int i14, int i15, String str, String str2, @j.P ComponentName componentName, @j.P IBinder iBinder, Bundle bundle) {
        this.f52254b = i12;
        this.f52255c = i13;
        this.f52256d = i14;
        this.f52257e = i15;
        this.f52258f = str;
        this.f52259g = str2;
        this.f52260h = componentName;
        this.f52261i = iBinder;
        this.f52262j = bundle;
    }

    @Override // androidx.media3.session.P1.a
    public final int c() {
        return this.f52254b;
    }

    @Override // androidx.media3.session.P1.a
    @j.P
    public final ComponentName d() {
        return this.f52260h;
    }

    @Override // androidx.media3.session.P1.a
    public final String e() {
        return this.f52259g;
    }

    public final boolean equals(@j.P Object obj) {
        if (!(obj instanceof Q1)) {
            return false;
        }
        Q1 q12 = (Q1) obj;
        return this.f52254b == q12.f52254b && this.f52255c == q12.f52255c && this.f52256d == q12.f52256d && this.f52257e == q12.f52257e && TextUtils.equals(this.f52258f, q12.f52258f) && TextUtils.equals(this.f52259g, q12.f52259g) && androidx.media3.common.util.M.a(this.f52260h, q12.f52260h) && androidx.media3.common.util.M.a(this.f52261i, q12.f52261i);
    }

    @Override // androidx.media3.session.P1.a
    public final boolean f() {
        return false;
    }

    @Override // androidx.media3.session.P1.a
    public final Bundle getExtras() {
        return new Bundle(this.f52262j);
    }

    @Override // androidx.media3.session.P1.a
    public final String getPackageName() {
        return this.f52258f;
    }

    @Override // androidx.media3.session.P1.a
    public final int getType() {
        return this.f52255c;
    }

    @Override // androidx.media3.session.P1.a
    @j.P
    public final Object h() {
        return this.f52261i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f52254b), Integer.valueOf(this.f52255c), Integer.valueOf(this.f52256d), Integer.valueOf(this.f52257e), this.f52258f, this.f52259g, this.f52260h, this.f52261i});
    }

    @Override // androidx.media3.session.P1.a
    public final int i() {
        return this.f52257e;
    }

    @Override // androidx.media3.common.InterfaceC23096j
    public final Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putInt(f52244k, this.f52254b);
        bundle.putInt(f52245l, this.f52255c);
        bundle.putInt(f52246m, this.f52256d);
        bundle.putString(f52247n, this.f52258f);
        bundle.putString(f52248o, this.f52259g);
        bundle.putBinder(f52250q, this.f52261i);
        bundle.putParcelable(f52249p, this.f52260h);
        bundle.putBundle(f52251r, this.f52262j);
        bundle.putInt(f52252s, this.f52257e);
        return bundle;
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.f52258f + " type=" + this.f52255c + " libraryVersion=" + this.f52256d + " interfaceVersion=" + this.f52257e + " service=" + this.f52259g + " IMediaSession=" + this.f52261i + " extras=" + this.f52262j + "}";
    }
}
