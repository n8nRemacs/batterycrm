package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class hu extends sj0 {
    public final int b;
    public final List c;

    public hu(int i, long j, List list) {
        super(j);
        this.b = i;
        this.c = list;
    }

    @Override // defpackage.sj0
    public final String toString() {
        return "AssetsGetByIdsEvent{type=" + az1.w(this.b) + ", ids=" + this.c + '}';
    }
}
