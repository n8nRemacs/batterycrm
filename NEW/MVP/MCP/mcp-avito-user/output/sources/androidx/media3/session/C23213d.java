package androidx.media3.session;

import aZ0.InterfaceC19845a;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.media3.common.InterfaceC23096j;
import androidx.media3.common.util.C23110a;
import j.InterfaceC42165v;
import java.util.Arrays;

/* compiled from: CommandButton.java */
/* renamed from: androidx.media3.session.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23213d implements InterfaceC23096j {

    /* renamed from: h, reason: collision with root package name */
    public static final String f52416h;

    /* renamed from: i, reason: collision with root package name */
    public static final String f52417i;

    /* renamed from: j, reason: collision with root package name */
    public static final String f52418j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f52419k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f52420l;

    /* renamed from: m, reason: collision with root package name */
    public static final String f52421m;

    /* renamed from: n, reason: collision with root package name */
    @androidx.media3.common.util.J
    public static final M1 f52422n;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final K1 f52423b;

    /* renamed from: c, reason: collision with root package name */
    public final int f52424c;

    /* renamed from: d, reason: collision with root package name */
    @InterfaceC42165v
    public final int f52425d;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f52426e;

    /* renamed from: f, reason: collision with root package name */
    @androidx.media3.common.util.J
    public final Bundle f52427f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f52428g;

    /* compiled from: CommandButton.java */
    /* renamed from: androidx.media3.session.d$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        public K1 f52429a;

        /* renamed from: c, reason: collision with root package name */
        @InterfaceC42165v
        public int f52431c;

        /* renamed from: f, reason: collision with root package name */
        public boolean f52434f;

        /* renamed from: d, reason: collision with root package name */
        public CharSequence f52432d = "";

        /* renamed from: e, reason: collision with root package name */
        public Bundle f52433e = Bundle.EMPTY;

        /* renamed from: b, reason: collision with root package name */
        public int f52430b = -1;

        public final C23213d a() {
            return new C23213d(this.f52429a, this.f52430b, this.f52431c, this.f52432d, this.f52433e, this.f52434f);
        }

        @InterfaceC19845a
        public final void b(String str) {
            this.f52432d = str;
        }

        @InterfaceC19845a
        public final void c(Bundle bundle) {
            this.f52433e = new Bundle(bundle);
        }

        @InterfaceC19845a
        public final void d(@InterfaceC42165v int i12) {
            this.f52431c = i12;
        }

        @InterfaceC19845a
        public final void e(int i12) {
            C23110a.a("sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.", this.f52429a == null);
            this.f52430b = i12;
        }
    }

    static {
        int i12 = androidx.media3.common.util.M.f47887a;
        f52416h = Integer.toString(0, 36);
        f52417i = Integer.toString(1, 36);
        f52418j = Integer.toString(2, 36);
        f52419k = Integer.toString(3, 36);
        f52420l = Integer.toString(4, 36);
        f52421m = Integer.toString(5, 36);
        f52422n = new M1(3);
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23213d)) {
            return false;
        }
        C23213d c23213d = (C23213d) obj;
        return com.google.common.base.F.a(this.f52423b, c23213d.f52423b) && this.f52424c == c23213d.f52424c && this.f52425d == c23213d.f52425d && TextUtils.equals(this.f52426e, c23213d.f52426e) && this.f52428g == c23213d.f52428g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52423b, Integer.valueOf(this.f52424c), Integer.valueOf(this.f52425d), this.f52426e, Boolean.valueOf(this.f52428g)});
    }

    @Override // androidx.media3.common.InterfaceC23096j
    @androidx.media3.common.util.J
    public final Bundle k() {
        Bundle bundle = new Bundle();
        K1 k12 = this.f52423b;
        if (k12 != null) {
            bundle.putBundle(f52416h, k12.k());
        }
        bundle.putInt(f52417i, this.f52424c);
        bundle.putInt(f52418j, this.f52425d);
        bundle.putCharSequence(f52419k, this.f52426e);
        bundle.putBundle(f52420l, this.f52427f);
        bundle.putBoolean(f52421m, this.f52428g);
        return bundle;
    }

    public C23213d(@j.P K1 k12, int i12, @InterfaceC42165v int i13, CharSequence charSequence, Bundle bundle, boolean z12) {
        this.f52423b = k12;
        this.f52424c = i12;
        this.f52425d = i13;
        this.f52426e = charSequence;
        this.f52427f = new Bundle(bundle);
        this.f52428g = z12;
    }
}
