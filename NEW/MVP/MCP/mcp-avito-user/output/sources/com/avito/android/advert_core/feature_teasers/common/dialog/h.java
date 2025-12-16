package com.avito.android.advert_core.feature_teasers.common.dialog;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.DrawableMarginSpan;
import android.widget.TextView;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsFeatureTeaserDialogTextItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert_core/feature_teasers/common/dialog/h;", "LTV0/d;", "Lcom/avito/android/advert_core/feature_teasers/common/dialog/j;", "Lcom/avito/android/advert_core/feature_teasers/common/dialog/e;", "Lcom/avito/android/deep_linking/links/w;", "<init>", "()V", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements TV0.d<j, e>, w {
    @Inject
    public h() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        SpannableString spannableString;
        j jVar = (j) eVar;
        e eVar2 = (e) aVar;
        AttributedText attributedText = eVar2.f83626d;
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(this);
        }
        TextView textView = jVar.f83641c;
        textView.setTextAppearance(C35835l0.j(eVar2.f83627e, textView.getContext()));
        CharSequence charSequenceC = eVar2.f83625c;
        if (charSequenceC == null) {
            charSequenceC = jVar.f83640b.c(textView.getContext(), attributedText);
        }
        Drawable drawableA = com.avito.android.advert_core.feature_teasers.common.a.a(eVar2.f83630h, textView.getContext());
        int i13 = eVar2.f83632j;
        int iA2 = V9.a.a(textView.getContext(), Integer.valueOf(i13));
        if (charSequenceC == null) {
            spannableString = null;
        } else {
            spannableString = new SpannableString(charSequenceC);
            if (drawableA != null) {
                spannableString.setSpan(new DrawableMarginSpan(drawableA, iA2), 0, 0, 18);
            }
        }
        textView.setText(spannableString);
        I5.d(textView, null, com.avito.android.advert_core.feature_teasers.common.a.a(eVar2.f83629g, textView.getContext()), 11);
        textView.setCompoundDrawablePadding(V9.a.a(textView.getContext(), Integer.valueOf(i13)));
        Integer num = eVar2.f83631i;
        if (num != null) {
            textView.setPadding(V9.a.a(textView.getContext(), Integer.valueOf(num.intValue())), textView.getPaddingTop(), textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    @Override // com.avito.android.deep_linking.links.w
    public final void i7(@Y61.k DeepLink deepLink) {
    }
}
