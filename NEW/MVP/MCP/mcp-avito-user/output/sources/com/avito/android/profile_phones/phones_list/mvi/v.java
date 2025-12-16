package com.avito.android.profile_phones.phones_list.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.profile_phones.phones_list.mvi.entity.NumbersListState;
import com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction;
import com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviState;
import com.avito.android.profile_phones.phones_list.phone_item.PhoneListItem;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import wb0.InterfaceC49590a;

/* compiled from: PhonesListMviActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_phones.phones_list.mvi.PhonesListMviActor$showPhoneActions$1", f = "PhonesListMviActor.kt", i = {}, l = {316}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class v extends SuspendLambda implements Y41.p<InterfaceC43172j<? super PhonesListMviInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f228088q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f228089r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C33433e f228090s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC49590a.j f228091t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ PhonesListMviState f228092u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(C33433e c33433e, InterfaceC49590a.j jVar, PhonesListMviState phonesListMviState, Continuation<? super v> continuation) {
        super(2, continuation);
        this.f228090s = c33433e;
        this.f228091t = jVar;
        this.f228092u = phonesListMviState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        v vVar = new v(this.f228090s, this.f228091t, this.f228092u, continuation);
        vVar.f228089r = obj;
        return vVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PhonesListMviInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((v) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        List<PhoneListItem> list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f228088q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f228089r;
            InterfaceC28373a interfaceC28373a = this.f228090s.f227971i;
            InterfaceC49590a.j jVar = this.f228091t;
            PhoneListItem phoneListItem = jVar.f441642a;
            String str = phoneListItem.f228127c;
            NumbersListState numbersListState = this.f228092u.f228021e;
            NumbersListState.Loaded loaded = numbersListState instanceof NumbersListState.Loaded ? (NumbersListState.Loaded) numbersListState : null;
            interfaceC28373a.c(new ob0.g(phoneListItem.f228133i, Math.max(((loaded == null || (list = loaded.f227980b) == null) ? 0 : list.size()) - 1, 0), str, phoneListItem.f228134j));
            PhoneListItem phoneListItem2 = jVar.f441642a;
            if (!phoneListItem2.f228132h.isEmpty()) {
                PhonesListMviInternalAction.OpenPhoneActionsSheet openPhoneActionsSheet = new PhonesListMviInternalAction.OpenPhoneActionsSheet(phoneListItem2.f228127c, phoneListItem2.f228132h);
                this.f228088q = 1;
                if (interfaceC43172j.emit(openPhoneActionsSheet, this) == coroutine_suspended) {
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
