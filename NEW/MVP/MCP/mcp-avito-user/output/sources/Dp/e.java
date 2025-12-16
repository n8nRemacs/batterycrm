package Dp;

import Y61.k;
import com.avito.android.comfortable_deal.api.model.CurrentStage;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42756l;

/* compiled from: DealItemListBuilder.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_comfortable-deal_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final Set<CurrentStage> f3469a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final Set<CurrentStage> f3470b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final Set<CurrentStage> f3471c;

    static {
        CurrentStage currentStage = CurrentStage.Introduction;
        CurrentStage currentStage2 = CurrentStage.Meeting;
        CurrentStage currentStage3 = CurrentStage.Published;
        f3469a = C42756l.l0(new CurrentStage[]{currentStage, currentStage2, currentStage3});
        CurrentStage currentStage4 = CurrentStage.Deposit;
        f3470b = Collections.singleton(currentStage4);
        f3471c = C42756l.l0(new CurrentStage[]{currentStage3, currentStage4});
    }
}
