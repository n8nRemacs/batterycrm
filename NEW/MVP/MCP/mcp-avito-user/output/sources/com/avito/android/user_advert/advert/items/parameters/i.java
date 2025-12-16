package com.avito.android.user_advert.advert.items.parameters;

import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.util.q;
import com.avito.android.remote.model.AdvertParameters;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import sK0.C48063a;

/* compiled from: MyAdvertParameterOneColumnItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/parameters/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/parameters/h;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f309784d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f309785b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ImageView f309786c;

    public i(@k View view) {
        super(view);
        this.f309785b = (TextView) view.findViewById(R.id.text_view);
        this.f309786c = (ImageView) view.findViewById(R.id.image_view);
        view.setPadding(view.getResources().getDimensionPixelSize(R.dimen.content_horizontal_padding), 0, view.getResources().getDimensionPixelSize(R.dimen.content_horizontal_padding), 0);
    }

    @Override // com.avito.android.user_advert.advert.items.parameters.h
    public final void vt(@k String str, @k String str2, @l UniversalColor universalColor, @l AdvertParameters.Button button, @l DeepLink deepLink, @k Y41.a<G0> aVar, @k Y41.a<G0> aVar2) {
        String color;
        Integer numA;
        String name;
        Integer numA2;
        TextView textView = this.f309785b;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(textView.getContext().getString(R.string.advert_core_advert_details_flat_text, str, str2));
        int I12 = C43066x.I(spannableStringBuilder.toString(), ":", 0, false, 6);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C35835l0.d(R.attr.gray48, textView.getContext())), 0, I12 + 1, 33);
        if (universalColor != null) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C48063a.f437606a.a(textView.getContext(), universalColor)), I12 + 2, spannableStringBuilder.length(), 33);
        } else if (deepLink != null) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C35835l0.d(R.attr.blue, textView.getContext())), I12 + 2, spannableStringBuilder.length(), 33);
        }
        textView.setText(spannableStringBuilder);
        I5.c(textView, aVar);
        boolean z12 = button != null;
        ImageView imageView = this.f309786c;
        D6.G(imageView, z12);
        if (button != null) {
            AdvertParameters.Button.ButtonIcon icon = button.getIcon();
            int iIntValue = (icon == null || (name = icon.getName()) == null || (numA2 = q.a(name)) == null) ? R.attr.ic_help24 : numA2.intValue();
            AdvertParameters.Button.ButtonIcon icon2 = button.getIcon();
            Drawable drawableM = C35835l0.m(imageView.getContext(), iIntValue, (icon2 == null || (color = icon2.getColor()) == null || (numA = com.avito.android.lib.util.e.a(color)) == null) ? R.attr.warmGray28 : numA.intValue());
            imageView.setImageDrawable(drawableM);
            if (drawableM != null) {
                imageView.setBaseline((int) ((textView.getTextSize() + drawableM.getIntrinsicHeight()) / 2.0f));
            }
            imageView.setOnClickListener(new com.avito.android.travel_guest_profile.items.profile_header.h(19, aVar2));
        }
    }
}
