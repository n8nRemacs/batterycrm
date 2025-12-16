package com.avito.android.btob_business_trip.screens.resultSuccessScreen.composables;

import Y41.p;
import Y41.q;
import android.net.Uri;
import androidx.appcompat.app.r;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.T1;
import androidx.compose.foundation.lazy.C20650b;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SuccessScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/T1;", "innerPadding", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class e extends N implements q<T1, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f108067l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f108068m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Uri f108069n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f108070o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f108071p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i12, int i13, Uri uri, String str, String str2) {
        super(3);
        this.f108067l = i12;
        this.f108068m = i13;
        this.f108069n = uri;
        this.f108070o = str;
        this.f108071p = str2;
    }

    @Override // Y41.q
    public final G0 invoke(T1 t12, A a12, Integer num) {
        T1 t13 = t12;
        A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.B(t13) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && a13.c()) {
            a13.f();
        } else {
            v.a aVar = v.f42878y1;
            v vVarH = R1.h(aVar, t13);
            FillElement fillElement = C20588k2.f28682c;
            v vVarD0 = vVarH.d0(fillElement);
            C20585k.f28659a.getClass();
            C20585k.c cVar = C20585k.f28664f;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(cVar, InterfaceC22215f.a.f39088n, a13, 6);
            int f37888q = a13.getF37888Q();
            O1 o1Y = a13.y();
            v vVarC = n.c(a13, vVarD0);
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
            R3.b(InterfaceC22413h.a.f40796g, a13, iA2);
            R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
            p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                r.B(f37888q, a13, f37888q, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
            K k12 = K.f28344a;
            i.a aVar3 = InterfaceC22215f.a.f39089o;
            h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
            C20650b.a(R1.i(aVar, 16).d0(fillElement), null, null, false, cVar, aVar3, null, false, null, new d(this.f108067l, this.f108068m, this.f108069n, this.f108070o, this.f108071p), a13, 221190, 462);
            a13.z();
        }
        return G0.f406611a;
    }
}
