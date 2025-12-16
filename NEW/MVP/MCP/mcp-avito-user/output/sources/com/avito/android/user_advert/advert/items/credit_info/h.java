package com.avito.android.user_advert.advert.items.credit_info;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.lib.util.q;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CreditInfoItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/credit_info/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/credit_info/g;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f309349b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f309350c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ListItem f309351d;

    public h(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f309349b = aVar;
        Context context = view.getContext();
        this.f309350c = context;
        ListItem listItem = (ListItem) view;
        this.f309351d = listItem;
        listItem.setLinkMovementMethod(LinkMovementMethod.getInstance());
        Drawable drawable = androidx.core.content.d.getDrawable(context, R.drawable.ic_deal_wallet_24);
        if (drawable != null) {
            drawable.setTint(C35835l0.d(R.attr.gray28, context));
            ListItem.i(listItem, drawable);
        }
    }

    @Override // com.avito.android.user_advert.advert.items.credit_info.g
    public final void R(@l AttributedText attributedText) {
        this.f309351d.setLink(this.f309349b.c(this.f309350c, attributedText));
    }

    @Override // com.avito.android.user_advert.advert.items.credit_info.g
    public final void b(@k String str) {
        this.f309351d.setTitle(str);
    }

    @Override // com.avito.android.user_advert.advert.items.credit_info.g
    public final void nb(@l String str) {
        Integer numA = str != null ? q.a(str) : null;
        ListItem.i(this.f309351d, numA != null ? C35835l0.m(this.f309350c, numA.intValue(), R.attr.black) : null);
    }
}
