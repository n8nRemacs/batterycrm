package com.avito.android.lib.design.segmented_control;

import X41.j;
import Y41.p;
import Y61.k;
import Y61.l;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.appcompat.app.r;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.constraintlayout.widget.d;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.lib.design.d;
import com.avito.android.lib.util.w;
import com.avito.android.lib.util.x;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import j.InterfaceC42150f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import okhttp3.internal.ws.WebSocketProtocol;
import pK0.InterfaceC46971a;
import wK0.AbstractC49526a;

/* compiled from: SegmentedControl.kt */
@s0
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u000701 2%)3J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJE\u0010\u000e\u001a\u00020\u000526\u0010\r\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00050\u0010¢\u0006\u0004\b\u000e\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0018\u0010\u0007J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u000bJ\u0017\u0010\u001a\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u000bJ\u000f\u0010\u001b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR0\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R$\u0010(\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u001cR\"\u0010+\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010\u000bR\u0011\u0010/\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b.\u0010\u001c¨\u00064"}, d2 = {"Lcom/avito/android/lib/design/segmented_control/SegmentedControl;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "LpK0/a;", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lkotlin/G0;", "setAppearance", "(I)V", "", "enabled", "setEnabled", "(Z)V", "Lcom/avito/android/lib/design/segmented_control/SegmentedControl$b;", "listener", "setOnSegmentClickListener", "(Lcom/avito/android/lib/design/segmented_control/SegmentedControl$b;)V", "Lkotlin/Function2;", "Lkotlin/S;", "name", "segmentPosition", "", "segmentText", "(LY41/p;)V", "selectedPosition", "setItemsSelectedState", "setViewsEnabledState", "setControlEnabledState", "getControlMaxStartMargin", "()I", "", "Lcom/avito/android/lib/design/segmented_control/SegmentedControl$c;", "<set-?>", "b", "Ljava/util/List;", "getCurrentSegments", "()Ljava/util/List;", "currentSegments", "c", "I", "getCurrentSelected", "currentSelected", "d", "Z", "isAnimated", "()Z", "setAnimated", "getSize", "size", "a", "FillType", "SavedState", "e", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SegmentedControl extends ConstraintLayout implements InterfaceC46971a {

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ int f180174N = 0;

    /* renamed from: A, reason: collision with root package name */
    public final int f180175A;

    /* renamed from: B, reason: collision with root package name */
    @l
    public Float f180176B;

    /* renamed from: C, reason: collision with root package name */
    @l
    public Float f180177C;

    /* renamed from: D, reason: collision with root package name */
    @l
    public Float f180178D;

    /* renamed from: E, reason: collision with root package name */
    @k
    public final ArrayList<TextView> f180179E;

    /* renamed from: F, reason: collision with root package name */
    public int f180180F;

    /* renamed from: G, reason: collision with root package name */
    @l
    public ColorStateList f180181G;

    /* renamed from: H, reason: collision with root package name */
    public int f180182H;

    /* renamed from: I, reason: collision with root package name */
    public int f180183I;

    /* renamed from: J, reason: collision with root package name */
    @l
    public ColorStateList f180184J;

    /* renamed from: K, reason: collision with root package name */
    @k
    public FillType f180185K;

    /* renamed from: L, reason: collision with root package name */
    public final float f180186L;

    /* renamed from: M, reason: collision with root package name */
    public final float f180187M;

    /* renamed from: b, reason: collision with root package name */
    @k
    public Object f180188b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int currentSelected;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean isAnimated;

    /* renamed from: e, reason: collision with root package name */
    public int f180191e;

    /* renamed from: f, reason: collision with root package name */
    public int f180192f;

    /* renamed from: g, reason: collision with root package name */
    public int f180193g;

    /* renamed from: h, reason: collision with root package name */
    public int f180194h;

    /* renamed from: i, reason: collision with root package name */
    public int f180195i;

    /* renamed from: j, reason: collision with root package name */
    public int f180196j;

    /* renamed from: k, reason: collision with root package name */
    public long f180197k;

    /* renamed from: l, reason: collision with root package name */
    public int f180198l;

    /* renamed from: m, reason: collision with root package name */
    public int f180199m;

    /* renamed from: n, reason: collision with root package name */
    public int f180200n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public ColorStateList f180201o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public ColorStateList f180202p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public ColorStateList f180203q;

    /* renamed from: r, reason: collision with root package name */
    public com.avito.android.lib.design.segmented_control.d f180204r;

    /* renamed from: s, reason: collision with root package name */
    public final Guideline f180205s;

    /* renamed from: t, reason: collision with root package name */
    public final Guideline f180206t;

    /* renamed from: u, reason: collision with root package name */
    public View[] f180207u;

    /* renamed from: v, reason: collision with root package name */
    @k
    public final ArrayList f180208v;

    /* renamed from: w, reason: collision with root package name */
    public int f180209w;

    /* renamed from: x, reason: collision with root package name */
    @l
    public b f180210x;

    /* renamed from: y, reason: collision with root package name */
    @l
    public VelocityTracker f180211y;

    /* renamed from: z, reason: collision with root package name */
    public final int f180212z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SegmentedControl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/segmented_control/SegmentedControl$FillType;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FillType {

        /* renamed from: b, reason: collision with root package name */
        public static final FillType f180213b;

        /* renamed from: c, reason: collision with root package name */
        public static final FillType f180214c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ FillType[] f180215d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f180216e;

        static {
            FillType fillType = new FillType("EQUAL_WIDTHS", 0);
            f180213b = fillType;
            FillType fillType2 = new FillType("EQUAL_INSETS", 1);
            f180214c = fillType2;
            FillType[] fillTypeArr = {fillType, fillType2};
            f180215d = fillTypeArr;
            f180216e = kotlin.enums.c.a(fillTypeArr);
        }

        public FillType() {
            throw null;
        }

        public static FillType valueOf(String str) {
            return (FillType) Enum.valueOf(FillType.class, str);
        }

        public static FillType[] values() {
            return (FillType[]) f180215d.clone();
        }
    }

    /* compiled from: SegmentedControl.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/segmented_control/SegmentedControl$SavedState;", "Landroid/view/View$BaseSavedState;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SavedState extends View.BaseSavedState {

        @k
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Parcelable f180217b;

        /* renamed from: c, reason: collision with root package name */
        public int f180218c;

        /* compiled from: SegmentedControl.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel.readParcelable(SavedState.class.getClassLoader()), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i12) {
                return new SavedState[i12];
            }
        }

        public /* synthetic */ SavedState(Parcelable parcelable, int i12, int i13, C42822w c42822w) {
            this(parcelable, (i13 & 2) != 0 ? -1 : i12);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f180217b, i12);
            parcel.writeInt(this.f180218c);
        }

        public SavedState(@k Parcelable parcelable, int i12) {
            super(parcelable);
            this.f180217b = parcelable;
            this.f180218c = i12;
        }
    }

    /* compiled from: SegmentedControl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/segmented_control/SegmentedControl$a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f180219a;

        /* renamed from: b, reason: collision with root package name */
        public final int f180220b;

        public a(int i12, int i13) {
            this.f180219a = i12;
            this.f180220b = i13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f180219a == aVar.f180219a && this.f180220b == aVar.f180220b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f180220b) + (Integer.hashCode(this.f180219a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ClickedSegmentDescription(lastEnableIndex=");
            sb2.append(this.f180219a);
            sb2.append(", currentClickIndex=");
            return r.t(sb2, this.f180220b, ')');
        }
    }

    /* compiled from: SegmentedControl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/segmented_control/SegmentedControl$b;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: SegmentedControl.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a {
        }

        void KT(int i12, @k CharSequence charSequence);

        void kJ(int i12, @k CharSequence charSequence);
    }

    /* compiled from: SegmentedControl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/segmented_control/SegmentedControl$c;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final CharSequence f180221a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f180222b;

        public /* synthetic */ c(CharSequence charSequence, boolean z12, int i12, C42822w c42822w) {
            this((i12 & 2) != 0 ? true : z12, charSequence);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f180221a, cVar.f180221a) && this.f180222b == cVar.f180222b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f180222b) + (this.f180221a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Segment(title=");
            sb2.append((Object) this.f180221a);
            sb2.append(", isEnabled=");
            return r.x(sb2, this.f180222b, ')');
        }

        public c(boolean z12, @k CharSequence charSequence) {
            this.f180221a = charSequence;
            this.f180222b = z12;
        }
    }

    /* compiled from: SegmentedControl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/segmented_control/SegmentedControl$d;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f180223a;

        /* renamed from: b, reason: collision with root package name */
        public final int f180224b;

        public d(int i12, int i13) {
            this.f180223a = i12;
            this.f180224b = i13;
        }
    }

    /* compiled from: SegmentedControl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/segmented_control/SegmentedControl$e;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f180225a;

        /* renamed from: b, reason: collision with root package name */
        public final int f180226b;

        /* renamed from: c, reason: collision with root package name */
        public final int f180227c;

        /* renamed from: d, reason: collision with root package name */
        public final int f180228d;

        public e(int i12, int i13, int i14, int i15) {
            this.f180225a = i12;
            this.f180226b = i13;
            this.f180227c = i14;
            this.f180228d = i15;
        }
    }

    @j
    public SegmentedControl(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    private final int getControlMaxStartMargin() {
        return ((getWidth() - getPaddingStart()) - getPaddingEnd()) - ((e) C42745f0.Q(this.f180208v)).f180226b;
    }

    private final void setControlEnabledState(boolean enabled) {
        com.avito.android.lib.design.segmented_control.d dVar = this.f180204r;
        if (dVar == null) {
            dVar = null;
        }
        if (enabled) {
            D6.H(dVar);
        } else {
            D6.g(dVar);
        }
    }

    private final void setItemsSelectedState(int selectedPosition) {
        int i12 = 0;
        for (Object obj : this.f180179E) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            TextView textView = (TextView) obj;
            if (textView != null) {
                textView.setPressed(false);
                textView.setSelected(i12 == selectedPosition);
            }
            i12 = i13;
        }
    }

    private final void setViewsEnabledState(boolean enabled) {
        View[] viewArr = this.f180207u;
        if (viewArr == null) {
            viewArr = null;
        }
        for (View view : viewArr) {
            view.setEnabled(enabled);
        }
    }

    public static /* synthetic */ void t(SegmentedControl segmentedControl, int i12, boolean z12, int i13) {
        if ((i13 & 2) != 0) {
            z12 = true;
        }
        segmentedControl.s(i12, z12, false);
    }

    public final void g(boolean z12) {
        if (this.f180207u == null || this.f180204r == null) {
            return;
        }
        d dVarK = k(this.currentSelected);
        int i12 = dVarK.f180224b;
        int i13 = dVarK.f180223a;
        p(i12 - i13, i13, z12);
        setControlEnabledState(isEnabled());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<com.avito.android.lib.design.segmented_control.SegmentedControl$c>] */
    @k
    public final List<c> getCurrentSegments() {
        return this.f180188b;
    }

    public final int getCurrentSelected() {
        return this.currentSelected;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final int getSize() {
        return this.f180188b.size();
    }

    public final void h(TypedArray typedArray) {
        this.currentSelected = typedArray.getInt(11, this.currentSelected);
        this.f180195i = typedArray.getDimensionPixelOffset(10, this.f180195i);
        this.f180196j = typedArray.getDimensionPixelOffset(18, this.f180196j);
        int i12 = 2;
        if (typedArray.hasValue(2)) {
            this.f180191e = typedArray.getLayoutDimension(2, this.f180191e);
        }
        if (typedArray.hasValue(4)) {
            this.f180192f = typedArray.getLayoutDimension(4, this.f180192f);
        }
        boolean z12 = false;
        if (typedArray.hasValue(1)) {
            CharSequence[] textArray = typedArray.getTextArray(1);
            ArrayList arrayList = new ArrayList(textArray.length);
            for (CharSequence charSequence : textArray) {
                arrayList.add(new c(charSequence.toString(), z12, i12, null));
            }
            this.f180188b = arrayList;
        }
        if (typedArray.hasValue(3)) {
            this.f180193g = typedArray.getLayoutDimension(3, this.f180193g);
        }
        if (typedArray.hasValue(5)) {
            this.f180194h = typedArray.getLayoutDimension(5, this.f180194h);
        }
        setMinHeight(typedArray.getDimensionPixelOffset(6, getMinHeight()));
        if (typedArray.hasValue(7)) {
            ColorStateList colorStateListA = x.a(typedArray, getContext(), 7);
            if (colorStateListA == null) {
                colorStateListA = this.f180201o;
            }
            this.f180201o = colorStateListA;
        }
        if (typedArray.hasValue(17)) {
            this.f180202p = x.a(typedArray, getContext(), 17);
        }
        if (typedArray.hasValue(23)) {
            this.f180203q = x.a(typedArray, getContext(), 23);
        }
        if (typedArray.hasValue(0)) {
            this.f180209w = typedArray.getResourceId(0, 0);
        }
        if (typedArray.hasValue(15)) {
            this.f180198l = typedArray.getDimensionPixelOffset(15, this.f180198l);
        }
        if (typedArray.hasValue(16)) {
            this.f180199m = typedArray.getDimensionPixelOffset(16, this.f180199m);
        }
        if (typedArray.hasValue(25)) {
            this.f180200n = typedArray.getDimensionPixelOffset(25, this.f180200n);
        }
        if (typedArray.hasValue(19)) {
            typedArray.getInt(19, 0);
        }
        if (typedArray.hasValue(12)) {
            this.f180197k = typedArray.getInt(12, 0);
        }
        if (typedArray.hasValue(9)) {
            this.f180180F = typedArray.getDimensionPixelOffset(9, 0);
        }
        if (typedArray.hasValue(8)) {
            this.f180181G = x.a(typedArray, getContext(), 8);
        }
        if (typedArray.hasValue(22)) {
            this.f180182H = typedArray.getDimensionPixelOffset(22, 0);
        }
        if (typedArray.hasValue(21)) {
            this.f180183I = typedArray.getDimensionPixelOffset(21, 0);
        }
        if (typedArray.hasValue(20)) {
            this.f180184J = x.a(typedArray, getContext(), 20);
        }
        if (typedArray.hasValue(14)) {
            this.f180185K = typedArray.getInt(14, 1) == 0 ? FillType.f180213b : FillType.f180214c;
        }
        setBackground(AbstractC49526a.C12816a.a(AbstractC49526a.f441376b, this.f180201o, null, this.f180195i, this.f180181G, this.f180180F, 98));
        setClipToOutline(true);
        setOutlineProvider(new w(this.f180195i));
        setPadding(this.f180191e, this.f180193g, this.f180192f, this.f180194h);
    }

    public final a i(float f12) {
        View[] viewArr = this.f180207u;
        if (viewArr == null) {
            viewArr = null;
        }
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        for (View view : viewArr) {
            if (view instanceof TextView) {
                i13++;
                if (((TextView) view).isEnabled()) {
                    i12 = i13;
                }
            }
            if (!isRtl() ? view.getX() + view.getWidth() >= f12 : view.getX() <= f12) {
                if (i14 == -1) {
                    i14 = i13;
                }
            }
            if (i14 >= 0 && i12 >= 0) {
                return new a(i12, i14);
            }
        }
        return new a(i12, i13);
    }

    public final void j(int i12) {
        if (i12 < getSize()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Illegal selectedPosition. Maximum selected position = ");
        sb2.append(getSize() - 1);
        sb2.append(", selected = ");
        sb2.append(i12);
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    public final d k(int i12) {
        int i13 = i12 * 2;
        View[] viewArr = this.f180207u;
        if (viewArr == null) {
            viewArr = null;
        }
        View view = (View) C42756l.F(i13 - 1, viewArr);
        if (view == null && (view = this.f180205s) == null) {
            view = null;
        }
        View[] viewArr2 = this.f180207u;
        if (viewArr2 == null) {
            viewArr2 = null;
        }
        View view2 = (View) C42756l.F(i13 + 1, viewArr2);
        if (view2 == null) {
            Guideline guideline = this.f180206t;
            view2 = guideline != null ? guideline : null;
        }
        return new d(isRtl() ? getWidth() - view.getRight() : view.getLeft(), isRtl() ? getWidth() - view2.getLeft() : view2.getRight());
    }

    public final void l() {
        if (getSize() != 0 && this.f180204r == null) {
            com.avito.android.lib.design.segmented_control.d dVar = new com.avito.android.lib.design.segmented_control.d(getContext(), null, 0, 6, null);
            dVar.setId(View.generateViewId());
            ColorStateList colorStateList = this.f180202p;
            if (colorStateList != null) {
                dVar.setSegmentColor(colorStateList);
            }
            dVar.setSegmentCornerRadius(this.f180196j);
            this.f180204r = dVar;
            addView(dVar, new ConstraintLayout.b(-1, -1));
            p(1, 0, false);
            com.avito.android.lib.design.segmented_control.d dVar2 = this.f180204r;
            if (dVar2 == null) {
                dVar2 = null;
            }
            androidx.constraintlayout.widget.d dVar3 = new androidx.constraintlayout.widget.d();
            dVar3.h(dVar3);
            dVar3.i(dVar2.getId(), 6, 0, 6);
            dVar3.i(dVar2.getId(), 7, 0, 7);
            dVar3.i(dVar2.getId(), 3, 0, 3);
            dVar3.i(dVar2.getId(), 4, 0, 4);
            dVar3.c(this);
            setControlEnabledState(isEnabled());
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    public final void m() {
        ArrayList<TextView> arrayList = this.f180179E;
        arrayList.clear();
        View[] viewArr = this.f180207u;
        if (viewArr != null) {
            for (View view : viewArr) {
                removeView(view);
            }
        }
        int size = this.f180188b.size();
        boolean z12 = true;
        int size2 = this.f180188b.size() - 1;
        int i12 = size + size2;
        View[] viewArr2 = new View[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            viewArr2[i13] = this;
        }
        this.f180207u = viewArr2;
        int i14 = 0;
        for (Object obj : (Iterable) this.f180188b) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                C42745f0.H0();
                throw null;
            }
            c cVar = (c) obj;
            CharSequence charSequence = cVar.f180221a;
            boolean z13 = i14 == this.currentSelected ? z12 : false;
            int i16 = this.f180198l;
            int i17 = this.f180200n;
            int i18 = -i17;
            int i19 = this.f180199m;
            com.avito.android.lib.design.segmented_control.a aVar = new com.avito.android.lib.design.segmented_control.a(getContext(), null, 0, 0, 14, null);
            aVar.setId(View.generateViewId());
            aVar.setAnimationDuration(this.f180197k);
            ColorStateList colorStateList = this.f180203q;
            if (colorStateList != null) {
                aVar.setTextColorStateList(colorStateList);
            }
            aVar.setTextAppearance(this.f180209w);
            aVar.setGravity(17);
            aVar.setAnimated(this.isAnimated);
            aVar.setSingleLine();
            aVar.setEllipsize(TextUtils.TruncateAt.END);
            aVar.setSelected(z13);
            aVar.setText(charSequence);
            aVar.setEnabled(cVar.f180222b);
            arrayList.add(i14, aVar);
            aVar.setPadding(i16, i18, i19, i17);
            View[] viewArr3 = this.f180207u;
            (viewArr3 == null ? null : viewArr3)[i14 * 2] = aVar;
            addView(aVar, new ConstraintLayout.b(this.f180185K == FillType.f180213b ? 0 : -2, -2));
            i14 = i15;
            z12 = true;
        }
        kotlin.ranges.k it = s.r(0, size2).iterator();
        while (it.f406910d) {
            int iA2 = it.a();
            View view2 = new View(getContext());
            view2.setId(View.generateViewId());
            view2.setBackground(AbstractC49526a.C12816a.a(AbstractC49526a.f441376b, this.f180184J, null, 0, null, 0, WebSocketProtocol.PAYLOAD_SHORT));
            View[] viewArr4 = this.f180207u;
            if (viewArr4 == null) {
                viewArr4 = null;
            }
            viewArr4[(iA2 * 2) + 1] = view2;
            int i22 = this.f180182H;
            ConstraintLayout.b bVar = new ConstraintLayout.b(i22, this.f180183I);
            if (i22 == 0) {
                bVar.f44166M = 2;
                bVar.f44172S = 0.0f;
            }
            addView(view2, 0, bVar);
        }
        post(new com.avito.android.inline_filters.dialog.group.item.double_input.e(this, 8));
    }

    public final void n() {
        Object next;
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.g(this);
        Iterator it = ((Iterable) this.f180188b).iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int length = ((c) next).f180221a.length();
                do {
                    Object next2 = it.next();
                    int length2 = ((c) next2).f180221a.length();
                    if (length < length2) {
                        next = next2;
                        length = length2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        c cVar = (c) next;
        View[] viewArr = this.f180207u;
        if (viewArr == null) {
            viewArr = null;
        }
        ArrayList arrayList = new ArrayList();
        for (View view : viewArr) {
            if (view instanceof TextView) {
                arrayList.add(view);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            TextView textView = (TextView) it2.next();
            int textSize = (int) (textView.getTextSize() * this.f180186L);
            int paddingEnd = textView.getPaddingEnd() + textView.getPaddingStart();
            if (this.f180185K == FillType.f180213b) {
                dVar.p(textView.getId()).f44269e.f44317c0 = textSize + paddingEnd;
                dVar.p(textView.getId()).f44269e.f44307V = this.f180187M;
            } else if (L.f(cVar != null ? cVar.f180221a : null, textView.getText())) {
                dVar.p(textView.getId()).f44269e.f44337m0 = true;
            }
        }
        View[] viewArr2 = this.f180207u;
        if (viewArr2 == null) {
            viewArr2 = null;
        }
        for (View view2 : viewArr2) {
            dVar.i(view2.getId(), 3, 0, 3);
            dVar.i(view2.getId(), 4, 0, 4);
        }
        View[] viewArr3 = this.f180207u;
        if (viewArr3 == null) {
            viewArr3 = null;
        }
        dVar.i(((View) C42756l.C(viewArr3)).getId(), 6, 0, 6);
        View[] viewArr4 = this.f180207u;
        if (viewArr4 == null) {
            viewArr4 = null;
        }
        kotlin.ranges.k it3 = s.r(0, viewArr4.length - 1).iterator();
        while (it3.f406910d) {
            int iA2 = it3.a();
            View[] viewArr5 = this.f180207u;
            View view3 = (viewArr5 == null ? null : viewArr5)[iA2];
            if (viewArr5 == null) {
                viewArr5 = null;
            }
            View view4 = viewArr5[iA2 + 1];
            dVar.i(view3.getId(), 7, view4.getId(), 6);
            dVar.i(view4.getId(), 6, view3.getId(), 7);
        }
        View[] viewArr6 = this.f180207u;
        dVar.i(((View) C42756l.Q(viewArr6 != null ? viewArr6 : null)).getId(), 7, 0, 7);
        dVar.c(this);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final void o() {
        if (this.f180207u == null) {
            return;
        }
        ArrayList arrayList = this.f180208v;
        arrayList.clear();
        kotlin.ranges.k it = s.r(0, C42745f0.J(this.f180188b)).iterator();
        while (it.f406910d) {
            int iA2 = it.a();
            d dVarK = k(iA2);
            d dVarK2 = k(iA2 + 1);
            int i12 = dVarK.f180224b;
            int i13 = dVarK.f180223a;
            int i14 = dVarK2.f180224b;
            int i15 = dVarK2.f180223a;
            arrayList.add(new e(i12 - i13, i14 - i15, (i13 + i12) / 2, (i15 + i14) / 2));
        }
        g(false);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        super.onLayout(z12, i12, i13, i14, i15);
        if (z12) {
            l();
            o();
            g(false);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@l Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i12 = savedState.f180218c;
        this.currentSelected = i12;
        setItemsSelectedState(i12);
    }

    @Override // android.view.View
    @k
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState(), 0, 2, null);
        savedState.f180218c = this.currentSelected;
        return savedState;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(@k MotionEvent motionEvent) {
        b bVar;
        float fAbs;
        float fAbs2;
        Object next;
        e eVar;
        if (!isEnabled()) {
            return false;
        }
        Float f12 = this.f180178D;
        float fFloatValue = f12 != null ? f12.floatValue() : 0.0f;
        Float f13 = this.f180177C;
        float fFloatValue2 = f13 != null ? f13.floatValue() : 0.0f;
        this.f180178D = Float.valueOf(motionEvent.getRawX());
        this.f180177C = Float.valueOf(motionEvent.getRawY());
        if (motionEvent.getAction() == 0) {
            this.f180176B = Float.valueOf(motionEvent.getRawX());
            Float f14 = this.f180178D;
            if (f14 != null) {
                a aVarI = i(f14.floatValue());
                Iterator<TextView> it = this.f180179E.iterator();
                int i12 = 0;
                while (it.hasNext()) {
                    TextView next2 = it.next();
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    TextView textView = next2;
                    if (textView != null) {
                        textView.setPressed(i12 == aVarI.f180219a);
                    }
                    i12 = i13;
                }
            }
            VelocityTracker velocityTracker = this.f180211y;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
            VelocityTracker velocityTrackerObtain = this.f180211y;
            if (velocityTrackerObtain == null) {
                velocityTrackerObtain = VelocityTracker.obtain();
                velocityTrackerObtain.addMovement(motionEvent);
            }
            this.f180211y = velocityTrackerObtain;
        }
        if (motionEvent.getAction() == 2) {
            VelocityTracker velocityTracker2 = this.f180211y;
            if (velocityTracker2 != null) {
                int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                velocityTracker2.addMovement(motionEvent);
                velocityTracker2.computeCurrentVelocity(1000);
                fAbs2 = Math.abs(velocityTracker2.getXVelocity(pointerId));
                fAbs = Math.abs(velocityTracker2.getYVelocity(pointerId));
            } else {
                fAbs = 0.0f;
                fAbs2 = 0.0f;
            }
            float rawX = motionEvent.getRawX() - fFloatValue;
            if (isRtl()) {
                rawX = -rawX;
            }
            float rawY = motionEvent.getRawY() - fFloatValue2;
            int i14 = (int) fAbs2;
            if ((this.f180212z > i14 || i14 > this.f180175A || fAbs >= fAbs2) && Math.abs(rawX) <= Math.abs(rawY)) {
                return false;
            }
            requestDisallowInterceptTouchEvent(true);
            com.avito.android.lib.design.segmented_control.d dVar = this.f180204r;
            if (dVar == null) {
                dVar = null;
            }
            float segmentOffset = dVar.getSegmentOffset();
            com.avito.android.lib.design.segmented_control.d dVar2 = this.f180204r;
            if (dVar2 == null) {
                dVar2 = null;
            }
            float segmentWidth = dVar2.getSegmentWidth();
            float f15 = (segmentWidth / 2.0f) + segmentOffset;
            float f16 = s.f((isRtl() ? segmentWidth - fFloatValue : fFloatValue) - segmentOffset, 0.0f, segmentWidth) / segmentWidth;
            float f17 = (segmentWidth * f16) + segmentOffset + rawX;
            ArrayList arrayList = this.f180208v;
            if (f15 <= ((e) arrayList.get(0)).f180227c) {
                eVar = (e) arrayList.get(0);
            } else if (f15 >= ((e) C42745f0.Q(arrayList)).f180228d) {
                eVar = (e) C42745f0.Q(arrayList);
            } else {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    e eVar2 = (e) next;
                    if (new kotlin.ranges.l(eVar2.f180227c, eVar2.f180228d, 1).h(kotlin.math.b.b(f15))) {
                        break;
                    }
                }
                eVar = (e) next;
                if (eVar == null) {
                    throw new IllegalStateException("We cant find the rail");
                }
            }
            float f18 = eVar.f180227c;
            float f19 = eVar.f180225a;
            float f22 = (f19 * f16) + (f18 - (f19 / 2.0f));
            float f23 = eVar.f180228d;
            float f24 = eVar.f180226b;
            float f25 = ((r3 - r9) * s.f((f17 - f22) / (((f24 * f16) + (f23 - (f24 / 2.0f))) - f22), 0.0f, 1.0f)) + f19;
            p((int) Math.rint(f25), s.g((int) Math.rint(f17 - (f16 * f25)), 0, getControlMaxStartMargin()), false);
        }
        if (motionEvent.getAction() == 1) {
            requestDisallowInterceptTouchEvent(false);
            Float f26 = this.f180176B;
            if (f26 != null) {
                float fFloatValue3 = f26.floatValue();
                a aVarI2 = i(motionEvent.getX());
                ?? r72 = this.f180188b;
                int i15 = aVarI2.f180220b;
                c cVar = (c) C42745f0.K(i15, r72);
                boolean z12 = cVar != null ? cVar.f180222b : false;
                boolean z13 = Math.abs(fFloatValue3 - fFloatValue) > 0.0f;
                if (z12 || z13) {
                    int i16 = this.currentSelected;
                    int i17 = aVarI2.f180219a;
                    s(i17, true, i17 != i16);
                }
                if (!z12 && i15 >= 0 && (bVar = this.f180210x) != null) {
                    bVar.KT(i15, ((c) this.f180188b.get(i15)).f180221a);
                }
            }
            VelocityTracker velocityTracker3 = this.f180211y;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
            }
            this.f180211y = null;
        }
        if (motionEvent.getAction() == 3) {
            VelocityTracker velocityTracker4 = this.f180211y;
            if (velocityTracker4 != null) {
                velocityTracker4.recycle();
            }
            this.f180211y = null;
        }
        return true;
    }

    public final void p(final int i12, int i13, boolean z12) {
        com.avito.android.lib.design.segmented_control.d dVar = this.f180204r;
        if (dVar == null) {
            dVar = null;
        }
        final int paddingStart = i13 - getPaddingStart();
        ValueAnimator valueAnimator = dVar.f180243c;
        valueAnimator.cancel();
        if (!z12) {
            dVar.segmentOffset = paddingStart;
            dVar.segmentWidth = i12;
            dVar.postInvalidateOnAnimation();
            return;
        }
        final float f12 = dVar.segmentOffset;
        final float f13 = dVar.segmentWidth;
        valueAnimator.removeAllUpdateListeners();
        valueAnimator.removeAllListeners();
        final com.avito.android.lib.design.segmented_control.d dVar2 = dVar;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.avito.android.lib.design.segmented_control.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i14 = d.f180241h;
                float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float f14 = paddingStart;
                float f15 = f12;
                float fC2 = r.c(f14, f15, fFloatValue, f15);
                float f16 = i12;
                float f17 = f13;
                float fC3 = r.c(f16, f17, fFloatValue, f17);
                d dVar3 = dVar2;
                dVar3.segmentOffset = fC2;
                dVar3.segmentWidth = fC3;
                dVar3.postInvalidateOnAnimation();
            }
        });
        valueAnimator.addListener(new com.avito.android.lib.design.segmented_control.c(dVar, paddingStart, i12));
        valueAnimator.start();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean performClick() {
        Float f12 = this.f180178D;
        if (f12 != null) {
            s(i(f12.floatValue()).f180219a, true, true);
        }
        return true;
    }

    public final void q(int i12, @k List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new c((CharSequence) it.next(), false, 2, null));
        }
        r(i12, arrayList);
    }

    public final void r(int i12, @k ArrayList arrayList) {
        if (Arrays.equals(((Collection) this.f180188b).toArray(new c[0]), arrayList.toArray(new c[0])) && i12 == this.currentSelected) {
            return;
        }
        if (arrayList.size() < 2) {
            throw new IllegalArgumentException(("Illegal segments count. Minimum size = 2, current = " + arrayList.size()).toString());
        }
        this.f180188b = arrayList;
        j(i12);
        this.currentSelected = i12;
        l();
        m();
        n();
        setControlEnabledState(isEnabled());
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    public final void s(int i12, boolean z12, boolean z13) {
        b bVar;
        TextView textView;
        j(i12);
        ArrayList<TextView> arrayList = this.f180179E;
        Iterator<TextView> it = arrayList.iterator();
        while (it.hasNext()) {
            TextView next = it.next();
            if (next != null) {
                next.setSelected(false);
            }
        }
        if (arrayList.size() > i12 && (textView = arrayList.get(i12)) != null) {
            textView.setSelected(true);
        }
        this.currentSelected = i12;
        g(z12);
        setItemsSelectedState(this.currentSelected);
        if (!z13 || (bVar = this.f180210x) == null) {
            return;
        }
        bVar.kJ(i12, ((c) this.f180188b.get(i12)).f180221a);
    }

    public final void setAnimated(boolean z12) {
        this.isAnimated = z12;
    }

    @Override // pK0.InterfaceC46971a
    public void setAppearance(int style) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(style, d.n.f178999v0);
        h(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        l();
        com.avito.android.lib.design.segmented_control.d dVar = this.f180204r;
        if (dVar != null) {
            ColorStateList colorStateList = this.f180202p;
            if (colorStateList != null) {
                dVar.setSegmentColor(colorStateList);
            }
            com.avito.android.lib.design.segmented_control.d dVar2 = this.f180204r;
            if (dVar2 == null) {
                dVar2 = null;
            }
            dVar2.setSegmentCornerRadius(this.f180196j);
        }
        m();
        n();
        setItemsSelectedState(this.currentSelected);
    }

    public void setAppearanceFromAttr(@InterfaceC42150f int i12) {
        InterfaceC46971a.C12268a.a(this, i12);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        if (this.f180204r != null) {
            setControlEnabledState(enabled);
        }
        if (this.f180207u != null) {
            setViewsEnabledState(enabled);
        }
    }

    public final void setOnSegmentClickListener(@k b listener) {
        this.f180210x = listener;
    }

    public /* synthetic */ SegmentedControl(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.segmentedControl : i12, (i14 & 8) != 0 ? R.style.Design_Widget_SegmentedControl : i13);
    }

    public final void setOnSegmentClickListener(@k p<? super Integer, ? super CharSequence, G0> listener) {
        this.f180210x = new f(listener);
    }

    @j
    public SegmentedControl(@k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        super(context, attributeSet, i12);
        this.f180188b = C42784z0.f406748b;
        this.isAnimated = true;
        this.f180197k = 300L;
        this.f180201o = C35835l0.e(R.attr.gray4, context);
        this.f180202p = androidx.core.content.d.getColorStateList(context, R.color.common_segmented_control_selection_background);
        this.f180203q = androidx.core.content.d.getColorStateList(context, R.color.txt_segmented_control_item_text);
        this.f180208v = new ArrayList();
        this.f180209w = C35835l0.j(R.attr.textBody, context);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f180212z = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f180175A = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f180179E = new ArrayList<>();
        this.f180184J = androidx.core.content.d.getColorStateList(context, R.color.common_transparent_black);
        this.f180185K = FillType.f180213b;
        this.f180186L = 1.5f;
        this.f180187M = 1.0f;
        setMinimumHeight(0);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.n.f178999v0, i12, i13);
        h(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        Guideline guideline = new Guideline(getContext());
        guideline.setId(View.generateViewId());
        this.f180205s = guideline;
        Guideline guideline2 = new Guideline(getContext());
        guideline2.setId(View.generateViewId());
        this.f180206t = guideline2;
        View view = this.f180205s;
        view = view == null ? null : view;
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f44185d = 0.0f;
        G0 g02 = G0.f406611a;
        addView(view, bVar);
        View view2 = this.f180206t;
        view2 = view2 == null ? null : view2;
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, -2);
        bVar2.f44185d = 1.0f;
        addView(view2, bVar2);
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.g(this);
        Guideline guideline3 = this.f180205s;
        d.b bVar3 = dVar.p((guideline3 == null ? null : guideline3).getId()).f44269e;
        bVar3.f44312a = true;
        bVar3.f44291F = 1;
        Guideline guideline4 = this.f180206t;
        d.b bVar4 = dVar.p((guideline4 == null ? null : guideline4).getId()).f44269e;
        bVar4.f44312a = true;
        bVar4.f44291F = 1;
        dVar.c(this);
        l();
        com.avito.android.lib.design.segmented_control.d dVar2 = this.f180204r;
        if (dVar2 != null) {
            ColorStateList colorStateList = this.f180202p;
            if (colorStateList != null) {
                dVar2.setSegmentColor(colorStateList);
            }
            com.avito.android.lib.design.segmented_control.d dVar3 = this.f180204r;
            (dVar3 != null ? dVar3 : null).setSegmentCornerRadius(this.f180196j);
        }
        if (((Collection) this.f180188b).isEmpty()) {
            return;
        }
        m();
        n();
        setItemsSelectedState(this.currentSelected);
    }

    /* compiled from: SegmentedControl.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/lib/design/segmented_control/SegmentedControl$f", "Lcom/avito/android/lib/design/segmented_control/SegmentedControl$b;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements b {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p<Integer, CharSequence, G0> f180229b;

        /* JADX WARN: Multi-variable type inference failed */
        public f(p<? super Integer, ? super CharSequence, G0> pVar) {
            this.f180229b = pVar;
        }

        @Override // com.avito.android.lib.design.segmented_control.SegmentedControl.b
        public final void kJ(int i12, @k CharSequence charSequence) {
            this.f180229b.invoke(Integer.valueOf(i12), charSequence);
        }

        @Override // com.avito.android.lib.design.segmented_control.SegmentedControl.b
        public final void KT(int i12, @k CharSequence charSequence) {
        }
    }
}
