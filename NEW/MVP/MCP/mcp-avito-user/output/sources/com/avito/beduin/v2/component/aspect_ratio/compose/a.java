package com.avito.beduin.v2.component.aspect_ratio.compose;

import Y41.p;
import Y61.k;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.v;
import com.avito.beduin.v2.component.aspect_ratio.state.AspectRatioState;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import com.avito.beduin.v2.engine.exception.RendererBeduinException;
import com.avito.beduin.v2.render.compose.AbstractC36347d;
import com.avito.beduin.v2.render.compose.l;
import com.avito.beduin.v2.render.compose.m;
import com.avito.beduin.v2.render.compose.n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AspectRatioComponent.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/beduin/v2/component/aspect_ratio/compose/a;", "Lcom/avito/beduin/v2/render/compose/d;", "Lcom/avito/beduin/v2/component/aspect_ratio/state/AspectRatioState;", "<init>", "()V", "compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends AbstractC36347d<AspectRatioState> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f335498b = new a();

    /* compiled from: AspectRatioComponent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.beduin.v2.component.aspect_ratio.compose.a$a, reason: collision with other inner class name */
    public static final class C10384a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f335499l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10384a(Y41.a<G0> aVar) {
            super(0);
            this.f335499l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f335499l.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: AspectRatioComponent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AspectRatioState f335500l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ n f335501m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AspectRatioState aspectRatioState, n nVar) {
            super(2);
            this.f335500l = aspectRatioState;
            this.f335501m = nVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) throws RendererBeduinException.UnregisteredComponentException {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                AspectRatioState.a aVar = this.f335500l.f335522e;
                if (aVar != null) {
                    l.a(new com.avito.beduin.v2.component.aspect_ratio.compose.b(this.f335501m), aVar.f335532a, a13, 0);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AspectRatioComponent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f335502l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a<G0> aVar) {
            super(0);
            this.f335502l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f335502l.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: AspectRatioComponent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/render/compose/m;", "it", "Lcom/avito/beduin/v2/render/compose/n;", "invoke", "(Lcom/avito/beduin/v2/render/compose/m;)Lcom/avito/beduin/v2/render/compose/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<m, n> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ n f335503l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(n nVar) {
            super(1);
            this.f335503l = nVar;
        }

        @Override // Y41.l
        public final n invoke(m mVar) {
            return new n(v.f42878y1, false, false, this.f335503l.f338093d);
        }
    }

    /* compiled from: AspectRatioComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements p<A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<m, n> f335505m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC36249i f335506n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f335507o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Y41.l<? super m, n> lVar, InterfaceC36249i interfaceC36249i, int i12) {
            super(2);
            this.f335505m = lVar;
            this.f335506n = interfaceC36249i;
            this.f335507o = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) throws RendererBeduinException.UnregisteredComponentException {
            num.intValue();
            int iA2 = C22066f2.a(this.f335507o | 1);
            Y41.l<m, n> lVar = this.f335505m;
            InterfaceC36249i interfaceC36249i = this.f335506n;
            a.this.a(lVar, interfaceC36249i, a12, iA2);
            return G0.f406611a;
        }
    }

    public a() {
        super(com.avito.beduin.v2.component.aspect_ratio.state.k.f335547c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c9  */
    /* JADX WARN: Type inference failed for: r12v9, types: [androidx.compose.ui.v] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.runtime.A, androidx.compose.runtime.B] */
    /* JADX WARN: Type inference failed for: r4v27, types: [androidx.compose.ui.v] */
    @Override // com.avito.beduin.v2.render.compose.AbstractC36347d
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@Y61.k Y41.l<? super com.avito.beduin.v2.render.compose.m, com.avito.beduin.v2.render.compose.n> r23, @Y61.k com.avito.beduin.v2.engine.component.InterfaceC36249i r24, @Y61.l androidx.compose.runtime.A r25, int r26) throws com.avito.beduin.v2.engine.exception.RendererBeduinException.UnregisteredComponentException {
        /*
            Method dump skipped, instructions count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.component.aspect_ratio.compose.a.a(Y41.l, com.avito.beduin.v2.engine.component.i, androidx.compose.runtime.A, int):void");
    }
}
