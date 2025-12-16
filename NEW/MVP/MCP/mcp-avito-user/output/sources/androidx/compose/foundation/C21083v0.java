package androidx.compose.foundation;

import androidx.compose.runtime.A;
import kotlin.Metadata;

/* compiled from: Clickable.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/v;", "invoke", "(Landroidx/compose/ui/v;Landroidx/compose/runtime/A;I)Landroidx/compose/ui/v;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21083v0 extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.ui.v, androidx.compose.runtime.A, Integer, androidx.compose.ui.v> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f32287l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f32288m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.semantics.i f32289n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f32290o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21083v0(boolean z12, String str, androidx.compose.ui.semantics.i iVar, Y41.a<kotlin.G0> aVar) {
        super(3);
        this.f32287l = z12;
        this.f32288m = str;
        this.f32289n = iVar;
        this.f32290o = aVar;
    }

    @Override // Y41.q
    public final androidx.compose.ui.v invoke(androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.foundation.interaction.m mVar;
        androidx.compose.runtime.A a13 = a12;
        num.intValue();
        a13.C(-756081143);
        InterfaceC20834q1 interfaceC20834q1 = (InterfaceC20834q1) a13.o(C20839s1.f30098a);
        if (interfaceC20834q1 instanceof InterfaceC21084v1) {
            a13.C(617653824);
            a13.h();
            mVar = null;
        } else {
            a13.C(617786442);
            Object objT = a13.t();
            androidx.compose.runtime.A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = androidx.compose.foundation.interaction.l.a();
                a13.H(objT);
            }
            mVar = (androidx.compose.foundation.interaction.m) objT;
            a13.h();
        }
        androidx.compose.foundation.interaction.m mVar2 = mVar;
        androidx.compose.ui.v vVarA = C21086w0.a(androidx.compose.ui.v.f42878y1, mVar2, interfaceC20834q1, this.f32287l, this.f32288m, this.f32289n, this.f32290o);
        a13.h();
        return vVarA;
    }
}
