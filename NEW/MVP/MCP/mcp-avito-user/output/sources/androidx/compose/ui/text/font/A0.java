package androidx.compose.ui.text.font;

import kotlin.G0;
import kotlin.Metadata;

/* compiled from: FontFamilyResolver.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/font/C0;", "finalResult", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/text/font/C0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class A0 extends kotlin.jvm.internal.N implements Y41.l<C0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ B0 f42162l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z0 f42163m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(B0 b02, z0 z0Var) {
        super(1);
        this.f42162l = b02;
        this.f42163m = z0Var;
    }

    @Override // Y41.l
    public final G0 invoke(C0 c02) {
        C0 c03 = c02;
        B0 b02 = this.f42162l;
        androidx.compose.ui.text.platform.A a12 = b02.f42164a;
        z0 z0Var = this.f42163m;
        synchronized (a12) {
            try {
                if (c03.getF42168c()) {
                    b02.f42165b.put(z0Var, c03);
                } else {
                    b02.f42165b.remove(z0Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return G0.f406611a;
    }
}
