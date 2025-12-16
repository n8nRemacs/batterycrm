package androidx.compose.ui.text.input;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Metadata;

/* compiled from: NullableInputConnectionWrapper.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0013\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/J;", "Landroidx/compose/ui/text/input/I;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@j.X
/* loaded from: classes.dex */
class J extends I {
    public J() {
        throw null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(@Y61.k HandwritingGesture handwritingGesture, @Y61.l Executor executor, @Y61.l IntConsumer intConsumer) {
        InputConnection inputConnection = this.f42357b;
        if (inputConnection != null) {
            inputConnection.performHandwritingGesture(handwritingGesture, executor, intConsumer);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(@Y61.k PreviewableHandwritingGesture previewableHandwritingGesture, @Y61.l CancellationSignal cancellationSignal) {
        InputConnection inputConnection = this.f42357b;
        if (inputConnection != null) {
            return inputConnection.previewHandwritingGesture(previewableHandwritingGesture, cancellationSignal);
        }
        return false;
    }
}
