package androidx.compose.ui.text.input;

import android.os.Handler;
import android.view.inputmethod.InputConnection;
import kotlin.Metadata;

/* compiled from: NullableInputConnectionWrapper.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0013\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/H;", "Landroidx/compose/ui/text/input/G;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@j.X
/* loaded from: classes.dex */
class H extends G {
    public H() {
        throw null;
    }

    @Override // androidx.compose.ui.text.input.G
    public final void b(@Y61.k InputConnection inputConnection) {
        inputConnection.closeConnection();
    }

    @Override // androidx.compose.ui.text.input.G, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i12, int i13) {
        InputConnection inputConnection = this.f42357b;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingTextInCodePoints(i12, i13);
        }
        return false;
    }

    @Override // androidx.compose.ui.text.input.G, android.view.inputmethod.InputConnection
    @Y61.l
    public final Handler getHandler() {
        InputConnection inputConnection = this.f42357b;
        if (inputConnection != null) {
            return inputConnection.getHandler();
        }
        return null;
    }
}
