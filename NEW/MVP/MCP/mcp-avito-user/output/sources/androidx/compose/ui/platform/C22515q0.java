package androidx.compose.ui.platform;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import androidx.compose.ui.unit.u;
import kotlin.Metadata;

/* compiled from: AndroidWindowInfo.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22515q0 {
    public static final long a(@Y61.k AndroidComposeView androidComposeView) {
        Activity activity;
        Context context = androidComposeView.getContext();
        Context baseContext = context;
        while (true) {
            if (!(baseContext instanceof Activity)) {
                if (!(baseContext instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            } else {
                activity = (Activity) baseContext;
                break;
            }
        }
        if (activity == null) {
            Configuration configuration = context.getResources().getConfiguration();
            float f12 = context.getResources().getDisplayMetrics().density;
            long jRound = (Math.round(configuration.screenHeightDp * f12) & 4294967295L) | (Math.round(configuration.screenWidthDp * f12) << 32);
            u.a aVar = androidx.compose.ui.unit.u.f42871b;
            return jRound;
        }
        InterfaceC22530u0.f41605a.getClass();
        int i12 = Build.VERSION.SDK_INT;
        Rect rectA = (i12 >= 30 ? C22550z0.f41668b : i12 >= 29 ? C22546y0.f41641b : i12 >= 28 ? C22542x0.f41637b : C22538w0.f41635b).a(activity);
        long jHeight = (rectA.height() & 4294967295L) | (rectA.width() << 32);
        u.a aVar2 = androidx.compose.ui.unit.u.f42871b;
        return jHeight;
    }
}
