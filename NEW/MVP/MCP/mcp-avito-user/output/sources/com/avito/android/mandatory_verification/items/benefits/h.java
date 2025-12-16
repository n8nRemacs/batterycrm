package com.avito.android.mandatory_verification.items.benefits;

import Y61.k;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.mandatory_verification.items.benefits.MandatoryVerificationBenefitsItem;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MandatoryVerificationBenefitsItemViewImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mandatory_verification/items/benefits/h;", "Lcom/avito/android/mandatory_verification/items/benefits/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_mandatory-verification-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    public final Context f184645b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinearLayout f184646c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f184647d;

    public h(@k View view) {
        super(view);
        this.f184645b = view.getContext();
        this.f184646c = (LinearLayout) view.findViewById(R.id.benefits_item_root);
        this.f184647d = (TextView) view.findViewById(R.id.benefits_header);
    }

    @Override // com.avito.android.mandatory_verification.items.benefits.g
    public final void cj(@k MandatoryVerificationBenefitsItem mandatoryVerificationBenefitsItem) {
        I5.a(this.f184647d, mandatoryVerificationBenefitsItem.f184636c, false);
        LinearLayout linearLayout = this.f184646c;
        if (linearLayout.getChildCount() > 1) {
            linearLayout.removeViews(1, linearLayout.getChildCount() - 1);
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f184645b);
        for (MandatoryVerificationBenefitsItem.Benefit benefit : mandatoryVerificationBenefitsItem.f184637d) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.mandatory_verification_benefit_item, (ViewGroup) linearLayout, false);
            TextView textView = (TextView) viewInflate.findViewById(R.id.benefit_title);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.benefit_description);
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewInflate.findViewById(R.id.benefit_icon);
            I5.a(textView, benefit.f184639b, false);
            I5.a(textView2, benefit.f184640c, false);
            C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnTheme(benefit.f184641d, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext()))), null, null, null, 14);
            linearLayout.addView(viewInflate);
        }
    }
}
