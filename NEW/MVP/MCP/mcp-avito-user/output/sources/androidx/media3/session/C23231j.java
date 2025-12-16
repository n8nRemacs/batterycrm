package androidx.media3.session;

import android.os.Bundle;
import androidx.media3.common.InterfaceC23096j;

/* compiled from: ConnectionRequest.java */
/* renamed from: androidx.media3.session.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C23231j implements InterfaceC23096j {

    /* renamed from: g, reason: collision with root package name */
    public static final String f52527g;

    /* renamed from: h, reason: collision with root package name */
    public static final String f52528h;

    /* renamed from: i, reason: collision with root package name */
    public static final String f52529i;

    /* renamed from: j, reason: collision with root package name */
    public static final String f52530j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f52531k;

    /* renamed from: l, reason: collision with root package name */
    public static final C23228i f52532l;

    /* renamed from: b, reason: collision with root package name */
    public final int f52533b;

    /* renamed from: c, reason: collision with root package name */
    public final int f52534c;

    /* renamed from: d, reason: collision with root package name */
    public final String f52535d;

    /* renamed from: e, reason: collision with root package name */
    public final int f52536e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f52537f;

    static {
        int i12 = androidx.media3.common.util.M.f47887a;
        f52527g = Integer.toString(0, 36);
        f52528h = Integer.toString(1, 36);
        f52529i = Integer.toString(2, 36);
        f52530j = Integer.toString(3, 36);
        f52531k = Integer.toString(4, 36);
        f52532l = new C23228i(0);
    }

    public C23231j(String str, int i12, Bundle bundle) {
        this(1001001300, 3, str, i12, new Bundle(bundle));
    }

    @Override // androidx.media3.common.InterfaceC23096j
    public final Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putInt(f52527g, this.f52533b);
        bundle.putString(f52528h, this.f52535d);
        bundle.putInt(f52529i, this.f52536e);
        bundle.putBundle(f52530j, this.f52537f);
        bundle.putInt(f52531k, this.f52534c);
        return bundle;
    }

    public C23231j(int i12, int i13, String str, int i14, Bundle bundle) {
        this.f52533b = i12;
        this.f52534c = i13;
        this.f52535d = str;
        this.f52536e = i14;
        this.f52537f = bundle;
    }
}
