package com.avito.android.lib.beduin_v2.component.grid_column.compose;

import Y41.l;
import Y41.p;
import Y41.q;
import Y61.k;
import androidx.compose.foundation.lazy.grid.I0;
import androidx.compose.foundation.lazy.grid.M0;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.internal.P;
import bU.C25562f;
import com.avito.android.analytics.screens.compose.s;
import com.avito.beduin.v2.component.gridlayout.state.c;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import com.avito.beduin.v2.render.compose.AbstractC36347d;
import com.avito.beduin.v2.render.compose.m;
import com.avito.beduin.v2.render.compose.n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GridColumnComponent.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/grid_column/compose/b;", "Lcom/avito/beduin/v2/render/compose/d;", "Lcom/avito/beduin/v2/component/gridlayout/state/c;", "<init>", "()V", "_design-modules_beduin-v2_renderer-compose_component_grid-column"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends AbstractC36347d<c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final b f175610b = new b();

    /* compiled from: GridColumnComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/component/gridlayout/state/c;", "Landroidx/compose/foundation/lazy/grid/I0;", "invoke", "(Lcom/avito/beduin/v2/component/gridlayout/state/c;Landroidx/compose/runtime/A;I)Landroidx/compose/foundation/lazy/grid/I0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements q<c, A, Integer, I0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f175611l = new a();

        public a() {
            super(3);
        }

        @Override // Y41.q
        public final I0 invoke(c cVar, A a12, Integer num) {
            I0 i0A;
            A a13 = a12;
            num.intValue();
            a13.C(-1340526143);
            if (C25562f.a(cVar.f335851l)) {
                a13.C(-721344265);
                i0A = (I0) s.b(com.avito.android.lib.beduin_v2.component.grid_column.compose.a.f175609l, a13);
                a13.h();
            } else {
                a13.C(-721246987);
                i0A = M0.a(0, 3, a13);
                a13.h();
            }
            a13.h();
            return i0A;
        }
    }

    /* compiled from: GridColumnComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.component.grid_column.compose.b$b, reason: collision with other inner class name */
    public static final class C5189b extends N implements p<A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l<m, n> f175613m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC36249i f175614n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f175615o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5189b(l<? super m, n> lVar, InterfaceC36249i interfaceC36249i, int i12) {
            super(2);
            this.f175613m = lVar;
            this.f175614n = interfaceC36249i;
            this.f175615o = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f175615o | 1);
            l<m, n> lVar = this.f175613m;
            InterfaceC36249i interfaceC36249i = this.f175614n;
            b.this.a(lVar, interfaceC36249i, a12, iA2);
            return G0.f406611a;
        }
    }

    public b() {
        super(com.avito.beduin.v2.component.gridlayout.state.b.f335839c);
    }

    @Override // com.avito.beduin.v2.render.compose.AbstractC36347d
    @InterfaceC22132o
    @InterfaceC22181t
    public final void a(@k l<? super m, n> lVar, @k InterfaceC36249i interfaceC36249i, @Y61.l A a12, int i12) {
        B bE2 = a12.E(-897801239);
        com.avito.beduin.v2.component.gridlayout.compose.b.a(interfaceC36249i, lVar, a.f175611l, bE2, ((i12 << 3) & 112) | 8, 0);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C5189b(lVar, interfaceC36249i, i12);
        }
    }
}
