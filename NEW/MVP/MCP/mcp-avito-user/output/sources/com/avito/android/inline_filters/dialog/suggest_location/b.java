package com.avito.android.inline_filters.dialog.suggest_location;

import Y41.l;
import android.util.SparseArray;
import com.avito.android.location.LocationSource;
import com.avito.android.location.r;
import com.avito.android.remote.model.CaseText;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: SuggestLocationDialogFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/Location;", "selectedLocation", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/Location;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class b extends N implements l<Location, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SuggestLocationDialogFragment f172271l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SuggestLocationDialogFragment suggestLocationDialogFragment) {
        super(1);
        this.f172271l = suggestLocationDialogFragment;
    }

    @Override // Y41.l
    public final G0 invoke(Location location) {
        Location location2 = location;
        SuggestLocationDialogFragment suggestLocationDialogFragment = this.f172271l;
        d dVar = suggestLocationDialogFragment.f172263i0;
        if (dVar != null) {
            Location location3 = new Location(location2.getId(), new CaseText((SparseArray<String>) new SparseArray()), false, false, false, false, null, null, false, null, null, null, 4092, null);
            LocationSource locationSource = LocationSource.f181713e;
            r rVar = dVar.f172273a.f172275e;
            if (rVar != null) {
                rVar.a(location3, locationSource, true);
            }
        }
        if (L.f(suggestLocationDialogFragment.f172265k0, Boolean.TRUE)) {
            InlineFilterValue.InlineFilterSuggestLocationValue inlineFilterSuggestLocationValue = new InlineFilterValue.InlineFilterSuggestLocationValue(location2.getId(), location2.getInternalId());
            d dVar2 = suggestLocationDialogFragment.f172263i0;
            if (dVar2 != null) {
                dVar2.b(inlineFilterSuggestLocationValue);
            }
        } else {
            InlineFilterValue.InlineFilterSelectValue inlineFilterSelectValue = new InlineFilterValue.InlineFilterSelectValue(location2.getId());
            d dVar3 = suggestLocationDialogFragment.f172263i0;
            if (dVar3 != null) {
                dVar3.b(inlineFilterSelectValue);
            }
        }
        return G0.f406611a;
    }
}
