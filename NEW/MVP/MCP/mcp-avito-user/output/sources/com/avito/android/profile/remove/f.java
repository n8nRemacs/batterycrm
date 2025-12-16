package com.avito.android.profile.remove;

import Y41.p;
import Y41.q;
import com.avito.android.profile.remove.analytics.ProfileRemoveAnalytics;
import com.avito.android.profile.remove.mvi.entity.ProfileRemoveInternalAction;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ProfileRemoveInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/remove/f;", "Lcom/avito/android/profile/remove/e;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34401z0 f223921a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f223922b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ProfileRemoveAnalytics f223923c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f223924d;

    /* compiled from: ProfileRemoveInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.remove.ProfileRemoveInteractorImpl$loadRemoveScreen$1", f = "ProfileRemoveInteractor.kt", i = {0, 1}, l = {35, 37, 41}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f223925q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f223926r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = f.this.new a(continuation);
            aVar.f223926r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b4 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.f223925q
                r2 = 3
                r3 = 2
                com.avito.android.profile.remove.f r4 = com.avito.android.profile.remove.f.this
                r5 = 1
                if (r1 == 0) goto L30
                if (r1 == r5) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                kotlin.C42729a0.b(r9)
                goto Lb5
            L18:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L20:
                java.lang.Object r1 = r8.f223926r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L55
            L28:
                java.lang.Object r1 = r8.f223926r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L48
            L30:
                kotlin.C42729a0.b(r9)
                java.lang.Object r9 = r8.f223926r
                kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.InterfaceC43172j) r9
                com.avito.android.profile.remove.mvi.entity.ProfileRemoveInternalAction$DataLoading r1 = new com.avito.android.profile.remove.mvi.entity.ProfileRemoveInternalAction$DataLoading
                r1.<init>()
                r8.f223926r = r9
                r8.f223925q = r5
                java.lang.Object r1 = r9.emit(r1, r8)
                if (r1 != r0) goto L47
                return r0
            L47:
                r1 = r9
            L48:
                com.avito.android.remote.z0 r9 = r4.f223921a
                r8.f223926r = r1
                r8.f223925q = r3
                java.lang.Object r9 = r9.G(r8)
                if (r9 != r0) goto L55
                return r0
            L55:
                com.avito.android.remote.model.TypedResult r9 = (com.avito.android.remote.model.TypedResult) r9
                r4.getClass()
                boolean r3 = r9 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 != 0) goto L5f
                goto L7c
            L5f:
                r6 = r9
                com.avito.android.remote.model.TypedResult$Error r6 = (com.avito.android.remote.model.TypedResult.Error) r6
                com.avito.android.remote.error.ApiError r6 = r6.getError()
                boolean r7 = r6 instanceof com.avito.android.remote.error.ApiError.InternalError
                if (r7 == 0) goto L6c
                r7 = r5
                goto L6e
            L6c:
                boolean r7 = r6 instanceof com.avito.android.remote.error.ApiError.UnknownError
            L6e:
                if (r7 == 0) goto L71
                goto L73
            L71:
                boolean r5 = r6 instanceof com.avito.android.remote.error.ApiError.BadRequest
            L73:
                if (r5 == 0) goto L7c
                com.avito.android.profile.remove.analytics.ProfileRemoveAnalytics$ErrorType r5 = com.avito.android.profile.remove.analytics.ProfileRemoveAnalytics.ErrorType.f223775e
                com.avito.android.profile.remove.analytics.ProfileRemoveAnalytics r6 = r4.f223923c
                r6.a(r5)
            L7c:
                boolean r5 = r9 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r5 == 0) goto L94
                com.avito.android.profile.remove.mvi.entity.ProfileRemoveInternalAction$OpenItemsScreen r3 = new com.avito.android.profile.remove.mvi.entity.ProfileRemoveInternalAction$OpenItemsScreen
                com.avito.android.util.o4 r4 = r4.f223922b
                java.lang.String r4 = r4.a()
                com.avito.android.remote.model.TypedResult$Success r9 = (com.avito.android.remote.model.TypedResult.Success) r9
                java.lang.Object r9 = r9.getResult()
                com.avito.android.remote.model.profile_removal.ProfileRemovalScreen r9 = (com.avito.android.remote.model.profile_removal.ProfileRemovalScreen) r9
                r3.<init>(r4, r9)
                goto La9
            L94:
                if (r3 == 0) goto Lb8
                com.avito.android.profile.remove.mvi.entity.ProfileRemoveInternalAction$Error r3 = new com.avito.android.profile.remove.mvi.entity.ProfileRemoveInternalAction$Error
                com.avito.android.remote.model.TypedResult$Error r9 = (com.avito.android.remote.model.TypedResult.Error) r9
                com.avito.android.remote.error.ApiError r4 = r9.getError()
                java.lang.String r4 = com.avito.android.error.z.k(r4)
                com.avito.android.remote.error.ApiError r9 = r9.getError()
                r3.<init>(r9, r4)
            La9:
                r9 = 0
                r8.f223926r = r9
                r8.f223925q = r2
                java.lang.Object r9 = r1.emit(r3, r8)
                if (r9 != r0) goto Lb5
                return r0
            Lb5:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            Lb8:
                kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
                r9.<init>()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile.remove.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ProfileRemoveInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.remove.ProfileRemoveInteractorImpl$loadRemoveScreen$2", f = "ProfileRemoveInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements q<InterfaceC43172j<?>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f223928q;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f223928q = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Throwable th2 = this.f223928q;
            if (!(th2 instanceof CancellationException)) {
                V2.f318762a.e("ProfileRemoveInteractor", th2);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ProfileRemoveInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile/remove/mvi/entity/ProfileRemoveInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.remove.ProfileRemoveInteractorImpl$openHowToReturnMoneyScreen$1", f = "ProfileRemoveInteractor.kt", i = {0, 1}, l = {59, 61, 69, 72}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class c extends SuspendLambda implements p<InterfaceC43172j<? super ProfileRemoveInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f223929q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f223930r;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = f.this.new c(continuation);
            cVar.f223930r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ProfileRemoveInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
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
                int r1 = r9.f223929q
                com.avito.android.profile.remove.f r2 = com.avito.android.profile.remove.f.this
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L34
                if (r1 == r6) goto L2c
                if (r1 == r5) goto L24
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L17
                goto L1f
            L17:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1f:
                kotlin.C42729a0.b(r10)
                goto Lc1
            L24:
                java.lang.Object r1 = r9.f223930r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L59
            L2c:
                java.lang.Object r1 = r9.f223930r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L4c
            L34:
                kotlin.C42729a0.b(r10)
                java.lang.Object r10 = r9.f223930r
                kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.InterfaceC43172j) r10
                com.avito.android.profile.remove.mvi.entity.ProfileRemoveInternalAction$DataLoading r1 = new com.avito.android.profile.remove.mvi.entity.ProfileRemoveInternalAction$DataLoading
                r1.<init>()
                r9.f223930r = r10
                r9.f223929q = r6
                java.lang.Object r1 = r10.emit(r1, r9)
                if (r1 != r0) goto L4b
                return r0
            L4b:
                r1 = r10
            L4c:
                com.avito.android.remote.z0 r10 = r2.f223921a
                r9.f223930r = r1
                r9.f223929q = r5
                java.lang.Object r10 = r10.I(r9)
                if (r10 != r0) goto L59
                return r0
            L59:
                com.avito.android.remote.model.TypedResult r10 = (com.avito.android.remote.model.TypedResult) r10
                boolean r5 = r10 instanceof com.avito.android.remote.model.TypedResult.Success
                r6 = 0
                if (r5 == 0) goto L9b
                com.avito.android.remote.model.TypedResult$Success r10 = (com.avito.android.remote.model.TypedResult.Success) r10
                java.lang.Object r10 = r10.getResult()
                com.avito.android.remote.model.profile_support.ProfileRemoveSupport r10 = (com.avito.android.remote.model.profile_support.ProfileRemoveSupport) r10
                com.avito.android.profile.remove.screen.get_money.HowToReturnMoneyParams r3 = new com.avito.android.profile.remove.screen.get_money.HowToReturnMoneyParams
                java.lang.String r5 = r10.getHeaderText()
                java.lang.String r7 = r10.getDescriptionText()
                com.avito.android.remote.model.profile_support.NextButton r8 = r10.getButton()
                java.lang.String r8 = r8.getTitle()
                com.avito.android.remote.model.profile_support.NextButton r10 = r10.getButton()
                com.avito.android.deep_linking.links.DeepLink r10 = r10.getDeepLink()
                r3.<init>(r5, r7, r8, r10)
                com.avito.android.profile.remove.mvi.entity.ProfileRemoveInternalAction$OpenHowGetMoneyScreen r10 = new com.avito.android.profile.remove.mvi.entity.ProfileRemoveInternalAction$OpenHowGetMoneyScreen
                com.avito.android.util.o4 r2 = r2.f223922b
                java.lang.String r2 = r2.a()
                r10.<init>(r2, r3)
                r9.f223930r = r6
                r9.f223929q = r4
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto Lc1
                return r0
            L9b:
                boolean r2 = r10 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r2 == 0) goto Lc4
                com.avito.android.remote.model.TypedResult$Error r10 = (com.avito.android.remote.model.TypedResult.Error) r10
                com.avito.android.remote.error.ApiError r2 = r10.getError()
                java.lang.Throwable r10 = r10.getCause()
                com.avito.android.util.ApiException r10 = com.avito.android.util.C35936s.a(r2, r10)
                com.avito.android.profile.remove.mvi.entity.ProfileRemoveInternalAction$ShowSnackbar r2 = new com.avito.android.profile.remove.mvi.entity.ProfileRemoveInternalAction$ShowSnackbar
                java.lang.String r10 = com.avito.android.error.z.l(r10)
                r2.<init>(r10)
                r9.f223930r = r6
                r9.f223929q = r3
                java.lang.Object r10 = r1.emit(r2, r9)
                if (r10 != r0) goto Lc1
                return r0
            Lc1:
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            Lc4:
                kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
                r10.<init>()
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile.remove.f.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ProfileRemoveInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile/remove/mvi/entity/ProfileRemoveInternalAction;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.remove.ProfileRemoveInteractorImpl$openHowToReturnMoneyScreen$2", f = "ProfileRemoveInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements q<InterfaceC43172j<? super ProfileRemoveInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f223932q;

        public d() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super ProfileRemoveInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            d dVar = new d(3, continuation);
            dVar.f223932q = th2;
            return dVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Throwable th2 = this.f223932q;
            if (!(th2 instanceof CancellationException)) {
                V2.f318762a.e("ProfileRemoveInteractor", th2);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public f(@Y61.k InterfaceC34401z0 interfaceC34401z0, @Y61.k InterfaceC35863o4 interfaceC35863o4, @Y61.k ProfileRemoveAnalytics profileRemoveAnalytics, @Y61.k R0 r02) {
        this.f223921a = interfaceC34401z0;
        this.f223922b = interfaceC35863o4;
        this.f223923c = profileRemoveAnalytics;
        this.f223924d = r02;
    }

    @Override // com.avito.android.profile.remove.e
    @Y61.k
    public final InterfaceC43160i<ProfileRemoveInternalAction> R1() {
        return C43175k.I(this.f223924d.a(), new C43152f0(C43175k.G(new c(null)), new d(3, null)));
    }

    @Override // com.avito.android.profile.remove.e
    @Y61.k
    public final InterfaceC43160i<ProfileRemoveInternalAction> S1() {
        return C43175k.I(this.f223924d.a(), new C43152f0(C43175k.G(new a(null)), new b(3, null)));
    }
}
