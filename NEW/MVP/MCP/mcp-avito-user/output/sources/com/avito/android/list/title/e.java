package com.avito.android.list.title;

import com.avito.android.remote.model.search.suggest.Padding;
import com.avito.android.remote.model.search.suggest.TitleSuggestItem;
import com.avito.android.search.r;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TitleItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/list/title/e;", "Lcom/avito/android/list/title/b;", "<init>", "()V", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements b {
    @Inject
    public e() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        TitleSuggestItem titleSuggestItem = ((r) aVar).f263837c;
        gVar.setText(titleSuggestItem.getText());
        Padding padding = titleSuggestItem.getPadding();
        gVar.S8(padding != null ? Integer.valueOf(padding.getTop()) : null, padding != null ? Integer.valueOf(padding.getBottom()) : null);
    }
}
