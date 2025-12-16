package com.avito.android.phones_actualization.deep_linking;

import com.avito.android.code_check_public.CodeCheckLink;
import com.avito.android.deep_linking.links.auth.ActualizePhonesStatusLink;
import com.avito.android.phones_actualization.deep_linking.f;
import com.avito.android.remote.model.PhonesPayload;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: ActualizePhonesStatusAsyncLinkHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.phones_actualization.deep_linking.ActualizePhonesStatusAsyncLinkHandler$doHandle$1", f = "ActualizePhonesStatusAsyncLinkHandler.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class g extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f216187q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f216188r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f216188r = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new g(this.f216188r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object objA;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f216187q;
        h hVar = this.f216188r;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f216187q = 1;
            objA = hVar.f216189f.a(this);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            objA = obj;
        }
        f fVar = (f) objA;
        if (fVar instanceof f.a) {
            hVar.j(ActualizePhonesStatusLink.b.a.f133881b);
        } else {
            boolean z12 = fVar instanceof f.b;
            com.avito.android.deeplink_handler.handler.composite.a aVar = hVar.f216190g;
            if (z12) {
                hVar.i(ActualizePhonesStatusLink.b.C4023b.f133882b, aVar, new CodeCheckLink(new CodeCheckLink.Flow.ActualizePhones(CodeCheckLink.Flow.ActualizePhones.Scenario.AddPhone.f119248b), null, 2, null));
            } else if (fVar instanceof f.c) {
                f.c cVar = (f.c) fVar;
                boolean z13 = cVar.f216186b;
                PhonesPayload phonesPayload = cVar.f216185a;
                hVar.i(ActualizePhonesStatusLink.b.C4023b.f133882b, aVar, new CodeCheckLink(new CodeCheckLink.Flow.ActualizePhones(new CodeCheckLink.Flow.ActualizePhones.Scenario.ShowActualizePhones(z13, phonesPayload.getTitle(), phonesPayload.getDescription(), null, 8, null)), new CodeCheckLink.Arguments(null, null, null, phonesPayload.getPhones(), 7, null)));
            }
        }
        return G0.f406611a;
    }
}
