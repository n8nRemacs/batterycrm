package com.avito.android.extended_profile_map.mvi;

import AA.a;
import AA.b;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ExtendedProfilePhoneRequestLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.extended_profile_map.ExtendedProfileAddress;
import com.avito.android.extended_profile_map.di.f;
import com.avito.android.remote.model.ExtendedProfilePhoneDisclaimer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;
import sc.InterfaceC48155d;
import zA.InterfaceC50427a;

/* compiled from: ExtendedProfileMapActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/extended_profile_map/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "LAA/a;", "LAA/b;", "LAA/d;", "_avito_extended-profile-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements com.avito.android.arch.mvi.a<AA.a, AA.b, AA.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_phone_dialog.g f151277a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50427a f151278b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final E f151279c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f151280d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48155d f151281e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_ux_feedback.b f151282f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f151283g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f151284h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final String f151285i;

    @Inject
    public d(@Y61.k com.avito.android.extended_profile_phone_dialog.g gVar, @Y61.k InterfaceC50427a interfaceC50427a, @Y61.k E e12, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC48155d interfaceC48155d, @Y61.k com.avito.android.extended_profile_ux_feedback.b bVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @f.b @Y61.l String str, @Y61.k @f.c String str2) {
        String strConcat;
        this.f151277a = gVar;
        this.f151278b = interfaceC50427a;
        this.f151279c = e12;
        this.f151280d = interfaceC28373a;
        this.f151281e = interfaceC48155d;
        this.f151282f = bVar;
        this.f151283g = aVar;
        this.f151284h = str2;
        this.f151285i = (str == null || (strConcat = str.concat("_geo")) == null) ? "" : strConcat;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(new a(y.a(this.f151283g.d9()), this), C43175k.C(new b(this, aVar, null), c43197r1));
    }

    public final InterfaceC43160i<AA.b> c(DeepLink deepLink, AA.d dVar) {
        InterfaceC43160i interfaceC43160iW;
        boolean z12 = deepLink instanceof ExtendedProfilePhoneRequestLink;
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f151283g;
        if (z12 && dVar.f189f.get(deepLink) == null) {
            b.a.a(aVar, deepLink, null, null, 6);
            ExtendedProfilePhoneRequestLink extendedProfilePhoneRequestLink = (ExtendedProfilePhoneRequestLink) deepLink;
            return C43175k.G(new c(this, extendedProfilePhoneRequestLink.f133319b, extendedProfilePhoneRequestLink.f133320c, null));
        }
        if (!z12 || dVar.f189f.get(deepLink) == null) {
            b.a.a(aVar, deepLink, null, null, 6);
            return C43175k.w();
        }
        ExtendedProfilePhoneRequestLink extendedProfilePhoneRequestLink2 = (ExtendedProfilePhoneRequestLink) deepLink;
        InterfaceC43160i interfaceC43160iG = C43175k.G(new c(this, extendedProfilePhoneRequestLink2.f133319b, extendedProfilePhoneRequestLink2.f133320c, null));
        com.avito.android.extended_profile_phone_dialog.f fVar = dVar.f189f.get(deepLink);
        if (fVar != null) {
            String strA = this.f151279c.a();
            ExtendedProfilePhoneDisclaimer extendedProfilePhoneDisclaimer = fVar.f151600b;
            interfaceC43160iW = new C43210w(new b.h(fVar, new FA.a(extendedProfilePhoneRequestLink2.f133319b, strA, this.f151285i, extendedProfilePhoneDisclaimer != null ? extendedProfilePhoneDisclaimer.getIsAnonymous() : null)));
        } else {
            interfaceC43160iW = C43175k.w();
        }
        return C43175k.N(interfaceC43160iG, interfaceC43160iW);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<AA.b> b(@Y61.k AA.a aVar, @Y61.k AA.d dVar) {
        C43210w c43210w;
        boolean z12 = aVar instanceof a.h;
        String str = this.f151284h;
        InterfaceC50427a interfaceC50427a = this.f151278b;
        if (z12) {
            ExtendedProfileAddress extendedProfileAddress = dVar.f186c;
            String str2 = extendedProfileAddress != null ? extendedProfileAddress.f151139b : null;
            ExtendedProfileAddress extendedProfileAddress2 = ((a.h) aVar).f167a;
            if (L.f(str2, extendedProfileAddress2.f151139b)) {
                return new C43210w(b.a.f169a);
            }
            interfaceC50427a.d(str);
            c43210w = new C43210w(new b.e(extendedProfileAddress2));
        } else {
            if (aVar instanceof a.C0011a) {
                return new C43210w(b.a.f169a);
            }
            if (aVar instanceof a.e) {
                interfaceC50427a.b(str);
                return C43175k.w();
            }
            if (aVar instanceof a.g) {
                interfaceC50427a.c(str);
                return C43175k.w();
            }
            if (aVar instanceof a.d) {
                return c(((a.d) aVar).f163a, dVar);
            }
            if (!(aVar instanceof a.i)) {
                if (aVar instanceof a.f) {
                    this.f151282f.e();
                    return new C43210w(b.c.f171a);
                }
                if (aVar instanceof a.b) {
                    return c(((a.b) aVar).f161a, dVar);
                }
                if (aVar instanceof a.c) {
                    return new C43210w(b.C0012b.f170a);
                }
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(new b.g(((a.i) aVar).f168a));
        }
        return c43210w;
    }
}
