package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import kotlin.Metadata;

/* compiled from: ComposeInputMethodManager.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/v;", "Landroidx/compose/foundation/text/input/internal/u;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.input.internal.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C20945v extends AbstractC20943u {

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public BaseInputConnection f31481c;

    @Override // androidx.compose.foundation.text.input.internal.InterfaceC20941t
    public void sendKeyEvent(@Y61.k KeyEvent keyEvent) {
        BaseInputConnection baseInputConnection = this.f31481c;
        if (baseInputConnection == null) {
            baseInputConnection = new BaseInputConnection(this.f31461a, false);
            this.f31481c = baseInputConnection;
        }
        baseInputConnection.sendKeyEvent(keyEvent);
    }
}
