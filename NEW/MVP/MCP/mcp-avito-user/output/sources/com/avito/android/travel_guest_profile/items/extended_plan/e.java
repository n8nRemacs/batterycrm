package com.avito.android.travel_guest_profile.items.extended_plan;

import Y41.l;
import Y61.k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedPlanItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/travel_guest_profile/items/extended_plan/e;", "LTV0/d;", "Lcom/avito/android/travel_guest_profile/items/extended_plan/h;", "Lcom/avito/android/travel_guest_profile/items/extended_plan/a;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements TV0.d<h, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<QE0.a, G0> f302072b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super QE0.a, G0> lVar) {
        this.f302072b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        ImageView imageView = hVar.f302075b;
        Image imageDependsOnThemeOrDefault = UniversalImageKt.getImageDependsOnThemeOrDefault(aVar2.f302062b, com.avito.android.lib.util.darkTheme.c.b(imageView.getContext()));
        ImageRequest.a aVar3 = new ImageRequest.a(new DM.a(imageView));
        aVar3.d(com.avito.android.image_loader.b.b(imageDependsOnThemeOrDefault));
        aVar3.e(y6.b(20));
        aVar3.f169490h = new g(hVar);
        aVar3.c();
        AttributedText attributedText = aVar2.f302063c;
        l<QE0.a, G0> lVar = this.f302072b;
        SE0.b.a(lVar, attributedText);
        j.a(hVar.f302076c, attributedText, null);
        List<AttributedText> list = aVar2.f302064d;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (AttributedText attributedText2 : list) {
            SE0.b.a(lVar, attributedText2);
            arrayList.add(attributedText2);
        }
        LinearLayout linearLayout = hVar.f302077d;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(linearLayout.getContext());
        if (layoutInflaterFrom != null) {
            linearLayout.removeAllViews();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AttributedText attributedText3 = (AttributedText) it.next();
                View viewInflate = layoutInflaterFrom.inflate(R.layout.travel_guest_profile_extended_plan_benefit, (ViewGroup) linearLayout, false);
                if (!(viewInflate instanceof TextView)) {
                    viewInflate = null;
                }
                TextView textView = (TextView) viewInflate;
                if (textView == null) {
                    textView = null;
                } else {
                    j.a(textView, attributedText3, null);
                }
                if (textView != null) {
                    arrayList2.add(textView);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                linearLayout.addView((View) it2.next());
            }
        }
        PE0.e eVar2 = aVar2.f302065e;
        hVar.f302078e.setState(new UU.a(eVar2.f12891a, eVar2.f12892b, false, false, false, new d(this, aVar2), null, null, null, false, 988, null));
    }
}
