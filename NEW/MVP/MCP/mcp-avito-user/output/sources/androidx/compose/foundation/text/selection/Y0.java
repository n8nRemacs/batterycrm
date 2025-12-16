package androidx.compose.foundation.text.selection;

import kotlin.Metadata;

/* compiled from: SelectionRegistrarImpl.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/text/selection/v;", "a", "b", "", "invoke", "(Landroidx/compose/foundation/text/selection/v;Landroidx/compose/foundation/text/selection/v;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class Y0 extends kotlin.jvm.internal.N implements Y41.p<InterfaceC21041v, InterfaceC21041v, Integer> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.layout.A f31903l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y0(androidx.compose.ui.layout.A a12) {
        super(2);
        this.f31903l = a12;
    }

    @Override // Y41.p
    public final Integer invoke(InterfaceC21041v interfaceC21041v, InterfaceC21041v interfaceC21041v2) {
        long jZ2;
        androidx.compose.ui.layout.A aC2 = interfaceC21041v.c();
        androidx.compose.ui.layout.A aC3 = interfaceC21041v2.c();
        androidx.compose.ui.layout.A a12 = this.f31903l;
        long jZ3 = 0;
        if (aC2 != null) {
            l0.g.f413384b.getClass();
            jZ2 = a12.z(aC2, 0L);
        } else {
            l0.g.f413384b.getClass();
            jZ2 = 0;
        }
        if (aC3 != null) {
            l0.g.f413384b.getClass();
            jZ3 = a12.z(aC3, 0L);
        } else {
            l0.g.f413384b.getClass();
        }
        int i12 = (int) (jZ2 & 4294967295L);
        int i13 = (int) (4294967295L & jZ3);
        return Integer.valueOf(Float.intBitsToFloat(i12) == Float.intBitsToFloat(i13) ? kotlin.comparisons.a.b(Float.valueOf(Float.intBitsToFloat((int) (jZ2 >> 32))), Float.valueOf(Float.intBitsToFloat((int) (jZ3 >> 32)))) : kotlin.comparisons.a.b(Float.valueOf(Float.intBitsToFloat(i12)), Float.valueOf(Float.intBitsToFloat(i13))));
    }
}
