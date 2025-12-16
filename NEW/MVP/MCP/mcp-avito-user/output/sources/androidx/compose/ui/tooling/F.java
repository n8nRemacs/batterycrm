package androidx.compose.ui.tooling;

import androidx.compose.material.E7;
import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.U2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PreviewActivity.android.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class F extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object[] f42752l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f42753m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f42754n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(String str, String str2, Object[] objArr) {
        super(2);
        this.f42752l = objArr;
        this.f42753m = str;
        this.f42754n = str2;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if (a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objT = a13.t();
            androidx.compose.runtime.A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = U2.a(0);
                a13.H(objT);
            }
            InterfaceC22196w1 interfaceC22196w1 = (InterfaceC22196w1) objT;
            Object[] objArr = this.f42752l;
            E7.a(null, null, null, null, null, androidx.compose.runtime.internal.r.c(958604965, new D(interfaceC22196w1, objArr), a13), 0, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, androidx.compose.runtime.internal.r.c(57310875, new E(this.f42753m, this.f42754n, objArr, interfaceC22196w1), a13), a13, 196608);
        } else {
            a13.f();
        }
        return G0.f406611a;
    }
}
