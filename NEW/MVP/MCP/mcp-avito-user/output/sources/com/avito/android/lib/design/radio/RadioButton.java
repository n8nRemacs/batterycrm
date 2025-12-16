package com.avito.android.lib.design.radio;

import Ca1.ViewOnTouchListenerC13234a;
import D.b;
import K51.d;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.E;
import com.avito.android.R;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.radio.a;
import com.avito.android.util.C35821j2;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import hw.InterfaceC41179d;
import j.InterfaceC42156l;
import j.InterfaceC42165v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: RadioButton.kt */
@s0
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002-.J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0017\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0018\u0010\u0012J\r\u0010\u0019\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u0015J\u0017\u0010\u001b\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001b\u0010\u0007J\u0017\u0010\u001e\u001a\u00020\u00052\b\b\u0003\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00052\b\b\u0001\u0010$\u001a\u00020\u001c¢\u0006\u0004\b%\u0010\u001fJ\u0017\u0010%\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010&¢\u0006\u0004\b%\u0010'J\u001b\u0010+\u001a\u00020\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(¢\u0006\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/avito/android/lib/design/radio/RadioButton;", "Landroid/widget/LinearLayout;", "Lcom/avito/android/lib/design/radio/a;", "Landroid/view/View$OnClickListener;", "l", "Lkotlin/G0;", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "Landroid/view/View$OnTouchListener;", "setOnTouchListener", "(Landroid/view/View$OnTouchListener;)V", "", BeduinCartItemModel.CHECKED_STRING, "setChecked", "(Z)V", "", "title", "setTitle", "(Ljava/lang/CharSequence;)V", "", "getTitle", "()Ljava/lang/String;", "subtitle", "setSubtitle", "setSecondSubtitle", "getSubtitle", "listener", "setImageClickedListener", "", "drawableRes", "setImageResource", "(I)V", "Landroid/graphics/drawable/Drawable;", "drawable", "setImageDrawable", "(Landroid/graphics/drawable/Drawable;)V", "color", "setImageColor", "Landroid/content/res/ColorStateList;", "(Landroid/content/res/ColorStateList;)V", "", "Landroid/view/View;", "contentViews", "setCustomContent", "(Ljava/util/List;)V", "a", "SavedState", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41179d
@InterfaceC42830m
/* loaded from: classes14.dex */
public final class RadioButton extends LinearLayout implements com.avito.android.lib.design.radio.a {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f180117l = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f180118b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f180119c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f180120d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final E f180121e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ImageView f180122f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final LinearLayout f180123g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f180124h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public View.OnClickListener f180125i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public View.OnTouchListener f180126j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final ArrayList f180127k;

    /* compiled from: RadioButton.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/radio/RadioButton$SavedState;", "Landroid/view/View$BaseSavedState;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SavedState extends View.BaseSavedState {

        @k
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Parcelable f180128b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f180129c;

        /* compiled from: RadioButton.kt */
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
            parcel.writeParcelable(this.f180128b, i12);
            parcel.writeInt(this.f180129c ? 1 : 0);
        }

        public SavedState(boolean z12, @k Parcelable parcelable) {
            super(parcelable);
            this.f180128b = parcelable;
            this.f180129c = z12;
        }
    }

    /* compiled from: RadioButton.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/lib/design/radio/RadioButton$a;", "", "<init>", "()V", "", "DEFAULT_ANIMATION_DURATION", "J", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public RadioButton(@k Context context) throws Resources.NotFoundException {
        super(context, null, 0);
        this.f180127k = new ArrayList();
        LayoutInflater.from(getContext()).inflate(R.layout.design_radio_button_layout, (ViewGroup) this, true);
        E e12 = (E) findViewById(R.id.radio_button);
        this.f180121e = e12;
        this.f180118b = (TextView) findViewById(R.id.title);
        this.f180119c = (TextView) findViewById(R.id.subtitle);
        this.f180120d = (TextView) findViewById(R.id.second_subtitle);
        this.f180122f = (ImageView) findViewById(R.id.icon);
        this.f180123g = (LinearLayout) findViewById(R.id.container);
        setClickable(true);
        setFocusable(true);
        setBackground(D6.u(this, R.drawable.design_radio_ripple));
        setOrientation(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, d.n.f178917E);
        CharSequence text = typedArrayObtainStyledAttributes.getText(3);
        setTitle(text != null ? text.toString() : null);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(2);
        setSubtitle(text2 != null ? text2.toString() : null);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        e12.setChecked(typedArrayObtainStyledAttributes.getBoolean(1, false));
        typedArrayObtainStyledAttributes.recycle();
        super.setOnTouchListener(new ViewOnTouchListenerC13234a(this, 9));
    }

    public static void a(E e12, boolean z12, boolean z13) {
        if (!z12) {
            e12.post(new b(8, e12, z13));
            return;
        }
        e12.setScaleX(0.0f);
        e12.setScaleY(0.0f);
        e12.setChecked(z13);
        e12.animate().scaleX(1.0f).scaleY(1.0f).setDuration(200L).start();
    }

    public static boolean b(RadioButton radioButton, float f12, float f13) {
        radioButton.getClass();
        return f12 >= -0.0f && f13 >= -0.0f && f12 < ((float) (radioButton.getRight() - radioButton.getLeft())) + 0.0f && f13 < ((float) (radioButton.getBottom() - radioButton.getTop())) + 0.0f;
    }

    @Override // com.avito.android.lib.design.radio.a
    public final void f(@k a.InterfaceC5292a interfaceC5292a) {
        this.f180127k.add(interfaceC5292a);
    }

    @k
    public final String getSubtitle() {
        return this.f180119c.getText().toString();
    }

    @k
    public final String getTitle() {
        return this.f180118b.getText().toString();
    }

    @Override // com.avito.android.lib.design.radio.a
    public final void h(@k a.InterfaceC5292a interfaceC5292a) {
        this.f180127k.remove(interfaceC5292a);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f180121e.isChecked();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@l Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        a(this.f180121e, false, savedState.f180129c);
    }

    @Override // android.view.View
    @k
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState(), false, 2, null);
        savedState.f180129c = this.f180121e.isChecked();
        return savedState;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean checked) {
        E e12 = this.f180121e;
        if (e12.isChecked() != checked) {
            Iterator it = this.f180127k.iterator();
            while (it.hasNext()) {
                ((a.InterfaceC5292a) it.next()).b(this);
            }
            a(e12, checked, checked);
        }
        View.OnClickListener onClickListener = this.f180125i;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public final void setCustomContent(@k List<? extends View> contentViews) {
        LinearLayout linearLayout = this.f180123g;
        linearLayout.removeAllViews();
        Iterator<T> it = contentViews.iterator();
        while (it.hasNext()) {
            linearLayout.addView((View) it.next());
        }
    }

    public final void setImageClickedListener(@l View.OnClickListener listener) {
        this.f180122f.setOnClickListener(listener);
    }

    public final void setImageColor(@l ColorStateList color) {
        this.f180122f.setImageTintList(color);
    }

    public final void setImageDrawable(@l Drawable drawable) {
        ImageView imageView = this.f180122f;
        C35821j2.a(imageView, drawable);
        D6.G(imageView, drawable != null);
    }

    public final void setImageResource(@InterfaceC42165v int drawableRes) {
        Integer numValueOf = Integer.valueOf(drawableRes);
        Drawable drawable = null;
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            drawable = getContext().getDrawable(numValueOf.intValue());
        }
        setImageDrawable(drawable);
    }

    @Override // android.view.View
    public void setOnClickListener(@l View.OnClickListener l12) {
        this.f180125i = l12;
    }

    @Override // android.view.View
    public void setOnTouchListener(@l View.OnTouchListener l12) {
        this.f180126j = l12;
    }

    public final void setSecondSubtitle(@l CharSequence subtitle) {
        TextView textView = this.f180120d;
        I5.a(textView, subtitle, false);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final void setSubtitle(@l CharSequence subtitle) throws Resources.NotFoundException {
        TextView textView = this.f180119c;
        I5.a(textView, subtitle, false);
        if (D6.y(textView)) {
            return;
        }
        E e12 = this.f180121e;
        ViewGroup.LayoutParams layoutParams = e12.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            int dimensionPixelSize = e12.getResources().getDimensionPixelSize(R.dimen.design_radio_button_vertical_margin_without_subtitle);
            layoutParams2.topMargin = dimensionPixelSize;
            layoutParams2.bottomMargin = dimensionPixelSize;
        }
        LinearLayout linearLayout = this.f180123g;
        ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
        LinearLayout.LayoutParams layoutParams4 = layoutParams3 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams3 : null;
        if (layoutParams4 != null) {
            int dimensionPixelSize2 = linearLayout.getResources().getDimensionPixelSize(R.dimen.design_radio_button_vertical_margin_without_subtitle);
            layoutParams4.topMargin = dimensionPixelSize2;
            layoutParams4.bottomMargin = dimensionPixelSize2;
        }
    }

    public final void setTitle(@l CharSequence title) {
        I5.a(this.f180118b, title, false);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f180121e.isChecked());
    }

    public final void setImageColor(@InterfaceC42156l int color) {
        setImageColor(ColorStateList.valueOf(color));
    }
}
