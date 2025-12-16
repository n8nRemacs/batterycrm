package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.C21045x;
import androidx.compose.ui.text.v0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;

/* compiled from: SelectionAdjustment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/x$a;", "invoke", "()Landroidx/compose/foundation/text/selection/x$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class A extends kotlin.jvm.internal.N implements Y41.a<C21045x.a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C21043w f31820l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f31821m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f31822n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC21023l0 f31823o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f31824p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(C21043w c21043w, int i12, int i13, InterfaceC21023l0 interfaceC21023l0, InterfaceC42726C<Integer> interfaceC42726C) {
        super(0);
        this.f31820l = c21043w;
        this.f31821m = i12;
        this.f31822n = i13;
        this.f31823o = interfaceC21023l0;
        this.f31824p = interfaceC42726C;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // Y41.a
    public final C21045x.a invoke() {
        int iIntValue = ((Number) this.f31824p.getValue()).intValue();
        InterfaceC21023l0 interfaceC21023l0 = this.f31823o;
        boolean f31945a = interfaceC21023l0.getF31945a();
        boolean z12 = interfaceC21023l0.c() == CrossStatus.f31829b;
        C21043w c21043w = this.f31820l;
        androidx.compose.ui.text.o0 o0Var = c21043w.f32154f;
        int i12 = this.f31821m;
        long jL2 = o0Var.l(i12);
        v0.a aVar = androidx.compose.ui.text.v0.f42734b;
        int i13 = (int) (jL2 >> 32);
        androidx.compose.ui.text.o0 o0Var2 = c21043w.f32154f;
        int iD2 = o0Var2.f42527b.d(i13);
        androidx.compose.ui.text.G g12 = o0Var2.f42527b;
        if (iD2 != iIntValue) {
            int i14 = g12.f41921f;
            i13 = iIntValue >= i14 ? o0Var2.i(i14 - 1) : o0Var2.i(iIntValue);
        }
        int iC2 = (int) (jL2 & 4294967295L);
        if (g12.d(iC2) != iIntValue) {
            int i15 = g12.f41921f;
            iC2 = iIntValue >= i15 ? g12.c(i15 - 1, false) : g12.c(iIntValue, false);
        }
        int i16 = this.f31822n;
        if (i13 == i16) {
            return c21043w.a(iC2);
        }
        if (iC2 == i16) {
            return c21043w.a(i13);
        }
        if (!(f31945a ^ z12) ? i12 >= i13 : i12 > iC2) {
            i13 = iC2;
        }
        return c21043w.a(i13);
    }
}
