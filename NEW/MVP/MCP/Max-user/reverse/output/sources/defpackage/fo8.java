package defpackage;

import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public final class fo8 {
    public pb2 a;
    public int b;
    public si9 c;
    public MessageModel d;
    public d7c e;
    public Object f = hd5.a;

    public final go8 a(em6 em6Var) {
        em6Var.invoke(this);
        pb2 pb2Var = this.a;
        if (pb2Var == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int i = this.b;
        d7c d7cVar = this.e;
        if (d7cVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        go8 go8Var = new go8(pb2Var, d7cVar, i);
        si9 si9Var = this.c;
        if (si9Var != null) {
            yy7 yy7Var = go8.h[0];
            go8Var.d.b = si9Var;
        }
        MessageModel messageModel = this.d;
        if (messageModel != null) {
            yy7 yy7Var2 = go8.h[1];
            go8Var.e.b = messageModel;
        }
        Object obj = this.f;
        yy7 yy7Var3 = go8.h[3];
        go8Var.g.b = obj;
        return go8Var;
    }
}
