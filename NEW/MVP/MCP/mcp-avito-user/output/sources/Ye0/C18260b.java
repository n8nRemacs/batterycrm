package Ye0;

import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.f;
import com.avito.android.category_parameters.k;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.card_select.CardSelectSlot;
import com.avito.android.remote.model.category_parameters.slot.card_select.CardSelectSlotConfig;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CardSelectSlotWrapper.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LYe0/b;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/card_select/CardSelectSlot;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ye0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C18260b extends k<CardSelectSlot> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CardSelectSlot f19606b;

    public C18260b(@Y61.k CardSelectSlot cardSelectSlot) {
        this.f19606b = cardSelectSlot;
    }

    @Override // com.avito.android.category_parameters.j
    @Y61.k
    public final f d(@Y61.k com.avito.conveyor_item.a aVar) {
        if (!(aVar instanceof com.avito.android.publish.slots.card_select.item.a)) {
            return f.c.f117644b;
        }
        ((CardSelectSlotConfig) this.f19606b.getWidget().getConfig()).setCards(((com.avito.android.publish.slots.card_select.item.a) aVar).f243136c);
        return new f.b(SlotType.CARD_SELECT, null);
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f19606b;
    }

    @Override // com.avito.android.category_parameters.k
    @Y61.k
    public final List<com.avito.conveyor_item.a> j() {
        CardSelectSlot cardSelectSlot = this.f19606b;
        return Collections.singletonList(new com.avito.android.publish.slots.card_select.item.a(cardSelectSlot.getId(), ((CardSelectSlotConfig) cardSelectSlot.getWidget().getConfig()).getCards(), ((CardSelectSlotConfig) cardSelectSlot.getWidget().getConfig()).getCheckedBackgroundColor(), ((CardSelectSlotConfig) cardSelectSlot.getWidget().getConfig()).getDefaultBackgroundColor()));
    }
}
