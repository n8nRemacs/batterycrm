package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Date;

/* loaded from: classes2.dex */
public interface d1e {
    public static final c1e a = c1e.a;

    static void e(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(uri);
        intent.addFlags(1);
        try {
            context.sendBroadcast(intent);
        } catch (Exception e) {
            c1e c1eVar = c1e.a;
            wqi.e(c1e.b, "sendBroadcastToGallery: failed for uri " + uri, e);
        }
    }

    Uri a(e1e e1eVar, String str);

    Uri b(e1e e1eVar, String str);

    default String c() {
        c28 c28VarD = d();
        Date date = new Date();
        c28VarD.getClass();
        return ho7.i("MOV_", c28.a(date), ".mp4");
    }

    c28 d();

    default String f(boolean z) {
        c28 c28VarD = d();
        Date date = new Date();
        c28VarD.getClass();
        return wy1.i("IMG_", c28.a(date), ".", z ? "gif" : "jpg");
    }
}
