package androidx.window.area.reflectionguard;

import android.app.Activity;
import android.util.DisplayMetrics;
import androidx.annotation.RestrictTo;
import androidx.window.extensions.area.ExtensionWindowAreaPresentation;
import androidx.window.extensions.area.ExtensionWindowAreaStatus;
import androidx.window.extensions.core.util.function.Consumer;
import j.N;
import j.P;

@RestrictTo
/* loaded from: classes10.dex */
public interface WindowAreaComponentApi3Requirements extends WindowAreaComponentApi2Requirements {
    void addRearDisplayPresentationStatusListener(@N Consumer<ExtensionWindowAreaStatus> consumer);

    void endRearDisplayPresentationSession();

    @N
    DisplayMetrics getRearDisplayMetrics();

    @P
    ExtensionWindowAreaPresentation getRearDisplayPresentation();

    void removeRearDisplayPresentationStatusListener(@N Consumer<ExtensionWindowAreaStatus> consumer);

    void startRearDisplayPresentationSession(@N Activity activity, @N Consumer<Integer> consumer);
}
