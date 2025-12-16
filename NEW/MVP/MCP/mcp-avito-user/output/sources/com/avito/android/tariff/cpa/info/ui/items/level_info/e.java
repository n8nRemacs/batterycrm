package com.avito.android.tariff.cpa.info.ui.items.level_info;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ButtonAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: LevelInfoItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f294918l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f294919m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, g gVar) {
        super(0);
        this.f294918l = aVar;
        this.f294919m = gVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deeplink;
        ButtonAction buttonAction = this.f294918l.f294912e;
        if (buttonAction != null && (deeplink = buttonAction.getDeeplink()) != null) {
            this.f294919m.f294921b.invoke(deeplink);
        }
        return G0.f406611a;
    }
}
