package com.avito.android.onboarding;

import com.avito.android.onboarding.model.BxOnboardingStep;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.Y1;
import kotlinx.coroutines.flow.f2;

/* compiled from: BxOnboardingChainHolder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/onboarding/o;", "Lcom/avito/android/onboarding/n;", "<init>", "()V", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f209136a = C42727D.c(c.f209139l);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f209137b = C42727D.c(b.f209138l);

    /* compiled from: BxOnboardingChainHolder.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/onboarding/o$a;", "", "<init>", "()V", "", "BUFFER_SIZE", "I", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BxOnboardingChainHolder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/Y1;", "Lcom/avito/android/onboarding/model/BxOnboardingStep;", "invoke", "()Lkotlinx/coroutines/flow/Y1;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<Y1<BxOnboardingStep>> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f209138l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Y1<BxOnboardingStep> invoke() {
            return f2.b(0, 64, null, 5);
        }
    }

    /* compiled from: BxOnboardingChainHolder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/Y1;", "Lcom/avito/android/onboarding/model/BxOnboardingStep;", "invoke", "()Lkotlinx/coroutines/flow/Y1;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<Y1<BxOnboardingStep>> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f209139l = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Y1<BxOnboardingStep> invoke() {
            return f2.b(0, 64, null, 5);
        }
    }

    static {
        new a(null);
    }

    @Inject
    public o() {
    }

    @Override // com.avito.android.onboarding.n
    public final void c(@Y61.k BxOnboardingStep.OnBoardingSheet onBoardingSheet) {
        ((Y1) this.f209137b.getValue()).K5(onBoardingSheet);
    }

    @Override // com.avito.android.onboarding.n
    public final void d(@Y61.k BxOnboardingStep.View.Tooltip tooltip) {
        ((Y1) this.f209136a.getValue()).K5(tooltip);
    }

    @Override // com.avito.android.onboarding.n
    public final InterfaceC43160i e() {
        return (Y1) this.f209137b.getValue();
    }

    @Override // com.avito.android.onboarding.n
    public final InterfaceC43160i getQueue() {
        return (Y1) this.f209136a.getValue();
    }
}
