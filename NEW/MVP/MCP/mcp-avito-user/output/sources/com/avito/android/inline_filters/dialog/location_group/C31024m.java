package com.avito.android.inline_filters.dialog.location_group;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.ItemsSearchLink;
import com.avito.android.inline_filters.dialog.location_group.adapter.GroupFilterItem;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.metro_lines.MetroResponseBody;
import com.avito.android.remote.model.search.Filter;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import okhttp3.internal.http2.Http2;

/* compiled from: LocationGroupFilterDialog.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/metro_lines/MetroResponseBody;", "metroResponse", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/metro_lines/MetroResponseBody;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.inline_filters.dialog.location_group.m, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31024m<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C31013b f171830b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GroupFilterItem f171831c;

    public C31024m(C31013b c31013b, GroupFilterItem groupFilterItem) {
        this.f171830b = c31013b;
        this.f171831c = groupFilterItem;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        SearchParams searchParams;
        String str;
        MetroResponseBody metroResponseBody = (MetroResponseBody) obj;
        C31013b c31013b = this.f171830b;
        Filter filter = this.f171831c.f171704c;
        C42784z0 c42784z0 = C42784z0.f406748b;
        ItemsSearchLink itemsSearchLink = c31013b.f171781D;
        if (itemsSearchLink == null || (searchParams = itemsSearchLink.f133403b) == null) {
            searchParams = c31013b.f171779B;
        }
        SearchParams searchParams2 = searchParams;
        C31022k c31022k = new C31022k(c31013b);
        C31023l c31023l = new C31023l(c31013b);
        ItemsSearchLink itemsSearchLink2 = c31013b.f171781D;
        if (itemsSearchLink2 == null || (str = itemsSearchLink2.f133404c) == null) {
            str = c31013b.f171797m;
        }
        c31013b.f171808x.RA(filter, c42784z0, null, searchParams2, ((-13570176) & 16) != 0 ? null : null, ((-13570176) & 32) != 0 ? null : null, ((-13570176) & 64) != 0 ? null : c31013b.f171793i, ((-13570176) & 128) != 0 ? null : null, ((-13570176) & 256) != 0 ? null : null, ((-13570176) & 512) != 0 ? null : null, ((-13570176) & 1024) != 0 ? null : null, ((-13570176) & 2048) != 0 ? null : null, c31022k, ((-13570176) & 8192) != 0 ? null : null, ((-13570176) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? com.avito.android.inline_filters.dialog.g.f171554l : null, (32768 & (-13570176)) != 0 ? com.avito.android.inline_filters.dialog.h.f171644l : null, c31023l, (131072 & (-13570176)) != 0 ? new com.avito.android.inline_filters.dialog.i(c31023l) : null, (262144 & (-13570176)) != 0 ? null : null, (524288 & (-13570176)) != 0 ? null : null, (1048576 & (-13570176)) != 0 ? null : metroResponseBody, (4194304 & (-13570176)) != 0 ? null : null, str, (16777216 & (-13570176)) != 0 ? null : null, (33554432 & (-13570176)) != 0 ? null : null, (67108864 & (-13570176)) != 0 ? null : null, (134217728 & (-13570176)) != 0 ? null : null, (268435456 & (-13570176)) != 0 ? null : null, (536870912 & (-13570176)) != 0 ? null : null, (1073741824 & (-13570176)) != 0 ? null : null, ((-13570176) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? null : null);
    }
}
