package defpackage;

import java.util.Map;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public final class tn3 implements Map.Entry, py7 {
    public final Object a;
    public final Object b;

    public tn3(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Symbol symbol = wn3.a;
        throw new UnsupportedOperationException("not implemented");
    }
}
