package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class ux3 extends sj0 {
    public final int b;
    public final Object c;

    public ux3(int i, long j, List list) {
        super(j);
        this.b = i;
        this.c = list;
    }

    @Override // defpackage.sj0
    public final String toString() {
        StringBuilder sbN = az1.n("ContactListEvent{status=", "BLOCKED", ", from=");
        sbN.append(this.b);
        sbN.append(", count=40, contactIds=");
        sbN.append(this.c);
        sbN.append('}');
        return sbN.toString();
    }
}
