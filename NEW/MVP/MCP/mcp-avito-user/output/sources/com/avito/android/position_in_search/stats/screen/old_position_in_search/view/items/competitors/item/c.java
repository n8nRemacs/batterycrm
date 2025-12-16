package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.competitors.item;

import TV0.e;
import Y41.l;
import Y61.k;
import android.content.Context;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.root.list.items.legacy_status.i;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.competitors.b;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CompetitorItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/competitors/item/c;", "LTV0/d;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/competitors/item/d;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/competitors/b$a;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements TV0.d<d, b.a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f220986b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k l<? super DeepLink, G0> lVar) {
        this.f220986b = lVar;
    }

    @Override // TV0.d
    public final void O5(e eVar, TV0.a aVar, int i12) {
        d dVar = (d) eVar;
        b.a aVar2 = (b.a) aVar;
        SimpleDraweeView simpleDraweeView = dVar.f220988b;
        Image image = aVar2.f220957c;
        if (image == null) {
            simpleDraweeView.getHierarchy().b();
        } else {
            com.avito.android.advert.item.delivery_suggests.l.w(image, C35949t5.a(simpleDraweeView));
        }
        dVar.f220989c.setText(aVar2.f220958d);
        TextView textView = dVar.f220990d;
        textView.setText(aVar2.f220959e);
        dVar.f220991e.setText(aVar2.f220960f);
        b.a.C6675a c6675a = aVar2.f220961g;
        Integer num = c6675a != null ? c6675a.f220963a : null;
        TextView textView2 = dVar.f220992f;
        if (num != null) {
            int iIntValue = num.intValue();
            FV.a aVar3 = FV.a.f4720a;
            Context context = dVar.itemView.getContext();
            aVar3.getClass();
            textView2.setText(FV.a.b(iIntValue, context));
        }
        D6.G(textView2, num != null);
        String str = c6675a != null ? c6675a.f220964b : null;
        TextView textView3 = dVar.f220993g;
        textView3.setText(str);
        D6.G(textView3, str != null);
        String str2 = c6675a != null ? c6675a.f220965c : null;
        TextView textView4 = dVar.f220994h;
        textView4.setText(str2);
        D6.G(textView4, str2 != null);
        b bVar = new b(this, aVar2);
        simpleDraweeView.setOnClickListener(new i(28, bVar));
        textView.setOnClickListener(new i(29, bVar));
    }
}
