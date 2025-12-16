package com.avito.android.status_doc.mvi.logic;

import Ax0.InterfaceC13098b;
import Y41.p;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.status_doc.mvi.entities.GigStatusDocInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: GigStatusDocActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/status_doc/mvi/entities/GigStatusDocInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.status_doc.mvi.logic.GigStatusDocActor$process$1", f = "GigStatusDocActor.kt", i = {}, l = {30, 31, 36}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super GigStatusDocInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f284931q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f284932r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC13098b f284933s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f284934t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC13098b interfaceC13098b, b bVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f284933s = interfaceC13098b;
        this.f284934t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f284933s, this.f284934t, continuation);
        aVar.f284932r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super GigStatusDocInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f284931q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f284932r;
            InterfaceC13098b interfaceC13098b = this.f284933s;
            boolean z12 = interfaceC13098b instanceof InterfaceC13098b.c;
            b bVar = this.f284934t;
            if (z12) {
                com.avito.android.status_doc.mvi.interactor.a aVar = bVar.f284935a;
                this.f284931q = 1;
                if (aVar.a(interfaceC43172j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (interfaceC13098b instanceof InterfaceC13098b.C0030b) {
                GigStatusDocInternalAction.Close close = GigStatusDocInternalAction.Close.f284910b;
                this.f284931q = 2;
                if (interfaceC43172j.emit(close, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (interfaceC13098b instanceof InterfaceC13098b.d) {
                b.a.a(bVar.f284937c, ((InterfaceC13098b.d) interfaceC13098b).f721a, null, null, 6);
            } else if (interfaceC13098b instanceof InterfaceC13098b.a) {
                InterfaceC13098b.a aVar2 = (InterfaceC13098b.a) interfaceC13098b;
                ParametrizedClickStreamEvent parametrizedClickStreamEvent = aVar2.f718a.f717d;
                if (parametrizedClickStreamEvent != null) {
                    bVar.f284936b.c(parametrizedClickStreamEvent);
                }
                DeepLink deepLink = aVar2.f718a.f716c;
                if (deepLink instanceof NoMatchLink) {
                    GigStatusDocInternalAction.Close close2 = GigStatusDocInternalAction.Close.f284910b;
                    this.f284931q = 3;
                    if (interfaceC43172j.emit(close2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    b.a.a(bVar.f284937c, deepLink, null, null, 6);
                }
            }
        } else {
            if (i12 != 1 && i12 != 2 && i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
