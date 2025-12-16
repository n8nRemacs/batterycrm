package androidx.compose.foundation.contextmenu;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ContextMenuUi.android.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class z extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f27076l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f27077m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ N f27078n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z(g gVar, androidx.compose.ui.v vVar, Y41.l<? super p, G0> lVar) {
        super(2);
        this.f27076l = gVar;
        this.f27077m = vVar;
        this.f27078n = (N) lVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if (a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
            ?? r02 = this.f27078n;
            g gVar = this.f27076l;
            B.a(gVar, this.f27077m, androidx.compose.runtime.internal.r.c(1156688164, new y(r02, gVar), a13), a13, 384);
        } else {
            a13.f();
        }
        return G0.f406611a;
    }
}
