package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import kotlin.Metadata;

/* compiled from: ComposeInputMethodManager.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0013\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/w;", "Landroidx/compose/foundation/text/input/internal/v;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@j.X
/* renamed from: androidx.compose.foundation.text.input.internal.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C20947w extends C20945v {
    @Override // androidx.compose.foundation.text.input.internal.C20945v, androidx.compose.foundation.text.input.internal.InterfaceC20941t
    public final void sendKeyEvent(@Y61.k KeyEvent keyEvent) {
        f().dispatchKeyEventFromInputMethod(this.f31461a, keyEvent);
    }
}
