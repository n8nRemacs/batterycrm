package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.m0;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: JsonElementSerializers.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-json"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class s {
    @Y61.k
    public static final h a(@Y61.k Decoder decoder) {
        h hVar = decoder instanceof h ? (h) decoder : null;
        if (hVar != null) {
            return hVar;
        }
        throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, decoder.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ")));
    }

    @Y61.k
    public static final t b(@Y61.k Encoder encoder) {
        t tVar = encoder instanceof t ? (t) encoder : null;
        if (tVar != null) {
            return tVar;
        }
        throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, encoder.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ")));
    }
}
