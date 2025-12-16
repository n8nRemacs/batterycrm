package defpackage;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class m8j {
    public static m1j a;

    public static final void a(View view) {
        char c = view.getContext().getResources().getConfiguration().getLayoutDirection() != 1 ? (char) 2 : (char) 1;
        int i = 1;
        if (c != 1) {
            if (c != 2) {
                throw null;
            }
            i = 0;
        }
        view.setLayoutDirection(i);
    }

    public static Uri b(String str) {
        Uri.Builder builderEncodedPath = new Uri.Builder().scheme("max").encodedAuthority(null).encodedPath(vmf.X(str, "?").toLowerCase(Locale.ROOT));
        StringBuilder sb = new StringBuilder();
        int iD = vmf.D(str, "?", 0, false, 6);
        String strSubstring = iD == -1 ? "" : str.substring(iD + 1, str.length());
        int length = strSubstring.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (strSubstring.charAt(i2) == '=') {
                to7 to7VarH = n7j.h(i, i2);
                sb.append(strSubstring.substring(to7VarH.a, to7VarH.b + 1).toLowerCase(Locale.ROOT));
            } else if (strSubstring.charAt(i2) == '&') {
                to7 to7VarH2 = n7j.h(i, i2);
                sb.append(strSubstring.substring(to7VarH2.a, to7VarH2.b + 1));
            } else {
                if (i2 == strSubstring.length() - 1) {
                    to7 to7VarH3 = n7j.h(i, i2 + 1);
                    sb.append(strSubstring.substring(to7VarH3.a, to7VarH3.b + 1));
                }
            }
            i = i2;
        }
        return builderEncodedPath.encodedQuery(sb.toString()).build();
    }

    public static final int c(View view) {
        return d(view) ? view.getRight() : view.getLeft();
    }

    public static final boolean d(View view) {
        return view.getContext().getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public static final void e(View view, ViewGroup viewGroup, int i, int i2, int i3, int i4) {
        if (d(view)) {
            view.layout(viewGroup.getMeasuredWidth() - i3, i2, viewGroup.getMeasuredWidth() - i, i4);
        } else {
            view.layout(i, i2, i3, i4);
        }
    }
}
