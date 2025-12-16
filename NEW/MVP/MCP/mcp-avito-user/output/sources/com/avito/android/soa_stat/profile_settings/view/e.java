package com.avito.android.soa_stat.profile_settings.view;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.soa_stat.profile_settings.view.a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.e2;

/* compiled from: SoaStatSettingsView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.soa_stat.profile_settings.view.SoaStatSettingsViewImpl$actionListener$1$1", f = "SoaStatSettingsView.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class e extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f284256q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f284257r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a.InterfaceC8489a f284258s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, a.InterfaceC8489a interfaceC8489a, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f284257r = dVar;
        this.f284258s = interfaceC8489a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new e(this.f284257r, this.f284258s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f284256q;
        if (i12 == 0) {
            C42729a0.b(obj);
            e2 e2Var = this.f284257r.f284249k;
            this.f284256q = 1;
            if (e2Var.emit(this.f284258s, this) == coroutine_suspended) {
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
