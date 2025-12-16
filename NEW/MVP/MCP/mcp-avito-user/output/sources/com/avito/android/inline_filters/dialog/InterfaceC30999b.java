package com.avito.android.inline_filters.dialog;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.inline_filters.InlineFiltersCommonViewInfo;
import com.avito.android.inline_filters.InterfaceC30995b;
import com.avito.android.inline_filters.InterfaceC31046f;
import com.avito.android.inline_filters.W;
import com.avito.android.inline_filters.dialog.InlineFilterDialogOpener;
import com.avito.android.inline_filters.dialog.location_group.LocationGroupFilterData;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.metro_lines.MetroResponseBody;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: InlineFilterDialogFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/b;", "", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.inline_filters.dialog.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC30999b {

    /* compiled from: InlineFilterDialogFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.inline_filters.dialog.b$a */
    public static final class a {
        public static AbstractC30998a a(InterfaceC30999b interfaceC30999b, Fragment fragment, Filter filter, List list, Parcelable parcelable, SearchParams searchParams, InterfaceC30995b interfaceC30995b, W w12, InterfaceC31046f interfaceC31046f, com.avito.android.location.r rVar, CN.f fVar, com.avito.android.deeplink_handler.handler.composite.a aVar, PresentationType presentationType, Map map, InlineFilterDialogOpener.Source source, Y41.p pVar, Y41.l lVar, Y41.p pVar2, Y41.p pVar3, Y41.a aVar2, Y41.l lVar2, MetroResponseBody metroResponseBody, String str, String str2, Filter filter2, Filter filter3, Y41.l lVar3, int i12) {
            return interfaceC30999b.a(fragment, filter, list, parcelable, searchParams, interfaceC30995b, w12, interfaceC31046f, (i12 & 256) != 0 ? null : rVar, (i12 & 512) != 0 ? null : fVar, aVar, (i12 & 2048) != 0 ? null : presentationType, (i12 & 4096) != 0 ? null : map, source, pVar, (32768 & i12) != 0 ? null : lVar, pVar2, pVar3, aVar2, lVar2, null, metroResponseBody, null, (8388608 & i12) != 0 ? null : str, str2, (33554432 & i12) != 0 ? null : filter2, (67108864 & i12) != 0 ? null : filter3, (i12 & 134217728) != 0 ? null : lVar3);
        }
    }

    @Y61.l
    AbstractC30998a<E> a(@Y61.l Fragment fragment, @Y61.k Filter filter, @Y61.k List<com.avito.android.inline_filters.dialog.select.adapter.i> list, @Y61.l Parcelable parcelable, @Y61.l SearchParams searchParams, @Y61.l InterfaceC30995b interfaceC30995b, @Y61.l W w12, @Y61.l InterfaceC31046f interfaceC31046f, @Y61.l com.avito.android.location.r rVar, @Y61.l CN.f fVar, @Y61.l com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.l PresentationType presentationType, @Y61.l Map<String, String> map, @Y61.l InlineFilterDialogOpener.Source source, @Y61.k Y41.p<? super Filter, ? super InlineFilterValue, G0> pVar, @Y61.l Y41.l<? super LocationGroupFilterData, G0> lVar, @Y61.k Y41.p<? super DeepLink, ? super Boolean, G0> pVar2, @Y61.l Y41.p<? super DeepLink, ? super Boolean, G0> pVar3, @Y61.k Y41.a<G0> aVar2, @Y61.k Y41.l<? super Integer, G0> lVar2, @Y61.l Y41.l<? super Integer, G0> lVar3, @Y61.l MetroResponseBody metroResponseBody, @Y61.l InlineFiltersCommonViewInfo inlineFiltersCommonViewInfo, @Y61.l String str, @Y61.l String str2, @Y61.l Filter filter2, @Y61.l Filter filter3, @Y61.l Y41.l<? super List<? extends Q<Filter, ? extends InlineFilterValue>>, G0> lVar4);
}
