package com.avito.android.messenger.conversation.mvi.sync;

import androidx.compose.runtime.C22026a;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: VoiceInfoSyncAgent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/W0;", "LS20/a;", "Lcom/avito/android/messenger/conversation/mvi/sync/W0$b;", "a", "b", "c", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface W0 extends S20.a<b> {

    /* compiled from: VoiceInfoSyncAgent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/W0$a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        static {
            new a();
        }
    }

    /* compiled from: VoiceInfoSyncAgent.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/W0$b;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final HashMap f194720a;

        public b(@Y61.k HashMap map) {
            this.f194720a = map;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f194720a.equals(((b) obj).f194720a);
        }

        public final int hashCode() {
            return this.f194720a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "State(voiceInfo=" + this.f194720a + ')';
        }
    }

    /* compiled from: VoiceInfoSyncAgent.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/W0$c;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final MessengerUserHashInfo f194721a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f194722b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f194723c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f194724d;

        public c(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
            this.f194721a = messengerUserHashInfo;
            this.f194722b = str;
            this.f194723c = str2;
            this.f194724d = str3;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.L.f(this.f194721a, cVar.f194721a) && kotlin.jvm.internal.L.f(this.f194722b, cVar.f194722b) && kotlin.jvm.internal.L.f(this.f194723c, cVar.f194723c) && kotlin.jvm.internal.L.f(this.f194724d, cVar.f194724d);
        }

        public final int hashCode() {
            return this.f194724d.hashCode() + androidx.compose.foundation.H.d(androidx.compose.foundation.H.d(this.f194721a.hashCode() * 31, 31, this.f194722b), 31, this.f194723c);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("VoiceLoadEntry(localUserInfo=");
            sb2.append(this.f194721a);
            sb2.append(", channelId=");
            sb2.append(this.f194722b);
            sb2.append(", localMessageId=");
            sb2.append(this.f194723c);
            sb2.append(", voiceId=");
            return C22026a.c(sb2, this.f194724d, ')');
        }
    }

    void k9(@Y61.k ArrayList arrayList);
}
