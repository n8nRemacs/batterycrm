package com.avito.android.lib.beduin_v2.component.spinner.compose;

import Y41.l;
import Y41.p;
import Y61.k;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.P;
import bU.C25564h;
import com.akita.compose.component.spinner.h;
import com.akita.compose.component.spinner.j;
import com.avito.beduin.v2.avito.component.spinner.state.g;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import com.avito.beduin.v2.render.compose.AbstractC36347d;
import com.avito.beduin.v2.render.compose.C36351h;
import com.avito.beduin.v2.render.compose.m;
import com.avito.beduin.v2.render.compose.n;
import com.avito.beduin.v2.render.compose.o;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SpinnerComponent.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/spinner/compose/a;", "Lcom/avito/beduin/v2/render/compose/d;", "Lcom/avito/beduin/v2/avito/component/spinner/state/a;", "<init>", "()V", "spinnerState", "_design-modules_beduin-v2_renderer-compose_component_spinner"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends AbstractC36347d<com.avito.beduin.v2.avito.component.spinner.state.a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f175917b = new a();

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final String f175918c = "Spinner";

    /* compiled from: SpinnerComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.component.spinner.compose.a$a, reason: collision with other inner class name */
    public static final class C5203a extends N implements p<A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l<m, n> f175920m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC36249i f175921n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f175922o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5203a(l<? super m, n> lVar, InterfaceC36249i interfaceC36249i, int i12) {
            super(2);
            this.f175920m = lVar;
            this.f175921n = interfaceC36249i;
            this.f175922o = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f175922o | 1);
            l<m, n> lVar = this.f175920m;
            InterfaceC36249i interfaceC36249i = this.f175921n;
            a.this.a(lVar, interfaceC36249i, a12, iA2);
            return G0.f406611a;
        }
    }

    public a() {
        super(g.f335143c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.beduin.v2.render.compose.AbstractC36347d
    @InterfaceC22132o
    @InterfaceC22181t
    public final void a(@k l<? super m, n> lVar, @k InterfaceC36249i interfaceC36249i, @Y61.l A a12, int i12) {
        B bE2 = a12.E(840556847);
        InterfaceC22204y1 interfaceC22204y1A = C36351h.a(interfaceC36249i, bE2, 8);
        if (((com.avito.beduin.v2.avito.component.spinner.state.a) interfaceC22204y1A.getF42167b()).f335134b) {
            j.a((h) C25564h.a(((com.avito.beduin.v2.avito.component.spinner.state.a) interfaceC22204y1A.getF42167b()).f335133a, null, bE2, 1), o.b(lVar, bE2, i12 & 14), bE2, 0);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C5203a(lVar, interfaceC36249i, i12);
        }
    }

    @Override // com.avito.beduin.v2.render.compose.AbstractC36347d
    @k
    public final String b() {
        return f175918c;
    }
}
