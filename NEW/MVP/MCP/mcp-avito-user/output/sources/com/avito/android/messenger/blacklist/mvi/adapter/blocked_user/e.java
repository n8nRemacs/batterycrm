package com.avito.android.messenger.blacklist.mvi.adapter.blocked_user;

import EY.a;
import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BlockedUserPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/blacklist/mvi/adapter/blocked_user/e;", "LTV0/d;", "Lcom/avito/android/messenger/blacklist/mvi/adapter/blocked_user/g;", "LEY/a$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements TV0.d<g, a.C0238a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<i> f186401b;

    @Inject
    public e(@k h31.e<i> eVar) {
        this.f186401b = eVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        a.C0238a c0238a = (a.C0238a) aVar;
        gVar.GY(c0238a.f4065g);
        String str = c0238a.f4061c;
        if (str == null) {
            str = c0238a.f4060b;
        }
        gVar.dK(str);
        gVar.ls(c0238a.f4062d);
        gVar.MG(c0238a.f4064f);
        gVar.cq(c0238a.f4063e);
        gVar.I70(c0238a.f4066h);
        gVar.AJ(new d(this, c0238a));
    }
}
