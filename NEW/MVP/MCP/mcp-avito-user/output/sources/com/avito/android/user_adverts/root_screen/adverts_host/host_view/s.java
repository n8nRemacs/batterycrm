package com.avito.android.user_adverts.root_screen.adverts_host.host_view;

import com.avito.android.user_adverts.root_screen.adverts_host.host_view.HostViewState;
import java.util.ArrayList;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: HostViewRenderer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.host_view.UserAdvertsHostViewRenderer$renderTabs$1", f = "HostViewRenderer.kt", i = {}, l = {486}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class s extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f313087q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f313088r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ HostViewState.i f313089s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(j jVar, HostViewState.i iVar, Continuation<? super s> continuation) {
        super(2, continuation);
        this.f313088r = jVar;
        this.f313089s = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new s(this.f313088r, this.f313089s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((s) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f313087q;
        if (i12 == 0) {
            C42729a0.b(obj);
            HostViewState.i iVar = this.f313089s;
            ArrayList arrayList = iVar.f312996d;
            ArrayList arrayList2 = iVar.f312997e;
            HostViewState.h hVar = iVar.f312994b;
            this.f313087q = 1;
            if (j.a(this.f313088r, arrayList, arrayList2, hVar.f312991a, this) == coroutine_suspended) {
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
