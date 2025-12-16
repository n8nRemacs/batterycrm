package com.avito.android.comfortable_deal.deeplink;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: PpRecallDeeplinkDeeplinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/deeplink/I;", "Lev/a;", "Lcom/avito/android/comfortable_deal/deeplink/PpRecallDeeplink;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class I extends AbstractC40161a<PpRecallDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.i f121868f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.g f121869g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Yo.p f121870h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comfortable_deal.domain.e f121871i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C43238h f121872j;

    @Inject
    public I(@Y61.k a.i iVar, @Y61.k a.g gVar, @Y61.k Yo.p pVar, @Y61.k com.avito.android.comfortable_deal.domain.e eVar, @Y61.k R0 r02) {
        this.f121868f = iVar;
        this.f121869g = gVar;
        this.f121870h = pVar;
        this.f121871i = eVar;
        this.f121872j = U.a(r02.b());
    }

    /* JADX WARN: Failed to inline method: com.avito.android.deeplink_handler.view.a.i.a.c(com.avito.android.deeplink_handler.view.a$i, int, com.avito.android.component.toast.f$c):void */
    /* JADX WARN: Not passed register '(r0v7 'cVar' com.avito.android.component.toast.f$c)' in method call: com.avito.android.deeplink_handler.view.a.i.a.c(com.avito.android.deeplink_handler.view.a$i, int, com.avito.android.component.toast.f$c):void */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(com.avito.android.comfortable_deal.deeplink.I r18, com.avito.android.comfortable_deal.deeplink.PpRecallDeeplink r19, android.os.Bundle r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.deeplink.I.k(com.avito.android.comfortable_deal.deeplink.I, com.avito.android.comfortable_deal.deeplink.PpRecallDeeplink, android.os.Bundle, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        C43259k.d(this.f121872j, null, null, new F(this, (PpRecallDeeplink) deepLink, bundle, null), 3);
    }

    public final void l(boolean z12, boolean z13) {
        d();
        Bundle bundleB = b();
        if (bundleB != null) {
            bundleB.putString("ppRecallLoadingWidgetTag", "");
        }
        Bundle bundleB2 = b();
        if (bundleB2 != null) {
            bundleB2.putBoolean("ppRecallWidgetResultTag", z13);
        }
        this.f121869g.g(d(), z12);
    }
}
