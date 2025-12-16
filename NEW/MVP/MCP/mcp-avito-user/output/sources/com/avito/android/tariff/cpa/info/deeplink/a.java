package com.avito.android.tariff.cpa.info.deeplink;

import Ju.InterfaceC14249c;
import Y41.l;
import Y61.k;
import android.annotation.SuppressLint;
import androidx.compose.runtime.internal.P;
import com.avito.android.tariff.deeplink.TariffCpaInfoLink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;
import l90.o;
import sv.C48421d;

/* compiled from: TariffCpaInfoDeeplinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpa/info/deeplink/a;", "Lev/a;", "Lcom/avito/android/tariff/deeplink/TariffCpaInfoLink;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"MissingDeeplinkHandlerResult"})
/* loaded from: classes4.dex */
public final class a extends AbstractC40161a<TariffCpaInfoLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.paid_services.a f294629f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final v50.c f294630g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final o f294631h;

    /* compiled from: TariffCpaInfoDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.tariff.cpa.info.deeplink.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C8952a extends H implements l<InterfaceC14249c.b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC14249c.b bVar) {
            ((a) this.receiver).j(bVar);
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k com.avito.android.paid_services.a aVar, @k v50.c cVar, @k o oVar) {
        this.f294629f = aVar;
        this.f294630g = cVar;
        this.f294631h = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    @Override // ev.AbstractC40161a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.os.Bundle r4, com.avito.android.deep_linking.links.DeepLink r5, java.lang.String r6) {
        /*
            r3 = this;
            com.avito.android.tariff.deeplink.TariffCpaInfoLink r5 = (com.avito.android.tariff.deeplink.TariffCpaInfoLink) r5
            java.lang.String r6 = "up_intent"
            if (r4 == 0) goto L1b
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L13
            java.lang.Object r0 = com.avito.android.onboarding.steps.a.p(r4)
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            goto L17
        L13:
            android.os.Parcelable r0 = r4.getParcelable(r6)
        L17:
            android.content.Intent r0 = (android.content.Intent) r0
            if (r0 != 0) goto L21
        L1b:
            l90.o r0 = r3.f294631h
            android.content.Intent r0 = r0.b()
        L21:
            v50.c r1 = r3.f294630g
            android.content.Intent r1 = r1.a(r5)
            r2 = 603979776(0x24000000, float:2.7755576E-17)
            android.content.Intent r1 = r1.addFlags(r2)
            r1.putExtra(r6, r0)
            java.lang.String r6 = "need_add_to_back_stack"
            r0 = 0
            r1.putExtra(r6, r0)
            if (r4 == 0) goto L3d
            com.avito.android.CalledFrom r6 = com.avito.android.util.H.b(r4)
            goto L3e
        L3d:
            r6 = 0
        L3e:
            com.avito.android.util.C35967w2.c(r1, r6)
            com.avito.android.paid_services.a r6 = r3.f294629f
            int r0 = sv.C48421d.a(r3)
            r6.a(r5, r0, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.tariff.cpa.info.deeplink.a.a(android.os.Bundle, com.avito.android.deep_linking.links.DeepLink, java.lang.String):void");
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f294629f.b(C48421d.a(this), new C8952a(1, this, a.class, "setTerminalResult", "setTerminalResult(Lcom/avito/android/deep_linking/links/result/DeeplinkResult$Terminal;)V", 0));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f294629f.e();
    }
}
