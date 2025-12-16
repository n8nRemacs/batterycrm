package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading;

import com.avito.android.analytics.statsd.y;
import kotlin.Metadata;

/* compiled from: IacLogFileUploader.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.u, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C30913u<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f168043b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C30915w f168044c;

    public C30913u(String str, C30915w c30915w) {
        this.f168043b = str;
        this.f168044c = c30915w;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacLogUploader", "Log file uploaded and deleted: " + this.f168043b, null);
        com.avito.android.iac_dialer_watcher.impl_module.logging.q qVar = this.f168044c.f168049c;
        qVar.f167891a.c(new y.a(qVar.f167892b.a("calls", "logs", "{{%app_ver%}}", "uploading").f91030a, 1L));
    }
}
