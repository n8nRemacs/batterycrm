package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.a;

/* loaded from: classes2.dex */
public abstract class t4a {
    public static u4a a(byte[] bArr) throws ProtoException {
        try {
            Tasks.MsgEdit msgEdit = (Tasks.MsgEdit) fl9.mergeFrom(new Tasks.MsgEdit(), bArr);
            Protos.Attaches attaches = msgEdit.oldAttaches;
            List list = attaches != null ? (List) a.e(attaches).b : null;
            Protos.MessageElements messageElements = msgEdit.oldElements;
            ArrayList arrayListA = messageElements != null ? dj9.a(messageElements.elements) : null;
            long j = msgEdit.requestId;
            long j2 = msgEdit.chatId;
            long j3 = msgEdit.messageId;
            long j4 = msgEdit.chatServerId;
            long j5 = msgEdit.messageServerId;
            String str = msgEdit.text;
            String str2 = msgEdit.oldText;
            int i = msgEdit.oldStatus;
            jm9[] jm9VarArrValues = jm9.values();
            int length = jm9VarArrValues.length;
            int i2 = 0;
            while (i2 < length) {
                int i3 = i2;
                jm9 jm9Var = jm9VarArrValues[i3];
                int i4 = length;
                if (jm9Var.a == i) {
                    return new u4a(j, j2, j3, j4, j5, str, str2, jm9Var, list, arrayListA, msgEdit.editAttaches);
                }
                i2 = i3 + 1;
                length = i4;
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (InvalidProtocolBufferNanoException e) {
            throw new ProtoException(e);
        }
    }
}
