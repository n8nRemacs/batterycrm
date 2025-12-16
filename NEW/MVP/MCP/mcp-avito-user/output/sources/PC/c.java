package pC;

import Qc.g;
import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28457i;
import com.avito.android.analytics.InterfaceC28459j;
import com.avito.android.analytics_adjust.AdjustTokenWithFirebaseName;
import com.avito.android.analytics_adjust.t;
import com.avito.android.remote.model.AdvertisementVerticalAlias;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AddToFavoritesVerticalEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpC/c;", "Lcom/avito/android/analytics/j;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements InterfaceC28459j {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Set<InterfaceC28457i> f428263b;

    /* compiled from: AddToFavoritesVerticalEvent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f428264a;

        static {
            int[] iArr = new int[AdvertisementVerticalAlias.values().length];
            try {
                iArr[AdvertisementVerticalAlias.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvertisementVerticalAlias.REALTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdvertisementVerticalAlias.GENERAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdvertisementVerticalAlias.JOB.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdvertisementVerticalAlias.SERVICES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AdvertisementVerticalAlias.NO_VALUE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f428264a = iArr;
        }
    }

    public c(@l AdvertisementVerticalAlias advertisementVerticalAlias, @l Double d12) {
        AdjustTokenWithFirebaseName adjustTokenWithFirebaseName;
        switch (advertisementVerticalAlias == null ? -1 : a.f428264a[advertisementVerticalAlias.ordinal()]) {
            case -1:
            case 6:
                adjustTokenWithFirebaseName = null;
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                adjustTokenWithFirebaseName = AdjustTokenWithFirebaseName.f91182v;
                break;
            case 2:
                adjustTokenWithFirebaseName = AdjustTokenWithFirebaseName.f91180t;
                break;
            case 3:
                adjustTokenWithFirebaseName = AdjustTokenWithFirebaseName.f91178r;
                break;
            case 4:
                adjustTokenWithFirebaseName = AdjustTokenWithFirebaseName.f91179s;
                break;
            case 5:
                adjustTokenWithFirebaseName = AdjustTokenWithFirebaseName.f91181u;
                break;
        }
        g gVarA = t.a(adjustTokenWithFirebaseName);
        gVarA.i(d12);
        this.f428263b = Collections.singleton(gVarA);
    }

    @Override // com.avito.android.analytics.InterfaceC28459j
    @k
    public final Set<InterfaceC28457i> getEvents() {
        return this.f428263b;
    }
}
