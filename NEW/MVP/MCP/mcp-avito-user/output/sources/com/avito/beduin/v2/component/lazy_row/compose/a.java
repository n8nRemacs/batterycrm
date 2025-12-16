package com.avito.beduin.v2.component.lazy_row.compose;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.P;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import com.avito.beduin.v2.render.compose.AbstractC36347d;
import com.avito.beduin.v2.render.compose.m;
import com.avito.beduin.v2.render.compose.n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: LazyRowComponent.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/component/lazy_row/compose/a;", "Lcom/avito/beduin/v2/render/compose/d;", "Lcom/avito/beduin/v2/component/lazy_row/state/a;", "<init>", "()V", "compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends AbstractC36347d<com.avito.beduin.v2.component.lazy_row.state.a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f336033b = new a();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f336034c = "LazyRow";

    /* compiled from: LazyRowComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.component.lazy_row.compose.a$a, reason: collision with other inner class name */
    public static final class C10411a extends N implements p<A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<m, n> f336036m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC36249i f336037n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f336038o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10411a(Y41.l<? super m, n> lVar, InterfaceC36249i interfaceC36249i, int i12) {
            super(2);
            this.f336036m = lVar;
            this.f336037n = interfaceC36249i;
            this.f336038o = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f336038o | 1);
            Y41.l<m, n> lVar = this.f336036m;
            InterfaceC36249i interfaceC36249i = this.f336037n;
            a.this.a(lVar, interfaceC36249i, a12, iA2);
            return G0.f406611a;
        }
    }

    public a() {
        super(com.avito.beduin.v2.component.lazy_row.state.j.f336094c);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    @Override // com.avito.beduin.v2.render.compose.AbstractC36347d
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@Y61.k Y41.l<? super com.avito.beduin.v2.render.compose.m, com.avito.beduin.v2.render.compose.n> r8, @Y61.k com.avito.beduin.v2.engine.component.InterfaceC36249i r9, @Y61.l androidx.compose.runtime.A r10, int r11) {
        /*
            r7 = this;
            r0 = 169429434(0xa1949ba, float:7.3805485E-33)
            androidx.compose.runtime.B r10 = r10.E(r0)
            r0 = r11 & 14
            r1 = 4
            if (r0 != 0) goto L17
            boolean r0 = r10.u(r8)
            if (r0 == 0) goto L14
            r0 = r1
            goto L15
        L14:
            r0 = 2
        L15:
            r0 = r0 | r11
            goto L18
        L17:
            r0 = r11
        L18:
            r2 = r11 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L28
            boolean r2 = r10.B(r9)
            if (r2 == 0) goto L25
            r2 = 32
            goto L27
        L25:
            r2 = 16
        L27:
            r0 = r0 | r2
        L28:
            r2 = r0 & 91
            r3 = 18
            if (r2 != r3) goto L39
            boolean r2 = r10.c()
            if (r2 != 0) goto L35
            goto L39
        L35:
            r10.f()
            goto L76
        L39:
            r2 = -535845870(0xffffffffe00fa412, float:-4.140167E19)
            r10.C(r2)
            r2 = r0 & 14
            r3 = 0
            if (r2 != r1) goto L46
            r1 = 1
            goto L47
        L46:
            r1 = r3
        L47:
            java.lang.Object r2 = r10.t()
            if (r1 != 0) goto L56
            androidx.compose.runtime.A$a r1 = androidx.compose.runtime.A.f37866a
            r1.getClass()
            androidx.compose.runtime.A$a$a r1 = androidx.compose.runtime.A.a.f37868b
            if (r2 != r1) goto L67
        L56:
            com.avito.beduin.v2.render.compose.m r1 = new com.avito.beduin.v2.render.compose.m
            r2 = 3
            r4 = 0
            r1.<init>(r3, r3, r2, r4)
            java.lang.Object r1 = r8.invoke(r1)
            r2 = r1
            com.avito.beduin.v2.render.compose.n r2 = (com.avito.beduin.v2.render.compose.n) r2
            r10.H(r2)
        L67:
            r1 = r2
            com.avito.beduin.v2.render.compose.n r1 = (com.avito.beduin.v2.render.compose.n) r1
            r10.X(r3)
            r5 = r0 & 112(0x70, float:1.57E-43)
            r6 = 4
            r3 = 0
            r2 = r9
            r4 = r10
            com.avito.beduin.v2.component.lazy_row.compose.b.a(r1, r2, r3, r4, r5, r6)
        L76:
            androidx.compose.runtime.c2 r10 = r10.Z()
            if (r10 == 0) goto L83
            com.avito.beduin.v2.component.lazy_row.compose.a$a r0 = new com.avito.beduin.v2.component.lazy_row.compose.a$a
            r0.<init>(r8, r9, r11)
            r10.f38184d = r0
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.component.lazy_row.compose.a.a(Y41.l, com.avito.beduin.v2.engine.component.i, androidx.compose.runtime.A, int):void");
    }

    @Override // com.avito.beduin.v2.render.compose.AbstractC36347d
    @Y61.k
    public final String b() {
        return f336034c;
    }
}
