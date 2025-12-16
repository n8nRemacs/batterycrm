package com.avito.android.safedeal.universal_delivery_type.mvi;

import Ju.InterfaceC14249c;
import com.avito.android.deep_linking.links.UserAddressLink;
import com.avito.android.safedeal.universal_delivery_type.ReloadReason;
import com.avito.android.safedeal.universal_delivery_type.UniversalDeliveryTypeParams;
import com.avito.android.safedeal.universal_delivery_type.mvi.entity.UniversalDeliveryTypeInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kv.C43501a;

/* compiled from: UniversalDeliveryTypeBootstrap.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkv/a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/safedeal/universal_delivery_type/mvi/entity/UniversalDeliveryTypeInternalAction;", "<anonymous>", "(Lkv/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.safedeal.universal_delivery_type.mvi.UniversalDeliveryTypeBootstrap$handleAddUserAddressDeeplink$2", f = "UniversalDeliveryTypeBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class g extends SuspendLambda implements Y41.p<C43501a, Continuation<? super InterfaceC43160i<? extends UniversalDeliveryTypeInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f256680q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p f256681r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p pVar, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f256681r = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        g gVar = new g(this.f256681r, continuation);
        gVar.f256680q = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(C43501a c43501a, Continuation<? super InterfaceC43160i<? extends UniversalDeliveryTypeInternalAction>> continuation) {
        return ((g) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC14249c interfaceC14249c = ((C43501a) this.f256680q).f413261b;
        if (!(interfaceC14249c instanceof UserAddressLink.Result.Success.Added)) {
            return C43175k.w();
        }
        p pVar = this.f256681r;
        com.avito.android.safedeal.universal_delivery_type.domain.a aVar = pVar.f256716b;
        ReloadReason reloadReason = ReloadReason.ADD_ADDRESS;
        return aVar.a(UniversalDeliveryTypeParams.a(pVar.f256715a, Boxing.boxInt(((UserAddressLink.Result.Success.Added) interfaceC14249c).f133809c), reloadReason));
    }
}
