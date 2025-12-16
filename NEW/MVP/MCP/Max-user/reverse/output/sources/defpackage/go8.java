package defpackage;

import java.util.List;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public final class go8 implements ho8, io8 {
    public static final /* synthetic */ yy7[] h = {new z8a(go8.class, "messageDb", "getMessageDb()Lru/ok/tamtam/messages/MessageDb;"), u45.h(vid.a, go8.class, "messageModel", "getMessageModel()Lone/me/messages/list/loader/MessageModel;"), new z8a(go8.class, "senderContact", "getSenderContact()Lru/ok/tamtam/contacts/Contact;"), new z8a(go8.class, "messageModels", "getMessageModels()Ljava/util/List;")};
    public final pb2 a;
    public final d7c b;
    public final int c;
    public final r5j d;
    public final r5j e;
    public final r5j f;
    public final r5j g;

    public go8(pb2 pb2Var, d7c d7cVar, int i) {
        this.a = pb2Var;
        this.b = d7cVar;
        this.c = i;
        int i2 = 29;
        boolean z = false;
        this.d = new r5j(i2, z);
        this.e = new r5j(i2, z);
        this.f = new r5j(i2, z);
        this.g = new r5j(i2, z);
    }

    public final si9 a() {
        return (si9) this.d.D(this, h[0]);
    }

    public final MessageModel b() {
        return (MessageModel) this.e.D(this, h[1]);
    }

    public final List c() {
        return (List) this.g.D(this, h[3]);
    }

    public final ku3 d() {
        return (ku3) this.f.D(this, h[2]);
    }
}
