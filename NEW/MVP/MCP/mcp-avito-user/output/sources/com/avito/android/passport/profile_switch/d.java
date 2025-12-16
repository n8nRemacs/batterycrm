package com.avito.android.passport.profile_switch;

import com.avito.android.deep_linking.links.PassportSwitchProfileLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;

/* compiled from: PassportSwitchProfileAsyncLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f213670l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ PassportSwitchProfileLink f213671m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j jVar, PassportSwitchProfileLink passportSwitchProfileLink) {
        super(0);
        this.f213670l = jVar;
        this.f213671m = passportSwitchProfileLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        j jVar = this.f213670l;
        C43259k.d(jVar.f213693n, null, null, new c(jVar, this.f213671m, null), 3);
        return G0.f406611a;
    }
}
