package V71;

import java.io.Serializable;

/* compiled from: EndsWith.java */
/* loaded from: classes7.dex */
public class j implements org.mockito.d<String>, Serializable {
    @Override // org.mockito.d
    public final boolean b(String str) {
        String str2 = str;
        return str2 != null && str2.endsWith(null);
    }

    public final String toString() {
        return "endsWith(\"null\")";
    }
}
