package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading;

import Ag.CallableC13028a;
import com.avito.android.util.InterfaceC35745a5;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.internal.operators.single.C42026y;
import java.io.File;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: IacLogFileUploader.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/uploading/w;", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/uploading/s;", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.w, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C30915w implements InterfaceC30911s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.iac_dialer_watcher.impl_module.api.a f168047a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f168048b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.iac_dialer_watcher.impl_module.logging.q f168049c;

    @Inject
    public C30915w(@Y61.k com.avito.android.iac_dialer_watcher.impl_module.api.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.iac_dialer_watcher.impl_module.logging.q qVar) {
        this.f168047a = aVar;
        this.f168048b = interfaceC35745a5;
        this.f168049c = qVar;
    }

    @Override // com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.InterfaceC30911s
    @Y61.k
    public final C42026y a(@Y61.k com.avito.android.iac_dialer_watcher.impl_module.logging.repository.a aVar, @Y61.k File file) {
        return new io.reactivex.rxjava3.internal.operators.single.G(new CallableC13028a(14, file, aVar)).n(new C30914v(file, this));
    }
}
