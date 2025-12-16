package androidx.compose.foundation.text;

import androidx.compose.foundation.text.C20862e2;
import androidx.compose.foundation.text.C20985q1;
import androidx.compose.foundation.text.selection.C21011f1;
import androidx.compose.runtime.C22082i3;
import androidx.compose.ui.platform.InterfaceC22489j2;
import kotlin.Metadata;

/* compiled from: CoreTextField.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll0/g;", "offset", "Lkotlin/G0;", "invoke-k-4lQ0M", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class Q0 extends kotlin.jvm.internal.N implements Y41.l<l0.g, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C20985q1 f30504l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.focus.S f30505m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f30506n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f30507o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C21011f1 f30508p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.input.L f30509q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(C20985q1 c20985q1, androidx.compose.ui.focus.S s5, boolean z12, boolean z13, C21011f1 c21011f1, androidx.compose.ui.text.input.L l12) {
        super(1);
        this.f30504l = c20985q1;
        this.f30505m = s5;
        this.f30506n = z12;
        this.f30507o = z13;
        this.f30508p = c21011f1;
        this.f30509q = l12;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(l0.g gVar) {
        InterfaceC22489j2 interfaceC22489j2;
        long j12 = gVar.f413387a;
        C20985q1 c20985q1 = this.f30504l;
        if (!c20985q1.b()) {
            androidx.compose.ui.focus.S.c(this.f30505m);
        } else if (!this.f30506n && (interfaceC22489j2 = c20985q1.f31780c) != null) {
            interfaceC22489j2.show();
        }
        if (c20985q1.b() && this.f30507o) {
            if (c20985q1.a() != HandleState.f30334c) {
                Q2 q2D = c20985q1.d();
                if (q2D != null) {
                    C20862e2.a aVar = C20862e2.f30700a;
                    Y41.l<androidx.compose.ui.text.input.W, kotlin.G0> lVar = c20985q1.f31799v;
                    aVar.getClass();
                    int iA2 = this.f30509q.a(q2D.b(j12, true));
                    ((C20985q1.b) lVar).invoke(androidx.compose.ui.text.input.W.a(c20985q1.f31781d.f42456a, null, androidx.compose.ui.text.w0.a(iA2, iA2), 5));
                    if (c20985q1.f31778a.f30561a.f42127c.length() > 0) {
                        ((C22082i3) c20985q1.f31788k).setValue(HandleState.f30335d);
                    }
                }
            } else {
                this.f30508p.g(l0.g.a(j12));
            }
        }
        return kotlin.G0.f406611a;
    }
}
