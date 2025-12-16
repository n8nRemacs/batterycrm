package G71;

import Y71.l;
import java.util.regex.Pattern;

/* compiled from: WantedButNotInvoked.java */
/* loaded from: classes7.dex */
public class h extends E71.a {
    private static final long serialVersionUID = 1;

    @Override // java.lang.Throwable
    public final String toString() {
        String string = super.toString();
        Pattern pattern = l.f19338a;
        return string.replaceFirst(".*?\n", "");
    }
}
