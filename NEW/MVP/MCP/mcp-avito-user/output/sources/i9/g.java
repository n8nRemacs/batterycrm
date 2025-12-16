package i9;

import com.avito.android.analytics.InterfaceC28457i;
import com.avito.android.analytics.InterfaceC28459j;
import com.avito.android.analytics_adjust.AdjustTokenWithFirebaseName;
import com.avito.android.analytics_adjust.C28537e;
import com.avito.android.analytics_adjust.InterfaceC28535c;
import com.avito.android.analytics_adjust.t;
import com.avito.android.analytics_adjust.utils.AdjustContentType;
import com.avito.android.remote.model.AdvertisementVerticalAlias;
import com.avito.android.remote.model.CategoryIds;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.b1;
import kotlin.jvm.internal.L;

/* compiled from: AdvertViewedVerticalEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Li9/g;", "Lcom/avito/android/analytics/j;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g implements InterfaceC28459j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Map<String, String> f398382b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f398383c;

    /* compiled from: AdvertViewedVerticalEvent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f398384a;

        static {
            int[] iArr = new int[AdvertisementVerticalAlias.values().length];
            try {
                iArr[AdvertisementVerticalAlias.REALTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvertisementVerticalAlias.AUTO.ordinal()] = 2;
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
            f398384a = iArr;
        }
    }

    public g(@Y61.k AdvertisementVerticalAlias advertisementVerticalAlias, @Y61.l Double d12, @Y61.l String str, @Y61.k String str2, @Y61.l Map map) {
        AdjustTokenWithFirebaseName adjustTokenWithFirebaseName;
        this.f398382b = map;
        int[] iArr = a.f398384a;
        switch (iArr[advertisementVerticalAlias.ordinal()]) {
            case 1:
                adjustTokenWithFirebaseName = AdjustTokenWithFirebaseName.f91124D;
                break;
            case 2:
                if (!L.f(str, CategoryIds.AUTO.SPAREPARTS.getId())) {
                    adjustTokenWithFirebaseName = AdjustTokenWithFirebaseName.f91136P;
                    break;
                } else {
                    adjustTokenWithFirebaseName = AdjustTokenWithFirebaseName.f91122B;
                    break;
                }
            case 3:
                adjustTokenWithFirebaseName = AdjustTokenWithFirebaseName.f91122B;
                break;
            case 4:
                adjustTokenWithFirebaseName = AdjustTokenWithFirebaseName.f91123C;
                break;
            case 5:
                adjustTokenWithFirebaseName = AdjustTokenWithFirebaseName.f91125E;
                break;
            case 6:
                adjustTokenWithFirebaseName = null;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        Qc.g gVarA = t.a(adjustTokenWithFirebaseName);
        gVarA.i(d12);
        gVarA.j(map);
        InterfaceC28535c interfaceC28535cB = C28537e.b(adjustTokenWithFirebaseName);
        AdjustContentType[] adjustContentTypeArr = AdjustContentType.f91246b;
        interfaceC28535cB.c();
        interfaceC28535cB.f(str2);
        interfaceC28535cB.a(d12);
        if (iArr[advertisementVerticalAlias.ordinal()] == 5) {
            interfaceC28535cB.e();
        }
        this.f398383c = b1.l(gVarA, interfaceC28535cB);
    }

    @Override // com.avito.android.analytics.InterfaceC28459j
    @Y61.k
    public final Set<InterfaceC28457i> getEvents() {
        return this.f398383c;
    }
}
