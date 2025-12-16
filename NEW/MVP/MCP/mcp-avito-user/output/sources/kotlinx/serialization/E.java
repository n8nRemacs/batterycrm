package kotlinx.serialization;

import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Serializers.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/reflect/g;", "invoke", "()Lkotlin/reflect/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes8.dex */
final class E extends N implements Y41.a<kotlin.reflect.g> {
    static {
        new E();
    }

    public E() {
        super(0);
    }

    @Override // Y41.a
    public final kotlin.reflect.g invoke() {
        throw new SerializationException("It is not possible to retrieve an array serializer using KClass alone, use KType instead or ArraySerializer factory");
    }
}
