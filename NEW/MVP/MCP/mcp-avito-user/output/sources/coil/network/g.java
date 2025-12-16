package coil.network;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.net.ConnectivityManager;
import coil.util.o;
import coil.util.y;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: NetworkObserver.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g {
    @k
    public static final f a(@k Context context, @k y yVar, @l o oVar) {
        ConnectivityManager connectivityManager = (ConnectivityManager) androidx.core.content.d.getSystemService(context, ConnectivityManager.class);
        if (connectivityManager == null || androidx.core.content.d.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            if (oVar != null && oVar.f58787a <= 5) {
                oVar.a(5, "NetworkObserver", "Unable to register network observer.", null);
            }
            return new e();
        }
        try {
            return new i(connectivityManager, yVar);
        } catch (Exception e12) {
            if (oVar != null) {
                RuntimeException runtimeException = new RuntimeException("Failed to register network observer.", e12);
                if (oVar.f58787a <= 6) {
                    oVar.a(6, "NetworkObserver", null, runtimeException);
                }
            }
            return new e();
        }
    }
}
