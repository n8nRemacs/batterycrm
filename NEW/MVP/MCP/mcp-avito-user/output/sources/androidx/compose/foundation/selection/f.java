package androidx.compose.foundation.selection;

import Y41.q;
import androidx.compose.foundation.C20839s1;
import androidx.compose.foundation.InterfaceC20834q1;
import androidx.compose.foundation.InterfaceC21084v1;
import androidx.compose.runtime.A;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Toggleable.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/v;", "invoke", "(Landroidx/compose/ui/v;Landroidx/compose/runtime/A;I)Landroidx/compose/ui/v;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class f extends N implements q<v, A, Integer, v> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f30127l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f30128m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Boolean, G0> f30129n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z12, boolean z13, Y41.l lVar) {
        super(3);
        this.f30127l = z12;
        this.f30128m = z13;
        this.f30129n = lVar;
    }

    @Override // Y41.q
    public final v invoke(v vVar, A a12, Integer num) {
        androidx.compose.foundation.interaction.m mVar;
        A a13 = a12;
        num.intValue();
        a13.C(290332169);
        InterfaceC20834q1 interfaceC20834q1 = (InterfaceC20834q1) a13.o(C20839s1.f30098a);
        if (interfaceC20834q1 instanceof InterfaceC21084v1) {
            a13.C(-2130062114);
            a13.h();
            mVar = null;
        } else {
            a13.C(-2129929496);
            Object objT = a13.t();
            A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = androidx.compose.foundation.interaction.l.a();
                a13.H(objT);
            }
            mVar = (androidx.compose.foundation.interaction.m) objT;
            a13.h();
        }
        androidx.compose.foundation.interaction.m mVar2 = mVar;
        v vVarA = g.a(v.f42878y1, this.f30127l, mVar2, interfaceC20834q1, this.f30128m, null, this.f30129n);
        a13.h();
        return vVarA;
    }
}
