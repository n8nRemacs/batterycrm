package androidx.compose.ui.layout;

import androidx.compose.runtime.C22082i3;
import androidx.compose.ui.layout.Q;
import kotlin.Metadata;

/* compiled from: SubcomposeLayout.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class V extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Q.b f40414l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f40415m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public V(Q.b bVar, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar) {
        super(2);
        this.f40414l = bVar;
        this.f40415m = pVar;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if (a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
            Boolean bool = (Boolean) ((C22082i3) this.f40414l.f40387f).getF42167b();
            boolean zBooleanValue = bool.booleanValue();
            a13.e(bool);
            boolean zJ2 = a13.j(zBooleanValue);
            if (zBooleanValue) {
                this.f40415m.invoke(a13, 0);
            } else {
                a13.v(zJ2);
            }
            a13.s();
        } else {
            a13.f();
        }
        return kotlin.G0.f406611a;
    }
}
