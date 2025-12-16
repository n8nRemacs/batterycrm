package com.avito.android.location_list;

import android.view.View;
import com.avito.android.lib.design.list_item.ListItemRadio;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LocationRadioButtonView.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/location_list/n0;", "Lcom/avito/android/location_list/x;", "Lcom/avito/android/location_list/r;", "Lcom/avito/konveyor/adapter/b;", "_avito_location-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class n0 extends com.avito.konveyor.adapter.b implements InterfaceC31529x, r {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f182076c = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ListItemRadio f182077b;

    public n0(@Y61.k View view) {
        super(view);
        this.f182077b = (ListItemRadio) view;
    }

    @Override // com.avito.android.location_list.InterfaceC31529x, com.avito.android.location_list.r
    public final void J0(@Y61.k Y41.a<G0> aVar) {
        this.f182077b.setOnClickListener(new com.avito.android.inline_filters.dialog.C(11, aVar));
    }

    @Override // com.avito.android.location_list.InterfaceC31529x
    public final void f(@Y61.l String str) {
        this.f182077b.setSubtitle(str);
    }

    @Override // com.avito.android.location_list.InterfaceC31529x, com.avito.android.location_list.r
    public final void setChecked(boolean z12) {
        this.f182077b.setChecked(z12);
    }

    @Override // com.avito.android.location_list.InterfaceC31529x, com.avito.android.location_list.r
    public final void setTitle(@Y61.l String str) {
        if (str == null) {
            str = "";
        }
        this.f182077b.setTitle(str);
    }
}
