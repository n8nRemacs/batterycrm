package androidx.compose.foundation.text;

import android.view.KeyEvent;
import kotlin.Metadata;

/* compiled from: TextFieldKeyInput.android.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.x2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21070x2 {
    public static final boolean a(@Y61.k KeyEvent keyEvent) {
        return keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar());
    }
}
