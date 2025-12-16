package androidx.compose.material;

import androidx.compose.runtime.C22143q0;
import kotlin.Metadata;

/* compiled from: AlertDialog.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.material.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21149e extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f33539l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C21149e(Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar) {
        super(2);
        this.f33539l = pVar;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if (a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
            C22143q0 c22143q0 = C21427z2.f34423a;
            C21414y2.f34415a.getClass();
            androidx.compose.runtime.S.a(c22143q0.b(Float.valueOf(C21414y2.b(a13))), androidx.compose.runtime.internal.r.c(770166432, new C21136d(this.f33539l), a13), a13, 56);
        } else {
            a13.f();
        }
        return kotlin.G0.f406611a;
    }
}
