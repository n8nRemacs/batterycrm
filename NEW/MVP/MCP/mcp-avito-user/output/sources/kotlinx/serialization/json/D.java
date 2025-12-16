package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.X;
import kotlin.jvm.internal.m0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.e;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: JsonElementSerializers.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/json/D;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonPrimitive;", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X
/* loaded from: classes8.dex */
public final class D implements KSerializer<JsonPrimitive> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final D f412941a = new D();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final kotlinx.serialization.descriptors.f f412942b = kotlinx.serialization.descriptors.n.c("kotlinx.serialization.json.JsonPrimitive", e.i.f412727a, new SerialDescriptor[0], kotlinx.serialization.descriptors.m.f412748l);

    @Override // kotlinx.serialization.InterfaceC43386e
    public final Object deserialize(Decoder decoder) {
        JsonElement jsonElementI = s.a(decoder).i();
        if (jsonElementI instanceof JsonPrimitive) {
            return (JsonPrimitive) jsonElementI;
        }
        StringBuilder sb2 = new StringBuilder("Unexpected JSON element, expected JsonPrimitive, had ");
        throw kotlinx.serialization.json.internal.D.d(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, jsonElementI.getClass(), sb2), jsonElementI.toString(), -1);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF412706c() {
        return f412942b;
    }

    @Override // kotlinx.serialization.x
    public final void serialize(Encoder encoder, Object obj) {
        JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
        s.b(encoder);
        if (jsonPrimitive instanceof JsonNull) {
            encoder.f(A.f412929a, JsonNull.INSTANCE);
        } else {
            encoder.f(x.f413145a, (w) jsonPrimitive);
        }
    }
}
