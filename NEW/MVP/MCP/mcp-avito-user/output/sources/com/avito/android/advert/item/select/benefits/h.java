package com.avito.android.advert.item.select.benefits;

import android.net.Uri;
import com.avito.android.advert.item.Z0;
import com.avito.android.analytics.event.auto_select.FromPage;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.remote.model.AdvertAutoSelect;
import hc.C40911a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsAutoSelectItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertAutoSelect f79355l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f79356m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(AdvertAutoSelect advertAutoSelect, g gVar) {
        super(0);
        this.f79355l = advertAutoSelect;
        this.f79356m = gVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Z0 z02;
        AdvertAutoSelect.AutoSelectButton button = this.f79355l.getButton();
        if (button != null) {
            g gVar = this.f79356m;
            C40911a.C11264a c11264a = C40911a.f397284g;
            String title = button.getTitle();
            c11264a.getClass();
            gVar.f79353c.c(new C40911a(FromPage.f90014d, title, gVar.f79352b, "select_entrypoint"));
            DeepLink uri = button.getUri();
            String url = button.getUrl();
            if (uri != null && !(uri instanceof NoMatchLink)) {
                Z0 z03 = gVar.f79354d;
                if (z03 != null) {
                    z03.g(null, uri, null);
                }
            } else if (url != null && (z02 = gVar.f79354d) != null) {
                z02.x(Uri.parse(url));
            }
        }
        return G0.f406611a;
    }
}
