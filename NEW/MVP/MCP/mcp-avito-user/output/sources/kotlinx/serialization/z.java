package kotlinx.serialization;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SerializersCache.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/reflect/g;", "invoke", "()Lkotlin/reflect/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes8.dex */
final class z extends N implements Y41.a<kotlin.reflect.g> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<kotlin.reflect.r> f413178l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z(List<? extends kotlin.reflect.r> list) {
        super(0);
        this.f413178l = list;
    }

    @Override // Y41.a
    public final kotlin.reflect.g invoke() {
        return this.f413178l.get(0).K();
    }
}
