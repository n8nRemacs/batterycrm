package com.avito.android.publish.slots;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.CategoryParameter;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.residential_complex.ResidentialComplexSlot;
import com.avito.android.remote.model.category_parameters.slot.residential_complex.ResidentialComplexSlotConfig;
import i31.InterfaceC41220a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ResidentialComplexSlotWrapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/r;", "Lcom/avito/android/category_parameters/j;", "Lcom/avito/android/remote/model/category_parameters/slot/residential_complex/ResidentialComplexSlot;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class r extends com.avito.android.category_parameters.j<ResidentialComplexSlot> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ResidentialComplexSlot f244730b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final AddressParameter f244731c;

    @i31.c
    public r(@InterfaceC41220a @Y61.k ResidentialComplexSlot residentialComplexSlot, @Y61.k com.avito.android.details.a aVar) {
        this.f244730b = residentialComplexSlot;
        CategoryParameters categoryParametersC0 = aVar.C0();
        this.f244731c = categoryParametersC0 != null ? (AddressParameter) ((CategoryParameter) categoryParametersC0.getFirstParameterOfType(AddressParameter.class)) : null;
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f244730b;
    }

    public final void j(@Y61.k SelectParameter.Value value) {
        String value2;
        AddressParameter addressParameter;
        boolean zF2 = L.f(value.getId(), "0");
        ResidentialComplexSlot residentialComplexSlot = this.f244730b;
        if (zF2 && !L.f(((ResidentialComplexSlotConfig) residentialComplexSlot.getWidget().getConfig()).getDevelopment().getValue(), value.getId()) && (value2 = ((ResidentialComplexSlotConfig) residentialComplexSlot.getWidget().getConfig()).getDevelopment().getValue()) != null && value2.length() != 0 && (addressParameter = this.f244731c) != null) {
            addressParameter.setValue(null);
        }
        ((ResidentialComplexSlotConfig) residentialComplexSlot.getWidget().getConfig()).getDevelopment().setValue(value.getId());
    }
}
