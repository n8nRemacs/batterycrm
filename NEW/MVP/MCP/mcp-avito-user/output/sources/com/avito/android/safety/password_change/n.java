package com.avito.android.safety.password_change;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.dialog.InterfaceC30274a;
import io.reactivex.rxjava3.internal.operators.maybe.Y;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.rx3.C43292o;

/* compiled from: PasswordChangeFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.safety.password_change.PasswordChangeFragment$showUserDialog$1", f = "PasswordChangeFragment.kt", i = {}, l = {288}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class n extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f257414q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ PasswordChangeFragment f257415r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(PasswordChangeFragment passwordChangeFragment, Continuation continuation) {
        super(2, continuation);
        this.f257415r = passwordChangeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new n(this.f257415r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((n) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f257414q;
        PasswordChangeFragment passwordChangeFragment = this.f257415r;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC30274a interfaceC30274a = passwordChangeFragment.f257214p0;
            if (interfaceC30274a == null) {
                interfaceC30274a = null;
            }
            Y yG2 = interfaceC30274a.g(null);
            this.f257414q = 1;
            obj = C43292o.g(yG2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        DeepLink deepLink = (DeepLink) obj;
        if (deepLink != null) {
            passwordChangeFragment.i7(deepLink);
        }
        return G0.f406611a;
    }
}
