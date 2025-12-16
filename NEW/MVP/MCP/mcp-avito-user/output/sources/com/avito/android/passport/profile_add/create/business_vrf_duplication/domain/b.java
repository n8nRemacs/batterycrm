package com.avito.android.passport.profile_add.create.business_vrf_duplication.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.passport.profile_add.merge.business_vrf_duplication.mvi.entity.BusinessVrfDuplicationInternalAction;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import h31.e;
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

/* compiled from: BusinessVrfDuplicationProfileCreationActorInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create/business_vrf_duplication/domain/b;", "Lcom/avito/android/passport/profile_add/create/business_vrf_duplication/domain/a;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.passport.profile_add.create.business_vrf_duplication.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<I50.a> f211231a;

    /* compiled from: BusinessVrfDuplicationProfileCreationActorInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/passport/profile_add/merge/business_vrf_duplication/mvi/entity/BusinessVrfDuplicationInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.passport.profile_add.create.business_vrf_duplication.domain.BusinessVrfDuplicationProfileCreationInteractorImpl$loadContent$1", f = "BusinessVrfDuplicationProfileCreationActorInteractor.kt", i = {0, 1}, l = {21, 22, 23, InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super BusinessVrfDuplicationInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f211232q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f211233r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f211235t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f211235t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = b.this.new a(this.f211235t, continuation);
            aVar.f211233r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BusinessVrfDuplicationInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f211232q
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L32
                if (r1 == r5) goto L2a
                if (r1 == r4) goto L22
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                goto L1d
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                kotlin.C42729a0.b(r7)
                goto La2
            L22:
                java.lang.Object r1 = r6.f211233r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L61
            L2a:
                java.lang.Object r1 = r6.f211233r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L4a
            L32:
                kotlin.C42729a0.b(r7)
                java.lang.Object r7 = r6.f211233r
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
                com.avito.android.passport.profile_add.merge.business_vrf_duplication.mvi.entity.BusinessVrfDuplicationInternalAction$LoadingStarted r1 = new com.avito.android.passport.profile_add.merge.business_vrf_duplication.mvi.entity.BusinessVrfDuplicationInternalAction$LoadingStarted
                r1.<init>()
                r6.f211233r = r7
                r6.f211232q = r5
                java.lang.Object r1 = r7.emit(r1, r6)
                if (r1 != r0) goto L49
                return r0
            L49:
                r1 = r7
            L4a:
                com.avito.android.passport.profile_add.create.business_vrf_duplication.domain.b r7 = com.avito.android.passport.profile_add.create.business_vrf_duplication.domain.b.this
                h31.e<I50.a> r7 = r7.f211231a
                java.lang.Object r7 = r7.get()
                I50.a r7 = (I50.a) r7
                r6.f211233r = r1
                r6.f211232q = r4
                java.lang.String r4 = r6.f211235t
                java.lang.Object r7 = r7.k(r4, r6)
                if (r7 != r0) goto L61
                return r0
            L61:
                com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
                boolean r4 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r4 == 0) goto L80
                com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
                java.lang.Object r7 = r7.getResult()
                com.avito.android.passport.network.model.ProfileCreationDuplicationOptionsResponse r7 = (com.avito.android.passport.network.model.ProfileCreationDuplicationOptionsResponse) r7
                com.avito.android.passport.profile_add.merge.business_vrf_duplication.mvi.entity.BusinessVrfDuplicationInternalAction$ContentLoaded r2 = new com.avito.android.passport.profile_add.merge.business_vrf_duplication.mvi.entity.BusinessVrfDuplicationInternalAction$ContentLoaded
                r2.<init>(r7)
                r6.f211233r = r5
                r6.f211232q = r3
                java.lang.Object r7 = r1.emit(r2, r6)
                if (r7 != r0) goto La2
                return r0
            L80:
                boolean r3 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto La5
                com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
                com.avito.android.remote.error.ApiError r3 = r7.getError()
                java.lang.Throwable r7 = r7.getCause()
                com.avito.android.util.ApiException r7 = com.avito.android.util.C35936s.a(r3, r7)
                com.avito.android.passport.profile_add.merge.business_vrf_duplication.mvi.entity.BusinessVrfDuplicationInternalAction$Error r3 = new com.avito.android.passport.profile_add.merge.business_vrf_duplication.mvi.entity.BusinessVrfDuplicationInternalAction$Error
                r3.<init>(r7)
                r6.f211233r = r5
                r6.f211232q = r2
                java.lang.Object r7 = r1.emit(r3, r6)
                if (r7 != r0) goto La2
                return r0
            La2:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            La5:
                kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.passport.profile_add.create.business_vrf_duplication.domain.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public b(@k e<I50.a> eVar) {
        this.f211231a = eVar;
    }

    @Override // com.avito.android.passport.profile_add.create.business_vrf_duplication.domain.a
    @k
    public final InterfaceC43160i<BusinessVrfDuplicationInternalAction> a(@k String str) {
        return C43175k.G(new a(str, null));
    }
}
