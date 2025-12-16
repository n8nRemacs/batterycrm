package com.avito.android.advert.item.auto_media;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsAutoMediaView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/auto_media/o;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/auto_media/n;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class o extends com.avito.konveyor.adapter.b implements n {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f72935b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f72936c;

    public o(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.media_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f72935b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.media_previews);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f72936c = (RecyclerView) viewFindViewById2;
    }

    @Override // com.avito.android.advert.item.auto_media.n
    @Y61.k
    /* renamed from: UJ, reason: from getter */
    public final RecyclerView getF72936c() {
        return this.f72936c;
    }

    @Override // com.avito.android.advert.item.auto_media.n
    public final void b(@Y61.k String str) {
        I5.a(this.f72935b, str, false);
    }
}
