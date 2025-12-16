package androidx.window.area.reflectionguard;

import android.app.Activity;
import androidx.annotation.RestrictTo;
import androidx.window.extensions.core.util.function.Consumer;
import j.N;

@RestrictTo
/* loaded from: classes10.dex */
public interface WindowAreaComponentApi2Requirements {
    void addRearDisplayStatusListener(@N Consumer<Integer> consumer);

    void endRearDisplaySession();

    void removeRearDisplayStatusListener(@N Consumer<Integer> consumer);

    void startRearDisplaySession(@N Activity activity, @N Consumer<Integer> consumer);
}
