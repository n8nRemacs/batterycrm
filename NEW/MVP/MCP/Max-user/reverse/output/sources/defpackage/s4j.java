package defpackage;

import android.net.Uri;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class s4j {
    public static int a(int i) {
        int[] iArr = mjb.$EnumSwitchMapping$0;
        int i2 = iArr[az1.v(3)];
        if (3 == i) {
            return 0;
        }
        if (i2 == 4) {
            int i3 = iArr[az1.v(i)];
            if (i3 == 1) {
                return 180;
            }
            if (i3 != 2) {
                return i3 != 3 ? 0 : 90;
            }
            return -90;
        }
        if (i2 == 2) {
            int i4 = iArr[az1.v(i)];
            if (i4 == 1) {
                return -90;
            }
            if (i4 != 3) {
                return i4 != 4 ? 0 : 90;
            }
            return 180;
        }
        if (i2 == 1) {
            int i5 = iArr[az1.v(i)];
            if (i5 == 2) {
                return 90;
            }
            if (i5 != 3) {
                return i5 != 4 ? 0 : 180;
            }
            return -90;
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i6 = iArr[az1.v(i)];
        if (i6 == 1) {
            return 90;
        }
        if (i6 != 2) {
            return i6 != 4 ? 0 : -90;
        }
        return 180;
    }

    public static Uri b(Uri uri) {
        if (uri.getQueryParameter("CMCD") == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        for (String str : uri.getQueryParameterNames()) {
            if (!str.equals("CMCD")) {
                Iterator<String> it = uri.getQueryParameters(str).iterator();
                while (it.hasNext()) {
                    builderBuildUpon.appendQueryParameter(str, it.next());
                }
            }
        }
        return builderBuildUpon.build();
    }
}
