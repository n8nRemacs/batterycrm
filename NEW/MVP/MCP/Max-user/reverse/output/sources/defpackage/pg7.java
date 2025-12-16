package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class pg7 extends b3 implements Serializable {
    public final Object b;
    public final Object c;

    public pg7(Object obj, Object obj2) {
        super(false, 0);
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
