package com.avito.android.onboarding;

import com.avito.android.onboarding.model.BxOnboardingStep;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: BxOnboardingChainObserver.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/onboarding/t;", "", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface t {

    /* compiled from: BxOnboardingChainObserver.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/onboarding/t$a;", "Lcom/avito/android/onboarding/t;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements t {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f209384a = new a();

        @Override // com.avito.android.onboarding.t
        @Y61.k
        public final InterfaceC43160i<BxOnboardingStep> a() {
            return C43175k.w();
        }
    }

    @Y61.k
    InterfaceC43160i<BxOnboardingStep> a();
}
