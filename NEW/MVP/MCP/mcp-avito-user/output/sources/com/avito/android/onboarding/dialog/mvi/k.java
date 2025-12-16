package com.avito.android.onboarding.dialog.mvi;

import com.avito.android.onboarding.dialog.mvi.entity.OnboardingDialogInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: OnboardingDialogBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/onboarding/dialog/mvi/k;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/onboarding/dialog/mvi/entity/OnboardingDialogInternalAction;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k implements com.avito.android.arch.mvi.b<OnboardingDialogInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f208937a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f208938b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f208939c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.onboarding.dialog.interactor.h f208940d;

    /* compiled from: OnboardingDialogBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/onboarding/dialog/mvi/entity/OnboardingDialogInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.onboarding.dialog.mvi.OnboardingDialogBootstrap$produce$1", f = "OnboardingDialogBootstrap.kt", i = {}, l = {23, AvailableCode.ERROR_ON_ACTIVITY_RESULT}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super OnboardingDialogInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f208941q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f208942r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = k.this.new a(continuation);
            aVar.f208942r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super OnboardingDialogInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f208941q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f208942r;
                k kVar = k.this;
                String str = kVar.f208938b;
                if (str != null) {
                    InterfaceC43160i<OnboardingDialogInternalAction> interfaceC43160iA = kVar.f208940d.a(str, kVar.f208937a, kVar.f208939c);
                    this.f208941q = 1;
                    if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    OnboardingDialogInternalAction.DismissDialog dismissDialog = OnboardingDialogInternalAction.DismissDialog.f208892b;
                    this.f208941q = 2;
                    if (interfaceC43172j.emit(dismissDialog, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1 && i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public k(@Y61.l @com.avito.android.onboarding.dialog.di.c String str, @com.avito.android.onboarding.dialog.di.i @Y61.l String str2, @Y61.l @com.avito.android.onboarding.dialog.di.d String str3, @Y61.k com.avito.android.onboarding.dialog.interactor.h hVar) {
        this.f208937a = str;
        this.f208938b = str2;
        this.f208939c = str3;
        this.f208940d = hVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<OnboardingDialogInternalAction> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }

    public /* synthetic */ k(String str, String str2, String str3, com.avito.android.onboarding.dialog.interactor.h hVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, hVar);
    }
}
