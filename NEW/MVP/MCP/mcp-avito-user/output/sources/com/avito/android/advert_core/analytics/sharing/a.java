package com.avito.android.advert_core.analytics.sharing;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import kotlin.Metadata;

/* compiled from: AdvertSharingEventTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/analytics/sharing/a;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface a {

    /* compiled from: AdvertSharingEventTracker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert_core.analytics.sharing.a$a, reason: collision with other inner class name */
    public static final class C2455a {
        public static /* synthetic */ void a(a aVar, String str, String str2, String str3, String str4, String str5, int i12) {
            if ((i12 & 16) != 0) {
                str5 = null;
            }
            aVar.a(str, str2, str3, str4, str5, null);
        }
    }

    void a(@k String str, @l String str2, @l String str3, @l String str4, @l String str5, @l TreeClickStreamParent treeClickStreamParent);
}
