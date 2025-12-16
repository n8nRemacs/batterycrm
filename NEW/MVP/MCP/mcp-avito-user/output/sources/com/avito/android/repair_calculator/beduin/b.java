package com.avito.android.repair_calculator.beduin;

import Y61.k;
import android.net.Uri;
import com.avito.android.beduin.v2.page.BeduinV2PageDeepLink;
import com.avito.android.remote.model.RepairServicesCalculator;
import com.avito.android.repair_calculator.AdvertDetailsRepairCalculatorItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinV2DeeplinkCreator.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/repair_calculator/beduin/b;", "Lcom/avito/android/repair_calculator/beduin/a;", "<init>", "()V", "a", "_avito_repair-calculator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements com.avito.android.repair_calculator.beduin.a {

    /* compiled from: BeduinV2DeeplinkCreator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/avito/android/repair_calculator/beduin/b$a;", "", "<init>", "()V", "", "BEDUIN_REPAIR_CALCULATOR_API", "Ljava/lang/String;", "BEDUIN_SCREEN_NAME", "FLAT_AREA_QUERY_PARAM_NAME", "IS_FLAT_NEW_QUERY_PARAM_NAME", "REPAIR_PRICE_QUERY_PARAM_NAME", "REPAIR_TYPE_QUERY_PARAM_NAME", "_avito_repair-calculator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    @Inject
    public b() {
    }

    @Override // com.avito.android.repair_calculator.beduin.a
    @k
    public final BeduinV2PageDeepLink a(@k AdvertDetailsRepairCalculatorItem advertDetailsRepairCalculatorItem, @k String str, int i12) {
        Uri.Builder builderAppendQueryParameter = Uri.parse("/api/1/stubs/screen/repair_calculator_in_realty").buildUpon().appendQueryParameter("repairType", str);
        RepairServicesCalculator repairServicesCalculator = advertDetailsRepairCalculatorItem.f254465b;
        if (repairServicesCalculator.getFlatArea() != null) {
            builderAppendQueryParameter.appendQueryParameter("flatArea", String.valueOf(repairServicesCalculator.getFlatArea()));
        }
        if (repairServicesCalculator.isFlatNew() != null) {
            builderAppendQueryParameter.appendQueryParameter("isFlatNew", String.valueOf(repairServicesCalculator.isFlatNew()));
        }
        if (repairServicesCalculator.getPrices() != null) {
            builderAppendQueryParameter.appendQueryParameter("repairPrice", String.valueOf(i12));
        }
        return new BeduinV2PageDeepLink(builderAppendQueryParameter.build().toString(), "repair_calculator_in_realty", false, false, false, null, null, null, false, 480, null);
    }
}
