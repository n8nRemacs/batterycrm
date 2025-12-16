package e11;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes7.dex */
public class i2 {
    public static void a(@j.N String str, @j.N Context context) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        try {
            context.startActivity(intent);
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }
}
