package com.avito.android.serp.adapter.rich_snippets.regular;

import com.avito.android.analytics.event.ContactSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertAction;
import com.avito.android.remote.model.AdvertActions;
import com.avito.android.serp.adapter.advert_xl.AdvertXlItem;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertXlRichItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "fromGalleryAction", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class S extends kotlin.jvm.internal.N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertXlItem f271091l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z f271092m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(AdvertXlItem advertXlItem, Z z12) {
        super(1);
        this.f271091l = advertXlItem;
        this.f271092m = z12;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        List<AdvertAction> actions;
        Object next;
        boolean zBooleanValue = bool.booleanValue();
        AdvertXlItem advertXlItem = this.f271091l;
        AdvertActions advertActions = advertXlItem.f268752E;
        DeepLink deepLink = null;
        if (advertActions != null && (actions = advertActions.getActions()) != null) {
            Iterator<T> it = actions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((AdvertAction) next) instanceof AdvertAction.Messenger) {
                    break;
                }
            }
            AdvertAction advertAction = (AdvertAction) next;
            if (advertAction != null) {
                deepLink = advertAction.getDeepLink();
            }
        }
        if (deepLink != null) {
            this.f271092m.f271109c.get().W(advertXlItem.f268777c, deepLink, zBooleanValue ? ContactSource.f89922g : ContactSource.f89921f, null, null);
        }
        return G0.f406611a;
    }
}
