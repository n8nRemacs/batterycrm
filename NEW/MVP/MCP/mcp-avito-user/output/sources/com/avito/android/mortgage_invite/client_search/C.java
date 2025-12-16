package com.avito.android.mortgage_invite.client_search;

import W10.b;
import com.avito.android.mortgage_invite.client_search.model.MortgageClient;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: MortgageClientSearchScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_invite.client_search.MortgageClientSearchScreenKt$MortgageClientSearchScreen$1", f = "MortgageClientSearchScreen.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class C extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f205308q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<W10.b> f205309r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f205310s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f205311t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.l<MortgageClient, G0> f205312u;

    /* compiled from: MortgageClientSearchScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW10/b;", "event", "Lkotlin/G0;", "<anonymous>", "(LW10/b;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage_invite.client_search.MortgageClientSearchScreenKt$MortgageClientSearchScreen$1$1", f = "MortgageClientSearchScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<W10.b, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f205313q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f205314r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f205315s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Y41.l<MortgageClient, G0> f205316t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.a<G0> aVar, Y41.a<G0> aVar2, Y41.l<? super MortgageClient, G0> lVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f205314r = aVar;
            this.f205315s = aVar2;
            this.f205316t = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f205314r, this.f205315s, this.f205316t, continuation);
            aVar.f205313q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(W10.b bVar, Continuation<? super G0> continuation) {
            return ((a) create(bVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            W10.b bVar = (W10.b) this.f205313q;
            if (bVar instanceof b.a) {
                this.f205314r.invoke();
            } else if (bVar instanceof b.c) {
                this.f205315s.invoke();
            } else if (bVar instanceof b.C1222b) {
                this.f205316t.invoke(((b.C1222b) bVar).f17555a);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(Y41.a aVar, Y41.a aVar2, Y41.l lVar, Continuation continuation, InterfaceC43160i interfaceC43160i) {
        super(2, continuation);
        this.f205309r = interfaceC43160i;
        this.f205310s = aVar;
        this.f205311t = aVar2;
        this.f205312u = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C(this.f205310s, this.f205311t, this.f205312u, continuation, this.f205309r);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((C) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f205308q;
        if (i12 == 0) {
            C42729a0.b(obj);
            C43197r1 c43197r1 = new C43197r1(new a(this.f205310s, this.f205311t, this.f205312u, null), this.f205309r);
            this.f205308q = 1;
            if (C43175k.i(c43197r1, this) == coroutine_suspended) {
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
