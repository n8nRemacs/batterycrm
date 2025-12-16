package com.avito.beduin.v2.component.lazy_column.compose;

import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.internal.P;
import com.avito.beduin.v2.component.common.AxisAlignment;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import com.avito.beduin.v2.render.compose.AbstractC36347d;
import com.avito.beduin.v2.render.compose.C36351h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: FlexColumnComponent.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/component/lazy_column/compose/e;", "Lcom/avito/beduin/v2/render/compose/d;", "Lcom/avito/beduin/v2/component/flexlayout/state/b;", "<init>", "()V", "compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e extends AbstractC36347d<com.avito.beduin.v2.component.flexlayout.state.b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final e f335920b = new e();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f335921c = "FlexColumn";

    /* compiled from: FlexColumnComponent.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.beduin.v2.component.flexlayout.state.b f335922l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.beduin.v2.render.compose.m, com.avito.beduin.v2.render.compose.n> f335923m;

        /* compiled from: FlexColumnComponent.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.beduin.v2.component.lazy_column.compose.e$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C10404a {
            static {
                int[] iArr = new int[AxisAlignment.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AxisAlignment.a aVar = AxisAlignment.f335651c;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    AxisAlignment.a aVar2 = AxisAlignment.f335651c;
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(com.avito.beduin.v2.component.flexlayout.state.b bVar, Y41.l<? super com.avito.beduin.v2.render.compose.m, com.avito.beduin.v2.render.compose.n> lVar) {
            super(2);
            this.f335922l = bVar;
            this.f335923m = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00f5  */
        /* JADX WARN: Type inference failed for: r10v1, types: [androidx.compose.ui.v] */
        /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.runtime.A] */
        @Override // Y41.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.runtime.A r18, java.lang.Integer r19) {
            /*
                Method dump skipped, instructions count: 347
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.component.lazy_column.compose.e.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: FlexColumnComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.beduin.v2.render.compose.m, com.avito.beduin.v2.render.compose.n> f335925m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC36249i f335926n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f335927o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l<? super com.avito.beduin.v2.render.compose.m, com.avito.beduin.v2.render.compose.n> lVar, InterfaceC36249i interfaceC36249i, int i12) {
            super(2);
            this.f335925m = lVar;
            this.f335926n = interfaceC36249i;
            this.f335927o = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f335927o | 1);
            Y41.l<com.avito.beduin.v2.render.compose.m, com.avito.beduin.v2.render.compose.n> lVar = this.f335925m;
            InterfaceC36249i interfaceC36249i = this.f335926n;
            e.this.a(lVar, interfaceC36249i, a12, iA2);
            return G0.f406611a;
        }
    }

    public e() {
        super(com.avito.beduin.v2.component.flexlayout.state.a.f335731c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.beduin.v2.render.compose.AbstractC36347d
    @InterfaceC22132o
    @InterfaceC22181t
    public final void a(@Y61.k Y41.l<? super com.avito.beduin.v2.render.compose.m, com.avito.beduin.v2.render.compose.n> lVar, @Y61.k InterfaceC36249i interfaceC36249i, @Y61.l A a12, int i12) {
        int i13;
        B bE2 = a12.E(-1782896174);
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
            com.avito.beduin.v2.component.flexlayout.state.b bVar = (com.avito.beduin.v2.component.flexlayout.state.b) C36351h.a(interfaceC36249i, bE2, (i13 >> 3) & 14).getF42167b();
            if (bVar.f335740i) {
                i.a(bVar.f335733b, androidx.compose.runtime.internal.r.c(1300670134, new a(bVar, lVar), bE2), bE2, 48);
            }
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(lVar, interfaceC36249i, i12);
        }
    }

    @Override // com.avito.beduin.v2.render.compose.AbstractC36347d
    @Y61.k
    public final String b() {
        return f335921c;
    }
}
