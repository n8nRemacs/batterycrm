package curtains.internal;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import j.N;
import j.P;
import j.X;
import java.util.List;

/* compiled from: FixedWindowCallback.java */
/* loaded from: classes8.dex */
class b implements Window.Callback {
    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        throw null;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        throw null;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        throw null;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        throw null;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        throw null;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        throw null;
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        throw null;
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        throw null;
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        throw null;
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        throw null;
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i12, @N Menu menu) {
        throw null;
    }

    @Override // android.view.Window.Callback
    @P
    public final View onCreatePanelView(int i12) {
        throw null;
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        throw null;
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i12, @N MenuItem menuItem) {
        throw null;
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i12, @P Menu menu) {
        throw null;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i12, @N Menu menu) {
        throw null;
    }

    @Override // android.view.Window.Callback
    @X
    public final void onPointerCaptureChanged(boolean z12) {
        throw null;
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i12, @P View view, @N Menu menu) {
        throw null;
    }

    @Override // android.view.Window.Callback
    @X
    public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, @P Menu menu, int i12) {
        throw null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        throw null;
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        throw null;
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z12) {
        throw null;
    }

    @Override // android.view.Window.Callback
    @P
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        throw null;
    }

    @Override // android.view.Window.Callback
    @X
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        throw null;
    }

    @Override // android.view.Window.Callback
    @P
    @X
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i12) {
        throw null;
    }
}
