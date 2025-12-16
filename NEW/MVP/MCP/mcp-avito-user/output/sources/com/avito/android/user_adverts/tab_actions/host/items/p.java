package com.avito.android.user_adverts.tab_actions.host.items;

import android.content.res.ColorStateList;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.user_adverts.tab_actions.host.items.n;
import com.avito.android.util.C35835l0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UserAdvertActionItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/items/p;", "Lcom/avito/android/user_adverts/tab_actions/host/items/n;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class p implements n {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final n.a f314346b;

    @Inject
    public p(@Y61.k n.a aVar) {
        this.f314346b = aVar;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.C] */
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        r rVar = (r) eVar;
        UserAdvertSingleActionItem userAdvertSingleActionItem = (UserAdvertSingleActionItem) aVar;
        rVar.itemView.setOnClickListener(new com.avito.android.user_advert.advert.items.service_booking.i(11, new o(this, userAdvertSingleActionItem)));
        boolean z12 = userAdvertSingleActionItem.f314309j;
        rVar.f314351d.setVisibility(z12 ? 0 : 8);
        int i13 = z12 ? 8 : 0;
        ImageView imageView = rVar.f314352e;
        imageView.setVisibility(i13);
        Integer numA = com.avito.android.lib.util.q.a(userAdvertSingleActionItem.f314303d);
        if (numA != null) {
            imageView.setImageDrawable(C35835l0.h(numA.intValue(), rVar.f314349b));
        }
        String str = userAdvertSingleActionItem.f314305f;
        TextView textView = rVar.f314350c;
        textView.setText(str);
        int iOrdinal = userAdvertSingleActionItem.f314306g.ordinal();
        if (iOrdinal == 0) {
            ?? r52 = rVar.f314353f;
            imageView.setImageTintList((ColorStateList) r52.getValue());
            textView.setTextColor((ColorStateList) r52.getValue());
        } else {
            if (iOrdinal != 1) {
                return;
            }
            ?? r53 = rVar.f314354g;
            imageView.setImageTintList((ColorStateList) r53.getValue());
            textView.setTextColor((ColorStateList) r53.getValue());
        }
    }
}
