package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class pge extends dhe {
    public final long k;

    public pge(long j, long j2, List list) {
        super(j2, list);
        this.k = j;
    }

    @Override // defpackage.dhe, defpackage.fhe
    public final ghe a() {
        return new qge(this);
    }

    @Override // defpackage.dhe
    /* renamed from: b */
    public final ehe a() {
        return new qge(this);
    }
}
