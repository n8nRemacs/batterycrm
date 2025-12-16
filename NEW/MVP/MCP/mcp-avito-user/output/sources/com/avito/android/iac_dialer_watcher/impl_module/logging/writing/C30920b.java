package com.avito.android.iac_dialer_watcher.impl_module.logging.writing;

import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: IacLogBufferInitializer.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/writing/b;", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/writing/a;", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.iac_dialer_watcher.impl_module.logging.writing.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C30920b implements InterfaceC30919a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.iac_dialer_watcher.public_module.logging.logger.a> f168075a;

    @Inject
    public C30920b(@Y61.k h31.e<com.avito.android.iac_dialer_watcher.public_module.logging.logger.a> eVar) {
        this.f168075a = eVar;
    }

    @Override // com.avito.android.iac_dialer_watcher.impl_module.logging.writing.InterfaceC30919a
    public final void b() {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.getClass();
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.d dVarC = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.c();
        if (dVarC.f168188b.getAndSet(true)) {
            return;
        }
        dVarC.f168187a = this.f168075a;
    }
}
