package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: FlowLayout.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class R0 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22096n f28485l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(C22096n c22096n) {
        super(2);
        this.f28485l = c22096n;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if (a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
            this.f28485l.invoke(C20614r1.f28730b, a13, 6);
        } else {
            a13.f();
        }
        return kotlin.G0.f406611a;
    }
}
