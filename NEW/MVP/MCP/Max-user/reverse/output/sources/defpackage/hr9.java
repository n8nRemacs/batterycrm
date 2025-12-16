package defpackage;

import java.util.ArrayList;
import java.util.List;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public final class hr9 implements nr9 {
    public static final hr9 d = new hr9(hd5.a, true, true);
    public final List a;
    public final boolean b;
    public final boolean c;

    public hr9(List list, boolean z, boolean z2) {
        this.a = list;
        this.b = z;
        this.c = z2;
    }

    public static String a(MessageModel messageModel) {
        if (messageModel == null) {
            return "null";
        }
        long j = messageModel.a;
        long j2 = messageModel.b;
        long j3 = messageModel.c;
        StringBuilder sbL = az1.l(j, "MessageModel(messageId=", ", serverId=");
        sbL.append(j2);
        return u45.i(j3, ", sortTime=", ")", sbL);
    }

    @Override // defpackage.nr9
    public final List b() {
        return this.a;
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.a) {
            if (((MessageModel) obj).Y == ghh.X) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hr9)) {
            return false;
        }
        hr9 hr9Var = (hr9) obj;
        return fni.a(this.a, hr9Var.a) && this.b == hr9Var.b && this.c == hr9Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + a9h.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        List list = this.a;
        int size = list.size();
        String strA = a((MessageModel) ue3.I(list));
        String strA2 = a((MessageModel) ue3.Q(list));
        StringBuilder sbP = ho7.p("\n        MessagesList(\n            hasNext=", this.b, ",\n            hasPrev=", this.c, ",\n            messages=Messages(size=");
        sbP.append(size);
        sbP.append(", first=");
        sbP.append(strA);
        sbP.append(", last=");
        sbP.append(strA2);
        sbP.append(")\n        ) \n        ");
        return wmf.d(sbP.toString());
    }
}
