package com.avito.android.developments_agency_search.deeplink;

import Qw.InterfaceC14939a;
import Tw.C15418a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35936s;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.AbstractC43129d1;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: DealCabinetLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.developments_agency_search.deeplink.DealCabinetLinkHandler$doHandleSuspend$2", f = "DealCabinetLinkHandler.kt", i = {}, l = {37, 40}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.developments_agency_search.deeplink.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C29831b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f136403q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C29832c f136404r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l0.h<DeepLink> f136405s;

    /* compiled from: DealCabinetLinkHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.deeplink.DealCabinetLinkHandler$doHandleSuspend$2$1$1", f = "DealCabinetLinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.developments_agency_search.deeplink.b$a */
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ l0.h<DeepLink> f136406q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C15418a f136407r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l0.h<DeepLink> hVar, C15418a c15418a, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f136406q = hVar;
            this.f136407r = c15418a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f136406q, this.f136407r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [T, com.avito.android.deep_linking.links.DeepLink] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            this.f136406q.f406842b = this.f136407r.getRedirectUrl();
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29831b(C29832c c29832c, l0.h<DeepLink> hVar, Continuation<? super C29831b> continuation) {
        super(2, continuation);
        this.f136404r = c29832c;
        this.f136405s = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C29831b(this.f136404r, this.f136405s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((C29831b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f136403q;
        C29832c c29832c = this.f136404r;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC14939a interfaceC14939a = c29832c.f136411j;
            this.f136403q = 1;
            obj = interfaceC14939a.o(null, this);
            if (obj == coroutine_suspended) {
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
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            C15418a c15418a = (C15418a) ((TypedResult.Success) typedResult).getResult();
            AbstractC43129d1 abstractC43129d1B = c29832c.f136414m.b();
            a aVar = new a(this.f136405s, c15418a, null);
            this.f136403q = 2;
            if (C43259k.g(abstractC43129d1B, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            TypedResult.Error error = (TypedResult.Error) typedResult;
            C35936s.a(error.getError(), error.getCause());
        }
        return G0.f406611a;
    }
}
