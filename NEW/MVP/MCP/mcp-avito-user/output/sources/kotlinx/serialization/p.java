package kotlinx.serialization;

import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SealedSerializer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Lkotlinx/serialization/descriptors/a;", "Lkotlin/G0;", "invoke", "(Lkotlinx/serialization/descriptors/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes8.dex */
final class p extends N implements Y41.l<kotlinx.serialization.descriptors.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r<Object> f413168l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r<Object> rVar) {
        super(1);
        this.f413168l = rVar;
    }

    @Override // Y41.l
    public final G0 invoke(kotlinx.serialization.descriptors.a aVar) {
        kotlinx.serialization.descriptors.a aVar2 = aVar;
        for (Map.Entry entry : this.f413168l.f413174e.entrySet()) {
            kotlinx.serialization.descriptors.a.b(aVar2, (String) entry.getKey(), ((KSerializer) entry.getValue()).getF412706c());
        }
        return G0.f406611a;
    }
}
