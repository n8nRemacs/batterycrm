package com.avito.android.profile_settings_basic.mvi;

import Qb0.InterfaceC14879b;
import com.avito.android.profile_settings_basic.InterfaceC33459d;
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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/profile_settings_basic/d;", "it", "Lkotlinx/coroutines/flow/i;", "LQb0/b;", "<anonymous>", "(Lcom/avito/android/profile_settings_basic/d;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_settings_basic.mvi.BasicProfileSettingsActor$process$6", f = "BasicProfileSettingsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class f extends SuspendLambda implements Y41.p<InterfaceC33459d, Continuation<? super InterfaceC43160i<? extends InterfaceC14879b>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f228877q;

    public f() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(2, continuation);
        fVar.f228877q = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC33459d interfaceC33459d, Continuation<? super InterfaceC43160i<? extends InterfaceC14879b>> continuation) {
        return ((f) create(interfaceC33459d, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC33459d interfaceC33459d = (InterfaceC33459d) this.f228877q;
        if (interfaceC33459d instanceof InterfaceC33459d.a) {
            InterfaceC33459d.a aVar = (InterfaceC33459d.a) interfaceC33459d;
            return new C43210w(new InterfaceC14879b.C0914b(aVar.f228735a, aVar.f228736b));
        }
        if (interfaceC33459d instanceof InterfaceC33459d.b) {
            return new C43210w(new InterfaceC14879b.c(((InterfaceC33459d.b) interfaceC33459d).f228737a));
        }
        if (interfaceC33459d instanceof InterfaceC33459d.c) {
            return new C43210w(InterfaceC14879b.d.f13872a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
