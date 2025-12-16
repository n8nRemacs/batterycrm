package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.text.C20991s0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ContextMenuUi.android.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/contextmenu/g;", "colors", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/contextmenu/g;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class q extends N implements Y41.q<g, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C20991s0 f27040l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f27041m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ N f27042n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(C20991s0 c20991s0, androidx.compose.ui.v vVar, Y41.a aVar) {
        super(3);
        this.f27040l = c20991s0;
        this.f27041m = vVar;
        this.f27042n = (N) aVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.q
    public final G0 invoke(g gVar, androidx.compose.runtime.A a12, Integer num) {
        g gVar2 = gVar;
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= a13.B(gVar2) ? 4 : 2;
        }
        if (a13.p(iIntValue & 1, (iIntValue & 19) != 18)) {
            String str = (String) this.f27040l.invoke(a13, 0);
            if (C43066x.K(str)) {
                androidx.compose.foundation.internal.e.c("Label must not be blank");
            }
            B.b(str, gVar2, this.f27041m, this.f27042n, a13, (iIntValue << 6) & 896);
        } else {
            a13.f();
        }
        return G0.f406611a;
    }
}
