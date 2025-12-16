package com.avito.android.constructor_advert.ui.serp.constructor;

import Bu0.InterfaceC13187a;
import android.net.Uri;
import com.avito.android.analytics.event.native_video.VideoStopReason;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.SnippetSize;
import com.avito.android.remote.model.badge_bar.SerpBadge;
import com.avito.android.remote.model.sales.utils.BadgeSticker;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: ConstructorAdvertItemView.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/constructor_advert/ui/serp/constructor/n;", "LTV0/e;", "LQ81/a;", "LBu0/a;", "Lcom/avito/android/constructor_advert/ui/serp/constructor/a;", "Lru/avito/component/serp/AsyncViewportTracker;", "_avito_constructor-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface n extends TV0.e, Q81.a, InterfaceC13187a, com.avito.android.constructor_advert.ui.serp.constructor.a, AsyncViewportTracker {

    /* compiled from: ConstructorAdvertItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void D1(@Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2);

    void Dm(boolean z12);

    void Fd(int i12, @Y61.k List list);

    void Id(boolean z12);

    @Y61.k
    Uri O(@Y61.k com.avito.android.image_loader.k kVar);

    void Q3(@Y61.k Y41.p<? super String, ? super String, G0> pVar);

    void R0(@Y61.k Y41.l<? super String, G0> lVar);

    void Tw(boolean z12);

    void Y4();

    void Zc(int i12, int i13, @Y61.k AsyncViewportTracker.ViewContext viewContext);

    void a1(@Y61.k Y41.r<? super String, ? super Double, ? super Double, ? super VideoStopReason, G0> rVar);

    void b6(@Y61.l BadgeSticker badgeSticker);

    void c(@Y61.k Y41.a<G0> aVar);

    void k5(boolean z12, boolean z13);

    void setViewed(boolean z12);

    void t(@Y61.k Y41.a<G0> aVar);

    void t0(@Y61.l List<SerpBadge> list);

    void w8(boolean z12);

    void x7(@Y61.l Y41.l<? super Integer, G0> lVar);

    void xj(@Y61.l List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list, @Y61.l SnippetSize snippetSize, @Y61.l SerpDisplayType serpDisplayType);

    void z0(boolean z12);

    void z8(@Y61.l ru.avito.component.snippet_badge_bar.d dVar);
}
