package com.avito.android.passport.profile_add.merge.code_confirm;

import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import b60.b;
import c60.b;
import com.avito.android.passport.profile_add.merge.code_confirm.CodeConfirmFragment;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.D;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CodeConfirmFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.passport.profile_add.merge.code_confirm.CodeConfirmFragment$observeViewModel$2", f = "CodeConfirmFragment.kt", i = {}, l = {158}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class d extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f212719q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ CodeConfirmFragment f212720r;

    /* compiled from: CodeConfirmFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.passport.profile_add.merge.code_confirm.CodeConfirmFragment$observeViewModel$2$1", f = "CodeConfirmFragment.kt", i = {}, l = {158}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f212721q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ CodeConfirmFragment f212722r;

        /* compiled from: CodeConfirmFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.passport.profile_add.merge.code_confirm.d$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C6363a implements InterfaceC43172j, D {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CodeConfirmFragment f212723b;

            public C6363a(CodeConfirmFragment codeConfirmFragment) {
                this.f212723b = codeConfirmFragment;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            public final Object emit(@Y61.k Object obj, @Y61.k Continuation<? super G0> continuation) {
                CodeConfirmFragment.a aVar = CodeConfirmFragment.f212682G0;
                CodeConfirmFragment codeConfirmFragment = this.f212723b;
                codeConfirmFragment.getClass();
                if (obj instanceof b.a) {
                    b.a aVar2 = (b.a) obj;
                    codeConfirmFragment.v5(aVar2.f56912b, aVar2.f56911a, aVar2.f56913c);
                } else if (obj instanceof b.a) {
                    b.a aVar3 = (b.a) obj;
                    codeConfirmFragment.v5(aVar3.f57653b, aVar3.f57652a, aVar3.f57654c);
                } else if (obj instanceof b.C1992b) {
                    com.avito.android.passport.profile_add.merge.b.e(codeConfirmFragment.requireActivity());
                }
                G0 g02 = G0.f406611a;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                return g02;
            }

            public final boolean equals(@Y61.l Object obj) {
                if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                    return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.D
            @Y61.k
            public final InterfaceC43072x<?> getFunctionDelegate() {
                return new C42801a(2, this.f212723b, CodeConfirmFragment.class, "renderEvents", "renderEvents(Ljava/lang/Object;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CodeConfirmFragment codeConfirmFragment, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f212722r = codeConfirmFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f212722r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f212721q;
            if (i12 == 0) {
                C42729a0.b(obj);
                CodeConfirmFragment.a aVar = CodeConfirmFragment.f212682G0;
                CodeConfirmFragment codeConfirmFragment = this.f212722r;
                m mVarU5 = codeConfirmFragment.u5();
                C6363a c6363a = new C6363a(codeConfirmFragment);
                this.f212721q = 1;
                Object objCollect = mVarU5.f212735M.collect(c6363a, this);
                if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollect = G0.f406611a;
                }
                if (objCollect == coroutine_suspended) {
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
    public d(CodeConfirmFragment codeConfirmFragment, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f212720r = codeConfirmFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new d(this.f212720r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f212719q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46683f;
            CodeConfirmFragment codeConfirmFragment = this.f212720r;
            a aVar = new a(codeConfirmFragment, null);
            this.f212719q = 1;
            if (C23056p0.b(codeConfirmFragment, state, aVar, this) == coroutine_suspended) {
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
