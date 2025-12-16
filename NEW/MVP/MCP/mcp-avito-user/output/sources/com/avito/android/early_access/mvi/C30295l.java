package com.avito.android.early_access.mvi;

import Ju.InterfaceC14249c;
import com.avito.android.deep_linking.links.PaymentSessionLink;
import com.avito.android.early_access.mvi.entity.EarlyAccessInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kv.C43501a;

/* compiled from: EarlyAccessBootstrap.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction;", "<anonymous>", "(Lkv/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.early_access.mvi.EarlyAccessBootstrap$observeDeeplinkResult$2", f = "EarlyAccessBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.early_access.mvi.l, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30295l extends SuspendLambda implements Y41.p<C43501a, Continuation<? super InterfaceC43160i<? extends EarlyAccessInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f145511q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C30297n f145512r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30295l(C30297n c30297n, Continuation<? super C30295l> continuation) {
        super(2, continuation);
        this.f145512r = c30297n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C30295l c30295l = new C30295l(this.f145512r, continuation);
        c30295l.f145511q = obj;
        return c30295l;
    }

    @Override // Y41.p
    public final Object invoke(C43501a c43501a, Continuation<? super InterfaceC43160i<? extends EarlyAccessInternalAction>> continuation) {
        return ((C30295l) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC14249c interfaceC14249c = ((C43501a) this.f145511q).f413261b;
        if (interfaceC14249c instanceof PaymentSessionLink.b.C4013b) {
            return this.f145512r.f145515a.c();
        }
        if (!(interfaceC14249c instanceof PaymentSessionLink.b.a)) {
            return C43175k.w();
        }
        String str = ((PaymentSessionLink.b.a) interfaceC14249c).f133567b;
        return str == null ? C43175k.w() : new C43210w(new EarlyAccessInternalAction.ShowError(str));
    }
}
