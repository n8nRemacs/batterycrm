package com.avito.android.extended_profile_selection_create.image;

import JA.a;
import Y41.p;
import Y41.q;
import com.avito.android.extended_profile_selection_create.image.mvi.entity.ExtendedProfileSetSelectionImageInternalAction;
import com.avito.android.remote.D0;
import com.avito.android.remote.model.extended.modification.ModificationBody;
import com.avito.android.remote.model.extended.modification.SelectionModification;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.Collections;
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

/* compiled from: ExtendedProfileSetSelectionImageInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/image/e;", "", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ExtendedProfileSetSelectionImageConfig f151725a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<D0> f151726b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<Gson> f151727c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f151728d;

    /* compiled from: ExtendedProfileSetSelectionImageInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile_selection_create/image/mvi/entity/ExtendedProfileSetSelectionImageInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_selection_create.image.ExtendedProfileSetSelectionImageInteractor$removeCoverImage$1", f = "ExtendedProfileSetSelectionImageInteractor.kt", i = {0, 1}, l = {AvailableCode.HMS_IS_SPOOF, 33, 37, 42}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super ExtendedProfileSetSelectionImageInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f151729q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f151730r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = e.this.new a(continuation);
            aVar.f151730r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ExtendedProfileSetSelectionImageInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) throws com.avito.android.util.ApiException {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.f151729q
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r1 == 0) goto L33
                if (r1 == r5) goto L2b
                if (r1 == r4) goto L23
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                goto L1e
            L16:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1e:
                kotlin.C42729a0.b(r9)
                goto Lb8
            L23:
                java.lang.Object r1 = r8.f151730r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L6d
            L2b:
                java.lang.Object r1 = r8.f151730r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L48
            L33:
                kotlin.C42729a0.b(r9)
                java.lang.Object r9 = r8.f151730r
                kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.InterfaceC43172j) r9
                com.avito.android.extended_profile_selection_create.image.mvi.entity.ExtendedProfileSetSelectionImageInternalAction$SetSelectionImageLoading r1 = com.avito.android.extended_profile_selection_create.image.mvi.entity.ExtendedProfileSetSelectionImageInternalAction.SetSelectionImageLoading.f151776b
                r8.f151730r = r9
                r8.f151729q = r5
                java.lang.Object r1 = r9.emit(r1, r8)
                if (r1 != r0) goto L47
                return r0
            L47:
                r1 = r9
            L48:
                com.avito.android.extended_profile_selection_create.image.e r9 = com.avito.android.extended_profile_selection_create.image.e.this
                h31.e<com.google.gson.Gson> r5 = r9.f151727c
                java.lang.Object r5 = r5.get()
                com.google.gson.Gson r5 = (com.google.gson.Gson) r5
                com.avito.android.remote.model.extended.modification.ModificationBody r7 = r9.a(r6)
                java.lang.String r5 = r5.l(r7)
                h31.e<com.avito.android.remote.D0> r9 = r9.f151726b
                java.lang.Object r9 = r9.get()
                com.avito.android.remote.D0 r9 = (com.avito.android.remote.D0) r9
                r8.f151730r = r1
                r8.f151729q = r4
                java.lang.Object r9 = r9.e(r5, r8)
                if (r9 != r0) goto L6d
                return r0
            L6d:
                com.avito.android.remote.model.TypedResult r9 = (com.avito.android.remote.model.TypedResult) r9
                boolean r4 = r9 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r4 == 0) goto Lbb
                com.avito.android.remote.model.TypedResult$Success r9 = (com.avito.android.remote.model.TypedResult.Success) r9
                java.lang.Object r9 = r9.getResult()
                com.avito.android.remote.model.extended.modification.ModificationResult r9 = (com.avito.android.remote.model.extended.modification.ModificationResult) r9
                boolean r4 = r9 instanceof com.avito.android.remote.model.extended.modification.ModificationResult.Ok
                if (r4 == 0) goto L8c
                com.avito.android.extended_profile_selection_create.image.mvi.entity.ExtendedProfileSetSelectionImageInternalAction$SetSelectionImageSuccess r9 = com.avito.android.extended_profile_selection_create.image.mvi.entity.ExtendedProfileSetSelectionImageInternalAction.SetSelectionImageSuccess.f151777b
                r8.f151730r = r6
                r8.f151729q = r3
                java.lang.Object r9 = r1.emit(r9, r8)
                if (r9 != r0) goto Lb8
                return r0
            L8c:
                boolean r3 = r9 instanceof com.avito.android.remote.model.extended.modification.ModificationResult.IncorrectValues
                if (r3 == 0) goto Lb8
                com.avito.android.remote.model.extended.modification.ModificationResult$IncorrectValues r9 = (com.avito.android.remote.model.extended.modification.ModificationResult.IncorrectValues) r9
                java.util.List r9 = r9.getErrors()
                java.lang.Object r9 = kotlin.collections.C42745f0.G(r9)
                com.avito.android.remote.model.extended.modification.ModificationResult$IncorrectValues$FieldError r9 = (com.avito.android.remote.model.extended.modification.ModificationResult.IncorrectValues.FieldError) r9
                if (r9 == 0) goto La3
                java.lang.String r9 = r9.getMessage()
                goto La4
            La3:
                r9 = r6
            La4:
                if (r9 != 0) goto La8
                java.lang.String r9 = ""
            La8:
                com.avito.android.extended_profile_selection_create.image.mvi.entity.ExtendedProfileSetSelectionImageInternalAction$SetSelectionIncorrectValuesError r3 = new com.avito.android.extended_profile_selection_create.image.mvi.entity.ExtendedProfileSetSelectionImageInternalAction$SetSelectionIncorrectValuesError
                r3.<init>(r9)
                r8.f151730r = r6
                r8.f151729q = r2
                java.lang.Object r9 = r1.emit(r3, r8)
                if (r9 != r0) goto Lb8
                return r0
            Lb8:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            Lbb:
                boolean r0 = r9 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r0 == 0) goto Lce
                com.avito.android.remote.model.TypedResult$Error r9 = (com.avito.android.remote.model.TypedResult.Error) r9
                com.avito.android.remote.error.ApiError r0 = r9.getError()
                java.lang.Throwable r9 = r9.getCause()
                com.avito.android.util.ApiException r9 = com.avito.android.util.C35936s.a(r0, r9)
                throw r9
            Lce:
                kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
                r9.<init>()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile_selection_create.image.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ExtendedProfileSetSelectionImageInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile_selection_create/image/mvi/entity/ExtendedProfileSetSelectionImageInternalAction;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_selection_create.image.ExtendedProfileSetSelectionImageInteractor$removeCoverImage$2", f = "ExtendedProfileSetSelectionImageInteractor.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements q<InterfaceC43172j<? super ExtendedProfileSetSelectionImageInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f151732q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f151733r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f151734s;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super ExtendedProfileSetSelectionImageInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f151733r = interfaceC43172j;
            bVar.f151734s = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f151732q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f151733r;
                ExtendedProfileSetSelectionImageInternalAction.SetSelectionImageError setSelectionImageError = new ExtendedProfileSetSelectionImageInternalAction.SetSelectionImageError(this.f151734s, a.b.f8825a);
                this.f151733r = null;
                this.f151732q = 1;
                if (interfaceC43172j.emit(setSelectionImageError, this) == coroutine_suspended) {
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
    public e(@Y61.k ExtendedProfileSetSelectionImageConfig extendedProfileSetSelectionImageConfig, @Y61.k h31.e<D0> eVar, @Y61.k h31.e<Gson> eVar2, @Y61.k R0 r02) {
        this.f151725a = extendedProfileSetSelectionImageConfig;
        this.f151726b = eVar;
        this.f151727c = eVar2;
        this.f151728d = r02;
    }

    @Y61.k
    public final ModificationBody a(@Y61.l Long l12) {
        ExtendedProfileSetSelectionImageConfig extendedProfileSetSelectionImageConfig = this.f151725a;
        return new ModificationBody(Collections.singletonList(new SelectionModification(extendedProfileSetSelectionImageConfig.f151626b, Collections.singletonList(new SelectionModification.Operation(SelectionModification.OperationType.UPDATE, extendedProfileSetSelectionImageConfig.f151627c, new SelectionModification.Value(Long.valueOf(extendedProfileSetSelectionImageConfig.f151628d), extendedProfileSetSelectionImageConfig.f151630f, Boolean.valueOf(extendedProfileSetSelectionImageConfig.f151631g), l12))), null, 4, null)));
    }

    @Y61.k
    public final InterfaceC43160i<ExtendedProfileSetSelectionImageInternalAction> b() {
        return C43175k.I(this.f151728d.a(), new C43152f0(C43175k.G(new a(null)), new b(3, null)));
    }
}
