package androidx.compose.material3;

import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: Snackbar.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.sg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21866sg extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f37278l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C22096n f37279m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C22096n f37280n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f37281o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f37282p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21866sg(Y41.p pVar, C22096n c22096n, C22096n c22096n2, long j12, long j13) {
        super(2);
        this.f37278l = pVar;
        this.f37279m = c22096n;
        this.f37280n = c22096n2;
        this.f37281o = j12;
        this.f37282p = j13;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 3) == 2 && a13.c()) {
            a13.f();
        } else {
            C21859s9.f37272a.getClass();
            Pl plB = C21859s9.b(a13);
            d0.d0.f393369a.getClass();
            androidx.compose.ui.text.x0 x0VarA = Ql.a(plB, d0.d0.f393377i);
            androidx.compose.ui.text.x0 x0VarA2 = Ql.a(C21859s9.b(a13), d0.d0.f393371c);
            androidx.compose.runtime.S.a(C21914uj.f37441a.b(x0VarA), androidx.compose.runtime.internal.r.b(a13, 835891690, new C21843rg(this.f37278l, this.f37279m, this.f37280n, x0VarA2, this.f37281o, this.f37282p)), a13, 56);
        }
        return kotlin.G0.f406611a;
    }
}
