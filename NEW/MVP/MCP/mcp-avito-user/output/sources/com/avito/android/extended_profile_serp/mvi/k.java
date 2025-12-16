package com.avito.android.extended_profile_serp.mvi;

import bB.InterfaceC25487a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ItemsSearchLink;
import com.avito.android.extended_profile_serp.InterfaceC30552o;
import com.avito.android.extended_profile_serp.mvi.entity.ExtendedProfileSerpInternalAction;
import com.avito.android.extended_profile_serp.mvi.entity.ExtendedProfileSerpState;
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

/* compiled from: ExtendedProfileSerpActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile_serp.mvi.ExtendedProfileSerpActor$process$6", f = "ExtendedProfileSerpActor.kt", i = {}, l = {183}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class k extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileSerpInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f153006q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f153007r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC25487a f153008s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n f153009t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ExtendedProfileSerpState f153010u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(InterfaceC25487a interfaceC25487a, n nVar, ExtendedProfileSerpState extendedProfileSerpState, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f153008s = interfaceC25487a;
        this.f153009t = nVar;
        this.f153010u = extendedProfileSerpState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        k kVar = new k(this.f153008s, this.f153009t, this.f153010u, continuation);
        kVar.f153007r = obj;
        return kVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileSerpInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((k) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f153006q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f153007r;
            DeepLink deepLink = ((InterfaceC25487a.i) this.f153008s).f56958a;
            ItemsSearchLink itemsSearchLink = deepLink instanceof ItemsSearchLink ? (ItemsSearchLink) deepLink : null;
            if (itemsSearchLink != null) {
                InterfaceC43160i interfaceC43160iA = InterfaceC30552o.a.a(this.f153009t.f153022b, 0, itemsSearchLink.f133403b, this.f153010u.f152955e, 5);
                this.f153006q = 1;
                if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
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
