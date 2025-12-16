package com.avito.android.beduin.common.component.real_estate_filter;

import android.text.Editable;
import android.text.TextWatcher;
import com.avito.android.lib.design.input.Input;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: InputExtensions.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class w implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public String f102349b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Input f102350c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s f102351d;

    public w(Input input, s sVar) {
        this.f102350c = input;
        this.f102351d = sVar;
        this.f102349b = input.getDeformattedText();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Y61.l Editable editable) {
        String deformattedText = this.f102350c.getDeformattedText();
        if (L.f(deformattedText, this.f102349b)) {
            return;
        }
        s sVar = this.f102351d;
        C28803d c28803d = sVar.f102337b;
        if (c28803d != null) {
            String str = deformattedText.length() > 0 ? deformattedText : null;
            RealEstateFilterState realEstateFilterState = c28803d.f102295k;
            c28803d.y(realEstateFilterState.copy((511 & 1) != 0 ? realEstateFilterState.locationId : null, (511 & 2) != 0 ? realEstateFilterState.developmentId : null, (511 & 4) != 0 ? realEstateFilterState.areaTo : null, (511 & 8) != 0 ? realEstateFilterState.areaFrom : null, (511 & 16) != 0 ? realEstateFilterState.priceTo : null, (511 & 32) != 0 ? realEstateFilterState.priceFrom : str, (511 & 64) != 0 ? realEstateFilterState.completionDateFrom : null, (511 & 128) != 0 ? realEstateFilterState.completionDateTo : null, (511 & 256) != 0 ? realEstateFilterState.roomsTypeIds : null, (511 & 512) != 0 ? realEstateFilterState.finishTypeId : null));
        }
        sVar.a();
        this.f102349b = deformattedText;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
    }
}
