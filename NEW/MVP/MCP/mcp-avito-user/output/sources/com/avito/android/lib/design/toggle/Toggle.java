package com.avito.android.lib.design.toggle;

import Au.ViewOnClickListenerC13080b;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.toggle.ToggleState;
import com.avito.android.lib.design.toggle.a;
import com.avito.android.lib.util.c;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import j.InterfaceC42150f;
import java.util.Arrays;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import pK0.InterfaceC46971a;
import wK0.C49527b;

/* compiled from: Toggle.kt */
@s0
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\b&\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003:\u0002*+B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0019R$\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u0017R$\u0010\r\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\u0019R$\u0010)\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010\u0010¨\u0006,"}, d2 = {"Lcom/avito/android/lib/design/toggle/Toggle;", "Landroidx/appcompat/widget/AppCompatCheckBox;", "LpK0/a;", "LLV/a;", "Lcom/avito/android/lib/design/toggle/ToggleState;", "Lcom/avito/android/lib/design/toggle/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", VoiceInfo.STATE, "Lkotlin/G0;", "setState", "([I)V", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "setAppearance", "(I)V", "newStyle", "setStyle", "(Lcom/avito/android/lib/design/toggle/a;)V", "newState", "(Lcom/avito/android/lib/design/toggle/ToggleState;)V", "f", "Lcom/avito/android/lib/design/toggle/a;", "getStyle$_design_modules_components", "()Lcom/avito/android/lib/design/toggle/a;", "setStyle$_design_modules_components", "g", "Lcom/avito/android/lib/design/toggle/ToggleState;", "getState$_design_modules_components", "()Lcom/avito/android/lib/design/toggle/ToggleState;", "setState$_design_modules_components", "h", "[I", "getErrorState$_design_modules_components", "()[I", "setErrorState$_design_modules_components", "errorState", "a", "SavedState", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class Toggle extends AppCompatCheckBox implements InterfaceC46971a, LV.a<ToggleState, com.avito.android.lib.design.toggle.a> {

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final a f181152k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final int[] f181153l = new int[0];

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final int[] f181154m = {R.attr.state_error};

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    public com.avito.android.lib.design.toggle.a style;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @l
    public ToggleState state;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @l
    public int[] errorState;

    /* renamed from: i, reason: collision with root package name */
    @l
    public C49527b f181158i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public Drawable f181159j;

    /* compiled from: Toggle.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/toggle/Toggle$SavedState;", "Landroid/view/AbsSavedState;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SavedState extends AbsSavedState {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final int[] f181160b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Parcelable f181161c;

        public SavedState(@k int[] iArr, @k Parcelable parcelable) {
            super(parcelable);
            this.f181160b = iArr;
            this.f181161c = parcelable;
        }
    }

    /* compiled from: Toggle.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/toggle/Toggle$a;", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Toggle.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f181162a;

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
            f181162a = iArr;
        }
    }

    public Toggle(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @SuppressLint({"CustomViewStyleable"})
    public final void b(TypedArray typedArray) {
        Integer numValueOf;
        int i12 = 0;
        if (typedArray.getBoolean(9, false)) {
            this.errorState = f181154m;
        }
        int[] iArr = {6, 0, 2};
        while (true) {
            if (i12 >= 3) {
                numValueOf = null;
                break;
            }
            int i13 = iArr[i12];
            if (typedArray.hasValue(i13)) {
                numValueOf = Integer.valueOf(i13);
                break;
            }
            i12++;
        }
        if (numValueOf != null) {
            a.C5326a c5326a = com.avito.android.lib.design.toggle.a.f181173m;
            Context context = getContext();
            c5326a.getClass();
            setStyle(a.C5326a.c(typedArray, context));
        }
    }

    @l
    /* renamed from: getErrorState$_design_modules_components, reason: from getter */
    public final int[] getErrorState() {
        return this.errorState;
    }

    @l
    /* renamed from: getState$_design_modules_components, reason: from getter */
    public final ToggleState getState() {
        return this.state;
    }

    @l
    /* renamed from: getStyle$_design_modules_components, reason: from getter */
    public final com.avito.android.lib.design.toggle.a getStyle() {
        return this.style;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    @k
    public int[] onCreateDrawableState(int i12) {
        int[] iArr = this.errorState;
        int[] iArrMergeDrawableStates = iArr != null ? View.mergeDrawableStates(super.onCreateDrawableState(iArr.length + i12), iArr) : null;
        return iArrMergeDrawableStates == null ? super.onCreateDrawableState(i12) : iArrMergeDrawableStates;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(@l Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setState(savedState.f181160b);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    @k
    public Parcelable onSaveInstanceState() {
        int[] iArr = this.errorState;
        return iArr != null ? new SavedState(iArr, super.onSaveInstanceState()) : super.onSaveInstanceState();
    }

    @Override // pK0.InterfaceC46971a
    public void setAppearance(int style) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(style, d.n.f178944R0);
        b(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        requestLayout();
    }

    public void setAppearanceFromAttr(@InterfaceC42150f int i12) {
        InterfaceC46971a.C12268a.a(this, i12);
    }

    public final void setErrorState$_design_modules_components(@l int[] iArr) {
        this.errorState = iArr;
    }

    public final void setState$_design_modules_components(@l ToggleState toggleState) {
        this.state = toggleState;
    }

    public final void setStyle$_design_modules_components(@l com.avito.android.lib.design.toggle.a aVar) {
        this.style = aVar;
    }

    public Toggle(@k Context context, @l AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.n.f178944R0, i12, 0);
        b(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setState(@k int[] state) {
        if (Arrays.equals(this.errorState, state)) {
            return;
        }
        this.errorState = state;
        refreshDrawableState();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ea  */
    @Override // LV.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStyle(@Y61.k com.avito.android.lib.design.toggle.a r15) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.toggle.Toggle.setStyle(com.avito.android.lib.design.toggle.a):void");
    }

    @Override // LV.b
    public void setState(@k ToggleState newState) {
        ToggleState toggleState = this.state;
        if (new c(newState, toggleState).f181333c) {
            return;
        }
        this.state = newState;
        boolean z12 = newState.f181165c;
        if (!new c(Boolean.valueOf(z12), toggleState != null ? Boolean.valueOf(toggleState.f181165c) : null).f181333c) {
            setState(z12 ? f181154m : f181153l);
        }
        boolean z13 = newState.f181164b;
        if (!new c(Boolean.valueOf(z13), toggleState != null ? Boolean.valueOf(toggleState.f181164b) : null).f181333c) {
            setEnabled(z13);
        }
        ToggleState.ToggleValue toggleValue = toggleState != null ? toggleState.f181167e : null;
        ToggleState.ToggleValue toggleValue2 = newState.f181167e;
        if (!new c(toggleValue2, toggleValue).f181333c && toggleValue2 != null) {
            int iOrdinal = toggleValue2.ordinal();
            if (iOrdinal == 0) {
                setChecked(false);
            } else if (iOrdinal == 2) {
                setChecked(true);
            }
        }
        boolean z14 = newState.f181166d;
        if (!new c(Boolean.valueOf(z14), toggleState != null ? Boolean.valueOf(toggleState.f181166d) : null).f181333c) {
            setClickable(z14);
        }
        Y41.l<Boolean, G0> lVar = toggleState != null ? toggleState.f181163a : null;
        Y41.l<Boolean, G0> lVar2 = newState.f181163a;
        if (new c(lVar2, lVar).f181333c) {
            return;
        }
        Y41.l<Boolean, G0> lVar3 = lVar2;
        if (lVar3 != null) {
            setOnClickListener(new ViewOnClickListenerC13080b(5, this, lVar3));
        } else {
            setOnClickListener(null);
        }
    }
}
