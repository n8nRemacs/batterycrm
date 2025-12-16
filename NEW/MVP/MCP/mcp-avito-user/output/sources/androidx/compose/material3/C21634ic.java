package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: OutlinedTextField.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function0;", "Lkotlin/G0;", "Landroidx/compose/runtime/o;", "innerTextField", "invoke", "(LY41/p;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.ic, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21634ic extends kotlin.jvm.internal.N implements Y41.q<Y41.p<? super androidx.compose.runtime.A, ? super Integer, ? extends kotlin.G0>, androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f36550l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f36551m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f36552n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.input.k0 f36553o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f36554p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f36555q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f36556r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f36557s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f36558t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f36559u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f36560v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C21935vi f36561w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.graphics.h1 f36562x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21634ic(String str, boolean z12, boolean z13, androidx.compose.ui.text.input.k0 k0Var, androidx.compose.foundation.interaction.m mVar, boolean z14, Y41.p pVar, Y41.p pVar2, Y41.p pVar3, Y41.p pVar4, Y41.p pVar5, C21935vi c21935vi, androidx.compose.ui.graphics.h1 h1Var) {
        super(3);
        this.f36550l = str;
        this.f36551m = z12;
        this.f36552n = z13;
        this.f36553o = k0Var;
        this.f36554p = mVar;
        this.f36555q = z14;
        this.f36556r = pVar;
        this.f36557s = pVar2;
        this.f36558t = pVar3;
        this.f36559u = pVar4;
        this.f36560v = pVar5;
        this.f36561w = c21935vi;
        this.f36562x = h1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.q
    public final kotlin.G0 invoke(Y41.p<? super androidx.compose.runtime.A, ? super Integer, ? extends kotlin.G0> pVar, androidx.compose.runtime.A a12, Integer num) {
        Y41.p<? super androidx.compose.runtime.A, ? super Integer, ? extends kotlin.G0> pVar2 = pVar;
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= a13.u(pVar2) ? 4 : 2;
        }
        int i12 = iIntValue;
        if ((i12 & 19) == 18 && a13.c()) {
            a13.f();
        } else {
            C21542ec c21542ec = C21542ec.f36256a;
            C21935vi c21935vi = this.f36561w;
            androidx.compose.ui.graphics.h1 h1Var = this.f36562x;
            boolean z12 = this.f36551m;
            boolean z13 = this.f36555q;
            androidx.compose.foundation.interaction.m mVar = this.f36554p;
            c21542ec.b(this.f36550l, pVar2, z12, this.f36552n, this.f36553o, mVar, z13, this.f36556r, this.f36557s, this.f36558t, this.f36559u, null, null, this.f36560v, c21935vi, null, androidx.compose.runtime.internal.r.b(a13, 2108828640, new C21611hc(z12, z13, mVar, c21935vi, h1Var)), a13, (i12 << 3) & 112, 14155776, 32768);
        }
        return kotlin.G0.f406611a;
    }
}
