package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: LazySaveableStateHolder.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class x0 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22096n f29553l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s0 f29554m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(C22096n c22096n, s0 s0Var) {
        super(2);
        this.f29553l = c22096n;
        this.f29554m = s0Var;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if (a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
            this.f29553l.invoke(this.f29554m, a13, 0);
        } else {
            a13.f();
        }
        return kotlin.G0.f406611a;
    }
}
