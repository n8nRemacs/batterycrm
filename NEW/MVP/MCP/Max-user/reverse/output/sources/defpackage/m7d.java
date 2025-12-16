package defpackage;

import java.util.function.Supplier;

/* loaded from: classes.dex */
public final class m7d implements Supplier {
    public long a;

    @Override // java.util.function.Supplier
    public final Object get() {
        long j = this.a;
        this.a = j - 1;
        return Long.valueOf(j);
    }
}
