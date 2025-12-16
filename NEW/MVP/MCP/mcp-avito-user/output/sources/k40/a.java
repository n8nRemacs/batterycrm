package K40;

import Y61.k;
import com.avito.android.onboarding_manager.onboarding_priority.OnboardingStatus;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BaseOnboardingPriorityInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LK40/a;", "Lcom/avito/android/onboarding_manager/e;", "_avito_onboarding-manager_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class a implements com.avito.android.onboarding_manager.e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.onboarding_manager.f f9255a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final HashMap f9256b = new HashMap();

    public a(@k com.avito.android.onboarding_manager.f fVar) {
        this.f9255a = fVar;
    }

    @Override // com.avito.android.onboarding_manager.e
    public final void a(@k String str, boolean z12) {
        this.f9256b.put(str, OnboardingStatus.f209446b);
        if (z12) {
            this.f9255a.e(str);
        }
    }

    @Override // com.avito.android.onboarding_manager.e
    public final void c(@k String str) {
        this.f9256b.put(str, OnboardingStatus.f209447c);
    }

    public final boolean d() {
        HashMap map = this.f9256b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() == OnboardingStatus.f209446b) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.isEmpty();
    }
}
