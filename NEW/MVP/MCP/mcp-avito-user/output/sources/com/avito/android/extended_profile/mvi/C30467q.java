package com.avito.android.extended_profile.mvi;

import com.avito.android.InterfaceC32897n0;
import com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction;
import com.avito.android.extended_profile_widgets.adapter.header.HeaderItem;
import com.avito.android.remote.model.SubscribeInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ExtendedProfileActor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile.mvi.ExtendedProfileActor$reloadIfSubscriptionStatusChanged$1", f = "ExtendedProfileActor.kt", i = {}, l = {861}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.extended_profile.mvi.q, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30467q extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f150364q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f150365r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C30451a f150366s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.extended_profile.mvi.entity.a f150367t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30467q(C30451a c30451a, com.avito.android.extended_profile.mvi.entity.a aVar, Continuation<? super C30467q> continuation) {
        super(2, continuation);
        this.f150366s = c30451a;
        this.f150367t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C30467q c30467q = new C30467q(this.f150366s, this.f150367t, continuation);
        c30467q.f150365r = obj;
        return c30467q;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C30467q) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        com.avito.android.extended_profile.data.b bVar;
        List<com.avito.android.extended_profile.data.g> list;
        HeaderItem headerItem;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f150364q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f150365r;
            C30451a c30451a = this.f150366s;
            InterfaceC32897n0 interfaceC32897n0 = c30451a.f150079m.m().get(c30451a.f150067a);
            if (interfaceC32897n0 != null && (bVar = this.f150367t.f150240b) != null && (list = bVar.f149466a) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof com.avito.android.extended_profile.data.h) {
                        arrayList.add(obj2);
                    }
                }
                com.avito.android.extended_profile.data.h hVar = (com.avito.android.extended_profile.data.h) C42745f0.G(arrayList);
                if (hVar != null && (headerItem = hVar.f149489d) != null) {
                    SubscribeInfo subscribeInfo = headerItem.f154425j;
                    Boolean boolIsSubscribed = subscribeInfo != null ? subscribeInfo.isSubscribed() : null;
                    Boolean boolIsNotificationsActivated = subscribeInfo != null ? subscribeInfo.isNotificationsActivated() : null;
                    if (!kotlin.jvm.internal.L.f(Boxing.boxBoolean(interfaceC32897n0.getF155497f()), boolIsSubscribed) || (!kotlin.jvm.internal.L.f(interfaceC32897n0.getF155498g(), boolIsNotificationsActivated) && boolIsSubscribed.booleanValue())) {
                        InterfaceC43160i interfaceC43160iA = c30451a.f150071e.a(c30451a.f150070d, c30451a.f150069c, c30451a.f150067a, c30451a.f150068b, true);
                        this.f150364q = 1;
                        if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
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
