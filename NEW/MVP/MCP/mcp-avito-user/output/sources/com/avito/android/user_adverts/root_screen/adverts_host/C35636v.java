package com.avito.android.user_adverts.root_screen.adverts_host;

import com.avito.android.user_adverts.root_screen.adverts_host.host_view.HostViewState;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.i2;
import kotlinx.coroutines.flow.n2;
import wI0.C49517b;

/* compiled from: UserAdvertsHostFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostFragment$collectHostViewState$1", f = "UserAdvertsHostFragment.kt", i = {}, l = {1327}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C35636v extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f314162q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.user_adverts.root_screen.adverts_host.binder.o f314163r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.user_adverts.root_screen.adverts_host.host_view.d f314164s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35636v(com.avito.android.user_adverts.root_screen.adverts_host.binder.o oVar, com.avito.android.user_adverts.root_screen.adverts_host.host_view.d dVar, Continuation continuation) {
        super(2, continuation);
        this.f314163r = oVar;
        this.f314164s = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C35636v(this.f314163r, this.f314164s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C35636v) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f314162q;
        if (i12 == 0) {
            C42729a0.b(obj);
            com.avito.android.user_adverts.root_screen.adverts_host.binder.o oVar = this.f314163r;
            HostViewState.b bVar = HostViewState.b.f312979b;
            C49517b<HostViewState> c49517b = oVar.f312480a.f441371a;
            n2 n2VarU = C43175k.U(c49517b.f441370b, c49517b.f441369a, i2.a.b(i2.f411430a, 0L, 3), bVar);
            this.f314162q = 1;
            if (n2VarU.collect(this.f314164s, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
