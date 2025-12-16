package androidx.compose.foundation.text;

import androidx.compose.foundation.text.C20862e2;
import androidx.compose.foundation.text.selection.C21011f1;
import androidx.compose.runtime.C22082i3;
import androidx.compose.ui.text.input.C22654u;
import androidx.compose.ui.text.input.C22655v;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.C43259k;

/* compiled from: CoreTextField.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/f0;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/focus/f0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class N0 extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.focus.f0, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C20985q1 f30485l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f30486m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f30487n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.input.Y f30488o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.input.W f30489p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C22655v f30490q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.input.L f30491r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C21011f1 f30492s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f30493t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.relocation.a f30494u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N0(C20985q1 c20985q1, boolean z12, boolean z13, androidx.compose.ui.text.input.Y y12, androidx.compose.ui.text.input.W w12, C22655v c22655v, androidx.compose.ui.text.input.L l12, C21011f1 c21011f1, kotlinx.coroutines.T t12, androidx.compose.foundation.relocation.a aVar) {
        super(1);
        this.f30485l = c20985q1;
        this.f30486m = z12;
        this.f30487n = z13;
        this.f30488o = y12;
        this.f30489p = w12;
        this.f30490q = c22655v;
        this.f30491r = l12;
        this.f30492s = c21011f1;
        this.f30493t = t12;
        this.f30494u = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, androidx.compose.ui.text.input.i0, java.lang.Object] */
    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.ui.focus.f0 f0Var) {
        Q2 q2D;
        androidx.compose.ui.focus.f0 f0Var2 = f0Var;
        C20985q1 c20985q1 = this.f30485l;
        if (c20985q1.b() != f0Var2.a()) {
            ((C22082i3) c20985q1.f31783f).setValue(Boolean.valueOf(f0Var2.a()));
            if (c20985q1.b() && this.f30486m && !this.f30487n) {
                C20862e2.a aVar = C20862e2.f30700a;
                Y41.l<androidx.compose.ui.text.input.W, kotlin.G0> lVar = c20985q1.f31799v;
                Y41.l<C22654u, kotlin.G0> lVar2 = c20985q1.f31800w;
                aVar.getClass();
                l0.h hVar = new l0.h();
                C20854c2 c20854c2 = new C20854c2(c20985q1.f31781d, lVar, hVar);
                androidx.compose.ui.text.input.Y y12 = this.f30488o;
                androidx.compose.ui.text.input.P p12 = y12.f42388a;
                androidx.compose.ui.text.input.W w12 = this.f30489p;
                p12.c(w12, this.f30490q, c20854c2, lVar2);
                ?? i0Var = new androidx.compose.ui.text.input.i0(y12, p12);
                y12.f42389b.set(i0Var);
                hVar.f406842b = i0Var;
                c20985q1.f31782e = i0Var;
                V0.f(c20985q1, w12, this.f30491r);
            } else {
                V0.e(c20985q1);
            }
            if (f0Var2.a() && (q2D = c20985q1.d()) != null) {
                C43259k.d(this.f30493t, null, null, new M0(this.f30494u, this.f30489p, c20985q1, q2D, this.f30491r, null), 3);
            }
            if (!f0Var2.a()) {
                this.f30492s.g(null);
            }
        }
        return kotlin.G0.f406611a;
    }
}
