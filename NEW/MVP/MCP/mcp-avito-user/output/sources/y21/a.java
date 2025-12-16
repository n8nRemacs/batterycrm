package Y21;

import X41.n;
import Y61.k;
import android.os.Build;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: UserAgent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LY21/a;", "", "<init>", "()V", "core-utils_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f19287a = new a();

    @n
    @k
    public static final String a(@k String str) {
        StringBuilder sbZ = r.z(str, "/5.3.0.45003240 (");
        f19287a.getClass();
        String strR = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        if (!C43066x.h0(strR, str2, false)) {
            strR = r.r(str2, " ", strR);
        }
        sbZ.append(C43066x.n(strR, Locale.US));
        sbZ.append("; Android ");
        return C22026a.c(sbZ, Build.VERSION.RELEASE, ')');
    }
}
