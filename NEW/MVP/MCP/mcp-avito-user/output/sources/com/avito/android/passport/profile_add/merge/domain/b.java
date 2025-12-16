package com.avito.android.passport.profile_add.merge.domain;

import Y41.p;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.PassportMergeAccountsCloseLink;
import com.avito.android.passport.deeplinks.PassportSelectBusinessVrfLink;
import com.avito.android.passport.network.model.BusinessVerificationDuplicateCreationResult;
import com.avito.android.passport.profile_add.merge.check.mvi.entity.CheckMergePossibilityInternalAction;
import com.avito.android.passport.profile_add.merge.code_confirm.mvi.entity.CodeConfirmInternalAction;
import com.avito.android.passport.profile_add.merge.code_request.mvi.entity.CodeRequestInternalAction;
import com.avito.android.passport.profile_add.merge.domain.k;
import com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.entity.SelectBusinessVrfInternalAction;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35936s;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import l60.InterfaceC43550a;

/* compiled from: PassportAccountsMergeInteractor.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/domain/b;", "Lcom/avito/android/passport/profile_add/merge/domain/a;", "a", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.passport.profile_add.merge.domain.a {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f212994f = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final I50.a f212995a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43550a f212996b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.a f212997c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.passport_lib.h f212998d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final r60.d f212999e;

    /* compiled from: PassportAccountsMergeInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/domain/b$a;", "", "<init>", "()V", "", "REQ_KEY_DUPLICATION_FINISH", "Ljava/lang/String;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PassportAccountsMergeInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/passport/profile_add/merge/check/mvi/entity/CheckMergePossibilityInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.passport.profile_add.merge.domain.PassportAccountsMergeInteractorImpl$checkMergePossibility$1", f = "PassportAccountsMergeInteractor.kt", i = {0}, l = {158, 159, 159}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.passport.profile_add.merge.domain.b$b, reason: collision with other inner class name */
    public static final class C6374b extends SuspendLambda implements p<InterfaceC43172j<? super CheckMergePossibilityInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f213000q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f213001r;

        public C6374b(Continuation<? super C6374b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            C6374b c6374b = b.this.new C6374b(continuation);
            c6374b.f213001r = obj;
            return c6374b;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CheckMergePossibilityInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C6374b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00c3 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f213000q
                com.avito.android.passport.profile_add.merge.domain.b r2 = com.avito.android.passport.profile_add.merge.domain.b.this
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L30
                if (r1 == r5) goto L28
                if (r1 == r4) goto L20
                if (r1 != r3) goto L18
                kotlin.C42729a0.b(r8)
                goto Lc4
            L18:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L20:
                java.lang.Object r1 = r7.f213001r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L5b
            L28:
                java.lang.Object r1 = r7.f213001r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L48
            L30:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f213001r
                kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
                com.avito.android.passport.profile_add.merge.check.mvi.entity.CheckMergePossibilityInternalAction$Loading r1 = new com.avito.android.passport.profile_add.merge.check.mvi.entity.CheckMergePossibilityInternalAction$Loading
                r1.<init>()
                r7.f213001r = r8
                r7.f213000q = r5
                java.lang.Object r1 = r8.emit(r1, r7)
                if (r1 != r0) goto L47
                return r0
            L47:
                r1 = r8
            L48:
                l60.a r8 = r2.f212996b
                r60.d r6 = r2.f212999e
                java.lang.String r6 = r6.get()
                r7.f213001r = r1
                r7.f213000q = r4
                java.lang.Object r8 = r8.d(r6, r7)
                if (r8 != r0) goto L5b
                return r0
            L5b:
                com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
                boolean r4 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
                r6 = 0
                if (r4 == 0) goto L99
                com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
                java.lang.Object r8 = r8.getResult()
                com.avito.android.passport_lib.generated.api.check_accounts_mergeability_api_v_3.a r8 = (com.avito.android.passport_lib.generated.api.check_accounts_mergeability_api_v_3.a) r8
                int r4 = com.avito.android.passport.profile_add.merge.domain.b.f212994f
                r2.getClass()
                boolean r4 = r8 instanceof com.avito.android.passport_lib.generated.api.check_accounts_mergeability_api_v_3.a.C6414a
                if (r4 == 0) goto L7f
                com.avito.android.passport.profile_add.merge.check.mvi.entity.CheckMergePossibilityInternalAction$OpenDeepLink r2 = new com.avito.android.passport.profile_add.merge.check.mvi.entity.CheckMergePossibilityInternalAction$OpenDeepLink
                com.avito.android.passport_lib.generated.api.check_accounts_mergeability_api_v_3.a$a r8 = (com.avito.android.passport_lib.generated.api.check_accounts_mergeability_api_v_3.a.C6414a) r8
                com.avito.android.deep_linking.links.DeepLink r8 = r8.getNextStepLink()
                r2.<init>(r8)
                goto Lb9
            L7f:
                boolean r8 = r8 instanceof com.avito.android.passport_lib.generated.api.check_accounts_mergeability_api_v_3.a.b
                if (r8 == 0) goto L93
                r60.d r8 = r2.f212999e
                r8.delete()
                com.avito.android.passport.profile_add.merge.check.mvi.entity.CheckMergePossibilityInternalAction$OpenDeepLink r2 = new com.avito.android.passport.profile_add.merge.check.mvi.entity.CheckMergePossibilityInternalAction$OpenDeepLink
                com.avito.android.deep_linking.links.PassportMergeAccountsCloseLink r8 = new com.avito.android.deep_linking.links.PassportMergeAccountsCloseLink
                r8.<init>(r6, r5, r6)
                r2.<init>(r8)
                goto Lb9
            L93:
                kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                r8.<init>()
                throw r8
            L99:
                boolean r2 = r8 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r2 == 0) goto Lc7
                com.avito.android.remote.model.TypedResult$Error r8 = (com.avito.android.remote.model.TypedResult.Error) r8
                com.avito.android.remote.error.ApiError r2 = r8.getError()
                java.lang.Throwable r8 = r8.getCause()
                com.avito.android.util.ApiException r8 = com.avito.android.util.C35936s.a(r2, r8)
                com.avito.android.passport.profile_add.merge.check.mvi.entity.CheckMergePossibilityInternalAction$UnknownError r2 = new com.avito.android.passport.profile_add.merge.check.mvi.entity.CheckMergePossibilityInternalAction$UnknownError
                com.avito.android.analytics.screens.J$a r4 = new com.avito.android.analytics.screens.J$a
                com.avito.android.remote.error.ApiError r8 = com.avito.android.error.z.n(r8)
                r4.<init>(r8)
                r2.<init>(r4)
            Lb9:
                r7.f213001r = r6
                r7.f213000q = r3
                java.lang.Object r8 = r1.emit(r2, r7)
                if (r8 != r0) goto Lc4
                return r0
            Lc4:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            Lc7:
                kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.passport.profile_add.merge.domain.b.C6374b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: PassportAccountsMergeInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.passport.profile_add.merge.domain.PassportAccountsMergeInteractorImpl$confirmBusinessVerificationDuplication$1", f = "PassportAccountsMergeInteractor.kt", i = {0}, l = {283, 285, 292}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class c extends SuspendLambda implements p<InterfaceC43172j<? super SelectBusinessVrfInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f213003q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f213004r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f213006t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i12, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f213006t = i12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = b.this.new c(this.f213006t, continuation);
            cVar.f213004r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super SelectBusinessVrfInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f213003q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f213004r;
                I50.a aVar = b.this.f212995a;
                this.f213004r = interfaceC43172j;
                this.f213003q = 1;
                obj = aVar.c(this.f213006t, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2 && i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f213004r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                SelectBusinessVrfInternalAction.OpenDeepLink openDeepLink = new SelectBusinessVrfInternalAction.OpenDeepLink(((BusinessVerificationDuplicateCreationResult) ((TypedResult.Success) typedResult).getResult()).getNextStepLink(), "REQ_KEY_DUPLICATION_FINISH");
                this.f213004r = null;
                this.f213003q = 2;
                if (interfaceC43172j.emit(openDeepLink, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                TypedResult.Error error = (TypedResult.Error) typedResult;
                SelectBusinessVrfInternalAction.LoadingError loadingError = new SelectBusinessVrfInternalAction.LoadingError(C35936s.a(error.getError(), error.getCause()));
                this.f213004r = null;
                this.f213003q = 3;
                if (interfaceC43172j.emit(loadingError, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PassportAccountsMergeInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/passport/profile_add/merge/code_confirm/mvi/entity/CodeConfirmInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.passport.profile_add.merge.domain.PassportAccountsMergeInteractorImpl$confirmCode$1", f = "PassportAccountsMergeInteractor.kt", i = {1, 2, 3, 4, 5}, l = {125, 128, 130, 135, 140, 147, 153}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0"})
    public static final class d extends SuspendLambda implements p<InterfaceC43172j<? super CodeConfirmInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f213007q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f213008r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f213009s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ b f213010t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f213011u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, b bVar, String str2, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f213009s = str;
            this.f213010t = bVar;
            this.f213011u = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = new d(this.f213009s, this.f213010t, this.f213011u, continuation);
            dVar.f213008r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CodeConfirmInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0088 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x008f A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:8:0x0020, B:15:0x0036, B:33:0x0089, B:35:0x008f, B:37:0x009e, B:39:0x00ad, B:41:0x00c2, B:40:0x00bd, B:44:0x00ce, B:46:0x00d2, B:48:0x00de, B:51:0x00f9, B:53:0x00fd, B:30:0x0073), top: B:61:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00bd A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:8:0x0020, B:15:0x0036, B:33:0x0089, B:35:0x008f, B:37:0x009e, B:39:0x00ad, B:41:0x00c2, B:40:0x00bd, B:44:0x00ce, B:46:0x00d2, B:48:0x00de, B:51:0x00f9, B:53:0x00fd, B:30:0x0073), top: B:61:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00ce A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:8:0x0020, B:15:0x0036, B:33:0x0089, B:35:0x008f, B:37:0x009e, B:39:0x00ad, B:41:0x00c2, B:40:0x00bd, B:44:0x00ce, B:46:0x00d2, B:48:0x00de, B:51:0x00f9, B:53:0x00fd, B:30:0x0073), top: B:61:0x000c }] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.flow.j] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 308
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.passport.profile_add.merge.domain.b.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: PassportAccountsMergeInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.passport.profile_add.merge.domain.PassportAccountsMergeInteractorImpl$requestCode$1", f = "PassportAccountsMergeInteractor.kt", i = {1, 2, 3, 4}, l = {94, 97, 100, 114, 115, 118}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0"})
    public static final class e extends SuspendLambda implements p<InterfaceC43172j<? super CodeRequestInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f213012q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f213013r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f213014s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ b f213015t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(b bVar, String str, Continuation continuation) {
            super(2, continuation);
            this.f213014s = str;
            this.f213015t = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = new e(this.f213015t, this.f213014s, continuation);
            eVar.f213013r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CodeRequestInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x008d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0094 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:8:0x001f, B:14:0x0030, B:32:0x008e, B:34:0x0094, B:36:0x00a0, B:43:0x00f1, B:48:0x0101, B:50:0x0105, B:52:0x0114, B:54:0x0123, B:56:0x0138, B:55:0x0133, B:59:0x0144, B:61:0x0148, B:37:0x00b4, B:39:0x00b8, B:40:0x00e6, B:42:0x00ea, B:44:0x00f7, B:45:0x00fc, B:46:0x00fd, B:64:0x0160, B:65:0x0165, B:29:0x006e), top: B:71:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00fd A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:8:0x001f, B:14:0x0030, B:32:0x008e, B:34:0x0094, B:36:0x00a0, B:43:0x00f1, B:48:0x0101, B:50:0x0105, B:52:0x0114, B:54:0x0123, B:56:0x0138, B:55:0x0133, B:59:0x0144, B:61:0x0148, B:37:0x00b4, B:39:0x00b8, B:40:0x00e6, B:42:0x00ea, B:44:0x00f7, B:45:0x00fc, B:46:0x00fd, B:64:0x0160, B:65:0x0165, B:29:0x006e), top: B:71:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0105 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:8:0x001f, B:14:0x0030, B:32:0x008e, B:34:0x0094, B:36:0x00a0, B:43:0x00f1, B:48:0x0101, B:50:0x0105, B:52:0x0114, B:54:0x0123, B:56:0x0138, B:55:0x0133, B:59:0x0144, B:61:0x0148, B:37:0x00b4, B:39:0x00b8, B:40:0x00e6, B:42:0x00ea, B:44:0x00f7, B:45:0x00fc, B:46:0x00fd, B:64:0x0160, B:65:0x0165, B:29:0x006e), top: B:71:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0133 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:8:0x001f, B:14:0x0030, B:32:0x008e, B:34:0x0094, B:36:0x00a0, B:43:0x00f1, B:48:0x0101, B:50:0x0105, B:52:0x0114, B:54:0x0123, B:56:0x0138, B:55:0x0133, B:59:0x0144, B:61:0x0148, B:37:0x00b4, B:39:0x00b8, B:40:0x00e6, B:42:0x00ea, B:44:0x00f7, B:45:0x00fc, B:46:0x00fd, B:64:0x0160, B:65:0x0165, B:29:0x006e), top: B:71:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0144 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:8:0x001f, B:14:0x0030, B:32:0x008e, B:34:0x0094, B:36:0x00a0, B:43:0x00f1, B:48:0x0101, B:50:0x0105, B:52:0x0114, B:54:0x0123, B:56:0x0138, B:55:0x0133, B:59:0x0144, B:61:0x0148, B:37:0x00b4, B:39:0x00b8, B:40:0x00e6, B:42:0x00ea, B:44:0x00f7, B:45:0x00fc, B:46:0x00fd, B:64:0x0160, B:65:0x0165, B:29:0x006e), top: B:71:0x000b }] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.flow.j] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 396
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.passport.profile_add.merge.domain.b.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: PassportAccountsMergeInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/passport/profile_add/merge/code_request/mvi/entity/CodeRequestInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.passport.profile_add.merge.domain.PassportAccountsMergeInteractorImpl$requestPhoneHint$1", f = "PassportAccountsMergeInteractor.kt", i = {0, 1}, l = {70, 71, 76, 82, 87}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class f extends SuspendLambda implements p<InterfaceC43172j<? super CodeRequestInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f213016q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f213017r;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = b.this.new f(continuation);
            fVar.f213017r = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CodeRequestInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.f213016q
                com.avito.android.passport.profile_add.merge.domain.b r2 = com.avito.android.passport.profile_add.merge.domain.b.this
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                if (r1 == 0) goto L37
                if (r1 == r7) goto L2f
                if (r1 == r6) goto L27
                if (r1 == r5) goto L22
                if (r1 == r4) goto L22
                if (r1 != r3) goto L1a
                goto L22
            L1a:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L22:
                kotlin.C42729a0.b(r10)
                goto Lcb
            L27:
                java.lang.Object r1 = r9.f213017r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L62
            L2f:
                java.lang.Object r1 = r9.f213017r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L4f
            L37:
                kotlin.C42729a0.b(r10)
                java.lang.Object r10 = r9.f213017r
                kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.InterfaceC43172j) r10
                com.avito.android.passport.profile_add.merge.code_request.mvi.entity.CodeRequestInternalAction$Loading r1 = new com.avito.android.passport.profile_add.merge.code_request.mvi.entity.CodeRequestInternalAction$Loading
                r1.<init>()
                r9.f213017r = r10
                r9.f213016q = r7
                java.lang.Object r1 = r10.emit(r1, r9)
                if (r1 != r0) goto L4e
                return r0
            L4e:
                r1 = r10
            L4f:
                l60.a r10 = r2.f212996b
                r60.d r8 = r2.f212999e
                java.lang.String r8 = r8.get()
                r9.f213017r = r1
                r9.f213016q = r6
                java.lang.Object r10 = r10.a(r8, r9)
                if (r10 != r0) goto L62
                return r0
            L62:
                com.avito.android.remote.model.TypedResult r10 = (com.avito.android.remote.model.TypedResult) r10
                boolean r6 = r10 instanceof com.avito.android.remote.model.TypedResult.Success
                r8 = 0
                if (r6 == 0) goto La9
                com.avito.android.remote.model.TypedResult$Success r10 = (com.avito.android.remote.model.TypedResult.Success) r10
                java.lang.Object r10 = r10.getResult()
                m60.a r10 = (m60.InterfaceC43891a) r10
                boolean r3 = r10 instanceof m60.InterfaceC43891a.C11815a
                if (r3 == 0) goto L8b
                com.avito.android.passport.profile_add.merge.code_request.mvi.entity.CodeRequestInternalAction$ShowContent r2 = new com.avito.android.passport.profile_add.merge.code_request.mvi.entity.CodeRequestInternalAction$ShowContent
                m60.a$a r10 = (m60.InterfaceC43891a.C11815a) r10
                com.avito.android.remote.model.text.AttributedText r10 = r10.getDescription()
                r2.<init>(r10)
                r9.f213017r = r8
                r9.f213016q = r5
                java.lang.Object r10 = r1.emit(r2, r9)
                if (r10 != r0) goto Lcb
                return r0
            L8b:
                boolean r10 = r10 instanceof m60.InterfaceC43891a.b
                if (r10 == 0) goto Lcb
                r60.d r10 = r2.f212999e
                r10.delete()
                com.avito.android.passport.profile_add.merge.code_request.mvi.entity.CodeRequestInternalAction$DeepLinkAction r10 = new com.avito.android.passport.profile_add.merge.code_request.mvi.entity.CodeRequestInternalAction$DeepLinkAction
                com.avito.android.deep_linking.links.PassportMergeAccountsCloseLink r2 = new com.avito.android.deep_linking.links.PassportMergeAccountsCloseLink
                r2.<init>(r8, r7, r8)
                r10.<init>(r2)
                r9.f213017r = r8
                r9.f213016q = r4
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto Lcb
                return r0
            La9:
                boolean r2 = r10 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r2 == 0) goto Lce
                com.avito.android.remote.model.TypedResult$Error r10 = (com.avito.android.remote.model.TypedResult.Error) r10
                com.avito.android.remote.error.ApiError r2 = r10.getError()
                java.lang.Throwable r10 = r10.getCause()
                com.avito.android.util.ApiException r10 = com.avito.android.util.C35936s.a(r2, r10)
                com.avito.android.passport.profile_add.merge.code_request.mvi.entity.CodeRequestInternalAction$ContentError r2 = new com.avito.android.passport.profile_add.merge.code_request.mvi.entity.CodeRequestInternalAction$ContentError
                r2.<init>(r10)
                r9.f213017r = r8
                r9.f213016q = r3
                java.lang.Object r10 = r1.emit(r2, r9)
                if (r10 != r0) goto Lcb
                return r0
            Lcb:
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            Lce:
                kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
                r10.<init>()
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.passport.profile_add.merge.domain.b.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new a(null);
    }

    @Inject
    public b(@Y61.k I50.a aVar, @Y61.k InterfaceC43550a interfaceC43550a, @Y61.k com.avito.android.server_time.a aVar2, @Y61.k com.avito.android.passport_lib.h hVar, @Y61.k r60.d dVar) {
        this.f212995a = aVar;
        this.f212996b = interfaceC43550a;
        this.f212997c = aVar2;
        this.f212998d = hVar;
        this.f212999e = dVar;
    }

    public static final CodeRequestInternalAction i(b bVar, k kVar, String str) {
        bVar.getClass();
        if (kVar instanceof k.c) {
            return new CodeRequestInternalAction.CodeRequested(str, ((k.c) kVar).f213049a);
        }
        if (kVar instanceof k.a) {
            return new CodeRequestInternalAction.DeepLinkAction(((k.a) kVar).f213047a);
        }
        if (kVar instanceof k.b) {
            return new CodeRequestInternalAction.DeepLinkAction(new PassportMergeAccountsCloseLink(null, 1, null));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.avito.android.passport.profile_add.merge.domain.a
    @Y61.k
    public final C43152f0 a(@Y61.k MergeFlow mergeFlow) {
        return new C43152f0(C43175k.G(new com.avito.android.passport.profile_add.merge.domain.e(this, mergeFlow, null)), new com.avito.android.passport.profile_add.merge.domain.f(3, null));
    }

    @Override // com.avito.android.passport.profile_add.merge.domain.a
    @Y61.k
    public final C43152f0 b(@Y61.k PassportSelectBusinessVrfLink.Flow flow) {
        return new C43152f0(C43175k.G(new com.avito.android.passport.profile_add.merge.domain.c(flow, this, null)), new com.avito.android.passport.profile_add.merge.domain.d(3, null));
    }

    @Override // com.avito.android.passport.profile_add.merge.domain.a
    @Y61.k
    public final InterfaceC43160i<CodeConfirmInternalAction> c(@Y61.k String str, @Y61.k String str2) {
        return C43175k.G(new d(str2, this, str, null));
    }

    @Override // com.avito.android.passport.profile_add.merge.domain.a
    @Y61.k
    public final C43152f0 d(@l String str) {
        return new C43152f0(C43175k.G(new g(this, str, null)), new h(3, null));
    }

    @Override // com.avito.android.passport.profile_add.merge.domain.a
    @Y61.k
    public final InterfaceC43160i<CheckMergePossibilityInternalAction> e() {
        return C43175k.G(new C6374b(null));
    }

    @Override // com.avito.android.passport.profile_add.merge.domain.a
    @Y61.k
    public final InterfaceC43160i<SelectBusinessVrfInternalAction> f(int i12) {
        return C43175k.G(new c(i12, null));
    }

    @Override // com.avito.android.passport.profile_add.merge.domain.a
    @Y61.k
    public final InterfaceC43160i<CodeRequestInternalAction> g(@Y61.k String str) {
        return C43175k.G(new e(this, str, null));
    }

    @Override // com.avito.android.passport.profile_add.merge.domain.a
    @Y61.k
    public final InterfaceC43160i<CodeRequestInternalAction> h() {
        return C43175k.G(new f(null));
    }
}
