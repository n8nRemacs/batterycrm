package com.avito.avcalls.android.signaling.proto;

import Y61.k;
import com.avito.avcalls.android.signaling.proto.IncomingMessage;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.EnumDescriptor;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;

/* compiled from: IncomingMessage.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/avito/avcalls/android/signaling/proto/IncomingMessage.IncomingMessageType.$serializer", "Lkotlinx/serialization/internal/N;", "Lcom/avito/avcalls/android/signaling/proto/IncomingMessage$IncomingMessageType;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/avito/avcalls/android/signaling/proto/IncomingMessage$IncomingMessageType;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/avito/avcalls/android/signaling/proto/IncomingMessage$IncomingMessageType;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes5.dex */
public final class IncomingMessage$IncomingMessageType$$serializer implements N<IncomingMessage.IncomingMessageType> {

    @k
    public static final IncomingMessage$IncomingMessageType$$serializer INSTANCE = new IncomingMessage$IncomingMessageType$$serializer();
    private static final /* synthetic */ EnumDescriptor descriptor;

    static {
        EnumDescriptor enumDescriptor = new EnumDescriptor("com.avito.avcalls.android.signaling.proto.IncomingMessage.IncomingMessageType", 3);
        enumDescriptor.j("voip.push", false);
        enumDescriptor.j("voip.msg", false);
        enumDescriptor.j("NOOP", false);
        descriptor = enumDescriptor;
    }

    private IncomingMessage$IncomingMessageType$$serializer() {
    }

    @Override // kotlinx.serialization.internal.N
    @k
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[0];
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    @k
    public IncomingMessage.IncomingMessageType deserialize(@k Decoder decoder) {
        return IncomingMessage.IncomingMessageType.values()[decoder.h(getF412706c())];
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @k
    /* renamed from: getDescriptor */
    public SerialDescriptor getF412706c() {
        return descriptor;
    }

    @Override // kotlinx.serialization.x
    public void serialize(@k Encoder encoder, @k IncomingMessage.IncomingMessageType value) {
        encoder.g(getF412706c(), value.ordinal());
    }

    @Override // kotlinx.serialization.internal.N
    @k
    public KSerializer<?>[] typeParametersSerializers() {
        return G0.f412773a;
    }
}
