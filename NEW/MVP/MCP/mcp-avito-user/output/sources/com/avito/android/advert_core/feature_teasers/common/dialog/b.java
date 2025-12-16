package com.avito.android.advert_core.feature_teasers.common.dialog;

import com.avito.android.J0;
import com.avito.android.advert_core.gap.AdvertDetailsGapItem;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsFeatureTeaserDialogItemsAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/feature_teasers/common/dialog/b;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.feature_teasers.common.k f83620a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final J0 f83621b;

    @Inject
    public b(@Y61.k com.avito.android.advert_core.feature_teasers.common.k kVar, @B9.a @Y61.k J0 j02) {
        this.f83620a = kVar;
        this.f83621b = j02;
    }

    public final void a(int i12, ArrayList arrayList) {
        arrayList.add(new AdvertDetailsGapItem(this.f83621b.a(), null, i12, 0, null, null, 50, null));
    }
}
