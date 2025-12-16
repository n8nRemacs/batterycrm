package androidx.media3.session;

import android.content.ComponentName;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.media3.session.P1;
import java.util.Arrays;

/* compiled from: SessionTokenImplLegacy.java */
/* loaded from: classes.dex */
final class R1 implements P1.a {

    /* renamed from: h, reason: collision with root package name */
    public static final String f52266h;

    /* renamed from: i, reason: collision with root package name */
    public static final String f52267i;

    /* renamed from: j, reason: collision with root package name */
    public static final String f52268j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f52269k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f52270l;

    /* renamed from: m, reason: collision with root package name */
    public static final String f52271m;

    /* renamed from: n, reason: collision with root package name */
    public static final M1 f52272n;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final MediaSessionCompat.Token f52273b;

    /* renamed from: c, reason: collision with root package name */
    public final int f52274c;

    /* renamed from: d, reason: collision with root package name */
    public final int f52275d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public final ComponentName f52276e;

    /* renamed from: f, reason: collision with root package name */
    public final String f52277f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f52278g;

    static {
        int i12 = androidx.media3.common.util.M.f47887a;
        f52266h = Integer.toString(0, 36);
        f52267i = Integer.toString(1, 36);
        f52268j = Integer.toString(2, 36);
        f52269k = Integer.toString(3, 36);
        f52270l = Integer.toString(4, 36);
        f52271m = Integer.toString(5, 36);
        f52272n = new M1(2);
    }

    public R1(@j.P MediaSessionCompat.Token token, int i12, int i13, @j.P ComponentName componentName, String str, Bundle bundle) {
        this.f52273b = token;
        this.f52274c = i12;
        this.f52275d = i13;
        this.f52276e = componentName;
        this.f52277f = str;
        this.f52278g = bundle;
    }

    @Override // androidx.media3.session.P1.a
    public final int c() {
        return this.f52274c;
    }

    @Override // androidx.media3.session.P1.a
    @j.P
    public final ComponentName d() {
        return this.f52276e;
    }

    @Override // androidx.media3.session.P1.a
    public final String e() {
        ComponentName componentName = this.f52276e;
        return componentName == null ? "" : componentName.getClassName();
    }

    public final boolean equals(@j.P Object obj) {
        if (!(obj instanceof R1)) {
            return false;
        }
        R1 r12 = (R1) obj;
        int i12 = r12.f52275d;
        int i13 = this.f52275d;
        if (i13 != i12) {
            return false;
        }
        if (i13 == 100) {
            return androidx.media3.common.util.M.a(this.f52273b, r12.f52273b);
        }
        if (i13 != 101) {
            return false;
        }
        return androidx.media3.common.util.M.a(this.f52276e, r12.f52276e);
    }

    @Override // androidx.media3.session.P1.a
    public final boolean f() {
        return true;
    }

    @Override // androidx.media3.session.P1.a
    public final Bundle getExtras() {
        return new Bundle(this.f52278g);
    }

    @Override // androidx.media3.session.P1.a
    public final String getPackageName() {
        return this.f52277f;
    }

    @Override // androidx.media3.session.P1.a
    public final int getType() {
        return this.f52275d != 101 ? 0 : 2;
    }

    @Override // androidx.media3.session.P1.a
    @j.P
    public final Object h() {
        return this.f52273b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f52275d), this.f52276e, this.f52273b});
    }

    @Override // androidx.media3.session.P1.a
    public final int i() {
        return 0;
    }

    @Override // androidx.media3.common.InterfaceC23096j
    public final Bundle k() {
        Bundle bundle = new Bundle();
        MediaSessionCompat.Token token = this.f52273b;
        bundle.putBundle(f52266h, token == null ? null : token.toBundle());
        bundle.putInt(f52267i, this.f52274c);
        bundle.putInt(f52268j, this.f52275d);
        bundle.putParcelable(f52269k, this.f52276e);
        bundle.putString(f52270l, this.f52277f);
        bundle.putBundle(f52271m, this.f52278g);
        return bundle;
    }

    public final String toString() {
        return "SessionToken {legacyToken=" + this.f52273b + "}";
    }
}
