package androidx.compose.material;

import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: Scaffold.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class O7 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E4 f33018l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C22096n f33019m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O7(E4 e42, C22096n c22096n) {
        super(2);
        this.f33018l = e42;
        this.f33019m = c22096n;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if (a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
            androidx.compose.runtime.S.a(E7.f32587a.b(this.f33018l), this.f33019m, a13, 8);
        } else {
            a13.f();
        }
        return kotlin.G0.f406611a;
    }
}
