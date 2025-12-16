package Jm0;

import Hm0.InterfaceC14008b;
import Ju.AbstractC14250d;
import Y61.k;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.reputation.links.BaseReputationLink;
import kotlin.Metadata;

/* compiled from: BaseDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"LJm0/b;", "Lcom/avito/android/reputation/links/BaseReputationLink;", "T", "", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface b<T extends BaseReputationLink> {

    /* compiled from: BaseDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        @k
        public static AbstractC14250d.c a(@k b bVar, @k BaseReputationLink baseReputationLink) {
            bVar.getF13996e().R(bVar.getF13995d().a(baseReputationLink), com.avito.android.deeplink_handler.view.b.f134588l);
            return AbstractC14250d.c.f9171c;
        }
    }

    @k
    /* renamed from: a */
    a.InterfaceC4053a getF13996e();

    @k
    /* renamed from: b */
    InterfaceC14008b getF13995d();
}
