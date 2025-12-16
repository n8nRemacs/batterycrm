package ru.avito.component.serp.job;

import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.AdvertAction;
import com.avito.android.remote.model.KeyAttributes;
import com.avito.android.remote.model.SellerInfoAdvantage;
import com.avito.android.remote.model.SellerInfoInlineAdvantage;
import com.avito.android.remote.model.SellerOnlineStatus;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import hw.InterfaceC41177b;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SerpAdvertRichJobCard.kt */
@InterfaceC41177b
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/component/serp/job/c;", "LQ81/a;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface c extends Q81.a {

    /* compiled from: SerpAdvertRichJobCard.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void FO();

    void H0();

    void K0(@Y61.k String str, boolean z12);

    void LS(@Y61.k Action action, @Y61.k Y41.a<G0> aVar);

    void MU(@Y61.l KeyAttributes keyAttributes);

    void Q50(@Y61.l com.avito.android.image_loader.a aVar);

    void Vo(@Y61.l List<SellerInfoInlineAdvantage> list, @Y61.l String str, @Y61.l SellerOnlineStatus sellerOnlineStatus);

    void X50(@Y61.k Y41.a<G0> aVar);

    void b0(@Y61.l String str);

    void bk(@Y61.k ru.avito.component.serp.job.geo.a aVar);

    void jb(boolean z12, boolean z13);

    void l5(@Y61.k Y41.a<G0> aVar);

    void lo(@Y61.k ru.avito.component.serp.job.geo.g gVar);

    void n1(@Y61.l List<SellerInfoAdvantage> list);

    void o5(@Y61.l SerpBadgeBar serpBadgeBar);

    void om(@Y61.k Y41.l<? super AdvertAction, G0> lVar);

    void p(@Y61.l String str);

    void qD(@Y61.l List<? extends AdvertAction> list, boolean z12);

    void setActive(boolean z12);

    void setViewed(boolean z12);

    void yT(@Y61.k Action action, @Y61.k Y41.a<G0> aVar);
}
