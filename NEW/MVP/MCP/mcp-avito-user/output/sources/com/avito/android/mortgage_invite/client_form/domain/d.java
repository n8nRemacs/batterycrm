package com.avito.android.mortgage_invite.client_form.domain;

import Y41.p;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.domain.check_access.a;
import com.avito.android.mortgage.phone_confirm.model.PhoneConfirmArguments;
import com.avito.android.mortgage_invite.client_form.domain.g;
import com.avito.android.mortgage_invite.client_form.model.ApplicationClientFormArguments;
import com.avito.android.mortgage_invite.client_form.mvi.entity.ApplicationClientFormInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ApplicationClientFormActionProcessor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/mortgage/domain/check_access/a;", "checkAccessResult", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/mortgage/domain/check_access/a;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_invite.client_form.domain.ApplicationClientFormActionProcessorImpl$processCreateParticipantResult$2", f = "ApplicationClientFormActionProcessor.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class d extends SuspendLambda implements p<com.avito.android.mortgage.domain.check_access.a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f205149q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f205150r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43172j<ApplicationClientFormInternalAction> f205151s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f205152t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ApplicationClientFormArguments f205153u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f205154v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(InterfaceC43172j<? super ApplicationClientFormInternalAction> interfaceC43172j, b bVar, ApplicationClientFormArguments applicationClientFormArguments, g gVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f205151s = interfaceC43172j;
        this.f205152t = bVar;
        this.f205153u = applicationClientFormArguments;
        this.f205154v = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f205151s, this.f205152t, this.f205153u, this.f205154v, continuation);
        dVar.f205150r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(com.avito.android.mortgage.domain.check_access.a aVar, Continuation<? super G0> continuation) {
        return ((d) create(aVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        ApplicationClientFormInternalAction phoneConfirmationRequired;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f205149q;
        if (i12 == 0) {
            C42729a0.b(obj);
            com.avito.android.mortgage.domain.check_access.a aVar = (com.avito.android.mortgage.domain.check_access.a) this.f205150r;
            g.c cVar = (g.c) this.f205154v;
            String str = cVar.f205165b;
            DeepLink deepLink = cVar.f205164a;
            this.f205152t.getClass();
            if (L.f(aVar, a.b.f199474a)) {
                phoneConfirmationRequired = new ApplicationClientFormInternalAction.HandleDeeplink(deepLink, true);
            } else {
                if (!(aVar instanceof a.C5890a)) {
                    throw new NoWhenBranchMatchedException();
                }
                a.C5890a c5890a = (a.C5890a) aVar;
                String str2 = c5890a.f199470a;
                ApplicationClientFormArguments applicationClientFormArguments = this.f205153u;
                String str3 = applicationClientFormArguments.f205210b;
                String str4 = applicationClientFormArguments.f205212d;
                String str5 = applicationClientFormArguments.f205211c;
                phoneConfirmationRequired = new ApplicationClientFormInternalAction.PhoneConfirmationRequired(new PhoneConfirmArguments(str2, c5890a.f199471b, c5890a.f199473d, str3, str, str4, str5, c5890a.f199472c, "personal_data"), deepLink);
            }
            this.f205149q = 1;
            if (this.f205151s.emit(phoneConfirmationRequired, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
