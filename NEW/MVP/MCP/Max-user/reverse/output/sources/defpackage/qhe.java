package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public abstract class qhe {
    public static rhe a(byte[] bArr) throws ProtoException {
        try {
            Tasks.SyncChatHistory syncChatHistory = (Tasks.SyncChatHistory) fl9.mergeFrom(new Tasks.SyncChatHistory(), bArr);
            rhe rheVar = new rhe(syncChatHistory.taskId, syncChatHistory.chatId, syncChatHistory.count, r8j.j(rs4.d, Integer.valueOf(syncChatHistory.itemTypeId)));
            wqi.c(rheVar.X, "parseFrom", new Object[0]);
            return rheVar;
        } catch (InvalidProtocolBufferNanoException e) {
            throw new ProtoException(e);
        }
    }
}
