package androidx.compose.foundation.pager;

import androidx.compose.foundation.M1;
import androidx.compose.foundation.gestures.InterfaceC20481m2;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: Pager.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.pager.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20830y extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f30046A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ int f30047B;

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ int f30048C;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m0 f30049l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f30050m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ T1 f30051n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20823q f30052o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f30053p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f30054q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22215f.c f30055r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20481m2 f30056s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f30057t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f30058u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Integer, Object> f30059v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.input.nestedscroll.a f30060w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.gestures.snapping.v f30061x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ M1 f30062y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ C22096n f30063z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20830y(m0 m0Var, androidx.compose.ui.v vVar, T1 t12, InterfaceC20823q interfaceC20823q, int i12, float f12, InterfaceC22215f.c cVar, InterfaceC20481m2 interfaceC20481m2, boolean z12, boolean z13, Y41.l lVar, androidx.compose.ui.input.nestedscroll.a aVar, androidx.compose.foundation.gestures.snapping.v vVar2, M1 m12, C22096n c22096n, int i13, int i14, int i15) {
        super(2);
        this.f30049l = m0Var;
        this.f30050m = vVar;
        this.f30051n = t12;
        this.f30052o = interfaceC20823q;
        this.f30053p = i12;
        this.f30054q = f12;
        this.f30055r = cVar;
        this.f30056s = interfaceC20481m2;
        this.f30057t = z12;
        this.f30058u = z13;
        this.f30059v = lVar;
        this.f30060w = aVar;
        this.f30061x = vVar2;
        this.f30062y = m12;
        this.f30063z = c22096n;
        this.f30046A = i13;
        this.f30047B = i14;
        this.f30048C = i15;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f30046A | 1);
        int iA3 = C22066f2.a(this.f30047B);
        m0 m0Var = this.f30049l;
        androidx.compose.foundation.gestures.snapping.v vVar = this.f30061x;
        int i12 = this.f30048C;
        J.a(m0Var, this.f30050m, this.f30051n, this.f30052o, this.f30053p, this.f30054q, this.f30055r, this.f30056s, this.f30057t, this.f30058u, this.f30059v, this.f30060w, vVar, this.f30062y, this.f30063z, a12, iA2, iA3, i12);
        return G0.f406611a;
    }
}
