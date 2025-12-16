package com.avito.android.developments_agency_search.screen.realty_agency_search.mvi;

import android.os.Bundle;
import com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.entity.RealtyAgencySearchInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RealtyAgencySearchBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.RealtyAgencySearchBootstrap$handleSuccessDeeplinkResult$1", f = "RealtyAgencySearchBootstrap.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.x, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C29888x extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RealtyAgencySearchInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f138980q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f138981r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C29887w f138982s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Bundle f138983t;

    /* compiled from: RealtyAgencySearchBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/G0;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/mvi/entity/RealtyAgencySearchInternalAction;", "<anonymous>", "(V)Lkotlinx/coroutines/flow/Flow;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.RealtyAgencySearchBootstrap$handleSuccessDeeplinkResult$1$1", f = "RealtyAgencySearchBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.developments_agency_search.screen.realty_agency_search.mvi.x$a */
    public static final class a extends SuspendLambda implements Y41.p<G0, Continuation<? super InterfaceC43160i<? extends RealtyAgencySearchInternalAction>>, Object> {
        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(2, continuation);
        }

        @Override // Y41.p
        public final Object invoke(G0 g02, Continuation<? super InterfaceC43160i<? extends RealtyAgencySearchInternalAction>> continuation) {
            return ((a) create(g02, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return C43175k.w();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29888x(C29887w c29887w, Bundle bundle, Continuation<? super C29888x> continuation) {
        super(2, continuation);
        this.f138982s = c29887w;
        this.f138983t = bundle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29888x c29888x = new C29888x(this.f138982s, this.f138983t, continuation);
        c29888x.f138981r = obj;
        return c29888x;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RealtyAgencySearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C29888x) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f138980q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f138981r;
            com.avito.android.realty_agency.use_case.a aVar = this.f138982s.f138975f;
            Bundle bundle = this.f138983t;
            C0 c0B = C43175k.B(new a(2, null), aVar.a(Long.parseLong(bundle.getString("lotId", "")), bundle.getString("clientId", ""), bundle.getString("selectionName", "")));
            this.f138980q = 1;
            if (C43175k.u(this, c0B, interfaceC43172j) == coroutine_suspended) {
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
