package com.avito.android.onboarding.dialog.interactor;

import Nk0.InterfaceC14583a;
import Y41.p;
import com.avito.android.onboarding.dialog.mvi.entity.OnboardingDialogInternalAction;
import com.avito.android.util.R0;
import java.util.Map;
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

/* compiled from: CvStatusUpdateInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/dialog/interactor/b;", "Lcom/avito/android/onboarding/dialog/interactor/a;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.onboarding.dialog.interactor.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14583a f208817a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f208818b;

    /* compiled from: CvStatusUpdateInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/onboarding/dialog/mvi/entity/OnboardingDialogInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.onboarding.dialog.interactor.CvStatusUpdateInteractorImpl$setReadyStatus$1", f = "CvStatusUpdateInteractor.kt", i = {0, 1, 2, 3, 4}, l = {33, 34, 41, 42, 45, 48}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super OnboardingDialogInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f208819q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f208820r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ long f208821s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f208822t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ b f208823u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Map<String, Object> f208824v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j12, long j13, b bVar, Map<String, ? extends Object> map, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f208821s = j12;
            this.f208822t = j13;
            this.f208823u = bVar;
            this.f208824v = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f208821s, this.f208822t, this.f208823u, this.f208824v, continuation);
            aVar.f208820r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super OnboardingDialogInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0085 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00b6 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00ed A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 266
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.onboarding.dialog.interactor.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public b(@Y61.k InterfaceC14583a interfaceC14583a, @Y61.k R0 r02) {
        this.f208817a = interfaceC14583a;
        this.f208818b = r02;
    }

    @Override // com.avito.android.onboarding.dialog.interactor.a
    @Y61.k
    public final InterfaceC43160i a(long j12, @Y61.l Map map, long j13) {
        return C43175k.I(this.f208818b.a(), C43175k.G(new a(j12, j13, this, map, null)));
    }
}
