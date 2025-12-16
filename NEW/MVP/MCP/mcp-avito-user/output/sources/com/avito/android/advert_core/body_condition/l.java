package com.avito.android.advert_core.body_condition;

import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.advert_core.advert.AdvertDetailsFlatViewType;
import com.avito.android.remote.model.AdvertParameters;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdvertDetailsCarBodyConditionView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/body_condition/l;", "Lcom/avito/android/advert_core/body_condition/k;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class l extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f83049e = 0;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f83050b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f83051c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.advert.g f83052d;

    public l(@Y61.k View view) {
        super(view);
        this.f83050b = (TextView) view.findViewById(R.id.title);
        this.f83051c = (TextView) view.findViewById(R.id.deeplink_title);
        this.f83052d = new com.avito.android.advert_core.advert.g(view.findViewById(R.id.flat_container), 0, null, false, 14, null);
    }

    @Override // com.avito.android.advert_core.body_condition.k
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f83051c.setOnClickListener(new com.avito.android.advert_collection.adapter.order.h(5, aVar));
    }

    @Override // com.avito.android.advert_core.body_condition.k
    public final void rN(@Y61.k String str) {
        this.f83051c.setText(str);
    }

    @Override // com.avito.android.advert_core.body_condition.k
    public final void setParameters(@Y61.k List<AdvertParameters.Parameter> list) {
        this.f83052d.a(list, AdvertDetailsFlatViewType.f82420b, false);
    }

    @Override // com.avito.android.advert_core.body_condition.k
    public final void setTitle(@Y61.k String str) {
        this.f83050b.setText(str);
    }
}
