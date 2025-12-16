package com.avito.android.messenger.conversation.mvi.sync;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.single.C42019q;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.api.entity.ChatMessage;

/* compiled from: MessageSyncAgent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/K;", "", "b", "c", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface K {

    /* compiled from: MessageSyncAgent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ io.reactivex.rxjava3.core.I a(K k12, MessengerUserHashInfo messengerUserHashInfo, String str, int i12, Integer num, int i13) {
            if ((i13 & 16) != 0) {
                num = null;
            }
            return k12.b(messengerUserHashInfo, str, i12, null, num);
        }
    }

    /* compiled from: MessageSyncAgent.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/K$b;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f194603a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f194604b;

        public b(boolean z12, boolean z13) {
            this.f194603a = z12;
            this.f194604b = z13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f194603a == bVar.f194603a && this.f194604b == bVar.f194604b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f194604b) + (Boolean.hashCode(this.f194603a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LegacySyncAndSearchInfo(hasMorePages=");
            sb2.append(this.f194603a);
            sb2.append(", foundTargetMessage=");
            return androidx.appcompat.app.r.x(sb2, this.f194604b, ')');
        }
    }

    /* compiled from: MessageSyncAgent.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/K$c;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f194605a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f194606b;

        public c(int i12, boolean z12) {
            this.f194605a = i12;
            this.f194606b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f194605a == cVar.f194605a && this.f194606b == cVar.f194606b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f194606b) + (Integer.hashCode(this.f194605a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SyncAndSearchInfo(syncedMessageCount=");
            sb2.append(this.f194605a);
            sb2.append(", foundTargetMessage=");
            return androidx.appcompat.app.r.x(sb2, this.f194606b, ')');
        }
    }

    void a();

    @Y61.k
    io.reactivex.rxjava3.core.I<Integer> b(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, int i12, @Y61.l Long l12, @Y61.l Integer num);

    @Y61.k
    AbstractC41768a c(@Y61.k ChatMessage chatMessage, @Y61.k MessengerUserHashInfo messengerUserHashInfo, boolean z12);

    @Y61.k
    C42019q d(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l Long l12, @Y61.l Integer num);
}
