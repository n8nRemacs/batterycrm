package com.avito.android.onboarding.dialog.interactor;

import Y41.p;
import com.avito.android.onboarding.dialog.mvi.entity.OnboardingDialogInternalAction;
import com.avito.android.remote.InterfaceC34389t0;
import com.avito.android.remote.model.onboarding.OnboardingItem;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: OnboardingInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/dialog/interactor/i;", "Lcom/avito/android/onboarding/dialog/interactor/h;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC34389t0> f208843a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f208844b;

    /* compiled from: OnboardingInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/onboarding/dialog/mvi/entity/OnboardingDialogInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.onboarding.dialog.interactor.OnboardingInteractorImpl$loadOnboarding$1", f = "OnboardingInteractor.kt", i = {0, 1, 2, 2, 2, 4, 6, 6}, l = {32, 33, 37, 38, 40, 41, 45, 46}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "it", "item", "$this$flow", "$this$flow", "it"}, s = {"L$0", "L$0", "L$0", "L$1", "L$2", "L$0", "L$0", "L$1"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super OnboardingDialogInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Object f208845q;

        /* renamed from: r, reason: collision with root package name */
        public OnboardingItem f208846r;

        /* renamed from: s, reason: collision with root package name */
        public int f208847s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f208848t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f208850v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f208851w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f208852x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f208850v = str;
            this.f208851w = str2;
            this.f208852x = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = i.this.new a(this.f208850v, this.f208851w, this.f208852x, continuation);
            aVar.f208848t = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super OnboardingDialogInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0081 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00c6 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00e5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0120 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
            /*
                Method dump skipped, instructions count: 320
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.onboarding.dialog.interactor.i.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public i(@Y61.k R0 r02, @Y61.k h31.e eVar) {
        this.f208843a = eVar;
        this.f208844b = r02;
    }

    @Override // com.avito.android.onboarding.dialog.interactor.h
    @Y61.k
    public final InterfaceC43160i<OnboardingDialogInternalAction> a(@Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
        return C43175k.I(this.f208844b.a(), C43175k.G(new a(str, str2, str3, null)));
    }
}
