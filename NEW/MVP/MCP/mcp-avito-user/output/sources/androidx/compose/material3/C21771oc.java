package androidx.compose.material3;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.text.C20973n1;
import androidx.compose.foundation.text.C20981p1;
import androidx.compose.foundation.text.C21055u;
import androidx.compose.runtime.internal.C22096n;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: OutlinedTextField.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.oc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21771oc extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f36966A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f36967B;

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f36968C;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f36969D;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f36970E;

    /* renamed from: F, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.graphics.h1 f36971F;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f36972l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f36973m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f36974n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C21935vi f36975o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.input.W f36976p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.l<androidx.compose.ui.text.input.W, kotlin.G0> f36977q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f36978r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f36979s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.x0 f36980t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C20981p1 f36981u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C20973n1 f36982v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f36983w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f36984x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f36985y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.input.k0 f36986z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21771oc(Y41.p pVar, androidx.compose.ui.v vVar, boolean z12, C21935vi c21935vi, androidx.compose.ui.text.input.W w12, Y41.l lVar, boolean z13, boolean z14, androidx.compose.ui.text.x0 x0Var, C20981p1 c20981p1, C20973n1 c20973n1, boolean z15, int i12, int i13, androidx.compose.ui.text.input.k0 k0Var, androidx.compose.foundation.interaction.m mVar, Y41.p pVar2, Y41.p pVar3, Y41.p pVar4, Y41.p pVar5, androidx.compose.ui.graphics.h1 h1Var) {
        super(2);
        this.f36972l = pVar;
        this.f36973m = vVar;
        this.f36974n = z12;
        this.f36975o = c21935vi;
        this.f36976p = w12;
        this.f36977q = lVar;
        this.f36978r = z13;
        this.f36979s = z14;
        this.f36980t = x0Var;
        this.f36981u = c20981p1;
        this.f36982v = c20973n1;
        this.f36983w = z15;
        this.f36984x = i12;
        this.f36985y = i13;
        this.f36986z = k0Var;
        this.f36966A = mVar;
        this.f36967B = pVar2;
        this.f36968C = pVar3;
        this.f36969D = pVar4;
        this.f36970E = pVar5;
        this.f36971F = h1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 3) == 2 && a13.c()) {
            a13.f();
        } else {
            Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar = this.f36972l;
            androidx.compose.ui.v vVarM = this.f36973m;
            if (pVar != null) {
                vVarM = androidx.compose.foundation.layout.R1.m(androidx.compose.ui.semantics.r.b(vVarM, true, C21702lc.f36810l), 0.0f, C21565fc.f36341b, 0.0f, 0.0f, 13);
            }
            int i12 = Ng.f35206b;
            String strA = Og.a(a13, R.string.default_error_message);
            boolean z12 = this.f36974n;
            androidx.compose.ui.v vVarC = C21457aj.c(vVarM, z12, strA);
            C21542ec.f36256a.getClass();
            androidx.compose.ui.v vVarA = C20588k2.a(vVarC, C21542ec.f36258c, C21542ec.f36257b);
            C21935vi c21935vi = this.f36975o;
            androidx.compose.ui.graphics.k1 k1Var = new androidx.compose.ui.graphics.k1(((androidx.compose.ui.graphics.T) c21935vi.c(z12, a13).getF42167b()).f39331a, null);
            androidx.compose.ui.graphics.h1 h1Var = this.f36971F;
            androidx.compose.ui.text.input.W w12 = this.f36976p;
            boolean z13 = this.f36978r;
            boolean z14 = this.f36983w;
            androidx.compose.ui.text.input.k0 k0Var = this.f36986z;
            androidx.compose.foundation.interaction.m mVar = this.f36966A;
            C22096n c22096nB = androidx.compose.runtime.internal.r.b(a13, -757328870, new C21748nc(w12, z13, z14, k0Var, mVar, this.f36974n, this.f36972l, this.f36967B, this.f36968C, this.f36969D, this.f36970E, c21935vi, h1Var));
            C21055u.a(w12, this.f36977q, vVarA, z13, this.f36979s, this.f36980t, this.f36981u, this.f36982v, z14, this.f36984x, this.f36985y, k0Var, null, mVar, k1Var, c22096nB, a13, 0, 196608, 4096);
        }
        return kotlin.G0.f406611a;
    }
}
