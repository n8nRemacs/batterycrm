package com.avito.android.user_advert.advert.items.safe_deal_services.list;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.user_advert.advert.items.safe_deal_services.a;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SafeDealServiceListItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/safe_deal_services/list/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/safe_deal_services/list/h;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f310061c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ListItem f310062b;

    public i(@k View view) {
        super(view);
        ListItem listItem = (ListItem) view;
        this.f310062b = listItem;
        listItem.setLinkMovementMethod(LinkMovementMethod.getInstance());
        listItem.setClickable(true);
    }

    public static Drawable B80(Context context, com.avito.android.user_advert.advert.items.safe_deal_services.a aVar) {
        if (!(aVar instanceof a.C9501a)) {
            if (aVar instanceof a.b) {
                return context.getDrawable(((a.b) aVar).f310027a);
            }
            return null;
        }
        a.C9501a c9501a = (a.C9501a) aVar;
        Drawable drawableH = C35835l0.h(c9501a.f310025a, context);
        if (drawableH == null) {
            return drawableH;
        }
        drawableH.setTint(C35835l0.d(c9501a.f310026b, context));
        return drawableH;
    }

    @Override // com.avito.android.user_advert.advert.items.safe_deal_services.list.h
    public final void Eh(@l com.avito.android.user_advert.advert.items.safe_deal_services.a aVar, @l com.avito.android.user_advert.advert.items.safe_deal_services.a aVar2) {
        ListItem listItem = this.f310062b;
        Context context = listItem.getContext();
        listItem.g(B80(context, aVar), B80(context, aVar2));
    }

    @Override // com.avito.android.user_advert.advert.items.safe_deal_services.list.h
    public final void S(@k Y41.a<G0> aVar) {
        this.f310062b.setOnClickListener(new com.avito.android.travel_guest_profile.items.profile_header.h(27, aVar));
    }

    @Override // com.avito.android.user_advert.advert.items.safe_deal_services.list.h
    public final void Ub(@l SpannableString spannableString) {
        this.f310062b.setLink(spannableString);
    }

    @Override // com.avito.android.user_advert.advert.items.safe_deal_services.list.h
    public final void b(@k String str) {
        this.f310062b.setTitle(str);
    }

    @Override // com.avito.android.user_advert.advert.items.safe_deal_services.list.h
    public final void j(@l String str) {
        this.f310062b.setMessage(str);
    }
}
