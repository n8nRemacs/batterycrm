package com.avito.android.mortgage_invite.client_search;

import androidx.compose.ui.focus.S;
import androidx.compose.ui.platform.InterfaceC22489j2;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: MortgageClientSearchScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_invite.client_search.MortgageClientSearchScreenKt$MortgageClientSearchScreen$4$1", f = "MortgageClientSearchScreen.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class G extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f205327q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ S f205328r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22489j2 f205329s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(S s5, InterfaceC22489j2 interfaceC22489j2, Continuation<? super G> continuation) {
        super(2, continuation);
        this.f205328r = s5;
        this.f205329s = interfaceC22489j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new G(this.f205328r, this.f205329s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((G) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f205327q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f205327q = 1;
            if (kotlinx.coroutines.android.j.c(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        S.c(this.f205328r);
        InterfaceC22489j2 interfaceC22489j2 = this.f205329s;
        if (interfaceC22489j2 != null) {
            interfaceC22489j2.show();
        }
        return G0.f406611a;
    }
}
