package com.avito.android.messenger.channels.mvi.sync;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ChannelSyncOnPushAgent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/sync/t;", "LS20/a;", "Lcom/avito/android/messenger/channels/mvi/sync/t$a;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.channels.mvi.sync.t, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC31860t extends S20.a<a> {

    /* compiled from: ChannelSyncOnPushAgent.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/sync/t$a;", "", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.channels.mvi.sync.t$a */
    public static final /* data */ class a {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final C5556a f188562c = new C5556a(null);

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final a f188563d = new a(0, kotlin.collections.B0.f406639b);

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Set<String> f188564a;

        /* renamed from: b, reason: collision with root package name */
        public final long f188565b;

        /* compiled from: ChannelSyncOnPushAgent.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/sync/t$a$a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.channels.mvi.sync.t$a$a, reason: collision with other inner class name */
        public static final class C5556a {
            public /* synthetic */ C5556a(C42822w c42822w) {
                this();
            }

            public C5556a() {
            }
        }

        public a(long j12, @Y61.k Set set) {
            this.f188564a = set;
            this.f188565b = j12;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a a(a aVar, kotlin.collections.B0 b02, long j12, int i12) {
            Set set = b02;
            if ((i12 & 1) != 0) {
                set = aVar.f188564a;
            }
            if ((i12 & 2) != 0) {
                j12 = aVar.f188565b;
            }
            aVar.getClass();
            return new a(j12, set);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f188564a, aVar.f188564a) && this.f188565b == aVar.f188565b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f188565b) + (this.f188564a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("State(downloadedChannelIds=");
            sb2.append(this.f188564a);
            sb2.append(", unprocessedRequestsCount=");
            return androidx.appcompat.app.r.u(sb2, this.f188565b, ')');
        }
    }

    void Na(@Y61.k String str);
}
