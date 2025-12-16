package com.avito.beduin.v2.component.gridlayout.compose;

import Y41.l;
import Y41.p;
import Y61.k;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.internal.P;
import com.avito.beduin.v2.component.gridlayout.state.s;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import com.avito.beduin.v2.render.compose.AbstractC36347d;
import com.avito.beduin.v2.render.compose.m;
import com.avito.beduin.v2.render.compose.n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GridRowComponent.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/component/gridlayout/compose/c;", "Lcom/avito/beduin/v2/render/compose/d;", "Lcom/avito/beduin/v2/component/gridlayout/state/c;", "<init>", "()V", "compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c extends AbstractC36347d<com.avito.beduin.v2.component.gridlayout.state.c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final c f335815b = new c();

    /* compiled from: GridRowComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l<m, n> f335817m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC36249i f335818n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f335819o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super m, n> lVar, InterfaceC36249i interfaceC36249i, int i12) {
            super(2);
            this.f335817m = lVar;
            this.f335818n = interfaceC36249i;
            this.f335819o = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f335819o | 1);
            l<m, n> lVar = this.f335817m;
            InterfaceC36249i interfaceC36249i = this.f335818n;
            c.this.a(lVar, interfaceC36249i, a12, iA2);
            return G0.f406611a;
        }
    }

    public c() {
        super(s.f335878c);
    }

    @Override // com.avito.beduin.v2.render.compose.AbstractC36347d
    @InterfaceC22132o
    @InterfaceC22181t
    public final void a(@k l<? super m, n> lVar, @k InterfaceC36249i interfaceC36249i, @Y61.l A a12, int i12) {
        int i13;
        B bE2 = a12.E(590647801);
        if ((i12 & 14) == 0) {
            i13 = (bE2.u(lVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(interfaceC36249i) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            d.a(interfaceC36249i, lVar, null, bE2, ((i13 >> 3) & 14) | ((i13 << 3) & 112), 4);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(lVar, interfaceC36249i, i12);
        }
    }
}
