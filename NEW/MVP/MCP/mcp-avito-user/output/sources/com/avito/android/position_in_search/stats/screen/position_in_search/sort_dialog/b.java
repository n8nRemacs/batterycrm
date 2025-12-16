package com.avito.android.position_in_search.stats.screen.position_in_search.sort_dialog;

import Y41.l;
import androidx.core.os.C22777e;
import com.avito.android.position_in_search.stats.screen.position_in_search.deeplink.SearchPositionSortBody;
import com.avito.android.position_in_search.stats.screen.position_in_search.sort_dialog.SearchInPositionSortDialogFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: SearchInPositionSortDialogFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/deeplink/SearchPositionSortBody$SortBodyItem;", "item", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/position_in_search/stats/screen/position_in_search/deeplink/SearchPositionSortBody$SortBodyItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class b extends N implements l<SearchPositionSortBody.SortBodyItem, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SearchInPositionSortDialogFragment f221543l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f221544m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SearchInPositionSortDialogFragment searchInPositionSortDialogFragment, com.avito.android.lib.design.bottom_sheet.d dVar) {
        super(1);
        this.f221543l = searchInPositionSortDialogFragment;
        this.f221544m = dVar;
    }

    @Override // Y41.l
    public final G0 invoke(SearchPositionSortBody.SortBodyItem sortBodyItem) {
        SearchPositionSortBody.SortBodyItem sortBodyItem2 = sortBodyItem;
        SearchInPositionSortDialogFragment.a aVar = SearchInPositionSortDialogFragment.f221538h0;
        SearchInPositionSortDialogFragment searchInPositionSortDialogFragment = this.f221543l;
        String tag = searchInPositionSortDialogFragment.getTag();
        if (tag == null) {
            tag = "";
        }
        searchInPositionSortDialogFragment.getParentFragmentManager().o0(C22777e.b(new Q("key_pis_sort_dialog_slug_result_out", sortBodyItem2.getSlug()), new Q("key_pis_sort_dialog_title_result_out", sortBodyItem2.getControlTitle())), tag);
        this.f221544m.dismiss();
        return G0.f406611a;
    }
}
