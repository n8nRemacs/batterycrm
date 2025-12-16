package wH0;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.paid_services.PaidServicesLink;
import com.avito.android.user_advert.advert.items.actions_item.ActionsItem;
import fH0.AbstractC40291a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VasActionPresenterDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LwH0/b;", "LwH0/a;", "LfH0/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wH0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49512b extends AbstractC40291a implements InterfaceC49511a {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f441363d;

    @Inject
    public C49512b(@k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f441363d = aVar;
    }

    @Override // wH0.InterfaceC49511a
    public final void M(@k ActionsItem.d dVar) {
        DeepLink deepLink = dVar.f309025b;
        if (deepLink instanceof PaidServicesLink ? true : deepLink instanceof MyAdvertLink.EditLink) {
            b.a.a(this.f441363d, deepLink, null, null, 6);
        }
    }
}
