package V71;

import java.io.Serializable;

/* compiled from: EqualsWithDelta.java */
/* loaded from: classes7.dex */
public class m implements org.mockito.d<Number>, Serializable {
    @Override // org.mockito.d
    public final boolean b(Number number) {
        Number number2 = number;
        if (number2 != null) {
            return false;
        }
        if (number2 == null) {
            return true;
        }
        throw null;
    }

    public final String toString() {
        return "eq(null, null)";
    }
}
