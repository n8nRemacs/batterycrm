package com.avito.android.beduin.v2.onboarding.impl.deeplinks;

import Ju.InterfaceC14249c;
import Y61.l;
import android.os.Bundle;
import com.avito.android.beduin.v2.onboarding.BeduinV2OnboardingDeepLink;
import com.avito.android.deep_linking.links.DeepLink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.rx3.y;
import sv.C48421d;

/* compiled from: BeduinV2OnboardingDeepLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/v2/onboarding/impl/deeplinks/f;", "Lev/a;", "Lcom/avito/android/beduin/v2/onboarding/BeduinV2OnboardingDeepLink;", "_avito_beduin-v2-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f extends AbstractC40161a<BeduinV2OnboardingDeepLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final d f104708f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final h f104709g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public String f104710h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public String f104711i;

    /* compiled from: BeduinV2OnboardingDeepLinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements Y41.l<InterfaceC14249c.b, G0> {
        public final void f(@Y61.k InterfaceC14249c.b bVar) {
            f fVar = (f) this.receiver;
            String str = fVar.f104710h;
            if (str != null) {
                String str2 = fVar.f104711i;
                h hVar = fVar.f104709g;
                C43259k.d(hVar.f104717b, null, null, new g(hVar, str, str2, null), 3);
            }
            fVar.j(bVar);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(InterfaceC14249c.b bVar) {
            f(bVar);
            return G0.f406611a;
        }
    }

    @Inject
    public f(@Y61.k d dVar, @Y61.k h hVar) {
        this.f104708f = dVar;
        this.f104709g = hVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        BeduinV2OnboardingDeepLink beduinV2OnboardingDeepLink = (BeduinV2OnboardingDeepLink) deepLink;
        int iA2 = C48421d.a(this);
        d dVar = this.f104708f;
        dVar.f104699a.J(dVar.f104700b.a(beduinV2OnboardingDeepLink), iA2, com.avito.android.beduin.v2.onboarding.impl.deeplinks.a.f104688l);
        this.f104710h = beduinV2OnboardingDeepLink.f104636b;
        this.f104711i = beduinV2OnboardingDeepLink.f104639e;
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        int iA2 = C48421d.a(this);
        a aVar = new a(1, this, f.class, "handleResult", "handleResult(Lcom/avito/android/deep_linking/links/result/DeeplinkResult$Terminal;)V", 0);
        d dVar = this.f104708f;
        C43175k.K(new C43197r1(new c(dVar, aVar, null), new b(y.a(dVar.f104701c.Q()), iA2)), dVar.f104702d);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f104708f.f104702d, null);
    }
}
