package kotlinx.serialization.modules;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;
import kotlinx.serialization.InterfaceC43386e;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.o;
import kotlinx.serialization.descriptors.p;
import kotlinx.serialization.json.internal.e0;
import kotlinx.serialization.modules.a;
import kotlinx.serialization.x;

/* compiled from: SerializersModule.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/modules/d;", "Lkotlinx/serialization/modules/f;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class d extends f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f413156a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final Object f413157b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Object f413158c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Object f413159d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Object f413160e;

    public d(@Y61.k Map<kotlin.reflect.d<?>, ? extends a> map, @Y61.k Map<kotlin.reflect.d<?>, ? extends Map<kotlin.reflect.d<?>, ? extends KSerializer<?>>> map2, @Y61.k Map<kotlin.reflect.d<?>, ? extends Y41.l<?, ? extends x<?>>> map3, @Y61.k Map<kotlin.reflect.d<?>, ? extends Map<String, ? extends KSerializer<?>>> map4, @Y61.k Map<kotlin.reflect.d<?>, ? extends Y41.l<? super String, ? extends InterfaceC43386e<?>>> map5) {
        super(null);
        this.f413156a = map;
        this.f413157b = map2;
        this.f413158c = map3;
        this.f413159d = map4;
        this.f413160e = map5;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, java.util.Map] */
    @Override // kotlinx.serialization.modules.f
    public final void a(@Y61.k e0 e0Var) {
        for (Map.Entry entry : this.f413156a.entrySet()) {
            a aVar = (a) entry.getValue();
            if (aVar instanceof a.C11759a) {
                new k(((a.C11759a) aVar).f413153a);
            } else if (aVar instanceof a.b) {
                ((a.b) aVar).getClass();
            }
        }
        for (Map.Entry entry2 : this.f413157b.entrySet()) {
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                kotlin.reflect.d dVar = (kotlin.reflect.d) entry3.getKey();
                SerialDescriptor f332717a = ((KSerializer) entry3.getValue()).getF332717a();
                o kind = f332717a.getF412729b();
                if ((kind instanceof kotlinx.serialization.descriptors.d) || L.f(kind, o.a.f412749a)) {
                    throw new IllegalArgumentException("Serializer for " + dVar.l0() + " can't be registered as a subclass for polymorphic serialization because its kind " + kind + " is not concrete. To work with multiple hierarchies, register it as a base class.");
                }
                boolean z12 = e0Var.f413078a;
                if (!z12 && (L.f(kind, p.b.f412752a) || L.f(kind, p.c.f412753a) || (kind instanceof kotlinx.serialization.descriptors.e) || (kind instanceof o.b))) {
                    throw new IllegalArgumentException("Serializer for " + dVar.l0() + " of kind " + kind + " cannot be serialized polymorphically with class discriminator.");
                }
                if (!z12) {
                    int iC2 = f332717a.getF412730c();
                    for (int i12 = 0; i12 < iC2; i12++) {
                        String strD = f332717a.d(i12);
                        if (L.f(strD, e0Var.f413079b)) {
                            throw new IllegalArgumentException("Polymorphic serializer for " + dVar + " has property '" + strD + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                        }
                    }
                }
            }
        }
        for (Map.Entry entry4 : this.f413158c.entrySet()) {
            v0.e(1, (Y41.l) entry4.getValue());
        }
        for (Map.Entry entry5 : this.f413160e.entrySet()) {
            v0.e(1, (Y41.l) entry5.getValue());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // kotlinx.serialization.modules.f
    @Y61.l
    public final <T> KSerializer<T> b(@Y61.k kotlin.reflect.d<T> dVar, @Y61.k List<? extends KSerializer<?>> list) {
        a aVar = (a) this.f413156a.get(dVar);
        KSerializer<?> kSerializerA = aVar != null ? aVar.a(list) : null;
        if (kSerializerA != null) {
            return (KSerializer<T>) kSerializerA;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    @Override // kotlinx.serialization.modules.f
    @Y61.l
    public final InterfaceC43386e c(@Y61.l String str, @Y61.k kotlin.reflect.d dVar) {
        Map map = (Map) this.f413159d.get(dVar);
        KSerializer kSerializer = map != null ? (KSerializer) map.get(str) : null;
        if (kSerializer == null) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        Object obj = this.f413160e.get(dVar);
        Y41.l lVar = v0.f(1, obj) ? (Y41.l) obj : null;
        if (lVar != null) {
            return (InterfaceC43386e) lVar.invoke(str);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.Map] */
    @Override // kotlinx.serialization.modules.f
    @Y61.l
    public final <T> x<T> d(@Y61.k kotlin.reflect.d<? super T> dVar, @Y61.k T t12) {
        if (!dVar.n0(t12)) {
            return null;
        }
        Map map = (Map) this.f413157b.get(dVar);
        KSerializer kSerializer = map != null ? (KSerializer) map.get(m0.f406844a.b(t12.getClass())) : null;
        if (kSerializer == null) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        Object obj = this.f413158c.get(dVar);
        Y41.l lVar = v0.f(1, obj) ? (Y41.l) obj : null;
        if (lVar != null) {
            return (x) lVar.invoke(t12);
        }
        return null;
    }
}
