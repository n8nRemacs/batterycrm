package androidx.compose.material.ripple;

import android.graphics.Canvas;
import android.view.View;
import androidx.compose.foundation.interaction.o;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.C22245c;
import androidx.compose.ui.graphics.C22247d;
import androidx.compose.ui.graphics.InterfaceC22242a0;
import androidx.compose.ui.graphics.M;
import androidx.compose.ui.node.C22417j;
import androidx.compose.ui.node.C22440v;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.LinkedHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Ripple.android.kt */
@P
@s0
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/material/ripple/c;", "Landroidx/compose/material/ripple/x;", "Landroidx/compose/material/ripple/s;", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "", "bounded", "Landroidx/compose/ui/unit/h;", "radius", "Landroidx/compose/ui/graphics/a0;", "color", "Lkotlin/Function0;", "Landroidx/compose/material/ripple/l;", "rippleAlpha", "<init>", "(Landroidx/compose/foundation/interaction/k;ZFLandroidx/compose/ui/graphics/a0;LY41/a;Lkotlin/jvm/internal/w;)V", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.material.ripple.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21332c extends x implements s {

    /* renamed from: A, reason: collision with root package name */
    @Y61.l
    public u f34069A;

    /* renamed from: z, reason: collision with root package name */
    @Y61.l
    public r f34070z;

    /* compiled from: Ripple.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.material.ripple.c$a */
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            C22440v.a(C21332c.this);
            return G0.f406611a;
        }
    }

    public C21332c() {
        throw null;
    }

    public C21332c(androidx.compose.foundation.interaction.k kVar, boolean z12, float f12, InterfaceC22242a0 interfaceC22242a0, Y41.a aVar, C42822w c42822w) {
        super(kVar, z12, f12, interfaceC22242a0, aVar, null);
    }

    @Override // androidx.compose.material.ripple.s
    public final void H0() {
        this.f34069A = null;
        C22440v.a(this);
    }

    @Override // androidx.compose.ui.v.d
    public final void d2() {
        r rVar = this.f34070z;
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

    @Override // androidx.compose.material.ripple.x
    public final void k2(@Y61.k o.b bVar, long j12, float f12) {
        r rVarA = this.f34070z;
        if (rVarA == null) {
            rVarA = A.a(A.b((View) C22417j.a(this, AndroidCompositionLocals_androidKt.f41073f)));
            this.f34070z = rVarA;
        }
        u uVarA = rVarA.a(this);
        uVarA.b(bVar, this.f34148q, j12, kotlin.math.b.b(f12), this.f34150s.a(), this.f34151t.invoke().f34100d, new a());
        this.f34069A = uVarA;
        C22440v.a(this);
    }

    @Override // androidx.compose.material.ripple.x
    public final void l2(@Y61.k androidx.compose.ui.graphics.drawscope.d dVar) {
        M mA2 = dVar.getF39478c().a();
        u uVar = this.f34069A;
        if (uVar != null) {
            long j12 = this.f34154w;
            uVar.e(kotlin.math.b.b(this.f34153v), j12, this.f34151t.invoke().f34100d, this.f34150s.a());
            Canvas canvas = C22247d.f39473a;
            uVar.draw(((C22245c) mA2).f39351a);
        }
    }

    @Override // androidx.compose.material.ripple.x
    public final void n2(@Y61.k o.b bVar) {
        u uVar = this.f34069A;
        if (uVar != null) {
            uVar.d();
        }
    }
}
