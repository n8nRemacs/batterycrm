package com.avito.android.deeplink_handling;

import Ju.AbstractC14250d;
import Y61.k;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.R;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink.JobApplyCreateLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import gd.C40662b;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: JobApplyCreateDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deeplink_handling/d;", "Lev/a;", "Lcom/avito/android/deeplink/JobApplyCreateLink;", "_avito_job_apply-only-with-cv_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d extends AbstractC40161a<JobApplyCreateLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C25719a f134722f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f134723g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.g f134724h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final a.i f134725i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final h31.e<C40662b> f134726j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final C43238h f134727k;

    @Inject
    public d(@k C25719a c25719a, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k a.g gVar, @k a.i iVar, @k R0 r02, @k h31.e<C40662b> eVar) {
        this.f134722f = c25719a;
        this.f134723g = aVar;
        this.f134724h = gVar;
        this.f134725i = iVar;
        this.f134726j = eVar;
        this.f134727k = U.a(CoroutineContext.Element.DefaultImpls.plus(Q0.a(), r02.b()));
    }

    public static final void k(d dVar) {
        dVar.f134724h.g(null, false);
        PrintableText printableTextC = com.avito.android.printable_text.b.c(R.string.error_message, new Serializable[0]);
        ToastBarPosition toastBarPosition = ToastBarPosition.f181046d;
        f.c.f125255c.getClass();
        a.i.C4057a.d(dVar.f134725i, printableTextC, null, null, f.c.a.b(), 0, toastBarPosition, null, null, 1966);
        dVar.j(AbstractC14250d.b.f9170c);
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        JobApplyCreateLink jobApplyCreateLink = (JobApplyCreateLink) deepLink;
        this.f134722f.b(jobApplyCreateLink, this, null, new c(this, bundle, jobApplyCreateLink));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f134727k, null);
    }
}
