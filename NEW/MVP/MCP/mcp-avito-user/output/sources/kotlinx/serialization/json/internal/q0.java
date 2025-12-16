package kotlinx.serialization.json.internal;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlinx.serialization.json.JsonElement;

/* compiled from: TreeJsonEncoder.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlinx/serialization/json/JsonElement;", "it", "Lkotlin/G0;", "invoke", "(Lkotlinx/serialization/json/JsonElement;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes8.dex */
final class q0 extends kotlin.jvm.internal.N implements Y41.l<JsonElement, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.h<JsonElement> f413126l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(l0.h<JsonElement> hVar) {
        super(1);
        this.f413126l = hVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlinx.serialization.json.JsonElement] */
    @Override // Y41.l
    public final G0 invoke(JsonElement jsonElement) {
        this.f413126l.f406842b = jsonElement;
        return G0.f406611a;
    }
}
