package V71;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: Find.java */
/* loaded from: classes7.dex */
public class n implements org.mockito.d<String>, Serializable {
    @Override // org.mockito.d
    public final boolean b(String str) {
        String str2 = str;
        return str2 != null && Pattern.compile(null).matcher(str2).find();
    }

    public final String toString() {
        throw null;
    }
}
