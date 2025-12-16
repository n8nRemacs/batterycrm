package com.avito.android.verification.links.sber_id;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import l90.n;

/* compiled from: VerificationSberIdSyncHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/links/sber_id/d;", "Lev/b;", "Lcom/avito/android/verification/links/sber_id/VerificationSberIdLink;", "a", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d extends AbstractC40162b<VerificationSberIdLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.verification.storage.a f324488d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final n f324489e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f324490f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.verification.links.sber_id.a f324491g;

    /* compiled from: VerificationSberIdSyncHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/verification/links/sber_id/d$a;", "", "<init>", "()V", "", "SBER_BUSINESS_TYPE", "Ljava/lang/String;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public d(@k com.avito.android.verification.storage.a aVar, @k n nVar, @k a.InterfaceC4053a interfaceC4053a, @k com.avito.android.verification.links.sber_id.a aVar2) {
        this.f324488d = aVar;
        this.f324489e = nVar;
        this.f324490f = interfaceC4053a;
        this.f324491g = aVar2;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        VerificationSberIdLink verificationSberIdLink = (VerificationSberIdLink) deepLink;
        String userHashId = this.f324489e.e().getUserHashId();
        com.avito.android.verification.storage.a aVar = this.f324488d;
        aVar.l(userHashId);
        LinkedHashMap linkedHashMap = verificationSberIdLink.f324480b;
        aVar.i(linkedHashMap);
        boolean zF2 = L.f(linkedHashMap.get("type"), "sber_business");
        a.InterfaceC4053a interfaceC4053a = this.f324490f;
        if (zF2) {
            interfaceC4053a.g1(new e(verificationSberIdLink, (String[]) C43066x.f0(verificationSberIdLink.f324484f, new String[]{" "}, 0, 6).toArray(new String[0]), this));
        } else {
            interfaceC4053a.g1(new f(verificationSberIdLink));
        }
        return AbstractC14250d.c.f9171c;
    }
}
