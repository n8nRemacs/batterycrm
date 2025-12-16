package androidx.compose.ui.layout;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.layout.K0;
import kotlin.Metadata;

/* compiled from: LookaheadScope.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.layout.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22361g0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<K0.a, A, Boolean> f40462a = a.f40463l;

    /* compiled from: LookaheadScope.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Landroidx/compose/ui/layout/A;", "it", "", "invoke", "(Landroidx/compose/ui/layout/K0$a;Landroidx/compose/ui/layout/A;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.layout.g0$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<K0.a, A, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f40463l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final /* bridge */ /* synthetic */ Boolean invoke(K0.a aVar, A a12) {
            return Boolean.FALSE;
        }
    }

    @InterfaceC22132o
    @androidx.compose.ui.D
    public static final void a(@Y61.k C22096n c22096n, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-1078066484);
        if (bE2.p(i12 & 1, (i12 & 3) != 2)) {
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = new C22349a0(null, 1, null);
                bE2.H(objT);
            }
            C22349a0 c22349a0 = (C22349a0) objT;
            C22351b0 c22351b0 = C22351b0.f40443l;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(c22351b0);
            } else {
                bE2.d();
            }
            R3.a(C22353c0.f40444l, bE2);
            R3.b(C22357e0.f40451l, bE2, c22349a0);
            c22096n.invoke(c22349a0, bE2, 48);
            bE2.X(true);
        } else {
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C22359f0(c22096n, i12);
        }
    }
}
