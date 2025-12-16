package defpackage;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class dfh {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static f34 b(View view, f34 f34Var) {
        ContentInfo contentInfoG = f34Var.a.g();
        Objects.requireNonNull(contentInfoG);
        ContentInfo contentInfoK = q20.k(contentInfoG);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoK);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoK ? f34Var : new f34(new ao6(contentInfoPerformReceiveContent));
    }

    public static void c(View view, String[] strArr, tva tvaVar) {
        if (tvaVar == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new efh(tvaVar));
        }
    }
}
