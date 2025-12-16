package Gi;

import C11.b;
import Y61.k;
import com.avito.android.beduin.v2.onboarding.impl.BeduinV2OnboardingBaseFragment;
import com.avito.android.di.B;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import kotlin.Metadata;

/* compiled from: BeduinV2OnboardingComponent.kt */
@B
@C11.b
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LGi/a;", "", "a", "b", "_avito_beduin-v2-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Gi.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC13885a {

    /* compiled from: BeduinV2OnboardingComponent.kt */
    @b.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGi/a$a;", "", "_avito_beduin-v2-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Gi.a$a, reason: collision with other inner class name */
    public interface InterfaceC0365a {
        @k
        InterfaceC13885a a(@k C31138n0 c31138n0, @h31.b @k String str);
    }

    /* compiled from: BeduinV2OnboardingComponent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGi/a$b;", "Lcom/avito/android/di/h;", "_avito_beduin-v2-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @C11.c
    /* renamed from: Gi.a$b */
    public interface b extends InterfaceC29971h {
        @k
        InterfaceC0365a wc();
    }

    void a(@k BeduinV2OnboardingBaseFragment beduinV2OnboardingBaseFragment);
}
