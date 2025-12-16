package com.avito.android.wallet.page.topup.form.mvi.component;

import com.avito.android.wallet.page.topup.form.mvi.entity.TopUpFormInternalAction;
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

/* compiled from: TopUpFormBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/wallet/page/topup/form/mvi/component/f;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/wallet/page/topup/form/mvi/entity/TopUpFormInternalAction;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements com.avito.android.arch.mvi.b<TopUpFormInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final k f328394a;

    /* compiled from: TopUpFormBootstrap.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/wallet/page/topup/form/mvi/entity/TopUpFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.wallet.page.topup.form.mvi.component.TopUpFormBootstrap$produce$1", f = "TopUpFormBootstrap.kt", i = {0}, l = {16, 18, 17}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TopUpFormInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f328395q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f328396r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = f.this.new a(continuation);
            aVar.f328396r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super TopUpFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0095 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f328395q
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2e
                if (r1 == r4) goto L26
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                kotlin.C42729a0.b(r6)
                goto L96
            L16:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1e:
                java.lang.Object r1 = r5.f328396r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r6)
                goto L5f
            L26:
                java.lang.Object r1 = r5.f328396r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r6)
                goto L46
            L2e:
                kotlin.C42729a0.b(r6)
                java.lang.Object r6 = r5.f328396r
                kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.InterfaceC43172j) r6
                com.avito.android.wallet.page.topup.form.mvi.entity.TopUpFormInternalAction$Loading r1 = new com.avito.android.wallet.page.topup.form.mvi.entity.TopUpFormInternalAction$Loading
                r1.<init>()
                r5.f328396r = r6
                r5.f328395q = r4
                java.lang.Object r1 = r6.emit(r1, r5)
                if (r1 != r0) goto L45
                return r0
            L45:
                r1 = r6
            L46:
                com.avito.android.wallet.page.topup.form.mvi.component.f r6 = com.avito.android.wallet.page.topup.form.mvi.component.f.this
                com.avito.android.wallet.page.topup.form.mvi.component.k r6 = r6.f328394a
                r5.f328396r = r1
                r5.f328395q = r3
                h31.e<aP0.a> r3 = r6.f328409a
                java.lang.Object r3 = r3.get()
                aP0.a r3 = (aP0.InterfaceC19802a) r3
                java.lang.String r6 = r6.f328410b
                java.lang.Object r6 = r3.b(r6, r5)
                if (r6 != r0) goto L5f
                return r0
            L5f:
                com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
                boolean r3 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r3 == 0) goto L73
                com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
                java.lang.Object r6 = r6.getResult()
                com.avito.android.wallet.page.topup.form.remote.dto.TopUpForm r6 = (com.avito.android.wallet.page.topup.form.remote.dto.TopUpForm) r6
                com.avito.android.wallet.page.topup.form.mvi.entity.TopUpFormInternalAction$Content r3 = new com.avito.android.wallet.page.topup.form.mvi.entity.TopUpFormInternalAction$Content
                r3.<init>(r6, r4)
                goto L8a
            L73:
                boolean r3 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto L99
                com.avito.android.remote.model.TypedResult$Error r6 = (com.avito.android.remote.model.TypedResult.Error) r6
                com.avito.android.remote.error.ApiError r3 = r6.getError()
                java.lang.Throwable r6 = r6.getCause()
                com.avito.android.util.ApiException r6 = com.avito.android.util.C35936s.a(r3, r6)
                com.avito.android.wallet.page.topup.form.mvi.entity.TopUpFormInternalAction$Error r3 = new com.avito.android.wallet.page.topup.form.mvi.entity.TopUpFormInternalAction$Error
                r3.<init>(r6)
            L8a:
                r6 = 0
                r5.f328396r = r6
                r5.f328395q = r2
                java.lang.Object r6 = r1.emit(r3, r5)
                if (r6 != r0) goto L96
                return r0
            L96:
                kotlin.G0 r6 = kotlin.G0.f406611a
                return r6
            L99:
                kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.wallet.page.topup.form.mvi.component.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public f(@Y61.k k kVar) {
        this.f328394a = kVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<TopUpFormInternalAction> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
