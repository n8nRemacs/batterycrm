package com.avito.android.publish.slots.cpa_tariff;

import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.k;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.cpa_tariff.CpaTariffSlot;
import com.avito.android.remote.model.category_parameters.slot.cpa_tariff.CpaTariffSlotConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: CpaTariffSlotWrapper.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/cpa_tariff/d;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/cpa_tariff/CpaTariffSlot;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d extends k<CpaTariffSlot> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CpaTariffSlot f243371b;

    /* compiled from: CpaTariffSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/slots/cpa_tariff/d$a;", "", "<init>", "()V", "", "CPA_TARIFF_SLOT_ITEM", "Ljava/lang/String;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public d(@Y61.k CpaTariffSlot cpaTariffSlot) {
        this.f243371b = cpaTariffSlot;
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f243371b;
    }

    @Override // com.avito.android.category_parameters.k
    @Y61.k
    public final List<com.avito.conveyor_item.a> j() {
        StringBuilder sb2 = new StringBuilder("cpa_tariff_slot_item");
        CpaTariffSlot cpaTariffSlot = this.f243371b;
        sb2.append(cpaTariffSlot.hashCode());
        return C42745f0.e0(new com.avito.android.publish.slots.cpa_tariff.item.b(sb2.toString(), ((CpaTariffSlotConfig) cpaTariffSlot.getWidget().getConfig()).getTitle(), ((CpaTariffSlotConfig) cpaTariffSlot.getWidget().getConfig()).getDescription(), ((CpaTariffSlotConfig) cpaTariffSlot.getWidget().getConfig()).getButton().getTitle(), ((CpaTariffSlotConfig) cpaTariffSlot.getWidget().getConfig()).getButton().getAction(), ((CpaTariffSlotConfig) cpaTariffSlot.getWidget().getConfig()).getAttributesAndValues()));
    }
}
