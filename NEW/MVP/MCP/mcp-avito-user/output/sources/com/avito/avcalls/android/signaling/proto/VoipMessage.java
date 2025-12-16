package com.avito.avcalls.android.signaling.proto;

import X41.f;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.avcalls.android.rtc.IceCandidate;
import com.avito.avcalls.android.rtc.IceCandidate$$serializer;
import com.avito.avcalls.android.rtc.Sdp;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.C43401f;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.I;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.w;

/* compiled from: VoipMessage.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 \u00172\u00020\u0001:\u0004\u0018\u0017\u0019\u001aBe\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/avito/avcalls/android/signaling/proto/VoipMessage;", "", "", "seen1", "Lcom/avito/avcalls/android/signaling/proto/VoipMessage$MessageType;", "type", "Lcom/avito/avcalls/android/rtc/Sdp;", "sdp", "", "Lcom/avito/avcalls/android/rtc/IceCandidate;", "candidates", "Lcom/avito/avcalls/android/signaling/proto/VoipMessage$MediaSender;", "mediaSender", "", "reason", "", "fastConnect", "Lcom/avito/avcalls/android/signaling/proto/OptionsUpdate;", "optionsUpdate", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILcom/avito/avcalls/android/signaling/proto/VoipMessage$MessageType;Lcom/avito/avcalls/android/rtc/Sdp;Ljava/util/List;Lcom/avito/avcalls/android/signaling/proto/VoipMessage$MediaSender;Ljava/lang/String;ZLcom/avito/avcalls/android/signaling/proto/OptionsUpdate;Lkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "MediaSender", "MessageType", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* loaded from: classes5.dex */
public final /* data */ class VoipMessage {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: h, reason: collision with root package name */
    @f
    @k
    public static final KSerializer<Object>[] f332128h = {new I("com.avito.avcalls.android.signaling.proto.VoipMessage.MessageType", MessageType.values()), null, new C43401f(IceCandidate$$serializer.INSTANCE), null, null, null, null};

    /* renamed from: a, reason: collision with root package name */
    @k
    public final MessageType f332129a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Sdp f332130b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<IceCandidate> f332131c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final MediaSender f332132d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f332133e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f332134f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final OptionsUpdate f332135g;

    /* compiled from: VoipMessage.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/android/signaling/proto/VoipMessage$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/android/signaling/proto/VoipMessage;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final KSerializer<VoipMessage> serializer() {
            return VoipMessage$$serializer.INSTANCE;
        }

        public Companion() {
        }
    }

    /* compiled from: VoipMessage.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\u000bB+\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/avito/avcalls/android/signaling/proto/VoipMessage$MediaSender;", "", "", "seen1", "", "sendingAudio", "sendingVideo", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(IZZLkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @w
    public static final /* data */ class MediaSender {

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        public final boolean f332136a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f332137b;

        /* compiled from: VoipMessage.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/android/signaling/proto/VoipMessage$MediaSender$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/android/signaling/proto/VoipMessage$MediaSender;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @k
            public final KSerializer<MediaSender> serializer() {
                return VoipMessage$MediaSender$$serializer.INSTANCE;
            }

            public Companion() {
            }
        }

        @InterfaceC42830m
        public /* synthetic */ MediaSender(int i12, boolean z12, boolean z13, P0 p02) {
            if (3 != (i12 & 3)) {
                E0.b(i12, 3, VoipMessage$MediaSender$$serializer.INSTANCE.getF412706c());
                throw null;
            }
            this.f332136a = z12;
            this.f332137b = z13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaSender)) {
                return false;
            }
            MediaSender mediaSender = (MediaSender) obj;
            return this.f332136a == mediaSender.f332136a && this.f332137b == mediaSender.f332137b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f332137b) + (Boolean.hashCode(this.f332136a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MediaSender(sendingAudio=");
            sb2.append(this.f332136a);
            sb2.append(", sendingVideo=");
            return r.x(sb2, this.f332137b, ')');
        }

        public MediaSender(boolean z12, boolean z13) {
            this.f332136a = z12;
            this.f332137b = z13;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VoipMessage.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/signaling/proto/VoipMessage$MessageType;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MessageType {

        /* renamed from: b, reason: collision with root package name */
        public static final MessageType f332138b;

        /* renamed from: c, reason: collision with root package name */
        public static final MessageType f332139c;

        /* renamed from: d, reason: collision with root package name */
        public static final MessageType f332140d;

        /* renamed from: e, reason: collision with root package name */
        public static final MessageType f332141e;

        /* renamed from: f, reason: collision with root package name */
        public static final MessageType f332142f;

        /* renamed from: g, reason: collision with root package name */
        public static final MessageType f332143g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ MessageType[] f332144h;

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f332145i;

        static {
            MessageType messageType = new MessageType("INVITE", 0);
            f332138b = messageType;
            MessageType messageType2 = new MessageType("RINGING", 1);
            f332139c = messageType2;
            MessageType messageType3 = new MessageType("ACCEPT", 2);
            f332140d = messageType3;
            MessageType messageType4 = new MessageType("SDP_UPDATE", 3);
            f332141e = messageType4;
            MessageType messageType5 = new MessageType("UPDATE", 4);
            f332142f = messageType5;
            MessageType messageType6 = new MessageType("BYE", 5);
            f332143g = messageType6;
            MessageType[] messageTypeArr = {messageType, messageType2, messageType3, messageType4, messageType5, messageType6};
            f332144h = messageTypeArr;
            f332145i = c.a(messageTypeArr);
        }

        public MessageType() {
            throw null;
        }

        public static MessageType valueOf(String str) {
            return (MessageType) Enum.valueOf(MessageType.class, str);
        }

        public static MessageType[] values() {
            return (MessageType[]) f332144h.clone();
        }
    }

    public VoipMessage() {
        throw null;
    }

    @InterfaceC42830m
    public VoipMessage(int i12, MessageType messageType, Sdp sdp, List list, MediaSender mediaSender, String str, boolean z12, OptionsUpdate optionsUpdate, P0 p02) {
        if (1 != (i12 & 1)) {
            E0.b(i12, 1, VoipMessage$$serializer.INSTANCE.getF412706c());
            throw null;
        }
        this.f332129a = messageType;
        if ((i12 & 2) == 0) {
            this.f332130b = null;
        } else {
            this.f332130b = sdp;
        }
        if ((i12 & 4) == 0) {
            this.f332131c = C42784z0.f406748b;
        } else {
            this.f332131c = list;
        }
        if ((i12 & 8) == 0) {
            this.f332132d = null;
        } else {
            this.f332132d = mediaSender;
        }
        if ((i12 & 16) == 0) {
            this.f332133e = "";
        } else {
            this.f332133e = str;
        }
        if ((i12 & 32) == 0) {
            this.f332134f = false;
        } else {
            this.f332134f = z12;
        }
        if ((i12 & 64) == 0) {
            this.f332135g = null;
        } else {
            this.f332135g = optionsUpdate;
        }
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoipMessage)) {
            return false;
        }
        VoipMessage voipMessage = (VoipMessage) obj;
        return this.f332129a == voipMessage.f332129a && L.f(this.f332130b, voipMessage.f332130b) && L.f(this.f332131c, voipMessage.f332131c) && L.f(this.f332132d, voipMessage.f332132d) && L.f(this.f332133e, voipMessage.f332133e) && this.f332134f == voipMessage.f332134f && L.f(this.f332135g, voipMessage.f332135g);
    }

    public final int hashCode() {
        int iHashCode = this.f332129a.hashCode() * 31;
        Sdp sdp = this.f332130b;
        int iE2 = H.e((iHashCode + (sdp == null ? 0 : sdp.hashCode())) * 31, 31, this.f332131c);
        MediaSender mediaSender = this.f332132d;
        int i12 = r.i(H.d((iE2 + (mediaSender == null ? 0 : mediaSender.hashCode())) * 31, 31, this.f332133e), 31, this.f332134f);
        OptionsUpdate optionsUpdate = this.f332135g;
        return i12 + (optionsUpdate != null ? optionsUpdate.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "VoipMessage(type=" + this.f332129a + ", sdp=" + this.f332130b + ", candidates=" + this.f332131c + ", mediaSender=" + this.f332132d + ", reason=" + this.f332133e + ", fastConnect=" + this.f332134f + ", optionsUpdate=" + this.f332135g + ')';
    }

    public VoipMessage(MessageType messageType, Sdp sdp, List list, MediaSender mediaSender, String str, boolean z12, OptionsUpdate optionsUpdate, int i12, C42822w c42822w) {
        sdp = (i12 & 2) != 0 ? null : sdp;
        list = (i12 & 4) != 0 ? C42784z0.f406748b : list;
        mediaSender = (i12 & 8) != 0 ? null : mediaSender;
        str = (i12 & 16) != 0 ? "" : str;
        z12 = (i12 & 32) != 0 ? false : z12;
        optionsUpdate = (i12 & 64) != 0 ? null : optionsUpdate;
        this.f332129a = messageType;
        this.f332130b = sdp;
        this.f332131c = list;
        this.f332132d = mediaSender;
        this.f332133e = str;
        this.f332134f = z12;
        this.f332135g = optionsUpdate;
    }
}
