package kotlinx.serialization;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.u0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.o;
import kotlinx.serialization.internal.V0;

/* compiled from: SealedSerializer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Lkotlinx/serialization/descriptors/a;", "Lkotlin/G0;", "invoke", "(Lkotlinx/serialization/descriptors/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes8.dex */
final class q extends N implements Y41.l<kotlinx.serialization.descriptors.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r<Object> f413169l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r<Object> rVar) {
        super(1);
        this.f413169l = rVar;
    }

    @Override // Y41.l
    public final G0 invoke(kotlinx.serialization.descriptors.a aVar) {
        kotlinx.serialization.descriptors.a aVar2 = aVar;
        u0 u0Var = u0.f406856a;
        V0.f412822a.getClass();
        kotlinx.serialization.descriptors.a.b(aVar2, "type", V0.f412823b);
        StringBuilder sb2 = new StringBuilder("kotlinx.serialization.Sealed<");
        r<Object> rVar = this.f413169l;
        sb2.append(rVar.f413170a.l0());
        sb2.append('>');
        kotlinx.serialization.descriptors.a.b(aVar2, "value", kotlinx.serialization.descriptors.n.c(sb2.toString(), o.a.f412749a, new SerialDescriptor[0], new p(rVar)));
        aVar2.f412708b = rVar.f413171b;
        return G0.f406611a;
    }
}
