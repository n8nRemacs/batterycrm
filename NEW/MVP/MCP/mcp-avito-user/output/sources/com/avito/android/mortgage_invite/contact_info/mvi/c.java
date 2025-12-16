package com.avito.android.mortgage_invite.contact_info.mvi;

import Y41.p;
import a20.C19669a;
import b20.InterfaceC25394a;
import com.avito.android.mortgage_invite.client_search.model.MortgageClient;
import com.avito.android.mortgage_invite.client_search.model.MortgageClientFullName;
import com.avito.android.mortgage_invite.client_search.model.MortgageClientSearchArguments;
import com.avito.android.mortgage_invite.common.domain.model.ContactInfoFieldId;
import com.avito.android.mortgage_invite.contact_info.mvi.entity.ApplicationContactInfoInternalAction;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ApplicationContactInfoActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_invite.contact_info.mvi.ApplicationContactInfoActor$process$3", f = "ApplicationContactInfoActor.kt", i = {}, l = {58, 63}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class c extends SuspendLambda implements p<InterfaceC43172j<? super ApplicationContactInfoInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f205683q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f205684r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC25394a f205685s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b20.d f205686t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC25394a interfaceC25394a, b20.d dVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f205685s = interfaceC25394a;
        this.f205686t = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f205685s, this.f205686t, continuation);
        cVar.f205684r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ApplicationContactInfoInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Y10.b bVar;
        MortgageClientFullName mortgageClientFullName;
        Y10.a aVar;
        List<Y10.b> list;
        Object next;
        Y10.a aVar2;
        List<Y10.b> list2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f205683q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f205684r;
            InterfaceC25394a.d dVar = (InterfaceC25394a.d) this.f205685s;
            ContactInfoFieldId contactInfoFieldId = dVar.f56828a;
            ContactInfoFieldId contactInfoFieldId2 = ContactInfoFieldId.f205525c;
            b20.d dVar2 = this.f205686t;
            Object obj2 = null;
            bVar = null;
            bVar = null;
            Y10.b bVar2 = null;
            if (contactInfoFieldId != contactInfoFieldId2 && contactInfoFieldId != ContactInfoFieldId.f205526d) {
                C19669a c19669a = dVar2.f56844b;
                if (c19669a != null && (aVar2 = c19669a.f20714f) != null && (list2 = aVar2.f19259b) != null) {
                    Iterator<T> it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next2 = it.next();
                        if (((Y10.b) next2).f19261a == dVar.f56828a) {
                            obj2 = next2;
                            break;
                        }
                    }
                    bVar2 = (Y10.b) obj2;
                }
                if (bVar2 != null && bVar2.f19263c) {
                    ApplicationContactInfoInternalAction.SetClientFieldEmptyByMasked setClientFieldEmptyByMasked = new ApplicationContactInfoInternalAction.SetClientFieldEmptyByMasked(dVar.f56828a, dVar.f56829b);
                    this.f205683q = 2;
                    if (interfaceC43172j.emit(setClientFieldEmptyByMasked, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (dVar.f56829b) {
                C19669a c19669a2 = dVar2.f56844b;
                if (c19669a2 == null || (aVar = c19669a2.f20714f) == null || (list = aVar.f19259b) == null) {
                    bVar = null;
                } else {
                    Iterator<T> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (((Y10.b) next).f19261a == ContactInfoFieldId.f205525c) {
                            break;
                        }
                    }
                    bVar = (Y10.b) next;
                }
                MortgageClient mortgageClient = dVar2.f56845c;
                String str = (mortgageClient == null || (mortgageClientFullName = mortgageClient.f205395c) == null) ? null : mortgageClientFullName.f205403e;
                if (str == null) {
                    str = "";
                }
                String str2 = bVar != null ? bVar.f19264d : null;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = bVar != null ? bVar.f19265e : null;
                ApplicationContactInfoInternalAction.OpenClientSearch openClientSearch = new ApplicationContactInfoInternalAction.OpenClientSearch(new MortgageClientSearchArguments(str, str2, str3 != null ? str3 : ""));
                this.f205683q = 1;
                if (interfaceC43172j.emit(openClientSearch, this) == coroutine_suspended) {
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
