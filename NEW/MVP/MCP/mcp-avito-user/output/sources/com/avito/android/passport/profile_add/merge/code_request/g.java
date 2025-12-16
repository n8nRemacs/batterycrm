package com.avito.android.passport.profile_add.merge.code_request;

import c60.InterfaceC26947a;
import com.avito.android.passport.profile_add.merge.code_request.CodeRequestFragment;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CodeRequestFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(I)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.passport.profile_add.merge.code_request.CodeRequestFragment$setupCallbacks$1$3", f = "CodeRequestFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class g extends SuspendLambda implements Y41.p<Integer, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ CodeRequestFragment f212856q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CodeRequestFragment codeRequestFragment, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f212856q = codeRequestFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new g(this.f212856q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Integer num, Continuation<? super G0> continuation) {
        return ((g) create(num, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        CodeRequestFragment.a aVar = CodeRequestFragment.f212821B0;
        CodeRequestFragment codeRequestFragment = this.f212856q;
        codeRequestFragment.r5().accept(new InterfaceC26947a.d(codeRequestFragment.q5().getDeformattedText()));
        return G0.f406611a;
    }
}
