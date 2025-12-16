package e11;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* loaded from: classes7.dex */
public class V0 extends AbstractC39860d0 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f394490b = false;

    public final void g(@j.N Context context) {
        ContentResolver contentResolver;
        String id2 = null;
        try {
            id2 = AdvertisingIdClient.getAdvertisingIdInfo(context).getId();
            int i12 = !AdvertisingIdClient.getAdvertisingIdInfo(context).isLimitAdTrackingEnabled() ? 1 : 0;
            a("advertising_id", id2);
            a("advertising_tracking_enabled", i12 + "");
        } catch (Throwable th2) {
            th2.getMessage();
        }
        if (((id2 == null || id2.length() == 0) ? false : !id2.matches("^[0]+(-[0]+)+$")) || (contentResolver = context.getContentResolver()) == null) {
            return;
        }
        String string = Settings.Secure.getString(contentResolver, "android_id");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        a("android_id", string);
    }

    @j.l0
    public final synchronized void h(@j.N Context context) {
        if (m2.b()) {
            return;
        }
        if (this.f394490b) {
            return;
        }
        g(context);
        this.f394490b = true;
    }
}
