package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.InterfaceC20717f;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LazyListItemProvider.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class M extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N f28824l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f28825m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(N n12, int i12) {
        super(2);
        this.f28824l = n12;
        this.f28825m = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if (a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
            N n12 = this.f28824l;
            androidx.compose.foundation.lazy.layout.C0<E> c02 = n12.f28827b.f28823a;
            int i12 = this.f28825m;
            InterfaceC20717f.a<E> aVarB = c02.b(i12);
            int i13 = i12 - aVarB.f29411a;
            E e12 = aVarB.f29413c;
            e12.f28815c.invoke(n12.f28828c, Integer.valueOf(i13), a13, 0);
        } else {
            a13.f();
        }
        return G0.f406611a;
    }
}
