package com.avito.android.advert_favorites_toast;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toast_bar.k;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertFavoritesToastView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Button f85801l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f85802m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ DeepLink f85803n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Button button, e eVar, DeepLink deepLink) {
        super(0);
        this.f85801l = button;
        this.f85802m = eVar;
        this.f85803n = deepLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f85801l.setEnabled(false);
        e eVar = this.f85802m;
        k kVar = eVar.f85807d;
        if (kVar != null) {
            kVar.f();
        }
        eVar.f85807d = null;
        b.a.a(eVar.f85805b, this.f85803n, null, null, 6);
        return G0.f406611a;
    }
}
