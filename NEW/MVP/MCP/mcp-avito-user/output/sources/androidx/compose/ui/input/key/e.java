package androidx.compose.ui.input.key;

import android.view.KeyEvent;
import kotlin.Metadata;

/* compiled from: KeyEvent.android.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\n\u0010\u0001\"\u00020\u00002\u00020\u0000¨\u0006\u0002"}, d2 = {"Landroid/view/KeyEvent;", "NativeKeyEvent", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e {
    public static final long a(@Y61.k KeyEvent keyEvent) {
        return i.a(keyEvent.getKeyCode());
    }

    public static final int b(@Y61.k KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action == 0) {
            d.f40069b.getClass();
            return d.f40071d;
        }
        if (action != 1) {
            d.f40069b.getClass();
            return 0;
        }
        d.f40069b.getClass();
        return d.f40070c;
    }
}
