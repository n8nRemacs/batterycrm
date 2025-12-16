package i9;

import com.avito.android.analytics.InterfaceC28457i;
import com.avito.android.analytics.InterfaceC28459j;
import com.avito.android.analytics_adjust.AdjustTokenWithFirebaseName;
import com.avito.android.analytics_adjust.C28537e;
import com.avito.android.analytics_adjust.InterfaceC28535c;
import com.avito.android.analytics_adjust.t;
import com.avito.android.analytics_adjust.utils.AdjustContentType;
import com.avito.android.remote.model.AdvertisementCategoryAlias;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.b1;

/* compiled from: AdvertViewedCategoryEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Li9/c;", "Lcom/avito/android/analytics/j;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements InterfaceC28459j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Map<String, String> f398369b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f398370c;

    /* compiled from: AdvertViewedCategoryEvent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f398371a;

        static {
            int[] iArr = new int[AdvertisementCategoryAlias.values().length];
            try {
                iArr[AdvertisementCategoryAlias.SERVICE_TRANSPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvertisementCategoryAlias.SERVICE_CONSTRUCTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdvertisementCategoryAlias.SERVICE_GARDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdvertisementCategoryAlias.SERVICE_BEAUTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdvertisementCategoryAlias.SERVICE_REPAIR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AdvertisementCategoryAlias.SERVICE_COURSES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AdvertisementCategoryAlias.SERVICE_INSTALLATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AdvertisementCategoryAlias.SERVICE_CLEANING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AdvertisementCategoryAlias.SERVICE_EVENTS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AdvertisementCategoryAlias.SERVICE_PHOTOGRAPHY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AdvertisementCategoryAlias.NO_VALUE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f398371a = iArr;
        }
    }

    public c(@Y61.l AdvertisementCategoryAlias advertisementCategoryAlias, @Y61.k String str, @Y61.l Double d12, @Y61.l Map<String, String> map) {
        AdjustTokenWithFirebaseName adjustTokenWithFirebaseName;
        this.f398369b = map;
        switch (advertisementCategoryAlias == null ? -1 : a.f398371a[advertisementCategoryAlias.ordinal()]) {
            case -1:
            case 11:
                adjustTokenWithFirebaseName = null;
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                adjustTokenWithFirebaseName = AdjustTokenWithFirebaseName.f91126F;
                break;
            case 2:
                adjustTokenWithFirebaseName = AdjustTokenWithFirebaseName.f91127G;
                break;
            case 3:
                adjustTokenWithFirebaseName = AdjustTokenWithFirebaseName.f91128H;
                break;
            case 4:
                adjustTokenWithFirebaseName = AdjustTokenWithFirebaseName.f91129I;
                break;
            case 5:
                adjustTokenWithFirebaseName = AdjustTokenWithFirebaseName.f91130J;
                break;
            case 6:
                adjustTokenWithFirebaseName = AdjustTokenWithFirebaseName.f91131K;
                break;
            case 7:
                adjustTokenWithFirebaseName = AdjustTokenWithFirebaseName.f91132L;
                break;
            case 8:
                adjustTokenWithFirebaseName = AdjustTokenWithFirebaseName.f91133M;
                break;
            case 9:
                adjustTokenWithFirebaseName = AdjustTokenWithFirebaseName.f91134N;
                break;
            case 10:
                adjustTokenWithFirebaseName = AdjustTokenWithFirebaseName.f91135O;
                break;
        }
        Qc.g gVarA = t.a(adjustTokenWithFirebaseName);
        gVarA.i(d12);
        gVarA.j(map);
        InterfaceC28535c interfaceC28535cB = C28537e.b(adjustTokenWithFirebaseName);
        AdjustContentType[] adjustContentTypeArr = AdjustContentType.f91246b;
        interfaceC28535cB.c();
        interfaceC28535cB.f(str);
        interfaceC28535cB.a(d12);
        this.f398370c = b1.l(gVarA, interfaceC28535cB);
    }

    @Override // com.avito.android.analytics.InterfaceC28459j
    @Y61.k
    public final Set<InterfaceC28457i> getEvents() {
        return this.f398370c;
    }
}
