package com.avito.android.advertising.adapter.items.avito.bdui;

import android.view.View;
import com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner;
import kotlin.Metadata;

/* compiled from: AvitoNetworkBDUIViewHolder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advertising/adapter/items/avito/bdui/p;", "LTV0/e;", "Lcom/avito/android/advertising/ui/c;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface p extends TV0.e, com.avito.android.advertising.ui.c {

    /* compiled from: AvitoNetworkBDUIViewHolder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void Ax(@Y61.k AvitoNetworkBanner.BDUI bdui, @Y61.k View.OnClickListener onClickListener);

    void NE();

    void YG(@Y61.k View.OnClickListener onClickListener);

    @Y61.k
    View getView();
}
