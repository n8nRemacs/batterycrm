package zp;

import Y61.k;
import Y61.l;
import com.avito.android.comfortable_deal.api.model.CurrentStage;
import kotlin.Metadata;

/* compiled from: MortgageBannerAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_comfortable-deal_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: zp.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C50605d {

    /* compiled from: MortgageBannerAnalyticsInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zp.d$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f444246a;

        static {
            int[] iArr = new int[CurrentStage.values().length];
            try {
                iArr[CurrentStage.Published.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CurrentStage.Deposit.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f444246a = iArr;
        }
    }

    @l
    public static final String a(@k CurrentStage currentStage) {
        int i12 = a.f444246a[currentStage.ordinal()];
        if (i12 == 1) {
            return "comfort_deal_buyer_search_banner";
        }
        if (i12 != 2) {
            return null;
        }
        return "comfort_deal_buyer_found_banner";
    }
}
