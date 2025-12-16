package eH0;

import Y61.l;
import android.content.Intent;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: UserAdvertIntentFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeH0/c;", "", "_avito_user-advert_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface c {

    /* compiled from: UserAdvertIntentFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ Intent a(c cVar, String str, DeepLink deepLink, boolean z12, boolean z13, int i12) {
            if ((i12 & 4) != 0) {
                deepLink = null;
            }
            if ((i12 & 8) != 0) {
                z12 = false;
            }
            if ((i12 & 16) != 0) {
                z13 = false;
            }
            return cVar.f(deepLink, str, z12, z13);
        }
    }

    @Y61.k
    Intent a(@Y61.k String str);

    @Y61.k
    Intent b(@Y61.k String str, @Y61.k String str2);

    @Y61.k
    Intent c(@Y61.k String str);

    @Y61.k
    Intent d(@Y61.k String str, @Y61.k String str2);

    @Y61.k
    Intent e(@Y61.k String str, @l String str2);

    @Y61.k
    Intent f(@l DeepLink deepLink, @Y61.k String str, boolean z12, boolean z13);

    @Y61.k
    Intent g(@Y61.k String str);
}
