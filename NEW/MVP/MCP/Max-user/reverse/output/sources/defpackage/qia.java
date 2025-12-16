package defpackage;

import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.internal.b;

/* loaded from: classes.dex */
public final class qia implements zy7 {
    public static final qia a = new qia();
    public static final pia b = pia.a;

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        throw new SerializationException("'kotlin.Nothing' cannot be serialized");
    }

    @Override // defpackage.zy7
    public final Object b(lh4 lh4Var) {
        throw new SerializationException("'kotlin.Nothing' does not have instances");
    }

    @Override // defpackage.zy7
    public final ree d() {
        return b;
    }
}
