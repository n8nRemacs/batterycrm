package com.avito.android.rating_ui.aspects.view.button;

import K51.d;
import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: RatingAspectsButton.kt */
@s0
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\f\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u0001\u0017J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000fR$\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/avito/android/rating_ui/aspects/view/button/RatingAspectsButton;", "Landroid/widget/FrameLayout;", "LLV/a;", "Lcom/avito/android/rating_ui/aspects/view/button/b;", "Lcom/avito/android/rating_ui/aspects/view/button/c;", "newState", "Lkotlin/G0;", "setState", "(Lcom/avito/android/rating_ui/aspects/view/button/b;)V", "newStyle", "setStyle", "(Lcom/avito/android/rating_ui/aspects/view/button/c;)V", "", "text", "setText", "(Ljava/lang/CharSequence;)V", "setSubtitle", "b", "Lcom/avito/android/rating_ui/aspects/view/button/c;", "getStyle$_avito_rating_ui_impl", "()Lcom/avito/android/rating_ui/aspects/view/button/c;", "setStyle$_avito_rating_ui_impl", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "SavedState", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RatingAspectsButton extends FrameLayout implements LV.a<b, c> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    public c style;

    /* renamed from: c, reason: collision with root package name */
    @l
    public b f249907c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ViewGroup f249908d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f249909e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f249910f;

    /* compiled from: RatingAspectsButton.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/aspects/view/button/RatingAspectsButton$SavedState;", "Landroid/view/View$BaseSavedState;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SavedState extends View.BaseSavedState {

        @k
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Parcelable f249911b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f249912c;

        /* compiled from: RatingAspectsButton.kt */
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

        public SavedState(boolean z12, @l Parcelable parcelable) {
            super(parcelable);
            this.f249911b = parcelable;
            this.f249912c = z12;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f249911b, i12);
            parcel.writeInt(this.f249912c ? 1 : 0);
        }
    }

    /* compiled from: RatingAspectsButton.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onClick", "(Landroid/view/View;)V", "com/avito/android/rating_ui/aspects/view/button/a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a implements View.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f249913b;

        public a(Object obj) {
            this.f249913b = obj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((Y41.a) this.f249913b).invoke();
        }
    }

    @j
    public RatingAspectsButton(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public static void b(RatingAspectsButton ratingAspectsButton, int i12, int i13) {
        ratingAspectsButton.f249908d.setPadding(i12, ratingAspectsButton.f249908d.getPaddingTop(), i13, ratingAspectsButton.f249908d.getPaddingBottom());
    }

    public final void a() {
        TextView textView = this.f249909e;
        if (textView.getText().length() == 0) {
            textView.setCompoundDrawablePadding(0);
            b(this, 0, 0);
        } else {
            c cVar = this.style;
            b(this, cVar != null ? cVar.f249926g : 0, cVar != null ? cVar.f249927h : 0);
        }
    }

    @l
    /* renamed from: getStyle$_avito_rating_ui_impl, reason: from getter */
    public final c getStyle() {
        return this.style;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@l Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setEnabled(savedState.f249912c);
    }

    @Override // android.view.View
    @k
    public final Parcelable onSaveInstanceState() {
        return new SavedState(isEnabled(), super.onSaveInstanceState());
    }

    public final void setStyle$_avito_rating_ui_impl(@l c cVar) {
        this.style = cVar;
    }

    public final void setSubtitle(@k CharSequence text) {
        I5.a(this.f249910f, text, false);
        a();
    }

    public final void setText(@k CharSequence text) {
        I5.a(this.f249909e, text, false);
        a();
    }

    public RatingAspectsButton(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        super(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? R.attr.ratingAspects : i12, (i14 & 8) != 0 ? 0 : i13);
        LayoutInflater.from(context).inflate(R.layout.rating_aspects_button, (ViewGroup) this, true);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.rating_aspects_button_text_container);
        this.f249908d = viewGroup;
        TextView textView = (TextView) viewGroup.findViewById(R.id.rating_aspects_button_text);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.f249909e = textView;
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.rating_aspects_button_subtitle);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        this.f249910f = textView2;
        setClickable(true);
        setFocusable(true);
    }

    @Override // LV.b
    public void setState(@k b newState) {
        b bVar = this.f249907c;
        if (new com.avito.android.lib.util.c(newState, bVar).f181333c) {
            return;
        }
        this.f249907c = newState;
        CharSequence charSequence = bVar != null ? bVar.f249914a : null;
        CharSequence charSequence2 = newState.f249914a;
        if (!new com.avito.android.lib.util.c(charSequence2, charSequence).f181333c && charSequence2 != null) {
            setText(charSequence2);
        }
        String str = bVar != null ? bVar.f249915b : null;
        String str2 = newState.f249915b;
        if (!new com.avito.android.lib.util.c(str2, str).f181333c && str2 != null) {
            setSubtitle(str2);
        }
        boolean z12 = newState.f249916c;
        if (!new com.avito.android.lib.util.c(Boolean.valueOf(z12), bVar != null ? Boolean.valueOf(bVar.f249916c) : null).f181333c) {
            setEnabled(z12);
        }
        Y41.a<G0> aVar = bVar != null ? bVar.f249918e : null;
        Y41.a<G0> aVar2 = newState.f249918e;
        if (!new com.avito.android.lib.util.c(aVar2, aVar).f181333c) {
            Y41.a<G0> aVar3 = aVar2;
            if (aVar3 != null) {
                setOnClickListener(new a(aVar3));
            } else {
                setOnClickListener(null);
            }
        }
        boolean z13 = newState.f249917d;
        if (new com.avito.android.lib.util.c(Boolean.valueOf(z13), bVar != null ? Boolean.valueOf(bVar.f249917d) : null).f181333c) {
            return;
        }
        setClickable(z13);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d3  */
    @Override // LV.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStyle(@Y61.k com.avito.android.rating_ui.aspects.view.button.c r13) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_ui.aspects.view.button.RatingAspectsButton.setStyle(com.avito.android.rating_ui.aspects.view.button.c):void");
    }
}
