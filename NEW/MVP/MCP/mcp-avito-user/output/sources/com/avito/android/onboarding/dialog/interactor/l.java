package com.avito.android.onboarding.dialog.interactor;

import Y41.p;
import com.avito.android.onboarding.dialog.mvi.entity.OnboardingDialogInternalAction;
import com.avito.android.remote.InterfaceC34389t0;
import com.avito.android.remote.model.SearchDeepLinkResult;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: OnboardingQuizInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/dialog/interactor/l;", "Lcom/avito/android/onboarding/dialog/interactor/k;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34389t0 f208855a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f208856b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f208857c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f208858d;

    /* compiled from: OnboardingQuizInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/onboarding/dialog/mvi/entity/OnboardingDialogInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.onboarding.dialog.interactor.OnboardingQuizInteractorImpl$loadSearchDeepLink$1", f = "OnboardingQuizInteractor.kt", i = {0, 1, 2, 2, 3, 5}, l = {33, 39, 41, 48, 50, 54, 60}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "it", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$1", "L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super OnboardingDialogInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public SearchDeepLinkResult f208859q;

        /* renamed from: r, reason: collision with root package name */
        public int f208860r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f208861s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f208862t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ l f208863u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f208864v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j12, l lVar, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f208862t = j12;
            this.f208863u = lVar;
            this.f208864v = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f208862t, this.f208863u, this.f208864v, continuation);
            aVar.f208861s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super OnboardingDialogInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0073 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00f8 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
            /*
                Method dump skipped, instructions count: 278
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.onboarding.dialog.interactor.l.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public l(@Y61.k InterfaceC34389t0 interfaceC34389t0, @Y61.k R0 r02, @Y61.l @com.avito.android.onboarding.dialog.di.c String str, @com.avito.android.onboarding.dialog.di.i @Y61.l String str2) {
        this.f208855a = interfaceC34389t0;
        this.f208856b = r02;
        this.f208857c = str;
        this.f208858d = str2;
    }

    @Override // com.avito.android.onboarding.dialog.interactor.k
    @Y61.k
    public final InterfaceC43160i a(long j12, @Y61.l String str) {
        return C43175k.I(this.f208856b.a(), C43175k.G(new a(j12, this, str, null)));
    }

    public /* synthetic */ l(InterfaceC34389t0 interfaceC34389t0, R0 r02, String str, String str2, int i12, C42822w c42822w) {
        this(interfaceC34389t0, r02, (i12 & 4) != 0 ? null : str, (i12 & 8) != 0 ? null : str2);
    }
}
