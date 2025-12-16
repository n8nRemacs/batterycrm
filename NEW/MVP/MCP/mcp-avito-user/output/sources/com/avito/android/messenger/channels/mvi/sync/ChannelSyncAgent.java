package com.avito.android.messenger.channels.mvi.sync;

import com.avito.android.persistence.messenger.C33126v0;
import io.reactivex.rxjava3.core.AbstractC41768a;
import java.util.Collection;
import java.util.Map;
import java.util.SortedSet;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelSyncAgent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0005\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/sync/ChannelSyncAgent;", "Lcom/avito/android/messenger/channels/mvi/sync/n0;", "Lcom/avito/android/messenger/channels/mvi/sync/A;", "Lcom/avito/android/messenger/channels/mvi/sync/p0;", "a", "InconsistentChannelListException", "InvalidChannelException", "InvalidChannelInDbException", "c", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ChannelSyncAgent extends InterfaceC31850n0, A, InterfaceC31854p0 {

    /* compiled from: ChannelSyncAgent.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/sync/ChannelSyncAgent$InconsistentChannelListException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InconsistentChannelListException extends Exception {
    }

    /* compiled from: ChannelSyncAgent.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/sync/ChannelSyncAgent$InvalidChannelException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InvalidChannelException extends Exception {
    }

    /* compiled from: ChannelSyncAgent.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/sync/ChannelSyncAgent$InvalidChannelInDbException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InvalidChannelInDbException extends Exception {
    }

    /* compiled from: ChannelSyncAgent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/sync/ChannelSyncAgent$a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        static {
            new a();
        }
    }

    /* compiled from: ChannelSyncAgent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    /* compiled from: ChannelSyncAgent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/sync/ChannelSyncAgent$c;", "", "a", "b", "Lcom/avito/android/messenger/channels/mvi/sync/ChannelSyncAgent$c$a;", "Lcom/avito/android/messenger/channels/mvi/sync/ChannelSyncAgent$c$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {

        /* compiled from: ChannelSyncAgent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/sync/ChannelSyncAgent$c$a;", "Lcom/avito/android/messenger/channels/mvi/sync/ChannelSyncAgent$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements c {

            /* renamed from: a, reason: collision with root package name */
            public final long f188321a;

            public a(long j12) {
                this.f188321a = j12;
            }

            @Override // com.avito.android.messenger.channels.mvi.sync.ChannelSyncAgent.c
            /* renamed from: a, reason: from getter */
            public final long getF188321a() {
                return this.f188321a;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f188321a == ((a) obj).f188321a;
            }

            public final int hashCode() {
                return Long.hashCode(this.f188321a);
            }

            @Y61.k
            public final String toString() {
                return androidx.appcompat.app.r.u(new StringBuilder("HasMorePages(listBottomTimestamp="), this.f188321a, ')');
            }
        }

        /* compiled from: ChannelSyncAgent.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/sync/ChannelSyncAgent$c$b;", "Lcom/avito/android/messenger/channels/mvi/sync/ChannelSyncAgent$c;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f188322a = new b();

            /* renamed from: b, reason: collision with root package name */
            public static final long f188323b = Long.MIN_VALUE;

            @Override // com.avito.android.messenger.channels.mvi.sync.ChannelSyncAgent.c
            /* renamed from: a */
            public final long getF188321a() {
                return f188323b;
            }
        }

        /* renamed from: a */
        long getF188321a();
    }

    @Y61.k
    io.reactivex.rxjava3.core.I<String> a(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4);

    @Y61.k
    io.reactivex.rxjava3.core.I f(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo);

    @Y61.k
    io.reactivex.rxjava3.core.I<String> g(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.l String str, @Y61.l String str2, @Y61.l String str3);

    @Y61.k
    io.reactivex.rxjava3.core.I<c> h(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k SortedSet<String> sortedSet, @Y61.k SortedSet<String> sortedSet2, @Y61.l Boolean bool);

    @Y61.k
    AbstractC41768a i(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo);

    @Y61.k
    io.reactivex.rxjava3.core.I<Map<C33126v0, c>> j(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k Collection<C33126v0> collection, @Y61.l Boolean bool);
}
