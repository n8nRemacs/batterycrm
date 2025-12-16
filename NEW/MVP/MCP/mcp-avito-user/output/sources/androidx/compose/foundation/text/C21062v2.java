package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.C21011f1;
import androidx.compose.runtime.A;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: TextFieldKeyInput.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/v;", "invoke", "(Landroidx/compose/ui/v;Landroidx/compose/runtime/A;I)Landroidx/compose/ui/v;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.text.v2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21062v2 extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.ui.v, androidx.compose.runtime.A, Integer, androidx.compose.ui.v> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C20985q1 f32260l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C21011f1 f32261m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.input.W f32262n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f32263o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f32264p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.input.L f32265q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i3 f32266r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.l<androidx.compose.ui.text.input.W, kotlin.G0> f32267s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f32268t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C21062v2(C20985q1 c20985q1, C21011f1 c21011f1, androidx.compose.ui.text.input.W w12, boolean z12, boolean z13, androidx.compose.ui.text.input.L l12, i3 i3Var, Y41.l<? super androidx.compose.ui.text.input.W, kotlin.G0> lVar, int i12) {
        super(3);
        this.f32260l = c20985q1;
        this.f32261m = c21011f1;
        this.f32262n = w12;
        this.f32263o = z12;
        this.f32264p = z13;
        this.f32265q = l12;
        this.f32266r = i3Var;
        this.f32267s = lVar;
        this.f32268t = i12;
    }

    @Override // Y41.q
    public final androidx.compose.ui.v invoke(androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        num.intValue();
        a13.C(851809892);
        Object objT = a13.t();
        androidx.compose.runtime.A.f37866a.getClass();
        A.a.C1651a c1651a = A.a.f37868b;
        if (objT == c1651a) {
            objT = new androidx.compose.foundation.text.selection.C1();
            a13.H(objT);
        }
        androidx.compose.foundation.text.selection.C1 c12 = (androidx.compose.foundation.text.selection.C1) objT;
        Object objT2 = a13.t();
        if (objT2 == c1651a) {
            objT2 = new X0();
            a13.H(objT2);
        }
        Y41.l<androidx.compose.ui.text.input.W, kotlin.G0> lVar = this.f32267s;
        C20985q1 c20985q1 = this.f32260l;
        C21011f1 c21011f1 = this.f32261m;
        i3 i3Var = this.f32266r;
        C20958j2 c20958j2 = new C20958j2(c20985q1, c21011f1, this.f32262n, this.f32263o, this.f32264p, c12, this.f32265q, i3Var, (X0) objT2, null, lVar, this.f32268t, 512, null);
        v.a aVar = androidx.compose.ui.v.f42878y1;
        boolean zU2 = a13.u(c20958j2);
        Object objT3 = a13.t();
        if (zU2 || objT3 == c1651a) {
            objT3 = new C21058u2(1, c20958j2, C20958j2.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
            a13.H(objT3);
        }
        androidx.compose.ui.v vVarA = androidx.compose.ui.input.key.f.a(aVar, (Y41.l) ((kotlin.reflect.i) objT3));
        a13.h();
        return vVarA;
    }
}
