package com.avito.android.messenger.service;

import android.app.Application;
import androidx.compose.runtime.internal.P;
import com.avito.android.InterfaceC31091j1;
import kotlin.Metadata;

/* compiled from: ImageUploadStarter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/service/b;", "Lcom/avito/android/messenger/service/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f197219a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31091j1 f197220b;

    public b(@Y61.k Application application, @Y61.k InterfaceC31091j1 interfaceC31091j1) {
        this.f197219a = application;
        this.f197220b = interfaceC31091j1;
    }

    @Override // com.avito.android.messenger.service.a
    public final void a(@Y61.l Long l12, @Y61.k String str) {
        androidx.core.content.d.startForegroundService(this.f197219a, this.f197220b.a(str, l12.toString()));
    }
}
