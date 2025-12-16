package com.avito.android.email.email_confirmation.mvi;

import Gy.InterfaceC13928a;
import Y41.p;
import com.avito.android.account.G;
import com.avito.android.email.email_confirmation.mvi.entity.EmailConfirmationInternalAction;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.util.R0;
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

/* compiled from: EmailConfirmationBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/email/email_confirmation/mvi/c;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/email/email_confirmation/mvi/entity/EmailConfirmationInternalAction;", "_avito_email_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements com.avito.android.arch.mvi.b<EmailConfirmationInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f147122a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f147123b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13928a f147124c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34401z0 f147125d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final G f147126e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final R0 f147127f;

    /* compiled from: EmailConfirmationBootstrap.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/email/email_confirmation/mvi/entity/EmailConfirmationInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.email.email_confirmation.mvi.EmailConfirmationBootstrap$produce$1", f = "EmailConfirmationBootstrap.kt", i = {0, 1, 2}, l = {31, 34, 38, 43, 46, 49}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super EmailConfirmationInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f147128q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f147129r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = c.this.new a(continuation);
            aVar.f147129r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super EmailConfirmationInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
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
                int r1 = r6.f147128q
                r2 = 0
                com.avito.android.email.email_confirmation.mvi.c r3 = com.avito.android.email.email_confirmation.mvi.c.this
                switch(r1) {
                    case 0: goto L3b;
                    case 1: goto L33;
                    case 2: goto L2b;
                    case 3: goto L23;
                    case 4: goto L19;
                    case 5: goto L14;
                    case 6: goto L14;
                    default: goto Lc;
                }
            Lc:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L14:
                kotlin.C42729a0.b(r7)
                goto Lc6
            L19:
                java.lang.Object r1 = r6.f147129r
                r3 = r1
                com.avito.android.email.email_confirmation.mvi.c r3 = (com.avito.android.email.email_confirmation.mvi.c) r3
                kotlin.C42729a0.b(r7)
                goto L97
            L23:
                java.lang.Object r1 = r6.f147129r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L7e
            L2b:
                java.lang.Object r1 = r6.f147129r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L6a
            L33:
                java.lang.Object r1 = r6.f147129r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L51
            L3b:
                kotlin.C42729a0.b(r7)
                java.lang.Object r7 = r6.f147129r
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
                com.avito.android.email.email_confirmation.mvi.entity.EmailConfirmationInternalAction$ConfirmationStarted r1 = com.avito.android.email.email_confirmation.mvi.entity.EmailConfirmationInternalAction.ConfirmationStarted.f147142b
                r6.f147129r = r7
                r4 = 1
                r6.f147128q = r4
                java.lang.Object r1 = r7.emit(r1, r6)
                if (r1 != r0) goto L50
                return r0
            L50:
                r1 = r7
            L51:
                boolean r7 = r3.f147122a
                java.lang.String r4 = r3.f147123b
                Gy.a r5 = r3.f147124c
                if (r7 == 0) goto L6d
                Jy.b r7 = new Jy.b
                r7.<init>(r4)
                r6.f147129r = r1
                r4 = 2
                r6.f147128q = r4
                java.lang.Object r7 = r5.c(r7, r6)
                if (r7 != r0) goto L6a
                return r0
            L6a:
                com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
                goto L80
            L6d:
                Hy.b r7 = new Hy.b
                r7.<init>(r4)
                r6.f147129r = r1
                r4 = 3
                r6.f147128q = r4
                java.lang.Object r7 = r5.b(r7, r6)
                if (r7 != r0) goto L7e
                return r0
            L7e:
                com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
            L80:
                boolean r4 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r4 == 0) goto La7
                com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
                r7.getResult()
                com.avito.android.email.email_confirmation.mvi.entity.EmailConfirmationInternalAction$ConfirmationSuccessfullyFinished r7 = com.avito.android.email.email_confirmation.mvi.entity.EmailConfirmationInternalAction.ConfirmationSuccessfullyFinished.f147143b
                r6.f147129r = r3
                r4 = 4
                r6.f147128q = r4
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L97
                return r0
            L97:
                boolean r7 = r3.f147122a
                if (r7 == 0) goto Lc6
                r6.f147129r = r2
                r7 = 5
                r6.f147128q = r7
                java.lang.Object r7 = com.avito.android.email.email_confirmation.mvi.c.c(r3, r6)
                if (r7 != r0) goto Lc6
                return r0
            La7:
                boolean r3 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto Lc9
                com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
                com.avito.android.remote.error.ApiError r3 = r7.getError()
                java.lang.Throwable r7 = r7.getCause()
                com.avito.android.util.C35936s.a(r3, r7)
                com.avito.android.email.email_confirmation.mvi.entity.EmailConfirmationInternalAction$ConfirmationFailed r7 = com.avito.android.email.email_confirmation.mvi.entity.EmailConfirmationInternalAction.ConfirmationFailed.f147141b
                r6.f147129r = r2
                r2 = 6
                r6.f147128q = r2
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto Lc6
                return r0
            Lc6:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            Lc9:
                kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.email.email_confirmation.mvi.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public c(boolean z12, @Y61.k String str, @Y61.k InterfaceC13928a interfaceC13928a, @Y61.k InterfaceC34401z0 interfaceC34401z0, @Y61.k G g12, @Y61.k R0 r02) {
        this.f147122a = z12;
        this.f147123b = str;
        this.f147124c = interfaceC13928a;
        this.f147125d = interfaceC34401z0;
        this.f147126e = g12;
        this.f147127f = r02;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.email.email_confirmation.mvi.c r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof com.avito.android.email.email_confirmation.mvi.d
            if (r0 == 0) goto L13
            r0 = r8
            com.avito.android.email.email_confirmation.mvi.d r0 = (com.avito.android.email.email_confirmation.mvi.d) r0
            int r1 = r0.f147134t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f147134t = r1
            goto L18
        L13:
            com.avito.android.email.email_confirmation.mvi.d r0 = new com.avito.android.email.email_confirmation.mvi.d
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f147132r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f147134t
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L3c
            if (r2 == r3) goto L36
            if (r2 != r4) goto L2e
            kotlin.C42729a0.b(r8)     // Catch: java.lang.Throwable -> L2c
            goto L79
        L2c:
            r7 = move-exception
            goto L81
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            com.avito.android.email.email_confirmation.mvi.c r7 = r0.f147131q
            kotlin.C42729a0.b(r8)     // Catch: java.lang.Throwable -> L2c
            goto L50
        L3c:
            kotlin.C42729a0.b(r8)
            com.avito.android.remote.z0 r8 = r7.f147125d     // Catch: java.lang.Throwable -> L2c
            io.reactivex.rxjava3.core.I r8 = r8.o()     // Catch: java.lang.Throwable -> L2c
            r0.f147131q = r7     // Catch: java.lang.Throwable -> L2c
            r0.f147134t = r3     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r8 = kotlinx.coroutines.rx3.C43292o.b(r8, r0)     // Catch: java.lang.Throwable -> L2c
            if (r8 != r1) goto L50
            goto L8f
        L50:
            com.avito.android.remote.model.ProfileShort r8 = (com.avito.android.remote.model.ProfileShort) r8     // Catch: java.lang.Throwable -> L2c
            com.avito.android.account.G r7 = r7.f147126e     // Catch: java.lang.Throwable -> L2c
            com.avito.android.remote.model.ProfileInfo r2 = new com.avito.android.remote.model.ProfileInfo     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = r8.getUserId()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r5 = r8.getUserHashId()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r6 = r8.getName()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r8 = r8.getEmail()     // Catch: java.lang.Throwable -> L2c
            r2.<init>(r3, r5, r6, r8)     // Catch: java.lang.Throwable -> L2c
            r8 = 0
            io.reactivex.rxjava3.internal.operators.completable.g r7 = r7.h(r2, r8)     // Catch: java.lang.Throwable -> L2c
            r0.f147131q = r8     // Catch: java.lang.Throwable -> L2c
            r0.f147134t = r4     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r7 = kotlinx.coroutines.rx3.C43292o.a(r7, r0)     // Catch: java.lang.Throwable -> L2c
            if (r7 != r1) goto L79
            goto L8f
        L79:
            kotlin.G0 r7 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L2c
            com.avito.android.arch.mvi.utils.c$c r8 = new com.avito.android.arch.mvi.utils.c$c     // Catch: java.lang.Throwable -> L2c
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L2c
            goto L8d
        L81:
            kotlin.coroutines.CoroutineContext r8 = r0.getF411960f()
            kotlinx.coroutines.Q0.e(r8)
            com.avito.android.arch.mvi.utils.c$b r8 = new com.avito.android.arch.mvi.utils.c$b
            r8.<init>(r7)
        L8d:
            kotlin.G0 r1 = kotlin.G0.f406611a
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.email.email_confirmation.mvi.c.c(com.avito.android.email.email_confirmation.mvi.c, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<EmailConfirmationInternalAction> a() {
        return C43175k.I(this.f147127f.a(), C43175k.G(new a(null)));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
