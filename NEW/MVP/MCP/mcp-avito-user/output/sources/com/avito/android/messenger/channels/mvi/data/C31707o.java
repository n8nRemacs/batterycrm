package com.avito.android.messenger.channels.mvi.data;

import android.os.Parcelable;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: ChannelPropertySerializer.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/data/o;", "Lcom/avito/android/messenger/channels/mvi/data/n;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.channels.mvi.data.o, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31707o implements InterfaceC31706n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Gson f187240a;

    public C31707o(@Y61.k Gson gson) {
        this.f187240a = gson;
    }

    @Override // com.avito.android.messenger.channels.mvi.data.InterfaceC31706n
    public final <T> T a(@Y61.k Class<T> cls, @Y61.k String str) {
        return (T) this.f187240a.d(cls, str);
    }

    @Override // com.avito.android.messenger.channels.mvi.data.InterfaceC31706n
    @Y61.k
    public final String b(@Y61.k Class cls, Parcelable parcelable) {
        return this.f187240a.k(cls, parcelable);
    }
}
