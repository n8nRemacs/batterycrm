package ru.cyberity.cbr.core.data.serializer;

import Y61.k;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.e;
import kotlinx.serialization.descriptors.n;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.y;
import ru.cyberity.cbr.core.data.model.FlowActionType;

/* compiled from: FlowActionTypeSerializer.kt */
@y
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/cyberity/cbr/core/data/serializer/FlowActionTypeSerializer;", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/FlowActionType;", "<init>", "()V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/FlowActionType;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/FlowActionType;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class FlowActionTypeSerializer implements KSerializer<FlowActionType> {

    @k
    public static final FlowActionTypeSerializer INSTANCE = new FlowActionTypeSerializer();

    @k
    private static final SerialDescriptor descriptor = n.a("com.sumsub.sns.internal.core.data.serializer.FlowActionTypeSerializer", e.i.f412727a);

    private FlowActionTypeSerializer() {
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @k
    /* renamed from: getDescriptor */
    public SerialDescriptor getF332717a() {
        return descriptor;
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    @k
    public FlowActionType deserialize(@k Decoder decoder) {
        return FlowActionType.INSTANCE.get(decoder.w());
    }

    @Override // kotlinx.serialization.x
    public void serialize(@k Encoder encoder, @k FlowActionType value) {
        encoder.b(value.getValue());
    }
}
