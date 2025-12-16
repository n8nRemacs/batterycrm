package com.avito.android.passport.profile_add.add_dialog;

import com.avito.android.beduin.v2.page.BeduinV2BottomSheetDeepLink;
import com.avito.android.deep_linking.links.PassportAddProfileLink;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PassportAddProfileDialogAsyncLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PassportAddProfileLink f211187l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f211188m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(PassportAddProfileLink passportAddProfileLink, c cVar) {
        super(0);
        this.f211187l = passportAddProfileLink;
        this.f211188m = cVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        boolean z12 = this.f211187l.f133526b;
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f211188m.f211192i;
        if (z12) {
            b.a.a(aVar, new BeduinV2BottomSheetDeepLink("api/1/profiles_add/onboarding", "PassportOnboarding", "fit", false, null, null, null, null, false, 496, null), null, null, 6);
        } else {
            b.a.a(aVar, new BeduinV2BottomSheetDeepLink("api/3/profiles/limitations/check", "PassportAddProfile", "fit", false, null, null, null, null, false, 496, null), null, null, 6);
        }
        return G0.f406611a;
    }
}
