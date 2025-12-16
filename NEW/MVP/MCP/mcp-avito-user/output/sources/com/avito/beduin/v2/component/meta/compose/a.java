package com.avito.beduin.v2.component.meta.compose;

import Y41.l;
import Y41.p;
import Y61.k;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.internal.P;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import com.avito.beduin.v2.engine.exception.RendererBeduinException;
import com.avito.beduin.v2.logger.LogLevel;
import com.avito.beduin.v2.render.compose.AbstractC36347d;
import com.avito.beduin.v2.render.compose.C36351h;
import com.avito.beduin.v2.render.compose.m;
import com.avito.beduin.v2.render.compose.n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MetaComponent.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/component/meta/compose/a;", "Lcom/avito/beduin/v2/render/compose/d;", "LOT0/a;", "<init>", "()V", "compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends AbstractC36347d<OT0.a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f336108b = new a();

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final String f336109c = "Meta";

    /* compiled from: MetaComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.component.meta.compose.a$a, reason: collision with other inner class name */
    public static final class C10416a extends N implements p<A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l<m, n> f336111m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC36249i f336112n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f336113o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10416a(l<? super m, n> lVar, InterfaceC36249i interfaceC36249i, int i12) {
            super(2);
            this.f336111m = lVar;
            this.f336112n = interfaceC36249i;
            this.f336113o = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) throws RendererBeduinException.UnregisteredComponentException {
            num.intValue();
            int iA2 = C22066f2.a(this.f336113o | 1);
            l<m, n> lVar = this.f336111m;
            InterfaceC36249i interfaceC36249i = this.f336112n;
            a.this.a(lVar, interfaceC36249i, a12, iA2);
            return G0.f406611a;
        }
    }

    public a() {
        super(OT0.b.f12283c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.beduin.v2.render.compose.AbstractC36347d
    @InterfaceC22132o
    public final void a(@k l<? super m, n> lVar, @k InterfaceC36249i interfaceC36249i, @Y61.l A a12, int i12) throws RendererBeduinException.UnregisteredComponentException {
        int i13;
        B bE2 = a12.E(-2061894338);
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
            OT0.a aVar = (OT0.a) C36351h.a(interfaceC36249i, bE2, (i13 >> 3) & 14).getF42167b();
            RU0.b bVar = RU0.b.f14467a;
            LogLevel[] logLevelArr = LogLevel.f337864b;
            bVar.getClass();
            if (1 >= RU0.b.f14469c) {
                RU0.b.f14468b.d(RU0.b.f14470d + ":Render", "OnComponentRender: componentType=Meta");
            }
            com.avito.beduin.v2.render.compose.l.a(lVar, aVar.f12282c, bE2, i13 & 14);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C10416a(lVar, interfaceC36249i, i12);
        }
    }

    @Override // com.avito.beduin.v2.render.compose.AbstractC36347d
    @k
    public final String b() {
        return f336109c;
    }
}
