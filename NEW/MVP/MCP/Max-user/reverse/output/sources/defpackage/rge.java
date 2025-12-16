package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class rge extends fhe {
    public final long g;
    public final String h;
    public final Object i;

    public rge(long j, String str, List list, long j2) {
        super(j2);
        this.g = j;
        this.h = str;
        this.i = list;
    }

    @Override // defpackage.fhe
    public final ghe a() {
        return new sge(this);
    }
}
