package com.avito.android.advert.item.compatibility.v3;

import com.avito.android.advert.item.spare_parts.data.CarCompatibility;
import com.avito.android.advert.item.spare_parts.data.SparePartsGroup;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GarageCompatibilityV3View.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/compatibility/v3/q;", "LTV0/e;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface q extends TV0.e {

    /* compiled from: GarageCompatibilityV3View.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void Bf();

    void Sx(@Y61.l CarCompatibility.Button button);

    void Te(@Y61.l String str);

    void VU(@Y61.l String str, boolean z12, @Y61.k SparePartsGroup sparePartsGroup);

    void c0();

    void hide();

    void kA(@Y61.l String str);

    void mL(@Y61.l CarCompatibility.Button button);

    void p00(@Y61.l String str);

    void qC(@Y61.k List<? extends com.avito.conveyor_item.a> list);

    void show();

    void uh(@Y61.k CarCompatibility.Car car);

    void yx();
}
