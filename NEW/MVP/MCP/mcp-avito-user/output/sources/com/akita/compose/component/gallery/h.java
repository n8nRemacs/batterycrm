package com.akita.compose.component.gallery;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.lazy.InterfaceC20793y;
import androidx.compose.foundation.lazy.layout.C0;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.graphics.h1;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.P;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Gallery.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/y;", "", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;ILandroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class h extends N implements Y41.r<InterfaceC20793y, Integer, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s f61601l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u f61602m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e f61603n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(s sVar, u uVar, e eVar) {
        super(4);
        this.f61601l = sVar;
        this.f61602m = uVar;
        this.f61603n = eVar;
    }

    @Override // Y41.r
    public final G0 invoke(InterfaceC20793y interfaceC20793y, Integer num, A a12, Integer num2) {
        androidx.compose.ui.v vVarA;
        int iIntValue = num.intValue();
        A a13 = a12;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 112) == 0) {
            iIntValue2 |= a13.m(iIntValue) ? 32 : 16;
        }
        if ((iIntValue2 & 721) == 144 && a13.c()) {
            a13.f();
        } else {
            s sVar = this.f61601l;
            C0<c> c02 = sVar.f61623a;
            int i12 = c02.f29258b;
            u uVar = this.f61602m;
            h1 h1Var = i12 == 1 ? uVar.f61632e : iIntValue == 0 ? uVar.f61633f : iIntValue == i12 - 1 ? uVar.f61635h : uVar.f61634g;
            int i13 = ((Configuration) a13.o(AndroidCompositionLocals_androidKt.f41068a)).orientation;
            int i14 = c02.f29258b;
            e eVar = this.f61603n;
            if (i14 == 1) {
                v.a aVar = androidx.compose.ui.v.f42878y1;
                eVar.getClass();
                GallerySizeElement gallerySizeElement = new GallerySizeElement(eVar.f61593a, eVar.f61594b, false, "fillGalleryMaxSize", 4, null);
                aVar.getClass();
                vVarA = gallerySizeElement;
            } else if (i14 == 2 || i14 == 3) {
                v.a aVar2 = androidx.compose.ui.v.f42878y1;
                float f12 = o.f61621a;
                vVarA = P.a(aVar2, new l(i13, sVar, eVar));
            } else {
                vVarA = androidx.compose.ui.v.f42878y1;
            }
            androidx.compose.ui.v vVarB = androidx.compose.foundation.A.b(androidx.compose.ui.draw.k.a(vVarA, h1Var), uVar.f61630c.c(a13), Y0.f39346a);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39080f, false);
            int f37888q = a13.getF37888Q();
            O1 o1Y = a13.y();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarB);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
            if (a13.F() == null) {
                C22190v.b();
                throw null;
            }
            a13.A();
            if (a13.getF37887P()) {
                a13.b(aVar3);
            } else {
                a13.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, a13, interfaceC22365i0D);
            R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
            C20644z c20644z = C20644z.f28804a;
            c02.b(iIntValue).f29413c.f61592a.invoke(eVar, Integer.valueOf(iIntValue), a13, Integer.valueOf((iIntValue2 & 112) | 6));
            a13.z();
        }
        return G0.f406611a;
    }
}
