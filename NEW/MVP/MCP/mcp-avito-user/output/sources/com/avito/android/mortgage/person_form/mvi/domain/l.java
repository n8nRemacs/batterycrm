package com.avito.android.mortgage.person_form.mvi.domain;

import com.avito.android.mortgage.person_form.mvi.entity.PersonFormInternalAction;
import com.avito.android.remote.error.ApiError;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UpdateMortgageFormInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.domain.UpdateMortgageFormInteractorImpl$updateField$1", f = "UpdateMortgageFormInteractor.kt", i = {0, 1, 1, 1, 3, 3}, l = {161, 176, 185, 191, 194}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "validationResult", "reloadAfterUpdate", "$this$flow", "reloadAfterUpdate"}, s = {"L$0", "L$0", "L$1", "I$0", "L$0", "I$0"})
/* loaded from: classes15.dex */
final class l extends SuspendLambda implements Y41.p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public LinkedHashSet f201112q;

    /* renamed from: r, reason: collision with root package name */
    public int f201113r;

    /* renamed from: s, reason: collision with root package name */
    public int f201114s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f201115t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ k f201116u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ArrayList f201117v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ LZ.c f201118w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f201119x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f201120y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ String f201121z;

    /* compiled from: UpdateMortgageFormInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.domain.UpdateMortgageFormInteractorImpl$updateField$1$3", f = "UpdateMortgageFormInteractor.kt", i = {}, l = {198}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f201122q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<?> f201123r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC43172j<?> interfaceC43172j, Continuation<? super a> continuation) {
            super(1, continuation);
            this.f201123r = interfaceC43172j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
            return new a(this.f201123r, continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super G0> continuation) {
            return ((a) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f201122q;
            if (i12 == 0) {
                C42729a0.b(obj);
                PersonFormInternalAction.ReloadingStarted reloadingStarted = new PersonFormInternalAction.ReloadingStarted();
                this.f201122q = 1;
                if (this.f201123r.emit(reloadingStarted, this) == coroutine_suspended) {
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

    /* compiled from: UpdateMortgageFormInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LJZ/m;", "it", "Lkotlin/G0;", "<anonymous>", "(LJZ/m;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.domain.UpdateMortgageFormInteractorImpl$updateField$1$4", f = "UpdateMortgageFormInteractor.kt", i = {}, l = {199}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<JZ.m, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f201124q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f201125r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<?> f201126s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC43172j<?> interfaceC43172j, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f201126s = interfaceC43172j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f201126s, continuation);
            bVar.f201125r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(JZ.m mVar, Continuation<? super G0> continuation) {
            return ((b) create(mVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f201124q;
            if (i12 == 0) {
                C42729a0.b(obj);
                PersonFormInternalAction.ReloadingCompleted reloadingCompleted = new PersonFormInternalAction.ReloadingCompleted((JZ.m) this.f201125r);
                this.f201124q = 1;
                if (this.f201126s.emit(reloadingCompleted, this) == coroutine_suspended) {
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

    /* compiled from: UpdateMortgageFormInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/error/ApiError;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/remote/error/ApiError;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.domain.UpdateMortgageFormInteractorImpl$updateField$1$5", f = "UpdateMortgageFormInteractor.kt", i = {}, l = {200}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<ApiError, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f201127q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f201128r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<?> f201129s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC43172j<?> interfaceC43172j, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f201129s = interfaceC43172j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(this.f201129s, continuation);
            cVar.f201128r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(ApiError apiError, Continuation<? super G0> continuation) {
            return ((c) create(apiError, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f201127q;
            if (i12 == 0) {
                C42729a0.b(obj);
                PersonFormInternalAction.ReloadingFailed reloadingFailed = new PersonFormInternalAction.ReloadingFailed((ApiError) this.f201128r);
                this.f201127q = 1;
                if (this.f201129s.emit(reloadingFailed, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k kVar, ArrayList arrayList, LZ.c cVar, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.f201116u = kVar;
        this.f201117v = arrayList;
        this.f201118w = cVar;
        this.f201119x = str;
        this.f201120y = str2;
        this.f201121z = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        l lVar = new l(this.f201116u, this.f201117v, this.f201118w, this.f201119x, this.f201120y, this.f201121z, continuation);
        lVar.f201115t = obj;
        return lVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((l) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0245 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ff  */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.person_form.mvi.domain.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
