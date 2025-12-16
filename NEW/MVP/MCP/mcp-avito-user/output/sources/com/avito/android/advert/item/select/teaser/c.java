package com.avito.android.advert.item.select.teaser;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.auto_select.Button;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AutoSelectTeaserPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AutoSelectTeaserItem f79646l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f79647m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AutoSelectTeaserItem autoSelectTeaserItem, d dVar) {
        super(0);
        this.f79646l = autoSelectTeaserItem;
        this.f79647m = dVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink uri;
        Button button = this.f79646l.f79641g.getButton();
        if (button != null && (uri = button.getUri()) != null) {
            b.a.a(this.f79647m.f79648b, uri, null, null, 6);
        }
        return G0.f406611a;
    }
}
