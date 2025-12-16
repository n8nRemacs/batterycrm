package com.avito.android.search_suggest;

import com.avito.android.R;
import com.avito.android.lib.util.darkTheme.ThemeAppearance;
import com.avito.android.remote.model.NavigationBarStyle;
import com.avito.android.remote.model.SerpSpaceType;
import com.avito.android.ui.status_bar.d;
import kotlin.Metadata;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;
import nl.C44441d;

/* compiled from: SearchSuggestStatusBarUpdatesProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_suggest/m;", "Lcom/avito/android/ui/status_bar/k;", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m implements com.avito.android.ui.status_bar.k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final n2<com.avito.android.ui.status_bar.d> f264271b;

    public m(@Y61.k SerpSpaceType serpSpaceType, @Y61.l NavigationBarStyle navigationBarStyle) {
        this.f264271b = p2.a(serpSpaceType.getIsForceBlackStatusBar() ? new com.avito.android.ui.status_bar.d(ThemeAppearance.f181337e, new d.a.C9356a(R.attr.constantBlack)) : navigationBarStyle != null ? new com.avito.android.ui.status_bar.d(C44441d.b(navigationBarStyle.getThemeAppearance()), new d.a.e(navigationBarStyle.getBackgroundColor())) : null);
    }

    @Override // com.avito.android.ui.status_bar.k
    @Y61.k
    public final n2<com.avito.android.ui.status_bar.d> e2() {
        return this.f264271b;
    }
}
