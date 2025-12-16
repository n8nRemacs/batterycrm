package com.avito.android.publish.slots.item_info;

import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.f;
import com.avito.android.category_parameters.k;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.car_info_short.CarImage;
import com.avito.android.remote.model.category_parameters.slot.item_info.Confetti;
import com.avito.android.remote.model.category_parameters.slot.item_info.ImagePosition;
import com.avito.android.remote.model.category_parameters.slot.item_info.ItemInfoField;
import com.avito.android.remote.model.category_parameters.slot.item_info.ItemInfoSlot;
import com.avito.android.remote.model.category_parameters.slot.item_info.ItemInfoSlotConfig;
import i31.InterfaceC41220a;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import yc.C50213a;

/* compiled from: ItemInfoSlotWrapper.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/item_info/e;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/item_info/ItemInfoSlot;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e extends k<ItemInfoSlot> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ItemInfoSlot f244363b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C50213a f244364c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f244365d;

    @i31.c
    public e(@InterfaceC41220a @Y61.k ItemInfoSlot itemInfoSlot, @Y61.k C50213a c50213a) {
        this.f244363b = itemInfoSlot;
        this.f244364c = c50213a;
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final com.avito.android.category_parameters.f d(@Y61.k com.avito.conveyor_item.a aVar) {
        if (!(aVar instanceof com.avito.android.publish.slots.item_info.item.d)) {
            return f.c.f117644b;
        }
        this.f244365d = ((com.avito.android.publish.slots.item_info.item.d) aVar).f244380h;
        return new f.b(SlotType.ITEM_INFO, null);
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f244363b;
    }

    @Override // com.avito.android.category_parameters.k
    @Y61.k
    public final List<com.avito.conveyor_item.a> j() {
        Boolean isPlayOnClick;
        ItemInfoSlot itemInfoSlot = this.f244363b;
        String id2 = itemInfoSlot.getId();
        String title = ((ItemInfoSlotConfig) itemInfoSlot.getWidget().getConfig()).getTitle();
        CarImage image = ((ItemInfoSlotConfig) itemInfoSlot.getWidget().getConfig()).getImage();
        List<ItemInfoField> fields = ((ItemInfoSlotConfig) itemInfoSlot.getWidget().getConfig()).getFields();
        Integer visibleFieldsCount = ((ItemInfoSlotConfig) itemInfoSlot.getWidget().getConfig()).getVisibleFieldsCount();
        Confetti confetti = ((ItemInfoSlotConfig) itemInfoSlot.getWidget().getConfig()).getConfetti();
        boolean z12 = this.f244365d;
        String strB = this.f244364c.b();
        Confetti confetti2 = ((ItemInfoSlotConfig) itemInfoSlot.getWidget().getConfig()).getConfetti();
        boolean zBooleanValue = (confetti2 == null || (isPlayOnClick = confetti2.getIsPlayOnClick()) == null) ? false : isPlayOnClick.booleanValue();
        String description = ((ItemInfoSlotConfig) itemInfoSlot.getWidget().getConfig()).getDescription();
        ImagePosition imagePosition = ((ItemInfoSlotConfig) itemInfoSlot.getWidget().getConfig()).getImagePosition();
        if (imagePosition == null) {
            imagePosition = ImagePosition.CENTER;
        }
        return Collections.singletonList(new com.avito.android.publish.slots.item_info.item.d(id2, title, image, fields, visibleFieldsCount, confetti, z12, strB, zBooleanValue, description, imagePosition));
    }
}
