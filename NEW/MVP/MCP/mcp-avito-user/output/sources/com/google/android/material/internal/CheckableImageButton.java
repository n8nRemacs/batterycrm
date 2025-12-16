package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.view.C22808a;
import androidx.core.view.C22823h0;
import androidx.customview.view.AbsSavedState;

@RestrictTo
/* loaded from: classes6.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f356715e = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    public boolean f356716b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f356717c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f356718d;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        public boolean f356719d;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            @j.N
            public final SavedState createFromParcel(@j.N Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @j.N
            public final Object[] newArray(int i12) {
                return new SavedState[i12];
            }

            @Override // android.os.Parcelable.Creator
            @j.N
            public final Object createFromParcel(@j.N Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(@j.N Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f356719d = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@j.N Parcel parcel, int i12) {
            super.writeToParcel(parcel, i12);
            parcel.writeInt(this.f356719d ? 1 : 0);
        }
    }

    class a extends C22808a {
        public a() {
        }

        @Override // androidx.core.view.C22808a
        public final void c(View view, @j.N AccessibilityEvent accessibilityEvent) {
            super.c(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.f356716b);
        }

        @Override // androidx.core.view.C22808a
        public final void d(View view, @j.N androidx.core.view.accessibility.f fVar) {
            View.AccessibilityDelegate accessibilityDelegate = this.f44991a;
            AccessibilityNodeInfo accessibilityNodeInfo = fVar.f44999a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            CheckableImageButton checkableImageButton = CheckableImageButton.this;
            accessibilityNodeInfo.setCheckable(checkableImageButton.f356717c);
            accessibilityNodeInfo.setChecked(checkableImageButton.f356716b);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.avito.android.R.attr.imageButtonStyle);
        this.f356717c = true;
        this.f356718d = true;
        C22823h0.C(this, new a());
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f356716b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i12) {
        return this.f356716b ? View.mergeDrawableStates(super.onCreateDrawableState(i12 + 1), f356715e) : super.onCreateDrawableState(i12);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f45355b);
        setChecked(savedState.f356719d);
    }

    @Override // android.view.View
    @j.N
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f356719d = this.f356716b;
        return savedState;
    }

    public void setCheckable(boolean z12) {
        if (this.f356717c != z12) {
            this.f356717c = z12;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z12) {
        if (!this.f356717c || this.f356716b == z12) {
            return;
        }
        this.f356716b = z12;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z12) {
        this.f356718d = z12;
    }

    @Override // android.view.View
    public void setPressed(boolean z12) {
        if (this.f356718d) {
            super.setPressed(z12);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f356716b);
    }
}
