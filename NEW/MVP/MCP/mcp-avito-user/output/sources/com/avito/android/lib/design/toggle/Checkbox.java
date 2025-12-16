package com.avito.android.lib.design.toggle;

import Au.ViewOnClickListenerC13080b;
import JV.b;
import K51.d;
import X41.i;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import com.avito.android.R;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.toggle.ToggleState;
import com.avito.android.lib.util.c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: Checkbox.kt */
@s0
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001 B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0011\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R*\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b8\u0006@CX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\f¨\u0006!"}, d2 = {"Lcom/avito/android/lib/design/toggle/Checkbox;", "Lcom/avito/android/lib/design/toggle/Toggle;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "indeterminate", "Lkotlin/G0;", "setIndeterminate", "(Z)V", BeduinCartItemModel.CHECKED_STRING, "setChecked", "LJV/b;", "listener", "setOnStateChangedListener", "(LJV/b;)V", "Lcom/avito/android/lib/design/toggle/State;", "getState", "()Lcom/avito/android/lib/design/toggle/State;", "Lcom/avito/android/lib/design/toggle/ToggleState;", "newState", "setState", "(Lcom/avito/android/lib/design/toggle/ToggleState;)V", "value", "p", "Z", "isIndeterminate", "()Z", "setIndeterminateInternally", "SavedState", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Checkbox extends Toggle {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f181139r = 0;

    /* renamed from: n, reason: collision with root package name */
    @l
    public b f181140n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final int[] f181141o;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public boolean isIndeterminate;

    /* renamed from: q, reason: collision with root package name */
    public boolean f181143q;

    /* compiled from: Checkbox.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/toggle/Checkbox$SavedState;", "Landroid/view/View$BaseSavedState;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SavedState extends View.BaseSavedState {

        @k
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Parcelable f181144b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f181145c;

        /* compiled from: Checkbox.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel.readInt() != 0, parcel.readParcelable(SavedState.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i12) {
                return new SavedState[i12];
            }
        }

        public /* synthetic */ SavedState(Parcelable parcelable, boolean z12, int i12, C42822w c42822w) {
            this((i12 & 2) != 0 ? false : z12, parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f181144b, i12);
            parcel.writeInt(this.f181145c ? 1 : 0);
        }

        public SavedState(boolean z12, @k Parcelable parcelable) {
            super(parcelable);
            this.f181144b = parcelable;
            this.f181145c = z12;
        }
    }

    /* compiled from: Checkbox.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f181146a;

        static {
            int[] iArr = new int[ToggleState.ToggleValue.values().length];
            try {
                ToggleState.ToggleValue toggleValue = ToggleState.ToggleValue.f181168b;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ToggleState.ToggleValue toggleValue2 = ToggleState.ToggleValue.f181168b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ToggleState.ToggleValue toggleValue3 = ToggleState.ToggleValue.f181168b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f181146a = iArr;
        }
    }

    public Checkbox(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkbox);
        this.f181141o = new int[]{R.attr.state_indeterminate};
        this.f181143q = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f178944R0, 0, 0);
        setIndeterminateInternally(typedArrayObtainStyledAttributes.getBoolean(8, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    @i
    private final void setIndeterminateInternally(boolean z12) {
        if (this.isIndeterminate != z12) {
            this.isIndeterminate = z12;
            refreshDrawableState();
        }
    }

    @k
    public final State getState() {
        return this.isIndeterminate ? State.f181149d : isChecked() ? State.f181147b : State.f181148c;
    }

    @Override // com.avito.android.lib.design.toggle.Toggle, android.widget.CompoundButton, android.widget.TextView, android.view.View
    @k
    public final int[] onCreateDrawableState(int i12) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i12 + 1);
        if (this.isIndeterminate) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, this.f181141o);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // com.avito.android.lib.design.toggle.Toggle, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(@l Parcelable parcelable) {
        this.f181143q = false;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setIndeterminateInternally(savedState.f181145c);
        this.f181143q = true;
    }

    @Override // com.avito.android.lib.design.toggle.Toggle, android.widget.CompoundButton, android.widget.TextView, android.view.View
    @k
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState(), false, 2, null);
        savedState.f181145c = this.isIndeterminate;
        return savedState;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean checked) {
        b bVar;
        boolean z12 = isChecked() != checked;
        super.setChecked(checked);
        boolean z13 = this.isIndeterminate;
        setIndeterminateInternally(false);
        if ((z13 || z12) && this.f181143q && (bVar = this.f181140n) != null) {
            bVar.b(getState());
        }
    }

    public final void setIndeterminate(boolean indeterminate) {
        b bVar;
        if (this.isIndeterminate != indeterminate) {
            setIndeterminateInternally(indeterminate);
            if (!this.f181143q || (bVar = this.f181140n) == null) {
                return;
            }
            bVar.b(getState());
        }
    }

    public final void setOnStateChangedListener(@l b listener) {
        this.f181140n = listener;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        ToggleState state = getState();
        if ((state != null ? state.f181163a : null) == null) {
            if (this.isIndeterminate) {
                setChecked(true);
            } else {
                super.toggle();
            }
        }
    }

    @Override // com.avito.android.lib.design.toggle.Toggle, LV.b
    public void setState(@k ToggleState newState) {
        ToggleState state = getState();
        if (new c(newState, state).f181333c) {
            return;
        }
        setState$_design_modules_components(newState);
        boolean z12 = newState.f181165c;
        if (!new c(Boolean.valueOf(z12), state != null ? Boolean.valueOf(state.f181165c) : null).f181333c) {
            Toggle.f181152k.getClass();
            setErrorState$_design_modules_components(z12 ? Toggle.f181154m : Toggle.f181153l);
            setState(getErrorState());
        }
        ToggleState.ToggleValue toggleValue = state != null ? state.f181167e : null;
        ToggleState.ToggleValue toggleValue2 = newState.f181167e;
        if (!new c(toggleValue2, toggleValue).f181333c && toggleValue2 != null) {
            int iOrdinal = toggleValue2.ordinal();
            if (iOrdinal == 0) {
                setChecked(false);
            } else if (iOrdinal == 1) {
                setChecked(true);
                setIndeterminateInternally(true);
            } else if (iOrdinal == 2) {
                setChecked(true);
                setIndeterminateInternally(false);
            }
        }
        boolean z13 = newState.f181164b;
        if (!new c(Boolean.valueOf(z13), state != null ? Boolean.valueOf(state.f181164b) : null).f181333c) {
            setEnabled(z13);
        }
        boolean z14 = newState.f181166d;
        if (!new c(Boolean.valueOf(z14), state != null ? Boolean.valueOf(state.f181166d) : null).f181333c) {
            setClickable(z14);
        }
        Y41.l<Boolean, G0> lVar = state != null ? state.f181163a : null;
        Y41.l<Boolean, G0> lVar2 = newState.f181163a;
        if (new c(lVar2, lVar).f181333c) {
            return;
        }
        Y41.l<Boolean, G0> lVar3 = lVar2;
        if (lVar3 != null) {
            setOnClickListener(new ViewOnClickListenerC13080b(4, this, lVar3));
        } else {
            setOnClickListener(null);
        }
    }
}
