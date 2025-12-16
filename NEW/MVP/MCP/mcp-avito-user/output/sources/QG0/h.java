package QG0;

import AK0.l;
import QG0.b;
import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: UsedCarsFeedbackStorage.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LQG0/h;", "LQG0/g;", "a", "_avito_used-cars-uxfeedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f13650a;

    /* compiled from: UsedCarsFeedbackStorage.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LQG0/h$a;", "", "<init>", "()V", "", "CAR_BRAND_FILTERS_USE_CAMPAIGN_SHOWN_KEY", "Ljava/lang/String;", "CAR_OPTIONS_FILTERS_USE_CAMPAIGN_SHOWN_KEY", "USED_CARS_FILTERS_USE_COUNT_KEY", "", "USED_CARS_FILTERS_USE_SHOW_THRESHOLD", "I", "_avito_used-cars-uxfeedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public h(@k l lVar) {
        this.f13650a = lVar;
    }

    @Override // QG0.g
    public final void a(@k b bVar) {
        String str = bVar.equals(b.C0894b.f13637a) ? "car_brand_filters_use_campaign_shown_key" : bVar.equals(b.a.f13635a) ? "car_brand_options_use_campaign_shown_key" : null;
        if (str != null) {
            this.f13650a.putBoolean(str, true);
        }
    }

    @Override // QG0.g
    public final boolean b(@k b bVar) {
        boolean z12 = bVar instanceof b.c;
        l lVar = this.f13650a;
        if (z12) {
            if (lVar.getInt("used_cars_filters_use_count_key", 0) >= 3) {
                return true;
            }
        } else if (bVar instanceof b.C0894b) {
            if (!lVar.c("car_brand_filters_use_campaign_shown_key")) {
                return true;
            }
        } else {
            if (!(bVar instanceof b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!lVar.c("car_brand_options_use_campaign_shown_key")) {
                return true;
            }
        }
        return false;
    }

    @Override // QG0.g
    public final void c() {
        l lVar = this.f13650a;
        lVar.a(lVar.getInt("used_cars_filters_use_count_key", 0) + 1, "used_cars_filters_use_count_key");
    }
}
