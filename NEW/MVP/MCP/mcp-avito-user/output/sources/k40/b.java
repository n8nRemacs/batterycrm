package K40;

import Y61.k;
import com.avito.android.onboarding_manager.OnboardingType;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: BaseSerpOnboardingPriorityInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LK40/b;", "LK40/a;", "a", "_avito_onboarding-manager_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class b extends K40.a {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f9257c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final List<String> f9258d = C42745f0.U("inline_filters_target_tap_onboarding", "entry_point_onboarding", "inline_filters_geo_onboarding_id", "big_filters_onboarding_id", "nav_bar_left_icon_onboarding", "business_360_onboarding", "search_with_action_title_onboarding", "top_widget_onboarding", "on_result_onboarding", "replace_main_onboarding_id", "replace_main_toast_onboarding_id");

    /* compiled from: BaseSerpOnboardingPriorityInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LK40/b$a;", "", "<init>", "()V", "_avito_onboarding-manager_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BaseSerpOnboardingPriorityInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: K40.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C0551b {
        static {
            int[] iArr = new int[OnboardingType.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OnboardingType onboardingType = OnboardingType.f209409b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.avito.android.onboarding_manager.e
    public final boolean b(@k String str, @k OnboardingType onboardingType) {
        boolean zD2;
        int iOrdinal = onboardingType.ordinal();
        if (iOrdinal != 0) {
            zD2 = true;
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            zD2 = d();
        }
        if (this.f9255a.b(str)) {
            return false;
        }
        return e(str, zD2);
    }

    public abstract boolean e(@k String str, boolean z12);
}
