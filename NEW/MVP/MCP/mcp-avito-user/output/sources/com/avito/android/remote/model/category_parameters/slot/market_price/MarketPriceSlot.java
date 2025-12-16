package com.avito.android.remote.model.category_parameters.slot.market_price;

import X41.f;
import Y61.k;
import Y61.l;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.SlotValue;
import com.avito.android.remote.model.category_parameters.slot.SlotWidget;
import com.avito.android.remote.model.category_parameters.slot.SlotWithValue;
import com.avito.android.remote.model.category_parameters.slot.SlotWithoutState;
import com.avito.android.util.H3;
import com.avito.android.util.I3;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: MarketPriceSlot.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0014B/\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/market_price/MarketPriceSlot;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWithValue;", "Lcom/avito/android/remote/model/category_parameters/slot/market_price/MarketPriceSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/market_price/MarketPriceSlotValue;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWithoutState;", "", "id", "label", "Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;", "widget", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;Lcom/avito/android/remote/model/category_parameters/slot/market_price/MarketPriceSlotValue;)V", "Lkotlin/G0;", "initWidget", "(Lcom/avito/android/remote/model/category_parameters/slot/SlotWidget;Lcom/avito/android/remote/model/category_parameters/slot/market_price/MarketPriceSlotValue;)V", "", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "initParameters", "()Ljava/util/List;", "Companion", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MarketPriceSlot extends SlotWithValue<MarketPriceSlotConfig, MarketPriceSlotValue> implements SlotWithoutState {

    @f
    @k
    public static final Parcelable.Creator<MarketPriceSlot> CREATOR;

    static {
        MarketPriceSlot$Companion$CREATOR$1 marketPriceSlot$Companion$CREATOR$1 = MarketPriceSlot$Companion$CREATOR$1.INSTANCE;
        int i12 = I3.f318630a;
        CREATOR = new H3(marketPriceSlot$Companion$CREATOR$1);
    }

    public MarketPriceSlot(@k String str, @k String str2, @k SlotWidget<MarketPriceSlotConfig> slotWidget, @l MarketPriceSlotValue marketPriceSlotValue) {
        super(str, str2, slotWidget, marketPriceSlotValue);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    @k
    public List<ParameterSlot> initParameters() {
        return C42745f0.V(((MarketPriceSlotConfig) getWidget().getConfig()).getCommentField());
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.SlotWithValue
    public /* bridge */ /* synthetic */ void initWidget(SlotWidget slotWidget, SlotValue slotValue) {
        initWidget((SlotWidget<MarketPriceSlotConfig>) slotWidget, (MarketPriceSlotValue) slotValue);
    }

    @Override // com.avito.android.remote.model.category_parameters.slot.ParametersInitializer
    public void onParametersUpdated() {
        SlotWithoutState.DefaultImpls.onParametersUpdated(this);
    }

    @Override // com.avito.android.remote.model.category_parameters.ObservableSlot, com.avito.android.remote.model.category_parameters.base.ObservableParameter
    public void setValueChangesListener(@k Y41.l<? super EditableParameter<?>, G0> lVar) {
        SlotWithoutState.DefaultImpls.setValueChangesListener(this, lVar);
    }

    public void initWidget(@k SlotWidget<MarketPriceSlotConfig> widget, @l MarketPriceSlotValue value) {
        CharParameter commentField = ((MarketPriceSlotConfig) widget.getConfig()).getCommentField();
        if (commentField == null) {
            return;
        }
        commentField.set_value(value != null ? value.getMarketPriceComment() : null);
    }
}
