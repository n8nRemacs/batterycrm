package com.avito.android.verification.links.mts;

import Y61.k;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.messenger.blacklist.mvi.C31684n;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.verification.links.mts.i;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.operators.single.C42017o;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.r;
import ru.mts.biometry.sdk.IdentificationCancelReason;
import rv.C47918a;
import sv.C48421d;

/* compiled from: VerificationMTSLinkAsyncHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/links/mts/f;", "Lev/a;", "Lcom/avito/android/verification/links/mts/VerificationMTSLink;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f extends AbstractC40161a<VerificationMTSLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.b f324297f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f324298g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.verification.b f324299h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f324300i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final com.avito.android.verification.links.mts.b f324301j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final a.g f324302k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f324303l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final InterfaceC28373a f324304m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f324305n = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: VerificationMTSLinkAsyncHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(f.this);
        }
    }

    @Inject
    public f(@k a.b bVar, @k a.InterfaceC4053a interfaceC4053a, @k com.avito.android.verification.b bVar2, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k com.avito.android.verification.links.mts.b bVar3, @k a.g gVar, @k InterfaceC35745a5 interfaceC35745a5, @k InterfaceC28373a interfaceC28373a) {
        this.f324297f = bVar;
        this.f324298g = interfaceC4053a;
        this.f324299h = bVar2;
        this.f324300i = aVar;
        this.f324301j = bVar3;
        this.f324302k = gVar;
        this.f324303l = interfaceC35745a5;
        this.f324304m = interfaceC28373a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        VerificationMTSLink verificationMTSLink = (VerificationMTSLink) deepLink;
        VerificationMTSArgs verificationMTSArgs = new VerificationMTSArgs(verificationMTSLink.f324284b, false, false, verificationMTSLink.f324289g, verificationMTSLink.f324285c, 6, null);
        com.avito.android.verification.b bVar = this.f324299h;
        bVar.getClass();
        VerificationMTSActivity.f324277c.getClass();
        Intent intent = new Intent(bVar.f323380a, (Class<?>) VerificationMTSActivity.class);
        intent.putExtra("verificationMTSArgs", verificationMTSArgs);
        this.f324298g.J(intent, C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f324305n.b(this.f324297f.Q().N(new a()).t0(new l41.g() { // from class: com.avito.android.verification.links.mts.f.b
            @Override // l41.g
            public final void accept(Object obj) {
                Object serializableExtra;
                C47918a c47918a = (C47918a) obj;
                f fVar = f.this;
                int i12 = c47918a.f437156b;
                IdentificationCancelReason identificationCancelReason = null;
                if (i12 == -1) {
                    fVar.f324302k.g(fVar.d(), true);
                    VerificationMTSLink verificationMTSLinkC = fVar.c();
                    String str = verificationMTSLinkC != null ? verificationMTSLinkC.f324287e : null;
                    VerificationMTSLink verificationMTSLinkC2 = fVar.c();
                    String str2 = verificationMTSLinkC2 != null ? verificationMTSLinkC2.f324288f : null;
                    com.avito.android.verification.links.mts.b bVar = fVar.f324301j;
                    fVar.f324305n.b(new C42017o(bVar.f324292b.a(str, str2).z(bVar.f324291a.a()).s(fVar.f324303l.e()), new C31684n(fVar, 24)).x(d.f324295b, new e(fVar)));
                    return;
                }
                InterfaceC28373a interfaceC28373a = fVar.f324304m;
                if (i12 == 0 || i12 == 11) {
                    interfaceC28373a.c(fVar.k("USER_EXIT or CANCELLED; code: " + i12));
                    fVar.j(new i.a("USER_EXIT or CANCELLED"));
                    return;
                }
                if (i12 != 12) {
                    interfaceC28373a.c(fVar.k("unknown result code: " + i12));
                    fVar.j(new i.a(AK.c.g(i12, "unknown result code: ")));
                    return;
                }
                Intent intent = c47918a.f437157c;
                if (intent != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        serializableExtra = intent.getSerializableExtra("data", IdentificationCancelReason.class);
                    } else {
                        Serializable serializableExtra2 = intent.getSerializableExtra("data");
                        serializableExtra = (IdentificationCancelReason) (serializableExtra2 instanceof IdentificationCancelReason ? serializableExtra2 : null);
                    }
                    identificationCancelReason = (IdentificationCancelReason) serializableExtra;
                }
                interfaceC28373a.c(fVar.k("IDENTIFICATION_CANCELLED: " + identificationCancelReason));
                fVar.j(new i.a("IDENTIFICATION_CANCELLED: " + identificationCancelReason));
            }
        }));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f324305n.e();
    }

    public final com.avito.android.verification.links.mts.a k(String str) {
        String strValueOf = String.valueOf(c());
        VerificationMTSLink verificationMTSLinkC = c();
        String str2 = verificationMTSLinkC != null ? verificationMTSLinkC.f324287e : null;
        if (str2 == null) {
            str2 = "";
        }
        VerificationMTSLink verificationMTSLinkC2 = c();
        String str3 = verificationMTSLinkC2 != null ? verificationMTSLinkC2.f324288f : null;
        return new com.avito.android.verification.links.mts.a(str, strValueOf, str2, str3 != null ? str3 : "");
    }
}
