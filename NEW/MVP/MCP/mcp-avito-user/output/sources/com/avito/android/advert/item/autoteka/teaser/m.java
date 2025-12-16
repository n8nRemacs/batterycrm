package com.avito.android.advert.item.autoteka.teaser;

import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;
import x4.c;

/* compiled from: AdvertDetailsAutotekaTeaserView.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/autoteka/teaser/m;", "Lx4/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class m extends x4.c {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final View f73042f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f73043g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final c.a f73044h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final c.b f73045i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f73046j;

    public m(@Y61.k View view, @Y61.k com.avito.konveyor.adapter.j jVar, @Y61.l c.a aVar, @Y61.k c.b bVar) {
        super(view, aVar, new n(view, aVar));
        this.f73042f = view;
        this.f73043g = jVar;
        this.f73044h = aVar;
        this.f73045i = bVar;
        this.f73046j = (RecyclerView) view.findViewById(R.id.unique_data);
    }
}
