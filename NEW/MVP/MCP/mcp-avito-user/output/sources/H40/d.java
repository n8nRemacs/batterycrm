package H40;

import H40.a;
import Y61.k;
import Y61.l;
import com.akita.compose.component.accordion.s;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.OnboardingStepsResult;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: OnboardingStepsState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LH40/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class d extends q {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f6941e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final d f6942f = new d(null, null, null, 7, null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final H40.a f6943b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final OnboardingStepsResult f6944c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f6945d;

    /* compiled from: OnboardingStepsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LH40/d$a;", "", "<init>", "()V", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d() {
        this(null, null, null, 7, null);
    }

    public static d a(d dVar, H40.a aVar, OnboardingStepsResult onboardingStepsResult, Integer num, int i12) {
        if ((i12 & 1) != 0) {
            aVar = dVar.f6943b;
        }
        if ((i12 & 2) != 0) {
            onboardingStepsResult = dVar.f6944c;
        }
        if ((i12 & 4) != 0) {
            num = dVar.f6945d;
        }
        dVar.getClass();
        return new d(aVar, onboardingStepsResult, num);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f6943b, dVar.f6943b) && L.f(this.f6944c, dVar.f6944c) && L.f(this.f6945d, dVar.f6945d);
    }

    public final int hashCode() {
        int iHashCode = (this.f6944c.hashCode() + (this.f6943b.hashCode() * 31)) * 31;
        Integer num = this.f6945d;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OnboardingStepsState(loadingState=");
        sb2.append(this.f6943b);
        sb2.append(", screenState=");
        sb2.append(this.f6944c);
        sb2.append(", currentPage=");
        return s.j(sb2, this.f6945d, ')');
    }

    public d(H40.a aVar, OnboardingStepsResult onboardingStepsResult, Integer num, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? a.c.f6935a : aVar, (i12 & 2) != 0 ? new OnboardingStepsResult(C42784z0.f406748b) : onboardingStepsResult, (i12 & 4) != 0 ? null : num);
    }

    public d(@k H40.a aVar, @k OnboardingStepsResult onboardingStepsResult, @l Integer num) {
        this.f6943b = aVar;
        this.f6944c = onboardingStepsResult;
        this.f6945d = num;
    }
}
