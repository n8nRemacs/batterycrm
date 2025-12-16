package com.avito.android.lib.design.switcher;

import EV.c;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.switcher.a;
import com.avito.android.lib.design.toggle.Toggle;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import j.InterfaceC42150f;
import java.util.Arrays;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import pK0.InterfaceC46971a;

/* compiled from: Switcher.kt */
@s0
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003:\u0002\u001a\u001bB\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/avito/android/lib/design/switcher/Switcher;", "Landroidx/appcompat/widget/SwitchCompat;", "LpK0/a;", "LLV/a;", "LEV/c;", "Lcom/avito/android/lib/design/switcher/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", VoiceInfo.STATE, "Lkotlin/G0;", "setState", "([I)V", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "setAppearance", "(I)V", "newState", "(LEV/c;)V", "newStyle", "setStyle", "(Lcom/avito/android/lib/design/switcher/a;)V", "a", "SavedState", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Switcher extends SwitchCompat implements InterfaceC46971a, LV.a<c, com.avito.android.lib.design.switcher.a> {

    /* renamed from: a0, reason: collision with root package name */
    @k
    public static final a f180663a0 = new a(null);

    /* renamed from: b0, reason: collision with root package name */
    @k
    public static final int[] f180664b0 = new int[0];

    /* renamed from: c0, reason: collision with root package name */
    @k
    public static final int[] f180665c0 = {R.attr.state_error};

    /* renamed from: U, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.switcher.a f180666U;

    /* renamed from: V, reason: collision with root package name */
    @l
    public c f180667V;

    /* renamed from: W, reason: collision with root package name */
    @l
    public int[] f180668W;

    /* compiled from: Switcher.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/switcher/Switcher$SavedState;", "Landroid/view/AbsSavedState;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SavedState extends AbsSavedState {
    }

    /* compiled from: Switcher.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/switcher/Switcher$a;", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public Switcher(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switcher);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.n.f178926I0, R.attr.switcher, R.style.Design_Widget_Switcher);
        e(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    @SuppressLint({"CustomViewStyleable"})
    public final void e(TypedArray typedArray) {
        Integer numValueOf;
        int[] iArr = {2, 6, 4};
        int i12 = 0;
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
            if (typedArray.getBoolean(0, false)) {
                Toggle.f181152k.getClass();
                this.f180668W = Toggle.f181154m;
            }
            a.C5304a c5304a = com.avito.android.lib.design.switcher.a.f180669j;
            Context context = getContext();
            c5304a.getClass();
            setStyle(a.C5304a.b(typedArray, context));
        }
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    @k
    public final int[] onCreateDrawableState(int i12) {
        int[] iArr = this.f180668W;
        int[] iArrMergeDrawableStates = iArr != null ? View.mergeDrawableStates(super.onCreateDrawableState(iArr.length + i12), iArr) : null;
        return iArrMergeDrawableStates == null ? super.onCreateDrawableState(i12) : iArrMergeDrawableStates;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(@l Parcelable parcelable) {
        if (!(parcelable instanceof Toggle.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Toggle.SavedState savedState = (Toggle.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setState(savedState.f181160b);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    @k
    public final Parcelable onSaveInstanceState() {
        int[] iArr = this.f180668W;
        return iArr != null ? new Toggle.SavedState(iArr, super.onSaveInstanceState()) : super.onSaveInstanceState();
    }

    @Override // pK0.InterfaceC46971a
    public void setAppearance(int style) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(style, d.n.f178926I0);
        e(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        requestLayout();
    }

    public void setAppearanceFromAttr(@InterfaceC42150f int i12) {
        InterfaceC46971a.C12268a.a(this, i12);
    }

    public final void setState(@k int[] state) {
        if (Arrays.equals(this.f180668W, state)) {
            return;
        }
        this.f180668W = state;
        refreshDrawableState();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e5  */
    @Override // LV.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStyle(@Y61.k com.avito.android.lib.design.switcher.a r15) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.switcher.Switcher.setStyle(com.avito.android.lib.design.switcher.a):void");
    }

    @Override // LV.b
    public void setState(@k c newState) throws Resources.NotFoundException {
        int[] iArr;
        c cVar = this.f180667V;
        if (new com.avito.android.lib.util.c(newState, cVar).f181333c) {
            return;
        }
        this.f180667V = newState;
        boolean z12 = newState.f4034d;
        if (!new com.avito.android.lib.util.c(Boolean.valueOf(z12), cVar != null ? Boolean.valueOf(cVar.f4034d) : null).f181333c) {
            if (z12) {
                Toggle.f181152k.getClass();
                iArr = Toggle.f181154m;
            } else {
                Toggle.f181152k.getClass();
                iArr = Toggle.f181153l;
            }
            this.f180668W = iArr;
            setState(iArr);
        }
        boolean z13 = newState.f4032b;
        if (!new com.avito.android.lib.util.c(Boolean.valueOf(z13), cVar != null ? Boolean.valueOf(cVar.f4032b) : null).f181333c) {
            setEnabled(z13);
        }
        boolean z14 = newState.f4033c;
        if (!new com.avito.android.lib.util.c(Boolean.valueOf(z14), cVar != null ? Boolean.valueOf(cVar.f4033c) : null).f181333c) {
            setChecked(z14);
        }
        Y41.l<Boolean, G0> lVar = cVar != null ? cVar.f4031a : null;
        Y41.l<Boolean, G0> lVar2 = newState.f4031a;
        if (!new com.avito.android.lib.util.c(lVar2, lVar).f181333c) {
            Y41.l<Boolean, G0> lVar3 = lVar2;
            if (lVar3 != null) {
                setOnClickListener(new EV.a(this, lVar3));
            } else {
                setOnClickListener(null);
            }
        }
        boolean z15 = newState.f4035e;
        if (new com.avito.android.lib.util.c(Boolean.valueOf(z15), cVar != null ? Boolean.valueOf(cVar.f4035e) : null).f181333c) {
            return;
        }
        setClickable(z15);
    }
}
