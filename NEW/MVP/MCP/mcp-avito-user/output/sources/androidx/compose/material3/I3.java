package androidx.compose.material3;

import Q.a;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.graphics.vector.C22293d;
import androidx.compose.ui.graphics.vector.C22295f;
import androidx.compose.ui.unit.h;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: Snackbar.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class I3 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final I3 f34862a = new I3();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C22096n f34863b = new C22096n(-505750804, a.f34864l, false);

    /* compiled from: Snackbar.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f34864l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 3) == 2 && a13.c()) {
                a13.f();
            } else {
                int i12 = a.b.f13394a;
                C22293d c22293dD = X.K5.f18096a;
                if (c22293dD == null) {
                    h.a aVar = androidx.compose.ui.unit.h.f42849c;
                    C22293d.a aVar2 = new C22293d.a("Filled.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96, null);
                    C42784z0 c42784z0 = androidx.compose.ui.graphics.vector.U.f39811a;
                    androidx.compose.ui.graphics.T.f39320b.getClass();
                    androidx.compose.ui.graphics.k1 k1Var = new androidx.compose.ui.graphics.k1(androidx.compose.ui.graphics.T.f39321c, null);
                    androidx.compose.ui.graphics.m1.f39698b.getClass();
                    androidx.compose.ui.graphics.n1.f39707b.getClass();
                    int i13 = androidx.compose.ui.graphics.n1.f39709d;
                    C22295f c22295f = new C22295f();
                    c22295f.j(19.0f, 6.41f);
                    c22295f.h(17.59f, 5.0f);
                    c22295f.h(12.0f, 10.59f);
                    c22295f.h(6.41f, 5.0f);
                    c22295f.h(5.0f, 6.41f);
                    c22295f.h(10.59f, 12.0f);
                    c22295f.h(5.0f, 17.59f);
                    c22295f.h(6.41f, 19.0f);
                    c22295f.h(12.0f, 13.41f);
                    c22295f.h(17.59f, 19.0f);
                    c22295f.h(19.0f, 17.59f);
                    c22295f.h(13.41f, 12.0f);
                    c22295f.c();
                    C22293d.a.c(aVar2, c22295f.f39885a, 0, k1Var, 1.0f, null, 1.0f, 1.0f, 0, i13, 1.0f, 14336);
                    c22293dD = aVar2.d();
                    X.K5.f18096a = c22293dD;
                }
                int i14 = Ng.f35206b;
                C21991y8.b(c22293dD, Og.a(a13, R.string.m3c_snackbar_dismiss), null, 0L, a13, 0, 12);
            }
            return kotlin.G0.f406611a;
        }
    }
}
