package defpackage;

import android.text.Spannable;
import android.text.util.Linkify;
import android.widget.TextView;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class v88 {
    public static void a(TextView textView, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        Linkify.addLinks(textView, pattern, str, strArr, matchFilter, transformFilter);
    }

    public static boolean b(Spannable spannable, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        return Linkify.addLinks(spannable, pattern, str, strArr, matchFilter, transformFilter);
    }
}
