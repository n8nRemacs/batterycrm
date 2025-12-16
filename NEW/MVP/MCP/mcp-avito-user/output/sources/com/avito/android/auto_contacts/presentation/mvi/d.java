package com.avito.android.auto_contacts.presentation.mvi;

import Y41.p;
import Y41.q;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.auto_contacts.presentation.mvi.entity.AutoContactsPackagesInternalAction;
import com.avito.android.error.z;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AutoContactsPackagesBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/auto_contacts/presentation/mvi/d;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/auto_contacts/presentation/mvi/entity/AutoContactsPackagesInternalAction;", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements com.avito.android.arch.mvi.b<AutoContactsPackagesInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.auto_contacts.domain.b f94940a;

    /* compiled from: AutoContactsPackagesBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/auto_contacts/presentation/mvi/entity/AutoContactsPackagesInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.auto_contacts.presentation.mvi.AutoContactsPackagesBootstrap$produce$1", f = "AutoContactsPackagesBootstrap.kt", i = {0, 1}, l = {20, 21, 22}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super AutoContactsPackagesInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f94941q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f94942r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = d.this.new a(continuation);
            aVar.f94942r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AutoContactsPackagesInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0094 A[RETURN] */
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
                int r1 = r6.f94941q
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2e
                if (r1 == r4) goto L26
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                kotlin.C42729a0.b(r7)
                goto L95
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                java.lang.Object r1 = r6.f94942r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L55
            L26:
                java.lang.Object r1 = r6.f94942r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L46
            L2e:
                kotlin.C42729a0.b(r7)
                java.lang.Object r7 = r6.f94942r
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
                com.avito.android.auto_contacts.presentation.mvi.entity.AutoContactsPackagesInternalAction$ContentLoadingStarted r1 = new com.avito.android.auto_contacts.presentation.mvi.entity.AutoContactsPackagesInternalAction$ContentLoadingStarted
                r1.<init>()
                r6.f94942r = r7
                r6.f94941q = r4
                java.lang.Object r1 = r7.emit(r1, r6)
                if (r1 != r0) goto L45
                return r0
            L45:
                r1 = r7
            L46:
                com.avito.android.auto_contacts.presentation.mvi.d r7 = com.avito.android.auto_contacts.presentation.mvi.d.this
                com.avito.android.auto_contacts.domain.b r7 = r7.f94940a
                r6.f94942r = r1
                r6.f94941q = r3
                java.lang.Object r7 = r7.a(r6)
                if (r7 != r0) goto L55
                return r0
            L55:
                com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
                boolean r3 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r3 == 0) goto L69
                com.avito.android.auto_contacts.presentation.mvi.entity.AutoContactsPackagesInternalAction$ContentLoaded r3 = new com.avito.android.auto_contacts.presentation.mvi.entity.AutoContactsPackagesInternalAction$ContentLoaded
                com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
                java.lang.Object r7 = r7.getResult()
                com.avito.android.auto_contacts.domain.models.AutoContactsPackagesState r7 = (com.avito.android.auto_contacts.domain.models.AutoContactsPackagesState) r7
                r3.<init>(r7)
                goto L89
            L69:
                boolean r3 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto L98
                com.avito.android.auto_contacts.presentation.mvi.entity.AutoContactsPackagesInternalAction$ErrorOccurred r3 = new com.avito.android.auto_contacts.presentation.mvi.entity.AutoContactsPackagesInternalAction$ErrorOccurred
                com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
                com.avito.android.remote.error.ApiError r4 = r7.getError()
                java.lang.String r4 = r4.getF244063c()
                com.avito.android.analytics.screens.J$a$a r5 = com.avito.android.analytics.screens.J.a.f90383b
                com.avito.android.remote.error.ApiError r7 = r7.getError()
                r5.getClass()
                com.avito.android.analytics.screens.J$a r7 = com.avito.android.analytics.screens.J.a.C2676a.b(r7)
                r3.<init>(r7, r4)
            L89:
                r7 = 0
                r6.f94942r = r7
                r6.f94941q = r2
                java.lang.Object r7 = r1.emit(r3, r6)
                if (r7 != r0) goto L95
                return r0
            L95:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            L98:
                kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.auto_contacts.presentation.mvi.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: AutoContactsPackagesBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/auto_contacts/presentation/mvi/entity/AutoContactsPackagesInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.auto_contacts.presentation.mvi.AutoContactsPackagesBootstrap$produce$2", f = "AutoContactsPackagesBootstrap.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements q<InterfaceC43172j<? super AutoContactsPackagesInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f94944q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f94945r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f94946s;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super AutoContactsPackagesInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f94945r = interfaceC43172j;
            bVar.f94946s = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f94944q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f94945r;
                Throwable th2 = this.f94946s;
                String strL = z.l(th2);
                J.a.f90383b.getClass();
                AutoContactsPackagesInternalAction.ErrorOccurred errorOccurred = new AutoContactsPackagesInternalAction.ErrorOccurred(J.a.C2676a.c(th2), strL);
                this.f94945r = null;
                this.f94944q = 1;
                if (interfaceC43172j.emit(errorOccurred, this) == coroutine_suspended) {
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

    @Inject
    public d(@Y61.k com.avito.android.auto_contacts.domain.b bVar) {
        this.f94940a = bVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<AutoContactsPackagesInternalAction> a() {
        return new C43152f0(C43175k.G(new a(null)), new b(3, null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
