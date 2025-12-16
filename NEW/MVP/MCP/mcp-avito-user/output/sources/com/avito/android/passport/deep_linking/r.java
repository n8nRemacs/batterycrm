package com.avito.android.passport.deep_linking;

import com.avito.android.deep_linking.links.PassportProfilesListLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import sv.C48421d;

/* compiled from: PassportProfilesListAsyncLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class r extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s f211081l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ PassportProfilesListLink f211082m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, PassportProfilesListLink passportProfilesListLink) {
        super(0);
        this.f211081l = sVar;
        this.f211082m = passportProfilesListLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        s sVar = this.f211081l;
        sVar.f211084g.J(sVar.f211083f.j(this.f211082m.f133546b), C48421d.a(sVar), com.avito.android.deeplink_handler.view.c.f134589l);
        return G0.f406611a;
    }
}
