package androidx.compose.foundation.pager;

import androidx.compose.foundation.M1;
import androidx.compose.foundation.gestures.InterfaceC20481m2;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LazyLayoutPager.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.pager.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20810d extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.gestures.snapping.v f29901A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C22096n f29902B;

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ int f29903C;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ int f29904D;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f29905l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m0 f29906m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ T1 f29907n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f29908o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Orientation f29909p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20481m2 f29910q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f29911r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ M1 f29912s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f29913t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f29914u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20823q f29915v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.input.nestedscroll.a f29916w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Integer, Object> f29917x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22215f.b f29918y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22215f.c f29919z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20810d(androidx.compose.ui.v vVar, m0 m0Var, T1 t12, boolean z12, Orientation orientation, InterfaceC20481m2 interfaceC20481m2, boolean z13, M1 m12, int i12, float f12, InterfaceC20823q interfaceC20823q, androidx.compose.ui.input.nestedscroll.a aVar, Y41.l lVar, InterfaceC22215f.b bVar, InterfaceC22215f.c cVar, androidx.compose.foundation.gestures.snapping.v vVar2, C22096n c22096n, int i13, int i14) {
        super(2);
        this.f29905l = vVar;
        this.f29906m = m0Var;
        this.f29907n = t12;
        this.f29908o = z12;
        this.f29909p = orientation;
        this.f29910q = interfaceC20481m2;
        this.f29911r = z13;
        this.f29912s = m12;
        this.f29913t = i12;
        this.f29914u = f12;
        this.f29915v = interfaceC20823q;
        this.f29916w = aVar;
        this.f29917x = lVar;
        this.f29918y = bVar;
        this.f29919z = cVar;
        this.f29901A = vVar2;
        this.f29902B = c22096n;
        this.f29903C = i13;
        this.f29904D = i14;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f29903C | 1);
        int iA3 = C22066f2.a(this.f29904D);
        m0 m0Var = this.f29906m;
        Orientation orientation = this.f29909p;
        InterfaceC22215f.b bVar = this.f29918y;
        InterfaceC22215f.c cVar = this.f29919z;
        C20817k.a(this.f29905l, m0Var, this.f29907n, this.f29908o, orientation, this.f29910q, this.f29911r, this.f29912s, this.f29913t, this.f29914u, this.f29915v, this.f29916w, this.f29917x, bVar, cVar, this.f29901A, this.f29902B, a12, iA2, iA3);
        return G0.f406611a;
    }
}
