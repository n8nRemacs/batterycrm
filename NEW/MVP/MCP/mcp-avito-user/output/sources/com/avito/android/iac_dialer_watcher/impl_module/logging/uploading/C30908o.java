package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading;

import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.internal.operators.observable.C41986s0;
import io.reactivex.rxjava3.internal.operators.single.C42022u;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: IacLogCleaner.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/uploading/o;", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/uploading/a;", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.o, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C30908o implements InterfaceC30894a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.iac_dialer_watcher.impl_module.logging.repository.e f168019a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.iac_dialer_watcher.impl_module.logging.f f168020b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.iac_dialer_watcher.impl_module.logging.q f168021c;

    @Inject
    public C30908o(@Y61.k com.avito.android.iac_dialer_watcher.impl_module.logging.repository.e eVar, @Y61.k com.avito.android.iac_dialer_watcher.impl_module.logging.f fVar, @Y61.k com.avito.android.iac_dialer_watcher.impl_module.logging.q qVar) {
        this.f168019a = eVar;
        this.f168020b = fVar;
        this.f168021c = qVar;
    }

    @Override // com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.InterfaceC30894a
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.completable.T a(@Y61.k String str, @Y61.k Set set) {
        return new C41986s0(io.reactivex.rxjava3.core.z.X(set).w(new C30907n(this, str))).B(G0.f406611a);
    }

    @Override // com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.InterfaceC30894a
    @Y61.k
    public final C42022u b(@Y61.k com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w wVar) {
        return this.f168020b.O().n(new C30895b(this, wVar)).k(C30896c.f167992b);
    }
}
