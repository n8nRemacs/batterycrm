package com.avito.android.location_picker.view;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.geo_common.model.location_picker.AddressSuggestion;
import com.avito.android.util.D6;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SuggestionsAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/location_picker/view/X;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/avito/android/location_picker/view/V;", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class X extends RecyclerView.Adapter<V> {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f182550c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public LayoutInflater f182551d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e<AddressSuggestion> f182552e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public List<AddressSuggestion> f182553f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e f182554g;

    public X() {
        this(false, 1, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f182553f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i12) {
        return this.f182553f.get(i12).getTitle().hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        V v12 = (V) c12;
        AddressSuggestion addressSuggestion = this.f182553f.get(i12);
        int length = addressSuggestion.getTitle().length();
        TextView textView = v12.f182545b;
        TextView textView2 = v12.f182546c;
        if (length == 0 || addressSuggestion.getSubtitle().length() == 0) {
            textView.setText(addressSuggestion.getTitle());
            D6.w(textView2);
        } else {
            textView.setText(addressSuggestion.getTitle());
            textView2.setText(addressSuggestion.getSubtitle());
            D6.G(textView2, true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        LayoutInflater layoutInflaterFrom = this.f182551d;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            this.f182551d = layoutInflaterFrom;
        }
        V v12 = new V(layoutInflaterFrom.inflate(this.f182550c ? R.layout.location_picker_suggestion_item_redesign : R.layout.location_picker_suggestion_item, viewGroup, false));
        v12.f182547d.d0(new W(this)).c(this.f182552e);
        return v12;
    }

    public /* synthetic */ X(boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12);
    }

    public X(boolean z12) {
        this.f182550c = z12;
        io.reactivex.rxjava3.subjects.e<AddressSuggestion> eVar = new io.reactivex.rxjava3.subjects.e<>();
        this.f182552e = eVar;
        this.f182553f = C42784z0.f406748b;
        this.f182554g = eVar;
        setHasStableIds(true);
    }
}
