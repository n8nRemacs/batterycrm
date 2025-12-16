package com.avito.android.lib.beduin_v2.component.image.compose;

import Y41.l;
import Y41.p;
import Y41.q;
import Y61.k;
import androidx.compose.foundation.layout.E;
import androidx.compose.foundation.layout.F;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.P;
import androidx.compose.runtime.internal.r;
import com.avito.beduin.v2.avito.component.surface.state.e;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import com.avito.beduin.v2.render.compose.AbstractC36347d;
import com.avito.beduin.v2.render.compose.C36351h;
import com.avito.beduin.v2.render.compose.m;
import com.avito.beduin.v2.render.compose.n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ImageComponent.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/image/compose/a;", "Lcom/avito/beduin/v2/render/compose/d;", "Lcom/avito/beduin/v2/avito/component/image/state/b;", "<init>", "()V", "imageState", "_design-modules_beduin-v2_renderer-compose_component_image"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends AbstractC36347d<com.avito.beduin.v2.avito.component.image.state.b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f175623b = new a();

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final String f175624c = "Image";

    /* compiled from: ImageComponent.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/F;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/F;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.lib.beduin_v2.component.image.compose.a$a, reason: collision with other inner class name */
    public static final class C5191a extends N implements q<F, A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l<m, n> f175625l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f175626m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5191a(l lVar, InterfaceC22204y1 interfaceC22204y1) {
            super(3);
            this.f175625l = lVar;
            this.f175626m = interfaceC22204y1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:81:0x020e  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x025f  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x026c  */
        @Override // Y41.q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.foundation.layout.F r19, androidx.compose.runtime.A r20, java.lang.Integer r21) {
            /*
                Method dump skipped, instructions count: 647
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.beduin_v2.component.image.compose.a.C5191a.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ImageComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements p<A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l<m, n> f175628m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC36249i f175629n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f175630o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(l<? super m, n> lVar, InterfaceC36249i interfaceC36249i, int i12) {
            super(2);
            this.f175628m = lVar;
            this.f175629n = interfaceC36249i;
            this.f175630o = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f175630o | 1);
            l<m, n> lVar = this.f175628m;
            InterfaceC36249i interfaceC36249i = this.f175629n;
            a.this.a(lVar, interfaceC36249i, a12, iA2);
            return G0.f406611a;
        }
    }

    public a() {
        super(e.f335223c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.beduin.v2.render.compose.AbstractC36347d
    @InterfaceC22132o
    @InterfaceC22181t
    public final void a(@k l<? super m, n> lVar, @k InterfaceC36249i interfaceC36249i, @Y61.l A a12, int i12) {
        B bE2 = a12.E(313907057);
        InterfaceC22204y1 interfaceC22204y1A = C36351h.a(interfaceC36249i, bE2, 8);
        if (((com.avito.beduin.v2.avito.component.image.state.b) interfaceC22204y1A.getF42167b()).f334412c) {
            E.a(null, null, false, r.c(503456160, new C5191a(lVar, interfaceC22204y1A), bE2), bE2, 3072, 7);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(lVar, interfaceC36249i, i12);
        }
    }

    @Override // com.avito.beduin.v2.render.compose.AbstractC36347d
    @k
    public final String b() {
        return f175624c;
    }
}
