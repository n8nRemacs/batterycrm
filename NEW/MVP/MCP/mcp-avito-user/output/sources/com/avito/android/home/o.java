package com.avito.android.home;

import com.avito.android.bottom_navigation.NavigationTab;
import kotlin.Metadata;

/* compiled from: HomeTooltipRelay.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/home/o;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface o {

    /* compiled from: HomeTooltipRelay.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(o oVar, NavigationTab navigationTab, String str, Integer num, int i12) {
            if ((i12 & 4) != 0) {
                num = null;
            }
            oVar.b(navigationTab, str, num, null);
        }
    }

    void b(@Y61.k NavigationTab navigationTab, @Y61.k String str, @Y61.l Integer num, @Y61.l Integer num2);
}
