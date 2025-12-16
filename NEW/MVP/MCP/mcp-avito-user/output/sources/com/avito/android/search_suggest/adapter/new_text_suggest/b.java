package com.avito.android.search_suggest.adapter.new_text_suggest;

import Pp0.InterfaceC14824b;
import Y41.l;
import Y61.k;
import android.net.Uri;
import com.avito.android.image_loader.p;
import com.avito.android.list.new_text_suggest.e;
import com.avito.android.list.new_text_suggest.i;
import com.avito.android.remote.model.search.suggest.IconSize;
import com.avito.android.remote.model.search.suggest.IconStyle;
import com.avito.android.remote.model.search.suggest.RedesignTextSuggestItem;
import com.avito.android.remote.model.search.suggest.ServerIcon;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: NewTextSuggestItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_suggest/adapter/new_text_suggest/b;", "Lcom/avito/android/list/new_text_suggest/e;", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC14824b, G0> f264162b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f264163c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public b(@k l<? super InterfaceC14824b, G0> lVar, @com.avito.android.search_suggest.di.b boolean z12) {
        this.f264162b = lVar;
        this.f264163c = z12;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        com.avito.android.list.new_text_suggest.a aVar2 = (com.avito.android.list.new_text_suggest.a) aVar;
        iVar.V7();
        iVar.m60(20);
        RedesignTextSuggestItem redesignTextSuggestItem = aVar2.f181616c;
        iVar.c(new a(redesignTextSuggestItem, this, aVar2));
        iVar.e(redesignTextSuggestItem.getTitle());
        iVar.h(redesignTextSuggestItem.getDescription());
        if (redesignTextSuggestItem.getIcon() instanceof ServerIcon) {
            ServerIcon serverIcon = (ServerIcon) redesignTextSuggestItem.getIcon();
            Uri darkUri = serverIcon.getDarkUri();
            if (darkUri == null || !this.f264163c) {
                darkUri = serverIcon.getUri();
            }
            p pVar = new p(darkUri);
            IconStyle style = serverIcon.getStyle();
            if (style == null) {
                style = IconStyle.CIRCLE;
            }
            IconStyle iconStyle = style;
            IconSize size = serverIcon.getSize();
            Integer numValueOf = size != null ? Integer.valueOf(size.getHeight()) : null;
            IconSize size2 = serverIcon.getSize();
            iVar.Aw(pVar, iconStyle, size2 != null ? Integer.valueOf(size2.getWidth()) : null, numValueOf, serverIcon.getCornerRadius());
        }
        if (redesignTextSuggestItem.getDescription() == null) {
            iVar.oV(12);
        } else {
            iVar.oV(9);
        }
    }
}
