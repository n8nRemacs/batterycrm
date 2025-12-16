package com.avito.android.serp.adapter.rich_snippets.regular;

import com.avito.android.cyclic_gallery_widget.image_carousel.ActionType;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertAction;
import com.avito.android.remote.model.AdvertActions;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertRichItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-libs_serp-core_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.rich_snippets.regular.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34799w {

    /* compiled from: Comparisons.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.rich_snippets.regular.w$a */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t12, T t13) {
            return kotlin.comparisons.a.b(Integer.valueOf(((com.avito.android.cyclic_gallery_widget.image_carousel.a) t12).f131993a.ordinal()), Integer.valueOf(((com.avito.android.cyclic_gallery_widget.image_carousel.a) t13).f131993a.ordinal()));
        }
    }

    @Y61.l
    public static final DeepLink a(@Y61.k AdvertActions advertActions) {
        Object next;
        Iterator<T> it = advertActions.getActions().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((AdvertAction) next) instanceof AdvertAction.Phone) {
                break;
            }
        }
        AdvertAction advertAction = (AdvertAction) next;
        if (advertAction != null) {
            return advertAction.getDeepLink();
        }
        return null;
    }

    @Y61.k
    public static final Set<com.avito.android.cyclic_gallery_widget.image_carousel.a> b(@Y61.k List<? extends AdvertAction> list) {
        ArrayList arrayList = new ArrayList();
        for (AdvertAction advertAction : list) {
            com.avito.android.cyclic_gallery_widget.image_carousel.a aVar = advertAction instanceof AdvertAction.Messenger ? new com.avito.android.cyclic_gallery_widget.image_carousel.a(ActionType.f131987f, advertAction.getTitle(), 0, null, 12, null) : advertAction instanceof AdvertAction.Phone ? new com.avito.android.cyclic_gallery_widget.image_carousel.a(ActionType.f131985d, advertAction.getTitle(), 0, null, 12, null) : advertAction instanceof AdvertAction.CallOrder ? new com.avito.android.cyclic_gallery_widget.image_carousel.a(ActionType.f131986e, advertAction.getTitle(), 0, null, 12, null) : null;
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return C42745f0.P0(C42745f0.B0(arrayList, new a()));
    }
}
