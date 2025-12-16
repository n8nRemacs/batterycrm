package com.avito.android.profile_tab.summary.mvi;

import Dc0.e;
import Y41.p;
import com.avito.android.profile_tab.summary.e;
import com.avito.android.profile_tab.summary.mvi.a;
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
import kotlinx.coroutines.flow.Z1;

/* compiled from: ProfileSummaryActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/profile_tab/summary/mvi/a$a$a;", "action", "Lkotlinx/coroutines/flow/i;", "LDc0/e;", "<anonymous>", "(Lcom/avito/android/profile_tab/summary/mvi/a$a$a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_tab.summary.mvi.ProfileSummaryActor$processLoadingChanges$3", f = "ProfileSummaryActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class h extends SuspendLambda implements p<a.InterfaceC7024a.InterfaceC7025a, Continuation<? super InterfaceC43160i<? extends Dc0.e>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f230913q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f230914r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a aVar, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f230914r = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        h hVar = new h(this.f230914r, continuation);
        hVar.f230913q = obj;
        return hVar;
    }

    @Override // Y41.p
    public final Object invoke(a.InterfaceC7024a.InterfaceC7025a interfaceC7025a, Continuation<? super InterfaceC43160i<? extends Dc0.e>> continuation) {
        return ((h) create(interfaceC7025a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object value;
        com.avito.android.profile_tab.summary.e eVar;
        Object value2;
        com.avito.android.profile_tab.summary.e aVar;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        a.InterfaceC7024a.InterfaceC7025a interfaceC7025a = (a.InterfaceC7024a.InterfaceC7025a) this.f230913q;
        boolean z12 = interfaceC7025a instanceof a.InterfaceC7024a.c;
        a aVar2 = this.f230914r;
        if (!z12) {
            if (!(interfaceC7025a instanceof a.InterfaceC7024a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            a.InterfaceC7024a.b bVar = (a.InterfaceC7024a.b) interfaceC7025a;
            aVar2.getClass();
            a.b.f230886b.getClass();
            a.b.c cVar = a.b.f230886b;
            Z1<ValueT> z13 = aVar2.f230883e.f92113b;
            do {
                value = z13.getValue();
                eVar = bVar.f230884a;
                ((a.b) value).getClass();
            } while (!z13.N3(value, new a.b(eVar)));
            return new C43210w(new e.d(bVar.f230884a));
        }
        aVar2.getClass();
        a.b.f230886b.getClass();
        a.b.c cVar2 = a.b.f230886b;
        Z1<ValueT> z14 = aVar2.f230883e.f92113b;
        do {
            value2 = z14.getValue();
            aVar = ((a.b) value2).f230887a;
            if (aVar instanceof e.a) {
                aVar = new e.a(((e.a) aVar).f230868a, aVar2.f230881c.a());
            } else if (!(aVar instanceof e.b)) {
                throw new NoWhenBranchMatchedException();
            }
        } while (!z14.N3(value2, new a.b(aVar)));
        return new C43210w(e.c.f3274a);
    }
}
