package androidx.compose.material;

import androidx.compose.runtime.C22143q0;
import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: Snackbar.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.material.q9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21315q9 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22096n f33997l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C22096n f33998m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21315q9(C22096n c22096n, C22096n c22096n2) {
        super(2);
        this.f33997l = c22096n;
        this.f33998m = c22096n2;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if (a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
            C22143q0 c22143q0 = C21427z2.f34423a;
            C21414y2.f34415a.getClass();
            androidx.compose.runtime.S.a(c22143q0.b(Float.valueOf(C21414y2.b(a13))), androidx.compose.runtime.internal.r.c(1939362236, new C21302p9(this.f33997l, this.f33998m), a13), a13, 56);
        } else {
            a13.f();
        }
        return kotlin.G0.f406611a;
    }
}
