package com.avito.android.tariff.cpr.configure.advance;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;
import vZ.InterfaceC49286a;

/* compiled from: CprConfigureAdvanceFragment.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LvZ/a;", "Lkotlin/internal/i;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/deep_linking/links/DeepLink;", "<anonymous>", "(LvZ/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.tariff.cpr.configure.advance.CprConfigureAdvanceFragment$render$4", f = "CprConfigureAdvanceFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class b extends SuspendLambda implements p<InterfaceC49286a, Continuation<? super InterfaceC43160i<? extends DeepLink>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f295202q;

    public b() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        b bVar = new b(2, continuation);
        bVar.f295202q = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC49286a interfaceC49286a, Continuation<? super InterfaceC43160i<? extends DeepLink>> continuation) {
        return ((b) create(interfaceC49286a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return ((InterfaceC49286a) this.f295202q).getF295266b();
    }
}
