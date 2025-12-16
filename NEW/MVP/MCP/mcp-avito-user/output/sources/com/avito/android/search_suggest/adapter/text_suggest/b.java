package com.avito.android.search_suggest.adapter.text_suggest;

import Pp0.InterfaceC14824b;
import TV0.e;
import Y41.l;
import Y61.k;
import android.net.Uri;
import com.avito.android.image_loader.p;
import com.avito.android.list.text_suggest.h;
import com.avito.android.remote.model.search.suggest.IconSize;
import com.avito.android.remote.model.search.suggest.IconSource;
import com.avito.android.remote.model.search.suggest.LocalIcon;
import com.avito.android.remote.model.search.suggest.Padding;
import com.avito.android.remote.model.search.suggest.ServerIcon;
import com.avito.android.remote.model.search.suggest.TextSuggestItem;
import com.avito.android.search.q;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: TextSuggestItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_suggest/adapter/text_suggest/b;", "Lcom/avito/android/list/text_suggest/b;", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.list.text_suggest.b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC14824b, G0> f264169b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f264170c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public b(@k l<? super InterfaceC14824b, G0> lVar, @com.avito.android.search_suggest.di.b boolean z12) {
        this.f264169b = lVar;
        this.f264170c = z12;
    }

    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, java.util.Map] */
    @Override // TV0.d
    public final void O5(e eVar, TV0.a aVar, int i12) {
        Integer numValueOf;
        Integer numValueOf2;
        h hVar = (h) eVar;
        q qVar = (q) aVar;
        TextSuggestItem textSuggestItem = qVar.f263835c;
        hVar.c(new a(textSuggestItem, this, qVar));
        hVar.e(textSuggestItem.getTitle());
        hVar.h(textSuggestItem.getDescription());
        hVar.oi(textSuggestItem.getMinHeight());
        Padding padding = textSuggestItem.getPadding();
        G0 g02 = null;
        hVar.S8(padding != null ? Integer.valueOf(padding.getTop()) : null, padding != null ? Integer.valueOf(padding.getBottom()) : null);
        IconSource icon = textSuggestItem.getIcon();
        if (icon instanceof LocalIcon) {
            Integer num = (Integer) c.f264171a.get(((LocalIcon) icon).getType());
            if (num != null) {
                hVar.setIcon(num.intValue());
                g02 = G0.f406611a;
            }
            if (g02 == null) {
                hVar.V7();
                return;
            }
            return;
        }
        if (!(icon instanceof ServerIcon)) {
            hVar.V7();
            return;
        }
        ServerIcon serverIcon = (ServerIcon) icon;
        Uri darkUri = serverIcon.getDarkUri();
        if (darkUri == null || !this.f264170c) {
            darkUri = serverIcon.getUri();
        }
        p pVar = new p(darkUri);
        IconSize size = serverIcon.getSize();
        if (size != null) {
            numValueOf = Integer.valueOf(size.getWidth());
            numValueOf2 = Integer.valueOf(size.getHeight());
        } else {
            numValueOf = null;
            numValueOf2 = null;
        }
        hVar.k20(pVar, numValueOf, numValueOf2, serverIcon.getIsMaskImage(), serverIcon.getCornerRadius());
    }
}
