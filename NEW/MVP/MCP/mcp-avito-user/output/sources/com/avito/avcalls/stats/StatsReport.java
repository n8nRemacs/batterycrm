package com.avito.avcalls.stats;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.w0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.w;

/* compiled from: StatsReport.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0081\b\u0018\u0000 \u00152\u00020\u0001:\u000e\u0016\u0017\u0015\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"Ba\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lcom/avito/avcalls/stats/StatsReport;", "", "", "seen1", "", "callDuration", "activeDuration", "Lcom/avito/avcalls/stats/StatsReport$TransportStats;", "transport", "Lcom/avito/avcalls/stats/StatsReport$OutboundRtpAudioStats;", "outboundRtpAudio", "Lcom/avito/avcalls/stats/StatsReport$InboundRtpAudioStats;", "inboundRtpAudio", "Lcom/avito/avcalls/stats/StatsReport$OutboundRtpVideoStats;", "outboundRtpVideo", "Lcom/avito/avcalls/stats/StatsReport$InboundRtpVideoStats;", "inboundRtpVideo", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Double;Ljava/lang/Double;Lcom/avito/avcalls/stats/StatsReport$TransportStats;Lcom/avito/avcalls/stats/StatsReport$OutboundRtpAudioStats;Lcom/avito/avcalls/stats/StatsReport$InboundRtpAudioStats;Lcom/avito/avcalls/stats/StatsReport$OutboundRtpVideoStats;Lcom/avito/avcalls/stats/StatsReport$InboundRtpVideoStats;Lkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "Codec", "IceCandidateStats", "InboundRtpAudioStats", "InboundRtpVideoStats", "OutboundRtpAudioSourceStats", "OutboundRtpAudioStats", "OutboundRtpVideoSourceStats", "OutboundRtpVideoStats", "RemoteInboundRtpStats", "RemoteOutboundRtpStats", "SelectedCandidatePairStats", "TransportStats", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* loaded from: classes5.dex */
public final /* data */ class StatsReport {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Double f333444a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Double f333445b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final TransportStats f333446c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final OutboundRtpAudioStats f333447d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final InboundRtpAudioStats f333448e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final OutboundRtpVideoStats f333449f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final InboundRtpVideoStats f333450g;

    /* compiled from: StatsReport.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0010B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBM\b\u0011\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/avito/avcalls/stats/StatsReport$Codec;", "", "", "type", "Lkotlin/w0;", "payloadType", "clockRate", "channels", "sdpFmtpLine", "<init>", "(Ljava/lang/String;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/String;Lkotlin/jvm/internal/w;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/String;Lkotlinx/serialization/internal/P0;Lkotlin/jvm/internal/w;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @w
    public static final /* data */ class Codec {

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f333451a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final w0 f333452b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final w0 f333453c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final w0 f333454d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f333455e;

        /* compiled from: StatsReport.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/stats/StatsReport$Codec$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/stats/StatsReport$Codec;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @k
            public final KSerializer<Codec> serializer() {
                return StatsReport$Codec$$serializer.INSTANCE;
            }

            public Companion() {
            }
        }

        @InterfaceC42830m
        public Codec(int i12, String str, w0 w0Var, w0 w0Var2, w0 w0Var3, String str2, P0 p02, C42822w c42822w) {
            if (31 != (i12 & 31)) {
                E0.b(i12, 31, StatsReport$Codec$$serializer.INSTANCE.getF412706c());
                throw null;
            }
            this.f333451a = str;
            this.f333452b = w0Var;
            this.f333453c = w0Var2;
            this.f333454d = w0Var3;
            this.f333455e = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Codec)) {
                return false;
            }
            Codec codec = (Codec) obj;
            return L.f(this.f333451a, codec.f333451a) && L.f(this.f333452b, codec.f333452b) && L.f(this.f333453c, codec.f333453c) && L.f(this.f333454d, codec.f333454d) && L.f(this.f333455e, codec.f333455e);
        }

        public final int hashCode() {
            String str = this.f333451a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            w0 w0Var = this.f333452b;
            int iHashCode2 = (iHashCode + (w0Var == null ? 0 : Long.hashCode(w0Var.f410663b))) * 31;
            w0 w0Var2 = this.f333453c;
            int iHashCode3 = (iHashCode2 + (w0Var2 == null ? 0 : Long.hashCode(w0Var2.f410663b))) * 31;
            w0 w0Var3 = this.f333454d;
            int iHashCode4 = (iHashCode3 + (w0Var3 == null ? 0 : Long.hashCode(w0Var3.f410663b))) * 31;
            String str2 = this.f333455e;
            return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Codec(type=");
            sb2.append(this.f333451a);
            sb2.append(", payloadType=");
            sb2.append(this.f333452b);
            sb2.append(", clockRate=");
            sb2.append(this.f333453c);
            sb2.append(", channels=");
            sb2.append(this.f333454d);
            sb2.append(", sdpFmtpLine=");
            return C22026a.c(sb2, this.f333455e, ')');
        }

        public Codec(String str, w0 w0Var, w0 w0Var2, w0 w0Var3, String str2, C42822w c42822w) {
            this.f333451a = str;
            this.f333452b = w0Var;
            this.f333453c = w0Var2;
            this.f333454d = w0Var3;
            this.f333455e = str2;
        }
    }

    /* compiled from: StatsReport.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/stats/StatsReport$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/stats/StatsReport;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final KSerializer<StatsReport> serializer() {
            return StatsReport$$serializer.INSTANCE;
        }

        public Companion() {
        }
    }

    /* compiled from: StatsReport.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0016B\u0093\u0001\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/avito/avcalls/stats/StatsReport$IceCandidateStats;", "", "", "seen1", "", "networkType", "networkAdapterType", "ip", AddressParameter.TYPE, "port", "relatedAddress", "relatedPort", "relayProtocol", "type", "protocol", "tcpType", "", "vpn", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @w
    public static final /* data */ class IceCandidateStats {

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f333456a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f333457b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f333458c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f333459d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Integer f333460e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f333461f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final Integer f333462g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final String f333463h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final String f333464i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final String f333465j;

        /* renamed from: k, reason: collision with root package name */
        @l
        public final String f333466k;

        /* renamed from: l, reason: collision with root package name */
        @l
        public final Boolean f333467l;

        /* compiled from: StatsReport.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/stats/StatsReport$IceCandidateStats$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/stats/StatsReport$IceCandidateStats;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @k
            public final KSerializer<IceCandidateStats> serializer() {
                return StatsReport$IceCandidateStats$$serializer.INSTANCE;
            }

            public Companion() {
            }
        }

        @InterfaceC42830m
        public /* synthetic */ IceCandidateStats(int i12, String str, String str2, String str3, String str4, Integer num, String str5, Integer num2, String str6, String str7, String str8, String str9, Boolean bool, P0 p02) {
            if (4095 != (i12 & 4095)) {
                E0.b(i12, 4095, StatsReport$IceCandidateStats$$serializer.INSTANCE.getF412706c());
                throw null;
            }
            this.f333456a = str;
            this.f333457b = str2;
            this.f333458c = str3;
            this.f333459d = str4;
            this.f333460e = num;
            this.f333461f = str5;
            this.f333462g = num2;
            this.f333463h = str6;
            this.f333464i = str7;
            this.f333465j = str8;
            this.f333466k = str9;
            this.f333467l = bool;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IceCandidateStats)) {
                return false;
            }
            IceCandidateStats iceCandidateStats = (IceCandidateStats) obj;
            return L.f(this.f333456a, iceCandidateStats.f333456a) && L.f(this.f333457b, iceCandidateStats.f333457b) && L.f(this.f333458c, iceCandidateStats.f333458c) && L.f(this.f333459d, iceCandidateStats.f333459d) && L.f(this.f333460e, iceCandidateStats.f333460e) && L.f(this.f333461f, iceCandidateStats.f333461f) && L.f(this.f333462g, iceCandidateStats.f333462g) && L.f(this.f333463h, iceCandidateStats.f333463h) && L.f(this.f333464i, iceCandidateStats.f333464i) && L.f(this.f333465j, iceCandidateStats.f333465j) && L.f(this.f333466k, iceCandidateStats.f333466k) && L.f(this.f333467l, iceCandidateStats.f333467l);
        }

        public final int hashCode() {
            String str = this.f333456a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f333457b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f333458c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f333459d;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Integer num = this.f333460e;
            int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
            String str5 = this.f333461f;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num2 = this.f333462g;
            int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str6 = this.f333463h;
            int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f333464i;
            int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.f333465j;
            int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.f333466k;
            int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
            Boolean bool = this.f333467l;
            return iHashCode11 + (bool != null ? bool.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("IceCandidateStats(networkType=");
            sb2.append(this.f333456a);
            sb2.append(", networkAdapterType=");
            sb2.append(this.f333457b);
            sb2.append(", ip=");
            sb2.append(this.f333458c);
            sb2.append(", address=");
            sb2.append(this.f333459d);
            sb2.append(", port=");
            sb2.append(this.f333460e);
            sb2.append(", relatedAddress=");
            sb2.append(this.f333461f);
            sb2.append(", relatedPort=");
            sb2.append(this.f333462g);
            sb2.append(", relayProtocol=");
            sb2.append(this.f333463h);
            sb2.append(", type=");
            sb2.append(this.f333464i);
            sb2.append(", protocol=");
            sb2.append(this.f333465j);
            sb2.append(", tcpType=");
            sb2.append(this.f333466k);
            sb2.append(", vpn=");
            return C0.g(sb2, this.f333467l, ')');
        }

        public IceCandidateStats(@l String str, @l String str2, @l String str3, @l String str4, @l Integer num, @l String str5, @l Integer num2, @l String str6, @l String str7, @l String str8, @l String str9, @l Boolean bool) {
            this.f333456a = str;
            this.f333457b = str2;
            this.f333458c = str3;
            this.f333459d = str4;
            this.f333460e = num;
            this.f333461f = str5;
            this.f333462g = num2;
            this.f333463h = str6;
            this.f333464i = str7;
            this.f333465j = str8;
            this.f333466k = str9;
            this.f333467l = bool;
        }
    }

    /* compiled from: StatsReport.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 32\u00020\u0001:\u000243Bï\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0013\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,B\u008b\u0003\b\u0011\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u0010/\u001a\u00020-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0013\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b+\u00102¨\u00065"}, d2 = {"Lcom/avito/avcalls/stats/StatsReport$InboundRtpAudioStats;", "", "Lcom/avito/avcalls/stats/StatsReport$Codec;", "codec", "Lkotlin/w0;", "ssrc", "packetsReceived", "", "packetsLost", "packetsDiscarded", "bytesReceived", "headerBytesReceived", "fecPacketsReceived", "fecPacketsDiscarded", "fecBytesReceived", "fecSsrc", "retransmittedPacketsReceived", "retransmittedBytesReceived", "rtxSsrc", "", "totalSamplesDuration", "totalSamplesReceived", "concealedSamples", "silentConcealedSamples", "removedSamplesForAcceleration", "insertedSamplesForDeceleration", "delayedPacketOutageSamples", "jitterBufferEmittedCount", "concealmentEvents", "totalAudioEnergy", "audioLevel", "jitter", "jitterBufferDelay", "jitterBufferTargetDelay", "jitterBufferMinimumDelay", "jitterBufferFlushes", "relativePacketArrivalDelay", "interruptionCount", "totalInterruptionDuration", "totalProcessingDelay", "nackCount", "Lcom/avito/avcalls/stats/StatsReport$RemoteOutboundRtpStats;", "remote", "<init>", "(Lcom/avito/avcalls/stats/StatsReport$Codec;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Long;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/w0;Ljava/lang/Double;Lkotlin/w0;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/w0;Lcom/avito/avcalls/stats/StatsReport$RemoteOutboundRtpStats;Lkotlin/jvm/internal/w;)V", "", "seen1", "seen2", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(IILcom/avito/avcalls/stats/StatsReport$Codec;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Long;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/w0;Ljava/lang/Double;Lkotlin/w0;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/w0;Lcom/avito/avcalls/stats/StatsReport$RemoteOutboundRtpStats;Lkotlinx/serialization/internal/P0;Lkotlin/jvm/internal/w;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @w
    public static final /* data */ class InboundRtpAudioStats {

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: A, reason: collision with root package name */
        @l
        public final Double f333468A;

        /* renamed from: B, reason: collision with root package name */
        @l
        public final Double f333469B;

        /* renamed from: C, reason: collision with root package name */
        @l
        public final Double f333470C;

        /* renamed from: D, reason: collision with root package name */
        @l
        public final w0 f333471D;

        /* renamed from: E, reason: collision with root package name */
        @l
        public final Double f333472E;

        /* renamed from: F, reason: collision with root package name */
        @l
        public final w0 f333473F;

        /* renamed from: G, reason: collision with root package name */
        @l
        public final Double f333474G;

        /* renamed from: H, reason: collision with root package name */
        @l
        public final Double f333475H;

        /* renamed from: I, reason: collision with root package name */
        @l
        public final w0 f333476I;

        /* renamed from: J, reason: collision with root package name */
        @l
        public final RemoteOutboundRtpStats f333477J;

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Codec f333478a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final w0 f333479b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final w0 f333480c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Long f333481d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final w0 f333482e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final w0 f333483f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final w0 f333484g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final w0 f333485h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final w0 f333486i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final w0 f333487j;

        /* renamed from: k, reason: collision with root package name */
        @l
        public final w0 f333488k;

        /* renamed from: l, reason: collision with root package name */
        @l
        public final w0 f333489l;

        /* renamed from: m, reason: collision with root package name */
        @l
        public final w0 f333490m;

        /* renamed from: n, reason: collision with root package name */
        @l
        public final w0 f333491n;

        /* renamed from: o, reason: collision with root package name */
        @l
        public final Double f333492o;

        /* renamed from: p, reason: collision with root package name */
        @l
        public final w0 f333493p;

        /* renamed from: q, reason: collision with root package name */
        @l
        public final w0 f333494q;

        /* renamed from: r, reason: collision with root package name */
        @l
        public final w0 f333495r;

        /* renamed from: s, reason: collision with root package name */
        @l
        public final w0 f333496s;

        /* renamed from: t, reason: collision with root package name */
        @l
        public final w0 f333497t;

        /* renamed from: u, reason: collision with root package name */
        @l
        public final w0 f333498u;

        /* renamed from: v, reason: collision with root package name */
        @l
        public final w0 f333499v;

        /* renamed from: w, reason: collision with root package name */
        @l
        public final w0 f333500w;

        /* renamed from: x, reason: collision with root package name */
        @l
        public final Double f333501x;

        /* renamed from: y, reason: collision with root package name */
        @l
        public final Double f333502y;

        /* renamed from: z, reason: collision with root package name */
        @l
        public final Double f333503z;

        /* compiled from: StatsReport.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/stats/StatsReport$InboundRtpAudioStats$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/stats/StatsReport$InboundRtpAudioStats;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @k
            public final KSerializer<InboundRtpAudioStats> serializer() {
                return StatsReport$InboundRtpAudioStats$$serializer.INSTANCE;
            }

            public Companion() {
            }
        }

        @InterfaceC42830m
        public InboundRtpAudioStats(int i12, int i13, Codec codec, w0 w0Var, w0 w0Var2, Long l12, w0 w0Var3, w0 w0Var4, w0 w0Var5, w0 w0Var6, w0 w0Var7, w0 w0Var8, w0 w0Var9, w0 w0Var10, w0 w0Var11, w0 w0Var12, Double d12, w0 w0Var13, w0 w0Var14, w0 w0Var15, w0 w0Var16, w0 w0Var17, w0 w0Var18, w0 w0Var19, w0 w0Var20, Double d13, Double d14, Double d15, Double d16, Double d17, Double d18, w0 w0Var21, Double d19, w0 w0Var22, Double d22, Double d23, w0 w0Var23, RemoteOutboundRtpStats remoteOutboundRtpStats, P0 p02, C42822w c42822w) {
            if ((15 != (i13 & 15)) || (-1 != i12)) {
                E0.a(new int[]{i12, i13}, new int[]{-1, 15}, StatsReport$InboundRtpAudioStats$$serializer.INSTANCE.getF412706c());
                throw null;
            }
            this.f333478a = codec;
            this.f333479b = w0Var;
            this.f333480c = w0Var2;
            this.f333481d = l12;
            this.f333482e = w0Var3;
            this.f333483f = w0Var4;
            this.f333484g = w0Var5;
            this.f333485h = w0Var6;
            this.f333486i = w0Var7;
            this.f333487j = w0Var8;
            this.f333488k = w0Var9;
            this.f333489l = w0Var10;
            this.f333490m = w0Var11;
            this.f333491n = w0Var12;
            this.f333492o = d12;
            this.f333493p = w0Var13;
            this.f333494q = w0Var14;
            this.f333495r = w0Var15;
            this.f333496s = w0Var16;
            this.f333497t = w0Var17;
            this.f333498u = w0Var18;
            this.f333499v = w0Var19;
            this.f333500w = w0Var20;
            this.f333501x = d13;
            this.f333502y = d14;
            this.f333503z = d15;
            this.f333468A = d16;
            this.f333469B = d17;
            this.f333470C = d18;
            this.f333471D = w0Var21;
            this.f333472E = d19;
            this.f333473F = w0Var22;
            this.f333474G = d22;
            this.f333475H = d23;
            this.f333476I = w0Var23;
            this.f333477J = remoteOutboundRtpStats;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InboundRtpAudioStats)) {
                return false;
            }
            InboundRtpAudioStats inboundRtpAudioStats = (InboundRtpAudioStats) obj;
            return L.f(this.f333478a, inboundRtpAudioStats.f333478a) && L.f(this.f333479b, inboundRtpAudioStats.f333479b) && L.f(this.f333480c, inboundRtpAudioStats.f333480c) && L.f(this.f333481d, inboundRtpAudioStats.f333481d) && L.f(this.f333482e, inboundRtpAudioStats.f333482e) && L.f(this.f333483f, inboundRtpAudioStats.f333483f) && L.f(this.f333484g, inboundRtpAudioStats.f333484g) && L.f(this.f333485h, inboundRtpAudioStats.f333485h) && L.f(this.f333486i, inboundRtpAudioStats.f333486i) && L.f(this.f333487j, inboundRtpAudioStats.f333487j) && L.f(this.f333488k, inboundRtpAudioStats.f333488k) && L.f(this.f333489l, inboundRtpAudioStats.f333489l) && L.f(this.f333490m, inboundRtpAudioStats.f333490m) && L.f(this.f333491n, inboundRtpAudioStats.f333491n) && L.f(this.f333492o, inboundRtpAudioStats.f333492o) && L.f(this.f333493p, inboundRtpAudioStats.f333493p) && L.f(this.f333494q, inboundRtpAudioStats.f333494q) && L.f(this.f333495r, inboundRtpAudioStats.f333495r) && L.f(this.f333496s, inboundRtpAudioStats.f333496s) && L.f(this.f333497t, inboundRtpAudioStats.f333497t) && L.f(this.f333498u, inboundRtpAudioStats.f333498u) && L.f(this.f333499v, inboundRtpAudioStats.f333499v) && L.f(this.f333500w, inboundRtpAudioStats.f333500w) && L.f(this.f333501x, inboundRtpAudioStats.f333501x) && L.f(this.f333502y, inboundRtpAudioStats.f333502y) && L.f(this.f333503z, inboundRtpAudioStats.f333503z) && L.f(this.f333468A, inboundRtpAudioStats.f333468A) && L.f(this.f333469B, inboundRtpAudioStats.f333469B) && L.f(this.f333470C, inboundRtpAudioStats.f333470C) && L.f(this.f333471D, inboundRtpAudioStats.f333471D) && L.f(this.f333472E, inboundRtpAudioStats.f333472E) && L.f(this.f333473F, inboundRtpAudioStats.f333473F) && L.f(this.f333474G, inboundRtpAudioStats.f333474G) && L.f(this.f333475H, inboundRtpAudioStats.f333475H) && L.f(this.f333476I, inboundRtpAudioStats.f333476I) && L.f(this.f333477J, inboundRtpAudioStats.f333477J);
        }

        public final int hashCode() {
            Codec codec = this.f333478a;
            int iHashCode = (codec == null ? 0 : codec.hashCode()) * 31;
            w0 w0Var = this.f333479b;
            int iHashCode2 = (iHashCode + (w0Var == null ? 0 : Long.hashCode(w0Var.f410663b))) * 31;
            w0 w0Var2 = this.f333480c;
            int iHashCode3 = (iHashCode2 + (w0Var2 == null ? 0 : Long.hashCode(w0Var2.f410663b))) * 31;
            Long l12 = this.f333481d;
            int iHashCode4 = (iHashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
            w0 w0Var3 = this.f333482e;
            int iHashCode5 = (iHashCode4 + (w0Var3 == null ? 0 : Long.hashCode(w0Var3.f410663b))) * 31;
            w0 w0Var4 = this.f333483f;
            int iHashCode6 = (iHashCode5 + (w0Var4 == null ? 0 : Long.hashCode(w0Var4.f410663b))) * 31;
            w0 w0Var5 = this.f333484g;
            int iHashCode7 = (iHashCode6 + (w0Var5 == null ? 0 : Long.hashCode(w0Var5.f410663b))) * 31;
            w0 w0Var6 = this.f333485h;
            int iHashCode8 = (iHashCode7 + (w0Var6 == null ? 0 : Long.hashCode(w0Var6.f410663b))) * 31;
            w0 w0Var7 = this.f333486i;
            int iHashCode9 = (iHashCode8 + (w0Var7 == null ? 0 : Long.hashCode(w0Var7.f410663b))) * 31;
            w0 w0Var8 = this.f333487j;
            int iHashCode10 = (iHashCode9 + (w0Var8 == null ? 0 : Long.hashCode(w0Var8.f410663b))) * 31;
            w0 w0Var9 = this.f333488k;
            int iHashCode11 = (iHashCode10 + (w0Var9 == null ? 0 : Long.hashCode(w0Var9.f410663b))) * 31;
            w0 w0Var10 = this.f333489l;
            int iHashCode12 = (iHashCode11 + (w0Var10 == null ? 0 : Long.hashCode(w0Var10.f410663b))) * 31;
            w0 w0Var11 = this.f333490m;
            int iHashCode13 = (iHashCode12 + (w0Var11 == null ? 0 : Long.hashCode(w0Var11.f410663b))) * 31;
            w0 w0Var12 = this.f333491n;
            int iHashCode14 = (iHashCode13 + (w0Var12 == null ? 0 : Long.hashCode(w0Var12.f410663b))) * 31;
            Double d12 = this.f333492o;
            int iHashCode15 = (iHashCode14 + (d12 == null ? 0 : d12.hashCode())) * 31;
            w0 w0Var13 = this.f333493p;
            int iHashCode16 = (iHashCode15 + (w0Var13 == null ? 0 : Long.hashCode(w0Var13.f410663b))) * 31;
            w0 w0Var14 = this.f333494q;
            int iHashCode17 = (iHashCode16 + (w0Var14 == null ? 0 : Long.hashCode(w0Var14.f410663b))) * 31;
            w0 w0Var15 = this.f333495r;
            int iHashCode18 = (iHashCode17 + (w0Var15 == null ? 0 : Long.hashCode(w0Var15.f410663b))) * 31;
            w0 w0Var16 = this.f333496s;
            int iHashCode19 = (iHashCode18 + (w0Var16 == null ? 0 : Long.hashCode(w0Var16.f410663b))) * 31;
            w0 w0Var17 = this.f333497t;
            int iHashCode20 = (iHashCode19 + (w0Var17 == null ? 0 : Long.hashCode(w0Var17.f410663b))) * 31;
            w0 w0Var18 = this.f333498u;
            int iHashCode21 = (iHashCode20 + (w0Var18 == null ? 0 : Long.hashCode(w0Var18.f410663b))) * 31;
            w0 w0Var19 = this.f333499v;
            int iHashCode22 = (iHashCode21 + (w0Var19 == null ? 0 : Long.hashCode(w0Var19.f410663b))) * 31;
            w0 w0Var20 = this.f333500w;
            int iHashCode23 = (iHashCode22 + (w0Var20 == null ? 0 : Long.hashCode(w0Var20.f410663b))) * 31;
            Double d13 = this.f333501x;
            int iHashCode24 = (iHashCode23 + (d13 == null ? 0 : d13.hashCode())) * 31;
            Double d14 = this.f333502y;
            int iHashCode25 = (iHashCode24 + (d14 == null ? 0 : d14.hashCode())) * 31;
            Double d15 = this.f333503z;
            int iHashCode26 = (iHashCode25 + (d15 == null ? 0 : d15.hashCode())) * 31;
            Double d16 = this.f333468A;
            int iHashCode27 = (iHashCode26 + (d16 == null ? 0 : d16.hashCode())) * 31;
            Double d17 = this.f333469B;
            int iHashCode28 = (iHashCode27 + (d17 == null ? 0 : d17.hashCode())) * 31;
            Double d18 = this.f333470C;
            int iHashCode29 = (iHashCode28 + (d18 == null ? 0 : d18.hashCode())) * 31;
            w0 w0Var21 = this.f333471D;
            int iHashCode30 = (iHashCode29 + (w0Var21 == null ? 0 : Long.hashCode(w0Var21.f410663b))) * 31;
            Double d19 = this.f333472E;
            int iHashCode31 = (iHashCode30 + (d19 == null ? 0 : d19.hashCode())) * 31;
            w0 w0Var22 = this.f333473F;
            int iHashCode32 = (iHashCode31 + (w0Var22 == null ? 0 : Long.hashCode(w0Var22.f410663b))) * 31;
            Double d22 = this.f333474G;
            int iHashCode33 = (iHashCode32 + (d22 == null ? 0 : d22.hashCode())) * 31;
            Double d23 = this.f333475H;
            int iHashCode34 = (iHashCode33 + (d23 == null ? 0 : d23.hashCode())) * 31;
            w0 w0Var23 = this.f333476I;
            int iHashCode35 = (iHashCode34 + (w0Var23 == null ? 0 : Long.hashCode(w0Var23.f410663b))) * 31;
            RemoteOutboundRtpStats remoteOutboundRtpStats = this.f333477J;
            return iHashCode35 + (remoteOutboundRtpStats != null ? remoteOutboundRtpStats.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "InboundRtpAudioStats(codec=" + this.f333478a + ", ssrc=" + this.f333479b + ", packetsReceived=" + this.f333480c + ", packetsLost=" + this.f333481d + ", packetsDiscarded=" + this.f333482e + ", bytesReceived=" + this.f333483f + ", headerBytesReceived=" + this.f333484g + ", fecPacketsReceived=" + this.f333485h + ", fecPacketsDiscarded=" + this.f333486i + ", fecBytesReceived=" + this.f333487j + ", fecSsrc=" + this.f333488k + ", retransmittedPacketsReceived=" + this.f333489l + ", retransmittedBytesReceived=" + this.f333490m + ", rtxSsrc=" + this.f333491n + ", totalSamplesDuration=" + this.f333492o + ", totalSamplesReceived=" + this.f333493p + ", concealedSamples=" + this.f333494q + ", silentConcealedSamples=" + this.f333495r + ", removedSamplesForAcceleration=" + this.f333496s + ", insertedSamplesForDeceleration=" + this.f333497t + ", delayedPacketOutageSamples=" + this.f333498u + ", jitterBufferEmittedCount=" + this.f333499v + ", concealmentEvents=" + this.f333500w + ", totalAudioEnergy=" + this.f333501x + ", audioLevel=" + this.f333502y + ", jitter=" + this.f333503z + ", jitterBufferDelay=" + this.f333468A + ", jitterBufferTargetDelay=" + this.f333469B + ", jitterBufferMinimumDelay=" + this.f333470C + ", jitterBufferFlushes=" + this.f333471D + ", relativePacketArrivalDelay=" + this.f333472E + ", interruptionCount=" + this.f333473F + ", totalInterruptionDuration=" + this.f333474G + ", totalProcessingDelay=" + this.f333475H + ", nackCount=" + this.f333476I + ", remote=" + this.f333477J + ')';
        }

        public InboundRtpAudioStats(Codec codec, w0 w0Var, w0 w0Var2, Long l12, w0 w0Var3, w0 w0Var4, w0 w0Var5, w0 w0Var6, w0 w0Var7, w0 w0Var8, w0 w0Var9, w0 w0Var10, w0 w0Var11, w0 w0Var12, Double d12, w0 w0Var13, w0 w0Var14, w0 w0Var15, w0 w0Var16, w0 w0Var17, w0 w0Var18, w0 w0Var19, w0 w0Var20, Double d13, Double d14, Double d15, Double d16, Double d17, Double d18, w0 w0Var21, Double d19, w0 w0Var22, Double d22, Double d23, w0 w0Var23, RemoteOutboundRtpStats remoteOutboundRtpStats, C42822w c42822w) {
            this.f333478a = codec;
            this.f333479b = w0Var;
            this.f333480c = w0Var2;
            this.f333481d = l12;
            this.f333482e = w0Var3;
            this.f333483f = w0Var4;
            this.f333484g = w0Var5;
            this.f333485h = w0Var6;
            this.f333486i = w0Var7;
            this.f333487j = w0Var8;
            this.f333488k = w0Var9;
            this.f333489l = w0Var10;
            this.f333490m = w0Var11;
            this.f333491n = w0Var12;
            this.f333492o = d12;
            this.f333493p = w0Var13;
            this.f333494q = w0Var14;
            this.f333495r = w0Var15;
            this.f333496s = w0Var16;
            this.f333497t = w0Var17;
            this.f333498u = w0Var18;
            this.f333499v = w0Var19;
            this.f333500w = w0Var20;
            this.f333501x = d13;
            this.f333502y = d14;
            this.f333503z = d15;
            this.f333468A = d16;
            this.f333469B = d17;
            this.f333470C = d18;
            this.f333471D = w0Var21;
            this.f333472E = d19;
            this.f333473F = w0Var22;
            this.f333474G = d22;
            this.f333475H = d23;
            this.f333476I = w0Var23;
            this.f333477J = remoteOutboundRtpStats;
        }
    }

    /* compiled from: StatsReport.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 <2\u00020\u0001:\u0002=<Bµ\u0003\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\b\u0012\b\u0010 \u001a\u0004\u0018\u00010\b\u0012\b\u0010!\u001a\u0004\u0018\u00010\b\u0012\b\u0010\"\u001a\u0004\u0018\u00010\b\u0012\b\u0010#\u001a\u0004\u0018\u00010\b\u0012\b\u0010$\u001a\u0004\u0018\u00010\b\u0012\b\u0010%\u001a\u0004\u0018\u00010\b\u0012\b\u0010&\u001a\u0004\u0018\u00010\b\u0012\b\u0010'\u001a\u0004\u0018\u00010\b\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0004\u0012\b\u00101\u001a\u0004\u0018\u000100\u0012\b\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b4\u00105BÑ\u0003\b\u0011\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u00108\u001a\u000206\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\b\u0012\b\u0010 \u001a\u0004\u0018\u00010\b\u0012\b\u0010!\u001a\u0004\u0018\u00010\b\u0012\b\u0010\"\u001a\u0004\u0018\u00010\b\u0012\b\u0010#\u001a\u0004\u0018\u00010\b\u0012\b\u0010$\u001a\u0004\u0018\u00010\b\u0012\b\u0010%\u001a\u0004\u0018\u00010\b\u0012\b\u0010&\u001a\u0004\u0018\u00010\b\u0012\b\u0010'\u001a\u0004\u0018\u00010\b\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0004\u0012\b\u00101\u001a\u0004\u0018\u000100\u0012\b\u00103\u001a\u0004\u0018\u000102\u0012\b\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b4\u0010;¨\u0006>"}, d2 = {"Lcom/avito/avcalls/stats/StatsReport$InboundRtpVideoStats;", "", "Lcom/avito/avcalls/stats/StatsReport$Codec;", "codec", "Lkotlin/w0;", "ssrc", "frameWidth", "frameHeight", "", "framesPerSecond", "framesReceived", "framesDecoded", "framesDropped", "framesRendered", "keyFramesDecoded", "pliCount", "firCount", "framesAssembledFromMultiplePackets", "nackCount", "packetsReceived", "", "packetsLost", "bytesReceived", "headerBytesReceived", "packetsDiscarded", "retransmittedPacketsReceived", "retransmittedBytesReceived", "rtxSsrc", "totalAssemblyTime", "pauseCount", "freezeCount", "jitter", "jitterBufferDelay", "minPlayoutDelay", "totalSquaredInterFrameDelay", "totalProcessingDelay", "totalDecodeTime", "totalInterFrameDelay", "totalPausesDuration", "totalFreezesDuration", "", "decoderImplementation", "qpSum", "jitterBufferEmittedCount", "fecPacketsReceived", "fecBytesReceived", "fecPacketsDiscarded", "fecSsrc", "", "powerEfficientDecoder", "Lcom/avito/avcalls/stats/StatsReport$RemoteOutboundRtpStats;", "remote", "<init>", "(Lcom/avito/avcalls/stats/StatsReport$Codec;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Long;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Boolean;Lcom/avito/avcalls/stats/StatsReport$RemoteOutboundRtpStats;Lkotlin/jvm/internal/w;)V", "", "seen1", "seen2", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(IILcom/avito/avcalls/stats/StatsReport$Codec;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Long;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Boolean;Lcom/avito/avcalls/stats/StatsReport$RemoteOutboundRtpStats;Lkotlinx/serialization/internal/P0;Lkotlin/jvm/internal/w;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @w
    public static final /* data */ class InboundRtpVideoStats {

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: A, reason: collision with root package name */
        @l
        public final Double f333504A;

        /* renamed from: B, reason: collision with root package name */
        @l
        public final Double f333505B;

        /* renamed from: C, reason: collision with root package name */
        @l
        public final Double f333506C;

        /* renamed from: D, reason: collision with root package name */
        @l
        public final Double f333507D;

        /* renamed from: E, reason: collision with root package name */
        @l
        public final Double f333508E;

        /* renamed from: F, reason: collision with root package name */
        @l
        public final Double f333509F;

        /* renamed from: G, reason: collision with root package name */
        @l
        public final Double f333510G;

        /* renamed from: H, reason: collision with root package name */
        @l
        public final Double f333511H;

        /* renamed from: I, reason: collision with root package name */
        @l
        public final String f333512I;

        /* renamed from: J, reason: collision with root package name */
        @l
        public final w0 f333513J;

        /* renamed from: K, reason: collision with root package name */
        @l
        public final w0 f333514K;

        /* renamed from: L, reason: collision with root package name */
        @l
        public final w0 f333515L;

        /* renamed from: M, reason: collision with root package name */
        @l
        public final w0 f333516M;

        /* renamed from: N, reason: collision with root package name */
        @l
        public final w0 f333517N;

        /* renamed from: O, reason: collision with root package name */
        @l
        public final w0 f333518O;

        /* renamed from: P, reason: collision with root package name */
        @l
        public final Boolean f333519P;

        /* renamed from: Q, reason: collision with root package name */
        @l
        public final RemoteOutboundRtpStats f333520Q;

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Codec f333521a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final w0 f333522b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final w0 f333523c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final w0 f333524d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Double f333525e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final w0 f333526f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final w0 f333527g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final w0 f333528h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final w0 f333529i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final w0 f333530j;

        /* renamed from: k, reason: collision with root package name */
        @l
        public final w0 f333531k;

        /* renamed from: l, reason: collision with root package name */
        @l
        public final w0 f333532l;

        /* renamed from: m, reason: collision with root package name */
        @l
        public final w0 f333533m;

        /* renamed from: n, reason: collision with root package name */
        @l
        public final w0 f333534n;

        /* renamed from: o, reason: collision with root package name */
        @l
        public final w0 f333535o;

        /* renamed from: p, reason: collision with root package name */
        @l
        public final Long f333536p;

        /* renamed from: q, reason: collision with root package name */
        @l
        public final w0 f333537q;

        /* renamed from: r, reason: collision with root package name */
        @l
        public final w0 f333538r;

        /* renamed from: s, reason: collision with root package name */
        @l
        public final w0 f333539s;

        /* renamed from: t, reason: collision with root package name */
        @l
        public final w0 f333540t;

        /* renamed from: u, reason: collision with root package name */
        @l
        public final w0 f333541u;

        /* renamed from: v, reason: collision with root package name */
        @l
        public final w0 f333542v;

        /* renamed from: w, reason: collision with root package name */
        @l
        public final Double f333543w;

        /* renamed from: x, reason: collision with root package name */
        @l
        public final w0 f333544x;

        /* renamed from: y, reason: collision with root package name */
        @l
        public final w0 f333545y;

        /* renamed from: z, reason: collision with root package name */
        @l
        public final Double f333546z;

        /* compiled from: StatsReport.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/stats/StatsReport$InboundRtpVideoStats$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/stats/StatsReport$InboundRtpVideoStats;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @k
            public final KSerializer<InboundRtpVideoStats> serializer() {
                return StatsReport$InboundRtpVideoStats$$serializer.INSTANCE;
            }

            public Companion() {
            }
        }

        @InterfaceC42830m
        public InboundRtpVideoStats(int i12, int i13, Codec codec, w0 w0Var, w0 w0Var2, w0 w0Var3, Double d12, w0 w0Var4, w0 w0Var5, w0 w0Var6, w0 w0Var7, w0 w0Var8, w0 w0Var9, w0 w0Var10, w0 w0Var11, w0 w0Var12, w0 w0Var13, Long l12, w0 w0Var14, w0 w0Var15, w0 w0Var16, w0 w0Var17, w0 w0Var18, w0 w0Var19, Double d13, w0 w0Var20, w0 w0Var21, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d22, Double d23, Double d24, String str, w0 w0Var22, w0 w0Var23, w0 w0Var24, w0 w0Var25, w0 w0Var26, w0 w0Var27, Boolean bool, RemoteOutboundRtpStats remoteOutboundRtpStats, P0 p02, C42822w c42822w) {
            if ((2047 != (i13 & 2047)) || (-1 != i12)) {
                E0.a(new int[]{i12, i13}, new int[]{-1, 2047}, StatsReport$InboundRtpVideoStats$$serializer.INSTANCE.getF412706c());
                throw null;
            }
            this.f333521a = codec;
            this.f333522b = w0Var;
            this.f333523c = w0Var2;
            this.f333524d = w0Var3;
            this.f333525e = d12;
            this.f333526f = w0Var4;
            this.f333527g = w0Var5;
            this.f333528h = w0Var6;
            this.f333529i = w0Var7;
            this.f333530j = w0Var8;
            this.f333531k = w0Var9;
            this.f333532l = w0Var10;
            this.f333533m = w0Var11;
            this.f333534n = w0Var12;
            this.f333535o = w0Var13;
            this.f333536p = l12;
            this.f333537q = w0Var14;
            this.f333538r = w0Var15;
            this.f333539s = w0Var16;
            this.f333540t = w0Var17;
            this.f333541u = w0Var18;
            this.f333542v = w0Var19;
            this.f333543w = d13;
            this.f333544x = w0Var20;
            this.f333545y = w0Var21;
            this.f333546z = d14;
            this.f333504A = d15;
            this.f333505B = d16;
            this.f333506C = d17;
            this.f333507D = d18;
            this.f333508E = d19;
            this.f333509F = d22;
            this.f333510G = d23;
            this.f333511H = d24;
            this.f333512I = str;
            this.f333513J = w0Var22;
            this.f333514K = w0Var23;
            this.f333515L = w0Var24;
            this.f333516M = w0Var25;
            this.f333517N = w0Var26;
            this.f333518O = w0Var27;
            this.f333519P = bool;
            this.f333520Q = remoteOutboundRtpStats;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InboundRtpVideoStats)) {
                return false;
            }
            InboundRtpVideoStats inboundRtpVideoStats = (InboundRtpVideoStats) obj;
            return L.f(this.f333521a, inboundRtpVideoStats.f333521a) && L.f(this.f333522b, inboundRtpVideoStats.f333522b) && L.f(this.f333523c, inboundRtpVideoStats.f333523c) && L.f(this.f333524d, inboundRtpVideoStats.f333524d) && L.f(this.f333525e, inboundRtpVideoStats.f333525e) && L.f(this.f333526f, inboundRtpVideoStats.f333526f) && L.f(this.f333527g, inboundRtpVideoStats.f333527g) && L.f(this.f333528h, inboundRtpVideoStats.f333528h) && L.f(this.f333529i, inboundRtpVideoStats.f333529i) && L.f(this.f333530j, inboundRtpVideoStats.f333530j) && L.f(this.f333531k, inboundRtpVideoStats.f333531k) && L.f(this.f333532l, inboundRtpVideoStats.f333532l) && L.f(this.f333533m, inboundRtpVideoStats.f333533m) && L.f(this.f333534n, inboundRtpVideoStats.f333534n) && L.f(this.f333535o, inboundRtpVideoStats.f333535o) && L.f(this.f333536p, inboundRtpVideoStats.f333536p) && L.f(this.f333537q, inboundRtpVideoStats.f333537q) && L.f(this.f333538r, inboundRtpVideoStats.f333538r) && L.f(this.f333539s, inboundRtpVideoStats.f333539s) && L.f(this.f333540t, inboundRtpVideoStats.f333540t) && L.f(this.f333541u, inboundRtpVideoStats.f333541u) && L.f(this.f333542v, inboundRtpVideoStats.f333542v) && L.f(this.f333543w, inboundRtpVideoStats.f333543w) && L.f(this.f333544x, inboundRtpVideoStats.f333544x) && L.f(this.f333545y, inboundRtpVideoStats.f333545y) && L.f(this.f333546z, inboundRtpVideoStats.f333546z) && L.f(this.f333504A, inboundRtpVideoStats.f333504A) && L.f(this.f333505B, inboundRtpVideoStats.f333505B) && L.f(this.f333506C, inboundRtpVideoStats.f333506C) && L.f(this.f333507D, inboundRtpVideoStats.f333507D) && L.f(this.f333508E, inboundRtpVideoStats.f333508E) && L.f(this.f333509F, inboundRtpVideoStats.f333509F) && L.f(this.f333510G, inboundRtpVideoStats.f333510G) && L.f(this.f333511H, inboundRtpVideoStats.f333511H) && L.f(this.f333512I, inboundRtpVideoStats.f333512I) && L.f(this.f333513J, inboundRtpVideoStats.f333513J) && L.f(this.f333514K, inboundRtpVideoStats.f333514K) && L.f(this.f333515L, inboundRtpVideoStats.f333515L) && L.f(this.f333516M, inboundRtpVideoStats.f333516M) && L.f(this.f333517N, inboundRtpVideoStats.f333517N) && L.f(this.f333518O, inboundRtpVideoStats.f333518O) && L.f(this.f333519P, inboundRtpVideoStats.f333519P) && L.f(this.f333520Q, inboundRtpVideoStats.f333520Q);
        }

        public final int hashCode() {
            Codec codec = this.f333521a;
            int iHashCode = (codec == null ? 0 : codec.hashCode()) * 31;
            w0 w0Var = this.f333522b;
            int iHashCode2 = (iHashCode + (w0Var == null ? 0 : Long.hashCode(w0Var.f410663b))) * 31;
            w0 w0Var2 = this.f333523c;
            int iHashCode3 = (iHashCode2 + (w0Var2 == null ? 0 : Long.hashCode(w0Var2.f410663b))) * 31;
            w0 w0Var3 = this.f333524d;
            int iHashCode4 = (iHashCode3 + (w0Var3 == null ? 0 : Long.hashCode(w0Var3.f410663b))) * 31;
            Double d12 = this.f333525e;
            int iHashCode5 = (iHashCode4 + (d12 == null ? 0 : d12.hashCode())) * 31;
            w0 w0Var4 = this.f333526f;
            int iHashCode6 = (iHashCode5 + (w0Var4 == null ? 0 : Long.hashCode(w0Var4.f410663b))) * 31;
            w0 w0Var5 = this.f333527g;
            int iHashCode7 = (iHashCode6 + (w0Var5 == null ? 0 : Long.hashCode(w0Var5.f410663b))) * 31;
            w0 w0Var6 = this.f333528h;
            int iHashCode8 = (iHashCode7 + (w0Var6 == null ? 0 : Long.hashCode(w0Var6.f410663b))) * 31;
            w0 w0Var7 = this.f333529i;
            int iHashCode9 = (iHashCode8 + (w0Var7 == null ? 0 : Long.hashCode(w0Var7.f410663b))) * 31;
            w0 w0Var8 = this.f333530j;
            int iHashCode10 = (iHashCode9 + (w0Var8 == null ? 0 : Long.hashCode(w0Var8.f410663b))) * 31;
            w0 w0Var9 = this.f333531k;
            int iHashCode11 = (iHashCode10 + (w0Var9 == null ? 0 : Long.hashCode(w0Var9.f410663b))) * 31;
            w0 w0Var10 = this.f333532l;
            int iHashCode12 = (iHashCode11 + (w0Var10 == null ? 0 : Long.hashCode(w0Var10.f410663b))) * 31;
            w0 w0Var11 = this.f333533m;
            int iHashCode13 = (iHashCode12 + (w0Var11 == null ? 0 : Long.hashCode(w0Var11.f410663b))) * 31;
            w0 w0Var12 = this.f333534n;
            int iHashCode14 = (iHashCode13 + (w0Var12 == null ? 0 : Long.hashCode(w0Var12.f410663b))) * 31;
            w0 w0Var13 = this.f333535o;
            int iHashCode15 = (iHashCode14 + (w0Var13 == null ? 0 : Long.hashCode(w0Var13.f410663b))) * 31;
            Long l12 = this.f333536p;
            int iHashCode16 = (iHashCode15 + (l12 == null ? 0 : l12.hashCode())) * 31;
            w0 w0Var14 = this.f333537q;
            int iHashCode17 = (iHashCode16 + (w0Var14 == null ? 0 : Long.hashCode(w0Var14.f410663b))) * 31;
            w0 w0Var15 = this.f333538r;
            int iHashCode18 = (iHashCode17 + (w0Var15 == null ? 0 : Long.hashCode(w0Var15.f410663b))) * 31;
            w0 w0Var16 = this.f333539s;
            int iHashCode19 = (iHashCode18 + (w0Var16 == null ? 0 : Long.hashCode(w0Var16.f410663b))) * 31;
            w0 w0Var17 = this.f333540t;
            int iHashCode20 = (iHashCode19 + (w0Var17 == null ? 0 : Long.hashCode(w0Var17.f410663b))) * 31;
            w0 w0Var18 = this.f333541u;
            int iHashCode21 = (iHashCode20 + (w0Var18 == null ? 0 : Long.hashCode(w0Var18.f410663b))) * 31;
            w0 w0Var19 = this.f333542v;
            int iHashCode22 = (iHashCode21 + (w0Var19 == null ? 0 : Long.hashCode(w0Var19.f410663b))) * 31;
            Double d13 = this.f333543w;
            int iHashCode23 = (iHashCode22 + (d13 == null ? 0 : d13.hashCode())) * 31;
            w0 w0Var20 = this.f333544x;
            int iHashCode24 = (iHashCode23 + (w0Var20 == null ? 0 : Long.hashCode(w0Var20.f410663b))) * 31;
            w0 w0Var21 = this.f333545y;
            int iHashCode25 = (iHashCode24 + (w0Var21 == null ? 0 : Long.hashCode(w0Var21.f410663b))) * 31;
            Double d14 = this.f333546z;
            int iHashCode26 = (iHashCode25 + (d14 == null ? 0 : d14.hashCode())) * 31;
            Double d15 = this.f333504A;
            int iHashCode27 = (iHashCode26 + (d15 == null ? 0 : d15.hashCode())) * 31;
            Double d16 = this.f333505B;
            int iHashCode28 = (iHashCode27 + (d16 == null ? 0 : d16.hashCode())) * 31;
            Double d17 = this.f333506C;
            int iHashCode29 = (iHashCode28 + (d17 == null ? 0 : d17.hashCode())) * 31;
            Double d18 = this.f333507D;
            int iHashCode30 = (iHashCode29 + (d18 == null ? 0 : d18.hashCode())) * 31;
            Double d19 = this.f333508E;
            int iHashCode31 = (iHashCode30 + (d19 == null ? 0 : d19.hashCode())) * 31;
            Double d22 = this.f333509F;
            int iHashCode32 = (iHashCode31 + (d22 == null ? 0 : d22.hashCode())) * 31;
            Double d23 = this.f333510G;
            int iHashCode33 = (iHashCode32 + (d23 == null ? 0 : d23.hashCode())) * 31;
            Double d24 = this.f333511H;
            int iHashCode34 = (iHashCode33 + (d24 == null ? 0 : d24.hashCode())) * 31;
            String str = this.f333512I;
            int iHashCode35 = (iHashCode34 + (str == null ? 0 : str.hashCode())) * 31;
            w0 w0Var22 = this.f333513J;
            int iHashCode36 = (iHashCode35 + (w0Var22 == null ? 0 : Long.hashCode(w0Var22.f410663b))) * 31;
            w0 w0Var23 = this.f333514K;
            int iHashCode37 = (iHashCode36 + (w0Var23 == null ? 0 : Long.hashCode(w0Var23.f410663b))) * 31;
            w0 w0Var24 = this.f333515L;
            int iHashCode38 = (iHashCode37 + (w0Var24 == null ? 0 : Long.hashCode(w0Var24.f410663b))) * 31;
            w0 w0Var25 = this.f333516M;
            int iHashCode39 = (iHashCode38 + (w0Var25 == null ? 0 : Long.hashCode(w0Var25.f410663b))) * 31;
            w0 w0Var26 = this.f333517N;
            int iHashCode40 = (iHashCode39 + (w0Var26 == null ? 0 : Long.hashCode(w0Var26.f410663b))) * 31;
            w0 w0Var27 = this.f333518O;
            int iHashCode41 = (iHashCode40 + (w0Var27 == null ? 0 : Long.hashCode(w0Var27.f410663b))) * 31;
            Boolean bool = this.f333519P;
            int iHashCode42 = (iHashCode41 + (bool == null ? 0 : bool.hashCode())) * 31;
            RemoteOutboundRtpStats remoteOutboundRtpStats = this.f333520Q;
            return iHashCode42 + (remoteOutboundRtpStats != null ? remoteOutboundRtpStats.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "InboundRtpVideoStats(codec=" + this.f333521a + ", ssrc=" + this.f333522b + ", frameWidth=" + this.f333523c + ", frameHeight=" + this.f333524d + ", framesPerSecond=" + this.f333525e + ", framesReceived=" + this.f333526f + ", framesDecoded=" + this.f333527g + ", framesDropped=" + this.f333528h + ", framesRendered=" + this.f333529i + ", keyFramesDecoded=" + this.f333530j + ", pliCount=" + this.f333531k + ", firCount=" + this.f333532l + ", framesAssembledFromMultiplePackets=" + this.f333533m + ", nackCount=" + this.f333534n + ", packetsReceived=" + this.f333535o + ", packetsLost=" + this.f333536p + ", bytesReceived=" + this.f333537q + ", headerBytesReceived=" + this.f333538r + ", packetsDiscarded=" + this.f333539s + ", retransmittedPacketsReceived=" + this.f333540t + ", retransmittedBytesReceived=" + this.f333541u + ", rtxSsrc=" + this.f333542v + ", totalAssemblyTime=" + this.f333543w + ", pauseCount=" + this.f333544x + ", freezeCount=" + this.f333545y + ", jitter=" + this.f333546z + ", jitterBufferDelay=" + this.f333504A + ", minPlayoutDelay=" + this.f333505B + ", totalSquaredInterFrameDelay=" + this.f333506C + ", totalProcessingDelay=" + this.f333507D + ", totalDecodeTime=" + this.f333508E + ", totalInterFrameDelay=" + this.f333509F + ", totalPausesDuration=" + this.f333510G + ", totalFreezesDuration=" + this.f333511H + ", decoderImplementation=" + this.f333512I + ", qpSum=" + this.f333513J + ", jitterBufferEmittedCount=" + this.f333514K + ", fecPacketsReceived=" + this.f333515L + ", fecBytesReceived=" + this.f333516M + ", fecPacketsDiscarded=" + this.f333517N + ", fecSsrc=" + this.f333518O + ", powerEfficientDecoder=" + this.f333519P + ", remote=" + this.f333520Q + ')';
        }

        public InboundRtpVideoStats(Codec codec, w0 w0Var, w0 w0Var2, w0 w0Var3, Double d12, w0 w0Var4, w0 w0Var5, w0 w0Var6, w0 w0Var7, w0 w0Var8, w0 w0Var9, w0 w0Var10, w0 w0Var11, w0 w0Var12, w0 w0Var13, Long l12, w0 w0Var14, w0 w0Var15, w0 w0Var16, w0 w0Var17, w0 w0Var18, w0 w0Var19, Double d13, w0 w0Var20, w0 w0Var21, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d22, Double d23, Double d24, String str, w0 w0Var22, w0 w0Var23, w0 w0Var24, w0 w0Var25, w0 w0Var26, w0 w0Var27, Boolean bool, RemoteOutboundRtpStats remoteOutboundRtpStats, C42822w c42822w) {
            this.f333521a = codec;
            this.f333522b = w0Var;
            this.f333523c = w0Var2;
            this.f333524d = w0Var3;
            this.f333525e = d12;
            this.f333526f = w0Var4;
            this.f333527g = w0Var5;
            this.f333528h = w0Var6;
            this.f333529i = w0Var7;
            this.f333530j = w0Var8;
            this.f333531k = w0Var9;
            this.f333532l = w0Var10;
            this.f333533m = w0Var11;
            this.f333534n = w0Var12;
            this.f333535o = w0Var13;
            this.f333536p = l12;
            this.f333537q = w0Var14;
            this.f333538r = w0Var15;
            this.f333539s = w0Var16;
            this.f333540t = w0Var17;
            this.f333541u = w0Var18;
            this.f333542v = w0Var19;
            this.f333543w = d13;
            this.f333544x = w0Var20;
            this.f333545y = w0Var21;
            this.f333546z = d14;
            this.f333504A = d15;
            this.f333505B = d16;
            this.f333506C = d17;
            this.f333507D = d18;
            this.f333508E = d19;
            this.f333509F = d22;
            this.f333510G = d23;
            this.f333511H = d24;
            this.f333512I = str;
            this.f333513J = w0Var22;
            this.f333514K = w0Var23;
            this.f333515L = w0Var24;
            this.f333516M = w0Var25;
            this.f333517N = w0Var26;
            this.f333518O = w0Var27;
            this.f333519P = bool;
            this.f333520Q = remoteOutboundRtpStats;
        }
    }

    /* compiled from: StatsReport.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u000eBM\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/avito/avcalls/stats/StatsReport$OutboundRtpAudioSourceStats;", "", "", "seen1", "", "audioLevel", "totalAudioEnergy", "totalSamplesDuration", "echoReturnLoss", "echoReturnLossEnhancement", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @w
    public static final /* data */ class OutboundRtpAudioSourceStats {

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Double f333547a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Double f333548b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Double f333549c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Double f333550d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Double f333551e;

        /* compiled from: StatsReport.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/stats/StatsReport$OutboundRtpAudioSourceStats$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/stats/StatsReport$OutboundRtpAudioSourceStats;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @k
            public final KSerializer<OutboundRtpAudioSourceStats> serializer() {
                return StatsReport$OutboundRtpAudioSourceStats$$serializer.INSTANCE;
            }

            public Companion() {
            }
        }

        @InterfaceC42830m
        public /* synthetic */ OutboundRtpAudioSourceStats(int i12, Double d12, Double d13, Double d14, Double d15, Double d16, P0 p02) {
            if (31 != (i12 & 31)) {
                E0.b(i12, 31, StatsReport$OutboundRtpAudioSourceStats$$serializer.INSTANCE.getF412706c());
                throw null;
            }
            this.f333547a = d12;
            this.f333548b = d13;
            this.f333549c = d14;
            this.f333550d = d15;
            this.f333551e = d16;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OutboundRtpAudioSourceStats)) {
                return false;
            }
            OutboundRtpAudioSourceStats outboundRtpAudioSourceStats = (OutboundRtpAudioSourceStats) obj;
            return L.f(this.f333547a, outboundRtpAudioSourceStats.f333547a) && L.f(this.f333548b, outboundRtpAudioSourceStats.f333548b) && L.f(this.f333549c, outboundRtpAudioSourceStats.f333549c) && L.f(this.f333550d, outboundRtpAudioSourceStats.f333550d) && L.f(this.f333551e, outboundRtpAudioSourceStats.f333551e);
        }

        public final int hashCode() {
            Double d12 = this.f333547a;
            int iHashCode = (d12 == null ? 0 : d12.hashCode()) * 31;
            Double d13 = this.f333548b;
            int iHashCode2 = (iHashCode + (d13 == null ? 0 : d13.hashCode())) * 31;
            Double d14 = this.f333549c;
            int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
            Double d15 = this.f333550d;
            int iHashCode4 = (iHashCode3 + (d15 == null ? 0 : d15.hashCode())) * 31;
            Double d16 = this.f333551e;
            return iHashCode4 + (d16 != null ? d16.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OutboundRtpAudioSourceStats(audioLevel=");
            sb2.append(this.f333547a);
            sb2.append(", totalAudioEnergy=");
            sb2.append(this.f333548b);
            sb2.append(", totalSamplesDuration=");
            sb2.append(this.f333549c);
            sb2.append(", echoReturnLoss=");
            sb2.append(this.f333550d);
            sb2.append(", echoReturnLossEnhancement=");
            return com.avito.android.authorization.auto_recovery.phone_confirm.b.h(sb2, this.f333551e, ')');
        }

        public OutboundRtpAudioSourceStats(@l Double d12, @l Double d13, @l Double d14, @l Double d15, @l Double d16) {
            this.f333547a = d12;
            this.f333548b = d13;
            this.f333549c = d14;
            this.f333550d = d15;
            this.f333551e = d16;
        }
    }

    /* compiled from: StatsReport.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001bB\u0089\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u009d\u0001\b\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/avito/avcalls/stats/StatsReport$OutboundRtpAudioStats;", "", "Lcom/avito/avcalls/stats/StatsReport$Codec;", "codec", "Lcom/avito/avcalls/stats/StatsReport$OutboundRtpAudioSourceStats;", SearchParamsConverterKt.SOURCE, "Lkotlin/w0;", "ssrc", "packetsSent", "rtxSsrc", "retransmittedPacketsSent", "bytesSent", "headerBytesSent", "retransmittedBytesSent", "", "targetBitrate", "nackCount", "totalPacketSendDelay", "Lcom/avito/avcalls/stats/StatsReport$RemoteInboundRtpStats;", "remote", "<init>", "(Lcom/avito/avcalls/stats/StatsReport$Codec;Lcom/avito/avcalls/stats/StatsReport$OutboundRtpAudioSourceStats;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Lkotlin/w0;Ljava/lang/Double;Lcom/avito/avcalls/stats/StatsReport$RemoteInboundRtpStats;Lkotlin/jvm/internal/w;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILcom/avito/avcalls/stats/StatsReport$Codec;Lcom/avito/avcalls/stats/StatsReport$OutboundRtpAudioSourceStats;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Lkotlin/w0;Ljava/lang/Double;Lcom/avito/avcalls/stats/StatsReport$RemoteInboundRtpStats;Lkotlinx/serialization/internal/P0;Lkotlin/jvm/internal/w;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @w
    public static final /* data */ class OutboundRtpAudioStats {

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Codec f333552a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final OutboundRtpAudioSourceStats f333553b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final w0 f333554c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final w0 f333555d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final w0 f333556e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final w0 f333557f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final w0 f333558g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final w0 f333559h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final w0 f333560i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final Double f333561j;

        /* renamed from: k, reason: collision with root package name */
        @l
        public final w0 f333562k;

        /* renamed from: l, reason: collision with root package name */
        @l
        public final Double f333563l;

        /* renamed from: m, reason: collision with root package name */
        @l
        public final RemoteInboundRtpStats f333564m;

        /* compiled from: StatsReport.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/stats/StatsReport$OutboundRtpAudioStats$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/stats/StatsReport$OutboundRtpAudioStats;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @k
            public final KSerializer<OutboundRtpAudioStats> serializer() {
                return StatsReport$OutboundRtpAudioStats$$serializer.INSTANCE;
            }

            public Companion() {
            }
        }

        @InterfaceC42830m
        public OutboundRtpAudioStats(int i12, Codec codec, OutboundRtpAudioSourceStats outboundRtpAudioSourceStats, w0 w0Var, w0 w0Var2, w0 w0Var3, w0 w0Var4, w0 w0Var5, w0 w0Var6, w0 w0Var7, Double d12, w0 w0Var8, Double d13, RemoteInboundRtpStats remoteInboundRtpStats, P0 p02, C42822w c42822w) {
            if (8191 != (i12 & 8191)) {
                E0.b(i12, 8191, StatsReport$OutboundRtpAudioStats$$serializer.INSTANCE.getF412706c());
                throw null;
            }
            this.f333552a = codec;
            this.f333553b = outboundRtpAudioSourceStats;
            this.f333554c = w0Var;
            this.f333555d = w0Var2;
            this.f333556e = w0Var3;
            this.f333557f = w0Var4;
            this.f333558g = w0Var5;
            this.f333559h = w0Var6;
            this.f333560i = w0Var7;
            this.f333561j = d12;
            this.f333562k = w0Var8;
            this.f333563l = d13;
            this.f333564m = remoteInboundRtpStats;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OutboundRtpAudioStats)) {
                return false;
            }
            OutboundRtpAudioStats outboundRtpAudioStats = (OutboundRtpAudioStats) obj;
            return L.f(this.f333552a, outboundRtpAudioStats.f333552a) && L.f(this.f333553b, outboundRtpAudioStats.f333553b) && L.f(this.f333554c, outboundRtpAudioStats.f333554c) && L.f(this.f333555d, outboundRtpAudioStats.f333555d) && L.f(this.f333556e, outboundRtpAudioStats.f333556e) && L.f(this.f333557f, outboundRtpAudioStats.f333557f) && L.f(this.f333558g, outboundRtpAudioStats.f333558g) && L.f(this.f333559h, outboundRtpAudioStats.f333559h) && L.f(this.f333560i, outboundRtpAudioStats.f333560i) && L.f(this.f333561j, outboundRtpAudioStats.f333561j) && L.f(this.f333562k, outboundRtpAudioStats.f333562k) && L.f(this.f333563l, outboundRtpAudioStats.f333563l) && L.f(this.f333564m, outboundRtpAudioStats.f333564m);
        }

        public final int hashCode() {
            Codec codec = this.f333552a;
            int iHashCode = (codec == null ? 0 : codec.hashCode()) * 31;
            OutboundRtpAudioSourceStats outboundRtpAudioSourceStats = this.f333553b;
            int iHashCode2 = (iHashCode + (outboundRtpAudioSourceStats == null ? 0 : outboundRtpAudioSourceStats.hashCode())) * 31;
            w0 w0Var = this.f333554c;
            int iHashCode3 = (iHashCode2 + (w0Var == null ? 0 : Long.hashCode(w0Var.f410663b))) * 31;
            w0 w0Var2 = this.f333555d;
            int iHashCode4 = (iHashCode3 + (w0Var2 == null ? 0 : Long.hashCode(w0Var2.f410663b))) * 31;
            w0 w0Var3 = this.f333556e;
            int iHashCode5 = (iHashCode4 + (w0Var3 == null ? 0 : Long.hashCode(w0Var3.f410663b))) * 31;
            w0 w0Var4 = this.f333557f;
            int iHashCode6 = (iHashCode5 + (w0Var4 == null ? 0 : Long.hashCode(w0Var4.f410663b))) * 31;
            w0 w0Var5 = this.f333558g;
            int iHashCode7 = (iHashCode6 + (w0Var5 == null ? 0 : Long.hashCode(w0Var5.f410663b))) * 31;
            w0 w0Var6 = this.f333559h;
            int iHashCode8 = (iHashCode7 + (w0Var6 == null ? 0 : Long.hashCode(w0Var6.f410663b))) * 31;
            w0 w0Var7 = this.f333560i;
            int iHashCode9 = (iHashCode8 + (w0Var7 == null ? 0 : Long.hashCode(w0Var7.f410663b))) * 31;
            Double d12 = this.f333561j;
            int iHashCode10 = (iHashCode9 + (d12 == null ? 0 : d12.hashCode())) * 31;
            w0 w0Var8 = this.f333562k;
            int iHashCode11 = (iHashCode10 + (w0Var8 == null ? 0 : Long.hashCode(w0Var8.f410663b))) * 31;
            Double d13 = this.f333563l;
            int iHashCode12 = (iHashCode11 + (d13 == null ? 0 : d13.hashCode())) * 31;
            RemoteInboundRtpStats remoteInboundRtpStats = this.f333564m;
            return iHashCode12 + (remoteInboundRtpStats != null ? remoteInboundRtpStats.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "OutboundRtpAudioStats(codec=" + this.f333552a + ", source=" + this.f333553b + ", ssrc=" + this.f333554c + ", packetsSent=" + this.f333555d + ", rtxSsrc=" + this.f333556e + ", retransmittedPacketsSent=" + this.f333557f + ", bytesSent=" + this.f333558g + ", headerBytesSent=" + this.f333559h + ", retransmittedBytesSent=" + this.f333560i + ", targetBitrate=" + this.f333561j + ", nackCount=" + this.f333562k + ", totalPacketSendDelay=" + this.f333563l + ", remote=" + this.f333564m + ')';
        }

        public OutboundRtpAudioStats(Codec codec, OutboundRtpAudioSourceStats outboundRtpAudioSourceStats, w0 w0Var, w0 w0Var2, w0 w0Var3, w0 w0Var4, w0 w0Var5, w0 w0Var6, w0 w0Var7, Double d12, w0 w0Var8, Double d13, RemoteInboundRtpStats remoteInboundRtpStats, C42822w c42822w) {
            this.f333552a = codec;
            this.f333553b = outboundRtpAudioSourceStats;
            this.f333554c = w0Var;
            this.f333555d = w0Var2;
            this.f333556e = w0Var3;
            this.f333557f = w0Var4;
            this.f333558g = w0Var5;
            this.f333559h = w0Var6;
            this.f333560i = w0Var7;
            this.f333561j = d12;
            this.f333562k = w0Var8;
            this.f333563l = d13;
            this.f333564m = remoteInboundRtpStats;
        }
    }

    /* compiled from: StatsReport.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u000fB/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/avito/avcalls/stats/StatsReport$OutboundRtpVideoSourceStats;", "", "Lkotlin/w0;", "width", "height", "", "framesPerSecond", "frames", "<init>", "(Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Lkotlin/w0;Lkotlin/jvm/internal/w;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Lkotlin/w0;Lkotlinx/serialization/internal/P0;Lkotlin/jvm/internal/w;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @w
    public static final /* data */ class OutboundRtpVideoSourceStats {

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        @l
        public final w0 f333565a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final w0 f333566b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Double f333567c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final w0 f333568d;

        /* compiled from: StatsReport.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/stats/StatsReport$OutboundRtpVideoSourceStats$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/stats/StatsReport$OutboundRtpVideoSourceStats;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @k
            public final KSerializer<OutboundRtpVideoSourceStats> serializer() {
                return StatsReport$OutboundRtpVideoSourceStats$$serializer.INSTANCE;
            }

            public Companion() {
            }
        }

        @InterfaceC42830m
        public OutboundRtpVideoSourceStats(int i12, w0 w0Var, w0 w0Var2, Double d12, w0 w0Var3, P0 p02, C42822w c42822w) {
            if (15 != (i12 & 15)) {
                E0.b(i12, 15, StatsReport$OutboundRtpVideoSourceStats$$serializer.INSTANCE.getF412706c());
                throw null;
            }
            this.f333565a = w0Var;
            this.f333566b = w0Var2;
            this.f333567c = d12;
            this.f333568d = w0Var3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OutboundRtpVideoSourceStats)) {
                return false;
            }
            OutboundRtpVideoSourceStats outboundRtpVideoSourceStats = (OutboundRtpVideoSourceStats) obj;
            return L.f(this.f333565a, outboundRtpVideoSourceStats.f333565a) && L.f(this.f333566b, outboundRtpVideoSourceStats.f333566b) && L.f(this.f333567c, outboundRtpVideoSourceStats.f333567c) && L.f(this.f333568d, outboundRtpVideoSourceStats.f333568d);
        }

        public final int hashCode() {
            w0 w0Var = this.f333565a;
            int iHashCode = (w0Var == null ? 0 : Long.hashCode(w0Var.f410663b)) * 31;
            w0 w0Var2 = this.f333566b;
            int iHashCode2 = (iHashCode + (w0Var2 == null ? 0 : Long.hashCode(w0Var2.f410663b))) * 31;
            Double d12 = this.f333567c;
            int iHashCode3 = (iHashCode2 + (d12 == null ? 0 : d12.hashCode())) * 31;
            w0 w0Var3 = this.f333568d;
            return iHashCode3 + (w0Var3 != null ? Long.hashCode(w0Var3.f410663b) : 0);
        }

        @k
        public final String toString() {
            return "OutboundRtpVideoSourceStats(width=" + this.f333565a + ", height=" + this.f333566b + ", framesPerSecond=" + this.f333567c + ", frames=" + this.f333568d + ')';
        }

        public OutboundRtpVideoSourceStats(w0 w0Var, w0 w0Var2, Double d12, w0 w0Var3, C42822w c42822w) {
            this.f333565a = w0Var;
            this.f333566b = w0Var2;
            this.f333567c = d12;
            this.f333568d = w0Var3;
        }
    }

    /* compiled from: StatsReport.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 /2\u00020\u0001:\u00020/B½\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010 \u001a\u0004\u0018\u00010\b\u0012\b\u0010!\u001a\u0004\u0018\u00010\b\u0012\b\u0010\"\u001a\u0004\u0018\u00010\r\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010%\u001a\u0004\u0018\u00010\b\u0012\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)BÑ\u0002\b\u0011\u0012\u0006\u0010+\u001a\u00020*\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010 \u001a\u0004\u0018\u00010\b\u0012\b\u0010!\u001a\u0004\u0018\u00010\b\u0012\b\u0010\"\u001a\u0004\u0018\u00010\r\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010%\u001a\u0004\u0018\u00010\b\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b(\u0010.¨\u00061"}, d2 = {"Lcom/avito/avcalls/stats/StatsReport$OutboundRtpVideoStats;", "", "Lcom/avito/avcalls/stats/StatsReport$OutboundRtpVideoSourceStats;", SearchParamsConverterKt.SOURCE, "Lcom/avito/avcalls/stats/StatsReport$Codec;", "codec", "Lkotlin/w0;", "ssrc", "", "rid", "framesSent", "frameWidth", "frameHeight", "", "framesPerSecond", "framesEncoded", "keyFramesEncoded", "pliCount", "firCount", "hugeFramesSent", "totalEncodeTime", "nackCount", "packetsSent", "bytesSent", "retransmittedPacketsSent", "retransmittedBytesSent", "rtxSsrc", "headerBytesSent", "targetBitrate", "totalEncodedBytesTarget", "qpSum", "qualityLimitationResolutionChanges", "qualityLimitationReason", "encoderImplementation", "totalPacketSendDelay", "", "powerEfficientEncoder", "scalabilityMode", "Lcom/avito/avcalls/stats/StatsReport$RemoteInboundRtpStats;", "remote", "<init>", "(Lcom/avito/avcalls/stats/StatsReport$OutboundRtpVideoSourceStats;Lcom/avito/avcalls/stats/StatsReport$Codec;Lkotlin/w0;Ljava/lang/String;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/avcalls/stats/StatsReport$RemoteInboundRtpStats;Lkotlin/jvm/internal/w;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILcom/avito/avcalls/stats/StatsReport$OutboundRtpVideoSourceStats;Lcom/avito/avcalls/stats/StatsReport$Codec;Lkotlin/w0;Ljava/lang/String;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/avcalls/stats/StatsReport$RemoteInboundRtpStats;Lkotlinx/serialization/internal/P0;Lkotlin/jvm/internal/w;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @w
    public static final /* data */ class OutboundRtpVideoStats {

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: A, reason: collision with root package name */
        @l
        public final String f333569A;

        /* renamed from: B, reason: collision with root package name */
        @l
        public final Double f333570B;

        /* renamed from: C, reason: collision with root package name */
        @l
        public final Boolean f333571C;

        /* renamed from: D, reason: collision with root package name */
        @l
        public final String f333572D;

        /* renamed from: E, reason: collision with root package name */
        @l
        public final RemoteInboundRtpStats f333573E;

        /* renamed from: a, reason: collision with root package name */
        @l
        public final OutboundRtpVideoSourceStats f333574a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Codec f333575b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final w0 f333576c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f333577d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final w0 f333578e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final w0 f333579f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final w0 f333580g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final Double f333581h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final w0 f333582i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final w0 f333583j;

        /* renamed from: k, reason: collision with root package name */
        @l
        public final w0 f333584k;

        /* renamed from: l, reason: collision with root package name */
        @l
        public final w0 f333585l;

        /* renamed from: m, reason: collision with root package name */
        @l
        public final w0 f333586m;

        /* renamed from: n, reason: collision with root package name */
        @l
        public final Double f333587n;

        /* renamed from: o, reason: collision with root package name */
        @l
        public final w0 f333588o;

        /* renamed from: p, reason: collision with root package name */
        @l
        public final w0 f333589p;

        /* renamed from: q, reason: collision with root package name */
        @l
        public final w0 f333590q;

        /* renamed from: r, reason: collision with root package name */
        @l
        public final w0 f333591r;

        /* renamed from: s, reason: collision with root package name */
        @l
        public final w0 f333592s;

        /* renamed from: t, reason: collision with root package name */
        @l
        public final w0 f333593t;

        /* renamed from: u, reason: collision with root package name */
        @l
        public final w0 f333594u;

        /* renamed from: v, reason: collision with root package name */
        @l
        public final Double f333595v;

        /* renamed from: w, reason: collision with root package name */
        @l
        public final w0 f333596w;

        /* renamed from: x, reason: collision with root package name */
        @l
        public final w0 f333597x;

        /* renamed from: y, reason: collision with root package name */
        @l
        public final w0 f333598y;

        /* renamed from: z, reason: collision with root package name */
        @l
        public final String f333599z;

        /* compiled from: StatsReport.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/stats/StatsReport$OutboundRtpVideoStats$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/stats/StatsReport$OutboundRtpVideoStats;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @k
            public final KSerializer<OutboundRtpVideoStats> serializer() {
                return StatsReport$OutboundRtpVideoStats$$serializer.INSTANCE;
            }

            public Companion() {
            }
        }

        @InterfaceC42830m
        public OutboundRtpVideoStats(int i12, OutboundRtpVideoSourceStats outboundRtpVideoSourceStats, Codec codec, w0 w0Var, String str, w0 w0Var2, w0 w0Var3, w0 w0Var4, Double d12, w0 w0Var5, w0 w0Var6, w0 w0Var7, w0 w0Var8, w0 w0Var9, Double d13, w0 w0Var10, w0 w0Var11, w0 w0Var12, w0 w0Var13, w0 w0Var14, w0 w0Var15, w0 w0Var16, Double d14, w0 w0Var17, w0 w0Var18, w0 w0Var19, String str2, String str3, Double d15, Boolean bool, String str4, RemoteInboundRtpStats remoteInboundRtpStats, P0 p02, C42822w c42822w) {
            if (Integer.MAX_VALUE != (i12 & Integer.MAX_VALUE)) {
                E0.b(i12, Integer.MAX_VALUE, StatsReport$OutboundRtpVideoStats$$serializer.INSTANCE.getF412706c());
                throw null;
            }
            this.f333574a = outboundRtpVideoSourceStats;
            this.f333575b = codec;
            this.f333576c = w0Var;
            this.f333577d = str;
            this.f333578e = w0Var2;
            this.f333579f = w0Var3;
            this.f333580g = w0Var4;
            this.f333581h = d12;
            this.f333582i = w0Var5;
            this.f333583j = w0Var6;
            this.f333584k = w0Var7;
            this.f333585l = w0Var8;
            this.f333586m = w0Var9;
            this.f333587n = d13;
            this.f333588o = w0Var10;
            this.f333589p = w0Var11;
            this.f333590q = w0Var12;
            this.f333591r = w0Var13;
            this.f333592s = w0Var14;
            this.f333593t = w0Var15;
            this.f333594u = w0Var16;
            this.f333595v = d14;
            this.f333596w = w0Var17;
            this.f333597x = w0Var18;
            this.f333598y = w0Var19;
            this.f333599z = str2;
            this.f333569A = str3;
            this.f333570B = d15;
            this.f333571C = bool;
            this.f333572D = str4;
            this.f333573E = remoteInboundRtpStats;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OutboundRtpVideoStats)) {
                return false;
            }
            OutboundRtpVideoStats outboundRtpVideoStats = (OutboundRtpVideoStats) obj;
            return L.f(this.f333574a, outboundRtpVideoStats.f333574a) && L.f(this.f333575b, outboundRtpVideoStats.f333575b) && L.f(this.f333576c, outboundRtpVideoStats.f333576c) && L.f(this.f333577d, outboundRtpVideoStats.f333577d) && L.f(this.f333578e, outboundRtpVideoStats.f333578e) && L.f(this.f333579f, outboundRtpVideoStats.f333579f) && L.f(this.f333580g, outboundRtpVideoStats.f333580g) && L.f(this.f333581h, outboundRtpVideoStats.f333581h) && L.f(this.f333582i, outboundRtpVideoStats.f333582i) && L.f(this.f333583j, outboundRtpVideoStats.f333583j) && L.f(this.f333584k, outboundRtpVideoStats.f333584k) && L.f(this.f333585l, outboundRtpVideoStats.f333585l) && L.f(this.f333586m, outboundRtpVideoStats.f333586m) && L.f(this.f333587n, outboundRtpVideoStats.f333587n) && L.f(this.f333588o, outboundRtpVideoStats.f333588o) && L.f(this.f333589p, outboundRtpVideoStats.f333589p) && L.f(this.f333590q, outboundRtpVideoStats.f333590q) && L.f(this.f333591r, outboundRtpVideoStats.f333591r) && L.f(this.f333592s, outboundRtpVideoStats.f333592s) && L.f(this.f333593t, outboundRtpVideoStats.f333593t) && L.f(this.f333594u, outboundRtpVideoStats.f333594u) && L.f(this.f333595v, outboundRtpVideoStats.f333595v) && L.f(this.f333596w, outboundRtpVideoStats.f333596w) && L.f(this.f333597x, outboundRtpVideoStats.f333597x) && L.f(this.f333598y, outboundRtpVideoStats.f333598y) && L.f(this.f333599z, outboundRtpVideoStats.f333599z) && L.f(this.f333569A, outboundRtpVideoStats.f333569A) && L.f(this.f333570B, outboundRtpVideoStats.f333570B) && L.f(this.f333571C, outboundRtpVideoStats.f333571C) && L.f(this.f333572D, outboundRtpVideoStats.f333572D) && L.f(this.f333573E, outboundRtpVideoStats.f333573E);
        }

        public final int hashCode() {
            OutboundRtpVideoSourceStats outboundRtpVideoSourceStats = this.f333574a;
            int iHashCode = (outboundRtpVideoSourceStats == null ? 0 : outboundRtpVideoSourceStats.hashCode()) * 31;
            Codec codec = this.f333575b;
            int iHashCode2 = (iHashCode + (codec == null ? 0 : codec.hashCode())) * 31;
            w0 w0Var = this.f333576c;
            int iHashCode3 = (iHashCode2 + (w0Var == null ? 0 : Long.hashCode(w0Var.f410663b))) * 31;
            String str = this.f333577d;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            w0 w0Var2 = this.f333578e;
            int iHashCode5 = (iHashCode4 + (w0Var2 == null ? 0 : Long.hashCode(w0Var2.f410663b))) * 31;
            w0 w0Var3 = this.f333579f;
            int iHashCode6 = (iHashCode5 + (w0Var3 == null ? 0 : Long.hashCode(w0Var3.f410663b))) * 31;
            w0 w0Var4 = this.f333580g;
            int iHashCode7 = (iHashCode6 + (w0Var4 == null ? 0 : Long.hashCode(w0Var4.f410663b))) * 31;
            Double d12 = this.f333581h;
            int iHashCode8 = (iHashCode7 + (d12 == null ? 0 : d12.hashCode())) * 31;
            w0 w0Var5 = this.f333582i;
            int iHashCode9 = (iHashCode8 + (w0Var5 == null ? 0 : Long.hashCode(w0Var5.f410663b))) * 31;
            w0 w0Var6 = this.f333583j;
            int iHashCode10 = (iHashCode9 + (w0Var6 == null ? 0 : Long.hashCode(w0Var6.f410663b))) * 31;
            w0 w0Var7 = this.f333584k;
            int iHashCode11 = (iHashCode10 + (w0Var7 == null ? 0 : Long.hashCode(w0Var7.f410663b))) * 31;
            w0 w0Var8 = this.f333585l;
            int iHashCode12 = (iHashCode11 + (w0Var8 == null ? 0 : Long.hashCode(w0Var8.f410663b))) * 31;
            w0 w0Var9 = this.f333586m;
            int iHashCode13 = (iHashCode12 + (w0Var9 == null ? 0 : Long.hashCode(w0Var9.f410663b))) * 31;
            Double d13 = this.f333587n;
            int iHashCode14 = (iHashCode13 + (d13 == null ? 0 : d13.hashCode())) * 31;
            w0 w0Var10 = this.f333588o;
            int iHashCode15 = (iHashCode14 + (w0Var10 == null ? 0 : Long.hashCode(w0Var10.f410663b))) * 31;
            w0 w0Var11 = this.f333589p;
            int iHashCode16 = (iHashCode15 + (w0Var11 == null ? 0 : Long.hashCode(w0Var11.f410663b))) * 31;
            w0 w0Var12 = this.f333590q;
            int iHashCode17 = (iHashCode16 + (w0Var12 == null ? 0 : Long.hashCode(w0Var12.f410663b))) * 31;
            w0 w0Var13 = this.f333591r;
            int iHashCode18 = (iHashCode17 + (w0Var13 == null ? 0 : Long.hashCode(w0Var13.f410663b))) * 31;
            w0 w0Var14 = this.f333592s;
            int iHashCode19 = (iHashCode18 + (w0Var14 == null ? 0 : Long.hashCode(w0Var14.f410663b))) * 31;
            w0 w0Var15 = this.f333593t;
            int iHashCode20 = (iHashCode19 + (w0Var15 == null ? 0 : Long.hashCode(w0Var15.f410663b))) * 31;
            w0 w0Var16 = this.f333594u;
            int iHashCode21 = (iHashCode20 + (w0Var16 == null ? 0 : Long.hashCode(w0Var16.f410663b))) * 31;
            Double d14 = this.f333595v;
            int iHashCode22 = (iHashCode21 + (d14 == null ? 0 : d14.hashCode())) * 31;
            w0 w0Var17 = this.f333596w;
            int iHashCode23 = (iHashCode22 + (w0Var17 == null ? 0 : Long.hashCode(w0Var17.f410663b))) * 31;
            w0 w0Var18 = this.f333597x;
            int iHashCode24 = (iHashCode23 + (w0Var18 == null ? 0 : Long.hashCode(w0Var18.f410663b))) * 31;
            w0 w0Var19 = this.f333598y;
            int iHashCode25 = (iHashCode24 + (w0Var19 == null ? 0 : Long.hashCode(w0Var19.f410663b))) * 31;
            String str2 = this.f333599z;
            int iHashCode26 = (iHashCode25 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f333569A;
            int iHashCode27 = (iHashCode26 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Double d15 = this.f333570B;
            int iHashCode28 = (iHashCode27 + (d15 == null ? 0 : d15.hashCode())) * 31;
            Boolean bool = this.f333571C;
            int iHashCode29 = (iHashCode28 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str4 = this.f333572D;
            int iHashCode30 = (iHashCode29 + (str4 == null ? 0 : str4.hashCode())) * 31;
            RemoteInboundRtpStats remoteInboundRtpStats = this.f333573E;
            return iHashCode30 + (remoteInboundRtpStats != null ? remoteInboundRtpStats.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "OutboundRtpVideoStats(source=" + this.f333574a + ", codec=" + this.f333575b + ", ssrc=" + this.f333576c + ", rid=" + this.f333577d + ", framesSent=" + this.f333578e + ", frameWidth=" + this.f333579f + ", frameHeight=" + this.f333580g + ", framesPerSecond=" + this.f333581h + ", framesEncoded=" + this.f333582i + ", keyFramesEncoded=" + this.f333583j + ", pliCount=" + this.f333584k + ", firCount=" + this.f333585l + ", hugeFramesSent=" + this.f333586m + ", totalEncodeTime=" + this.f333587n + ", nackCount=" + this.f333588o + ", packetsSent=" + this.f333589p + ", bytesSent=" + this.f333590q + ", retransmittedPacketsSent=" + this.f333591r + ", retransmittedBytesSent=" + this.f333592s + ", rtxSsrc=" + this.f333593t + ", headerBytesSent=" + this.f333594u + ", targetBitrate=" + this.f333595v + ", totalEncodedBytesTarget=" + this.f333596w + ", qpSum=" + this.f333597x + ", qualityLimitationResolutionChanges=" + this.f333598y + ", qualityLimitationReason=" + this.f333599z + ", encoderImplementation=" + this.f333569A + ", totalPacketSendDelay=" + this.f333570B + ", powerEfficientEncoder=" + this.f333571C + ", scalabilityMode=" + this.f333572D + ", remote=" + this.f333573E + ')';
        }

        public OutboundRtpVideoStats(OutboundRtpVideoSourceStats outboundRtpVideoSourceStats, Codec codec, w0 w0Var, String str, w0 w0Var2, w0 w0Var3, w0 w0Var4, Double d12, w0 w0Var5, w0 w0Var6, w0 w0Var7, w0 w0Var8, w0 w0Var9, Double d13, w0 w0Var10, w0 w0Var11, w0 w0Var12, w0 w0Var13, w0 w0Var14, w0 w0Var15, w0 w0Var16, Double d14, w0 w0Var17, w0 w0Var18, w0 w0Var19, String str2, String str3, Double d15, Boolean bool, String str4, RemoteInboundRtpStats remoteInboundRtpStats, C42822w c42822w) {
            this.f333574a = outboundRtpVideoSourceStats;
            this.f333575b = codec;
            this.f333576c = w0Var;
            this.f333577d = str;
            this.f333578e = w0Var2;
            this.f333579f = w0Var3;
            this.f333580g = w0Var4;
            this.f333581h = d12;
            this.f333582i = w0Var5;
            this.f333583j = w0Var6;
            this.f333584k = w0Var7;
            this.f333585l = w0Var8;
            this.f333586m = w0Var9;
            this.f333587n = d13;
            this.f333588o = w0Var10;
            this.f333589p = w0Var11;
            this.f333590q = w0Var12;
            this.f333591r = w0Var13;
            this.f333592s = w0Var14;
            this.f333593t = w0Var15;
            this.f333594u = w0Var16;
            this.f333595v = d14;
            this.f333596w = w0Var17;
            this.f333597x = w0Var18;
            this.f333598y = w0Var19;
            this.f333599z = str2;
            this.f333569A = str3;
            this.f333570B = d15;
            this.f333571C = bool;
            this.f333572D = str4;
            this.f333573E = remoteInboundRtpStats;
        }
    }

    /* compiled from: StatsReport.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0012BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBW\b\u0011\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/avito/avcalls/stats/StatsReport$RemoteInboundRtpStats;", "", "", "jitter", "", "packetsLost", "roundTripTime", "fractionLost", "totalRoundTripTime", "Lkotlin/w0;", "roundTripTimeMeasurements", "<init>", "(Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/w0;Lkotlin/jvm/internal/w;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/w0;Lkotlinx/serialization/internal/P0;Lkotlin/jvm/internal/w;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @w
    public static final /* data */ class RemoteInboundRtpStats {

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Double f333600a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Long f333601b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Double f333602c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Double f333603d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Double f333604e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final w0 f333605f;

        /* compiled from: StatsReport.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/stats/StatsReport$RemoteInboundRtpStats$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/stats/StatsReport$RemoteInboundRtpStats;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @k
            public final KSerializer<RemoteInboundRtpStats> serializer() {
                return StatsReport$RemoteInboundRtpStats$$serializer.INSTANCE;
            }

            public Companion() {
            }
        }

        @InterfaceC42830m
        public RemoteInboundRtpStats(int i12, Double d12, Long l12, Double d13, Double d14, Double d15, w0 w0Var, P0 p02, C42822w c42822w) {
            if (63 != (i12 & 63)) {
                E0.b(i12, 63, StatsReport$RemoteInboundRtpStats$$serializer.INSTANCE.getF412706c());
                throw null;
            }
            this.f333600a = d12;
            this.f333601b = l12;
            this.f333602c = d13;
            this.f333603d = d14;
            this.f333604e = d15;
            this.f333605f = w0Var;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoteInboundRtpStats)) {
                return false;
            }
            RemoteInboundRtpStats remoteInboundRtpStats = (RemoteInboundRtpStats) obj;
            return L.f(this.f333600a, remoteInboundRtpStats.f333600a) && L.f(this.f333601b, remoteInboundRtpStats.f333601b) && L.f(this.f333602c, remoteInboundRtpStats.f333602c) && L.f(this.f333603d, remoteInboundRtpStats.f333603d) && L.f(this.f333604e, remoteInboundRtpStats.f333604e) && L.f(this.f333605f, remoteInboundRtpStats.f333605f);
        }

        public final int hashCode() {
            Double d12 = this.f333600a;
            int iHashCode = (d12 == null ? 0 : d12.hashCode()) * 31;
            Long l12 = this.f333601b;
            int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
            Double d13 = this.f333602c;
            int iHashCode3 = (iHashCode2 + (d13 == null ? 0 : d13.hashCode())) * 31;
            Double d14 = this.f333603d;
            int iHashCode4 = (iHashCode3 + (d14 == null ? 0 : d14.hashCode())) * 31;
            Double d15 = this.f333604e;
            int iHashCode5 = (iHashCode4 + (d15 == null ? 0 : d15.hashCode())) * 31;
            w0 w0Var = this.f333605f;
            return iHashCode5 + (w0Var != null ? Long.hashCode(w0Var.f410663b) : 0);
        }

        @k
        public final String toString() {
            return "RemoteInboundRtpStats(jitter=" + this.f333600a + ", packetsLost=" + this.f333601b + ", roundTripTime=" + this.f333602c + ", fractionLost=" + this.f333603d + ", totalRoundTripTime=" + this.f333604e + ", roundTripTimeMeasurements=" + this.f333605f + ')';
        }

        public RemoteInboundRtpStats(Double d12, Long l12, Double d13, Double d14, Double d15, w0 w0Var, C42822w c42822w) {
            this.f333600a = d12;
            this.f333601b = l12;
            this.f333602c = d13;
            this.f333603d = d14;
            this.f333604e = d15;
            this.f333605f = w0Var;
        }
    }

    /* compiled from: StatsReport.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0011BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bBW\b\u0011\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/avito/avcalls/stats/StatsReport$RemoteOutboundRtpStats;", "", "Lkotlin/w0;", "packetsSent", "bytesSent", "reportsSent", "", "roundTripTime", "roundTripTimeMeasurements", "totalRoundTripTime", "<init>", "(Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Lkotlin/w0;Ljava/lang/Double;Lkotlin/jvm/internal/w;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Lkotlin/w0;Ljava/lang/Double;Lkotlinx/serialization/internal/P0;Lkotlin/jvm/internal/w;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @w
    public static final /* data */ class RemoteOutboundRtpStats {

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        @l
        public final w0 f333606a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final w0 f333607b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final w0 f333608c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Double f333609d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final w0 f333610e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final Double f333611f;

        /* compiled from: StatsReport.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/stats/StatsReport$RemoteOutboundRtpStats$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/stats/StatsReport$RemoteOutboundRtpStats;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @k
            public final KSerializer<RemoteOutboundRtpStats> serializer() {
                return StatsReport$RemoteOutboundRtpStats$$serializer.INSTANCE;
            }

            public Companion() {
            }
        }

        @InterfaceC42830m
        public RemoteOutboundRtpStats(int i12, w0 w0Var, w0 w0Var2, w0 w0Var3, Double d12, w0 w0Var4, Double d13, P0 p02, C42822w c42822w) {
            if (63 != (i12 & 63)) {
                E0.b(i12, 63, StatsReport$RemoteOutboundRtpStats$$serializer.INSTANCE.getF412706c());
                throw null;
            }
            this.f333606a = w0Var;
            this.f333607b = w0Var2;
            this.f333608c = w0Var3;
            this.f333609d = d12;
            this.f333610e = w0Var4;
            this.f333611f = d13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoteOutboundRtpStats)) {
                return false;
            }
            RemoteOutboundRtpStats remoteOutboundRtpStats = (RemoteOutboundRtpStats) obj;
            return L.f(this.f333606a, remoteOutboundRtpStats.f333606a) && L.f(this.f333607b, remoteOutboundRtpStats.f333607b) && L.f(this.f333608c, remoteOutboundRtpStats.f333608c) && L.f(this.f333609d, remoteOutboundRtpStats.f333609d) && L.f(this.f333610e, remoteOutboundRtpStats.f333610e) && L.f(this.f333611f, remoteOutboundRtpStats.f333611f);
        }

        public final int hashCode() {
            w0 w0Var = this.f333606a;
            int iHashCode = (w0Var == null ? 0 : Long.hashCode(w0Var.f410663b)) * 31;
            w0 w0Var2 = this.f333607b;
            int iHashCode2 = (iHashCode + (w0Var2 == null ? 0 : Long.hashCode(w0Var2.f410663b))) * 31;
            w0 w0Var3 = this.f333608c;
            int iHashCode3 = (iHashCode2 + (w0Var3 == null ? 0 : Long.hashCode(w0Var3.f410663b))) * 31;
            Double d12 = this.f333609d;
            int iHashCode4 = (iHashCode3 + (d12 == null ? 0 : d12.hashCode())) * 31;
            w0 w0Var4 = this.f333610e;
            int iHashCode5 = (iHashCode4 + (w0Var4 == null ? 0 : Long.hashCode(w0Var4.f410663b))) * 31;
            Double d13 = this.f333611f;
            return iHashCode5 + (d13 != null ? d13.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RemoteOutboundRtpStats(packetsSent=");
            sb2.append(this.f333606a);
            sb2.append(", bytesSent=");
            sb2.append(this.f333607b);
            sb2.append(", reportsSent=");
            sb2.append(this.f333608c);
            sb2.append(", roundTripTime=");
            sb2.append(this.f333609d);
            sb2.append(", roundTripTimeMeasurements=");
            sb2.append(this.f333610e);
            sb2.append(", totalRoundTripTime=");
            return com.avito.android.authorization.auto_recovery.phone_confirm.b.h(sb2, this.f333611f, ')');
        }

        public RemoteOutboundRtpStats(w0 w0Var, w0 w0Var2, w0 w0Var3, Double d12, w0 w0Var4, Double d13, C42822w c42822w) {
            this.f333606a = w0Var;
            this.f333607b = w0Var2;
            this.f333608c = w0Var3;
            this.f333609d = d12;
            this.f333610e = w0Var4;
            this.f333611f = d13;
        }
    }

    /* compiled from: StatsReport.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 !2\u00020\u0001:\u0002\"!BÅ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001a\u0010\u001bBÙ\u0001\b\u0011\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001a\u0010 ¨\u0006#"}, d2 = {"Lcom/avito/avcalls/stats/StatsReport$SelectedCandidatePairStats;", "", "Lcom/avito/avcalls/stats/StatsReport$IceCandidateStats;", "localCandidate", "remoteCandidate", "", VoiceInfo.STATE, "", "writable", "Lkotlin/w0;", "packetsSent", "packetsReceived", "bytesSent", "bytesReceived", "", "totalRoundTripTime", "currentRoundTripTime", "availableOutgoingBitrate", "availableIncomingBitrate", "requestsReceived", "requestsSent", "responsesReceived", "responsesSent", "consentRequestsSent", "packetsDiscardedOnSend", "bytesDiscardedOnSend", "<init>", "(Lcom/avito/avcalls/stats/StatsReport$IceCandidateStats;Lcom/avito/avcalls/stats/StatsReport$IceCandidateStats;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/jvm/internal/w;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILcom/avito/avcalls/stats/StatsReport$IceCandidateStats;Lcom/avito/avcalls/stats/StatsReport$IceCandidateStats;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlinx/serialization/internal/P0;Lkotlin/jvm/internal/w;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @w
    public static final /* data */ class SelectedCandidatePairStats {

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        @l
        public final IceCandidateStats f333612a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final IceCandidateStats f333613b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f333614c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Boolean f333615d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final w0 f333616e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final w0 f333617f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final w0 f333618g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final w0 f333619h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final Double f333620i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final Double f333621j;

        /* renamed from: k, reason: collision with root package name */
        @l
        public final Double f333622k;

        /* renamed from: l, reason: collision with root package name */
        @l
        public final Double f333623l;

        /* renamed from: m, reason: collision with root package name */
        @l
        public final w0 f333624m;

        /* renamed from: n, reason: collision with root package name */
        @l
        public final w0 f333625n;

        /* renamed from: o, reason: collision with root package name */
        @l
        public final w0 f333626o;

        /* renamed from: p, reason: collision with root package name */
        @l
        public final w0 f333627p;

        /* renamed from: q, reason: collision with root package name */
        @l
        public final w0 f333628q;

        /* renamed from: r, reason: collision with root package name */
        @l
        public final w0 f333629r;

        /* renamed from: s, reason: collision with root package name */
        @l
        public final w0 f333630s;

        /* compiled from: StatsReport.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/stats/StatsReport$SelectedCandidatePairStats$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/stats/StatsReport$SelectedCandidatePairStats;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @k
            public final KSerializer<SelectedCandidatePairStats> serializer() {
                return StatsReport$SelectedCandidatePairStats$$serializer.INSTANCE;
            }

            public Companion() {
            }
        }

        @InterfaceC42830m
        public SelectedCandidatePairStats(int i12, IceCandidateStats iceCandidateStats, IceCandidateStats iceCandidateStats2, String str, Boolean bool, w0 w0Var, w0 w0Var2, w0 w0Var3, w0 w0Var4, Double d12, Double d13, Double d14, Double d15, w0 w0Var5, w0 w0Var6, w0 w0Var7, w0 w0Var8, w0 w0Var9, w0 w0Var10, w0 w0Var11, P0 p02, C42822w c42822w) {
            if (524287 != (i12 & 524287)) {
                E0.b(i12, 524287, StatsReport$SelectedCandidatePairStats$$serializer.INSTANCE.getF412706c());
                throw null;
            }
            this.f333612a = iceCandidateStats;
            this.f333613b = iceCandidateStats2;
            this.f333614c = str;
            this.f333615d = bool;
            this.f333616e = w0Var;
            this.f333617f = w0Var2;
            this.f333618g = w0Var3;
            this.f333619h = w0Var4;
            this.f333620i = d12;
            this.f333621j = d13;
            this.f333622k = d14;
            this.f333623l = d15;
            this.f333624m = w0Var5;
            this.f333625n = w0Var6;
            this.f333626o = w0Var7;
            this.f333627p = w0Var8;
            this.f333628q = w0Var9;
            this.f333629r = w0Var10;
            this.f333630s = w0Var11;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectedCandidatePairStats)) {
                return false;
            }
            SelectedCandidatePairStats selectedCandidatePairStats = (SelectedCandidatePairStats) obj;
            return L.f(this.f333612a, selectedCandidatePairStats.f333612a) && L.f(this.f333613b, selectedCandidatePairStats.f333613b) && L.f(this.f333614c, selectedCandidatePairStats.f333614c) && L.f(this.f333615d, selectedCandidatePairStats.f333615d) && L.f(this.f333616e, selectedCandidatePairStats.f333616e) && L.f(this.f333617f, selectedCandidatePairStats.f333617f) && L.f(this.f333618g, selectedCandidatePairStats.f333618g) && L.f(this.f333619h, selectedCandidatePairStats.f333619h) && L.f(this.f333620i, selectedCandidatePairStats.f333620i) && L.f(this.f333621j, selectedCandidatePairStats.f333621j) && L.f(this.f333622k, selectedCandidatePairStats.f333622k) && L.f(this.f333623l, selectedCandidatePairStats.f333623l) && L.f(this.f333624m, selectedCandidatePairStats.f333624m) && L.f(this.f333625n, selectedCandidatePairStats.f333625n) && L.f(this.f333626o, selectedCandidatePairStats.f333626o) && L.f(this.f333627p, selectedCandidatePairStats.f333627p) && L.f(this.f333628q, selectedCandidatePairStats.f333628q) && L.f(this.f333629r, selectedCandidatePairStats.f333629r) && L.f(this.f333630s, selectedCandidatePairStats.f333630s);
        }

        public final int hashCode() {
            IceCandidateStats iceCandidateStats = this.f333612a;
            int iHashCode = (iceCandidateStats == null ? 0 : iceCandidateStats.hashCode()) * 31;
            IceCandidateStats iceCandidateStats2 = this.f333613b;
            int iHashCode2 = (iHashCode + (iceCandidateStats2 == null ? 0 : iceCandidateStats2.hashCode())) * 31;
            String str = this.f333614c;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.f333615d;
            int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            w0 w0Var = this.f333616e;
            int iHashCode5 = (iHashCode4 + (w0Var == null ? 0 : Long.hashCode(w0Var.f410663b))) * 31;
            w0 w0Var2 = this.f333617f;
            int iHashCode6 = (iHashCode5 + (w0Var2 == null ? 0 : Long.hashCode(w0Var2.f410663b))) * 31;
            w0 w0Var3 = this.f333618g;
            int iHashCode7 = (iHashCode6 + (w0Var3 == null ? 0 : Long.hashCode(w0Var3.f410663b))) * 31;
            w0 w0Var4 = this.f333619h;
            int iHashCode8 = (iHashCode7 + (w0Var4 == null ? 0 : Long.hashCode(w0Var4.f410663b))) * 31;
            Double d12 = this.f333620i;
            int iHashCode9 = (iHashCode8 + (d12 == null ? 0 : d12.hashCode())) * 31;
            Double d13 = this.f333621j;
            int iHashCode10 = (iHashCode9 + (d13 == null ? 0 : d13.hashCode())) * 31;
            Double d14 = this.f333622k;
            int iHashCode11 = (iHashCode10 + (d14 == null ? 0 : d14.hashCode())) * 31;
            Double d15 = this.f333623l;
            int iHashCode12 = (iHashCode11 + (d15 == null ? 0 : d15.hashCode())) * 31;
            w0 w0Var5 = this.f333624m;
            int iHashCode13 = (iHashCode12 + (w0Var5 == null ? 0 : Long.hashCode(w0Var5.f410663b))) * 31;
            w0 w0Var6 = this.f333625n;
            int iHashCode14 = (iHashCode13 + (w0Var6 == null ? 0 : Long.hashCode(w0Var6.f410663b))) * 31;
            w0 w0Var7 = this.f333626o;
            int iHashCode15 = (iHashCode14 + (w0Var7 == null ? 0 : Long.hashCode(w0Var7.f410663b))) * 31;
            w0 w0Var8 = this.f333627p;
            int iHashCode16 = (iHashCode15 + (w0Var8 == null ? 0 : Long.hashCode(w0Var8.f410663b))) * 31;
            w0 w0Var9 = this.f333628q;
            int iHashCode17 = (iHashCode16 + (w0Var9 == null ? 0 : Long.hashCode(w0Var9.f410663b))) * 31;
            w0 w0Var10 = this.f333629r;
            int iHashCode18 = (iHashCode17 + (w0Var10 == null ? 0 : Long.hashCode(w0Var10.f410663b))) * 31;
            w0 w0Var11 = this.f333630s;
            return iHashCode18 + (w0Var11 != null ? Long.hashCode(w0Var11.f410663b) : 0);
        }

        @k
        public final String toString() {
            return "SelectedCandidatePairStats(localCandidate=" + this.f333612a + ", remoteCandidate=" + this.f333613b + ", state=" + this.f333614c + ", writable=" + this.f333615d + ", packetsSent=" + this.f333616e + ", packetsReceived=" + this.f333617f + ", bytesSent=" + this.f333618g + ", bytesReceived=" + this.f333619h + ", totalRoundTripTime=" + this.f333620i + ", currentRoundTripTime=" + this.f333621j + ", availableOutgoingBitrate=" + this.f333622k + ", availableIncomingBitrate=" + this.f333623l + ", requestsReceived=" + this.f333624m + ", requestsSent=" + this.f333625n + ", responsesReceived=" + this.f333626o + ", responsesSent=" + this.f333627p + ", consentRequestsSent=" + this.f333628q + ", packetsDiscardedOnSend=" + this.f333629r + ", bytesDiscardedOnSend=" + this.f333630s + ')';
        }

        public SelectedCandidatePairStats(IceCandidateStats iceCandidateStats, IceCandidateStats iceCandidateStats2, String str, Boolean bool, w0 w0Var, w0 w0Var2, w0 w0Var3, w0 w0Var4, Double d12, Double d13, Double d14, Double d15, w0 w0Var5, w0 w0Var6, w0 w0Var7, w0 w0Var8, w0 w0Var9, w0 w0Var10, w0 w0Var11, C42822w c42822w) {
            this.f333612a = iceCandidateStats;
            this.f333613b = iceCandidateStats2;
            this.f333614c = str;
            this.f333615d = bool;
            this.f333616e = w0Var;
            this.f333617f = w0Var2;
            this.f333618g = w0Var3;
            this.f333619h = w0Var4;
            this.f333620i = d12;
            this.f333621j = d13;
            this.f333622k = d14;
            this.f333623l = d15;
            this.f333624m = w0Var5;
            this.f333625n = w0Var6;
            this.f333626o = w0Var7;
            this.f333627p = w0Var8;
            this.f333628q = w0Var9;
            this.f333629r = w0Var10;
            this.f333630s = w0Var11;
        }
    }

    /* compiled from: StatsReport.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0016Bk\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B\u007f\b\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/avito/avcalls/stats/StatsReport$TransportStats;", "", "Lkotlin/w0;", "bytesSent", "packetsSent", "bytesReceived", "packetsReceived", "selectedCandidatePairChanges", "", "dtlsState", "dtlsRole", "iceState", "iceRole", "Lcom/avito/avcalls/stats/StatsReport$SelectedCandidatePairStats;", "selectedCandidatePair", "<init>", "(Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/avcalls/stats/StatsReport$SelectedCandidatePairStats;Lkotlin/jvm/internal/w;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/avcalls/stats/StatsReport$SelectedCandidatePairStats;Lkotlinx/serialization/internal/P0;Lkotlin/jvm/internal/w;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @w
    public static final /* data */ class TransportStats {

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        @l
        public final w0 f333631a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final w0 f333632b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final w0 f333633c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final w0 f333634d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final w0 f333635e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f333636f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final String f333637g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final String f333638h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final String f333639i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final SelectedCandidatePairStats f333640j;

        /* compiled from: StatsReport.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/stats/StatsReport$TransportStats$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/stats/StatsReport$TransportStats;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @k
            public final KSerializer<TransportStats> serializer() {
                return StatsReport$TransportStats$$serializer.INSTANCE;
            }

            public Companion() {
            }
        }

        @InterfaceC42830m
        public TransportStats(int i12, w0 w0Var, w0 w0Var2, w0 w0Var3, w0 w0Var4, w0 w0Var5, String str, String str2, String str3, String str4, SelectedCandidatePairStats selectedCandidatePairStats, P0 p02, C42822w c42822w) {
            if (1023 != (i12 & 1023)) {
                E0.b(i12, 1023, StatsReport$TransportStats$$serializer.INSTANCE.getF412706c());
                throw null;
            }
            this.f333631a = w0Var;
            this.f333632b = w0Var2;
            this.f333633c = w0Var3;
            this.f333634d = w0Var4;
            this.f333635e = w0Var5;
            this.f333636f = str;
            this.f333637g = str2;
            this.f333638h = str3;
            this.f333639i = str4;
            this.f333640j = selectedCandidatePairStats;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TransportStats)) {
                return false;
            }
            TransportStats transportStats = (TransportStats) obj;
            return L.f(this.f333631a, transportStats.f333631a) && L.f(this.f333632b, transportStats.f333632b) && L.f(this.f333633c, transportStats.f333633c) && L.f(this.f333634d, transportStats.f333634d) && L.f(this.f333635e, transportStats.f333635e) && L.f(this.f333636f, transportStats.f333636f) && L.f(this.f333637g, transportStats.f333637g) && L.f(this.f333638h, transportStats.f333638h) && L.f(this.f333639i, transportStats.f333639i) && L.f(this.f333640j, transportStats.f333640j);
        }

        public final int hashCode() {
            w0 w0Var = this.f333631a;
            int iHashCode = (w0Var == null ? 0 : Long.hashCode(w0Var.f410663b)) * 31;
            w0 w0Var2 = this.f333632b;
            int iHashCode2 = (iHashCode + (w0Var2 == null ? 0 : Long.hashCode(w0Var2.f410663b))) * 31;
            w0 w0Var3 = this.f333633c;
            int iHashCode3 = (iHashCode2 + (w0Var3 == null ? 0 : Long.hashCode(w0Var3.f410663b))) * 31;
            w0 w0Var4 = this.f333634d;
            int iHashCode4 = (iHashCode3 + (w0Var4 == null ? 0 : Long.hashCode(w0Var4.f410663b))) * 31;
            w0 w0Var5 = this.f333635e;
            int iHashCode5 = (iHashCode4 + (w0Var5 == null ? 0 : Long.hashCode(w0Var5.f410663b))) * 31;
            String str = this.f333636f;
            int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f333637g;
            int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f333638h;
            int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f333639i;
            int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
            SelectedCandidatePairStats selectedCandidatePairStats = this.f333640j;
            return iHashCode9 + (selectedCandidatePairStats != null ? selectedCandidatePairStats.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "TransportStats(bytesSent=" + this.f333631a + ", packetsSent=" + this.f333632b + ", bytesReceived=" + this.f333633c + ", packetsReceived=" + this.f333634d + ", selectedCandidatePairChanges=" + this.f333635e + ", dtlsState=" + this.f333636f + ", dtlsRole=" + this.f333637g + ", iceState=" + this.f333638h + ", iceRole=" + this.f333639i + ", selectedCandidatePair=" + this.f333640j + ')';
        }

        public TransportStats(w0 w0Var, w0 w0Var2, w0 w0Var3, w0 w0Var4, w0 w0Var5, String str, String str2, String str3, String str4, SelectedCandidatePairStats selectedCandidatePairStats, C42822w c42822w) {
            this.f333631a = w0Var;
            this.f333632b = w0Var2;
            this.f333633c = w0Var3;
            this.f333634d = w0Var4;
            this.f333635e = w0Var5;
            this.f333636f = str;
            this.f333637g = str2;
            this.f333638h = str3;
            this.f333639i = str4;
            this.f333640j = selectedCandidatePairStats;
        }
    }

    @InterfaceC42830m
    public /* synthetic */ StatsReport(int i12, Double d12, Double d13, TransportStats transportStats, OutboundRtpAudioStats outboundRtpAudioStats, InboundRtpAudioStats inboundRtpAudioStats, OutboundRtpVideoStats outboundRtpVideoStats, InboundRtpVideoStats inboundRtpVideoStats, P0 p02) {
        if (127 != (i12 & 127)) {
            E0.b(i12, 127, StatsReport$$serializer.INSTANCE.getF412706c());
            throw null;
        }
        this.f333444a = d12;
        this.f333445b = d13;
        this.f333446c = transportStats;
        this.f333447d = outboundRtpAudioStats;
        this.f333448e = inboundRtpAudioStats;
        this.f333449f = outboundRtpVideoStats;
        this.f333450g = inboundRtpVideoStats;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsReport)) {
            return false;
        }
        StatsReport statsReport = (StatsReport) obj;
        return L.f(this.f333444a, statsReport.f333444a) && L.f(this.f333445b, statsReport.f333445b) && L.f(this.f333446c, statsReport.f333446c) && L.f(this.f333447d, statsReport.f333447d) && L.f(this.f333448e, statsReport.f333448e) && L.f(this.f333449f, statsReport.f333449f) && L.f(this.f333450g, statsReport.f333450g);
    }

    public final int hashCode() {
        Double d12 = this.f333444a;
        int iHashCode = (d12 == null ? 0 : d12.hashCode()) * 31;
        Double d13 = this.f333445b;
        int iHashCode2 = (iHashCode + (d13 == null ? 0 : d13.hashCode())) * 31;
        TransportStats transportStats = this.f333446c;
        int iHashCode3 = (iHashCode2 + (transportStats == null ? 0 : transportStats.hashCode())) * 31;
        OutboundRtpAudioStats outboundRtpAudioStats = this.f333447d;
        int iHashCode4 = (iHashCode3 + (outboundRtpAudioStats == null ? 0 : outboundRtpAudioStats.hashCode())) * 31;
        InboundRtpAudioStats inboundRtpAudioStats = this.f333448e;
        int iHashCode5 = (iHashCode4 + (inboundRtpAudioStats == null ? 0 : inboundRtpAudioStats.hashCode())) * 31;
        OutboundRtpVideoStats outboundRtpVideoStats = this.f333449f;
        int iHashCode6 = (iHashCode5 + (outboundRtpVideoStats == null ? 0 : outboundRtpVideoStats.hashCode())) * 31;
        InboundRtpVideoStats inboundRtpVideoStats = this.f333450g;
        return iHashCode6 + (inboundRtpVideoStats != null ? inboundRtpVideoStats.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "StatsReport(callDuration=" + this.f333444a + ", activeDuration=" + this.f333445b + ", transport=" + this.f333446c + ", outboundRtpAudio=" + this.f333447d + ", inboundRtpAudio=" + this.f333448e + ", outboundRtpVideo=" + this.f333449f + ", inboundRtpVideo=" + this.f333450g + ')';
    }

    public StatsReport(@l Double d12, @l Double d13, @l TransportStats transportStats, @l OutboundRtpAudioStats outboundRtpAudioStats, @l InboundRtpAudioStats inboundRtpAudioStats, @l OutboundRtpVideoStats outboundRtpVideoStats, @l InboundRtpVideoStats inboundRtpVideoStats) {
        this.f333444a = d12;
        this.f333445b = d13;
        this.f333446c = transportStats;
        this.f333447d = outboundRtpAudioStats;
        this.f333448e = inboundRtpAudioStats;
        this.f333449f = outboundRtpVideoStats;
        this.f333450g = inboundRtpVideoStats;
    }
}
