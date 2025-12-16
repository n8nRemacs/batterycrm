package com.avito.android.bxcontent.mvi.entity;

import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.category_parameters.HiddenParameter;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: BxContentState.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_serp_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class o {
    @Y61.k
    public static final String a(@Y61.k l lVar) {
        int i12 = lVar.f112309L;
        return i12 != 3 ? i12 != 4 ? i12 != 5 ? "none" : HiddenParameter.TYPE : "collapsed" : SearchParamsConverterKt.EXPANDED;
    }

    public static final boolean b(@Y61.k l lVar) {
        String strE = lVar.e();
        if (strE != null) {
            return C43066x.h0(strE, "cross_category_avito_for_business", false);
        }
        return false;
    }

    public static final boolean c(@Y61.k l lVar) {
        String strE = lVar.e();
        if (strE != null) {
            return C43066x.h0(strE, "cross_category_avito_mall", false);
        }
        return false;
    }

    @Y61.k
    public static final LinkedHashMap d(@Y61.k Map map, @Y61.k FeedId feedId, @Y61.k t tVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(feedId, tVar);
        return linkedHashMap;
    }
}
