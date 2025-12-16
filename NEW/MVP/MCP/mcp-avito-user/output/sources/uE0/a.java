package UE0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.travel_onboarding.generated.api.api_1_travel_onboarding_get.OnboardingButtonsCloseButton;
import com.avito.android.travel_onboarding.generated.api.api_1_travel_onboarding_get.OnboardingButtonsRedirectButton;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TravelOnboardingResponseConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUE0/a;", "", "<init>", "()V", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f16320a = new a();

    /* compiled from: TravelOnboardingResponseConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: UE0.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C1114a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16321a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f16322b;

        static {
            int[] iArr = new int[OnboardingButtonsCloseButton.Type.values().length];
            try {
                iArr[OnboardingButtonsCloseButton.Type.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OnboardingButtonsCloseButton.Type.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f16321a = iArr;
            int[] iArr2 = new int[OnboardingButtonsRedirectButton.Type.values().length];
            try {
                iArr2[OnboardingButtonsRedirectButton.Type.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OnboardingButtonsRedirectButton.Type.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f16322b = iArr2;
        }
    }
}
