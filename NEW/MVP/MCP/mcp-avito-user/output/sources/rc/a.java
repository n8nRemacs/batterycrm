package RC;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.event.ContactSource;
import com.avito.android.analytics.provider.clickstream.ScreenIdField;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: FavoritesAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRC/a;", "", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface a {
    void Y(@k String str, @l String str2, boolean z12);

    void h0(@k String str, @k ContactSource contactSource, @l String str2, @l ScreenIdField screenIdField, @l String str3);

    void i0(@k String str);

    void j0();

    void k(@k String str);

    void k0(@k String str, @k String str2);

    void l0(@k String str, @k String str2);

    void m0();

    void n0(int i12, @l Map<String, String> map);
}
