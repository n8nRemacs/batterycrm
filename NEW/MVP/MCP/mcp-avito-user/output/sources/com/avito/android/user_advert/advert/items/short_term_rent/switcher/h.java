package com.avito.android.user_advert.advert.items.short_term_rent.switcher;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ShortTermRentHiddenSwitcherItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/short_term_rent/switcher/h;", "Lcom/avito/android/user_advert/advert/items/short_term_rent/switcher/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f310258b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f310259c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ListItem f310260d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f310261e;

    public h(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        super(view);
        this.f310258b = aVar;
        this.f310259c = view.getContext();
        this.f310260d = (ListItem) view;
    }

    @Override // com.avito.android.user_advert.advert.items.short_term_rent.switcher.g
    public final void U2(@Y61.k Y41.a<G0> aVar) {
        this.f310261e = aVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f310261e;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f310261e = null;
    }

    @Override // com.avito.android.user_advert.advert.items.short_term_rent.switcher.g
    public final void k(@Y61.l AttributedText attributedText) {
        CharSequence charSequenceC = this.f310258b.c(this.f310259c, attributedText);
        ListItem listItem = this.f310260d;
        listItem.setLink(charSequenceC);
        listItem.setLinkMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.user_advert.advert.items.short_term_rent.switcher.g
    public final void setTitle(@Y61.k String str) {
        this.f310260d.setTitle(str);
    }
}
