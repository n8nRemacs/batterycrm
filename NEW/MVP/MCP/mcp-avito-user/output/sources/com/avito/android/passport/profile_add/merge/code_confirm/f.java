package com.avito.android.passport.profile_add.merge.code_confirm;

import c60.InterfaceC26947a;
import com.avito.android.passport.profile_add.merge.code_confirm.CodeConfirmFragment;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CodeConfirmFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(I)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.passport.profile_add.merge.code_confirm.CodeConfirmFragment$setupCallbacks$4", f = "CodeConfirmFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class f extends SuspendLambda implements Y41.p<Integer, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ CodeConfirmFragment f212725q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CodeConfirmFragment codeConfirmFragment, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f212725q = codeConfirmFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new f(this.f212725q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Integer num, Continuation<? super G0> continuation) {
        return ((f) create(num, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        CodeConfirmFragment.a aVar = CodeConfirmFragment.f212682G0;
        CodeConfirmFragment codeConfirmFragment = this.f212725q;
        codeConfirmFragment.u5().accept(new InterfaceC26947a.d(codeConfirmFragment.q5().f212680b));
        return G0.f406611a;
    }
}
