package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading;

import kotlin.Metadata;

/* compiled from: IacLogFileUploader.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.t, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C30912t<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f168042b;

    public C30912t(String str) {
        this.f168042b = str;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacLogUploader", "Failed to upload log file: " + this.f168042b, (Throwable) obj);
    }
}
