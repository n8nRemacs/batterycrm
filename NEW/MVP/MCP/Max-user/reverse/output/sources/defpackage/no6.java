package defpackage;

import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;

/* loaded from: classes2.dex */
public final class no6 extends oo6 {
    public static final no6 e = new no6("_size > 0");
    public static final Uri f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;

    static {
        Uri contentUri;
        if (Build.VERSION.SDK_INT >= 29) {
            contentUri = MediaStore.Video.Media.getContentUri("external");
            if (contentUri == null) {
                throw new IllegalArgumentException("no content uri for MediaStore.Video.Media");
            }
        } else {
            contentUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        }
        f = contentUri;
        g = "_id";
        h = "bucket_id";
        i = "bucket_display_name";
        j = "_data";
        k = "date_modified";
        l = "mime_type";
        m = "duration";
        n = "video/mp4";
    }

    @Override // defpackage.oo6
    public final String a() {
        return i;
    }

    @Override // defpackage.oo6
    public final String b() {
        return h;
    }

    @Override // defpackage.oo6
    public final String c() {
        return j;
    }

    @Override // defpackage.oo6
    public final String d() {
        return k;
    }

    @Override // defpackage.oo6
    public final String e() {
        return m;
    }

    @Override // defpackage.oo6
    public final String f() {
        return g;
    }

    @Override // defpackage.oo6
    public final String h() {
        return l;
    }

    @Override // defpackage.oo6
    public final Uri j() {
        return f;
    }

    @Override // defpackage.oo6
    public final String k() {
        return n;
    }
}
