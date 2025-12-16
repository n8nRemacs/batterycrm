package com.avito.android.beduin.common.component.real_estate_filter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.StyleSpan;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.beduin.common.component.label.BeduinLabelLayout;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import sK0.C48063a;

/* compiled from: BeduinRealEstateFilterLayout.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/beduin/common/component/real_estate_filter/B;", "Landroid/widget/LinearLayout;", "Lcom/avito/android/beduin/common/component/label/BeduinLabelLayout;", "b", "Lcom/avito/android/beduin/common/component/label/BeduinLabelLayout;", "getFilterTitle", "()Lcom/avito/android/beduin/common/component/label/BeduinLabelLayout;", "filterTitle", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class B extends LinearLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f102269f = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final BeduinLabelLayout filterTitle;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f102271c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ImageButton f102272d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f102273e;

    public B(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.beduin_real_estate_filter_component, (ViewGroup) this, true);
        this.filterTitle = (BeduinLabelLayout) findViewById(R.id.filter_title);
        this.f102271c = (FrameLayout) findViewById(R.id.other_filters_container);
        this.f102272d = (ImageButton) findViewById(R.id.other_filters);
        this.f102273e = (TextView) findViewById(R.id.filters_badge_counter);
    }

    public final void a(@Y61.k String str, @Y61.l TitleStyle titleStyle) throws Resources.NotFoundException {
        String string;
        UniversalColor iconTintColor;
        if ((titleStyle != null ? titleStyle.getPrefix() : null) != null) {
            string = titleStyle.getPrefix() + (char) 160 + str + " >";
        } else {
            string = getResources().getString(R.string.real_estate_filter_format, str.concat(" >"));
        }
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new TextAppearanceSpan(getContext(), R.style.LookAndFeel_Text_H3), 0, spannableString.length() - 2, 33);
        spannableString.setSpan(new StyleSpan(1), 0, spannableString.length() - 2, 33);
        if (titleStyle != null && titleStyle.getLocationTextColor() != null) {
            spannableString.setSpan(new ForegroundColorSpan(C48063a.f437606a.a(getContext(), titleStyle.getLocationTextColor())), (spannableString.length() - str.length()) - 2, spannableString.length() - 2, 33);
        }
        Drawable drawable = getContext().getDrawable(R.drawable.real_estate_filter_arrow_down);
        drawable.setTint((titleStyle == null || (iconTintColor = titleStyle.getIconTintColor()) == null) ? C35835l0.d(R.attr.black, getContext()) : C48063a.f437606a.a(getContext(), iconTintColor));
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        spannableString.setSpan(new ImageSpan(drawable, 1), spannableString.length() - 1, spannableString.length(), 33);
        this.filterTitle.a(8388611, Integer.MAX_VALUE, null, spannableString, false);
    }

    @Y61.k
    public final BeduinLabelLayout getFilterTitle() {
        return this.filterTitle;
    }
}
