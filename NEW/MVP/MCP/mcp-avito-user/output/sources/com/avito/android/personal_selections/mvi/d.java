package com.avito.android.personal_selections.mvi;

import Y41.p;
import com.avito.android.personal_selections.mvi.entity.PersonalSelectionsItemState;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import l70.InterfaceC43570a;

/* compiled from: PersonalSelectionsItemActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ll70/a;", "action", "Lkotlinx/coroutines/flow/i;", "Ll70/b;", "<anonymous>", "(Ll70/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.personal_selections.mvi.PersonalSelectionsItemActor$process$3", f = "PersonalSelectionsItemActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class d extends SuspendLambda implements p<InterfaceC43570a, Continuation<? super InterfaceC43160i<? extends l70.b>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f215808q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f215809r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<PersonalSelectionsItemState> f215810s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, Y41.a<PersonalSelectionsItemState> aVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f215809r = fVar;
        this.f215810s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f215809r, this.f215810s, continuation);
        dVar.f215808q = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43570a interfaceC43570a, Continuation<? super InterfaceC43160i<? extends l70.b>> continuation) {
        return ((d) create(interfaceC43570a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC43570a interfaceC43570a = (InterfaceC43570a) this.f215808q;
        PersonalSelectionsItemState personalSelectionsItemStateInvoke = this.f215810s.invoke();
        f fVar = this.f215809r;
        fVar.getClass();
        return C43175k.G(new e(interfaceC43570a, personalSelectionsItemStateInvoke, fVar, null));
    }
}
