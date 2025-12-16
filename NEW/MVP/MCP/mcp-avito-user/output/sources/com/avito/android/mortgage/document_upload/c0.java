package com.avito.android.mortgage.document_upload;

import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22543x1;
import com.avito.android.deep_linking.links.DeepLink;
import e00.C39840a;
import f00.C40196c;
import f00.d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DocumentUploadScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/T1;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class c0 extends kotlin.jvm.internal.N implements Y41.q<T1, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f00.d f199154l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C40196c f199155m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f199156n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f199157o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f199158p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f199159q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.l<C39840a, G0> f199160r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.l<C39840a, G0> f199161s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c0(f00.d dVar, C40196c c40196c, Y41.a<G0> aVar, Y41.l<? super DeepLink, G0> lVar, Y41.a<G0> aVar2, Y41.a<G0> aVar3, Y41.l<? super C39840a, G0> lVar2, Y41.l<? super C39840a, G0> lVar3) {
        super(3);
        this.f199154l = dVar;
        this.f199155m = c40196c;
        this.f199156n = aVar;
        this.f199157o = lVar;
        this.f199158p = aVar2;
        this.f199159q = aVar3;
        this.f199160r = lVar2;
        this.f199161s = lVar3;
    }

    @Override // Y41.q
    public final G0 invoke(T1 t12, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            f00.d dVar = this.f199154l;
            if (dVar instanceof d.a) {
                a13.C(300891986);
                com.avito.android.analytics.screens.mvi.r perfTrackerParams = this.f199155m.getPerfTrackerParams();
                a13.C(-976608008);
                a13.C(2063036140);
                boolean zBooleanValue = ((Boolean) a13.o(C22543x1.f41638a)).booleanValue();
                Y41.a<G0> aVar = this.f199156n;
                Y41.l<DeepLink, G0> lVar = this.f199157o;
                Y41.a<G0> aVar2 = this.f199158p;
                Y41.a<G0> aVar3 = this.f199159q;
                Y41.l<C39840a, G0> lVar2 = this.f199160r;
                Y41.l<C39840a, G0> lVar3 = this.f199161s;
                if (zBooleanValue) {
                    a13.C(421109671);
                    f0.c((d.a) dVar, aVar, lVar, aVar2, aVar3, lVar2, lVar3, a13, 0);
                    a13.h();
                } else {
                    a13.C(420357239);
                    com.avito.android.analytics.screens.compose.a aVar4 = (com.avito.android.analytics.screens.compose.a) a13.o(com.avito.android.analytics.screens.compose.c.f90576a);
                    if (perfTrackerParams != null) {
                        aVar4.m(perfTrackerParams.f90666a);
                    }
                    aVar4.l();
                    androidx.compose.ui.v vVarD = androidx.compose.ui.draw.o.d(androidx.compose.ui.v.f42878y1, new b0(perfTrackerParams, aVar4));
                    InterfaceC22215f.f39074a.getClass();
                    InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
                    int f37888q = a13.getF37888Q();
                    O1 o1Y = a13.y();
                    androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarD);
                    InterfaceC22413h.f40789C1.getClass();
                    Y41.a<InterfaceC22413h> aVar5 = InterfaceC22413h.a.f40791b;
                    if (a13.F() == null) {
                        C22190v.b();
                        throw null;
                    }
                    a13.A();
                    if (a13.getF37887P()) {
                        a13.b(aVar5);
                    } else {
                        a13.d();
                    }
                    R3.b(InterfaceC22413h.a.f40796g, a13, interfaceC22365i0D);
                    R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
                    Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                    if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q))) {
                        androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
                    }
                    R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
                    C20644z c20644z = C20644z.f28804a;
                    f0.c((d.a) dVar, aVar, lVar, aVar2, aVar3, lVar2, lVar3, a13, 0);
                    a13.z();
                    a13.h();
                }
                com.avito.android.authorization.auto_recovery.phone_confirm.b.m(a13);
            } else if (dVar instanceof d.c) {
                a13.C(-1098658212);
                f0.e(a13, 0);
                a13.h();
            } else {
                a13.C(301351406);
                a13.h();
            }
        }
        return G0.f406611a;
    }
}
