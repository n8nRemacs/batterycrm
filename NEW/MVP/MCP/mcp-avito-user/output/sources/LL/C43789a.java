package ll;

import Y61.k;
import com.avito.android.bxcontent.model.AdvertListAdditionalTopics;
import com.avito.android.bxcontent.model.AdvertListData;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertListAdditionalTopics.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_serp_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: ll.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C43789a {
    @k
    public static final List<AdvertListData> a(@k AdvertListAdditionalTopics advertListAdditionalTopics) {
        List<AdvertListData> listU;
        AdvertListData advertListData = advertListAdditionalTopics.f111188b;
        AdvertListData advertListData2 = advertListAdditionalTopics.f111189c;
        return (advertListData2 == null || (listU = C42745f0.U(advertListData, advertListData2)) == null) ? Collections.singletonList(advertListData) : listU;
    }
}
