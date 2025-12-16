package defpackage;

import java.util.List;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public final class mye implements pr9 {
    public final MessageModel a;
    public final List b;
    public final boolean c;

    public mye(MessageModel messageModel, List list, boolean z) {
        this.a = messageModel;
        this.b = list;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mye)) {
            return false;
        }
        mye myeVar = (mye) obj;
        return fni.a(this.a, myeVar.a) && fni.a(this.b, myeVar.b) && this.c == myeVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xrf.l(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowMessageContextMenu(message=");
        sb.append(this.a);
        sb.append(", actions=");
        sb.append(this.b);
        sb.append(", showReactionsSelector=");
        return az1.k(sb, this.c, ")");
    }
}
