package WK0;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.ux.feedback.link.UxFeedbackStartCampaignLink;
import ev.AbstractC40162b;
import j.k0;
import java.time.Instant;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: UxFeedbackStartCampaignLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LWK0/a;", "Lev/b;", "Lcom/avito/android/ux/feedback/link/UxFeedbackStartCampaignLink;", "a", "_avito_ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends AbstractC40162b<UxFeedbackStartCampaignLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SK0.b f17861d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final g f17862e;

    /* compiled from: UxFeedbackStartCampaignLinkHandler.kt */
    @k0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWK0/a$a;", "LSK0/c;", "_avito_ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: WK0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1264a implements SK0.c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f17863a;

        public C1264a(@k String str) {
            this.f17863a = str;
        }

        @Override // SK0.c
        @k
        /* renamed from: a, reason: from getter */
        public final String getF17863a() {
            return this.f17863a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1264a) && L.f(this.f17863a, ((C1264a) obj).f17863a);
        }

        public final int hashCode() {
            return this.f17863a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Campaign(eventName="), this.f17863a, ')');
        }
    }

    @Inject
    public a(@k SK0.b bVar, @k g gVar) {
        this.f17861d = bVar;
        this.f17862e = gVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        Date dateFrom;
        UxFeedbackStartCampaignLink uxFeedbackStartCampaignLink = (UxFeedbackStartCampaignLink) deepLink;
        String str2 = uxFeedbackStartCampaignLink.f319188b;
        if (uxFeedbackStartCampaignLink.f319189c && this.f17862e.b(str2)) {
            return AbstractC14250d.b.f9170c;
        }
        C1264a c1264a = new C1264a(str2);
        Map<String, Object> map = uxFeedbackStartCampaignLink.f319191e;
        SK0.a aVar = null;
        if (map != null && !map.isEmpty()) {
            SK0.a aVar2 = new SK0.a();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                boolean z12 = value instanceof Date;
                LinkedHashMap linkedHashMap = aVar2.f14900a;
                if (z12) {
                    linkedHashMap.put(key, (Date) value);
                } else if (value instanceof Boolean) {
                    Boolean bool = (Boolean) value;
                    bool.getClass();
                    aVar2.f14901b.put(key, bool);
                } else if (value instanceof Double) {
                    aVar2.f14902c.put(key, Double.valueOf(((Number) value).doubleValue()));
                } else if (value instanceof Float) {
                    aVar2.f14903d.put(key, Float.valueOf(((Number) value).floatValue()));
                } else {
                    boolean z13 = value instanceof Integer;
                    LinkedHashMap linkedHashMap2 = aVar2.f14904e;
                    if (z13) {
                        linkedHashMap2.put(key, Integer.valueOf(((Number) value).intValue()));
                    } else if (value instanceof Long) {
                        linkedHashMap2.put(key, Integer.valueOf((int) ((Number) value).longValue()));
                    } else if (value instanceof String) {
                        try {
                            dateFrom = Date.from(Instant.parse(key));
                        } catch (Exception unused) {
                            dateFrom = null;
                        }
                        if (dateFrom != null) {
                            linkedHashMap.put(key, dateFrom);
                        } else {
                            aVar2.a(key, (String) value);
                        }
                    }
                }
            }
            aVar = aVar2;
        }
        SK0.f fVar = new SK0.f();
        for (Map.Entry<String, String> entry2 : uxFeedbackStartCampaignLink.f319190d.entrySet()) {
            fVar.a(entry2.getKey(), entry2.getValue());
        }
        this.f17861d.a(c1264a, aVar, fVar, new b(this));
        return AbstractC14250d.c.f9171c;
    }
}
