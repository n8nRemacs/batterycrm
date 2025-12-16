package com.avito.android.lib.beduin_v2.component.surface.compose;

import Y41.l;
import Y41.p;
import Y61.k;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.P;
import com.avito.beduin.v2.avito.component.surface.state.e;
import com.avito.beduin.v2.component.box.state.b;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import com.avito.beduin.v2.engine.exception.RendererBeduinException;
import com.avito.beduin.v2.render.compose.AbstractC36347d;
import com.avito.beduin.v2.render.compose.m;
import com.avito.beduin.v2.render.compose.n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SurfaceComponent.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/surface/compose/a;", "Lcom/avito/beduin/v2/render/compose/d;", "Lcom/avito/beduin/v2/avito/component/surface/state/a;", "<init>", "()V", "surfaceState", "_design-modules_beduin-v2_renderer-compose_component_surface"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends AbstractC36347d<com.avito.beduin.v2.avito.component.surface.state.a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f175927b = new a();

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final String f175928c = "Surface";

    /* compiled from: SurfaceComponent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.lib.beduin_v2.component.surface.compose.a$a, reason: collision with other inner class name */
    public static final class C5204a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C5204a f175929l = new C5204a();

        public C5204a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: SurfaceComponent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/render/compose/m;", "params", "Lcom/avito/beduin/v2/render/compose/n;", "invoke", "(Lcom/avito/beduin/v2/render/compose/m;)Lcom/avito/beduin/v2/render/compose/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<m, n> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C20644z f175930l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ b.a.C10388a f175931m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f175932n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ boolean f175933o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f175934p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C20644z c20644z, b.a.C10388a c10388a, boolean z12, boolean z13, boolean z14) {
            super(1);
            this.f175930l = c20644z;
            this.f175931m = c10388a;
            this.f175932n = z12;
            this.f175933o = z13;
            this.f175934p = z14;
        }

        @Override // Y41.l
        public final n invoke(m mVar) {
            m mVar2 = mVar;
            boolean z12 = this.f175932n || this.f175933o || this.f175934p;
            return com.avito.beduin.v2.component.box.compose.b.a(this.f175930l, this.f175931m, mVar2.f338088a, mVar2.f338089b, z12);
        }
    }

    /* compiled from: SurfaceComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements p<A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l<m, n> f175936m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC36249i f175937n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f175938o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(l<? super m, n> lVar, InterfaceC36249i interfaceC36249i, int i12) {
            super(2);
            this.f175936m = lVar;
            this.f175937n = interfaceC36249i;
            this.f175938o = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) throws RendererBeduinException.UnregisteredComponentException {
            num.intValue();
            int iA2 = C22066f2.a(this.f175938o | 1);
            l<m, n> lVar = this.f175936m;
            InterfaceC36249i interfaceC36249i = this.f175937n;
            a.this.a(lVar, interfaceC36249i, a12, iA2);
            return G0.f406611a;
        }
    }

    public a() {
        super(e.f335223c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x022c  */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v26 */
    @Override // com.avito.beduin.v2.render.compose.AbstractC36347d
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@Y61.k Y41.l<? super com.avito.beduin.v2.render.compose.m, com.avito.beduin.v2.render.compose.n> r33, @Y61.k com.avito.beduin.v2.engine.component.InterfaceC36249i r34, @Y61.l androidx.compose.runtime.A r35, int r36) throws com.avito.beduin.v2.engine.exception.RendererBeduinException.UnregisteredComponentException {
        /*
            Method dump skipped, instructions count: 1315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.beduin_v2.component.surface.compose.a.a(Y41.l, com.avito.beduin.v2.engine.component.i, androidx.compose.runtime.A, int):void");
    }

    @Override // com.avito.beduin.v2.render.compose.AbstractC36347d
    @k
    public final String b() {
        return f175928c;
    }
}
