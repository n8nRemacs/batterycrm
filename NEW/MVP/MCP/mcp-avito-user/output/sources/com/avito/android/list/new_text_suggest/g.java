package com.avito.android.list.new_text_suggest;

import android.net.Uri;
import com.avito.android.C31100l2;
import com.avito.android.image_loader.p;
import com.avito.android.remote.model.search.suggest.IconSize;
import com.avito.android.remote.model.search.suggest.IconStyle;
import com.avito.android.remote.model.search.suggest.RedesignTextSuggestItem;
import com.avito.android.remote.model.search.suggest.ServerIcon;
import kotlin.Metadata;

/* compiled from: NewTextSuggestItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/list/new_text_suggest/g;", "Lcom/avito/android/list/new_text_suggest/e;", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C31100l2 f181623b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f181624c;

    public g(@Y61.k C31100l2 c31100l2, boolean z12) {
        this.f181623b = c31100l2;
        this.f181624c = z12;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        iVar.V7();
        iVar.m60(20);
        RedesignTextSuggestItem redesignTextSuggestItem = ((a) aVar).f181616c;
        iVar.c(new f(redesignTextSuggestItem, this));
        iVar.e(redesignTextSuggestItem.getTitle());
        iVar.h(redesignTextSuggestItem.getDescription());
        if (redesignTextSuggestItem.getIcon() instanceof ServerIcon) {
            ServerIcon serverIcon = (ServerIcon) redesignTextSuggestItem.getIcon();
            Uri darkUri = serverIcon.getDarkUri();
            if (darkUri == null || !this.f181624c) {
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
