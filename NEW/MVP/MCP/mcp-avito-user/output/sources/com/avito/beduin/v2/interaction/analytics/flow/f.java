package com.avito.beduin.v2.interaction.analytics.flow;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.beduin.v2.engine.field.entity.v;
import com.avito.beduin.v2.interaction.analytics.flow.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SendAnalyticsEventInteractionHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LdU0/f;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.beduin.v2.interaction.analytics.flow.SendAnalyticsEventInteractionHandler$handle$1", f = "SendAnalyticsEventInteractionHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class f extends SuspendLambda implements p<InterfaceC43172j<? super dU0.f>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ d f337265q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f337266r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, g gVar, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f337265q = dVar;
        this.f337266r = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new f(this.f337265q, this.f337266r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super dU0.f> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        d dVar = this.f337265q;
        e.a aVar = dVar.f337262c;
        g gVar = this.f337266r;
        com.avito.beduin.v2.serialization.json.e eVar = new com.avito.beduin.v2.serialization.json.e(gVar.f337268d);
        Set setEntrySet = aVar.f337264b.entrySet();
        ArrayList arrayList = new ArrayList(C42745f0.q(setEntrySet, 10));
        Iterator it = ((kotlin.collections.builders.e) setEntrySet).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            com.avito.beduin.v2.engine.field.d dVar2 = (com.avito.beduin.v2.engine.field.d) entry.getValue();
            arrayList.add(new b(str, (gVar.f337269e || !(dVar2 instanceof v)) ? eVar.a(dVar2) : ((v) dVar2).getF336843b()));
        }
        gVar.f337267c.a(dVar.f337260a, dVar.f337261b, (b[]) arrayList.toArray(new b[0]));
        return G0.f406611a;
    }
}
