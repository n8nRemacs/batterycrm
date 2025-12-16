package com.avito.android.main_start_onboarding;

import Y61.k;
import com.avito.android.main_start_onboarding.MainStartOnboardingChainInteractorImpl;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;

/* compiled from: MainStartOnboardingChainInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/main_start_onboarding/a;", "", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface a {
    @k
    n2<MainStartOnboardingChainInteractorImpl.State> a();

    void b(@k MainStartOnboardingStep mainStartOnboardingStep);

    void c(@k MainStartOnboardingStep mainStartOnboardingStep);

    @k
    InterfaceC43160i<MainStartOnboardingStep> d();

    boolean isRunning();

    void start();

    /* compiled from: MainStartOnboardingChainInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/main_start_onboarding/a$a;", "Lcom/avito/android/main_start_onboarding/a;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.main_start_onboarding.a$a, reason: collision with other inner class name */
    public static final class C5402a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C5402a f184226a = new C5402a();

        @Override // com.avito.android.main_start_onboarding.a
        @k
        public final n2<MainStartOnboardingChainInteractorImpl.State> a() {
            return p2.a(MainStartOnboardingChainInteractorImpl.State.f184208b);
        }

        @Override // com.avito.android.main_start_onboarding.a
        @k
        public final InterfaceC43160i<MainStartOnboardingStep> d() {
            return C43175k.w();
        }

        @Override // com.avito.android.main_start_onboarding.a
        public final boolean isRunning() {
            return false;
        }

        @Override // com.avito.android.main_start_onboarding.a
        public final void start() {
        }

        @Override // com.avito.android.main_start_onboarding.a
        public final void b(@k MainStartOnboardingStep mainStartOnboardingStep) {
        }

        @Override // com.avito.android.main_start_onboarding.a
        public final void c(@k MainStartOnboardingStep mainStartOnboardingStep) {
        }
    }
}
