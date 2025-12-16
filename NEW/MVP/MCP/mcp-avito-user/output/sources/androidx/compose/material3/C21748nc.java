package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: OutlinedTextField.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function0;", "Lkotlin/G0;", "Landroidx/compose/runtime/o;", "innerTextField", "invoke", "(LY41/p;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.nc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21748nc extends kotlin.jvm.internal.N implements Y41.q<Y41.p<? super androidx.compose.runtime.A, ? super Integer, ? extends kotlin.G0>, androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.input.W f36894l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f36895m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f36896n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.input.k0 f36897o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f36898p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f36899q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f36900r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f36901s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f36902t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f36903u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f36904v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C21935vi f36905w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.graphics.h1 f36906x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21748nc(androidx.compose.ui.text.input.W w12, boolean z12, boolean z13, androidx.compose.ui.text.input.k0 k0Var, androidx.compose.foundation.interaction.m mVar, boolean z14, Y41.p pVar, Y41.p pVar2, Y41.p pVar3, Y41.p pVar4, Y41.p pVar5, C21935vi c21935vi, androidx.compose.ui.graphics.h1 h1Var) {
        super(3);
        this.f36894l = w12;
        this.f36895m = z12;
        this.f36896n = z13;
        this.f36897o = k0Var;
        this.f36898p = mVar;
        this.f36899q = z14;
        this.f36900r = pVar;
        this.f36901s = pVar2;
        this.f36902t = pVar3;
        this.f36903u = pVar4;
        this.f36904v = pVar5;
        this.f36905w = c21935vi;
        this.f36906x = h1Var;
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
        if ((iIntValue & 19) == 18 && a13.c()) {
            a13.f();
        } else {
            C21542ec c21542ec = C21542ec.f36256a;
            String str = this.f36894l.f42383a.f42127c;
            C21935vi c21935vi = this.f36905w;
            androidx.compose.ui.graphics.h1 h1Var = this.f36906x;
            boolean z12 = this.f36895m;
            boolean z13 = this.f36899q;
            androidx.compose.foundation.interaction.m mVar = this.f36898p;
            c21542ec.b(str, pVar2, z12, this.f36896n, this.f36897o, mVar, z13, this.f36900r, this.f36901s, this.f36902t, this.f36903u, null, null, this.f36904v, c21935vi, null, androidx.compose.runtime.internal.r.b(a13, 255570733, new C21725mc(z12, z13, mVar, c21935vi, h1Var)), a13, (iIntValue << 3) & 112, 14155776, 32768);
        }
        return kotlin.G0.f406611a;
    }
}
