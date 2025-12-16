package defpackage;

import android.os.Handler;
import android.os.Looper;
import ru.ok.android.externcalls.sdk.AudioLevelListener;

/* loaded from: classes2.dex */
public final class zih extends AudioLevelListener {
    public zih(xtd xtdVar) {
        super((short) 500, new Handler(Looper.getMainLooper()), new m1h(6, xtdVar));
    }
}
