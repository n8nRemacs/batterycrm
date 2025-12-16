package com.avito.android.advert.item.popularity_info;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.popularity.PopularityInfo;
import com.avito.android.util.text.j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsPopularityInfoView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/popularity_info/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/popularity_info/f;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f78190b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f78191c;

    public g(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f78190b = aVar;
        View viewFindViewById = view.findViewById(R.id.popularity_info_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f78191c = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.advert.item.popularity_info.f
    public final void Ai(@k PopularityInfo popularityInfo) {
        j.a(this.f78191c, popularityInfo.getText(), this.f78190b);
    }
}
