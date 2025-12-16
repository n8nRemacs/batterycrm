package kotlinx.serialization.json;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.X;
import kotlin.jvm.internal.N;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.d;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: JsonElementSerializers.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/json/q;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonElement;", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X
/* loaded from: classes8.dex */
public final class q implements KSerializer<JsonElement> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final q f413138a = new q();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final kotlinx.serialization.descriptors.f f413139b = kotlinx.serialization.descriptors.n.c("kotlinx.serialization.json.JsonElement", d.b.f412718a, new SerialDescriptor[0], a.f413140l);

    /* compiled from: JsonElementSerializers.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/serialization/descriptors/a;", "Lkotlin/G0;", "invoke", "(Lkotlinx/serialization/descriptors/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<kotlinx.serialization.descriptors.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f413140l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(kotlinx.serialization.descriptors.a aVar) {
            kotlinx.serialization.descriptors.a aVar2 = aVar;
            kotlinx.serialization.descriptors.a.b(aVar2, "JsonPrimitive", new r(l.f413133l));
            kotlinx.serialization.descriptors.a.b(aVar2, "JsonNull", new r(m.f413134l));
            kotlinx.serialization.descriptors.a.b(aVar2, "JsonLiteral", new r(n.f413135l));
            kotlinx.serialization.descriptors.a.b(aVar2, "JsonObject", new r(o.f413136l));
            kotlinx.serialization.descriptors.a.b(aVar2, "JsonArray", new r(p.f413137l));
            return G0.f406611a;
        }
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    public final Object deserialize(Decoder decoder) {
        return s.a(decoder).i();
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF332717a() {
        return f413139b;
    }

    @Override // kotlinx.serialization.x
    public final void serialize(Encoder encoder, Object obj) {
        JsonElement jsonElement = (JsonElement) obj;
        s.b(encoder);
        if (jsonElement instanceof JsonPrimitive) {
            encoder.f(D.f412941a, jsonElement);
        } else if (jsonElement instanceof JsonObject) {
            encoder.f(C.f412932a, jsonElement);
        } else if (jsonElement instanceof JsonArray) {
            encoder.f(C43445c.f412959a, jsonElement);
        }
    }
}
