package com.avito.android.messenger.conversation.mvi.voice;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: VoicePlayerContract.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/voice/r0;", "", "a", "b", "c", "Lcom/avito/android/messenger/conversation/mvi/voice/r0$a;", "Lcom/avito/android/messenger/conversation/mvi/voice/r0$b;", "Lcom/avito/android/messenger/conversation/mvi/voice/r0$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface r0 {

    /* compiled from: VoicePlayerContract.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/voice/r0$a;", "Lcom/avito/android/messenger/conversation/mvi/voice/r0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements r0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f195195a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final M f195196b;

        public a(@Y61.k String str, @Y61.l M m12) {
            this.f195195a = str;
            this.f195196b = m12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f195195a, aVar.f195195a) && kotlin.jvm.internal.L.f(this.f195196b, aVar.f195196b);
        }

        public final int hashCode() {
            int iHashCode = this.f195195a.hashCode() * 31;
            M m12 = this.f195196b;
            return iHashCode + (m12 == null ? 0 : m12.hashCode());
        }

        @Y61.k
        public final String toString() {
            return "Pause(voiceId=" + this.f195195a + ", timeLeft=" + this.f195196b + ')';
        }
    }

    /* compiled from: VoicePlayerContract.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/voice/r0$c;", "Lcom/avito/android/messenger/conversation/mvi/voice/r0;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements r0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f195202a = new c();
    }

    /* compiled from: VoicePlayerContract.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/voice/r0$b;", "Lcom/avito/android/messenger/conversation/mvi/voice/r0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements r0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f195197a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final M f195198b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f195199c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f195200d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final MessengerUserHashInfo f195201e;

        public b(@Y61.k String str, @Y61.l M m12, @Y61.l String str2, @Y61.l String str3, @Y61.l MessengerUserHashInfo messengerUserHashInfo) {
            this.f195197a = str;
            this.f195198b = m12;
            this.f195199c = str2;
            this.f195200d = str3;
            this.f195201e = messengerUserHashInfo;
        }

        public static b a(b bVar, M m12) {
            String str = bVar.f195197a;
            String str2 = bVar.f195199c;
            String str3 = bVar.f195200d;
            MessengerUserHashInfo messengerUserHashInfo = bVar.f195201e;
            bVar.getClass();
            return new b(str, m12, str2, str3, messengerUserHashInfo);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.L.f(this.f195197a, bVar.f195197a) && kotlin.jvm.internal.L.f(this.f195198b, bVar.f195198b) && kotlin.jvm.internal.L.f(this.f195199c, bVar.f195199c) && kotlin.jvm.internal.L.f(this.f195200d, bVar.f195200d) && kotlin.jvm.internal.L.f(this.f195201e, bVar.f195201e);
        }

        public final int hashCode() {
            int iHashCode = this.f195197a.hashCode() * 31;
            M m12 = this.f195198b;
            int iHashCode2 = (iHashCode + (m12 == null ? 0 : m12.hashCode())) * 31;
            String str = this.f195199c;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f195200d;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            MessengerUserHashInfo messengerUserHashInfo = this.f195201e;
            return iHashCode4 + (messengerUserHashInfo != null ? messengerUserHashInfo.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "Playing(voiceId=" + this.f195197a + ", timeLeft=" + this.f195198b + ", localId=" + this.f195199c + ", channelId=" + this.f195200d + ", userInfo=" + this.f195201e + ')';
        }

        public /* synthetic */ b(String str, M m12, String str2, String str3, MessengerUserHashInfo messengerUserHashInfo, int i12, C42822w c42822w) {
            this(str, m12, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : messengerUserHashInfo);
        }
    }
}
