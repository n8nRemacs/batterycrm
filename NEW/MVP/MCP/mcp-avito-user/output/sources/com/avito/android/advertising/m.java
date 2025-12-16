package com.avito.android.advertising;

import com.avito.android.advertising.adapter.items.AdViewType;
import com.avito.android.remote.model.AdSize;
import com.avito.android.remote.model.SerpDisplayType;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdResourceProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/m;", "Lcom/avito/android/advertising/d;", "<init>", "()V", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class m implements d {
    @Inject
    public m() {
    }

    @Override // com.avito.android.advertising.d
    @Y61.k
    public final AdViewType a(@Y61.k SerpDisplayType serpDisplayType, @Y61.k AdSize adSize) {
        return AdViewType.f86910d;
    }

    @Override // com.avito.android.advertising.d
    public final int b(int i12, int i13, @Y61.k AdSize adSize) {
        return i13;
    }
}
