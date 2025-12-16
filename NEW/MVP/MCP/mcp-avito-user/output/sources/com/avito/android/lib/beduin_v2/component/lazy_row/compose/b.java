package com.avito.android.lib.beduin_v2.component.lazy_row.compose;

import Y41.l;
import Y41.p;
import Y41.q;
import Y61.k;
import androidx.compose.foundation.lazy.A0;
import androidx.compose.foundation.lazy.w0;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.internal.P;
import bU.C25562f;
import com.avito.android.analytics.screens.compose.s;
import com.avito.beduin.v2.component.lazy_row.state.j;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import com.avito.beduin.v2.render.compose.AbstractC36347d;
import com.avito.beduin.v2.render.compose.m;
import com.avito.beduin.v2.render.compose.n;
import com.avito.beduin.v2.render.compose.o;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LazyRowComponent.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/lazy_row/compose/b;", "Lcom/avito/beduin/v2/render/compose/d;", "Lcom/avito/beduin/v2/component/lazy_row/state/a;", "<init>", "()V", "_design-modules_beduin-v2_renderer-compose_component_lazy-row"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends AbstractC36347d<com.avito.beduin.v2.component.lazy_row.state.a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final b f175774b = new b();

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final String f175775c = "LazyRow";

    /* compiled from: LazyRowComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/component/lazy_row/state/a;", "Landroidx/compose/foundation/lazy/w0;", "invoke", "(Lcom/avito/beduin/v2/component/lazy_row/state/a;Landroidx/compose/runtime/A;I)Landroidx/compose/foundation/lazy/w0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements q<com.avito.beduin.v2.component.lazy_row.state.a, A, Integer, w0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f175776l = new a();

        public a() {
            super(3);
        }

        @Override // Y41.q
        public final w0 invoke(com.avito.beduin.v2.component.lazy_row.state.a aVar, A a12, Integer num) {
            w0 w0VarA;
            A a13 = a12;
            num.intValue();
            a13.C(1161901917);
            if (C25562f.a(aVar.f336076k)) {
                a13.C(227842243);
                w0VarA = (w0) s.b(com.avito.android.lib.beduin_v2.component.lazy_row.compose.a.f175773l, a13);
                a13.h();
            } else {
                a13.C(227939521);
                w0VarA = A0.a(0, 0, 3, a13);
                a13.h();
            }
            a13.h();
            return w0VarA;
        }
    }

    /* compiled from: LazyRowComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.component.lazy_row.compose.b$b, reason: collision with other inner class name */
    public static final class C5195b extends N implements p<A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l<m, n> f175778m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC36249i f175779n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f175780o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5195b(l<? super m, n> lVar, InterfaceC36249i interfaceC36249i, int i12) {
            super(2);
            this.f175778m = lVar;
            this.f175779n = interfaceC36249i;
            this.f175780o = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f175780o | 1);
            l<m, n> lVar = this.f175778m;
            InterfaceC36249i interfaceC36249i = this.f175779n;
            b.this.a(lVar, interfaceC36249i, a12, iA2);
            return G0.f406611a;
        }
    }

    public b() {
        super(j.f336094c);
    }

    @Override // com.avito.beduin.v2.render.compose.AbstractC36347d
    @InterfaceC22132o
    @InterfaceC22181t
    public final void a(@k l<? super m, n> lVar, @k InterfaceC36249i interfaceC36249i, @Y61.l A a12, int i12) {
        B bE2 = a12.E(1510531651);
        com.avito.beduin.v2.component.lazy_row.compose.b.a(o.a(lVar, bE2, i12 & 14), interfaceC36249i, a.f175776l, bE2, 64, 0);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C5195b(lVar, interfaceC36249i, i12);
        }
    }

    @Override // com.avito.beduin.v2.render.compose.AbstractC36347d
    @k
    public final String b() {
        return f175775c;
    }
}
