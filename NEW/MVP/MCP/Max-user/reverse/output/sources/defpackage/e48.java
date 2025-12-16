package defpackage;

import android.app.Activity;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import com.bluelinelabs.conductor.internal.AndroidXLifecycleHandlerImpl;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class e48 {
    public static final LinkedHashMap a = new LinkedHashMap();

    public static final AndroidXLifecycleHandlerImpl a(Activity activity, boolean z) {
        AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl = (AndroidXLifecycleHandlerImpl) a.get(activity);
        if (androidXLifecycleHandlerImpl == null) {
            androidXLifecycleHandlerImpl = null;
            if (z && (activity instanceof b)) {
                a aVarD = ((b) activity).z().D("LifecycleHandler");
                if (aVarD instanceof AndroidXLifecycleHandlerImpl) {
                    androidXLifecycleHandlerImpl = (AndroidXLifecycleHandlerImpl) aVarD;
                }
            } else {
                activity.getFragmentManager().findFragmentByTag("LifecycleHandler");
            }
        }
        if (androidXLifecycleHandlerImpl != null) {
            androidXLifecycleHandlerImpl.u0(activity);
        }
        return androidXLifecycleHandlerImpl;
    }
}
