package com.avito.android.profile.pro.impl.screen.mvi;

import D90.a;
import D90.b;
import Ju.InterfaceC14249c;
import Y41.p;
import com.avito.android.deep_linking.links.UserAddressLink;
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

/* compiled from: ProfileProActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LD90/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile.pro.impl.screen.mvi.ProfileProActor$process$18", f = "ProfileProActor.kt", i = {0}, l = {297, 298}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super D90.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f223680q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f223681r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14249c f223682s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f223683t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ D90.d f223684u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC14249c interfaceC14249c, a aVar, D90.d dVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f223682s = interfaceC14249c;
        this.f223683t = aVar;
        this.f223684u = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f223682s, this.f223683t, this.f223684u, continuation);
        bVar.f223681r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super D90.b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f223680q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f223681r;
            b.s sVar = new b.s((UserAddressLink.Result.Success) this.f223682s);
            this.f223681r = interfaceC43172j;
            this.f223680q = 1;
            if (interfaceC43172j.emit(sVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f223681r;
            C42729a0.b(obj);
        }
        InterfaceC43160i<D90.b> interfaceC43160iB = this.f223683t.b(a.x.f3006a, this.f223684u);
        this.f223681r = null;
        this.f223680q = 2;
        if (C43175k.u(this, interfaceC43160iB, interfaceC43172j) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
