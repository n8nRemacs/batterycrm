package HW;

import Y61.k;
import Y61.l;
import android.content.Intent;
import com.avito.android.loyalty.ui.criteria.CriteriaArgs;
import com.avito.android.loyalty.ui.criteria_gray.CriteriaGrayArgs;
import com.avito.android.loyalty.ui.quality_service.QualityServiceArgs;
import com.avito.android.loyalty.ui.quality_service_gray.QualityServiceGrayArgs;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: LoyaltyIntentFactoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHW/a;", "", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface a {
    @k
    Intent a(@k CriteriaGrayArgs criteriaGrayArgs);

    @k
    Intent b(@l String str, @k ArrayList arrayList);

    @k
    Intent c();

    @k
    Intent d(@k QualityServiceArgs qualityServiceArgs);

    @k
    Intent e(@k CriteriaArgs criteriaArgs);

    @k
    Intent f(@k QualityServiceGrayArgs qualityServiceGrayArgs);
}
