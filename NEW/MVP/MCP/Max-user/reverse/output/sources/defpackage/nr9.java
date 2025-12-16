package defpackage;

import java.util.Iterator;
import java.util.List;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public interface nr9 {
    List b();

    default MessageModel e(long j) {
        Object next;
        Iterator it = b().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((MessageModel) next).a == j) {
                break;
            }
        }
        return (MessageModel) next;
    }

    default int f(long j) {
        List listB = b();
        int size = listB.size();
        ve3.n(listB.size(), size);
        int i = size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int iC = fni.c(((MessageModel) listB.get(i3)).c, j);
            if (iC < 0) {
                i2 = i3 + 1;
            } else {
                if (iC <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }
}
