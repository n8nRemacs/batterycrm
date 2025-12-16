package com.avito.android.phones_actualization.scenario;

import To.InterfaceC15383a;
import com.avito.android.code_check_public.CodeCheckLink;
import com.avito.android.code_check_public.a;
import com.avito.android.remote.InterfaceC34258d;
import com.avito.android.remote.model.ActualizePhonesScenarioResult;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.ux.feedback.link.UxFeedbackStartCampaignLink;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ActualizePhonesCodeConfirmInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LTo/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.phones_actualization.scenario.ActualizePhonesCodeConfirmInteractor$getNextScenario$1", f = "ActualizePhonesCodeConfirmInteractor.kt", i = {0}, l = {68, 71, 93}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC15383a>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f216237q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f216238r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.phones_actualization.scenario.a f216239s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f216240t;

    /* compiled from: ActualizePhonesCodeConfirmInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/code_check_public/a;", "invoke", "()Lcom/avito/android/code_check_public/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<com.avito.android.code_check_public.a> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f216241l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.code_check_public.a invoke() {
            return new a.b.C3496a(null, 1, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.avito.android.phones_actualization.scenario.a aVar, boolean z12, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f216239s = aVar;
        this.f216240t = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f216239s, this.f216240t, continuation);
        bVar.f216238r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC15383a> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object objA;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f216237q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f216238r;
            InterfaceC34258d interfaceC34258d = this.f216239s.f216220b;
            this.f216238r = interfaceC43172j;
            this.f216237q = 1;
            objA = interfaceC34258d.a(true, this);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 == 2) {
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f216238r;
            C42729a0.b(obj);
            objA = obj;
        }
        TypedResult typedResult = (TypedResult) objA;
        TypedResult.Success success = typedResult instanceof TypedResult.Success ? (TypedResult.Success) typedResult : null;
        ActualizePhonesScenarioResult actualizePhonesScenarioResult = success != null ? (ActualizePhonesScenarioResult) success.getResult() : null;
        ActualizePhonesScenarioResult.WithPayload.ShowWithPhones showWithPhones = actualizePhonesScenarioResult instanceof ActualizePhonesScenarioResult.WithPayload.ShowWithPhones ? (ActualizePhonesScenarioResult.WithPayload.ShowWithPhones) actualizePhonesScenarioResult : null;
        if (showWithPhones == null) {
            InterfaceC15383a.C1082a c1082a = new InterfaceC15383a.C1082a(null, 1, null);
            this.f216238r = null;
            this.f216237q = 2;
            if (interfaceC43172j.emit(c1082a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
        InterfaceC15383a.e eVar = new InterfaceC15383a.e(new a.InterfaceC3494a.b(new CodeCheckLink(new CodeCheckLink.Flow.ActualizePhones(new CodeCheckLink.Flow.ActualizePhones.Scenario.ShowActualizePhones(this.f216240t ? new UxFeedbackStartCampaignLink("avitoid_reverification", true, P0.c(), null) : null, showWithPhones.getPayload().getTitle(), false, showWithPhones.getPayload().getDescription())), new CodeCheckLink.Arguments(null, null, null, showWithPhones.getPayload().getPhones(), 7, null)), a.f216241l));
        this.f216238r = null;
        this.f216237q = 3;
        if (interfaceC43172j.emit(eVar, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
