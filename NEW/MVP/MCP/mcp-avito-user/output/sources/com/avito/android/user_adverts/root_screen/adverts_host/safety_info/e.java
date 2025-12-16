package com.avito.android.user_adverts.root_screen.adverts_host.safety_info;

import PI0.a;
import PI0.b;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.user_adverts.root_screen.adverts_host.safety_info.b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.Z1;

/* compiled from: SafetyInfoViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.safety_info.SafetyInfoViewModelImpl$show$1", f = "SafetyInfoViewModel.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class e extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f313821q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f313822r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a.b f313823s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, a.b bVar2, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f313822r = bVar;
        this.f313823s = bVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new e(this.f313822r, this.f313823s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f313821q;
        b bVar = this.f313822r;
        if (i12 == 0) {
            C42729a0.b(obj);
            String str = this.f313823s.f12954a;
            this.f313821q = 1;
            obj = (!bVar.f313809K.b() || str == null) ? null : C43259k.g(bVar.f313810L.a(), new d(bVar, str, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        b.a aVar = (b.a) obj;
        if (aVar != null) {
            Z1<PI0.b> z12 = bVar.f313812N;
            while (!z12.N3(z12.getValue(), new b.C0840b(aVar.f313815b, aVar.f313814a))) {
            }
        } else {
            Z1<PI0.b> z13 = bVar.f313812N;
            while (!z13.N3(z13.getValue(), b.a.f12955a)) {
            }
        }
        return G0.f406611a;
    }
}
