package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes2.dex */
public interface g2h {
    Uri a();

    long b();

    long c();

    default boolean d() {
        Uri uriA = a();
        String str = zxg.a;
        String scheme = uriA.getScheme();
        return TextUtils.isEmpty(scheme) || Objects.equals(scheme, "file");
    }

    default g2h e(long j) {
        return this;
    }

    default ry f() {
        return null;
    }

    boolean g();

    String getContentType();

    long getDuration();

    int getHeight();

    int getType();

    int getWidth();

    long h();

    long i();
}
