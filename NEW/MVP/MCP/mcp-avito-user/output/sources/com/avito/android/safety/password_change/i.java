package com.avito.android.safety.password_change;

import com.avito.android.safety.password_change.PasswordChangeFragment;
import com.avito.android.safety.password_change.mvi.entity.InputType;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PasswordChangeFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(I)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.safety.password_change.PasswordChangeFragment$setupCallbacks$2", f = "PasswordChangeFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class i extends SuspendLambda implements Y41.p<Integer, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ PasswordChangeFragment f257285q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(PasswordChangeFragment passwordChangeFragment, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f257285q = passwordChangeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new i(this.f257285q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Integer num, Continuation<? super G0> continuation) {
        return ((i) create(num, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InputType inputType = InputType.f257312c;
        PasswordChangeFragment.a aVar = PasswordChangeFragment.f257203H0;
        this.f257285q.u5(inputType);
        return G0.f406611a;
    }
}
