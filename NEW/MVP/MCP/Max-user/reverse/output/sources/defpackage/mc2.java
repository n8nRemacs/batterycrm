package defpackage;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class mc2 extends sj0 {
    public final long b;
    public final List c;
    public final Map d;

    public mc2(long j, long j2, List list, Map map) {
        super(j);
        this.b = j2;
        this.c = list;
        this.d = map;
    }

    @Override // defpackage.sj0
    public final String toString() {
        return "ChatBotCommandsEvent{chatId=" + this.b + ", botCommands count=" + this.c.size() + ", botsInfoMap count=" + this.d.size() + "} " + super.toString();
    }
}
