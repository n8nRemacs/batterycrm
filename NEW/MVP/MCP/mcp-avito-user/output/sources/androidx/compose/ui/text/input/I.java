package androidx.compose.ui.text.input;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import kotlin.Metadata;

/* compiled from: NullableInputConnectionWrapper.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0013\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/I;", "Landroidx/compose/ui/text/input/H;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@j.X
/* loaded from: classes.dex */
class I extends H {
    public I() {
        throw null;
    }

    @Override // androidx.compose.ui.text.input.G, android.view.inputmethod.InputConnection
    public final boolean commitContent(@Y61.k InputContentInfo inputContentInfo, int i12, @Y61.l Bundle bundle) {
        InputConnection inputConnection = this.f42357b;
        if (inputConnection != null) {
            return inputConnection.commitContent(inputContentInfo, i12, bundle);
        }
        return false;
    }
}
