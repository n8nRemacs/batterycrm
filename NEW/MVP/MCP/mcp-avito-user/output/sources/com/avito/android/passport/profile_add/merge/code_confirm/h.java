package com.avito.android.passport.profile_add.merge.code_confirm;

import com.avito.android.passport.profile_add.merge.code_confirm.CodeConfirmFragment;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.T;

/* compiled from: CodeConfirmFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.passport.profile_add.merge.code_confirm.CodeConfirmFragment$setupView$2", f = "CodeConfirmFragment.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class h extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f212727q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ CodeConfirmFragment f212728r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(CodeConfirmFragment codeConfirmFragment, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f212728r = codeConfirmFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new h(this.f212728r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((h) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f212727q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f212727q = 1;
            if (C43131e0.b(100L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        CodeConfirmFragment.a aVar = CodeConfirmFragment.f212682G0;
        CodeConfirmFragment codeConfirmFragment = this.f212728r;
        codeConfirmFragment.r5().v();
        codeConfirmFragment.r5().q();
        return G0.f406611a;
    }
}
