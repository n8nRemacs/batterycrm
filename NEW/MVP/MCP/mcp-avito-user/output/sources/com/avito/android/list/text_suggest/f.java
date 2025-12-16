package com.avito.android.list.text_suggest;

import Y61.k;
import android.net.Uri;
import com.avito.android.C31100l2;
import com.avito.android.image_loader.p;
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

/* compiled from: TextSearchItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/list/text_suggest/f;", "Lcom/avito/android/list/text_suggest/b;", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C31100l2 f181641b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f181642c;

    @Inject
    public f(@k C31100l2 c31100l2, boolean z12) {
        this.f181641b = c31100l2;
        this.f181642c = z12;
    }

    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object, java.util.Map] */
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        Integer num;
        Integer numValueOf;
        h hVar = (h) eVar;
        TextSuggestItem textSuggestItem = ((q) aVar).f263835c;
        hVar.c(new e(textSuggestItem, this));
        hVar.e(textSuggestItem.getTitle());
        hVar.h(textSuggestItem.getDescription());
        hVar.oi(textSuggestItem.getMinHeight());
        Padding padding = textSuggestItem.getPadding();
        G0 g02 = null;
        hVar.S8(padding != null ? Integer.valueOf(padding.getTop()) : null, padding != null ? Integer.valueOf(padding.getBottom()) : null);
        IconSource icon = textSuggestItem.getIcon();
        if (icon instanceof LocalIcon) {
            Integer num2 = (Integer) g.f181643a.get(((LocalIcon) icon).getType());
            if (num2 != null) {
                hVar.setIcon(num2.intValue());
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
        if (darkUri == null || !this.f181642c) {
            darkUri = serverIcon.getUri();
        }
        p pVar = new p(darkUri);
        IconSize size = serverIcon.getSize();
        if (size != null) {
            Integer numValueOf2 = Integer.valueOf(size.getWidth());
            numValueOf = Integer.valueOf(size.getHeight());
            num = numValueOf2;
        } else {
            num = null;
            numValueOf = null;
        }
        hVar.k20(pVar, num, numValueOf, serverIcon.getIsMaskImage(), serverIcon.getCornerRadius());
    }
}
