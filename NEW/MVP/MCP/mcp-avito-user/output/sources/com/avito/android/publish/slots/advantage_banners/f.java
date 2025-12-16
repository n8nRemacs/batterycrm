package com.avito.android.publish.slots.advantage_banners;

import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.k;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.advantage_banners.AdvantageBannersSlot;
import com.avito.android.remote.model.category_parameters.slot.advantage_banners.AdvantageBannersSlotConfig;
import com.avito.android.remote.model.category_parameters.slot.advantage_banners.Banner;
import i31.InterfaceC41220a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: AdvantageBannersSlotWrapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/advantage_banners/f;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/advantage_banners/AdvantageBannersSlot;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f extends k<AdvantageBannersSlot> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AdvantageBannersSlot f243017b;

    @i31.c
    public f(@InterfaceC41220a @Y61.k AdvantageBannersSlot advantageBannersSlot) {
        this.f243017b = advantageBannersSlot;
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f243017b;
    }

    @Override // com.avito.android.category_parameters.k
    @Y61.k
    public final List<com.avito.conveyor_item.a> j() {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        List<Banner> banners = ((AdvantageBannersSlotConfig) this.f243017b.getWidget().getConfig()).getBanners();
        if (banners != null) {
            List<Banner> list = banners;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            for (Banner banner : list) {
                arrayList.add(new com.avito.android.publish.slots.advantage_banners.banner.c(String.valueOf(banner.hashCode()), banner.getImage(), banner.getTitle(), banner.getText()));
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2.add(new com.avito.android.publish.slots.advantage_banners.container.c(String.valueOf(arrayList.hashCode()), arrayList));
        }
        return arrayList2;
    }
}
