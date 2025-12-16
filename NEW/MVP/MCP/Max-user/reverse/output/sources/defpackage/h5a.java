package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.Iterator;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public abstract class h5a {
    public static j5a a(byte[] bArr) throws ProtoException {
        j5a j5aVar;
        j5a j5aVar2;
        Object next;
        try {
            Tasks.MsgReact msgReact = (Tasks.MsgReact) fl9.mergeFrom(new Tasks.MsgReact(), bArr);
            long j = msgReact.requestId;
            long j2 = msgReact.chatId;
            long j3 = msgReact.messageId;
            long j4 = msgReact.chatServerId;
            long j5 = msgReact.messageServerId;
            int i = msgReact.reactionType;
            Iterator it = vl9.d.iterator();
            while (true) {
                f2 f2Var = (f2) it;
                if (!f2Var.hasNext()) {
                    j5aVar2 = j5aVar;
                    next = null;
                    break;
                }
                next = f2Var.next();
                j5aVar2 = j5aVar;
                if (((vl9) next).a == i) {
                    break;
                }
                j5aVar = j5aVar2;
            }
            vl9 vl9Var = (vl9) next;
            if (vl9Var != null) {
                return new j5a(j, j2, j3, j4, j5, new ql9(vl9Var, msgReact.reaction));
            }
            throw new IllegalArgumentException(ho7.f(i, "Unknown reactionType = "));
        } catch (InvalidProtocolBufferNanoException e) {
            throw new ProtoException(e);
        }
    }
}
