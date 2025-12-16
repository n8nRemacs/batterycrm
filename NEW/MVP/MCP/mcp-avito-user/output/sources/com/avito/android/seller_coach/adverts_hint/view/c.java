package com.avito.android.seller_coach.adverts_hint.view;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.seller_coach.adverts_hint.view.b;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: ShortAdvicesStackView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class c extends H implements Y41.a<b.a> {
    @Override // Y41.a
    @k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final b.a invoke() {
        b bVar = (b) this.receiver;
        ViewGroup viewGroup = bVar.f267323a;
        View viewB = (ViewGroup) viewGroup.findViewById(R.id.short_advices_container);
        if (viewB == null) {
            viewB = C0.b(viewGroup, R.layout.seller_coach_short_advices, viewGroup, true);
        }
        TextView textView = (TextView) viewB.findViewById(R.id.tv_seller_hints_count);
        TextView textView2 = (TextView) viewB.findViewById(R.id.tv_seller_hints_title);
        View viewFindViewById = viewB.findViewById(R.id.v_seller_hints_more);
        ViewPager2 viewPager2 = (ViewPager2) viewB.findViewById(R.id.seller_hints_viewPager);
        b.a aVar = new b.a(textView2, textView, viewFindViewById, viewPager2);
        viewPager2.setAdapter(bVar.f267326d);
        viewPager2.setOffscreenPageLimit(4);
        viewPager2.setPageTransformer(bVar.f267327e);
        viewPager2.e(bVar.f267328f);
        viewFindViewById.setOnClickListener(new com.avito.android.review_gallery.g(bVar, 16));
        return aVar;
    }
}
