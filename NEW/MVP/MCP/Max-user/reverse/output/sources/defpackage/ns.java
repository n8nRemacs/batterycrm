package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public final class ns extends k2 {
    public final transient int X;

    public ns() {
        super(wi3.a(12));
        u4j.a(3, "expectedValuesPerKey");
        this.X = 3;
    }

    @Override // defpackage.k2
    public final Collection d() {
        return new ArrayList(this.X);
    }
}
