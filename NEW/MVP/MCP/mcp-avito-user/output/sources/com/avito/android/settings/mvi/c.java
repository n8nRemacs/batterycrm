package com.avito.android.settings.mvi;

import Nv0.InterfaceC14616a;
import Nv0.InterfaceC14617b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SettingsActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LNv0/a;", "it", "Lkotlinx/coroutines/flow/i;", "LNv0/b;", "<anonymous>", "(LNv0/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.settings.mvi.SettingsActor$process$1", f = "SettingsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC14616a, Continuation<? super InterfaceC43160i<? extends InterfaceC14617b>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f280904q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f280905r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Nv0.d> f280906s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Y41.a<Nv0.d> aVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f280905r = dVar;
        this.f280906s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f280905r, this.f280906s, continuation);
        cVar.f280904q = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC14616a interfaceC14616a, Continuation<? super InterfaceC43160i<? extends InterfaceC14617b>> continuation) {
        return ((c) create(interfaceC14616a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return this.f280905r.b((InterfaceC14616a) this.f280904q, this.f280906s.invoke());
    }
}
