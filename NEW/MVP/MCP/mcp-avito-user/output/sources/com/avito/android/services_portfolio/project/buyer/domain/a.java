package com.avito.android.services_portfolio.project.buyer.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.services_portfolio.project.buyer.mvi.entity.PortfolioProjectBuyerInternalAction;
import cv0.InterfaceC39418a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ov0.InterfaceC44945a;

/* compiled from: PortfolioProjectBuyerInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_portfolio/project/buyer/domain/a;", "", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC39418a f280002a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC44945a f280003b;

    /* compiled from: PortfolioProjectBuyerInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/services_portfolio/project/buyer/mvi/entity/PortfolioProjectBuyerInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.services_portfolio.project.buyer.domain.PortfolioProjectBuyerInteractor$loadProject$1", f = "PortfolioProjectBuyerInteractor.kt", i = {0, 1}, l = {30, 32, 61}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    /* renamed from: com.avito.android.services_portfolio.project.buyer.domain.a$a, reason: collision with other inner class name */
    public static final class C8328a extends SuspendLambda implements p<InterfaceC43172j<? super PortfolioProjectBuyerInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f280004q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f280005r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f280007t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f280008u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ boolean f280009v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ boolean f280010w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f280011x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8328a(long j12, String str, boolean z12, boolean z13, String str2, Continuation<? super C8328a> continuation) {
            super(2, continuation);
            this.f280007t = j12;
            this.f280008u = str;
            this.f280009v = z12;
            this.f280010w = z13;
            this.f280011x = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C8328a c8328a = a.this.new C8328a(this.f280007t, this.f280008u, this.f280009v, this.f280010w, this.f280011x, continuation);
            c8328a.f280005r = obj;
            return c8328a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super PortfolioProjectBuyerInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C8328a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x01ca  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x01e3 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 493
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.services_portfolio.project.buyer.domain.a.C8328a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public a(@k InterfaceC39418a interfaceC39418a, @k InterfaceC44945a interfaceC44945a) {
        this.f280002a = interfaceC39418a;
        this.f280003b = interfaceC44945a;
    }

    @k
    public final InterfaceC43160i<PortfolioProjectBuyerInternalAction> a(long j12, @l String str, boolean z12, boolean z13, @l String str2) {
        return C43175k.G(new C8328a(j12, str, z12, z13, str2, null));
    }
}
