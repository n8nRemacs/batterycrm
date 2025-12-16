package androidx.compose.material3;

import Fc1.J1;
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
/* renamed from: androidx.compose.material3.jc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21656jc extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f36623A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f36624B;

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f36625C;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f36626D;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f36627E;

    /* renamed from: F, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.graphics.h1 f36628F;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f36629l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f36630m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f36631n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C21935vi f36632o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f36633p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ J1.b f36634q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f36635r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f36636s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.x0 f36637t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C20981p1 f36638u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C20973n1 f36639v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f36640w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f36641x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f36642y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.input.k0 f36643z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21656jc(Y41.p pVar, androidx.compose.ui.v vVar, boolean z12, C21935vi c21935vi, String str, J1.b bVar, boolean z13, boolean z14, androidx.compose.ui.text.x0 x0Var, C20981p1 c20981p1, C20973n1 c20973n1, boolean z15, int i12, int i13, androidx.compose.ui.text.input.k0 k0Var, androidx.compose.foundation.interaction.m mVar, Y41.p pVar2, Y41.p pVar3, Y41.p pVar4, Y41.p pVar5, androidx.compose.ui.graphics.h1 h1Var) {
        super(2);
        this.f36629l = pVar;
        this.f36630m = vVar;
        this.f36631n = z12;
        this.f36632o = c21935vi;
        this.f36633p = str;
        this.f36634q = bVar;
        this.f36635r = z13;
        this.f36636s = z14;
        this.f36637t = x0Var;
        this.f36638u = c20981p1;
        this.f36639v = c20973n1;
        this.f36640w = z15;
        this.f36641x = i12;
        this.f36642y = i13;
        this.f36643z = k0Var;
        this.f36623A = mVar;
        this.f36624B = pVar2;
        this.f36625C = pVar3;
        this.f36626D = pVar4;
        this.f36627E = pVar5;
        this.f36628F = h1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 3) == 2 && a13.c()) {
            a13.f();
        } else {
            Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar = this.f36629l;
            androidx.compose.ui.v vVarM = this.f36630m;
            if (pVar != null) {
                vVarM = androidx.compose.foundation.layout.R1.m(androidx.compose.ui.semantics.r.b(vVarM, true, C21588gc.f36427l), 0.0f, C21565fc.f36341b, 0.0f, 0.0f, 13);
            }
            int i12 = Ng.f35206b;
            String strA = Og.a(a13, R.string.default_error_message);
            boolean z12 = this.f36631n;
            androidx.compose.ui.v vVarC = C21457aj.c(vVarM, z12, strA);
            C21542ec.f36256a.getClass();
            androidx.compose.ui.v vVarA = C20588k2.a(vVarC, C21542ec.f36258c, C21542ec.f36257b);
            C21935vi c21935vi = this.f36632o;
            androidx.compose.ui.graphics.k1 k1Var = new androidx.compose.ui.graphics.k1(((androidx.compose.ui.graphics.T) c21935vi.c(z12, a13).getF42167b()).f39331a, null);
            androidx.compose.ui.graphics.h1 h1Var = this.f36628F;
            String str = this.f36633p;
            boolean z13 = this.f36635r;
            boolean z14 = this.f36640w;
            androidx.compose.ui.text.input.k0 k0Var = this.f36643z;
            androidx.compose.foundation.interaction.m mVar = this.f36623A;
            C22096n c22096nB = androidx.compose.runtime.internal.r.b(a13, 1474611661, new C21634ic(str, z13, z14, k0Var, mVar, this.f36631n, this.f36629l, this.f36624B, this.f36625C, this.f36626D, this.f36627E, c21935vi, h1Var));
            C21055u.b(str, this.f36634q, vVarA, z13, this.f36636s, this.f36637t, this.f36638u, this.f36639v, z14, this.f36641x, this.f36642y, k0Var, null, mVar, k1Var, c22096nB, a13, 0, 196608, 4096);
        }
        return kotlin.G0.f406611a;
    }
}
