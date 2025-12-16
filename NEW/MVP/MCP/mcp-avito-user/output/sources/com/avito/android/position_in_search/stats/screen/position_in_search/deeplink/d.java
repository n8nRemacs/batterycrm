package com.avito.android.position_in_search.stats.screen.position_in_search.deeplink;

import Y41.p;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.core.os.C22777e;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.position_in_search.stats.screen.position_in_search.deeplink.SearchPositionSortBody;
import com.avito.android.position_in_search.stats.screen.position_in_search.deeplink.SearchPositionSortDeepLink;
import com.avito.android.position_in_search.stats.screen.position_in_search.sort_dialog.SearchInPositionSortDialogFragment;
import com.avito.android.util.R0;
import fv.C40483b;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import rv.C47919b;

/* compiled from: SearchPositionSortDeepLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/deeplink/d;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/deeplink/SearchPositionSortDeepLink;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d extends com.avito.android.deeplink_handler.handler.base.coroutines.a<SearchPositionSortDeepLink> {

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.f f221358g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.d f221359h;

    /* compiled from: SearchPositionSortDeepLinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends C42801a implements p<C47919b, Continuation<? super G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(C47919b c47919b, Continuation<? super G0> continuation) {
            C47919b c47919b2 = c47919b;
            d dVar = (d) this.receiver;
            dVar.getClass();
            String string = c47919b2.f437159b.getString("key_pis_sort_dialog_slug_result_out");
            String string2 = c47919b2.f437159b.getString("key_pis_sort_dialog_title_result_out");
            if (string == null || string2 == null) {
                dVar.j(SearchPositionSortDeepLink.b.a.f221332b);
            } else {
                dVar.j(new SearchPositionSortDeepLink.b.C6694b(string, string2));
            }
            return G0.f406611a;
        }
    }

    @Inject
    public d(@k a.d dVar, @k a.f fVar, @k R0 r02) {
        super(r02);
        this.f221358g = fVar;
        this.f221359h = dVar;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        String slug;
        SearchPositionSortDeepLink searchPositionSortDeepLink = (SearchPositionSortDeepLink) deepLink;
        if (bundle == null || (slug = bundle.getString("key_pis_sort_dialog_slug_result_in")) == null) {
            SearchPositionSortBody.SortBodyItem sortBodyItem = (SearchPositionSortBody.SortBodyItem) C42745f0.G(searchPositionSortDeepLink.f221331b.getItems());
            slug = sortBodyItem != null ? sortBodyItem.getSlug() : null;
        }
        SearchInPositionSortDialogFragment.a aVar = SearchInPositionSortDialogFragment.f221538h0;
        SearchPositionSortBody searchPositionSortBody = searchPositionSortDeepLink.f221331b;
        aVar.getClass();
        SearchInPositionSortDialogFragment searchInPositionSortDialogFragment = new SearchInPositionSortDialogFragment();
        searchInPositionSortDialogFragment.setArguments(C22777e.b(new Q("pis_sort_dialog_extra_data", searchPositionSortBody), new Q("pis_sort_dialog_extra_slug", slug)));
        this.f221359h.w1(searchInPositionSortDialogFragment, "SearchPositionSortDeepLinkHandler_" + this.f395444b);
        return G0.f406611a;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    @l
    public final Object n(@k Continuation<? super G0> continuation) {
        C43175k.K(new C43197r1(new a(2, this, d.class, "handleResult", "handleResult(Lcom/avito/android/deeplink_handler/view/result/FragmentResult;)V", 4), C40483b.b(this.f221358g, "SearchPositionSortDeepLinkHandler_" + this.f395444b)), this.f134492f);
        return G0.f406611a;
    }
}
