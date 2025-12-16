package iI0;

import com.avito.android.advert_multi_items.model.ModificationItem;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MyAdvertMultiItemsBlockTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LiI0/u;", "LiI0/t;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class u implements t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f398493a;

    @Inject
    public u(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.f398493a = interfaceC28373a;
    }

    @Override // iI0.t
    public final void a(@Y61.k String str) {
        this.f398493a.c(new r(str));
    }

    @Override // iI0.t
    public final void b(@Y61.k String str, @Y61.k ModificationItem modificationItem) {
        this.f398493a.c(new s(str, modificationItem.getF85922b()));
    }
}
