package defpackage;

/* loaded from: classes2.dex */
public final class ix4 {
    public final k18 a;

    public ix4(k18 k18Var) {
        this.a = k18Var;
    }

    public final void a(long j, Long l, Long l2) {
        wqi.c("ix4", "execute: chatId=" + l + ", contactId=" + l2 + ", serverTime=" + j, new Object[0]);
        k18 k18Var = this.a;
        pb2 pb2VarP = (l == null || l.longValue() == 0) ? (l2 == null || l2.longValue() == 0) ? null : ((ve2) k18Var.getValue()).P(l2.longValue()) : ((ve2) k18Var.getValue()).J(l.longValue());
        if (pb2VarP == null) {
            wqi.q("ix4", "Chat is null. Ignore", new Object[0]);
            return;
        }
        p3b p3bVar = pb2VarP.b.c0;
        if (p3bVar == null) {
            wqi.h("ix4", "draft is null, ignore", null);
            return;
        }
        Long lB = p3bVar.b();
        if ((lB != null ? lB.longValue() : 0L) > j) {
            wqi.q("ix4", "try to rewrite draft by old, ignore it!", new Object[0]);
        } else {
            wqi.c("ix4", "Discard server draft", new Object[0]);
            ((ve2) k18Var.getValue()).z(pb2VarP.a);
        }
    }
}
