package com.avito.android.passport.auth_suggest.mvi;

import Y41.p;
import androidx.compose.runtime.internal.P;
import com.avito.android.passport.auth_suggest.PassportAuthSuggestOpenParams;
import com.avito.android.passport.auth_suggest.entity.PassportAuthSuggestInternalAction;
import java.util.Set;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PassportAuthSuggestBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/auth_suggest/mvi/d;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/passport/auth_suggest/entity/PassportAuthSuggestInternalAction;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements com.avito.android.arch.mvi.b<PassportAuthSuggestInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final PassportAuthSuggestOpenParams f211028a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final I50.a f211029b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Set<String> f211030c;

    /* compiled from: PassportAuthSuggestBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/passport/auth_suggest/entity/PassportAuthSuggestInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.passport.auth_suggest.mvi.PassportAuthSuggestBootstrap$produce$1", f = "PassportAuthSuggestBootstrap.kt", i = {0, 1}, l = {21, 22, 30, 36}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super PassportAuthSuggestInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f211031q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f211032r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = d.this.new a(continuation);
            aVar.f211032r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super PassportAuthSuggestInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r12.f211031q
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
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1d:
                kotlin.C42729a0.b(r13)
                goto La7
            L22:
                java.lang.Object r1 = r12.f211032r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r13)
                goto L6a
            L2a:
                java.lang.Object r1 = r12.f211032r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r13)
                goto L4a
            L32:
                kotlin.C42729a0.b(r13)
                java.lang.Object r13 = r12.f211032r
                kotlinx.coroutines.flow.j r13 = (kotlinx.coroutines.flow.InterfaceC43172j) r13
                com.avito.android.passport.auth_suggest.entity.PassportAuthSuggestInternalAction$LoadingStarted r1 = new com.avito.android.passport.auth_suggest.entity.PassportAuthSuggestInternalAction$LoadingStarted
                r1.<init>()
                r12.f211032r = r13
                r12.f211031q = r5
                java.lang.Object r1 = r13.emit(r1, r12)
                if (r1 != r0) goto L49
                return r0
            L49:
                r1 = r13
            L4a:
                com.avito.android.passport.auth_suggest.mvi.d r13 = com.avito.android.passport.auth_suggest.mvi.d.this
                I50.a r5 = r13.f211029b
                java.util.Set<java.lang.String> r6 = r13.f211030c
                java.lang.String r6 = ZS.d.a(r6)
                com.avito.android.passport.auth_suggest.PassportAuthSuggestOpenParams r13 = r13.f211028a
                java.lang.String r8 = r13.f210941b
                r12.f211032r = r1
                r12.f211031q = r4
                java.lang.String r7 = "contract=Avito; platform=Android; version=26.0"
                java.lang.String r9 = r13.f210942c
                java.lang.String r10 = r13.f210943d
                r11 = r12
                java.lang.Object r13 = r5.d(r6, r7, r8, r9, r10, r11)
                if (r13 != r0) goto L6a
                return r0
            L6a:
                com.avito.android.remote.model.TypedResult r13 = (com.avito.android.remote.model.TypedResult) r13
                boolean r4 = r13 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r4 == 0) goto L8d
                com.avito.android.passport.auth_suggest.entity.PassportAuthSuggestInternalAction$ContentLoaded r2 = new com.avito.android.passport.auth_suggest.entity.PassportAuthSuggestInternalAction$ContentLoaded
                com.avito.android.remote.model.TypedResult$Success r13 = (com.avito.android.remote.model.TypedResult.Success) r13
                java.lang.Object r13 = r13.getResult()
                com.google.gson.k r13 = (com.google.gson.k) r13
                java.lang.String r13 = r13.toString()
                r2.<init>(r13)
                r12.f211032r = r5
                r12.f211031q = r3
                java.lang.Object r13 = r1.emit(r2, r12)
                if (r13 != r0) goto La7
                return r0
            L8d:
                boolean r3 = r13 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto La7
                com.avito.android.passport.auth_suggest.entity.PassportAuthSuggestInternalAction$Error r3 = new com.avito.android.passport.auth_suggest.entity.PassportAuthSuggestInternalAction$Error
                com.avito.android.remote.model.TypedResult$Error r13 = (com.avito.android.remote.model.TypedResult.Error) r13
                com.avito.android.remote.error.ApiError r13 = r13.getError()
                r3.<init>(r13)
                r12.f211032r = r5
                r12.f211031q = r2
                java.lang.Object r13 = r1.emit(r3, r12)
                if (r13 != r0) goto La7
                return r0
            La7:
                kotlin.G0 r13 = kotlin.G0.f406611a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.passport.auth_suggest.mvi.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public d(@Y61.k PassportAuthSuggestOpenParams passportAuthSuggestOpenParams, @Y61.k I50.a aVar, @Y61.k Set<String> set) {
        this.f211028a = passportAuthSuggestOpenParams;
        this.f211029b = aVar;
        this.f211030c = set;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<PassportAuthSuggestInternalAction> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
