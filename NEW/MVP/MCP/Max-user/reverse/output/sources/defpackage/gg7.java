package defpackage;

import java.util.Collection;

/* loaded from: classes.dex */
public abstract class gg7 extends ah7 {
    @Override // defpackage.ah7
    public final ng7 d() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.ah7
    /* renamed from: h */
    public final ng7 values() {
        return ((yjd) this).Z.keySet();
    }

    @Override // defpackage.ah7, java.util.Map
    public final Collection values() {
        return ((yjd) this).Z.keySet();
    }
}
