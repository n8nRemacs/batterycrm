package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* loaded from: classes.dex */
public abstract class pui {
    public static final fr6 a(ti1 ti1Var, boolean z) {
        try {
            return paj.g(ti1Var, new JSONObject().put("sdk", new JSONObject().put("type", "bad-net").put(SdkMetricStatEvent.VALUE_KEY, z)));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean b(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display != null && display.isHdr()) {
            for (int i : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
