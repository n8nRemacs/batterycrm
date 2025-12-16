package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public abstract class n4a {
    public static o4a a(byte[] bArr) throws ProtoException {
        try {
            Tasks.MsgDelete msgDelete = (Tasks.MsgDelete) fl9.mergeFrom(new Tasks.MsgDelete(), bArr);
            return new o4a(msgDelete.requestId, msgDelete.chatId, msgDelete.chatServerId, ys.C(msgDelete.messagesId), ys.C(msgDelete.messagesServerId), !l8g.c(msgDelete.complaint) ? sj3.a(msgDelete.complaint) : null, msgDelete.forMe, r8j.j(rs4.d, Integer.valueOf(msgDelete.itemTypeId)), msgDelete.notDeleteMessageFromDb);
        } catch (InvalidProtocolBufferNanoException e) {
            throw new ProtoException(e);
        }
    }
}
