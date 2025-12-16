package com.avito.android.onboarding.dialog.interactor;

import Sm0.InterfaceC15202a;
import Y41.p;
import com.avito.android.onboarding.dialog.mvi.entity.OnboardingDialogInternalAction;
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
import lI0.InterfaceC43640a;

/* compiled from: DeactivateItemInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/dialog/interactor/f;", "Lcom/avito/android/onboarding/dialog/interactor/e;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC43640a> f208827a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15202a f208828b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f208829c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final A40.a f208830d;

    /* compiled from: DeactivateItemInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/onboarding/dialog/mvi/entity/OnboardingDialogInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.onboarding.dialog.interactor.DeactivateItemInteractorImpl$deactivateItem$1", f = "DeactivateItemInteractor.kt", i = {0, 1, 2, 3}, l = {41, 42, 44, 56, 69}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super OnboardingDialogInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public f f208831q;

        /* renamed from: r, reason: collision with root package name */
        public int f208832r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f208833s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f208834t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f208835u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ f f208836v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f208837w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f208838x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j12, long j13, f fVar, String str, String str2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f208834t = j12;
            this.f208835u = j13;
            this.f208836v = fVar;
            this.f208837w = str;
            this.f208838x = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f208834t, this.f208835u, this.f208836v, this.f208837w, this.f208838x, continuation);
            aVar.f208833s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super OnboardingDialogInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0123 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r24) {
            /*
                Method dump skipped, instructions count: 301
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.onboarding.dialog.interactor.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public f(@Y61.k h31.e<InterfaceC43640a> eVar, @Y61.k InterfaceC15202a interfaceC15202a, @Y61.k R0 r02, @Y61.k A40.a aVar) {
        this.f208827a = eVar;
        this.f208828b = interfaceC15202a;
        this.f208829c = r02;
        this.f208830d = aVar;
    }

    @Override // com.avito.android.onboarding.dialog.interactor.e
    @Y61.k
    public final InterfaceC43160i a(long j12, @Y61.k String str, long j13, @Y61.k String str2) {
        return C43175k.I(this.f208829c.a(), C43175k.G(new a(j12, j13, this, str, str2, null)));
    }
}
