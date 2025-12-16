package iI0;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.user_advert.advert.items.actions_item.ActionsItem;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.text.C43066x;

/* compiled from: UserAdvertActionButtonClickEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LiI0/E;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: iI0.E, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41295E implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f398472b;

    public C41295E(long j12, @Y61.k String str, @Y61.k ActionsItem.Action action) {
        String str2;
        Q q12 = new Q("item_id", Long.valueOf(j12));
        Q q13 = new Q("profile_tab", str);
        if (action instanceof ActionsItem.a) {
            str2 = "button_";
        } else if (action instanceof ActionsItem.c) {
            str2 = "promotion_";
        } else if (action instanceof ActionsItem.d) {
            str2 = "vas_action_";
        } else {
            if (!(action instanceof ActionsItem.b)) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "button_with_badge_";
        }
        this.f398472b = new ParametrizedClickStreamEvent(17226, 0, P0.g(q12, q13, new Q("button_name", str2.concat(C43066x.a0(action.getF309024a().toLowerCase(Locale.ROOT), " ", "_", false)))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f398472b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f398472b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f398472b.f90248c;
    }
}
