package defpackage;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public interface lp5 {
    gp5[] c();

    default gp5[] i(Uri uri, Map map) {
        return c();
    }
}
