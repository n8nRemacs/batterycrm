package com.avito.android.lib.design.stepper;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.customview.view.AbsSavedState;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.lib.design.stepper.StepperState;
import com.avito.android.lib.design.stepper.i;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.D6;
import com.google.android.material.shape.q;
import com.jakewharton.rxbinding4.view.C37722i;
import j.InterfaceC42150f;
import j.f0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import pK0.InterfaceC46971a;

/* compiled from: Stepper.kt */
@s0
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003:\u0002ABJ\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018¢\u0006\u0004\b\u001c\u0010\u001bJ!\u0010\u001e\u001a\u00020\b2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u0014H\u0016¢\u0006\u0004\b!\u0010\u0017R\"\u0010'\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\u0017R*\u0010.\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010\u000eR*\u00102\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010*\u001a\u0004\b0\u0010,\"\u0004\b1\u0010\u000eR*\u0010(\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010*\u001a\u0004\b5\u0010,\"\u0004\b6\u0010\u000eR\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010#\u001a\u0004\b\u0015\u0010%\"\u0004\b8\u0010\u0017R*\u0010@\u001a\u0002092\u0006\u0010\u0012\u001a\u0002098\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006C"}, d2 = {"Lcom/avito/android/lib/design/stepper/Stepper;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "LpK0/a;", "LLV/a;", "Lcom/avito/android/lib/design/stepper/StepperState;", "Lcom/avito/android/lib/design/stepper/i;", "", VoiceInfo.STATE, "Lkotlin/G0;", "setState", "([I)V", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "setAppearance", "(I)V", "newStyle", "setStyle", "(Lcom/avito/android/lib/design/stepper/i;)V", "newState", "(Lcom/avito/android/lib/design/stepper/StepperState;)V", "", "isLoading", "setIsLoading", "(Z)V", "Lkotlin/Function0;", "listener", "setOnMinusClickListener", "(LY41/a;)V", "setOnPlusClickListener", "Lkotlin/Function1;", "setOnValueChangeListener", "(LY41/l;)V", "enabled", "setEnabled", "n", "Z", "getAllowOverrideConstraints", "()Z", "setAllowOverrideConstraints", "allowOverrideConstraints", "value", "o", "I", "getMinValue", "()I", "setMinValue", "minValue", "p", "getMaxValue", "setMaxValue", "maxValue", "new", "q", "getValue", "setValue", "r", "setLoading", "Lcom/avito/android/lib/design/stepper/Stepper$State;", "v", "Lcom/avito/android/lib/design/stepper/Stepper$State;", "getCurrentState", "()Lcom/avito/android/lib/design/stepper/Stepper$State;", "setCurrentState", "(Lcom/avito/android/lib/design/stepper/Stepper$State;)V", "currentState", "SavedState", "State", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Stepper extends ConstraintLayout implements InterfaceC46971a, LV.a<StepperState, i> {

    /* renamed from: b, reason: collision with root package name */
    @l
    public StepperState f180569b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public i f180570c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ImageButton f180571d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final View f180572e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f180573f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final View f180574g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f180575h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final View f180576i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final ImageButton f180577j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final View f180578k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final TextView f180579l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final Spinner f180580m;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean allowOverrideConstraints;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public int minValue;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public int maxValue;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public int value;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public boolean isLoading;

    /* renamed from: s, reason: collision with root package name */
    @k
    public Y41.l<? super Integer, G0> f180586s;

    /* renamed from: t, reason: collision with root package name */
    @k
    public Y41.a<Boolean> f180587t;

    /* renamed from: u, reason: collision with root package name */
    @k
    public Y41.a<Boolean> f180588u;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @k
    public State currentState;

    /* renamed from: w, reason: collision with root package name */
    @k
    public int[] f180590w;

    /* compiled from: Stepper.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/stepper/Stepper$SavedState;", "Landroidx/customview/view/AbsSavedState;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SavedState extends AbsSavedState {

        @k
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        @k
        public final State f180591d;

        /* renamed from: e, reason: collision with root package name */
        public final int f180592e;

        /* renamed from: f, reason: collision with root package name */
        public final int f180593f;

        /* renamed from: g, reason: collision with root package name */
        public final int f180594g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final Parcelable f180595h;

        /* compiled from: Stepper.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(State.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readParcelable(SavedState.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i12) {
                return new SavedState[i12];
            }
        }

        public SavedState(@k State state, int i12, int i13, int i14, @k Parcelable parcelable) {
            super(parcelable);
            this.f180591d = state;
            this.f180592e = i12;
            this.f180593f = i13;
            this.f180594g = i14;
            this.f180595h = parcelable;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f180591d.name());
            parcel.writeInt(this.f180592e);
            parcel.writeInt(this.f180593f);
            parcel.writeInt(this.f180594g);
            parcel.writeParcelable(this.f180595h, i12);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Stepper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/stepper/Stepper$State;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class State {

        /* renamed from: c, reason: collision with root package name */
        public static final State f180596c;

        /* renamed from: d, reason: collision with root package name */
        public static final State f180597d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ State[] f180598e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f180599f;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final int[] f180600b;

        static {
            State state = new State("NORMAL", 0, null, 1, null);
            f180596c = state;
            State state2 = new State(1, "ERROR", new int[]{R.attr.state_error});
            f180597d = state2;
            State[] stateArr = {state, state2};
            f180598e = stateArr;
            f180599f = kotlin.enums.c.a(stateArr);
        }

        public State(int i12, String str, int[] iArr) {
            this.f180600b = iArr;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f180598e.clone();
        }

        public /* synthetic */ State(String str, int i12, int[] iArr, int i13, C42822w c42822w) {
            this(i12, str, (i13 & 1) != 0 ? new int[0] : iArr);
        }
    }

    /* compiled from: Stepper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[StepperState.Mode.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                StepperState.Mode mode = StepperState.Mode.f180611b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                StepperState.Mode mode2 = StepperState.Mode.f180611b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: Stepper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    final class b extends N implements Y41.a<Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f180601l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* compiled from: Stepper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    final class c extends N implements Y41.a<Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f180602l = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* compiled from: Stepper.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    final class d extends N implements Y41.l<Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f180603l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Integer num) {
            num.intValue();
            return G0.f406611a;
        }
    }

    @j
    public Stepper(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public static com.google.android.material.shape.k h(Stepper stepper, float f12, float f13, float f14, float f15, int i12) {
        if ((i12 & 1) != 0) {
            f12 = 0.0f;
        }
        if ((i12 & 2) != 0) {
            f13 = 0.0f;
        }
        if ((i12 & 4) != 0) {
            f14 = 0.0f;
        }
        if ((i12 & 8) != 0) {
            f15 = 0.0f;
        }
        q.b bVar = new q.b();
        bVar.e(f13);
        bVar.k(f12);
        bVar.h(f15);
        bVar.n(f14);
        com.google.android.material.shape.k kVar = new com.google.android.material.shape.k(bVar.a());
        kVar.n(ColorStateList.valueOf(-16777216));
        return kVar;
    }

    public final void g(TypedArray typedArray) {
        i.a aVar = i.f180624x;
        Context context = getContext();
        aVar.getClass();
        setStyle(i.a.b(typedArray, context));
        this.allowOverrideConstraints = typedArray.getBoolean(4, true);
        setMinValue(typedArray.getInt(20, 0));
        setMaxValue(typedArray.getInt(19, Integer.MAX_VALUE));
        i iVar = this.f180570c;
        if (iVar != null) {
            TextView[] textViewArr = {this.f180573f, this.f180575h, this.f180579l};
            for (int i12 = 0; i12 < 3; i12++) {
                textViewArr[i12].setTranslationY(iVar.f180643s);
            }
        }
    }

    public final boolean getAllowOverrideConstraints() {
        return this.allowOverrideConstraints;
    }

    @k
    public final State getCurrentState() {
        return this.currentState;
    }

    public final int getMaxValue() {
        return this.maxValue;
    }

    public final int getMinValue() {
        return this.minValue;
    }

    public final int getValue() {
        return this.value;
    }

    public final void i() {
        TextView textView = this.f180575h;
        ImageButton imageButton = this.f180571d;
        TextView textView2 = this.f180573f;
        View view = this.f180572e;
        ImageButton imageButton2 = this.f180577j;
        TextView textView3 = this.f180579l;
        View view2 = this.f180578k;
        if (!isEnabled() || this.isLoading) {
            View[] viewArr = {imageButton2, imageButton, view2, textView3, view, textView2, textView};
            for (int i12 = 0; i12 < 7; i12++) {
                viewArr[i12].setEnabled(false);
            }
            return;
        }
        View[] viewArr2 = {imageButton2, view2, textView3};
        for (int i13 = 0; i13 < 3; i13++) {
            viewArr2[i13].setEnabled(this.value < this.maxValue);
        }
        View[] viewArr3 = {imageButton, view, textView2};
        for (int i14 = 0; i14 < 3; i14++) {
            viewArr3[i14].setEnabled(this.value > this.minValue);
        }
        textView.setEnabled(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    @k
    public final int[] onCreateDrawableState(int i12) {
        return View.mergeDrawableStates(super.onCreateDrawableState(i12 + this.f180590w.length), this.f180590w);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@k Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f45355b);
        setCurrentState(savedState.f180591d);
        setValue(savedState.f180592e);
        setMinValue(savedState.f180593f);
        setMaxValue(savedState.f180594g);
    }

    @Override // android.view.View
    @k
    public final Parcelable onSaveInstanceState() {
        return new SavedState(this.currentState, this.value, this.minValue, this.maxValue, super.onSaveInstanceState());
    }

    public final void setAllowOverrideConstraints(boolean z12) {
        this.allowOverrideConstraints = z12;
    }

    @Override // pK0.InterfaceC46971a
    public void setAppearance(@f0 int style) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(style, d.n.f178922G0);
        g(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        requestLayout();
    }

    public void setAppearanceFromAttr(@InterfaceC42150f int i12) {
        InterfaceC46971a.C12268a.a(this, i12);
    }

    public final void setCurrentState(@k State state) {
        if (state == this.currentState) {
            return;
        }
        this.currentState = state;
        setState(state.f180600b);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        i();
    }

    public final void setIsLoading(boolean isLoading) {
        this.isLoading = isLoading;
        TextView textView = this.f180575h;
        Spinner spinner = this.f180580m;
        if (isLoading) {
            D6.H(spinner);
            D6.g(textView);
        } else {
            D6.w(spinner);
            D6.H(textView);
        }
        i();
    }

    public final void setLoading(boolean z12) {
        this.isLoading = z12;
    }

    public final void setMaxValue(int i12) {
        int i13 = this.minValue;
        if (i12 < i13) {
            i12 = i13;
        }
        this.maxValue = i12;
        int i14 = this.value;
        if (!this.allowOverrideConstraints) {
            if (i14 <= i12) {
                i12 = i14;
            }
            i14 = i12;
        }
        setValue(i14);
    }

    public final void setMinValue(int i12) {
        int i13 = this.maxValue;
        if (i12 > i13) {
            i12 = i13;
        }
        this.minValue = i12;
        int i14 = this.value;
        if (!this.allowOverrideConstraints) {
            if (i14 >= i12) {
                i12 = i14;
            }
            i14 = i12;
        }
        setValue(i14);
    }

    public final void setOnMinusClickListener(@k Y41.a<Boolean> listener) {
        this.f180587t = listener;
    }

    public final void setOnPlusClickListener(@k Y41.a<Boolean> listener) {
        this.f180588u = listener;
    }

    public final void setOnValueChangeListener(@k Y41.l<? super Integer, G0> listener) {
        this.f180586s = listener;
    }

    public final void setValue(int i12) {
        if (!this.allowOverrideConstraints) {
            i12 = s.h(new kotlin.ranges.l(this.minValue, this.maxValue, 1), i12);
        }
        int i13 = this.value;
        this.value = i12;
        this.f180575h.setText(String.valueOf(i12));
        i();
        if (i12 == i13) {
            return;
        }
        this.f180586s.invoke(Integer.valueOf(i12));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Stepper(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? R.attr.stepper : i12;
        i13 = (i14 & 8) != 0 ? R.style.Design_Widget_Stepper : i13;
        super(context, attributeSet, i12, i13);
        this.allowOverrideConstraints = true;
        this.maxValue = Integer.MAX_VALUE;
        this.f180586s = d.f180603l;
        this.f180587t = b.f180601l;
        this.f180588u = c.f180602l;
        State state = State.f180596c;
        this.currentState = state;
        this.f180590w = state.f180600b;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.design_stepper_layout, (ViewGroup) this, true);
        ImageButton imageButton = (ImageButton) viewInflate.findViewById(R.id.minus_button);
        this.f180571d = imageButton;
        View viewFindViewById = viewInflate.findViewById(R.id.minus_text_button_container);
        this.f180572e = viewFindViewById;
        this.f180573f = (TextView) viewInflate.findViewById(R.id.minus_text_button);
        this.f180574g = viewInflate.findViewById(R.id.minus_value_divider);
        this.f180575h = (TextView) viewInflate.findViewById(R.id.value_field);
        this.f180576i = viewInflate.findViewById(R.id.plus_value_divider);
        ImageButton imageButton2 = (ImageButton) viewInflate.findViewById(R.id.plus_button);
        this.f180577j = imageButton2;
        View viewFindViewById2 = viewInflate.findViewById(R.id.plus_text_button_container);
        this.f180578k = viewFindViewById2;
        this.f180579l = (TextView) viewInflate.findViewById(R.id.plus_text_button);
        this.f180580m = (Spinner) viewInflate.findViewById(R.id.spinner);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f178922G0, i12, i13);
        g(typedArrayObtainStyledAttributes);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        setIsLoading(typedArrayObtainStyledAttributes.getBoolean(18, false));
        typedArrayObtainStyledAttributes.recycle();
        setClickable(true);
        setFocusable(true);
        C37722i.a(imageButton).N(new com.avito.android.lib.design.stepper.a(this)).t0(new com.avito.android.lib.design.stepper.b(this));
        C37722i.a(imageButton2).N(new com.avito.android.lib.design.stepper.c(this)).t0(new com.avito.android.lib.design.stepper.d(this));
        C37722i.a(viewFindViewById).N(new e(this)).t0(new f(this));
        C37722i.a(viewFindViewById2).N(new g(this)).t0(new h(this));
    }

    public final void setState(@k int[] state) {
        this.f180590w = state;
        refreshDrawableState();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0173  */
    @Override // LV.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStyle(@Y61.k com.avito.android.lib.design.stepper.i r24) {
        /*
            Method dump skipped, instructions count: 958
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.stepper.Stepper.setStyle(com.avito.android.lib.design.stepper.i):void");
    }

    @Override // LV.b
    public void setState(@k StepperState newState) {
        StepperState stepperState = this.f180569b;
        if (new com.avito.android.lib.util.c(newState, stepperState).f181333c) {
            return;
        }
        this.f180569b = newState;
        Boolean boolValueOf = Boolean.valueOf(newState.f180604a);
        if (!new com.avito.android.lib.util.c(boolValueOf, stepperState != null ? Boolean.valueOf(stepperState.f180604a) : null).f181333c) {
            setEnabled(boolValueOf.booleanValue());
        }
        Integer numValueOf = Integer.valueOf(newState.f180605b);
        if (!new com.avito.android.lib.util.c(numValueOf, stepperState != null ? Integer.valueOf(stepperState.f180605b) : null).f181333c) {
            setValue(numValueOf.intValue());
        }
        Integer numValueOf2 = Integer.valueOf(newState.f180606c);
        if (!new com.avito.android.lib.util.c(numValueOf2, stepperState != null ? Integer.valueOf(stepperState.f180606c) : null).f181333c) {
            setMaxValue(numValueOf2.intValue());
        }
        Integer numValueOf3 = Integer.valueOf(newState.f180607d);
        if (!new com.avito.android.lib.util.c(numValueOf3, stepperState != null ? Integer.valueOf(stepperState.f180607d) : null).f181333c) {
            setMinValue(numValueOf3.intValue());
        }
        StepperState.Mode mode = stepperState != null ? stepperState.f180608e : null;
        StepperState.Mode mode2 = newState.f180608e;
        if (new com.avito.android.lib.util.c(mode2, mode).f181333c || mode2 == null) {
            return;
        }
        int iOrdinal = mode2.ordinal();
        if (iOrdinal == 0) {
            setIsLoading(false);
            setState(State.f180596c.f180600b);
        } else if (iOrdinal == 1) {
            setIsLoading(true);
            setState(State.f180596c.f180600b);
        } else {
            if (iOrdinal != 2) {
                return;
            }
            setIsLoading(false);
            setState(State.f180597d.f180600b);
        }
    }
}
