package androidx.compose.ui.text.input;

import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: InputMethodManager.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\ba\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/input/y;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* renamed from: androidx.compose.ui.text.input.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC22658y {
    void a(@Y61.k CursorAnchorInfo cursorAnchorInfo);

    void b(int i12, int i13, int i14, int i15);

    void c();

    void d();

    void e(int i12, @Y61.k ExtractedText extractedText);

    void f();

    boolean isActive();
}
