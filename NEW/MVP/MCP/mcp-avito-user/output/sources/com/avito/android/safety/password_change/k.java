package com.avito.android.safety.password_change;

import android.view.View;
import com.avito.android.safety.password_change.PasswordChangeFragment;
import com.avito.android.safety.password_change.mvi.entity.InputType;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import qK0.C47313c;
import ro0.InterfaceC47696a;

/* compiled from: PasswordChangeFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.safety.password_change.PasswordChangeFragment$setupCallbacks$6", f = "PasswordChangeFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class k extends SuspendLambda implements Y41.p<G0, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ PasswordChangeFragment f257287q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(PasswordChangeFragment passwordChangeFragment, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f257287q = passwordChangeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new k(this.f257287q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(G0 g02, Continuation<? super G0> continuation) {
        return ((k) create(g02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        PasswordChangeFragment.a aVar = PasswordChangeFragment.f257203H0;
        PasswordChangeFragment passwordChangeFragment = this.f257287q;
        C47313c c47313c = passwordChangeFragment.f257222x0;
        kotlin.reflect.n<Object> nVar = PasswordChangeFragment.f257204I0[1];
        ((View) c47313c.a()).setScrollY(passwordChangeFragment.r5().getTop());
        passwordChangeFragment.t5(new InterfaceC47696a.e(InputType.f257312c));
        return G0.f406611a;
    }
}
