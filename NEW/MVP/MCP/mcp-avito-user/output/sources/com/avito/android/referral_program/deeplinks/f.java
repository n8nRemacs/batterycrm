package com.avito.android.referral_program.deeplinks;

import Ju.InterfaceC14249c;
import Y41.l;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.referral_program.ReferralPageDeepLink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.rx3.y;
import sv.C48421d;

/* compiled from: ReferralPageDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/referral_program/deeplinks/f;", "Lev/a;", "Lcom/avito/android/referral_program/ReferralPageDeepLink;", "_avito_referral-program_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f extends AbstractC40161a<ReferralPageDeepLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final d f252656f;

    /* compiled from: ReferralPageDeepLinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements l<InterfaceC14249c.b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC14249c.b bVar) {
            ((f) this.receiver).j(bVar);
            return G0.f406611a;
        }
    }

    @Inject
    public f(@k d dVar) {
        this.f252656f = dVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        int iA2 = C48421d.a(this);
        d dVar = this.f252656f;
        dVar.f252647a.J(dVar.f252648b.a((ReferralPageDeepLink) deepLink), iA2, com.avito.android.referral_program.deeplinks.a.f252636l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        int iA2 = C48421d.a(this);
        a aVar = new a(1, this, f.class, "setTerminalResult", "setTerminalResult(Lcom/avito/android/deep_linking/links/result/DeeplinkResult$Terminal;)V", 0);
        d dVar = this.f252656f;
        C43175k.K(new C43197r1(new c(dVar, aVar, null), new b(y.a(dVar.f252649c.Q()), iA2)), dVar.f252650d);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f252656f.f252650d, null);
    }
}
