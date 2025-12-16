package com.avito.android.advert.deeplinks.delivery;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.P2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RequestDeliveryInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/util/P2;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert.deeplinks.delivery.RequestDeliveryInteractorImpl$requestDeliveryWithNewRequest$1", f = "RequestDeliveryInteractor.kt", i = {0, 1, 2, 3}, l = {49, 51, 57, 60, 64}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0"})
/* loaded from: classes10.dex */
final class r extends SuspendLambda implements Y41.p<InterfaceC43172j<? super P2<? super DeepLink>>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f68965q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f68966r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f68967s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f68968t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f68969u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(q qVar, String str, String str2, Continuation<? super r> continuation) {
        super(2, continuation);
        this.f68967s = qVar;
        this.f68968t = str;
        this.f68969u = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        r rVar = new r(this.f68967s, this.f68968t, this.f68969u, continuation);
        rVar.f68966r = obj;
        return rVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super P2<? super DeepLink>> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((r) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0080 A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:13:0x002a, B:19:0x003b, B:29:0x007a, B:31:0x0080, B:34:0x009c, B:36:0x00a0, B:39:0x00c5, B:40:0x00ca, B:26:0x005c), top: B:46:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:13:0x002a, B:19:0x003b, B:29:0x007a, B:31:0x0080, B:34:0x009c, B:36:0x00a0, B:39:0x00c5, B:40:0x00ca, B:26:0x005c), top: B:46:0x000d }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.flow.j] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.deeplinks.delivery.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
