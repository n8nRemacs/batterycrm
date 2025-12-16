package com.avito.android.authorization.complete_registration;

import android.view.View;
import com.avito.android.authorization.complete_registration.CompleteRegistrationFragment;
import com.avito.android.authorization.complete_registration.mvi.entity.InputType;
import com.avito.android.lib.design.component_container.ComponentContainer;
import ee.InterfaceC40093a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import qK0.C47313c;

/* compiled from: CompleteRegistrationFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Z)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.authorization.complete_registration.CompleteRegistrationFragment$setupCallbacks$4", f = "CompleteRegistrationFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class i extends SuspendLambda implements Y41.p<Boolean, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ CompleteRegistrationFragment f93446q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(CompleteRegistrationFragment completeRegistrationFragment, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f93446q = completeRegistrationFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new i(this.f93446q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Boolean bool, Continuation<? super G0> continuation) {
        return ((i) create(bool, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        CompleteRegistrationFragment.a aVar = CompleteRegistrationFragment.f93381E0;
        CompleteRegistrationFragment completeRegistrationFragment = this.f93446q;
        C47313c c47313c = completeRegistrationFragment.f93396w0;
        kotlin.reflect.n<Object>[] nVarArr = CompleteRegistrationFragment.f93382F0;
        kotlin.reflect.n<Object> nVar = nVarArr[1];
        View view = (View) c47313c.a();
        C47313c c47313c2 = completeRegistrationFragment.f93398y0;
        kotlin.reflect.n<Object> nVar2 = nVarArr[3];
        view.setScrollY(((ComponentContainer) c47313c2.a()).getTop());
        completeRegistrationFragment.s5(new InterfaceC40093a.b(InputType.f93479b));
        return G0.f406611a;
    }
}
