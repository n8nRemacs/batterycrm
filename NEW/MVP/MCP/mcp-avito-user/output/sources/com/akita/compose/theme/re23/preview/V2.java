package com.akita.compose.theme.re23.preview;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.v;
import com.akita.compose.component.segmented_control.SegmentedControlState;
import com.akita.compose.theme.re23.preview.AbstractC27462u0;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SegmentedControlPreview.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/T1;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class V2 extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.foundation.layout.T1, androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.Q<String, com.akita.compose.component.segmented_control.z> f65533l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractC27462u0.b<SegmentedControlState> f65534m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22196w1 f65535n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List<kotlin.Q<String, Boolean>> f65536o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, kotlin.G0> f65537p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public V2(kotlin.Q<String, com.akita.compose.component.segmented_control.z> q12, AbstractC27462u0.b<SegmentedControlState> bVar, InterfaceC22196w1 interfaceC22196w1, List<kotlin.Q<String, Boolean>> list, Y41.l<? super String, kotlin.G0> lVar) {
        super(3);
        this.f65533l = q12;
        this.f65534m = bVar;
        this.f65535n = interfaceC22196w1;
        this.f65536o = list;
        this.f65537p = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.q
    public final kotlin.G0 invoke(androidx.compose.foundation.layout.T1 t12, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            v.a aVar = androidx.compose.ui.v.f42878y1;
            FillElement fillElement = C20588k2.f28682c;
            aVar.getClass();
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.ui.i iVar = InterfaceC22215f.a.f39083i;
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(iVar, false);
            int f37888q = a13.getF37888Q();
            androidx.compose.runtime.O1 o1Y = a13.y();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, fillElement);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            if (a13.F() == null) {
                C22190v.b();
                throw null;
            }
            a13.A();
            if (a13.getF37887P()) {
                a13.b(aVar2);
            } else {
                a13.d();
            }
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40796g, a13, interfaceC22365i0D);
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q))) {
                androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
            }
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
            C20644z c20644z = C20644z.f28804a;
            InterfaceC22196w1 interfaceC22196w1 = this.f65535n;
            int iE2 = interfaceC22196w1.e();
            com.akita.compose.component.segmented_control.z zVar = this.f65533l.f406620c;
            androidx.compose.ui.v vVarD = c20644z.d(aVar, iVar);
            com.akita.compose.component.segmented_control.p.b(iE2, (SegmentedControlState) C22126m3.b(this.f65534m.f65855c, a13).getF42167b(), zVar, vVarD, new U2(this.f65536o, interfaceC22196w1, this.f65537p), a13, 0);
            a13.z();
        }
        return kotlin.G0.f406611a;
    }
}
