package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading;

import kotlin.Metadata;

/* compiled from: IacLogSender.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class N<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.iac_dialer_watcher.impl_module.logging.repository.a f167966b;

    public N(com.avito.android.iac_dialer_watcher.impl_module.logging.repository.a aVar) {
        this.f167966b = aVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacLogSender", "Log uploaded: " + this.f167966b, null);
    }
}
