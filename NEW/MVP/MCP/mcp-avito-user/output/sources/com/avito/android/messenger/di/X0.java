package com.avito.android.messenger.di;

import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessengerModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/di/X0;", "Lru/avito/messenger/F0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class X0 implements ru.avito.messenger.F0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.messenger.w0 f195724a;

    public X0(com.avito.android.messenger.w0 w0Var) {
        this.f195724a = w0Var;
    }

    @Override // ru.avito.messenger.F0
    @Y61.k
    public final io.reactivex.rxjava3.core.z<MessengerUserHashInfo> a() {
        return this.f195724a.g();
    }
}
