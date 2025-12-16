package defpackage;

import java.io.File;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class cy5 implements zde {
    public final File a;
    public final int b = 2;

    public cy5(File file) {
        this.a = file;
    }

    @Override // defpackage.zde
    public final Iterator iterator() {
        return new ay5(this);
    }
}
