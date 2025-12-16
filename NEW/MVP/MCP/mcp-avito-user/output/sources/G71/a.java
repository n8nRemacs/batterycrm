package G71;

import Y71.l;
import java.util.regex.Pattern;

/* compiled from: ArgumentsAreDifferent.java */
/* loaded from: classes7.dex */
public class a extends E71.a {
    private static final long serialVersionUID = 1;

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        Pattern pattern = l.f19338a;
        return message.replaceFirst(".*?\n", "");
    }
}
