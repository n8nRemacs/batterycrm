package com.avito.android.settings.adapter;

import android.view.View;
import com.avito.android.lib.design.list_item.ListItem;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ListItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/settings/adapter/L;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/settings/adapter/K;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class L extends com.avito.konveyor.adapter.b implements K {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f280742c = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ListItem f280743b;

    public L(@Y61.k View view) {
        super(view);
        this.f280743b = (ListItem) view;
    }

    @Override // com.avito.android.settings.adapter.K
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f280743b.setOnClickListener(new com.avito.android.service_booking_common.blueprints.geo_reference.g(12, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f280743b.setOnClickListener(null);
    }

    @Override // com.avito.android.settings.adapter.K
    public final void m(@Y61.k String str) {
        this.f280743b.setMessage(str);
    }

    @Override // com.avito.android.settings.adapter.K
    public final void setHint(@Y61.k String str) {
        this.f280743b.setTitle(str);
    }
}
