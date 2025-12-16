package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.C21093y1;
import androidx.compose.foundation.R1;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: TextFieldSelectionManager.android.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function0;", "Ll0/g;", "center", "Landroidx/compose/ui/v;", "invoke", "(LY41/a;)Landroidx/compose/ui/v;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class y1 extends kotlin.jvm.internal.N implements Y41.l<Y41.a<? extends l0.g>, androidx.compose.ui.v> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.unit.d f32165l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<androidx.compose.ui.unit.u> f32166m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(androidx.compose.ui.unit.d dVar, InterfaceC22204y1<androidx.compose.ui.unit.u> interfaceC22204y1) {
        super(1);
        this.f32165l = dVar;
        this.f32166m = interfaceC22204y1;
    }

    @Override // Y41.l
    public final androidx.compose.ui.v invoke(Y41.a<? extends l0.g> aVar) {
        v.a aVar2 = androidx.compose.ui.v.f42878y1;
        w1 w1Var = new w1(aVar);
        x1 x1Var = new x1(this.f32165l, this.f32166m);
        R1.f26834a.getClass();
        return C21093y1.b(aVar2, w1Var, x1Var, R1.a.a());
    }
}
