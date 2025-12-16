package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: Tuples.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/internal/z0;", "K", "V", "Lkotlinx/serialization/internal/c0;", "Lkotlin/Q;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* renamed from: kotlinx.serialization.internal.z0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43441z0<K, V> extends AbstractC43396c0<K, V, kotlin.Q<? extends K, ? extends V>> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final kotlinx.serialization.descriptors.f f412926c;

    /* compiled from: Tuples.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"K", "V", "Lkotlinx/serialization/descriptors/a;", "Lkotlin/G0;", "invoke", "(Lkotlinx/serialization/descriptors/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kotlinx.serialization.internal.z0$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<kotlinx.serialization.descriptors.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ KSerializer<K> f412927l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ KSerializer<V> f412928m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
            super(1);
            this.f412927l = kSerializer;
            this.f412928m = kSerializer2;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(kotlinx.serialization.descriptors.a aVar) {
            kotlinx.serialization.descriptors.a aVar2 = aVar;
            kotlinx.serialization.descriptors.a.b(aVar2, "first", this.f412927l.getF412706c());
            kotlinx.serialization.descriptors.a.b(aVar2, "second", this.f412928m.getF412706c());
            return kotlin.G0.f406611a;
        }
    }

    public C43441z0(@Y61.k KSerializer<K> kSerializer, @Y61.k KSerializer<V> kSerializer2) {
        super(kSerializer, kSerializer2, null);
        this.f412926c = kotlinx.serialization.descriptors.n.b("kotlin.Pair", new SerialDescriptor[0], new a(kSerializer, kSerializer2));
    }

    @Override // kotlinx.serialization.internal.AbstractC43396c0
    public final Object a(Object obj) {
        return ((kotlin.Q) obj).f406619b;
    }

    @Override // kotlinx.serialization.internal.AbstractC43396c0
    public final Object b(Object obj) {
        return ((kotlin.Q) obj).f406620c;
    }

    @Override // kotlinx.serialization.internal.AbstractC43396c0
    public final Object c(Object obj, Object obj2) {
        return new kotlin.Q(obj, obj2);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF412706c() {
        return this.f412926c;
    }
}
