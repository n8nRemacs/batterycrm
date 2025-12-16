package G3;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.active_orders_common.items.common.ActiveOrderItem;
import com.avito.android.cyclic_gallery_widget.image_carousel.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: HomeActiveOrdersCarouselAdapter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LG3/a;", "Lcom/avito/android/cyclic_gallery_widget/image_carousel/p;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a extends p {

    /* renamed from: w, reason: collision with root package name */
    @l
    public List<? extends ActiveOrderItem> f6269w;

    @Override // com.avito.android.cyclic_gallery_widget.image_carousel.p
    public final void b(@k ArrayList arrayList) {
        List<? extends ActiveOrderItem> list = this.f6269w;
        if (list != null) {
            C42745f0.h(list, arrayList);
        }
    }
}
