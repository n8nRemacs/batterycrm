package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import kotlin.Metadata;

/* compiled from: TextFieldKeyEventHandler.android.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j1 {
    public static final boolean a(int i12, KeyEvent keyEvent) {
        return ((int) (androidx.compose.ui.input.key.e.a(keyEvent) >> 32)) == i12;
    }

    public static final boolean b(@Y61.k KeyEvent keyEvent) {
        return (keyEvent.getFlags() & 2) == 2;
    }
}
