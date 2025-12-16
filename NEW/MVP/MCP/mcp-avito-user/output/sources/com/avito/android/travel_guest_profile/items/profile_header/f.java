package com.avito.android.travel_guest_profile.items.profile_header;

import Y41.l;
import Y61.k;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import sK0.C48063a;

/* compiled from: ProfileHeaderItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/travel_guest_profile/items/profile_header/f;", "LTV0/d;", "Lcom/avito/android/travel_guest_profile/items/profile_header/i;", "Lcom/avito/android/travel_guest_profile/items/profile_header/a;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements TV0.d<i, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<QE0.a, G0> f302093b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super QE0.a, G0> lVar) {
        this.f302093b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        a aVar2 = (a) aVar;
        AttributedText attributedText = aVar2.f302079b;
        l<QE0.a, G0> lVar = this.f302093b;
        SE0.b.a(lVar, attributedText);
        j.a(iVar.f302098b, attributedText, null);
        AttributedText attributedText2 = aVar2.f302080c;
        if (attributedText2 != null) {
            SE0.b.a(lVar, attributedText2);
        } else {
            attributedText2 = null;
        }
        TextView textView = iVar.f302100d;
        ImageView imageView = iVar.f302099c;
        if (attributedText2 == null) {
            D6.w(imageView);
            textView.setText(R.string.travel_guest_profile_no_rating);
        } else {
            D6.H(imageView);
            j.a(textView, attributedText2, null);
        }
        AttributedText attributedText3 = aVar2.f302081d;
        SE0.b.a(lVar, attributedText3);
        j.a(iVar.f302101e, attributedText3, null);
        AttributedText attributedText4 = aVar2.f302082e;
        SE0.b.a(lVar, attributedText4);
        j.a(iVar.f302102f, attributedText4, null);
        d dVar = new d(this, aVar2);
        ImageView imageView2 = iVar.f302103g;
        ImageRequest.a aVar3 = new ImageRequest.a(new DM.a(imageView2));
        aVar3.d(com.avito.android.image_loader.b.b(aVar2.f302083f));
        aVar3.f169503u = true;
        aVar3.c();
        imageView2.setOnClickListener(new h(0, dVar));
        e eVar2 = new e(this);
        LinearLayout linearLayout = iVar.f302104h;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(linearLayout.getContext());
        if (layoutInflaterFrom != null) {
            linearLayout.removeAllViews();
            List<PE0.f> list = aVar2.f302084g;
            if (list.isEmpty()) {
                D6.w(linearLayout);
            } else {
                D6.H(linearLayout);
                for (PE0.f fVar : list) {
                    View viewInflate = layoutInflaterFrom.inflate(R.layout.travel_guest_profile_header_badge, (ViewGroup) linearLayout, false);
                    if (viewInflate != null) {
                        viewInflate.setOnClickListener(new com.avito.android.tariff.cpx.configure.levels.d(8, eVar2, fVar));
                        TextView textView2 = (TextView) viewInflate.findViewById(R.id.badge_title_tv);
                        textView2.setText(fVar.f12894a);
                        UniversalColor universalColor = fVar.f12896c;
                        if (universalColor != null) {
                            textView2.setTextColor(C48063a.f437606a.a(viewInflate.getContext(), universalColor));
                        }
                        ImageRequest.a aVar4 = new ImageRequest.a(new DM.a((ImageView) viewInflate.findViewById(R.id.badge_icon)));
                        UniversalImage universalImage = fVar.f12897d;
                        com.avito.android.advert.item.delivery_suggests.l.w(universalImage != null ? com.avito.android.advert.item.delivery_suggests.l.g(viewInflate, universalImage) : null, aVar4);
                        UniversalColor universalColor2 = fVar.f12895b;
                        if (universalColor2 != null) {
                            viewInflate.setBackgroundTintList(ColorStateList.valueOf(C48063a.f437606a.a(viewInflate.getContext(), universalColor2)));
                        }
                        linearLayout.addView(viewInflate);
                    }
                }
            }
        }
        PE0.g gVar = aVar2.f302085h;
        j.a(iVar.f302105i, gVar != null ? gVar.f12899a : null, null);
        j.a(iVar.f302106j, gVar != null ? gVar.f12900b : null, null);
    }
}
