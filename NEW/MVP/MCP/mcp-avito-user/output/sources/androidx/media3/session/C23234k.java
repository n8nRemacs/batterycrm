package androidx.media3.session;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.media3.common.H;
import androidx.media3.common.InterfaceC23096j;
import androidx.media3.common.util.C23114e;
import com.google.common.collect.AbstractC37401r1;
import java.lang.reflect.InvocationTargetException;

/* compiled from: ConnectionState.java */
/* renamed from: androidx.media3.session.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C23234k implements InterfaceC23096j {

    /* renamed from: l, reason: collision with root package name */
    public static final String f52543l;

    /* renamed from: m, reason: collision with root package name */
    public static final String f52544m;

    /* renamed from: n, reason: collision with root package name */
    public static final String f52545n;

    /* renamed from: o, reason: collision with root package name */
    public static final String f52546o;

    /* renamed from: p, reason: collision with root package name */
    public static final String f52547p;

    /* renamed from: q, reason: collision with root package name */
    public static final String f52548q;

    /* renamed from: r, reason: collision with root package name */
    public static final String f52549r;

    /* renamed from: s, reason: collision with root package name */
    public static final String f52550s;

    /* renamed from: t, reason: collision with root package name */
    public static final String f52551t;

    /* renamed from: u, reason: collision with root package name */
    public static final String f52552u;

    /* renamed from: v, reason: collision with root package name */
    public static final C23228i f52553v;

    /* renamed from: b, reason: collision with root package name */
    public final int f52554b;

    /* renamed from: c, reason: collision with root package name */
    public final int f52555c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC23246o f52556d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public final PendingIntent f52557e;

    /* renamed from: f, reason: collision with root package name */
    public final L1 f52558f;

    /* renamed from: g, reason: collision with root package name */
    public final H.c f52559g;

    /* renamed from: h, reason: collision with root package name */
    public final H.c f52560h;

    /* renamed from: i, reason: collision with root package name */
    public final Bundle f52561i;

    /* renamed from: j, reason: collision with root package name */
    public final D1 f52562j;

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC37401r1<C23213d> f52563k;

    static {
        int i12 = androidx.media3.common.util.M.f47887a;
        f52543l = Integer.toString(0, 36);
        f52544m = Integer.toString(1, 36);
        f52545n = Integer.toString(2, 36);
        f52546o = Integer.toString(9, 36);
        f52547p = Integer.toString(3, 36);
        f52548q = Integer.toString(4, 36);
        f52549r = Integer.toString(5, 36);
        f52550s = Integer.toString(6, 36);
        f52551t = Integer.toString(7, 36);
        f52552u = Integer.toString(8, 36);
        f52553v = new C23228i(1);
    }

    public C23234k(int i12, int i13, InterfaceC23246o interfaceC23246o, @j.P PendingIntent pendingIntent, AbstractC37401r1<C23213d> abstractC37401r1, L1 l12, H.c cVar, H.c cVar2, Bundle bundle, D1 d12) {
        this.f52554b = i12;
        this.f52555c = i13;
        this.f52556d = interfaceC23246o;
        this.f52558f = l12;
        this.f52559g = cVar;
        this.f52560h = cVar2;
        this.f52557e = pendingIntent;
        this.f52561i = bundle;
        this.f52562j = d12;
        this.f52563k = abstractC37401r1;
    }

    @Override // androidx.media3.common.InterfaceC23096j
    public final Bundle k() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Bundle bundle = new Bundle();
        bundle.putInt(f52543l, this.f52554b);
        bundle.putBinder(f52544m, this.f52556d.asBinder());
        bundle.putParcelable(f52545n, this.f52557e);
        AbstractC37401r1<C23213d> abstractC37401r1 = this.f52563k;
        if (!abstractC37401r1.isEmpty()) {
            bundle.putParcelableArrayList(f52546o, C23114e.b(abstractC37401r1));
        }
        bundle.putBundle(f52547p, this.f52558f.k());
        H.c cVar = this.f52559g;
        bundle.putBundle(f52548q, cVar.k());
        H.c cVar2 = this.f52560h;
        bundle.putBundle(f52549r, cVar2.k());
        bundle.putBundle(f52550s, this.f52561i);
        bundle.putBundle(f52551t, this.f52562j.q(C1.C(cVar, cVar2), false, false));
        bundle.putInt(f52552u, this.f52555c);
        return bundle;
    }
}
