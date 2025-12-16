package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlin.text.f0;
import kotlin.w0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.e;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.L0;
import kotlinx.serialization.internal.j1;

/* compiled from: JsonElementSerializers.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/json/x;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/w;", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class x implements KSerializer<w> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final x f413145a = new x();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final L0 f413146b = kotlinx.serialization.descriptors.n.a("kotlinx.serialization.json.JsonLiteral", e.i.f412727a);

    @Override // kotlinx.serialization.InterfaceC43386e
    public final Object deserialize(Decoder decoder) {
        JsonElement jsonElementI = s.a(decoder).i();
        if (jsonElementI instanceof w) {
            return (w) jsonElementI;
        }
        StringBuilder sb2 = new StringBuilder("Unexpected JSON element, expected JsonLiteral, had ");
        throw kotlinx.serialization.json.internal.D.d(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, jsonElementI.getClass(), sb2), jsonElementI.toString(), -1);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF412706c() {
        return f413146b;
    }

    @Override // kotlinx.serialization.x
    public final void serialize(Encoder encoder, Object obj) {
        w wVar = (w) obj;
        s.b(encoder);
        String str = wVar.f413144d;
        if (wVar.f413142b) {
            encoder.b(str);
            return;
        }
        SerialDescriptor serialDescriptor = wVar.f413143c;
        if (serialDescriptor != null) {
            encoder.h(serialDescriptor).b(str);
            return;
        }
        Long lZ02 = C43066x.z0(str);
        if (lZ02 != null) {
            encoder.r(lZ02.longValue());
            return;
        }
        w0 w0VarE = f0.e(str);
        if (w0VarE != null) {
            int i12 = w0.f410662c;
            j1.f412874a.getClass();
            encoder.h(j1.f412875b).r(w0VarE.f410663b);
            return;
        }
        Double dW02 = C43066x.w0(str);
        if (dW02 != null) {
            encoder.B(dW02.doubleValue());
            return;
        }
        Boolean boolV0 = C43066x.v0(str);
        if (boolV0 != null) {
            encoder.j(boolV0.booleanValue());
        } else {
            encoder.b(str);
        }
    }
}
