package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading;

import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.internal.operators.single.C42026y;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: IacLogSender.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/uploading/T;", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/uploading/H;", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class T implements H {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.iac_dialer_watcher.impl_module.logging.k f167973a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30894a f167974b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final X f167975c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final A f167976d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30911s f167977e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.iac_dialer_watcher.impl_module.logging.repository.e f167978f;

    @Inject
    public T(@Y61.k com.avito.android.iac_dialer_watcher.impl_module.logging.k kVar, @Y61.k InterfaceC30894a interfaceC30894a, @Y61.k X x12, @Y61.k A a12, @Y61.k InterfaceC30911s interfaceC30911s, @Y61.k com.avito.android.iac_dialer_watcher.impl_module.logging.repository.e eVar) {
        this.f167973a = kVar;
        this.f167974b = interfaceC30894a;
        this.f167975c = x12;
        this.f167976d = a12;
        this.f167977e = interfaceC30911s;
        this.f167978f = eVar;
    }

    @Override // com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.H
    @Y61.k
    public final C42026y a() {
        return this.f167973a.a().n(new S(this));
    }
}
