package com.avito.android.rating.user_contacts.mvi;

import com.avito.android.rating.user_contacts.mvi.entity.UserContactsInternalAction;
import com.avito.android.rating.user_contacts.mvi.entity.b;
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

/* compiled from: UserContactsBootstrap.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating/user_contacts/mvi/entity/UserContactsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.rating.user_contacts.mvi.UserContactsBootstrap$initFlow$1", f = "UserContactsBootstrap.kt", i = {0}, l = {30, 31}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class i extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserContactsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f247829q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f247830r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f247831s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(f fVar, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f247831s = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        i iVar = new i(this.f247831s, continuation);
        iVar.f247830r = obj;
        return iVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super UserContactsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((i) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f247829q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f247830r;
            UserContactsInternalAction.Loading loading = new UserContactsInternalAction.Loading(b.InterfaceC7440b.a.f247814a);
            this.f247830r = interfaceC43172j;
            this.f247829q = 1;
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
            interfaceC43172j = (InterfaceC43172j) this.f247830r;
            C42729a0.b(obj);
        }
        InterfaceC43160i<UserContactsInternalAction> interfaceC43160iA = this.f247831s.f247816a.a(false);
        this.f247830r = null;
        this.f247829q = 2;
        if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
