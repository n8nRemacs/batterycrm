package com.avito.android.lib.design.header_button;

import FV.a;
import VU.b;
import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.d;
import com.avito.android.lib.util.f;
import com.avito.android.util.C35835l0;
import j.InterfaceC42150f;
import j.U;
import j.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: HeaderButton.kt */
@s0
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\b\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u0017\u0010\u0011\u001a\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0006R*\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/avito/android/lib/design/header_button/HeaderButton;", "Lcom/avito/android/lib/design/button/Button;", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lkotlin/G0;", "setAppearance", "(I)V", "resId", "setText", "", "text", "(Ljava/lang/CharSequence;)V", "color", "setTextColor", "textIconStyleAttr", "setTextIcon", "textIconStyleRes", "setTextIconStyleRes", "", "value", "w", "Z", "isIconPositionEnd", "()Z", "setIconPositionEnd", "(Z)V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HeaderButton extends Button {

    /* renamed from: o, reason: collision with root package name */
    @U
    public final int f179269o;

    /* renamed from: p, reason: collision with root package name */
    @U
    public final int f179270p;

    /* renamed from: q, reason: collision with root package name */
    @U
    public final int f179271q;

    /* renamed from: r, reason: collision with root package name */
    @U
    public final int f179272r;

    /* renamed from: s, reason: collision with root package name */
    @U
    public final int f179273s;

    /* renamed from: t, reason: collision with root package name */
    @U
    public final int f179274t;

    /* renamed from: u, reason: collision with root package name */
    @f0
    @l
    public Integer f179275u;

    /* renamed from: v, reason: collision with root package name */
    @l
    public CharSequence f179276v;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public boolean isIconPositionEnd;

    @j
    public HeaderButton(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public final void l() {
        CharSequence charSequenceH = this.f179276v;
        Integer num = this.f179275u;
        if (charSequenceH != null && num != null) {
            m(this.f179271q, this.f179272r);
            if (this.isIconPositionEnd) {
                a aVar = a.f4720a;
                Context context = getContext();
                int iIntValue = num.intValue();
                int i12 = a.f4721b;
                aVar.getClass();
                String strP = f.p(iIntValue, context);
                if (strP != null) {
                    charSequenceH = a.d(charSequenceH, strP, i12, null);
                }
            } else {
                a aVar2 = a.f4720a;
                Context context2 = getContext();
                int iIntValue2 = num.intValue();
                aVar2.getClass();
                String strP2 = f.p(iIntValue2, context2);
                if (strP2 != null) {
                    charSequenceH = a.h(strP2, charSequenceH, a.f4721b);
                }
            }
        } else if (num != null) {
            m(this.f179269o, this.f179270p);
            a aVar3 = a.f4720a;
            Context context3 = getContext();
            int iIntValue3 = num.intValue();
            aVar3.getClass();
            String strP3 = f.p(iIntValue3, context3);
            if (strP3 == null) {
                charSequenceH = "";
            } else {
                SpannableString spannableString = new SpannableString(strP3);
                spannableString.setSpan(new PK0.j(null, 1, null), 0, strP3.length(), 33);
                charSequenceH = spannableString;
            }
        } else {
            m(this.f179273s, this.f179274t);
        }
        getTextView().setText(charSequenceH);
    }

    public final void m(@U int i12, @U int i13) {
        b style = getCom.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel.SERIALIZED_NAME_STYLE java.lang.String();
        int i14 = i12 + (style != null ? style.f17160l : 0);
        b style2 = getCom.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel.SERIALIZED_NAME_STYLE java.lang.String();
        Button.k(this, i14, i13 + (style2 != null ? style2.f17161m : 0));
    }

    @Override // com.avito.android.lib.design.button.Button, pK0.InterfaceC46971a
    public void setAppearance(@f0 int style) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(style, d.n.f178935N);
        super.setAppearance(typedArrayObtainStyledAttributes.getResourceId(0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setIconPositionEnd(boolean z12) {
        this.isIconPositionEnd = z12;
        l();
    }

    @Override // com.avito.android.lib.design.button.Button
    public void setText(int resId) {
        setText(getContext().getString(resId));
    }

    @Override // com.avito.android.lib.design.button.Button
    public void setTextColor(int color) {
        CharSequence text = getTextView().getText();
        TextView textView = getTextView();
        SpannableString spannableString = new SpannableString(text);
        spannableString.setSpan(new ForegroundColorSpan(color), 0, text.length(), 33);
        textView.setText(spannableString);
    }

    public final void setTextIcon(@InterfaceC42150f int textIconStyleAttr) {
        this.f179275u = Integer.valueOf(C35835l0.j(textIconStyleAttr, getContext()));
        l();
    }

    public final void setTextIconStyleRes(@f0 int textIconStyleRes) {
        this.f179275u = Integer.valueOf(textIconStyleRes);
        l();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HeaderButton(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? 0 : i12;
        i13 = (i14 & 8) != 0 ? 0 : i13;
        int[] iArr = d.n.f178935N;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i12, i13);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        super(context, attributeSet, 0, resourceId);
        this.isIconPositionEnd = true;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i12, i13);
        this.f179269o = typedArrayObtainStyledAttributes2.getDimensionPixelSize(3, 0);
        this.f179270p = typedArrayObtainStyledAttributes2.getDimensionPixelSize(4, 0);
        this.f179271q = typedArrayObtainStyledAttributes2.getDimensionPixelSize(1, 0);
        this.f179272r = typedArrayObtainStyledAttributes2.getDimensionPixelSize(2, 0);
        this.f179273s = typedArrayObtainStyledAttributes2.getDimensionPixelSize(8, 0);
        this.f179274t = typedArrayObtainStyledAttributes2.getDimensionPixelSize(9, 0);
        this.f179276v = typedArrayObtainStyledAttributes2.getString(6);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(7, 0);
        this.f179275u = resourceId2 != 0 ? Integer.valueOf(resourceId2) : null;
        setIconPositionEnd(typedArrayObtainStyledAttributes2.getBoolean(5, true));
        typedArrayObtainStyledAttributes2.recycle();
        setMode(Button.Mode.f178634b);
        getTextView().setIncludeFontPadding(true);
    }

    @Override // com.avito.android.lib.design.button.Button
    public void setText(@k CharSequence text) {
        this.f179276v = text;
        l();
    }
}
