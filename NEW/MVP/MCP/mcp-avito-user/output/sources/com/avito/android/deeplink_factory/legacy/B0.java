package com.avito.android.deeplink_factory.legacy;

import Tu.C15406a;
import android.net.Uri;
import com.avito.android.deep_linking.links.BxContentLink;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.PresentationTypeKt;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.SearchParamsFactory;
import com.avito.android.remote.model.Source;
import com.avito.android.remote.model.search.map.Area;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: LegacyDeepLinkFactory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/BxContentLink;", TooltipAttribute.PARAM_DEEP_LINK, "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class B0 extends kotlin.jvm.internal.N implements Y41.l<Uri, BxContentLink> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E2 f134198l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(E2 e22) {
        super(1);
        this.f134198l = e22;
    }

    @Override // Y41.l
    public final BxContentLink invoke(Uri uri) {
        Area area;
        Double dValueOf;
        Double dValueOf2;
        Double dValueOf3;
        Double dValueOf4;
        Uri uri2 = uri;
        this.f134198l.getClass();
        SearchParams searchParamsFromUri = SearchParamsFactory.INSTANCE.fromUri(uri2);
        String queryParameter = uri2.getQueryParameter("context");
        PresentationType presentationTypeFromString = PresentationType.INSTANCE.fromString(uri2.getQueryParameter(PresentationTypeKt.PRESENTATION_TYPE));
        Area area2 = null;
        try {
            String queryParameter2 = uri2.getQueryParameter("searchArea[latTop]");
            dValueOf = queryParameter2 != null ? Double.valueOf(Double.parseDouble(queryParameter2)) : null;
            String queryParameter3 = uri2.getQueryParameter("searchArea[lonLeft]");
            dValueOf2 = queryParameter3 != null ? Double.valueOf(Double.parseDouble(queryParameter3)) : null;
            String queryParameter4 = uri2.getQueryParameter("searchArea[latBottom]");
            dValueOf3 = queryParameter4 != null ? Double.valueOf(Double.parseDouble(queryParameter4)) : null;
            String queryParameter5 = uri2.getQueryParameter("searchArea[lonRight]");
            dValueOf4 = queryParameter5 != null ? Double.valueOf(Double.parseDouble(queryParameter5)) : null;
        } catch (NumberFormatException e12) {
            e = e12;
        }
        if (dValueOf == null || dValueOf2 == null || dValueOf3 == null || dValueOf4 == null) {
            area = area2;
        } else {
            Area area3 = new Area(new Coordinates(dValueOf.doubleValue(), dValueOf2.doubleValue()), new Coordinates(dValueOf3.doubleValue(), dValueOf4.doubleValue()));
            try {
                searchParamsFromUri.setArea(area3);
                area = area3;
            } catch (NumberFormatException e13) {
                e = e13;
                area2 = area3;
                V2.f318762a.c("DeepLinkFactory", "Failed to parse one of search parameters in deep link: " + uri2, e);
                area = area2;
                searchParamsFromUri.setSource(Source.INSTANCE.fromString(uri2.getQueryParameter(SearchParamsConverterKt.SOURCE)));
                searchParamsFromUri.setTitle(uri2.getQueryParameter("title"));
                searchParamsFromUri.setFootWalkingMetro(uri2.getQueryParameter(SearchParamsConverterKt.FOOT_WALKING_METRO));
                String queryParameter6 = uri2.getQueryParameter("mapSerpState");
                String queryParameter7 = uri2.getQueryParameter(SearchParamsConverterKt.EXPANDED);
                String queryParameter8 = uri2.getQueryParameter(SearchParamsConverterKt.SELLER_ID);
                String queryParameter9 = uri2.getQueryParameter("fromPage");
                String queryParameter10 = uri2.getQueryParameter("onboardingId");
                C15406a.f15971a.getClass();
                return new BxContentLink(searchParamsFromUri, queryParameter, area, null, queryParameter6, null, queryParameter9, queryParameter7, queryParameter8, presentationTypeFromString, queryParameter10, C15406a.b(uri2, searchParamsFromUri, queryParameter9), Boolean.parseBoolean(uri2.getQueryParameter("autoOpenSuggest")));
            }
        }
        searchParamsFromUri.setSource(Source.INSTANCE.fromString(uri2.getQueryParameter(SearchParamsConverterKt.SOURCE)));
        searchParamsFromUri.setTitle(uri2.getQueryParameter("title"));
        searchParamsFromUri.setFootWalkingMetro(uri2.getQueryParameter(SearchParamsConverterKt.FOOT_WALKING_METRO));
        String queryParameter62 = uri2.getQueryParameter("mapSerpState");
        String queryParameter72 = uri2.getQueryParameter(SearchParamsConverterKt.EXPANDED);
        String queryParameter82 = uri2.getQueryParameter(SearchParamsConverterKt.SELLER_ID);
        String queryParameter92 = uri2.getQueryParameter("fromPage");
        String queryParameter102 = uri2.getQueryParameter("onboardingId");
        C15406a.f15971a.getClass();
        return new BxContentLink(searchParamsFromUri, queryParameter, area, null, queryParameter62, null, queryParameter92, queryParameter72, queryParameter82, presentationTypeFromString, queryParameter102, C15406a.b(uri2, searchParamsFromUri, queryParameter92), Boolean.parseBoolean(uri2.getQueryParameter("autoOpenSuggest")));
    }
}
