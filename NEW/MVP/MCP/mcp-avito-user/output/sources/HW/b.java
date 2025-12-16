package HW;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.avito.android.loyalty.ui.badges_list.BadgesListActivity;
import com.avito.android.loyalty.ui.criteria.CriteriaActivity;
import com.avito.android.loyalty.ui.criteria.CriteriaArgs;
import com.avito.android.loyalty.ui.criteria_gray.CriteriaGrayActivity;
import com.avito.android.loyalty.ui.criteria_gray.CriteriaGrayArgs;
import com.avito.android.loyalty.ui.quality_service.QualityServiceActivity;
import com.avito.android.loyalty.ui.quality_service.QualityServiceArgs;
import com.avito.android.loyalty.ui.quality_service_gray.QualityServiceGrayActivity;
import com.avito.android.loyalty.ui.quality_service_gray.QualityServiceGrayArgs;
import com.avito.android.loyalty.ui.reputation_unavailable.ReputationUnavailableActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: LoyaltyIntentFactoryImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHW/b;", "LHW/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f7129a;

    @Inject
    public b(@k Context context) {
        this.f7129a = context;
    }

    @Override // HW.a
    @k
    public final Intent a(@k CriteriaGrayArgs criteriaGrayArgs) {
        Intent intent = new Intent(this.f7129a, (Class<?>) CriteriaGrayActivity.class);
        intent.putExtra("CRITERIA_GRAY_ARGS", criteriaGrayArgs);
        return intent;
    }

    @Override // HW.a
    @k
    public final Intent b(@l String str, @k ArrayList arrayList) {
        Intent intent = new Intent(this.f7129a, (Class<?>) BadgesListActivity.class);
        intent.putParcelableArrayListExtra("badges_list_key", arrayList);
        intent.putExtra("user_key", str);
        return intent;
    }

    @Override // HW.a
    @k
    public final Intent c() {
        return new Intent(this.f7129a, (Class<?>) ReputationUnavailableActivity.class);
    }

    @Override // HW.a
    @k
    public final Intent d(@k QualityServiceArgs qualityServiceArgs) {
        Intent intent = new Intent(this.f7129a, (Class<?>) QualityServiceActivity.class);
        intent.putExtra("QUALITY_SERVICE_ARGS", qualityServiceArgs);
        return intent;
    }

    @Override // HW.a
    @k
    public final Intent e(@k CriteriaArgs criteriaArgs) {
        Intent intent = new Intent(this.f7129a, (Class<?>) CriteriaActivity.class);
        intent.putExtra("CRITERIA_ARGS", criteriaArgs);
        return intent;
    }

    @Override // HW.a
    @k
    public final Intent f(@k QualityServiceGrayArgs qualityServiceGrayArgs) {
        Intent intent = new Intent(this.f7129a, (Class<?>) QualityServiceGrayActivity.class);
        intent.putExtra("QUALITY_SERVICE_GRAY_ARGS", qualityServiceGrayArgs);
        return intent;
    }
}
