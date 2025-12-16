package com.avito.android.select_districts.items.selectable;

import Y61.k;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItemCheckbox;
import com.avito.android.saved_searches.presentation.items.switcher.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectableDistrictsItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select_districts/items/selectable/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/select_districts/items/selectable/i;", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f266974c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ListItemCheckbox f266975b;

    public j(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.selectable_districts_list_item);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItemCheckbox");
        }
        this.f266975b = (ListItemCheckbox) viewFindViewById;
    }

    @Override // com.avito.android.select_districts.items.selectable.i
    public final void a(@k Y41.a<G0> aVar) {
        this.f266975b.setOnClickListener(new l(29, aVar));
    }

    @Override // com.avito.android.select_districts.items.selectable.i
    public final void setChecked(boolean z12) {
        this.f266975b.setChecked(z12);
    }

    @Override // com.avito.android.select_districts.items.selectable.i
    public final void setTitle(@k String str) {
        this.f266975b.setTitle(str);
    }
}
