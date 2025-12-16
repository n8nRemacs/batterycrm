package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public abstract class wo5 {
    public static xo5 a(byte[] bArr) throws ProtoException {
        try {
            Tasks.ExternalVideoSend externalVideoSend = (Tasks.ExternalVideoSend) fl9.mergeFrom(new Tasks.ExternalVideoSend(), bArr);
            return new xo5(externalVideoSend.requestId, externalVideoSend.externalUrl, externalVideoSend.attachLocalId, externalVideoSend.messageId, externalVideoSend.chatId, externalVideoSend.stickerId);
        } catch (InvalidProtocolBufferNanoException e) {
            throw new ProtoException(e);
        }
    }
}
