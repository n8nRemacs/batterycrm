package com.avito.android.serp.adapter.rich_snippets.regular;

import com.avito.android.analytics.event.ContactSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertAction;
import com.avito.android.remote.model.AdvertActions;
import com.avito.android.serp.adapter.AdvertItem;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertRichItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "fromGalleryAction", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.serp.adapter.rich_snippets.regular.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34787j extends kotlin.jvm.internal.N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f271179l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C34797u f271180m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34787j(AdvertItem advertItem, C34797u c34797u) {
        super(1);
        this.f271179l = advertItem;
        this.f271180m = c34797u;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        List<AdvertAction> actions;
        Object next;
        boolean zBooleanValue = bool.booleanValue();
        AdvertItem advertItem = this.f271179l;
        AdvertActions advertActions = advertItem.f268408U;
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
            this.f271180m.f271211b.get().W(advertItem.f268425c, deepLink, zBooleanValue ? ContactSource.f89920e : ContactSource.f89919d, null, null);
        }
        return G0.f406611a;
    }
}
