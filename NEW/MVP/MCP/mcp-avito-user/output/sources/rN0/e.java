package rn0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.event.ContactSource;
import com.avito.android.analytics.provider.clickstream.ScreenIdField;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: OpenContactListener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrn0/e;", "", "_avito-discouraged_avito-libs_serp-core_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface e {

    /* compiled from: OpenContactListener.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void W(@k String str, @k DeepLink deepLink, @k ContactSource contactSource, @l ScreenIdField screenIdField, @l String str2);
}
