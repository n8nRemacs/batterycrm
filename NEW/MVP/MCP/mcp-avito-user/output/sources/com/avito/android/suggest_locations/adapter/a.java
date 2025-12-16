package com.avito.android.suggest_locations.adapter;

import Y61.k;
import androidx.recyclerview.widget.C23424o;
import com.avito.android.geo_common.model.location_picker.AddressSuggestion;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SuggestAddressDiffCallback.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/suggest_locations/adapter/a;", "Landroidx/recyclerview/widget/o$b;", "_avito_suggest-locations_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a extends C23424o.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<AddressSuggestion> f292229a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<AddressSuggestion> f292230b;

    public a(@k List<AddressSuggestion> list, @k List<AddressSuggestion> list2) {
        this.f292229a = list;
        this.f292230b = list2;
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final boolean areContentsTheSame(int i12, int i13) {
        return L.f(this.f292229a.get(i12), this.f292230b.get(i13));
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final boolean areItemsTheSame(int i12, int i13) {
        AddressSuggestion addressSuggestion = this.f292229a.get(i12);
        AddressSuggestion addressSuggestion2 = this.f292230b.get(i13);
        return L.f(addressSuggestion2.getTitle(), addressSuggestion.getTitle()) && L.f(addressSuggestion2.getSubtitle(), addressSuggestion.getSubtitle());
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final int getNewListSize() {
        return this.f292230b.size();
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final int getOldListSize() {
        return this.f292229a.size();
    }
}
