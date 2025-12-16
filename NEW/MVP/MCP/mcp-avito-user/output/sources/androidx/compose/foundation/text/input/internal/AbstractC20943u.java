package androidx.compose.foundation.text.input.internal;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import kotlin.Metadata;

/* compiled from: ComposeInputMethodManager.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\"\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/u;", "Landroidx/compose/foundation/text/input/internal/t;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.input.internal.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC20943u implements InterfaceC20941t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f31461a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public InputMethodManager f31462b;

    public AbstractC20943u(@Y61.k View view) {
        this.f31461a = view;
        new androidx.core.view.V(view);
    }

    @Override // androidx.compose.foundation.text.input.internal.InterfaceC20941t
    public final void a(@Y61.k CursorAnchorInfo cursorAnchorInfo) {
        f().updateCursorAnchorInfo(this.f31461a, cursorAnchorInfo);
    }

    @Override // androidx.compose.foundation.text.input.internal.InterfaceC20941t
    public final void b(int i12, int i13, int i14, int i15) {
        f().updateSelection(this.f31461a, i12, i13, i14, i15);
    }

    @Override // androidx.compose.foundation.text.input.internal.InterfaceC20941t
    public final void c() {
        f().restartInput(this.f31461a);
    }

    @Y61.k
    public final InputMethodManager f() {
        InputMethodManager inputMethodManager = this.f31462b;
        if (inputMethodManager != null) {
            return inputMethodManager;
        }
        InputMethodManager inputMethodManager2 = (InputMethodManager) this.f31461a.getContext().getSystemService("input_method");
        this.f31462b = inputMethodManager2;
        return inputMethodManager2;
    }

    @Override // androidx.compose.foundation.text.input.internal.InterfaceC20941t
    public void d() {
    }

    @Override // androidx.compose.foundation.text.input.internal.InterfaceC20941t
    public void e() {
    }
}
