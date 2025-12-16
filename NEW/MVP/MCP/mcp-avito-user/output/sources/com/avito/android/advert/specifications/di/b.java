package com.avito.android.advert.specifications.di;

import Y61.k;
import Y61.l;
import com.avito.android.advert.specifications.SpecificationsFragment;
import com.avito.android.di.B;
import com.avito.android.remote.model.ModelSpecifications;
import h31.d;
import kotlin.Metadata;

/* compiled from: SpecificationsComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/specifications/di/b;", "", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes10.dex */
public interface b {

    /* compiled from: SpecificationsComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/specifications/di/b$a;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @h31.b
        @k
        a a(@l ModelSpecifications modelSpecifications);

        @k
        a b(@k c cVar);

        @k
        b build();
    }

    void a(@k SpecificationsFragment specificationsFragment);
}
