package com.avito.android.mortgage_invite.participant.mvi;

import com.avito.android.mortgage_invite.client_search.model.MortgageClient;
import com.avito.android.mortgage_invite.client_search.model.MortgageClientFullName;
import com.avito.android.mortgage_invite.client_search.model.MortgageClientSearchArguments;
import com.avito.android.mortgage_invite.participant.domain.model.ParticipantFieldId;
import com.avito.android.mortgage_invite.participant.mvi.entity.ParticipantInternalAction;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import o20.C44572a;
import p20.C46879d;
import p20.InterfaceC46876a;

/* compiled from: ParticipantActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_invite.participant.mvi.ParticipantActor$process$3", f = "ParticipantActor.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ParticipantInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f206175q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f206176r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC46876a f206177s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f206178t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C46879d f206179u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar, Continuation continuation, InterfaceC46876a interfaceC46876a, C46879d c46879d) {
        super(2, continuation);
        this.f206177s = interfaceC46876a;
        this.f206178t = iVar;
        this.f206179u = c46879d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f206178t, continuation, this.f206177s, this.f206179u);
        cVar.f206176r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ParticipantInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        o20.d dVar;
        MortgageClientFullName mortgageClientFullName;
        C44572a c44572a;
        List<o20.d> list;
        Object next;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f206175q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f206176r;
            Set<ParticipantFieldId> set = com.avito.android.mortgage_invite.participant.domain.mapper.d.f206098c;
            InterfaceC46876a.d dVar2 = (InterfaceC46876a.d) this.f206177s;
            if (set.contains(dVar2.f428128a) && dVar2.f428129b) {
                this.f206178t.f206223c.b();
                C46879d c46879d = this.f206179u;
                o20.c cVar = c46879d.f428146b;
                if (cVar == null || (c44572a = cVar.f419325e) == null || (list = c44572a.f419315b) == null) {
                    dVar = null;
                } else {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((o20.d) next).f419328a == ParticipantFieldId.f206099b) {
                            break;
                        }
                    }
                    dVar = (o20.d) next;
                }
                MortgageClient mortgageClient = c46879d.f428147c;
                String str = (mortgageClient == null || (mortgageClientFullName = mortgageClient.f205395c) == null) ? null : mortgageClientFullName.f205403e;
                if (str == null) {
                    str = "";
                }
                String str2 = dVar != null ? dVar.f419330c : null;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = dVar != null ? dVar.f419331d : null;
                ParticipantInternalAction.OpenClientSearch openClientSearch = new ParticipantInternalAction.OpenClientSearch(new MortgageClientSearchArguments(str, str2, str3 != null ? str3 : ""));
                this.f206175q = 1;
                if (interfaceC43172j.emit(openClientSearch, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
