package G41;

import java.util.HashMap;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;
import sberid.sdk.ui.models.root.UIColorMode;

/* loaded from: classes8.dex */
public final class i implements a {

    /* renamed from: a, reason: collision with root package name */
    public final D31.a f6330a;

    /* renamed from: b, reason: collision with root package name */
    public final Z1 f6331b;

    /* renamed from: c, reason: collision with root package name */
    public final Z1 f6332c;

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.sync.d f6333d;

    /* renamed from: e, reason: collision with root package name */
    public final Z1 f6334e;

    /* renamed from: f, reason: collision with root package name */
    public final Z1 f6335f;

    /* renamed from: g, reason: collision with root package name */
    public final Z1 f6336g;

    /* renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.sync.d f6337h;

    /* renamed from: i, reason: collision with root package name */
    public final Z1 f6338i;

    /* renamed from: j, reason: collision with root package name */
    public final kotlinx.coroutines.sync.d f6339j;

    /* renamed from: k, reason: collision with root package name */
    public final Z1 f6340k;

    /* renamed from: l, reason: collision with root package name */
    public final Z1 f6341l;

    /* renamed from: m, reason: collision with root package name */
    public final kotlinx.coroutines.sync.d f6342m;

    /* renamed from: n, reason: collision with root package name */
    public final Z1 f6343n;

    /* renamed from: o, reason: collision with root package name */
    public final Z1 f6344o;

    /* renamed from: p, reason: collision with root package name */
    public final Zb1.a f6345p;

    public i(D31.a aVar) {
        this.f6330a = aVar;
        Z1 z1A = p2.a(new N41.g());
        this.f6331b = z1A;
        this.f6332c = z1A;
        this.f6333d = new kotlinx.coroutines.sync.d();
        Z1 z1A2 = p2.a(UIColorMode.f437790d);
        this.f6334e = z1A2;
        this.f6335f = z1A2;
        Z1 z1A3 = p2.a(new HashMap());
        this.f6336g = z1A3;
        this.f6337h = new kotlinx.coroutines.sync.d();
        this.f6338i = z1A3;
        this.f6339j = new kotlinx.coroutines.sync.d();
        Z1 z1A4 = p2.a(new HashMap());
        this.f6340k = z1A4;
        this.f6341l = z1A4;
        this.f6342m = new kotlinx.coroutines.sync.d();
        Z1 z1A5 = p2.a(new HashMap());
        this.f6343n = z1A5;
        this.f6344o = z1A5;
        this.f6345p = new Zb1.a(null, null, 3, null);
    }

    public final void a(N41.g gVar) {
        C43259k.d((T) ((D31.g) this.f6330a).f2880a.getValue(), null, null, new g(this, gVar, null), 3);
    }

    public final void b(String str, boolean z12) {
        C43259k.d((T) ((D31.g) this.f6330a).f2880a.getValue(), null, null, new e(this, str, z12, null), 3);
    }

    public final void c(String str, boolean z12) {
        C43259k.d((T) ((D31.g) this.f6330a).f2880a.getValue(), null, null, new f(this, str, z12, null), 3);
    }
}
