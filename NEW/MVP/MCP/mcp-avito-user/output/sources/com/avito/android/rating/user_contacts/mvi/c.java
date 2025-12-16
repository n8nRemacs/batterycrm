package com.avito.android.rating.user_contacts.mvi;

import com.avito.android.rating.user_contacts.mvi.entity.UserContactsInternalAction;
import com.avito.android.rating.user_contacts.mvi.entity.a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserContactsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating/user_contacts/mvi/entity/UserContactsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.rating.user_contacts.mvi.UserContactsActor$handleReloadContactList$1", f = "UserContactsActor.kt", i = {0}, l = {35, 36}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserContactsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f247778q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f247779r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a.e f247780s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f247781t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a.e eVar, d dVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f247780s = eVar;
        this.f247781t = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f247780s, this.f247781t, continuation);
        cVar.f247779r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super UserContactsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f247778q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f247779r;
            UserContactsInternalAction.Loading loading = new UserContactsInternalAction.Loading(this.f247780s.f247806a);
            this.f247779r = interfaceC43172j;
            this.f247778q = 1;
            if (interfaceC43172j.emit(loading, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f247779r;
            C42729a0.b(obj);
        }
        InterfaceC43160i<UserContactsInternalAction> interfaceC43160iA = this.f247781t.f247782a.a(true);
        this.f247779r = null;
        this.f247778q = 2;
        if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
