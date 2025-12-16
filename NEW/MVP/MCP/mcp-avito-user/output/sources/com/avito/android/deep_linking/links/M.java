package com.avito.android.deep_linking.links;

import com.avito.android.autoteka.deeplinks.AutotekaBuyReportLink;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: UTMLinkConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/M;", "Lcom/avito/android/deep_linking/links/L;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class M implements L {
    @Inject
    public M() {
    }

    @Override // com.avito.android.deep_linking.links.L
    @Y61.k
    public final String a(@Y61.k AutotekaBuyReportLink autotekaBuyReportLink, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        Map mapG = P0.g(new Q("utm_source", autotekaBuyReportLink.f96214d), new Q("utm_medium", autotekaBuyReportLink.f96215e), new Q("utm_campaign", autotekaBuyReportLink.f96213c));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapG.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            StringBuilder sbR = androidx.compose.foundation.H.r((sb2.length() == 0 && z12) ? "?" : ContainerUtils.FIELD_DELIMITER);
            sbR.append((String) entry2.getKey());
            sbR.append('=');
            sbR.append((String) entry2.getValue());
            sb2.append(sbR.toString());
        }
        return sb2.toString();
    }
}
