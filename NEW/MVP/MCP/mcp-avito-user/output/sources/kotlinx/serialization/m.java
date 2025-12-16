package kotlinx.serialization;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.X;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.d;
import kotlinx.serialization.internal.AbstractC43393b;

/* compiled from: PolymorphicSerializer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/m;", "", "T", "Lkotlinx/serialization/internal/b;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class m<T> extends AbstractC43393b<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.d<T> f413149a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public List<? extends Annotation> f413150b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Object f413151c;

    /* compiled from: PolymorphicSerializer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "T", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<SerialDescriptor> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ m<T> f413152l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m<T> mVar) {
            super(0);
            this.f413152l = mVar;
        }

        @Override // Y41.a
        public final SerialDescriptor invoke() {
            m<T> mVar = this.f413152l;
            return kotlinx.serialization.descriptors.b.b(kotlinx.serialization.descriptors.n.c("kotlinx.serialization.Polymorphic", d.a.f412717a, new SerialDescriptor[0], new l(mVar)), mVar.f413149a);
        }
    }

    @X
    public m() {
        throw null;
    }

    public m(@Y61.k kotlin.reflect.d<T> dVar) {
        this.f413149a = dVar;
        this.f413150b = C42784z0.f406748b;
        this.f413151c = C42727D.b(LazyThreadSafetyMode.f406615c, new a(this));
    }

    @Override // kotlinx.serialization.internal.AbstractC43393b
    @Y61.k
    public final kotlin.reflect.d<T> c() {
        return this.f413149a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF412706c() {
        return (SerialDescriptor) this.f413151c.getValue();
    }

    @Y61.k
    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.f413149a + ')';
    }
}
