package kotlinx.serialization;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.X;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.collections.D0;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.d;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractC43393b;

/* compiled from: SealedSerializer.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/r;", "", "T", "Lkotlinx/serialization/internal/b;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC43389h
/* loaded from: classes8.dex */
public final class r<T> extends AbstractC43393b<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.d<T> f413170a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<? extends Annotation> f413171b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Object f413172c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Map<kotlin.reflect.d<? extends T>, KSerializer<? extends T>> f413173d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f413174e;

    /* compiled from: SealedSerializer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "T", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<SerialDescriptor> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f413175l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ r<T> f413176m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, r<T> rVar) {
            super(0);
            this.f413175l = str;
            this.f413176m = rVar;
        }

        @Override // Y41.a
        public final SerialDescriptor invoke() {
            q qVar = new q(this.f413176m);
            return kotlinx.serialization.descriptors.n.c(this.f413175l, d.b.f412718a, new SerialDescriptor[0], qVar);
        }
    }

    /* compiled from: _Collections.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlin/collections/u0", "Lkotlin/collections/D0;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements D0<Map.Entry<? extends kotlin.reflect.d<? extends T>, ? extends KSerializer<? extends T>>, String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterable f413177a;

        public b(Iterable iterable) {
            this.f413177a = iterable;
        }
    }

    public r(@Y61.k String str, @Y61.k kotlin.reflect.d<T> dVar, @Y61.k kotlin.reflect.d<? extends T>[] dVarArr, @Y61.k KSerializer<? extends T>[] kSerializerArr) {
        this.f413170a = dVar;
        this.f413171b = C42784z0.f406748b;
        this.f413172c = C42727D.b(LazyThreadSafetyMode.f406615c, new a(str, this));
        if (dVarArr.length != kSerializerArr.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + dVar.l0() + " should be marked @Serializable");
        }
        Map<kotlin.reflect.d<? extends T>, KSerializer<? extends T>> mapP = P0.p(C42756l.n0(dVarArr, kSerializerArr));
        this.f413173d = mapP;
        Set<Map.Entry<kotlin.reflect.d<? extends T>, KSerializer<? extends T>>> setEntrySet = mapP.entrySet();
        new b(setEntrySet);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t12 : setEntrySet) {
            String f412728a = ((KSerializer) ((Map.Entry) t12).getValue()).getF412706c().getF412796b();
            Object obj = linkedHashMap.get(f412728a);
            if (obj == null) {
                linkedHashMap.containsKey(f412728a);
            }
            Map.Entry entry = (Map.Entry) t12;
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + this.f413170a + "' have the same serial name '" + f412728a + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(f412728a, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(P0.f(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (KSerializer) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.f413174e = linkedHashMap2;
    }

    @Override // kotlinx.serialization.internal.AbstractC43393b
    @Y61.l
    public final InterfaceC43386e<T> a(@Y61.k kotlinx.serialization.encoding.c cVar, @Y61.l String str) {
        KSerializer kSerializer = (KSerializer) this.f413174e.get(str);
        return kSerializer != null ? kSerializer : super.a(cVar, str);
    }

    @Override // kotlinx.serialization.internal.AbstractC43393b
    @Y61.l
    public final x<T> b(@Y61.k Encoder encoder, @Y61.k T t12) {
        KSerializer<? extends T> kSerializerB = this.f413173d.get(m0.f406844a.b(t12.getClass()));
        if (kSerializerB == null) {
            kSerializerB = super.b(encoder, t12);
        }
        if (kSerializerB != null) {
            return kSerializerB;
        }
        return null;
    }

    @Override // kotlinx.serialization.internal.AbstractC43393b
    @Y61.k
    public final kotlin.reflect.d<T> c() {
        return this.f413170a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF412706c() {
        return (SerialDescriptor) this.f413172c.getValue();
    }

    @X
    public r(@Y61.k String str, @Y61.k kotlin.reflect.d<T> dVar, @Y61.k kotlin.reflect.d<? extends T>[] dVarArr, @Y61.k KSerializer<? extends T>[] kSerializerArr, @Y61.k Annotation[] annotationArr) {
        this(str, dVar, dVarArr, kSerializerArr);
        this.f413171b = Arrays.asList(annotationArr);
    }
}
