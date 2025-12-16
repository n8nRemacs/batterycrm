package com.google.android.material.search;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import j.N;
import j.P;
import j.U;
import j.X;
import j.e0;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes6.dex */
public class SearchView extends FrameLayout implements CoordinatorLayout.b {

    /* renamed from: b, reason: collision with root package name */
    @P
    public SearchBar f357021b;

    /* renamed from: c, reason: collision with root package name */
    public int f357022c;

    /* renamed from: d, reason: collision with root package name */
    @N
    public TransitionState f357023d;

    public static class Behavior extends CoordinatorLayout.c<SearchView> {
        public Behavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean f(@N CoordinatorLayout coordinatorLayout, @N View view, @N View view2) {
            SearchView searchView = (SearchView) view;
            if (searchView.f357021b != null || !(view2 instanceof SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((SearchBar) view2);
            return false;
        }

        public Behavior(@N Context context, @P AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        public String f357024d;

        /* renamed from: e, reason: collision with root package name */
        public final int f357025e;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i12) {
                return new SavedState[i12];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, @P ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f357024d = parcel.readString();
            this.f357025e = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i12) {
            super.writeToParcel(parcel, i12);
            parcel.writeString(this.f357024d);
            parcel.writeInt(this.f357025e);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TransitionState {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ TransitionState[] f357026b = {new TransitionState("HIDING", 0), new TransitionState("HIDDEN", 1), new TransitionState("SHOWING", 2), new TransitionState("SHOWN", 3)};

        /* JADX INFO: Fake field, exist only in values array */
        TransitionState EF5;

        public TransitionState() {
            throw null;
        }

        public static TransitionState valueOf(String str) {
            return (TransitionState) Enum.valueOf(TransitionState.class, str);
        }

        public static TransitionState[] values() {
            return (TransitionState[]) f357026b.clone();
        }
    }

    public interface a {
        void a();
    }

    @P
    private Window getActivityWindow() {
        Activity activity;
        Context context = getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            }
            if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (activity == null) {
            return null;
        }
        return activity.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.f357021b;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(R.dimen.m3_searchview_elevation);
    }

    @U
    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private void setStatusBarSpacerEnabledInternal(boolean z12) {
        throw null;
    }

    private void setUpHeaderLayout(int i12) {
        if (i12 == -1) {
            return;
        }
        LayoutInflater.from(getContext()).inflate(i12, (ViewGroup) null, false);
        throw null;
    }

    private void setUpStatusBarSpacer(@U int i12) {
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @N
    /* renamed from: getBehavior */
    public CoordinatorLayout.c<SearchView> getF313793d() {
        return new Behavior();
    }

    @N
    public TransitionState getCurrentTransitionState() {
        return this.f357023d;
    }

    @N
    public EditText getEditText() {
        return null;
    }

    @P
    public CharSequence getHint() {
        throw null;
    }

    @N
    public TextView getSearchPrefix() {
        return null;
    }

    @P
    public CharSequence getSearchPrefixText() {
        throw null;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.f357022c;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @P
    public Editable getText() {
        throw null;
    }

    @N
    public Toolbar getToolbar() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.m.d(this);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.f357022c = activityWindow.getAttributes().softInputMode;
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f45355b);
        setText(savedState.f357024d);
        setVisible(savedState.f357025e == 0);
    }

    @Override // android.view.View
    @N
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Editable text = getText();
        savedState.f357024d = text == null ? null : text.toString();
        throw null;
    }

    @Override // android.view.View
    @X
    public void setElevation(float f12) {
        super.setElevation(f12);
        setUpBackgroundViewElevationOverlay(f12);
    }

    public void setHint(@P CharSequence charSequence) {
        throw null;
    }

    public void setModalForAccessibility(boolean z12) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z12) {
            new HashMap(viewGroup.getChildCount());
        }
        for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
            if (viewGroup.getChildAt(i12) != this) {
                throw null;
            }
        }
    }

    public void setOnMenuItemClickListener(@P Toolbar.h hVar) {
        throw null;
    }

    public void setSearchPrefixText(@P CharSequence charSequence) {
        throw null;
    }

    @RestrictTo
    public void setStatusBarSpacerEnabled(boolean z12) {
        setStatusBarSpacerEnabledInternal(z12);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(@P CharSequence charSequence) {
        throw null;
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z12) {
        throw null;
    }

    public void setTransitionState(@N TransitionState transitionState) {
        if (this.f357023d.equals(transitionState)) {
            return;
        }
        this.f357023d = transitionState;
        Iterator it = new LinkedHashSet((Collection) null).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a();
        }
    }

    public void setVisible(boolean z12) {
        throw null;
    }

    public void setupWithSearchBar(@P SearchBar searchBar) {
        this.f357021b = searchBar;
        throw null;
    }

    public void setHint(@e0 int i12) {
        throw null;
    }

    public void setText(@e0 int i12) {
        throw null;
    }

    private void setUpBackgroundViewElevationOverlay(float f12) {
    }

    public void setAnimatedNavigationIcon(boolean z12) {
    }

    public void setAutoShowKeyboard(boolean z12) {
    }

    public void setMenuItemsAnimated(boolean z12) {
    }

    @RestrictTo
    public void setUseWindowInsetsController(boolean z12) {
    }
}
