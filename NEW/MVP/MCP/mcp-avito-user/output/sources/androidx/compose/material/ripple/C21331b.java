package androidx.compose.material.ripple;

import android.graphics.Canvas;
import android.view.ViewGroup;
import androidx.compose.foundation.interaction.o;
import androidx.compose.runtime.B2;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.C22245c;
import androidx.compose.ui.graphics.C22247d;
import androidx.compose.ui.graphics.M;
import androidx.compose.ui.graphics.T;
import java.util.LinkedHashMap;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: Ripple.android.kt */
@P
@s0
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/material/ripple/b;", "Landroidx/compose/material/ripple/v;", "Landroidx/compose/runtime/B2;", "Landroidx/compose/material/ripple/s;", "", "bounded", "Landroidx/compose/ui/unit/h;", "radius", "Landroidx/compose/runtime/I3;", "Landroidx/compose/ui/graphics/T;", "color", "Landroidx/compose/material/ripple/l;", "rippleAlpha", "Landroid/view/ViewGroup;", "view", "<init>", "(ZFLandroidx/compose/runtime/I3;Landroidx/compose/runtime/I3;Landroid/view/ViewGroup;Lkotlin/jvm/internal/w;)V", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* renamed from: androidx.compose.material.ripple.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21331b extends v implements B2, s {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f34058d;

    /* renamed from: e, reason: collision with root package name */
    public final float f34059e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final I3<T> f34060f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final I3<l> f34061g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f34062h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public r f34063i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f34064j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f34065k;

    /* renamed from: l, reason: collision with root package name */
    public long f34066l;

    /* renamed from: m, reason: collision with root package name */
    public int f34067m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f34068n;

    public C21331b() {
        throw null;
    }

    public C21331b(boolean z12, float f12, I3 i32, I3 i33, ViewGroup viewGroup, C42822w c42822w) {
        super(z12, i33);
        this.f34058d = z12;
        this.f34059e = f12;
        this.f34060f = i32;
        this.f34061g = i33;
        this.f34062h = viewGroup;
        this.f34064j = C22126m3.g(null);
        this.f34065k = C22126m3.g(Boolean.TRUE);
        l0.n.f413402b.getClass();
        this.f34066l = 0L;
        this.f34067m = -1;
        this.f34068n = new C21330a(this);
    }

    @Override // androidx.compose.material.ripple.s
    public final void H0() {
        ((C22082i3) this.f34064j).setValue(null);
    }

    @Override // androidx.compose.foundation.InterfaceC20836r1
    public final void a(@Y61.k androidx.compose.ui.node.P p12) {
        androidx.compose.ui.graphics.drawscope.a aVar = p12.f40671b;
        this.f34066l = aVar.i();
        float f12 = this.f34059e;
        this.f34067m = Float.isNaN(f12) ? kotlin.math.b.b(q.a(p12, this.f34058d, aVar.i())) : aVar.y0(f12);
        long j12 = this.f34060f.getF42167b().f39331a;
        float f13 = this.f34061g.getF42167b().f34100d;
        p12.y1();
        this.f34144c.a(p12, Float.isNaN(f12) ? q.a(p12, this.f34143b, p12.i()) : p12.M0(f12), j12);
        M mA2 = aVar.f39478c.a();
        ((Boolean) ((C22082i3) this.f34065k).getF42167b()).booleanValue();
        u uVar = (u) ((C22082i3) this.f34064j).getF42167b();
        if (uVar != null) {
            uVar.e(this.f34067m, aVar.i(), f13, j12);
            Canvas canvas = C22247d.f39473a;
            uVar.draw(((C22245c) mA2).f39351a);
        }
    }

    @Override // androidx.compose.runtime.B2
    public final void b() {
        r rVar = this.f34063i;
        if (rVar != null) {
            H0();
            t tVar = rVar.f34132e;
            u uVar = (u) tVar.f34134a.get(this);
            if (uVar != null) {
                uVar.c();
                LinkedHashMap linkedHashMap = tVar.f34134a;
                u uVar2 = (u) linkedHashMap.get(this);
                if (uVar2 != null) {
                }
                linkedHashMap.remove(this);
                rVar.f34131d.add(uVar);
            }
        }
    }

    @Override // androidx.compose.material.ripple.v
    public final void d(@Y61.k o.b bVar, @Y61.k kotlinx.coroutines.T t12) {
        r rVarA = this.f34063i;
        if (rVarA == null) {
            rVarA = A.a(this.f34062h);
            this.f34063i = rVarA;
        }
        u uVarA = rVarA.a(this);
        uVarA.b(bVar, this.f34058d, this.f34066l, this.f34067m, this.f34060f.getF42167b().f39331a, this.f34061g.getF42167b().f34100d, this.f34068n);
        ((C22082i3) this.f34064j).setValue(uVarA);
    }

    @Override // androidx.compose.runtime.B2
    public final void e() {
        r rVar = this.f34063i;
        if (rVar != null) {
            H0();
            t tVar = rVar.f34132e;
            u uVar = (u) tVar.f34134a.get(this);
            if (uVar != null) {
                uVar.c();
                LinkedHashMap linkedHashMap = tVar.f34134a;
                u uVar2 = (u) linkedHashMap.get(this);
                if (uVar2 != null) {
                }
                linkedHashMap.remove(this);
                rVar.f34131d.add(uVar);
            }
        }
    }

    @Override // androidx.compose.material.ripple.v
    public final void f(@Y61.k o.b bVar) {
        u uVar = (u) ((C22082i3) this.f34064j).getF42167b();
        if (uVar != null) {
            uVar.d();
        }
    }

    @Override // androidx.compose.runtime.B2
    public final void c() {
    }
}
