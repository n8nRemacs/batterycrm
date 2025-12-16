package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public abstract class xz2 {
    public static yz2 a(byte[] bArr) throws ProtoException {
        try {
            Tasks.ChatUpdate chatUpdate = (Tasks.ChatUpdate) fl9.mergeFrom(new Tasks.ChatUpdate(), bArr);
            Tasks.Rect rect = chatUpdate.crop;
            return new yz2(chatUpdate.requestId, chatUpdate.chatId, chatUpdate.chatServerId, 0, null, false, chatUpdate.descriptionIsNull ? null : chatUpdate.description, null, chatUpdate.themeIsNull ? null : chatUpdate.theme, chatUpdate.photoTokenIsNull ? null : chatUpdate.photoToken, rect != null ? new n10(rect.left, rect.top, rect.right, rect.bottom, 2) : null, chatUpdate.pinMessageIdIsNull ? null : Long.valueOf(chatUpdate.pinMessageId), chatUpdate.notifyPin, 0L);
        } catch (InvalidProtocolBufferNanoException e) {
            throw new ProtoException(e);
        }
    }
}
