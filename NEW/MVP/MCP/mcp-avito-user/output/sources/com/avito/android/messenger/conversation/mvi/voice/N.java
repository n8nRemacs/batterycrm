package com.avito.android.messenger.conversation.mvi.voice;

import com.avito.android.persistence.messenger.Q1;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import kotlin.Metadata;

/* compiled from: VoicePlayerControl.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/voice/N;", "", "a", "b", "Lcom/avito/android/messenger/conversation/mvi/voice/N$a;", "Lcom/avito/android/messenger/conversation/mvi/voice/N$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface N {

    /* compiled from: VoicePlayerControl.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/voice/N$a;", "Lcom/avito/android/messenger/conversation/mvi/voice/N;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements N {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final LocalMessage f195081a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Q1 f195082b;

        public a(@Y61.k LocalMessage localMessage, @Y61.l Q1 q12) {
            this.f195081a = localMessage;
            this.f195082b = q12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f195081a, aVar.f195081a) && kotlin.jvm.internal.L.f(this.f195082b, aVar.f195082b);
        }

        @Override // com.avito.android.messenger.conversation.mvi.voice.N
        @Y61.k
        /* renamed from: getMessage, reason: from getter */
        public final LocalMessage getF195083a() {
            return this.f195081a;
        }

        public final int hashCode() {
            int iHashCode = this.f195081a.hashCode() * 31;
            Q1 q12 = this.f195082b;
            return iHashCode + (q12 == null ? 0 : q12.hashCode());
        }

        @Y61.k
        public final String toString() {
            return "PlayPause(message=" + this.f195081a + ", metaInfo=" + this.f195082b + ')';
        }
    }

    /* compiled from: VoicePlayerControl.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/voice/N$b;", "Lcom/avito/android/messenger/conversation/mvi/voice/N;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements N {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final LocalMessage f195083a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Q1 f195084b;

        /* renamed from: c, reason: collision with root package name */
        public final int f195085c;

        public b(@Y61.k LocalMessage localMessage, @Y61.l Q1 q12, int i12) {
            this.f195083a = localMessage;
            this.f195084b = q12;
            this.f195085c = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.L.f(this.f195083a, bVar.f195083a) && kotlin.jvm.internal.L.f(this.f195084b, bVar.f195084b) && this.f195085c == bVar.f195085c;
        }

        @Override // com.avito.android.messenger.conversation.mvi.voice.N
        @Y61.k
        /* renamed from: getMessage, reason: from getter */
        public final LocalMessage getF195083a() {
            return this.f195083a;
        }

        public final int hashCode() {
            int iHashCode = this.f195083a.hashCode() * 31;
            Q1 q12 = this.f195084b;
            return Integer.hashCode(this.f195085c) + ((iHashCode + (q12 == null ? 0 : q12.hashCode())) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SeekTo(message=");
            sb2.append(this.f195083a);
            sb2.append(", metaInfo=");
            sb2.append(this.f195084b);
            sb2.append(", progress=");
            return androidx.appcompat.app.r.t(sb2, this.f195085c, ')');
        }
    }

    @Y61.k
    /* renamed from: getMessage */
    LocalMessage getF195083a();
}
