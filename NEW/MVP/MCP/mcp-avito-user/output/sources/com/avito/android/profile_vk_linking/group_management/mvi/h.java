package com.avito.android.profile_vk_linking.group_management.mvi;

import Ju.InterfaceC14249c;
import Vc0.b;
import com.avito.android.profile_vk_linking.common.deep_linking.ProfileVkRequestTokenLink;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kv.C43501a;

/* compiled from: VkLinkingGroupManagementBootstrap.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlinx/coroutines/flow/i;", "LVc0/b;", "<anonymous>", "(Lkv/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_vk_linking.group_management.mvi.VkLinkingGroupManagementBootstrap$deeplinkResultFlow$2", f = "VkLinkingGroupManagementBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class h extends SuspendLambda implements Y41.p<C43501a, Continuation<? super InterfaceC43160i<? extends Vc0.b>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f231212q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i f231213r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f231213r = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        h hVar = new h(this.f231213r, continuation);
        hVar.f231212q = obj;
        return hVar;
    }

    @Override // Y41.p
    public final Object invoke(C43501a c43501a, Continuation<? super InterfaceC43160i<? extends Vc0.b>> continuation) {
        return ((h) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        C43501a c43501a = (C43501a) this.f231212q;
        String str = c43501a.f413260a.f134521b;
        boolean zF2 = L.f(str, "vk_group_management_link_req_key");
        i iVar = this.f231213r;
        InterfaceC14249c interfaceC14249c = c43501a.f413261b;
        if (zF2 && (interfaceC14249c instanceof ProfileVkRequestTokenLink.c.b)) {
            ProfileVkRequestTokenLink.c.b bVar = (ProfileVkRequestTokenLink.c.b) interfaceC14249c;
            return iVar.f231214a.d(bVar.f230955b, bVar.f230956c);
        }
        if (!L.f(str, "vk_group_management_req_key") || !(interfaceC14249c instanceof ProfileVkRequestTokenLink.c.b)) {
            return interfaceC14249c instanceof ProfileVkRequestTokenLink.c.a ? new C43210w(b.n.f17307a) : C43175k.w();
        }
        ProfileVkRequestTokenLink.c.b bVar2 = (ProfileVkRequestTokenLink.c.b) interfaceC14249c;
        return iVar.f231214a.b(bVar2.f230955b, bVar2.f230956c);
    }
}
