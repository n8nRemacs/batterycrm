package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.a;

/* loaded from: classes2.dex */
public final class ky9 {
    public final k18 a;

    public ky9(k18 k18Var) {
        this.a = k18Var;
    }

    public static jdc a(byte[] bArr) throws ProtoException {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        try {
            byte[] bArr2 = a.a;
            try {
                return a.e(Protos.Attaches.parseFrom(bArr));
            } catch (InvalidProtocolBufferNanoException e) {
                throw new ProtoException(e);
            }
        } catch (ProtoException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static xi9 b(int i) {
        Object next;
        Iterator it = xi9.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((xi9) next).a == i) {
                break;
            }
        }
        xi9 xi9Var = (xi9) next;
        if (xi9Var != null) {
            return xi9Var;
        }
        throw new IllegalArgumentException(wy1.e(i, "No such value ", " for MessageStatus"));
    }

    public static List c(byte[] bArr) {
        try {
            Protos.MessageElements messageElements = new Protos.MessageElements();
            fl9.mergeFrom(messageElements, bArr);
            return dj9.a(messageElements.elements);
        } catch (InvalidProtocolBufferNanoException e) {
            wqi.e("MessagesTypeConverters", "InvalidProtocolBufferNanoException", e);
            return hd5.a;
        }
    }

    public static jm9 d(int i) {
        for (jm9 jm9Var : jm9.values()) {
            if (jm9Var.a == i) {
                return jm9Var;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static int e(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 10) {
            return 2;
        }
        if (i == 20) {
            return 3;
        }
        if (i != 30) {
            return i != 40 ? 2 : 5;
        }
        return 4;
    }

    public static byte[] g(xl9 xl9Var) {
        if (xl9Var == null) {
            return null;
        }
        byte[] bArr = a.a;
        Protos.MessageReactions messageReactions = new Protos.MessageReactions();
        List list = xl9Var.a;
        f9d f9dVar = xl9Var.c;
        int size = list.size();
        Protos.MessageReactionWithCount[] messageReactionWithCountArr = new Protos.MessageReactionWithCount[size];
        for (int i = 0; i < size; i++) {
            wl9 wl9Var = (wl9) list.get(i);
            Protos.MessageReactionWithCount messageReactionWithCount = new Protos.MessageReactionWithCount();
            Protos.ReactionData reactionData = new Protos.ReactionData();
            reactionData.reaction = wl9Var.a.b.a.toString();
            reactionData.type = wl9Var.a.a.a;
            messageReactionWithCount.count = wl9Var.b;
            messageReactionWithCount.reaction = reactionData;
            messageReactionWithCountArr[i] = messageReactionWithCount;
        }
        messageReactions.reactions = messageReactionWithCountArr;
        messageReactions.totalCount = xl9Var.b;
        if (f9dVar != null) {
            Protos.ReactionData reactionData2 = new Protos.ReactionData();
            reactionData2.reaction = f9dVar.b.a.toString();
            reactionData2.type = f9dVar.a.a;
            messageReactions.yourReaction = reactionData2;
        }
        return fl9.toByteArray(messageReactions);
    }

    public final xl9 f(byte[] bArr) {
        yl9 yl9Var = (yl9) this.a.getValue();
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        try {
            return yl9Var.a(bArr);
        } catch (ProtoException e) {
            throw new RuntimeException(e);
        }
    }
}
