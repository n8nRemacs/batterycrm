package com.avito.android.messenger.conversation.mvi.voice;

import com.avito.android.persistence.messenger.Q1;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import kotlin.Metadata;

/* compiled from: VoiceMessageClickInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/voice/A;", "LS20/a;", "Lcom/avito/android/messenger/conversation/mvi/voice/A$a;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface A extends S20.a<a> {

    /* compiled from: VoiceMessageClickInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/voice/A$a;", "", "a", "b", "Lcom/avito/android/messenger/conversation/mvi/voice/A$a$a;", "Lcom/avito/android/messenger/conversation/mvi/voice/A$a$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: VoiceMessageClickInteractor.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/voice/A$a$a;", "Lcom/avito/android/messenger/conversation/mvi/voice/A$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.voice.A$a$a, reason: collision with other inner class name */
        public static final /* data */ class C5762a implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final LocalMessage f195032a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final Q1 f195033b;

            public C5762a(@Y61.k LocalMessage localMessage, @Y61.l Q1 q12) {
                this.f195032a = localMessage;
                this.f195033b = q12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C5762a)) {
                    return false;
                }
                C5762a c5762a = (C5762a) obj;
                return kotlin.jvm.internal.L.f(this.f195032a, c5762a.f195032a) && kotlin.jvm.internal.L.f(this.f195033b, c5762a.f195033b);
            }

            public final int hashCode() {
                int iHashCode = this.f195032a.hashCode() * 31;
                Q1 q12 = this.f195033b;
                return iHashCode + (q12 == null ? 0 : q12.hashCode());
            }

            @Y61.k
            public final String toString() {
                return "Clicked(message=" + this.f195032a + ", metaInfo=" + this.f195033b + ')';
            }
        }

        /* compiled from: VoiceMessageClickInteractor.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/voice/A$a$b;", "Lcom/avito/android/messenger/conversation/mvi/voice/A$a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f195034a = new b();
        }
    }

    void J8(@Y61.k LocalMessage localMessage, @Y61.l Q1 q12, int i12);

    void Pb(@Y61.k LocalMessage localMessage, @Y61.l Q1 q12);

    void z6(@Y61.k LocalMessage localMessage, @Y61.l Q1 q12);
}
