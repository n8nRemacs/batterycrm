package androidx.compose.material3.pulltorefresh;

import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PullToRefresh.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* compiled from: PullToRefresh.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/pulltorefresh/s;", "pullRefreshState", "Lkotlin/G0;", "invoke", "(Landroidx/compose/material3/pulltorefresh/s;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends N implements Y41.q<s, A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f37081l = new a();

        public a() {
            super(3);
        }

        @Override // Y41.q
        public final G0 invoke(s sVar, A a12, Integer num) {
            s sVar2 = sVar;
            A a13 = a12;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= a13.B(sVar2) ? 4 : 2;
            }
            if ((iIntValue & 19) == 18 && a13.c()) {
                a13.f();
            } else {
                f.f37091a.a(sVar2, null, 0L, a13, (iIntValue & 14) | 3072);
            }
            return G0.f406611a;
        }
    }

    static {
        new b();
        new C22096n(1116780789, a.f37081l, false);
    }
}
