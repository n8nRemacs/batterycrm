package androidx.compose.ui.platform;

import kotlin.Metadata;

/* compiled from: AndroidPlatformTextInputSession.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/input/F;", "closedConnection", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/text/input/F;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.ui.platform.r1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22519r1 extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.text.input.F, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22523s1 f41585l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22519r1(C22523s1 c22523s1) {
        super(1);
        this.f41585l = c22523s1;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.ui.text.input.F f12) {
        androidx.compose.ui.text.input.F f13 = f12;
        f13.a();
        C22523s1 c22523s1 = this.f41585l;
        androidx.compose.runtime.collection.e<androidx.compose.ui.node.e1<androidx.compose.ui.text.input.F>> eVar = c22523s1.f41596d;
        androidx.compose.ui.node.e1<androidx.compose.ui.text.input.F>[] e1VarArr = eVar.f38260b;
        int i12 = eVar.f38262d;
        int i13 = 0;
        while (true) {
            if (i13 >= i12) {
                i13 = -1;
                break;
            }
            if (kotlin.jvm.internal.L.f(e1VarArr[i13], f13)) {
                break;
            }
            i13++;
        }
        androidx.compose.runtime.collection.e<androidx.compose.ui.node.e1<androidx.compose.ui.text.input.F>> eVar2 = c22523s1.f41596d;
        if (i13 >= 0) {
            eVar2.k(i13);
        }
        if (eVar2.f38262d == 0) {
            c22523s1.f41594b.invoke();
        }
        return kotlin.G0.f406611a;
    }
}
