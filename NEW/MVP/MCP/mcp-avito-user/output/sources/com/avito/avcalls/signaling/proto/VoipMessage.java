package com.avito.avcalls.signaling.proto;

import X41.f;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.avcalls.rtc.connecting.IceCandidate;
import com.avito.avcalls.rtc.connecting.IceCandidate$$serializer;
import com.avito.avcalls.rtc.connecting.Sdp;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 \u00172\u00020\u0001:\u0004\u0018\u0017\u0019\u001aBe\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/avito/avcalls/signaling/proto/VoipMessage;", "", "", "seen1", "Lcom/avito/avcalls/signaling/proto/VoipMessage$MessageType;", "type", "Lcom/avito/avcalls/rtc/connecting/Sdp;", "sdp", "", "Lcom/avito/avcalls/rtc/connecting/IceCandidate;", "candidates", "Lcom/avito/avcalls/signaling/proto/VoipMessage$MediaSender;", "mediaSender", "", "reason", "", "fastConnect", "Lcom/avito/avcalls/signaling/proto/OptionsUpdate;", "optionsUpdate", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILcom/avito/avcalls/signaling/proto/VoipMessage$MessageType;Lcom/avito/avcalls/rtc/connecting/Sdp;Ljava/util/List;Lcom/avito/avcalls/signaling/proto/VoipMessage$MediaSender;Ljava/lang/String;ZLcom/avito/avcalls/signaling/proto/OptionsUpdate;Lkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "MediaSender", "MessageType", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* loaded from: classes5.dex */
public final /* data */ class VoipMessage {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: h, reason: collision with root package name */
    @f
    @k
    public static final KSerializer<Object>[] f333346h = {new I("com.avito.avcalls.signaling.proto.VoipMessage.MessageType", MessageType.values()), null, new C43401f(IceCandidate$$serializer.INSTANCE), null, null, null, null};

    /* renamed from: a, reason: collision with root package name */
    @k
    public final MessageType f333347a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Sdp f333348b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<IceCandidate> f333349c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final MediaSender f333350d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f333351e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f333352f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final OptionsUpdate f333353g;

    /* compiled from: VoipMessage.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/signaling/proto/VoipMessage$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/signaling/proto/VoipMessage;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\u000bB+\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/avito/avcalls/signaling/proto/VoipMessage$MediaSender;", "", "", "seen1", "", "sendingAudio", "sendingVideo", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(IZZLkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @w
    public static final /* data */ class MediaSender {

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        public final boolean f333354a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f333355b;

        /* compiled from: VoipMessage.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/signaling/proto/VoipMessage$MediaSender$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/signaling/proto/VoipMessage$MediaSender;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
            this.f333354a = z12;
            this.f333355b = z13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaSender)) {
                return false;
            }
            MediaSender mediaSender = (MediaSender) obj;
            return this.f333354a == mediaSender.f333354a && this.f333355b == mediaSender.f333355b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f333355b) + (Boolean.hashCode(this.f333354a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MediaSender(sendingAudio=");
            sb2.append(this.f333354a);
            sb2.append(", sendingVideo=");
            return r.x(sb2, this.f333355b, ')');
        }

        public MediaSender(boolean z12, boolean z13) {
            this.f333354a = z12;
            this.f333355b = z13;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VoipMessage.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/signaling/proto/VoipMessage$MessageType;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MessageType {

        /* renamed from: b, reason: collision with root package name */
        public static final MessageType f333356b;

        /* renamed from: c, reason: collision with root package name */
        public static final MessageType f333357c;

        /* renamed from: d, reason: collision with root package name */
        public static final MessageType f333358d;

        /* renamed from: e, reason: collision with root package name */
        public static final MessageType f333359e;

        /* renamed from: f, reason: collision with root package name */
        public static final MessageType f333360f;

        /* renamed from: g, reason: collision with root package name */
        public static final MessageType f333361g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ MessageType[] f333362h;

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f333363i;

        static {
            MessageType messageType = new MessageType("INVITE", 0);
            f333356b = messageType;
            MessageType messageType2 = new MessageType("RINGING", 1);
            f333357c = messageType2;
            MessageType messageType3 = new MessageType("ACCEPT", 2);
            f333358d = messageType3;
            MessageType messageType4 = new MessageType("SDP_UPDATE", 3);
            f333359e = messageType4;
            MessageType messageType5 = new MessageType("UPDATE", 4);
            f333360f = messageType5;
            MessageType messageType6 = new MessageType("BYE", 5);
            f333361g = messageType6;
            MessageType[] messageTypeArr = {messageType, messageType2, messageType3, messageType4, messageType5, messageType6};
            f333362h = messageTypeArr;
            f333363i = c.a(messageTypeArr);
        }

        public MessageType() {
            throw null;
        }

        public static MessageType valueOf(String str) {
            return (MessageType) Enum.valueOf(MessageType.class, str);
        }

        public static MessageType[] values() {
            return (MessageType[]) f333362h.clone();
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
        this.f333347a = messageType;
        if ((i12 & 2) == 0) {
            this.f333348b = null;
        } else {
            this.f333348b = sdp;
        }
        if ((i12 & 4) == 0) {
            this.f333349c = C42784z0.f406748b;
        } else {
            this.f333349c = list;
        }
        if ((i12 & 8) == 0) {
            this.f333350d = null;
        } else {
            this.f333350d = mediaSender;
        }
        if ((i12 & 16) == 0) {
            this.f333351e = "";
        } else {
            this.f333351e = str;
        }
        if ((i12 & 32) == 0) {
            this.f333352f = false;
        } else {
            this.f333352f = z12;
        }
        if ((i12 & 64) == 0) {
            this.f333353g = null;
        } else {
            this.f333353g = optionsUpdate;
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
        return this.f333347a == voipMessage.f333347a && L.f(this.f333348b, voipMessage.f333348b) && L.f(this.f333349c, voipMessage.f333349c) && L.f(this.f333350d, voipMessage.f333350d) && L.f(this.f333351e, voipMessage.f333351e) && this.f333352f == voipMessage.f333352f && L.f(this.f333353g, voipMessage.f333353g);
    }

    public final int hashCode() {
        int iHashCode = this.f333347a.hashCode() * 31;
        Sdp sdp = this.f333348b;
        int iE2 = H.e((iHashCode + (sdp == null ? 0 : sdp.hashCode())) * 31, 31, this.f333349c);
        MediaSender mediaSender = this.f333350d;
        int i12 = r.i(H.d((iE2 + (mediaSender == null ? 0 : mediaSender.hashCode())) * 31, 31, this.f333351e), 31, this.f333352f);
        OptionsUpdate optionsUpdate = this.f333353g;
        return i12 + (optionsUpdate != null ? optionsUpdate.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "VoipMessage(type=" + this.f333347a + ", sdp=" + this.f333348b + ", candidates=" + this.f333349c + ", mediaSender=" + this.f333350d + ", reason=" + this.f333351e + ", fastConnect=" + this.f333352f + ", optionsUpdate=" + this.f333353g + ')';
    }

    public VoipMessage(MessageType messageType, Sdp sdp, List list, MediaSender mediaSender, String str, boolean z12, OptionsUpdate optionsUpdate, int i12, C42822w c42822w) {
        sdp = (i12 & 2) != 0 ? null : sdp;
        list = (i12 & 4) != 0 ? C42784z0.f406748b : list;
        mediaSender = (i12 & 8) != 0 ? null : mediaSender;
        str = (i12 & 16) != 0 ? "" : str;
        z12 = (i12 & 32) != 0 ? false : z12;
        optionsUpdate = (i12 & 64) != 0 ? null : optionsUpdate;
        this.f333347a = messageType;
        this.f333348b = sdp;
        this.f333349c = list;
        this.f333350d = mediaSender;
        this.f333351e = str;
        this.f333352f = z12;
        this.f333353g = optionsUpdate;
    }
}
