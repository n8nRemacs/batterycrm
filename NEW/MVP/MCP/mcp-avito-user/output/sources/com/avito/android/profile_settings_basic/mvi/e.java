package com.avito.android.profile_settings_basic.mvi;

import Qb0.InterfaceC14879b;
import com.avito.android.profile_settings_basic.InterfaceC33465j;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: BasicProfileSettingsActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/profile_settings_basic/j;", "it", "Lkotlinx/coroutines/flow/i;", "LQb0/b;", "<anonymous>", "(Lcom/avito/android/profile_settings_basic/j;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_settings_basic.mvi.BasicProfileSettingsActor$process$5", f = "BasicProfileSettingsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class e extends SuspendLambda implements Y41.p<InterfaceC33465j, Continuation<? super InterfaceC43160i<? extends InterfaceC14879b>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f228874q;

    public e() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(2, continuation);
        eVar.f228874q = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC33465j interfaceC33465j, Continuation<? super InterfaceC43160i<? extends InterfaceC14879b>> continuation) {
        return ((e) create(interfaceC33465j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC33465j interfaceC33465j = (InterfaceC33465j) this.f228874q;
        if (interfaceC33465j instanceof InterfaceC33465j.a) {
            return new C43210w(new InterfaceC14879b.e(((InterfaceC33465j.a) interfaceC33465j).f228849a));
        }
        if (interfaceC33465j instanceof InterfaceC33465j.b) {
            InterfaceC33465j.b bVar = (InterfaceC33465j.b) interfaceC33465j;
            return new C43210w(new InterfaceC14879b.f(bVar.f228851b, bVar.f228850a));
        }
        if (interfaceC33465j instanceof InterfaceC33465j.c) {
            return new C43210w(new InterfaceC14879b.g(((InterfaceC33465j.c) interfaceC33465j).f228852a));
        }
        if (!(interfaceC33465j instanceof InterfaceC33465j.d)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC33465j.d dVar = (InterfaceC33465j.d) interfaceC33465j;
        return new C43210w(new InterfaceC14879b.h(dVar.f228853a, dVar.f228854b, dVar.f228855c));
    }
}
