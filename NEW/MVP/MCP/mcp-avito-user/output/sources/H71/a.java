package H71;

import Y71.l;
import java.util.regex.Pattern;
import junit.framework.ComparisonFailure;

/* compiled from: ArgumentsAreDifferent.java */
/* loaded from: classes7.dex */
public class a extends ComparisonFailure {
    private static final long serialVersionUID = 1;

    public final String getMessage() {
        return null;
    }

    public final String toString() {
        String string = super/*java.lang.Object*/.toString();
        Pattern pattern = l.f19338a;
        return string.replaceFirst(".*?\n", "");
    }
}
