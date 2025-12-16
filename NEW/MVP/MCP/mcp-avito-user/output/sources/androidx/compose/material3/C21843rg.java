package androidx.compose.material3;

import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: Snackbar.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.rg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21843rg extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f37217l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C22096n f37218m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C22096n f37219n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.x0 f37220o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f37221p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f37222q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21843rg(Y41.p pVar, C22096n c22096n, C22096n c22096n2, androidx.compose.ui.text.x0 x0Var, long j12, long j13) {
        super(2);
        this.f37217l = pVar;
        this.f37218m = c22096n;
        this.f37219n = c22096n2;
        this.f37220o = x0Var;
        this.f37221p = j12;
        this.f37222q = j13;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 3) == 2 && a13.c()) {
            a13.f();
        } else {
            Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar = this.f37217l;
            C22096n c22096n = this.f37218m;
            if (pVar == null) {
                a13.I(-2104362406);
                Bg.d(c22096n, null, this.f37219n, this.f37220o, this.f37221p, this.f37222q, a13, 48);
                a13.O();
            } else {
                a13.I(-2104361812);
                Bg.d(c22096n, this.f37217l, this.f37219n, this.f37220o, this.f37221p, this.f37222q, a13, 0);
                a13.O();
            }
        }
        return kotlin.G0.f406611a;
    }
}
