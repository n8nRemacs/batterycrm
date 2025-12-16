package defpackage;

import android.content.Context;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final /* synthetic */ class c02 {
    public static s7c a(Context context, Object obj, LinkedHashSet linkedHashSet) throws InitializationException {
        try {
            return new s7c(context, obj, linkedHashSet);
        } catch (CameraUnavailableException e) {
            throw new InitializationException(e);
        }
    }
}
