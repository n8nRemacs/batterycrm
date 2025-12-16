package androidx.compose.ui.text.input;

import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.text.v0;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: InputState.android.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class A {
    @Y61.k
    public static final ExtractedText a(@Y61.k W w12) {
        ExtractedText extractedText = new ExtractedText();
        String str = w12.f42383a.f42127c;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j12 = w12.f42384b;
        extractedText.selectionStart = v0.g(j12);
        extractedText.selectionEnd = v0.f(j12);
        extractedText.flags = !C43066x.r(w12.f42383a.f42127c, '\n') ? 1 : 0;
        return extractedText;
    }
}
