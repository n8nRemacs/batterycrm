package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class q4a extends sj0 {
    public final rs4 X;
    public final long b;
    public final long c;
    public final long d;
    public final List o;

    public q4a(long j, List list, rs4 rs4Var) {
        this.b = j;
        this.X = rs4Var;
        this.c = 0L;
        this.d = 0L;
        this.o = list;
    }

    @Override // defpackage.sj0
    public final String toString() {
        return "MsgDeleteEvent{chatId=" + this.b + ", startTime=" + this.c + ", endTime=" + this.d + ", messageIds=" + this.o.size() + ", itemType=" + this.X + '}';
    }

    public q4a(long j, long j2, long j3, rs4 rs4Var) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.o = new ArrayList();
        this.X = rs4Var;
    }
}
