package com.avito.android.messenger.channels.analytics;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.analytics.messenger.MessengerErrorType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.avito.messenger.internal.E;

/* compiled from: ChannelsListUseCaseTracker.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/analytics/c;", "Lcom/avito/android/messenger/channels/analytics/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f187094a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final MessengerStatsdEventFactory f187095b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final E f187096c;

    /* compiled from: ChannelsListUseCaseTracker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[MessengerErrorType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MessengerErrorType messengerErrorType = MessengerErrorType.f253194c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MessengerErrorType messengerErrorType2 = MessengerErrorType.f253194c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                MessengerErrorType messengerErrorType3 = MessengerErrorType.f253194c;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public c(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k MessengerStatsdEventFactory messengerStatsdEventFactory, @Y61.k E e12) {
        this.f187094a = interfaceC28373a;
        this.f187095b = messengerStatsdEventFactory;
        this.f187096c = e12;
    }

    @Override // com.avito.android.messenger.channels.analytics.b
    public final void a(@Y61.k String str, @Y61.k n nVar) {
        this.f187094a.c(MessengerStatsdEventFactory.a(this.f187095b, new String[]{"test", "usecase", "chat-list-loading", str, "draw_channels", "view-error", nVar.f187139a, nVar.f187141c}));
    }

    @Override // com.avito.android.messenger.channels.analytics.b
    public final void b(@Y61.k String str, @Y61.k String str2) {
        this.f187094a.c(MessengerStatsdEventFactory.a(this.f187095b, new String[]{"test", "usecase", "chat-list-loading", str2, str, "interrupted"}));
    }

    @Override // com.avito.android.messenger.channels.analytics.b
    public final void c(@Y61.k String str, @Y61.k String str2, @Y61.k Throwable th2) {
        String str3;
        com.avito.android.remote.analytics.messenger.a aVarA = this.f187096c.a(th2);
        int iOrdinal = aVarA.f253201a.ordinal();
        if (iOrdinal == 0) {
            str3 = "messenger-backend";
        } else if (iOrdinal == 1) {
            str3 = "messenger-client";
        } else if (iOrdinal == 2) {
            str3 = "messenger-network";
        } else {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str3 = "messenger-other";
        }
        this.f187094a.c(MessengerStatsdEventFactory.a(this.f187095b, new String[]{"test", "usecase", "chat-list-loading", str2, str, "error", str3, aVarA.f253202b}));
    }

    @Override // com.avito.android.messenger.channels.analytics.b
    public final void d(@Y61.k String str, @Y61.k String str2) {
        this.f187094a.c(MessengerStatsdEventFactory.a(this.f187095b, new String[]{"test", "usecase", "chat-list-loading", str2, str, "success"}));
    }

    @Override // com.avito.android.messenger.channels.analytics.b
    public final void e(@Y61.k String str, @Y61.k String str2) {
        this.f187094a.c(MessengerStatsdEventFactory.a(this.f187095b, new String[]{"test", "usecase", "chat-list-loading", str2, str, "start"}));
    }

    @Override // com.avito.android.messenger.channels.analytics.b
    public final void f(@Y61.k String str) {
        this.f187094a.c(MessengerStatsdEventFactory.a(this.f187095b, new String[]{"test", "usecase", "chat-list-loading", str, "load_channels", "deadlock"}));
    }
}
