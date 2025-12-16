package com.avito.beduin.v2.render.compose;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.InterfaceC22132o;
import dU0.InterfaceC39628a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: RendererContext.kt */
@F3
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/render/compose/G;", "Lcom/avito/beduin/v2/render/compose/k;", "compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class G implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C36352i f338038a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.component.B f338039b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final aU0.b f338040c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final k f338041d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final e2 f338042e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43160i<InterfaceC39628a> f338043f;

    /* compiled from: RendererContext.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f338045m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f338046n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f338047o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f338048p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.v vVar, String str, String str2, int i12) {
            super(2);
            this.f338045m = vVar;
            this.f338046n = str;
            this.f338047o = str2;
            this.f338048p = i12;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f338048p | 1);
            G.this.a(iA2, a12, this.f338045m, this.f338046n, this.f338047o);
            return G0.f406611a;
        }
    }

    public G(C36352i c36352i, com.avito.beduin.v2.engine.component.B b12, aU0.b bVar, k kVar, int i12, C42822w c42822w) {
        bVar = (i12 & 4) != 0 ? null : bVar;
        this.f338038a = c36352i;
        this.f338039b = b12;
        this.f338040c = bVar;
        this.f338041d = kVar;
        e2 e2VarB = f2.b(0, 0, null, 7);
        this.f338042e = e2VarB;
        this.f338043f = C43175k.a(e2VarB);
    }

    @Override // com.avito.beduin.v2.render.compose.k
    @InterfaceC22132o
    public final void a(int i12, @Y61.l androidx.compose.runtime.A a12, @Y61.k androidx.compose.ui.v vVar, @Y61.k String str, @Y61.k String str2) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(302407686);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(vVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(str) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.B(str2) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.B(this) ? 2048 : 1024;
        }
        if ((i13 & 5851) == 1170 && bE2.c()) {
            bE2.f();
        } else {
            this.f338041d.a(i13 & 1022, bE2, vVar, str, str2);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(vVar, str, str2, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
    @androidx.compose.runtime.InterfaceC22132o
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.beduin.v2.render.compose.AbstractC36347d b(@Y61.k java.lang.String r4, @Y61.l androidx.compose.runtime.A r5) throws com.avito.beduin.v2.engine.exception.RendererBeduinException.UnregisteredComponentException {
        /*
            r3 = this;
            r0 = 1734396399(0x6760c9ef, float:1.0615351E24)
            r5.C(r0)
            r0 = 1906196157(0x719e3ebd, float:1.5671833E30)
            r5.C(r0)
            boolean r0 = r5.B(r4)
            java.lang.Object r1 = r5.t()
            if (r0 != 0) goto L1f
            androidx.compose.runtime.A$a r0 = androidx.compose.runtime.A.f37866a
            r0.getClass()
            androidx.compose.runtime.A$a$a r0 = androidx.compose.runtime.A.a.f37868b
            if (r1 != r0) goto L5f
        L1f:
            com.avito.beduin.v2.engine.component.B r0 = r3.f338039b
            com.avito.beduin.v2.engine.component.y r0 = r0.get(r4)
            com.avito.beduin.v2.render.compose.i r1 = r3.f338038a
            if (r0 == 0) goto L2d
            com.avito.beduin.v2.render.compose.d<?> r4 = r1.f338075b
            r1 = r4
            goto L5c
        L2d:
            java.util.Map<java.lang.String, com.avito.beduin.v2.render.compose.d<?>> r0 = r1.f338074a
            java.lang.Object r0 = r0.get(r4)
            com.avito.beduin.v2.render.compose.d r0 = (com.avito.beduin.v2.render.compose.AbstractC36347d) r0
            if (r0 == 0) goto L39
        L37:
            r1 = r0
            goto L5c
        L39:
            java.util.Map<java.lang.String, com.avito.beduin.v2.render.compose.d<?>> r0 = r1.f338074a
            java.lang.String r1 = "UnregisteredComponent"
            java.lang.Object r0 = r0.get(r1)
            com.avito.beduin.v2.render.compose.d r0 = (com.avito.beduin.v2.render.compose.AbstractC36347d) r0
            if (r0 == 0) goto L68
            com.avito.beduin.v2.engine.exception.RendererBeduinException$UnregisteredComponentException r1 = new com.avito.beduin.v2.engine.exception.RendererBeduinException$UnregisteredComponentException
            r1.<init>(r4)
            r4 = 0
            java.lang.String r2 = "RendererContext"
            com.avito.beduin.v2.engine.utils.e.b(r1, r2, r4)
            aU0.b r4 = r3.f338040c
            if (r4 == 0) goto L37
            java.lang.String r2 = com.avito.beduin.v2.engine.utils.f.a()
            r4.a(r1, r2)
            goto L37
        L5c:
            r5.H(r1)
        L5f:
            com.avito.beduin.v2.render.compose.d r1 = (com.avito.beduin.v2.render.compose.AbstractC36347d) r1
            r5.h()
            r5.h()
            return r1
        L68:
            com.avito.beduin.v2.engine.exception.RendererBeduinException$UnregisteredComponentException r5 = new com.avito.beduin.v2.engine.exception.RendererBeduinException$UnregisteredComponentException
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.render.compose.G.b(java.lang.String, androidx.compose.runtime.A):com.avito.beduin.v2.render.compose.d");
    }
}
