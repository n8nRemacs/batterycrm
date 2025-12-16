package com.avito.android.publish.screen.step.request.mergedpretendpremoderation.mvi;

import Ke0.InterfaceC14308b;
import Y41.p;
import androidx.core.os.C22777e;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.MyAdvertDetailsLink;
import com.avito.android.deep_linking.links.MyAdvertLink;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import nI0.InterfaceC44261b;

/* compiled from: MergedPretendPremoderationActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LKe0/b$a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.screen.step.request.mergedpretendpremoderation.mvi.MergedPretendPremoderationActor$processDuplicateActionClick$1", f = "MergedPretendPremoderationActor.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class e extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC14308b.a>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f241814q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f241815r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ DeepLink f241816s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f241817t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(DeepLink deepLink, a aVar, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f241816s = deepLink;
        this.f241817t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f241816s, this.f241817t, continuation);
        eVar.f241815r = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC14308b.a> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f241814q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f241815r;
            DeepLink deepLink = this.f241816s;
            InterfaceC14308b.a aVar = new InterfaceC14308b.a(deepLink, ((deepLink instanceof MyAdvertDetailsLink) || (deepLink instanceof MyAdvertLink.Activate)) ? C22777e.b(new Q("up_intent", InterfaceC44261b.a.a(this.f241817t.f241810c, null, null, null, null, 31)), new Q("key_should_finish_after_activation", Boxing.boxBoolean(false))) : null);
            this.f241814q = 1;
            if (interfaceC43172j.emit(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
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
