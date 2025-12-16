package androidx.compose.ui.window;

import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AndroidDialog.android.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.ui.window.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22720g extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f43085l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22720g(InterfaceC22204y1 interfaceC22204y1) {
        super(2);
        this.f43085l = interfaceC22204y1;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if (a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
            C22724k.b(androidx.compose.ui.semantics.r.b(androidx.compose.ui.v.f42878y1, false, C22719f.f43084l), (Y41.p) this.f43085l.getF42167b(), a13, 0);
        } else {
            a13.f();
        }
        return G0.f406611a;
    }
}
