package v01;

import android.content.Context;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.secure.android.common.ssl.i;
import com.huawei.secure.android.common.ssl.l;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

/* renamed from: v01.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C49137a {
    public static i a(Context context) {
        try {
            return new i(new l(context.getAssets().open(GrsApp.getInstance().getBrand("/") + "grs_sp.bks")));
        } catch (IOException | KeyManagementException | NoSuchAlgorithmException e12) {
            throw new AssertionError(e12);
        }
    }
}
