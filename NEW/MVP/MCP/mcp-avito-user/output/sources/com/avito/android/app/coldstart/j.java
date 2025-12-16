package com.avito.android.app.coldstart;

import Y41.l;
import Y61.k;
import android.annotation.NonNull;
import android.annotation.Nullable;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: ActivityFirstDrawListening.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/app/coldstart/j;", "Landroid/view/Window$Callback;", "a", "_avito_analytics-coldstart_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j implements Window.Callback {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f91370d = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Window.Callback f91371b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ArrayList f91372c = new ArrayList();

    /* compiled from: ActivityFirstDrawListening.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/app/coldstart/j$a;", "", "<init>", "()V", "_avito_analytics-coldstart_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ActivityFirstDrawListening.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "", "callback", "invoke", "(LY41/a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<Y41.a<? extends Boolean>, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f91373l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Y41.a<? extends Boolean> aVar) {
            return Boolean.valueOf(!aVar.invoke().booleanValue());
        }
    }

    public j(@k Window.Callback callback) {
        this.f91371b = callback;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f91371b.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f91371b.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f91371b.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f91371b.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f91371b.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f91371b.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f91371b.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f91371b.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f91371b.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        C42745f0.l0(b.f91373l, this.f91372c);
        this.f91371b.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i12, @NonNull @k Menu menu) {
        return this.f91371b.onCreatePanelMenu(i12, menu);
    }

    @Override // android.view.Window.Callback
    @Y61.l
    @Nullable
    public final View onCreatePanelView(int i12) {
        return this.f91371b.onCreatePanelView(i12);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f91371b.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i12, @NonNull @k MenuItem menuItem) {
        return this.f91371b.onMenuItemSelected(i12, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i12, @NonNull @k Menu menu) {
        return this.f91371b.onMenuOpened(i12, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i12, @NonNull @k Menu menu) {
        this.f91371b.onPanelClosed(i12, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i12, @Y61.l @Nullable View view, @NonNull @k Menu menu) {
        return this.f91371b.onPreparePanel(i12, view, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f91371b.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f91371b.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z12) {
        this.f91371b.onWindowFocusChanged(z12);
    }

    @Override // android.view.Window.Callback
    @Y61.l
    @Nullable
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f91371b.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f91371b.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    @Y61.l
    @Nullable
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i12) {
        return this.f91371b.onWindowStartingActionMode(callback, i12);
    }
}
