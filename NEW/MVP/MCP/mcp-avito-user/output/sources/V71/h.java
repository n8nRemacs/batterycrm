package V71;

import java.io.Serializable;

/* compiled from: Contains.java */
/* loaded from: classes7.dex */
public class h implements org.mockito.d<String>, Serializable {
    @Override // org.mockito.d
    public final boolean b(String str) {
        String str2 = str;
        return str2 != null && str2.contains(null);
    }

    public final String toString() {
        return "contains(\"null\")";
    }
}
