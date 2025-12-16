package com.avito.android.publish.details.seller_protection;

import Y61.k;
import com.avito.android.category_parameters.j;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SellerProtectionInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/seller_protection/c;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface c {
    void a();

    void b(@k SellerProtectionDialogResult sellerProtectionDialogResult, @k Set<? extends j<? extends Slot<?>>> set, @k Y41.a<G0> aVar);

    boolean c(@k Set<? extends j<? extends Slot<?>>> set);
}
