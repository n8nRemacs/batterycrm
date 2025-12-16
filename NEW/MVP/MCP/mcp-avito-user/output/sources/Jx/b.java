package JX;

import com.avito.android.C36135w2;
import com.avito.android.account.E;
import com.avito.android.main_start_onboarding.MainStartOnboardingStep;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MainStartOnboardingAuthorizationChecker.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJX/b;", "LJX/a;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final E f9012a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C36135w2 f9013b;

    @Inject
    public b(@Y61.k E e12, @Y61.k C36135w2 c36135w2) {
        this.f9012a = e12;
        this.f9013b = c36135w2;
    }

    @Override // JX.a
    @Y61.l
    public final MainStartOnboardingStep.Authorization a() {
        if (this.f9012a.b()) {
            return null;
        }
        C36135w2 c36135w2 = this.f9013b;
        c36135w2.getClass();
        kotlin.reflect.n<Object> nVar = C36135w2.f327457X[33];
        if (((Boolean) c36135w2.f327461D.a().invoke()).booleanValue()) {
            return null;
        }
        return MainStartOnboardingStep.Authorization.f184215b;
    }
}
