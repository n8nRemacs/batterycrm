package com.avito.android.messenger.channels.mvi.interactor;

import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.channels.mvi.header_feature.C31761m;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AssistantSettingsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/interactor/b;", "Lcom/avito/android/messenger/channels/mvi/interactor/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.channels.mvi.interactor.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31764b implements InterfaceC31763a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<WY.a> f187641a;

    @Inject
    public C31764b(@Y61.k h31.e<WY.a> eVar) {
        this.f187641a = eVar;
    }

    @Override // com.avito.android.messenger.channels.mvi.interactor.InterfaceC31763a
    @Y61.l
    public final Object a(@Y61.k C31761m c31761m) {
        return this.f187641a.get().d(c31761m);
    }
}
