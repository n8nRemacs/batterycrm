package defpackage;

import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class x6a implements crf, Serializable {
    public final int a;

    public x6a() {
        u4j.a(2, "expectedValuesPerKey");
        this.a = 2;
    }

    @Override // defpackage.crf
    public final Object get() {
        return new ArrayList(this.a);
    }
}
