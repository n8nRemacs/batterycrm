package com.avito.android.bxcontent.mvi;

import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
import com.avito.android.deep_linking.links.auth.ActualizePhonesStatusLink;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BxContentBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentBootstrap$addAfterContentLoadedActions$1", f = "BxContentBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.bxcontent.mvi.t, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29221t extends SuspendLambda implements Y41.p<BxContentInternalAction, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f112565q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C29225v f112566r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29221t(C29225v c29225v, Continuation<? super C29221t> continuation) {
        super(2, continuation);
        this.f112566r = c29225v;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29221t c29221t = new C29221t(this.f112566r, continuation);
        c29221t.f112565q = obj;
        return c29221t;
    }

    @Override // Y41.p
    public final Object invoke(BxContentInternalAction bxContentInternalAction, Continuation<? super kotlin.G0> continuation) {
        return ((C29221t) create(bxContentInternalAction, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        if (((BxContentInternalAction) this.f112565q) instanceof BxContentInternalAction.ContentLoaded) {
            b.a.a(this.f112566r.f112583e, ActualizePhonesStatusLink.f133880b, null, null, 6);
        }
        return kotlin.G0.f406611a;
    }
}
