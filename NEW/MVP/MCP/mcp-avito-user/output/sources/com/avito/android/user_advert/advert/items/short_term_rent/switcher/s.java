package com.avito.android.user_advert.advert.items.short_term_rent.switcher;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ShortTermRentSwitcherItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/short_term_rent/switcher/s;", "Lcom/avito/android/user_advert/advert/items/short_term_rent/switcher/r;", "Lcom/avito/konveyor/adapter/b;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class s extends com.avito.konveyor.adapter.b implements r {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f310276b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f310277c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ListItemSwitcher f310278d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public o f310279e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f310280f;

    public s(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        super(view);
        this.f310276b = aVar;
        Context context = view.getContext();
        this.f310277c = context;
        ListItemSwitcher listItemSwitcher = (ListItemSwitcher) view;
        this.f310278d = listItemSwitcher;
        listItemSwitcher.setImageDrawable(C35835l0.h(R.attr.ic_calendar24, context));
    }

    @Override // com.avito.android.user_advert.advert.items.short_term_rent.switcher.r
    public final void Bj() {
        o oVar = this.f310279e;
        if (oVar != null) {
            this.f310278d.j(oVar);
        }
    }

    @Override // com.avito.android.user_advert.advert.items.short_term_rent.switcher.r
    public final void U2(@Y61.k Y41.a<G0> aVar) {
        this.f310280f = aVar;
    }

    @Override // com.avito.android.user_advert.advert.items.short_term_rent.switcher.r
    public final void hK(@Y61.k o oVar) {
        this.f310279e = oVar;
        this.f310278d.e(oVar);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f310280f;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f310280f = null;
        Bj();
    }

    @Override // com.avito.android.user_advert.advert.items.short_term_rent.switcher.r
    public final void k(@Y61.l AttributedText attributedText) {
        CharSequence charSequenceC = this.f310276b.c(this.f310277c, attributedText);
        ListItemSwitcher listItemSwitcher = this.f310278d;
        listItemSwitcher.setLink(charSequenceC);
        listItemSwitcher.setLinkMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.user_advert.advert.items.short_term_rent.switcher.r
    public final void setChecked(boolean z12) {
        this.f310278d.setChecked(z12);
    }

    @Override // com.avito.android.user_advert.advert.items.short_term_rent.switcher.r
    public final void setEnabled(boolean z12) {
        this.f310278d.setEnabled(z12);
    }

    @Override // com.avito.android.user_advert.advert.items.short_term_rent.switcher.r
    public final void setTitle(@Y61.k String str) {
        this.f310278d.setTitle(str);
    }
}
