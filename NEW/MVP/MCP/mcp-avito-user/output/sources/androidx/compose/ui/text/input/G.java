package androidx.compose.ui.text.input;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: NullableInputConnectionWrapper.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/G;", "Landroidx/compose/ui/text/input/F;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
class G implements F {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.l<F, G0> f42356a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public InputConnection f42357b;

    /* JADX WARN: Multi-variable type inference failed */
    public G(@Y61.k InputConnection inputConnection, @Y61.k Y41.l<? super F, G0> lVar) {
        this.f42356a = lVar;
        this.f42357b = inputConnection;
    }

    @Override // androidx.compose.ui.text.input.F
    public final void a() {
        InputConnection inputConnection = this.f42357b;
        if (inputConnection != null) {
            b(inputConnection);
            this.f42357b = null;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        InputConnection inputConnection = this.f42357b;
        if (inputConnection != null) {
            return inputConnection.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i12) {
        InputConnection inputConnection = this.f42357b;
        if (inputConnection != null) {
            return inputConnection.clearMetaKeyStates(i12);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        if (this.f42357b != null) {
            a();
            this.f42356a.invoke(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(@Y61.l CompletionInfo completionInfo) {
        InputConnection inputConnection = this.f42357b;
        if (inputConnection != null) {
            return inputConnection.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(@Y61.k InputContentInfo inputContentInfo, int i12, @Y61.l Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(@Y61.l CorrectionInfo correctionInfo) {
        InputConnection inputConnection = this.f42357b;
        if (inputConnection != null) {
            return inputConnection.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(@Y61.l CharSequence charSequence, int i12) {
        InputConnection inputConnection = this.f42357b;
        if (inputConnection != null) {
            return inputConnection.commitText(charSequence, i12);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i12, int i13) {
        InputConnection inputConnection = this.f42357b;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingText(i12, i13);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i12, int i13) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        InputConnection inputConnection = this.f42357b;
        if (inputConnection != null) {
            return inputConnection.endBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        InputConnection inputConnection = this.f42357b;
        if (inputConnection != null) {
            return inputConnection.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i12) {
        InputConnection inputConnection = this.f42357b;
        if (inputConnection != null) {
            return inputConnection.getCursorCapsMode(i12);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    @Y61.l
    public final ExtractedText getExtractedText(@Y61.l ExtractedTextRequest extractedTextRequest, int i12) {
        InputConnection inputConnection = this.f42357b;
        if (inputConnection != null) {
            return inputConnection.getExtractedText(extractedTextRequest, i12);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    @Y61.l
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    @Y61.l
    public final CharSequence getSelectedText(int i12) {
        InputConnection inputConnection = this.f42357b;
        if (inputConnection != null) {
            return inputConnection.getSelectedText(i12);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    @Y61.l
    public final CharSequence getTextAfterCursor(int i12, int i13) {
        InputConnection inputConnection = this.f42357b;
        if (inputConnection != null) {
            return inputConnection.getTextAfterCursor(i12, i13);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    @Y61.l
    public final CharSequence getTextBeforeCursor(int i12, int i13) {
        InputConnection inputConnection = this.f42357b;
        if (inputConnection != null) {
            return inputConnection.getTextBeforeCursor(i12, i13);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i12) {
        InputConnection inputConnection = this.f42357b;
        if (inputConnection != null) {
            return inputConnection.performContextMenuAction(i12);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i12) {
        InputConnection inputConnection = this.f42357b;
        if (inputConnection != null) {
            return inputConnection.performEditorAction(i12);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(@Y61.l String str, @Y61.l Bundle bundle) {
        InputConnection inputConnection = this.f42357b;
        if (inputConnection != null) {
            return inputConnection.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z12) {
        InputConnection inputConnection = this.f42357b;
        if (inputConnection != null) {
            return inputConnection.reportFullscreenMode(z12);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i12) {
        InputConnection inputConnection = this.f42357b;
        if (inputConnection != null) {
            return inputConnection.requestCursorUpdates(i12);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(@Y61.l KeyEvent keyEvent) {
        InputConnection inputConnection = this.f42357b;
        if (inputConnection != null) {
            return inputConnection.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i12, int i13) {
        InputConnection inputConnection = this.f42357b;
        if (inputConnection != null) {
            return inputConnection.setComposingRegion(i12, i13);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(@Y61.l CharSequence charSequence, int i12) {
        InputConnection inputConnection = this.f42357b;
        if (inputConnection != null) {
            return inputConnection.setComposingText(charSequence, i12);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i12, int i13) {
        InputConnection inputConnection = this.f42357b;
        if (inputConnection != null) {
            return inputConnection.setSelection(i12, i13);
        }
        return false;
    }

    public void b(@Y61.k InputConnection inputConnection) {
    }
}
