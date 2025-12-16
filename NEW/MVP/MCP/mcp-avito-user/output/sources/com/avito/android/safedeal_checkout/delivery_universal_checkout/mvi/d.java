package com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.entity.DeliveryUniversalCheckoutInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Emitters.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.DeliveryUniversalCheckoutBootstrap$deeplinkAddUserAddressResultFlow$$inlined$transform$1", f = "DeliveryUniversalCheckoutBootstrap.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DeliveryUniversalCheckoutInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f257100q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f257101r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f257102s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f257103t;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<DeliveryUniversalCheckoutInternalAction> f257104b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j f257105c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.DeliveryUniversalCheckoutBootstrap$deeplinkAddUserAddressResultFlow$$inlined$transform$1$1", f = "DeliveryUniversalCheckoutBootstrap.kt", i = {}, l = {221}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.d$a$a, reason: collision with other inner class name */
        public static final class C7715a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f257106q;

            /* renamed from: r, reason: collision with root package name */
            public int f257107r;

            public C7715a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f257106q = obj;
                this.f257107r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, j jVar) {
            this.f257105c = jVar;
            this.f257104b = interfaceC43172j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r7, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.d.a.C7715a
                if (r0 == 0) goto L13
                r0 = r8
                com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.d$a$a r0 = (com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.d.a.C7715a) r0
                int r1 = r0.f257107r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f257107r = r1
                goto L18
            L13:
                com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.d$a$a r0 = new com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.d$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f257106q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f257107r
                r3 = 1
                if (r2 == 0) goto L32
                if (r2 != r3) goto L2a
                kotlin.C42729a0.b(r8)
                goto La5
            L2a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L32:
                kotlin.C42729a0.b(r8)
                kv.a r7 = (kv.C43501a) r7
                Ju.c r7 = r7.f413261b
                com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.j r8 = r6.f257105c
                r8.getClass()
                boolean r2 = r7 instanceof com.avito.android.deep_linking.links.UserAddressLink.Result.Success
                if (r2 != 0) goto L43
                goto L98
            L43:
                r2 = r7
                com.avito.android.deep_linking.links.UserAddressLink$Result$Success r2 = (com.avito.android.deep_linking.links.UserAddressLink.Result.Success) r2
                boolean r4 = r2 instanceof com.avito.android.deep_linking.links.UserAddressLink.Result.Success.Added
                if (r4 == 0) goto L53
                com.avito.android.deep_linking.links.UserAddressLink$Result$Success$Added r7 = (com.avito.android.deep_linking.links.UserAddressLink.Result.Success.Added) r7
                int r7 = r7.f133809c
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                goto L70
            L53:
                boolean r4 = r2 instanceof com.avito.android.deep_linking.links.UserAddressLink.Result.Success.Modified
                if (r4 == 0) goto L60
                com.avito.android.deep_linking.links.UserAddressLink$Result$Success$Modified r7 = (com.avito.android.deep_linking.links.UserAddressLink.Result.Success.Modified) r7
                int r7 = r7.f133822c
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                goto L70
            L60:
                boolean r7 = r2 instanceof com.avito.android.deep_linking.links.UserAddressLink.Result.Success.Delete
                if (r7 == 0) goto L6b
                r7 = -10
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                goto L70
            L6b:
                boolean r7 = r2 instanceof com.avito.android.deep_linking.links.UserAddressLink.Result.Success.DefaultChanged
                if (r7 == 0) goto La8
                r7 = 0
            L70:
                com.avito.android.beduin_shared.model.transform.LocalParameterTransform r2 = new com.avito.android.beduin_shared.model.transform.LocalParameterTransform
                java.lang.String r4 = "userAddressId"
                r2.<init>(r4, r7)
                com.avito.android.beduin_shared.model.transform.LocalParameterTransform r4 = new com.avito.android.beduin_shared.model.transform.LocalParameterTransform
                java.lang.String r5 = "updateAddressId"
                r4.<init>(r5, r7)
                com.avito.android.beduin_shared.model.transform.LocalParameterTransform[] r7 = new com.avito.android.beduin_shared.model.transform.LocalParameterTransform[]{r2, r4}
                java.util.List r7 = kotlin.collections.C42745f0.U(r7)
                java.lang.String r2 = "address_centrity_payload"
                java.util.Map r7 = java.util.Collections.singletonMap(r2, r7)
                com.avito.android.safedeal_checkout.delivery_universal_checkout.a r8 = r8.f257162d
                lj.a r8 = r8.f256889b
                lj.d$e r2 = new lj.d$e
                r2.<init>(r7)
                r8.h(r2)
            L98:
                com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.entity.DeliveryUniversalCheckoutInternalAction$ChangeUserAddressAction r7 = com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.entity.DeliveryUniversalCheckoutInternalAction.ChangeUserAddressAction.f257116b
                r0.f257107r = r3
                kotlinx.coroutines.flow.j<com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.entity.DeliveryUniversalCheckoutInternalAction> r8 = r6.f257104b
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto La5
                return r1
            La5:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            La8:
                kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, Continuation continuation, j jVar) {
        super(2, continuation);
        this.f257102s = cVar;
        this.f257103t = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f257102s, continuation, this.f257103t);
        dVar.f257101r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super DeliveryUniversalCheckoutInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f257100q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a((InterfaceC43172j) this.f257101r, this.f257103t);
            this.f257100q = 1;
            if (this.f257102s.collect(aVar, this) == coroutine_suspended) {
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
