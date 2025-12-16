package com.avito.android.lib.deprecated_design;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.imv_similiar_adverts.h;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import fw.C40487a;
import hw.InterfaceC41179d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SelectView.kt */
@s0
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001$J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u0019\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\nJ\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\fJ\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0015\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\nJ\u0015\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001bJ\u001d\u0010 \u001a\u00020\u00042\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0018H\u0016¢\u0006\u0004\b#\u0010\u001b¨\u0006%"}, d2 = {"Lcom/avito/android/lib/deprecated_design/SelectView;", "Landroid/widget/RelativeLayout;", "Lcom/avito/android/lib/deprecated_design/d;", "Landroid/widget/TextView;", "Lkotlin/G0;", "setNormalOrDisabledTextColor", "(Landroid/widget/TextView;)V", "", "value", "setValue", "(Ljava/lang/CharSequence;)V", "getValue", "()Ljava/lang/CharSequence;", "title", "setTitle", "getTitle", RequestReviewResultKt.INFO_TYPE, "setInfo", "getInfo", "", "stringRes", "setError", "(I)V", "error", "", "visible", "setIconVisible", "(Z)V", "canBeCleared", "setCanBeCleared", "Lkotlin/Function0;", "listener", "setOnClearListener", "(LY41/a;)V", "enabled", "setEnabled", "SavedState", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC41179d
/* loaded from: classes14.dex */
public final class SelectView extends RelativeLayout implements d {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f177780s = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f177781b;

    /* renamed from: c, reason: collision with root package name */
    public final int f177782c;

    /* renamed from: d, reason: collision with root package name */
    public final int f177783d;

    /* renamed from: e, reason: collision with root package name */
    public final int f177784e;

    /* renamed from: f, reason: collision with root package name */
    public final int f177785f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f177786g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f177787h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final TextView f177788i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final View f177789j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final ImageView f177790k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final View f177791l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public CharSequence f177792m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public CharSequence f177793n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public CharSequence f177794o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public CharSequence f177795p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f177796q;

    /* renamed from: r, reason: collision with root package name */
    @l
    public Y41.a<G0> f177797r;

    /* compiled from: SelectView.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/SelectView$SavedState;", "Landroid/view/View$BaseSavedState;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SavedState extends View.BaseSavedState {

        @k
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f177798b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f177799c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f177800d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f177801e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f177802f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final Parcelable f177803g;

        /* compiled from: SelectView.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readParcelable(SavedState.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i12) {
                return new SavedState[i12];
            }
        }

        public SavedState(@l String str, @l String str2, @l String str3, @l String str4, boolean z12, @k Parcelable parcelable) {
            super(parcelable);
            this.f177798b = str;
            this.f177799c = str2;
            this.f177800d = str3;
            this.f177801e = str4;
            this.f177802f = z12;
            this.f177803g = parcelable;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f177798b);
            parcel.writeString(this.f177799c);
            parcel.writeString(this.f177800d);
            parcel.writeString(this.f177801e);
            parcel.writeInt(this.f177802f ? 1 : 0);
            parcel.writeParcelable(this.f177803g, i12);
        }
    }

    @j
    public SelectView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final void setNormalOrDisabledTextColor(TextView textView) {
        if (textView.isEnabled()) {
            textView.setTextColor(this.f177784e);
        } else {
            textView.setTextColor(this.f177785f);
        }
    }

    public final void a() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z12 = this.f177796q && (charSequence = this.f177792m) != null && charSequence.length() != 0 && ((charSequence2 = this.f177795p) == null || charSequence2.length() == 0);
        D6.G(this.f177791l, z12);
        int i12 = z12 ? R.id.clear_button : R.id.icon;
        TextView textView = this.f177786g;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams != null && (layoutParams instanceof RelativeLayout.LayoutParams)) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(0, i12);
            textView.requestLayout();
        }
        TextView textView2 = this.f177787h;
        ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
        if (layoutParams2 == null || !(layoutParams2 instanceof RelativeLayout.LayoutParams)) {
            return;
        }
        ((RelativeLayout.LayoutParams) layoutParams2).addRule(0, i12);
        textView2.requestLayout();
    }

    public final void b() {
        int i12;
        CharSequence charSequence = this.f177792m;
        boolean z12 = charSequence == null || charSequence.length() == 0;
        TextView textView = this.f177786g;
        if (z12) {
            D6.w(textView);
            i12 = this.f177782c;
        } else {
            D6.H(textView);
            i12 = this.f177781b;
        }
        TextView textView2 = this.f177787h;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView2.getLayoutParams();
        if (layoutParams.topMargin == i12 || layoutParams.bottomMargin == i12) {
            return;
        }
        layoutParams.topMargin = i12;
        layoutParams.bottomMargin = i12;
        textView2.requestLayout();
    }

    @l
    /* renamed from: getInfo, reason: from getter */
    public CharSequence getF177794o() {
        return this.f177794o;
    }

    @l
    /* renamed from: getTitle, reason: from getter */
    public CharSequence getF177793n() {
        return this.f177793n;
    }

    @l
    /* renamed from: getValue, reason: from getter */
    public CharSequence getF177792m() {
        return this.f177792m;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@l Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setTitle(savedState.f177799c);
        setInfo(savedState.f177800d);
        setValue(savedState.f177798b);
        setError(savedState.f177801e);
        setCanBeCleared(savedState.f177802f);
    }

    @Override // android.view.View
    @l
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        CharSequence charSequence = this.f177792m;
        String string = charSequence != null ? charSequence.toString() : null;
        CharSequence charSequence2 = this.f177793n;
        String string2 = charSequence2 != null ? charSequence2.toString() : null;
        CharSequence charSequence3 = this.f177794o;
        String string3 = charSequence3 != null ? charSequence3.toString() : null;
        CharSequence charSequence4 = this.f177795p;
        return new SavedState(string, string2, string3, charSequence4 != null ? charSequence4.toString() : null, this.f177796q, parcelableOnSaveInstanceState);
    }

    public final void setCanBeCleared(boolean canBeCleared) {
        this.f177796q = canBeCleared;
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        TextView textView = this.f177787h;
        textView.setEnabled(enabled);
        setNormalOrDisabledTextColor(textView);
        setIconVisible(enabled);
    }

    public void setError(int stringRes) {
        setError(getResources().getString(stringRes));
    }

    public final void setIconVisible(boolean visible) {
        D6.G(this.f177790k, visible);
    }

    public void setInfo(@l CharSequence info) {
        this.f177794o = info;
        TextView textView = this.f177788i;
        textView.setText(info);
        CharSequence charSequence = this.f177794o;
        boolean z12 = charSequence == null || charSequence.length() == 0;
        View view = this.f177789j;
        if (z12) {
            D6.w(textView);
            D6.w(view);
        } else {
            D6.H(textView);
            D6.H(view);
        }
    }

    public final void setOnClearListener(@l Y41.a<G0> listener) {
        this.f177797r = listener;
    }

    public void setTitle(@l CharSequence title) {
        this.f177793n = title;
        this.f177786g.setText(title);
        this.f177787h.setHint(title);
    }

    public void setValue(@l CharSequence value) {
        setError((CharSequence) null);
        this.f177792m = value;
        this.f177787h.setText(value);
        b();
        a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SelectView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        attributeSet = (i13 & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, (i13 & 4) != 0 ? 0 : i12);
        h hVar = new h(this, 13);
        this.f177781b = getResources().getDimensionPixelSize(R.dimen.hint_visible_value_vertical_margin);
        this.f177782c = getResources().getDimensionPixelSize(R.dimen.hint_hidden_value_vertical_margin);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C40487a.l.f396192g);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(1, R.layout.posting_select_view), this);
        this.f177786g = (TextView) findViewById(R.id.floating_label);
        this.f177787h = (TextView) findViewById(R.id.value_label);
        this.f177788i = (TextView) findViewById(R.id.info_label);
        this.f177789j = findViewById(R.id.info_label_divider);
        this.f177790k = (ImageView) findViewById(R.id.icon);
        View viewFindViewById = findViewById(R.id.clear_button);
        this.f177791l = viewFindViewById;
        viewFindViewById.setOnClickListener(hVar);
        this.f177784e = typedArrayObtainStyledAttributes.getColor(0, C35835l0.d(R.attr.black, context));
        this.f177785f = typedArrayObtainStyledAttributes.getColor(4, C35835l0.d(R.attr.gray48, context));
        this.f177783d = typedArrayObtainStyledAttributes.getColor(5, C35835l0.d(R.attr.red, context));
        setTitle(typedArrayObtainStyledAttributes.getString(3));
        setInfo(typedArrayObtainStyledAttributes.getString(7));
        setValue(typedArrayObtainStyledAttributes.getString(2));
        setIconVisible(typedArrayObtainStyledAttributes.getBoolean(6, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setError(@l CharSequence error) {
        this.f177795p = error;
        TextView textView = this.f177787h;
        textView.setText(error);
        b();
        a();
        if (error == null || error.length() == 0) {
            setNormalOrDisabledTextColor(textView);
        } else {
            textView.setTextColor(this.f177783d);
        }
    }
}
