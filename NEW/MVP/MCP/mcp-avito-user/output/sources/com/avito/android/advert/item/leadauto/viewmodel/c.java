package com.avito.android.advert.item.leadauto.viewmodel;

import Y41.l;
import Y41.p;
import Y61.k;
import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import androidx.view.N0;
import com.avito.android.developments_advice.remote.model.ContactInfoResponse;
import com.avito.android.util.P2;
import com.avito.android.util.R0;
import h30.InterfaceC40766a;
import h31.e;
import j30.C42188a;
import k30.InterfaceC42490a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;

/* compiled from: AutoNewCarsLeadFormViewModelImpl.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/leadauto/viewmodel/c;", "Landroidx/lifecycle/M0;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final e<InterfaceC40766a> f77319E;

    /* renamed from: J, reason: collision with root package name */
    @k
    public final InterfaceC42490a f77320J;

    /* renamed from: K, reason: collision with root package name */
    @k
    public final R0 f77321K;

    /* renamed from: L, reason: collision with root package name */
    @k
    public final Z1<P2<ContactInfoResponse>> f77322L = p2.a(null);

    /* renamed from: M, reason: collision with root package name */
    @k
    public final Z1<P2<C42188a>> f77323M = p2.a(P2.c.f318721a);

    /* compiled from: AutoNewCarsLeadFormViewModelImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert/item/leadauto/viewmodel/c$a;", "", "<init>", "()V", "", "MESSAGE_SUCCESS_KEY", "Ljava/lang/String;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AutoNewCarsLeadFormViewModelImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.item.leadauto.viewmodel.ConsultationAutoViewModel$sendLead$1", f = "AutoNewCarsLeadFormViewModelImpl.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Object f77324q;

        /* renamed from: r, reason: collision with root package name */
        public Object f77325r;

        /* renamed from: s, reason: collision with root package name */
        public int f77326s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f77327t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ c f77328u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ long f77329v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ l<String, G0> f77330w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ l<Throwable, G0> f77331x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(String str, c cVar, long j12, l<? super String, G0> lVar, l<? super Throwable, G0> lVar2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f77327t = str;
            this.f77328u = cVar;
            this.f77329v = j12;
            this.f77330w = lVar;
            this.f77331x = lVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            return new b(this.f77327t, this.f77328u, this.f77329v, this.f77330w, this.f77331x, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.f77326s
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r0 = r11.f77325r
                Y41.l r0 = (Y41.l) r0
                java.lang.Object r1 = r11.f77324q
                Y41.l r1 = (Y41.l) r1
                kotlin.C42729a0.b(r12)
                goto L89
            L19:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L21:
                kotlin.C42729a0.b(r12)
                java.lang.String r12 = r11.f77327t
                boolean r1 = kotlin.text.C43066x.K(r12)
                com.avito.android.advert.item.leadauto.viewmodel.c r4 = r11.f77328u
                if (r1 != 0) goto L30
            L2e:
                r9 = r12
                goto L56
            L30:
                kotlinx.coroutines.flow.Z1<com.avito.android.util.P2<com.avito.android.developments_advice.remote.model.ContactInfoResponse>> r12 = r4.f77322L
                java.lang.Object r12 = r12.getValue()
                com.avito.android.util.P2 r12 = (com.avito.android.util.P2) r12
                if (r12 == 0) goto L55
                java.lang.Object r12 = com.avito.android.util.T2.a(r12)
                com.avito.android.developments_advice.remote.model.ContactInfoResponse r12 = (com.avito.android.developments_advice.remote.model.ContactInfoResponse) r12
                if (r12 == 0) goto L55
                java.util.List r12 = r12.d()
                if (r12 == 0) goto L55
                java.lang.Object r12 = kotlin.collections.C42745f0.E(r12)
                com.avito.android.developments_advice.remote.model.Phone r12 = (com.avito.android.developments_advice.remote.model.Phone) r12
                if (r12 == 0) goto L55
                java.lang.String r12 = r12.getPhone()
                goto L2e
            L55:
                r9 = r3
            L56:
                if (r9 == 0) goto Lc8
                k30.a r5 = r4.f77320J
                kotlinx.coroutines.flow.Z1<com.avito.android.util.P2<com.avito.android.developments_advice.remote.model.ContactInfoResponse>> r12 = r4.f77322L
                java.lang.Object r12 = r12.getValue()
                com.avito.android.util.P2 r12 = (com.avito.android.util.P2) r12
                if (r12 == 0) goto L72
                java.lang.Object r12 = com.avito.android.util.T2.a(r12)
                com.avito.android.developments_advice.remote.model.ContactInfoResponse r12 = (com.avito.android.developments_advice.remote.model.ContactInfoResponse) r12
                if (r12 == 0) goto L72
                java.lang.String r12 = r12.getName()
                r8 = r12
                goto L73
            L72:
                r8 = r3
            L73:
                Y41.l<java.lang.String, kotlin.G0> r1 = r11.f77330w
                r11.f77324q = r1
                Y41.l<java.lang.Throwable, kotlin.G0> r12 = r11.f77331x
                r11.f77325r = r12
                r11.f77326s = r2
                long r6 = r11.f77329v
                r10 = r11
                java.lang.Object r2 = r5.a(r6, r8, r9, r10)
                if (r2 != r0) goto L87
                return r0
            L87:
                r0 = r12
                r12 = r2
            L89:
                com.avito.android.remote.model.TypedResult r12 = (com.avito.android.remote.model.TypedResult) r12
                boolean r2 = r12 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r2 == 0) goto Lac
                com.avito.android.remote.model.TypedResult$Success r12 = (com.avito.android.remote.model.TypedResult.Success) r12
                java.lang.Object r12 = r12.getResult()
                boolean r0 = r12 instanceof java.util.Map
                if (r0 == 0) goto L9c
                java.util.Map r12 = (java.util.Map) r12
                goto L9d
            L9c:
                r12 = r3
            L9d:
                if (r12 == 0) goto La8
                java.lang.String r0 = "message"
                java.lang.Object r12 = r12.get(r0)
                r3 = r12
                java.lang.String r3 = (java.lang.String) r3
            La8:
                r1.invoke(r3)
                goto Lc8
            Lac:
                boolean r1 = r12 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r1 == 0) goto Lc2
                com.avito.android.remote.model.TypedResult$Error r12 = (com.avito.android.remote.model.TypedResult.Error) r12
                com.avito.android.remote.error.ApiError r1 = r12.getError()
                java.lang.Throwable r12 = r12.getCause()
                com.avito.android.util.ApiException r12 = com.avito.android.util.C35936s.a(r1, r12)
                r0.invoke(r12)
                goto Lc8
            Lc2:
                kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
                r12.<init>()
                throw r12
            Lc8:
                kotlin.G0 r12 = kotlin.G0.f406611a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.leadauto.viewmodel.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new a(null);
    }

    public c(@k e<InterfaceC40766a> eVar, @k InterfaceC42490a interfaceC42490a, @k R0 r02) {
        this.f77319E = eVar;
        this.f77320J = interfaceC42490a;
        this.f77321K = r02;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ke(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.avito.android.advert.item.leadauto.viewmodel.d
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.advert.item.leadauto.viewmodel.d r0 = (com.avito.android.advert.item.leadauto.viewmodel.d) r0
            int r1 = r0.f77335t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f77335t = r1
            goto L18
        L13:
            com.avito.android.advert.item.leadauto.viewmodel.d r0 = new com.avito.android.advert.item.leadauto.viewmodel.d
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f77333r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f77335t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f77332q
            kotlinx.coroutines.flow.Z1 r0 = (kotlinx.coroutines.flow.Z1) r0
            kotlin.C42729a0.b(r6)
            goto L50
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            kotlin.C42729a0.b(r6)
            kotlinx.coroutines.flow.Z1<com.avito.android.util.P2<j30.a>> r6 = r5.f77323M
            h31.e<h30.a> r2 = r5.f77319E
            java.lang.Object r2 = r2.get()
            h30.a r2 = (h30.InterfaceC40766a) r2
            r0.f77332q = r6
            r0.f77335t = r3
            java.lang.Object r0 = r2.a(r0)
            if (r0 != r1) goto L4d
            return r1
        L4d:
            r4 = r0
            r0 = r6
            r6 = r4
        L50:
            com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
            boolean r1 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r1 == 0) goto L7c
            boolean r1 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r1 == 0) goto L66
            com.avito.android.util.P2$b r1 = new com.avito.android.util.P2$b
            com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
            java.lang.Object r6 = r6.getResult()
            r1.<init>(r6)
            goto L94
        L66:
            boolean r1 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r1 == 0) goto L76
            com.avito.android.util.P2$a r1 = new com.avito.android.util.P2$a
            com.avito.android.remote.model.TypedResult$Error r6 = (com.avito.android.remote.model.TypedResult.Error) r6
            com.avito.android.remote.error.ApiError r6 = r6.getError()
            r1.<init>(r6)
            goto L94
        L76:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L7c:
            boolean r1 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r1 == 0) goto L9a
            com.avito.android.util.P2$a r1 = new com.avito.android.util.P2$a
            com.avito.android.remote.error.ApiError$Failure r2 = new com.avito.android.remote.error.ApiError$Failure
            com.avito.android.remote.model.TypedResult$Error r6 = (com.avito.android.remote.model.TypedResult.Error) r6
            com.avito.android.remote.error.ApiError r6 = r6.getError()
            java.lang.String r6 = r6.getF244063c()
            r2.<init>(r6)
            r1.<init>(r2)
        L94:
            r0.setValue(r1)
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        L9a:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.leadauto.viewmodel.c.ke(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void le(@k String str, long j12, @k l<? super String, G0> lVar, @k l<? super Throwable, G0> lVar2) {
        C43259k.d(N0.a(this), this.f77321K.a(), null, new b(str, this, j12, lVar, lVar2, null), 2);
    }
}
