package com.avito.android.lib.beduin_v2.component.text.compose;

import Y41.l;
import Y41.p;
import Y61.k;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.text.style.s;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import bU.C25564h;
import com.akita.compose.foundation.r;
import com.avito.beduin.v2.avito.component.text.state.C36232a;
import com.avito.beduin.v2.avito.component.text.state.i;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import com.avito.beduin.v2.render.compose.AbstractC36347d;
import com.avito.beduin.v2.render.compose.C36351h;
import com.avito.beduin.v2.render.compose.m;
import com.avito.beduin.v2.render.compose.n;
import com.avito.beduin.v2.render.compose.o;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TextComponent.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/text/compose/a;", "Lcom/avito/beduin/v2/render/compose/d;", "Lcom/avito/beduin/v2/avito/component/text/state/a;", "<init>", "()V", "textState", "_design-modules_beduin-v2_renderer-compose_component_text"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends AbstractC36347d<C36232a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f175939b = new a();

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final String f175940c = "Text";

    /* compiled from: TextComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.component.text.compose.a$a, reason: collision with other inner class name */
    public static final class C5205a extends N implements p<A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l<m, n> f175942m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC36249i f175943n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f175944o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5205a(l<? super m, n> lVar, InterfaceC36249i interfaceC36249i, int i12) {
            super(2);
            this.f175942m = lVar;
            this.f175943n = interfaceC36249i;
            this.f175944o = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f175944o | 1);
            l<m, n> lVar = this.f175942m;
            InterfaceC36249i interfaceC36249i = this.f175943n;
            a.this.a(lVar, interfaceC36249i, a12, iA2);
            return G0.f406611a;
        }
    }

    public a() {
        super(i.f335350c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.beduin.v2.render.compose.AbstractC36347d
    @InterfaceC22132o
    @InterfaceC22181t
    public final void a(@k l<? super m, n> lVar, @k InterfaceC36249i interfaceC36249i, @Y61.l A a12, int i12) {
        v vVarA;
        int i13;
        int i14;
        B bE2 = a12.E(-415618611);
        InterfaceC22204y1 interfaceC22204y1A = C36351h.a(interfaceC36249i, bE2, 8);
        if (((C36232a) interfaceC22204y1A.getF42167b()).f335339h) {
            v vVarB = o.b(lVar, bE2, i12 & 14);
            String str = ((C36232a) interfaceC22204y1A.getF42167b()).f335332a;
            r rVar = (r) C25564h.a(((C36232a) interfaceC22204y1A.getF42167b()).f335336e, null, bE2, 1);
            v.f42878y1.getClass();
            ET0.b bVar = ((C36232a) interfaceC22204y1A.getF42167b()).f335337f;
            float f12 = bVar != null ? bVar.f4016a : 0;
            h.a aVar = h.f42849c;
            ET0.b bVar2 = ((C36232a) interfaceC22204y1A.getF42167b()).f335337f;
            float f13 = bVar2 != null ? bVar2.f4019d : 0;
            ET0.b bVar3 = ((C36232a) interfaceC22204y1A.getF42167b()).f335337f;
            v vVarL = R1.l(vVarB, f12, f13, bVar3 != null ? bVar3.f4017b : 0, ((C36232a) interfaceC22204y1A.getF42167b()).f335337f != null ? r14.f4018c : 0);
            String tag = interfaceC36249i.getTag();
            if (tag == null || (vVarA = C22501m2.a(vVarL, tag)) == null) {
                vVarA = vVarL;
            }
            int iOrdinal = ((C36232a) interfaceC22204y1A.getF42167b()).f335335d.ordinal();
            if (iOrdinal == 0) {
                androidx.compose.ui.text.style.i.f42675b.getClass();
                i13 = androidx.compose.ui.text.style.i.f42680g;
            } else if (iOrdinal == 1) {
                androidx.compose.ui.text.style.i.f42675b.getClass();
                i13 = androidx.compose.ui.text.style.i.f42681h;
            } else if (iOrdinal == 2) {
                androidx.compose.ui.text.style.i.f42675b.getClass();
                i13 = androidx.compose.ui.text.style.i.f42678e;
            } else if (iOrdinal == 3) {
                androidx.compose.ui.text.style.i.f42675b.getClass();
                i13 = androidx.compose.ui.text.style.i.f42679f;
            } else if (iOrdinal == 4) {
                androidx.compose.ui.text.style.i.f42675b.getClass();
                i13 = androidx.compose.ui.text.style.i.f42676c;
            } else {
                if (iOrdinal != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                androidx.compose.ui.text.style.i.f42675b.getClass();
                i13 = androidx.compose.ui.text.style.i.f42677d;
            }
            int i15 = ((C36232a) interfaceC22204y1A.getF42167b()).f335334c;
            Integer numValueOf = i15 != 0 ? Integer.valueOf(i15) : null;
            int iIntValue = numValueOf != null ? numValueOf.intValue() : Integer.MAX_VALUE;
            if (((C36232a) interfaceC22204y1A.getF42167b()).f335333b) {
                s.f42720b.getClass();
                i14 = s.f42722d;
            } else {
                s.f42720b.getClass();
                i14 = s.f42721c;
            }
            com.akita.compose.foundation.ui.p.b(str, rVar, vVarA, false, 0L, androidx.compose.ui.text.style.i.a(i13), iIntValue, i14, false, null, bE2, 3072, 784);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C5205a(lVar, interfaceC36249i, i12);
        }
    }

    @Override // com.avito.beduin.v2.render.compose.AbstractC36347d
    @k
    public final String b() {
        return f175940c;
    }
}
