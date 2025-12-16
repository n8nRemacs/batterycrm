package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public class dhe extends fhe {
    public final List g;
    public String h;
    public List i;
    public boolean j;

    public dhe(long j, List list) {
        super(j);
        this.g = list;
    }

    @Override // defpackage.fhe
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ehe a() {
        return new ehe(this);
    }
}
