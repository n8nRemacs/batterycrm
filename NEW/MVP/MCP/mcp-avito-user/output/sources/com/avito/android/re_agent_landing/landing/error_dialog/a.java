package com.avito.android.re_agent_landing.landing.error_dialog;

import Y61.k;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ReAgentProfileCreateLandingErrorDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/error_dialog/a;", "Landroid/text/style/ClickableSpan;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a extends ClickableSpan {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReAgentProfileCreateLandingErrorDialogFragment f250618b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f250619c;

    public a(ReAgentProfileCreateLandingErrorDialogFragment reAgentProfileCreateLandingErrorDialogFragment, String str) {
        this.f250618b = reAgentProfileCreateLandingErrorDialogFragment;
        this.f250619c = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(@k View view) {
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f250618b.f250616h0;
        if (aVar == null) {
            aVar = null;
        }
        b.a.a(aVar, new WebViewLink.AnyDomain(Uri.parse(this.f250619c), null, null, 6, null), null, null, 6);
    }
}
