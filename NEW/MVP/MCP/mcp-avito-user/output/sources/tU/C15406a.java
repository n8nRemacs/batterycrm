package Tu;

import Y61.k;
import Y61.l;
import android.net.Uri;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsSegmentParser;
import com.avito.android.remote.model.SerpSpaceType;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SerpSpaceTypeParser.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LTu/a;", "", "<init>", "()V", "_avito-discouraged_avito-network_deeplinks-parser-factory"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Tu.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C15406a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C15406a f15971a = new C15406a();

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @k
    public static SerpSpaceType a(@l String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1906712829:
                    if (str.equals("avitoMall")) {
                        return SerpSpaceType.AvitoMall;
                    }
                    break;
                case -396705909:
                    if (str.equals("autoSelect")) {
                        return SerpSpaceType.AutoSelect;
                    }
                    break;
                case 1011602672:
                    if (str.equals("avitoBlack")) {
                        return SerpSpaceType.AvitoBlack;
                    }
                    break;
                case 1026985469:
                    if (str.equals("avitoSales")) {
                        return SerpSpaceType.AvitoSales;
                    }
                    break;
                case 1495196634:
                    if (str.equals("avitoForBusiness")) {
                        return SerpSpaceType.AvitoForBusiness;
                    }
                    break;
                case 1815795785:
                    if (str.equals("avitoTravel")) {
                        return SerpSpaceType.AvitoTravel;
                    }
                    break;
            }
        }
        return SerpSpaceType.Default;
    }

    @k
    public static SerpSpaceType b(@k Uri uri, @k SearchParams searchParams, @l String str) {
        SerpSpaceType serpSpaceTypeFromSearchParamsSegment = SerpSpaceType.INSTANCE.fromSearchParamsSegment(SearchParamsSegmentParser.INSTANCE.fromParam(searchParams));
        if (serpSpaceTypeFromSearchParamsSegment != null) {
            return serpSpaceTypeFromSearchParamsSegment;
        }
        SerpSpaceType serpSpaceType = L.f(str, "CPL_application") ? SerpSpaceType.ServicesOrderRequest : null;
        return serpSpaceType != null ? serpSpaceType : a(uri.getQueryParameter("segment"));
    }
}
