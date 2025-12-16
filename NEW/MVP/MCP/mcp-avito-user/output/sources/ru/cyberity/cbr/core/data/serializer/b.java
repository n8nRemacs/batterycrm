package ru.cyberity.cbr.core.data.serializer;

import Y41.l;
import Y61.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.e;
import kotlinx.serialization.descriptors.n;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.B;
import kotlinx.serialization.json.C43444b;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.h;
import kotlinx.serialization.json.t;
import ru.cyberity.cbr.core.common.s;

/* compiled from: JsonAsAnySerializer.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\b\u001a\u00020\u0007*\u00020\n2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002¢\u0006\u0004\b\b\u0010\rJ#\u0010\b\u001a\u00020\u0007*\u00020\u000e2\u000e\u0010\u0010\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000fH\u0002¢\u0006\u0004\b\b\u0010\u0011J\u0015\u0010\b\u001a\u0004\u0018\u00010\u0002*\u00020\u0012H\u0002¢\u0006\u0004\b\b\u0010\u0013J\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\b\u0010\u0016J\u001f\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00020\u000f*\u00020\u0017H\u0002¢\u0006\u0004\b\b\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!R\u001a\u0010'\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/cyberity/cbr/core/data/serializer/b;", "Lkotlinx/serialization/KSerializer;", "", "<init>", "()V", "Lkotlinx/serialization/json/t;", "encoder", "Lkotlin/G0;", "a", "(Ljava/lang/Object;Lkotlinx/serialization/json/t;)V", "Lkotlinx/serialization/json/b;", "", "list", "(Lkotlinx/serialization/json/b;Ljava/util/Collection;)V", "Lkotlinx/serialization/json/B;", "", "map", "(Lkotlinx/serialization/json/B;Ljava/util/Map;)V", "Lkotlinx/serialization/json/JsonElement;", "(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;", "Lkotlinx/serialization/json/JsonArray;", "", "(Lkotlinx/serialization/json/JsonArray;)Ljava/util/List;", "Lkotlinx/serialization/json/JsonObject;", "", "(Lkotlinx/serialization/json/JsonObject;)Ljava/util/Map;", "Lkotlinx/serialization/encoding/Encoder;", "value", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "b", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class b implements KSerializer<Object> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f433428a = new b();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private static final SerialDescriptor descriptor = n.a("JsonAsAnySerializer", e.i.f412727a);

    /* compiled from: JsonAsAnySerializer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/serialization/json/b;", "Lkotlin/G0;", "a", "(Lkotlinx/serialization/json/b;)V"}, k = 3, mv = {1, 7, 1})
    public static final class a extends N implements l<C43444b, G0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f433430a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj) {
            super(1);
            this.f433430a = obj;
        }

        public final void a(@k C43444b c43444b) {
            b.f433428a.a(c43444b, (Collection<?>) this.f433430a);
        }

        @Override // Y41.l
        public /* bridge */ /* synthetic */ G0 invoke(C43444b c43444b) {
            a(c43444b);
            return G0.f406611a;
        }
    }

    /* compiled from: JsonAsAnySerializer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/serialization/json/B;", "Lkotlin/G0;", "a", "(Lkotlinx/serialization/json/B;)V"}, k = 3, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.data.serializer.b$b, reason: collision with other inner class name */
    public static final class C12465b extends N implements l<B, G0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f433431a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12465b(Object obj) {
            super(1);
            this.f433431a = obj;
        }

        public final void a(@k B b12) {
            b.f433428a.a(b12, (Map<?, ?>) this.f433431a);
        }

        @Override // Y41.l
        public /* bridge */ /* synthetic */ G0 invoke(B b12) {
            a(b12);
            return G0.f406611a;
        }
    }

    private b() {
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    @k
    public Object deserialize(@k Decoder decoder) {
        if (!(decoder instanceof h)) {
            throw new IllegalStateException("JsonAsAnySerializer decoder is not JsonDecoder");
        }
        JsonElement jsonElementI = ((h) decoder).i();
        Object objA = a(jsonElementI);
        return objA == null ? jsonElementI.toString() : objA;
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @k
    /* renamed from: getDescriptor */
    public SerialDescriptor getF332717a() {
        return descriptor;
    }

    @Override // kotlinx.serialization.x
    public void serialize(@k Encoder encoder, @k Object value) {
        t tVar = encoder instanceof t ? (t) encoder : null;
        if (tVar == null) {
            return;
        }
        a(value, tVar);
    }

    private final void a(Object obj, t tVar) {
        if (obj instanceof String) {
            tVar.b((String) obj);
            return;
        }
        if (obj instanceof Integer) {
            tVar.m(((Number) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            tVar.r(((Number) obj).longValue());
            return;
        }
        if (obj instanceof Float) {
            tVar.y(((Number) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            tVar.B(((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof Short) {
            tVar.i(((Number) obj).shortValue());
            return;
        }
        if (obj instanceof Boolean) {
            tVar.j(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Collection) {
            C43444b c43444b = new C43444b();
            f433428a.a(c43444b, (Collection<?>) obj);
            tVar.z(new JsonArray(c43444b.f412958a));
        } else if (obj instanceof Map) {
            B b12 = new B();
            f433428a.a(b12, (Map<?, ?>) obj);
            tVar.z(new JsonObject(b12.f412931a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C43444b c43444b, Collection<?> collection) {
        Iterator it = C42745f0.C(collection).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof String) {
                c43444b.f412958a.add(kotlinx.serialization.json.k.c((String) next));
            } else if (next instanceof Number) {
                c43444b.f412958a.add(kotlinx.serialization.json.k.b((Number) next));
            } else if (next instanceof Boolean) {
                c43444b.f412958a.add(kotlinx.serialization.json.k.a((Boolean) next));
            } else if (next instanceof Collection) {
                C43444b c43444b2 = new C43444b();
                f433428a.a(c43444b2, (Collection<?>) next);
                c43444b.f412958a.add(new JsonArray(c43444b2.f412958a));
            } else if (next instanceof Map) {
                B b12 = new B();
                f433428a.a(b12, (Map<?, ?>) next);
                c43444b.f412958a.add(new JsonObject(b12.f412931a));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(kotlinx.serialization.json.JsonElement r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kotlinx.serialization.json.JsonNull
            r1 = 0
            if (r0 == 0) goto L7
            goto Lcc
        L7:
            boolean r0 = r7 instanceof kotlinx.serialization.json.JsonPrimitive
            if (r0 == 0) goto Lb7
            kotlinx.serialization.json.JsonPrimitive r7 = (kotlinx.serialization.json.JsonPrimitive) r7
            boolean r0 = r7.getF413142b()
            if (r0 == 0) goto L1a
            java.lang.String r7 = r7.getF413144d()
        L17:
            r1 = r7
            goto L8f
        L1a:
            kotlinx.serialization.internal.T r0 = kotlinx.serialization.json.k.f413132a
            kotlinx.serialization.json.internal.m0 r0 = new kotlinx.serialization.json.internal.m0     // Catch: kotlinx.serialization.json.internal.JsonDecodingException -> L2e
            java.lang.String r2 = r7.getF413144d()     // Catch: kotlinx.serialization.json.internal.JsonDecodingException -> L2e
            r0.<init>(r2)     // Catch: kotlinx.serialization.json.internal.JsonDecodingException -> L2e
            long r2 = r0.i()     // Catch: kotlinx.serialization.json.internal.JsonDecodingException -> L2e
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch: kotlinx.serialization.json.internal.JsonDecodingException -> L2e
            goto L2f
        L2e:
            r0 = r1
        L2f:
            if (r0 == 0) goto L49
            long r2 = r0.longValue()
            r4 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L49
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L49
            int r0 = (int) r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L4a
        L49:
            r0 = r1
        L4a:
            if (r0 != 0) goto L8e
            kotlinx.serialization.json.internal.m0 r0 = new kotlinx.serialization.json.internal.m0     // Catch: kotlinx.serialization.json.internal.JsonDecodingException -> L5e
            java.lang.String r2 = r7.getF413144d()     // Catch: kotlinx.serialization.json.internal.JsonDecodingException -> L5e
            r0.<init>(r2)     // Catch: kotlinx.serialization.json.internal.JsonDecodingException -> L5e
            long r2 = r0.i()     // Catch: kotlinx.serialization.json.internal.JsonDecodingException -> L5e
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch: kotlinx.serialization.json.internal.JsonDecodingException -> L5e
            goto L5f
        L5e:
            r0 = r1
        L5f:
            if (r0 != 0) goto L8e
            java.lang.String r0 = r7.getF413144d()
            java.lang.Double r0 = kotlin.text.C43066x.w0(r0)
            if (r0 != 0) goto L8e
            java.lang.String r0 = r7.getF413144d()
            java.lang.String[] r2 = kotlinx.serialization.json.internal.n0.f413114a
            java.lang.String r2 = "true"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L7c
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto L86
        L7c:
            java.lang.String r2 = "false"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L86
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
        L86:
            if (r1 != 0) goto L8d
            java.lang.String r7 = r7.getF413144d()
            goto L17
        L8d:
            r0 = r1
        L8e:
            r1 = r0
        L8f:
            boolean r7 = r1 instanceof java.lang.Double
            if (r7 == 0) goto Lcc
            r7 = r1
            java.lang.Number r7 = (java.lang.Number) r7
            double r2 = r7.doubleValue()
            r4 = 5183643170566569984(0x47efffffe0000000, double:3.4028234663852886E38)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto Lcc
            double r2 = r7.doubleValue()
            r4 = 3936146074321813504(0x36a0000000000000, double:1.401298464324817E-45)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto Lcc
            double r0 = r7.doubleValue()
            float r7 = (float) r0
            java.lang.Float r1 = java.lang.Float.valueOf(r7)
            goto Lcc
        Lb7:
            boolean r0 = r7 instanceof kotlinx.serialization.json.JsonObject
            if (r0 == 0) goto Lc2
            kotlinx.serialization.json.JsonObject r7 = (kotlinx.serialization.json.JsonObject) r7
            java.util.Map r1 = r6.a(r7)
            goto Lcc
        Lc2:
            boolean r0 = r7 instanceof kotlinx.serialization.json.JsonArray
            if (r0 == 0) goto Lcc
            kotlinx.serialization.json.JsonArray r7 = (kotlinx.serialization.json.JsonArray) r7
            java.util.List r1 = r6.a(r7)
        Lcc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.serializer.b.a(kotlinx.serialization.json.JsonElement):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(B b12, Map<?, ?> map) {
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key instanceof String) {
                if (value instanceof String) {
                    JsonPrimitive jsonPrimitiveC = kotlinx.serialization.json.k.c((String) value);
                } else if (value instanceof Number) {
                    JsonPrimitive jsonPrimitiveB = kotlinx.serialization.json.k.b((Number) value);
                } else if (value instanceof Boolean) {
                    JsonPrimitive jsonPrimitiveA = kotlinx.serialization.json.k.a((Boolean) value);
                } else if (value instanceof Collection) {
                    a aVar = new a(value);
                    C43444b c43444b = new C43444b();
                    aVar.invoke(c43444b);
                    JsonArray jsonArray = new JsonArray(c43444b.f412958a);
                } else if (value instanceof Map) {
                    C12465b c12465b = new C12465b(value);
                    B b13 = new B();
                    c12465b.invoke(b13);
                    JsonObject jsonObject = new JsonObject(b13.f412931a);
                }
            }
        }
    }

    private final List<Object> a(JsonArray jsonArray) {
        ArrayList arrayList = new ArrayList();
        Iterator<JsonElement> it = jsonArray.iterator();
        while (it.hasNext()) {
            Object objA = f433428a.a(it.next());
            if (objA != null) {
                arrayList.add(objA);
            }
        }
        return arrayList;
    }

    private final Map<String, Object> a(JsonObject jsonObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(jsonObject.size()));
        Iterator<T> it = jsonObject.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), f433428a.a((JsonElement) entry.getValue()));
        }
        return s.a((Map) linkedHashMap);
    }
}
