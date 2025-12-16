package com.avito.android.vas_performance.deeplink.handler;

import Ju.InterfaceC14249c;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.C35967w2;
import com.avito.android.vas_performance.deeplink.PerformanceVasLink;
import eH0.c;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;
import nI0.InterfaceC44261b;
import sv.C48421d;

/* compiled from: PerformanceVasDeeplinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/deeplink/handler/e;", "Lev/a;", "Lcom/avito/android/vas_performance/deeplink/PerformanceVasLink;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"MissingDeeplinkHandlerResult"})
/* loaded from: classes5.dex */
public final class e extends AbstractC40161a<PerformanceVasLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.paid_services.a f319886f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final v50.c f319887g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final eH0.c f319888h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44261b f319889i;

    /* compiled from: PerformanceVasDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements Y41.l<InterfaceC14249c.b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC14249c.b bVar) {
            ((e) this.receiver).j(bVar);
            return G0.f406611a;
        }
    }

    @Inject
    public e(@Y61.k com.avito.android.paid_services.a aVar, @Y61.k v50.c cVar, @Y61.k eH0.c cVar2, @Y61.k InterfaceC44261b interfaceC44261b) {
        this.f319886f = aVar;
        this.f319887g = cVar;
        this.f319888h = cVar2;
        this.f319889i = interfaceC44261b;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        Intent flags;
        PerformanceVasLink performanceVasLink = (PerformanceVasLink) deepLink;
        if (bundle != null) {
            flags = (Intent) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) bundle.getParcelable("up_intent", Intent.class) : bundle.getParcelable("up_intent"));
        } else {
            flags = null;
        }
        if (flags == null && performanceVasLink.f319865f) {
            flags = c.a.a(this.f319888h, performanceVasLink.f319861b, null, true, false, 22).putExtra("up_intent", InterfaceC44261b.a.a(this.f319889i, null, null, null, null, 31)).setFlags(603979776);
        }
        Intent intentAddFlags = this.f319887g.a(performanceVasLink).addFlags(603979776);
        if (flags != null) {
            intentAddFlags.putExtra("up_intent", flags);
        }
        C35967w2.c(intentAddFlags, bundle != null ? com.avito.android.util.H.b(bundle) : null);
        this.f319886f.a(performanceVasLink, C48421d.a(this), bundle, intentAddFlags);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f319886f.b(C48421d.a(this), new a(1, this, e.class, "setTerminalResult", "setTerminalResult(Lcom/avito/android/deep_linking/links/result/DeeplinkResult$Terminal;)V", 0));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f319886f.e();
    }
}
