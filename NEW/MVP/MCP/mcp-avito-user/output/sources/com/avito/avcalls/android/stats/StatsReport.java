package com.avito.avcalls.android.stats;

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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0081\b\u0018\u0000 \u00152\u00020\u0001:\u000e\u0016\u0017\u0015\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"Ba\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lcom/avito/avcalls/android/stats/StatsReport;", "", "", "seen1", "", "callDuration", "activeDuration", "Lcom/avito/avcalls/android/stats/StatsReport$TransportStats;", "transport", "Lcom/avito/avcalls/android/stats/StatsReport$OutboundRtpAudioStats;", "outboundRtpAudio", "Lcom/avito/avcalls/android/stats/StatsReport$InboundRtpAudioStats;", "inboundRtpAudio", "Lcom/avito/avcalls/android/stats/StatsReport$OutboundRtpVideoStats;", "outboundRtpVideo", "Lcom/avito/avcalls/android/stats/StatsReport$InboundRtpVideoStats;", "inboundRtpVideo", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Double;Ljava/lang/Double;Lcom/avito/avcalls/android/stats/StatsReport$TransportStats;Lcom/avito/avcalls/android/stats/StatsReport$OutboundRtpAudioStats;Lcom/avito/avcalls/android/stats/StatsReport$InboundRtpAudioStats;Lcom/avito/avcalls/android/stats/StatsReport$OutboundRtpVideoStats;Lcom/avito/avcalls/android/stats/StatsReport$InboundRtpVideoStats;Lkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "Codec", "IceCandidateStats", "InboundRtpAudioStats", "InboundRtpVideoStats", "OutboundRtpAudioSourceStats", "OutboundRtpAudioStats", "OutboundRtpVideoSourceStats", "OutboundRtpVideoStats", "RemoteInboundRtpStats", "RemoteOutboundRtpStats", "SelectedCandidatePairStats", "TransportStats", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* loaded from: classes5.dex */
public final /* data */ class StatsReport {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Double f332216a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Double f332217b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final TransportStats f332218c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final OutboundRtpAudioStats f332219d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final InboundRtpAudioStats f332220e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final OutboundRtpVideoStats f332221f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final InboundRtpVideoStats f332222g;

    /* compiled from: StatsReport.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0010B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBM\b\u0011\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/avito/avcalls/android/stats/StatsReport$Codec;", "", "", "type", "Lkotlin/w0;", "payloadType", "clockRate", "channels", "sdpFmtpLine", "<init>", "(Ljava/lang/String;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/String;Lkotlin/jvm/internal/w;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/String;Lkotlinx/serialization/internal/P0;Lkotlin/jvm/internal/w;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @w
    public static final /* data */ class Codec {

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f332223a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final w0 f332224b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final w0 f332225c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final w0 f332226d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f332227e;

        /* compiled from: StatsReport.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/android/stats/StatsReport$Codec$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/android/stats/StatsReport$Codec;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
            this.f332223a = str;
            this.f332224b = w0Var;
            this.f332225c = w0Var2;
            this.f332226d = w0Var3;
            this.f332227e = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Codec)) {
                return false;
            }
            Codec codec = (Codec) obj;
            return L.f(this.f332223a, codec.f332223a) && L.f(this.f332224b, codec.f332224b) && L.f(this.f332225c, codec.f332225c) && L.f(this.f332226d, codec.f332226d) && L.f(this.f332227e, codec.f332227e);
        }

        public final int hashCode() {
            String str = this.f332223a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            w0 w0Var = this.f332224b;
            int iHashCode2 = (iHashCode + (w0Var == null ? 0 : Long.hashCode(w0Var.f410663b))) * 31;
            w0 w0Var2 = this.f332225c;
            int iHashCode3 = (iHashCode2 + (w0Var2 == null ? 0 : Long.hashCode(w0Var2.f410663b))) * 31;
            w0 w0Var3 = this.f332226d;
            int iHashCode4 = (iHashCode3 + (w0Var3 == null ? 0 : Long.hashCode(w0Var3.f410663b))) * 31;
            String str2 = this.f332227e;
            return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Codec(type=");
            sb2.append(this.f332223a);
            sb2.append(", payloadType=");
            sb2.append(this.f332224b);
            sb2.append(", clockRate=");
            sb2.append(this.f332225c);
            sb2.append(", channels=");
            sb2.append(this.f332226d);
            sb2.append(", sdpFmtpLine=");
            return C22026a.c(sb2, this.f332227e, ')');
        }

        public Codec(String str, w0 w0Var, w0 w0Var2, w0 w0Var3, String str2, C42822w c42822w) {
            this.f332223a = str;
            this.f332224b = w0Var;
            this.f332225c = w0Var2;
            this.f332226d = w0Var3;
            this.f332227e = str2;
        }
    }

    /* compiled from: StatsReport.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/android/stats/StatsReport$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/android/stats/StatsReport;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0016B\u0093\u0001\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/avito/avcalls/android/stats/StatsReport$IceCandidateStats;", "", "", "seen1", "", "networkType", "networkAdapterType", "ip", AddressParameter.TYPE, "port", "relatedAddress", "relatedPort", "relayProtocol", "type", "protocol", "tcpType", "", "vpn", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @w
    public static final /* data */ class IceCandidateStats {

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f332228a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f332229b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f332230c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f332231d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Integer f332232e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f332233f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final Integer f332234g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final String f332235h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final String f332236i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final String f332237j;

        /* renamed from: k, reason: collision with root package name */
        @l
        public final String f332238k;

        /* renamed from: l, reason: collision with root package name */
        @l
        public final Boolean f332239l;

        /* compiled from: StatsReport.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/android/stats/StatsReport$IceCandidateStats$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/android/stats/StatsReport$IceCandidateStats;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
            this.f332228a = str;
            this.f332229b = str2;
            this.f332230c = str3;
            this.f332231d = str4;
            this.f332232e = num;
            this.f332233f = str5;
            this.f332234g = num2;
            this.f332235h = str6;
            this.f332236i = str7;
            this.f332237j = str8;
            this.f332238k = str9;
            this.f332239l = bool;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IceCandidateStats)) {
                return false;
            }
            IceCandidateStats iceCandidateStats = (IceCandidateStats) obj;
            return L.f(this.f332228a, iceCandidateStats.f332228a) && L.f(this.f332229b, iceCandidateStats.f332229b) && L.f(this.f332230c, iceCandidateStats.f332230c) && L.f(this.f332231d, iceCandidateStats.f332231d) && L.f(this.f332232e, iceCandidateStats.f332232e) && L.f(this.f332233f, iceCandidateStats.f332233f) && L.f(this.f332234g, iceCandidateStats.f332234g) && L.f(this.f332235h, iceCandidateStats.f332235h) && L.f(this.f332236i, iceCandidateStats.f332236i) && L.f(this.f332237j, iceCandidateStats.f332237j) && L.f(this.f332238k, iceCandidateStats.f332238k) && L.f(this.f332239l, iceCandidateStats.f332239l);
        }

        public final int hashCode() {
            String str = this.f332228a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f332229b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f332230c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f332231d;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Integer num = this.f332232e;
            int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
            String str5 = this.f332233f;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num2 = this.f332234g;
            int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str6 = this.f332235h;
            int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f332236i;
            int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.f332237j;
            int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.f332238k;
            int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
            Boolean bool = this.f332239l;
            return iHashCode11 + (bool != null ? bool.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("IceCandidateStats(networkType=");
            sb2.append(this.f332228a);
            sb2.append(", networkAdapterType=");
            sb2.append(this.f332229b);
            sb2.append(", ip=");
            sb2.append(this.f332230c);
            sb2.append(", address=");
            sb2.append(this.f332231d);
            sb2.append(", port=");
            sb2.append(this.f332232e);
            sb2.append(", relatedAddress=");
            sb2.append(this.f332233f);
            sb2.append(", relatedPort=");
            sb2.append(this.f332234g);
            sb2.append(", relayProtocol=");
            sb2.append(this.f332235h);
            sb2.append(", type=");
            sb2.append(this.f332236i);
            sb2.append(", protocol=");
            sb2.append(this.f332237j);
            sb2.append(", tcpType=");
            sb2.append(this.f332238k);
            sb2.append(", vpn=");
            return C0.g(sb2, this.f332239l, ')');
        }

        public IceCandidateStats(@l String str, @l String str2, @l String str3, @l String str4, @l Integer num, @l String str5, @l Integer num2, @l String str6, @l String str7, @l String str8, @l String str9, @l Boolean bool) {
            this.f332228a = str;
            this.f332229b = str2;
            this.f332230c = str3;
            this.f332231d = str4;
            this.f332232e = num;
            this.f332233f = str5;
            this.f332234g = num2;
            this.f332235h = str6;
            this.f332236i = str7;
            this.f332237j = str8;
            this.f332238k = str9;
            this.f332239l = bool;
        }
    }

    /* compiled from: StatsReport.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 32\u00020\u0001:\u000243Bï\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0013\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,B\u008b\u0003\b\u0011\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u0010/\u001a\u00020-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0013\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b+\u00102¨\u00065"}, d2 = {"Lcom/avito/avcalls/android/stats/StatsReport$InboundRtpAudioStats;", "", "Lcom/avito/avcalls/android/stats/StatsReport$Codec;", "codec", "Lkotlin/w0;", "ssrc", "packetsReceived", "", "packetsLost", "packetsDiscarded", "bytesReceived", "headerBytesReceived", "fecPacketsReceived", "fecPacketsDiscarded", "fecBytesReceived", "fecSsrc", "retransmittedPacketsReceived", "retransmittedBytesReceived", "rtxSsrc", "", "totalSamplesDuration", "totalSamplesReceived", "concealedSamples", "silentConcealedSamples", "removedSamplesForAcceleration", "insertedSamplesForDeceleration", "delayedPacketOutageSamples", "jitterBufferEmittedCount", "concealmentEvents", "totalAudioEnergy", "audioLevel", "jitter", "jitterBufferDelay", "jitterBufferTargetDelay", "jitterBufferMinimumDelay", "jitterBufferFlushes", "relativePacketArrivalDelay", "interruptionCount", "totalInterruptionDuration", "totalProcessingDelay", "nackCount", "Lcom/avito/avcalls/android/stats/StatsReport$RemoteOutboundRtpStats;", "remote", "<init>", "(Lcom/avito/avcalls/android/stats/StatsReport$Codec;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Long;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/w0;Ljava/lang/Double;Lkotlin/w0;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/w0;Lcom/avito/avcalls/android/stats/StatsReport$RemoteOutboundRtpStats;Lkotlin/jvm/internal/w;)V", "", "seen1", "seen2", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(IILcom/avito/avcalls/android/stats/StatsReport$Codec;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Long;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/w0;Ljava/lang/Double;Lkotlin/w0;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/w0;Lcom/avito/avcalls/android/stats/StatsReport$RemoteOutboundRtpStats;Lkotlinx/serialization/internal/P0;Lkotlin/jvm/internal/w;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @w
    public static final /* data */ class InboundRtpAudioStats {

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: A, reason: collision with root package name */
        @l
        public final Double f332240A;

        /* renamed from: B, reason: collision with root package name */
        @l
        public final Double f332241B;

        /* renamed from: C, reason: collision with root package name */
        @l
        public final Double f332242C;

        /* renamed from: D, reason: collision with root package name */
        @l
        public final w0 f332243D;

        /* renamed from: E, reason: collision with root package name */
        @l
        public final Double f332244E;

        /* renamed from: F, reason: collision with root package name */
        @l
        public final w0 f332245F;

        /* renamed from: G, reason: collision with root package name */
        @l
        public final Double f332246G;

        /* renamed from: H, reason: collision with root package name */
        @l
        public final Double f332247H;

        /* renamed from: I, reason: collision with root package name */
        @l
        public final w0 f332248I;

        /* renamed from: J, reason: collision with root package name */
        @l
        public final RemoteOutboundRtpStats f332249J;

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Codec f332250a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final w0 f332251b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final w0 f332252c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Long f332253d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final w0 f332254e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final w0 f332255f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final w0 f332256g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final w0 f332257h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final w0 f332258i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final w0 f332259j;

        /* renamed from: k, reason: collision with root package name */
        @l
        public final w0 f332260k;

        /* renamed from: l, reason: collision with root package name */
        @l
        public final w0 f332261l;

        /* renamed from: m, reason: collision with root package name */
        @l
        public final w0 f332262m;

        /* renamed from: n, reason: collision with root package name */
        @l
        public final w0 f332263n;

        /* renamed from: o, reason: collision with root package name */
        @l
        public final Double f332264o;

        /* renamed from: p, reason: collision with root package name */
        @l
        public final w0 f332265p;

        /* renamed from: q, reason: collision with root package name */
        @l
        public final w0 f332266q;

        /* renamed from: r, reason: collision with root package name */
        @l
        public final w0 f332267r;

        /* renamed from: s, reason: collision with root package name */
        @l
        public final w0 f332268s;

        /* renamed from: t, reason: collision with root package name */
        @l
        public final w0 f332269t;

        /* renamed from: u, reason: collision with root package name */
        @l
        public final w0 f332270u;

        /* renamed from: v, reason: collision with root package name */
        @l
        public final w0 f332271v;

        /* renamed from: w, reason: collision with root package name */
        @l
        public final w0 f332272w;

        /* renamed from: x, reason: collision with root package name */
        @l
        public final Double f332273x;

        /* renamed from: y, reason: collision with root package name */
        @l
        public final Double f332274y;

        /* renamed from: z, reason: collision with root package name */
        @l
        public final Double f332275z;

        /* compiled from: StatsReport.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/android/stats/StatsReport$InboundRtpAudioStats$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/android/stats/StatsReport$InboundRtpAudioStats;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
            this.f332250a = codec;
            this.f332251b = w0Var;
            this.f332252c = w0Var2;
            this.f332253d = l12;
            this.f332254e = w0Var3;
            this.f332255f = w0Var4;
            this.f332256g = w0Var5;
            this.f332257h = w0Var6;
            this.f332258i = w0Var7;
            this.f332259j = w0Var8;
            this.f332260k = w0Var9;
            this.f332261l = w0Var10;
            this.f332262m = w0Var11;
            this.f332263n = w0Var12;
            this.f332264o = d12;
            this.f332265p = w0Var13;
            this.f332266q = w0Var14;
            this.f332267r = w0Var15;
            this.f332268s = w0Var16;
            this.f332269t = w0Var17;
            this.f332270u = w0Var18;
            this.f332271v = w0Var19;
            this.f332272w = w0Var20;
            this.f332273x = d13;
            this.f332274y = d14;
            this.f332275z = d15;
            this.f332240A = d16;
            this.f332241B = d17;
            this.f332242C = d18;
            this.f332243D = w0Var21;
            this.f332244E = d19;
            this.f332245F = w0Var22;
            this.f332246G = d22;
            this.f332247H = d23;
            this.f332248I = w0Var23;
            this.f332249J = remoteOutboundRtpStats;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InboundRtpAudioStats)) {
                return false;
            }
            InboundRtpAudioStats inboundRtpAudioStats = (InboundRtpAudioStats) obj;
            return L.f(this.f332250a, inboundRtpAudioStats.f332250a) && L.f(this.f332251b, inboundRtpAudioStats.f332251b) && L.f(this.f332252c, inboundRtpAudioStats.f332252c) && L.f(this.f332253d, inboundRtpAudioStats.f332253d) && L.f(this.f332254e, inboundRtpAudioStats.f332254e) && L.f(this.f332255f, inboundRtpAudioStats.f332255f) && L.f(this.f332256g, inboundRtpAudioStats.f332256g) && L.f(this.f332257h, inboundRtpAudioStats.f332257h) && L.f(this.f332258i, inboundRtpAudioStats.f332258i) && L.f(this.f332259j, inboundRtpAudioStats.f332259j) && L.f(this.f332260k, inboundRtpAudioStats.f332260k) && L.f(this.f332261l, inboundRtpAudioStats.f332261l) && L.f(this.f332262m, inboundRtpAudioStats.f332262m) && L.f(this.f332263n, inboundRtpAudioStats.f332263n) && L.f(this.f332264o, inboundRtpAudioStats.f332264o) && L.f(this.f332265p, inboundRtpAudioStats.f332265p) && L.f(this.f332266q, inboundRtpAudioStats.f332266q) && L.f(this.f332267r, inboundRtpAudioStats.f332267r) && L.f(this.f332268s, inboundRtpAudioStats.f332268s) && L.f(this.f332269t, inboundRtpAudioStats.f332269t) && L.f(this.f332270u, inboundRtpAudioStats.f332270u) && L.f(this.f332271v, inboundRtpAudioStats.f332271v) && L.f(this.f332272w, inboundRtpAudioStats.f332272w) && L.f(this.f332273x, inboundRtpAudioStats.f332273x) && L.f(this.f332274y, inboundRtpAudioStats.f332274y) && L.f(this.f332275z, inboundRtpAudioStats.f332275z) && L.f(this.f332240A, inboundRtpAudioStats.f332240A) && L.f(this.f332241B, inboundRtpAudioStats.f332241B) && L.f(this.f332242C, inboundRtpAudioStats.f332242C) && L.f(this.f332243D, inboundRtpAudioStats.f332243D) && L.f(this.f332244E, inboundRtpAudioStats.f332244E) && L.f(this.f332245F, inboundRtpAudioStats.f332245F) && L.f(this.f332246G, inboundRtpAudioStats.f332246G) && L.f(this.f332247H, inboundRtpAudioStats.f332247H) && L.f(this.f332248I, inboundRtpAudioStats.f332248I) && L.f(this.f332249J, inboundRtpAudioStats.f332249J);
        }

        public final int hashCode() {
            Codec codec = this.f332250a;
            int iHashCode = (codec == null ? 0 : codec.hashCode()) * 31;
            w0 w0Var = this.f332251b;
            int iHashCode2 = (iHashCode + (w0Var == null ? 0 : Long.hashCode(w0Var.f410663b))) * 31;
            w0 w0Var2 = this.f332252c;
            int iHashCode3 = (iHashCode2 + (w0Var2 == null ? 0 : Long.hashCode(w0Var2.f410663b))) * 31;
            Long l12 = this.f332253d;
            int iHashCode4 = (iHashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
            w0 w0Var3 = this.f332254e;
            int iHashCode5 = (iHashCode4 + (w0Var3 == null ? 0 : Long.hashCode(w0Var3.f410663b))) * 31;
            w0 w0Var4 = this.f332255f;
            int iHashCode6 = (iHashCode5 + (w0Var4 == null ? 0 : Long.hashCode(w0Var4.f410663b))) * 31;
            w0 w0Var5 = this.f332256g;
            int iHashCode7 = (iHashCode6 + (w0Var5 == null ? 0 : Long.hashCode(w0Var5.f410663b))) * 31;
            w0 w0Var6 = this.f332257h;
            int iHashCode8 = (iHashCode7 + (w0Var6 == null ? 0 : Long.hashCode(w0Var6.f410663b))) * 31;
            w0 w0Var7 = this.f332258i;
            int iHashCode9 = (iHashCode8 + (w0Var7 == null ? 0 : Long.hashCode(w0Var7.f410663b))) * 31;
            w0 w0Var8 = this.f332259j;
            int iHashCode10 = (iHashCode9 + (w0Var8 == null ? 0 : Long.hashCode(w0Var8.f410663b))) * 31;
            w0 w0Var9 = this.f332260k;
            int iHashCode11 = (iHashCode10 + (w0Var9 == null ? 0 : Long.hashCode(w0Var9.f410663b))) * 31;
            w0 w0Var10 = this.f332261l;
            int iHashCode12 = (iHashCode11 + (w0Var10 == null ? 0 : Long.hashCode(w0Var10.f410663b))) * 31;
            w0 w0Var11 = this.f332262m;
            int iHashCode13 = (iHashCode12 + (w0Var11 == null ? 0 : Long.hashCode(w0Var11.f410663b))) * 31;
            w0 w0Var12 = this.f332263n;
            int iHashCode14 = (iHashCode13 + (w0Var12 == null ? 0 : Long.hashCode(w0Var12.f410663b))) * 31;
            Double d12 = this.f332264o;
            int iHashCode15 = (iHashCode14 + (d12 == null ? 0 : d12.hashCode())) * 31;
            w0 w0Var13 = this.f332265p;
            int iHashCode16 = (iHashCode15 + (w0Var13 == null ? 0 : Long.hashCode(w0Var13.f410663b))) * 31;
            w0 w0Var14 = this.f332266q;
            int iHashCode17 = (iHashCode16 + (w0Var14 == null ? 0 : Long.hashCode(w0Var14.f410663b))) * 31;
            w0 w0Var15 = this.f332267r;
            int iHashCode18 = (iHashCode17 + (w0Var15 == null ? 0 : Long.hashCode(w0Var15.f410663b))) * 31;
            w0 w0Var16 = this.f332268s;
            int iHashCode19 = (iHashCode18 + (w0Var16 == null ? 0 : Long.hashCode(w0Var16.f410663b))) * 31;
            w0 w0Var17 = this.f332269t;
            int iHashCode20 = (iHashCode19 + (w0Var17 == null ? 0 : Long.hashCode(w0Var17.f410663b))) * 31;
            w0 w0Var18 = this.f332270u;
            int iHashCode21 = (iHashCode20 + (w0Var18 == null ? 0 : Long.hashCode(w0Var18.f410663b))) * 31;
            w0 w0Var19 = this.f332271v;
            int iHashCode22 = (iHashCode21 + (w0Var19 == null ? 0 : Long.hashCode(w0Var19.f410663b))) * 31;
            w0 w0Var20 = this.f332272w;
            int iHashCode23 = (iHashCode22 + (w0Var20 == null ? 0 : Long.hashCode(w0Var20.f410663b))) * 31;
            Double d13 = this.f332273x;
            int iHashCode24 = (iHashCode23 + (d13 == null ? 0 : d13.hashCode())) * 31;
            Double d14 = this.f332274y;
            int iHashCode25 = (iHashCode24 + (d14 == null ? 0 : d14.hashCode())) * 31;
            Double d15 = this.f332275z;
            int iHashCode26 = (iHashCode25 + (d15 == null ? 0 : d15.hashCode())) * 31;
            Double d16 = this.f332240A;
            int iHashCode27 = (iHashCode26 + (d16 == null ? 0 : d16.hashCode())) * 31;
            Double d17 = this.f332241B;
            int iHashCode28 = (iHashCode27 + (d17 == null ? 0 : d17.hashCode())) * 31;
            Double d18 = this.f332242C;
            int iHashCode29 = (iHashCode28 + (d18 == null ? 0 : d18.hashCode())) * 31;
            w0 w0Var21 = this.f332243D;
            int iHashCode30 = (iHashCode29 + (w0Var21 == null ? 0 : Long.hashCode(w0Var21.f410663b))) * 31;
            Double d19 = this.f332244E;
            int iHashCode31 = (iHashCode30 + (d19 == null ? 0 : d19.hashCode())) * 31;
            w0 w0Var22 = this.f332245F;
            int iHashCode32 = (iHashCode31 + (w0Var22 == null ? 0 : Long.hashCode(w0Var22.f410663b))) * 31;
            Double d22 = this.f332246G;
            int iHashCode33 = (iHashCode32 + (d22 == null ? 0 : d22.hashCode())) * 31;
            Double d23 = this.f332247H;
            int iHashCode34 = (iHashCode33 + (d23 == null ? 0 : d23.hashCode())) * 31;
            w0 w0Var23 = this.f332248I;
            int iHashCode35 = (iHashCode34 + (w0Var23 == null ? 0 : Long.hashCode(w0Var23.f410663b))) * 31;
            RemoteOutboundRtpStats remoteOutboundRtpStats = this.f332249J;
            return iHashCode35 + (remoteOutboundRtpStats != null ? remoteOutboundRtpStats.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "InboundRtpAudioStats(codec=" + this.f332250a + ", ssrc=" + this.f332251b + ", packetsReceived=" + this.f332252c + ", packetsLost=" + this.f332253d + ", packetsDiscarded=" + this.f332254e + ", bytesReceived=" + this.f332255f + ", headerBytesReceived=" + this.f332256g + ", fecPacketsReceived=" + this.f332257h + ", fecPacketsDiscarded=" + this.f332258i + ", fecBytesReceived=" + this.f332259j + ", fecSsrc=" + this.f332260k + ", retransmittedPacketsReceived=" + this.f332261l + ", retransmittedBytesReceived=" + this.f332262m + ", rtxSsrc=" + this.f332263n + ", totalSamplesDuration=" + this.f332264o + ", totalSamplesReceived=" + this.f332265p + ", concealedSamples=" + this.f332266q + ", silentConcealedSamples=" + this.f332267r + ", removedSamplesForAcceleration=" + this.f332268s + ", insertedSamplesForDeceleration=" + this.f332269t + ", delayedPacketOutageSamples=" + this.f332270u + ", jitterBufferEmittedCount=" + this.f332271v + ", concealmentEvents=" + this.f332272w + ", totalAudioEnergy=" + this.f332273x + ", audioLevel=" + this.f332274y + ", jitter=" + this.f332275z + ", jitterBufferDelay=" + this.f332240A + ", jitterBufferTargetDelay=" + this.f332241B + ", jitterBufferMinimumDelay=" + this.f332242C + ", jitterBufferFlushes=" + this.f332243D + ", relativePacketArrivalDelay=" + this.f332244E + ", interruptionCount=" + this.f332245F + ", totalInterruptionDuration=" + this.f332246G + ", totalProcessingDelay=" + this.f332247H + ", nackCount=" + this.f332248I + ", remote=" + this.f332249J + ')';
        }

        public InboundRtpAudioStats(Codec codec, w0 w0Var, w0 w0Var2, Long l12, w0 w0Var3, w0 w0Var4, w0 w0Var5, w0 w0Var6, w0 w0Var7, w0 w0Var8, w0 w0Var9, w0 w0Var10, w0 w0Var11, w0 w0Var12, Double d12, w0 w0Var13, w0 w0Var14, w0 w0Var15, w0 w0Var16, w0 w0Var17, w0 w0Var18, w0 w0Var19, w0 w0Var20, Double d13, Double d14, Double d15, Double d16, Double d17, Double d18, w0 w0Var21, Double d19, w0 w0Var22, Double d22, Double d23, w0 w0Var23, RemoteOutboundRtpStats remoteOutboundRtpStats, C42822w c42822w) {
            this.f332250a = codec;
            this.f332251b = w0Var;
            this.f332252c = w0Var2;
            this.f332253d = l12;
            this.f332254e = w0Var3;
            this.f332255f = w0Var4;
            this.f332256g = w0Var5;
            this.f332257h = w0Var6;
            this.f332258i = w0Var7;
            this.f332259j = w0Var8;
            this.f332260k = w0Var9;
            this.f332261l = w0Var10;
            this.f332262m = w0Var11;
            this.f332263n = w0Var12;
            this.f332264o = d12;
            this.f332265p = w0Var13;
            this.f332266q = w0Var14;
            this.f332267r = w0Var15;
            this.f332268s = w0Var16;
            this.f332269t = w0Var17;
            this.f332270u = w0Var18;
            this.f332271v = w0Var19;
            this.f332272w = w0Var20;
            this.f332273x = d13;
            this.f332274y = d14;
            this.f332275z = d15;
            this.f332240A = d16;
            this.f332241B = d17;
            this.f332242C = d18;
            this.f332243D = w0Var21;
            this.f332244E = d19;
            this.f332245F = w0Var22;
            this.f332246G = d22;
            this.f332247H = d23;
            this.f332248I = w0Var23;
            this.f332249J = remoteOutboundRtpStats;
        }
    }

    /* compiled from: StatsReport.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 <2\u00020\u0001:\u0002=<Bµ\u0003\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\b\u0012\b\u0010 \u001a\u0004\u0018\u00010\b\u0012\b\u0010!\u001a\u0004\u0018\u00010\b\u0012\b\u0010\"\u001a\u0004\u0018\u00010\b\u0012\b\u0010#\u001a\u0004\u0018\u00010\b\u0012\b\u0010$\u001a\u0004\u0018\u00010\b\u0012\b\u0010%\u001a\u0004\u0018\u00010\b\u0012\b\u0010&\u001a\u0004\u0018\u00010\b\u0012\b\u0010'\u001a\u0004\u0018\u00010\b\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0004\u0012\b\u00101\u001a\u0004\u0018\u000100\u0012\b\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b4\u00105BÑ\u0003\b\u0011\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u00108\u001a\u000206\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\b\u0012\b\u0010 \u001a\u0004\u0018\u00010\b\u0012\b\u0010!\u001a\u0004\u0018\u00010\b\u0012\b\u0010\"\u001a\u0004\u0018\u00010\b\u0012\b\u0010#\u001a\u0004\u0018\u00010\b\u0012\b\u0010$\u001a\u0004\u0018\u00010\b\u0012\b\u0010%\u001a\u0004\u0018\u00010\b\u0012\b\u0010&\u001a\u0004\u0018\u00010\b\u0012\b\u0010'\u001a\u0004\u0018\u00010\b\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0004\u0012\b\u00101\u001a\u0004\u0018\u000100\u0012\b\u00103\u001a\u0004\u0018\u000102\u0012\b\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b4\u0010;¨\u0006>"}, d2 = {"Lcom/avito/avcalls/android/stats/StatsReport$InboundRtpVideoStats;", "", "Lcom/avito/avcalls/android/stats/StatsReport$Codec;", "codec", "Lkotlin/w0;", "ssrc", "frameWidth", "frameHeight", "", "framesPerSecond", "framesReceived", "framesDecoded", "framesDropped", "framesRendered", "keyFramesDecoded", "pliCount", "firCount", "framesAssembledFromMultiplePackets", "nackCount", "packetsReceived", "", "packetsLost", "bytesReceived", "headerBytesReceived", "packetsDiscarded", "retransmittedPacketsReceived", "retransmittedBytesReceived", "rtxSsrc", "totalAssemblyTime", "pauseCount", "freezeCount", "jitter", "jitterBufferDelay", "minPlayoutDelay", "totalSquaredInterFrameDelay", "totalProcessingDelay", "totalDecodeTime", "totalInterFrameDelay", "totalPausesDuration", "totalFreezesDuration", "", "decoderImplementation", "qpSum", "jitterBufferEmittedCount", "fecPacketsReceived", "fecBytesReceived", "fecPacketsDiscarded", "fecSsrc", "", "powerEfficientDecoder", "Lcom/avito/avcalls/android/stats/StatsReport$RemoteOutboundRtpStats;", "remote", "<init>", "(Lcom/avito/avcalls/android/stats/StatsReport$Codec;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Long;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Boolean;Lcom/avito/avcalls/android/stats/StatsReport$RemoteOutboundRtpStats;Lkotlin/jvm/internal/w;)V", "", "seen1", "seen2", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(IILcom/avito/avcalls/android/stats/StatsReport$Codec;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Long;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Boolean;Lcom/avito/avcalls/android/stats/StatsReport$RemoteOutboundRtpStats;Lkotlinx/serialization/internal/P0;Lkotlin/jvm/internal/w;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @w
    public static final /* data */ class InboundRtpVideoStats {

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: A, reason: collision with root package name */
        @l
        public final Double f332276A;

        /* renamed from: B, reason: collision with root package name */
        @l
        public final Double f332277B;

        /* renamed from: C, reason: collision with root package name */
        @l
        public final Double f332278C;

        /* renamed from: D, reason: collision with root package name */
        @l
        public final Double f332279D;

        /* renamed from: E, reason: collision with root package name */
        @l
        public final Double f332280E;

        /* renamed from: F, reason: collision with root package name */
        @l
        public final Double f332281F;

        /* renamed from: G, reason: collision with root package name */
        @l
        public final Double f332282G;

        /* renamed from: H, reason: collision with root package name */
        @l
        public final Double f332283H;

        /* renamed from: I, reason: collision with root package name */
        @l
        public final String f332284I;

        /* renamed from: J, reason: collision with root package name */
        @l
        public final w0 f332285J;

        /* renamed from: K, reason: collision with root package name */
        @l
        public final w0 f332286K;

        /* renamed from: L, reason: collision with root package name */
        @l
        public final w0 f332287L;

        /* renamed from: M, reason: collision with root package name */
        @l
        public final w0 f332288M;

        /* renamed from: N, reason: collision with root package name */
        @l
        public final w0 f332289N;

        /* renamed from: O, reason: collision with root package name */
        @l
        public final w0 f332290O;

        /* renamed from: P, reason: collision with root package name */
        @l
        public final Boolean f332291P;

        /* renamed from: Q, reason: collision with root package name */
        @l
        public final RemoteOutboundRtpStats f332292Q;

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Codec f332293a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final w0 f332294b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final w0 f332295c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final w0 f332296d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Double f332297e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final w0 f332298f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final w0 f332299g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final w0 f332300h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final w0 f332301i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final w0 f332302j;

        /* renamed from: k, reason: collision with root package name */
        @l
        public final w0 f332303k;

        /* renamed from: l, reason: collision with root package name */
        @l
        public final w0 f332304l;

        /* renamed from: m, reason: collision with root package name */
        @l
        public final w0 f332305m;

        /* renamed from: n, reason: collision with root package name */
        @l
        public final w0 f332306n;

        /* renamed from: o, reason: collision with root package name */
        @l
        public final w0 f332307o;

        /* renamed from: p, reason: collision with root package name */
        @l
        public final Long f332308p;

        /* renamed from: q, reason: collision with root package name */
        @l
        public final w0 f332309q;

        /* renamed from: r, reason: collision with root package name */
        @l
        public final w0 f332310r;

        /* renamed from: s, reason: collision with root package name */
        @l
        public final w0 f332311s;

        /* renamed from: t, reason: collision with root package name */
        @l
        public final w0 f332312t;

        /* renamed from: u, reason: collision with root package name */
        @l
        public final w0 f332313u;

        /* renamed from: v, reason: collision with root package name */
        @l
        public final w0 f332314v;

        /* renamed from: w, reason: collision with root package name */
        @l
        public final Double f332315w;

        /* renamed from: x, reason: collision with root package name */
        @l
        public final w0 f332316x;

        /* renamed from: y, reason: collision with root package name */
        @l
        public final w0 f332317y;

        /* renamed from: z, reason: collision with root package name */
        @l
        public final Double f332318z;

        /* compiled from: StatsReport.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/android/stats/StatsReport$InboundRtpVideoStats$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/android/stats/StatsReport$InboundRtpVideoStats;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
            this.f332293a = codec;
            this.f332294b = w0Var;
            this.f332295c = w0Var2;
            this.f332296d = w0Var3;
            this.f332297e = d12;
            this.f332298f = w0Var4;
            this.f332299g = w0Var5;
            this.f332300h = w0Var6;
            this.f332301i = w0Var7;
            this.f332302j = w0Var8;
            this.f332303k = w0Var9;
            this.f332304l = w0Var10;
            this.f332305m = w0Var11;
            this.f332306n = w0Var12;
            this.f332307o = w0Var13;
            this.f332308p = l12;
            this.f332309q = w0Var14;
            this.f332310r = w0Var15;
            this.f332311s = w0Var16;
            this.f332312t = w0Var17;
            this.f332313u = w0Var18;
            this.f332314v = w0Var19;
            this.f332315w = d13;
            this.f332316x = w0Var20;
            this.f332317y = w0Var21;
            this.f332318z = d14;
            this.f332276A = d15;
            this.f332277B = d16;
            this.f332278C = d17;
            this.f332279D = d18;
            this.f332280E = d19;
            this.f332281F = d22;
            this.f332282G = d23;
            this.f332283H = d24;
            this.f332284I = str;
            this.f332285J = w0Var22;
            this.f332286K = w0Var23;
            this.f332287L = w0Var24;
            this.f332288M = w0Var25;
            this.f332289N = w0Var26;
            this.f332290O = w0Var27;
            this.f332291P = bool;
            this.f332292Q = remoteOutboundRtpStats;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InboundRtpVideoStats)) {
                return false;
            }
            InboundRtpVideoStats inboundRtpVideoStats = (InboundRtpVideoStats) obj;
            return L.f(this.f332293a, inboundRtpVideoStats.f332293a) && L.f(this.f332294b, inboundRtpVideoStats.f332294b) && L.f(this.f332295c, inboundRtpVideoStats.f332295c) && L.f(this.f332296d, inboundRtpVideoStats.f332296d) && L.f(this.f332297e, inboundRtpVideoStats.f332297e) && L.f(this.f332298f, inboundRtpVideoStats.f332298f) && L.f(this.f332299g, inboundRtpVideoStats.f332299g) && L.f(this.f332300h, inboundRtpVideoStats.f332300h) && L.f(this.f332301i, inboundRtpVideoStats.f332301i) && L.f(this.f332302j, inboundRtpVideoStats.f332302j) && L.f(this.f332303k, inboundRtpVideoStats.f332303k) && L.f(this.f332304l, inboundRtpVideoStats.f332304l) && L.f(this.f332305m, inboundRtpVideoStats.f332305m) && L.f(this.f332306n, inboundRtpVideoStats.f332306n) && L.f(this.f332307o, inboundRtpVideoStats.f332307o) && L.f(this.f332308p, inboundRtpVideoStats.f332308p) && L.f(this.f332309q, inboundRtpVideoStats.f332309q) && L.f(this.f332310r, inboundRtpVideoStats.f332310r) && L.f(this.f332311s, inboundRtpVideoStats.f332311s) && L.f(this.f332312t, inboundRtpVideoStats.f332312t) && L.f(this.f332313u, inboundRtpVideoStats.f332313u) && L.f(this.f332314v, inboundRtpVideoStats.f332314v) && L.f(this.f332315w, inboundRtpVideoStats.f332315w) && L.f(this.f332316x, inboundRtpVideoStats.f332316x) && L.f(this.f332317y, inboundRtpVideoStats.f332317y) && L.f(this.f332318z, inboundRtpVideoStats.f332318z) && L.f(this.f332276A, inboundRtpVideoStats.f332276A) && L.f(this.f332277B, inboundRtpVideoStats.f332277B) && L.f(this.f332278C, inboundRtpVideoStats.f332278C) && L.f(this.f332279D, inboundRtpVideoStats.f332279D) && L.f(this.f332280E, inboundRtpVideoStats.f332280E) && L.f(this.f332281F, inboundRtpVideoStats.f332281F) && L.f(this.f332282G, inboundRtpVideoStats.f332282G) && L.f(this.f332283H, inboundRtpVideoStats.f332283H) && L.f(this.f332284I, inboundRtpVideoStats.f332284I) && L.f(this.f332285J, inboundRtpVideoStats.f332285J) && L.f(this.f332286K, inboundRtpVideoStats.f332286K) && L.f(this.f332287L, inboundRtpVideoStats.f332287L) && L.f(this.f332288M, inboundRtpVideoStats.f332288M) && L.f(this.f332289N, inboundRtpVideoStats.f332289N) && L.f(this.f332290O, inboundRtpVideoStats.f332290O) && L.f(this.f332291P, inboundRtpVideoStats.f332291P) && L.f(this.f332292Q, inboundRtpVideoStats.f332292Q);
        }

        public final int hashCode() {
            Codec codec = this.f332293a;
            int iHashCode = (codec == null ? 0 : codec.hashCode()) * 31;
            w0 w0Var = this.f332294b;
            int iHashCode2 = (iHashCode + (w0Var == null ? 0 : Long.hashCode(w0Var.f410663b))) * 31;
            w0 w0Var2 = this.f332295c;
            int iHashCode3 = (iHashCode2 + (w0Var2 == null ? 0 : Long.hashCode(w0Var2.f410663b))) * 31;
            w0 w0Var3 = this.f332296d;
            int iHashCode4 = (iHashCode3 + (w0Var3 == null ? 0 : Long.hashCode(w0Var3.f410663b))) * 31;
            Double d12 = this.f332297e;
            int iHashCode5 = (iHashCode4 + (d12 == null ? 0 : d12.hashCode())) * 31;
            w0 w0Var4 = this.f332298f;
            int iHashCode6 = (iHashCode5 + (w0Var4 == null ? 0 : Long.hashCode(w0Var4.f410663b))) * 31;
            w0 w0Var5 = this.f332299g;
            int iHashCode7 = (iHashCode6 + (w0Var5 == null ? 0 : Long.hashCode(w0Var5.f410663b))) * 31;
            w0 w0Var6 = this.f332300h;
            int iHashCode8 = (iHashCode7 + (w0Var6 == null ? 0 : Long.hashCode(w0Var6.f410663b))) * 31;
            w0 w0Var7 = this.f332301i;
            int iHashCode9 = (iHashCode8 + (w0Var7 == null ? 0 : Long.hashCode(w0Var7.f410663b))) * 31;
            w0 w0Var8 = this.f332302j;
            int iHashCode10 = (iHashCode9 + (w0Var8 == null ? 0 : Long.hashCode(w0Var8.f410663b))) * 31;
            w0 w0Var9 = this.f332303k;
            int iHashCode11 = (iHashCode10 + (w0Var9 == null ? 0 : Long.hashCode(w0Var9.f410663b))) * 31;
            w0 w0Var10 = this.f332304l;
            int iHashCode12 = (iHashCode11 + (w0Var10 == null ? 0 : Long.hashCode(w0Var10.f410663b))) * 31;
            w0 w0Var11 = this.f332305m;
            int iHashCode13 = (iHashCode12 + (w0Var11 == null ? 0 : Long.hashCode(w0Var11.f410663b))) * 31;
            w0 w0Var12 = this.f332306n;
            int iHashCode14 = (iHashCode13 + (w0Var12 == null ? 0 : Long.hashCode(w0Var12.f410663b))) * 31;
            w0 w0Var13 = this.f332307o;
            int iHashCode15 = (iHashCode14 + (w0Var13 == null ? 0 : Long.hashCode(w0Var13.f410663b))) * 31;
            Long l12 = this.f332308p;
            int iHashCode16 = (iHashCode15 + (l12 == null ? 0 : l12.hashCode())) * 31;
            w0 w0Var14 = this.f332309q;
            int iHashCode17 = (iHashCode16 + (w0Var14 == null ? 0 : Long.hashCode(w0Var14.f410663b))) * 31;
            w0 w0Var15 = this.f332310r;
            int iHashCode18 = (iHashCode17 + (w0Var15 == null ? 0 : Long.hashCode(w0Var15.f410663b))) * 31;
            w0 w0Var16 = this.f332311s;
            int iHashCode19 = (iHashCode18 + (w0Var16 == null ? 0 : Long.hashCode(w0Var16.f410663b))) * 31;
            w0 w0Var17 = this.f332312t;
            int iHashCode20 = (iHashCode19 + (w0Var17 == null ? 0 : Long.hashCode(w0Var17.f410663b))) * 31;
            w0 w0Var18 = this.f332313u;
            int iHashCode21 = (iHashCode20 + (w0Var18 == null ? 0 : Long.hashCode(w0Var18.f410663b))) * 31;
            w0 w0Var19 = this.f332314v;
            int iHashCode22 = (iHashCode21 + (w0Var19 == null ? 0 : Long.hashCode(w0Var19.f410663b))) * 31;
            Double d13 = this.f332315w;
            int iHashCode23 = (iHashCode22 + (d13 == null ? 0 : d13.hashCode())) * 31;
            w0 w0Var20 = this.f332316x;
            int iHashCode24 = (iHashCode23 + (w0Var20 == null ? 0 : Long.hashCode(w0Var20.f410663b))) * 31;
            w0 w0Var21 = this.f332317y;
            int iHashCode25 = (iHashCode24 + (w0Var21 == null ? 0 : Long.hashCode(w0Var21.f410663b))) * 31;
            Double d14 = this.f332318z;
            int iHashCode26 = (iHashCode25 + (d14 == null ? 0 : d14.hashCode())) * 31;
            Double d15 = this.f332276A;
            int iHashCode27 = (iHashCode26 + (d15 == null ? 0 : d15.hashCode())) * 31;
            Double d16 = this.f332277B;
            int iHashCode28 = (iHashCode27 + (d16 == null ? 0 : d16.hashCode())) * 31;
            Double d17 = this.f332278C;
            int iHashCode29 = (iHashCode28 + (d17 == null ? 0 : d17.hashCode())) * 31;
            Double d18 = this.f332279D;
            int iHashCode30 = (iHashCode29 + (d18 == null ? 0 : d18.hashCode())) * 31;
            Double d19 = this.f332280E;
            int iHashCode31 = (iHashCode30 + (d19 == null ? 0 : d19.hashCode())) * 31;
            Double d22 = this.f332281F;
            int iHashCode32 = (iHashCode31 + (d22 == null ? 0 : d22.hashCode())) * 31;
            Double d23 = this.f332282G;
            int iHashCode33 = (iHashCode32 + (d23 == null ? 0 : d23.hashCode())) * 31;
            Double d24 = this.f332283H;
            int iHashCode34 = (iHashCode33 + (d24 == null ? 0 : d24.hashCode())) * 31;
            String str = this.f332284I;
            int iHashCode35 = (iHashCode34 + (str == null ? 0 : str.hashCode())) * 31;
            w0 w0Var22 = this.f332285J;
            int iHashCode36 = (iHashCode35 + (w0Var22 == null ? 0 : Long.hashCode(w0Var22.f410663b))) * 31;
            w0 w0Var23 = this.f332286K;
            int iHashCode37 = (iHashCode36 + (w0Var23 == null ? 0 : Long.hashCode(w0Var23.f410663b))) * 31;
            w0 w0Var24 = this.f332287L;
            int iHashCode38 = (iHashCode37 + (w0Var24 == null ? 0 : Long.hashCode(w0Var24.f410663b))) * 31;
            w0 w0Var25 = this.f332288M;
            int iHashCode39 = (iHashCode38 + (w0Var25 == null ? 0 : Long.hashCode(w0Var25.f410663b))) * 31;
            w0 w0Var26 = this.f332289N;
            int iHashCode40 = (iHashCode39 + (w0Var26 == null ? 0 : Long.hashCode(w0Var26.f410663b))) * 31;
            w0 w0Var27 = this.f332290O;
            int iHashCode41 = (iHashCode40 + (w0Var27 == null ? 0 : Long.hashCode(w0Var27.f410663b))) * 31;
            Boolean bool = this.f332291P;
            int iHashCode42 = (iHashCode41 + (bool == null ? 0 : bool.hashCode())) * 31;
            RemoteOutboundRtpStats remoteOutboundRtpStats = this.f332292Q;
            return iHashCode42 + (remoteOutboundRtpStats != null ? remoteOutboundRtpStats.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "InboundRtpVideoStats(codec=" + this.f332293a + ", ssrc=" + this.f332294b + ", frameWidth=" + this.f332295c + ", frameHeight=" + this.f332296d + ", framesPerSecond=" + this.f332297e + ", framesReceived=" + this.f332298f + ", framesDecoded=" + this.f332299g + ", framesDropped=" + this.f332300h + ", framesRendered=" + this.f332301i + ", keyFramesDecoded=" + this.f332302j + ", pliCount=" + this.f332303k + ", firCount=" + this.f332304l + ", framesAssembledFromMultiplePackets=" + this.f332305m + ", nackCount=" + this.f332306n + ", packetsReceived=" + this.f332307o + ", packetsLost=" + this.f332308p + ", bytesReceived=" + this.f332309q + ", headerBytesReceived=" + this.f332310r + ", packetsDiscarded=" + this.f332311s + ", retransmittedPacketsReceived=" + this.f332312t + ", retransmittedBytesReceived=" + this.f332313u + ", rtxSsrc=" + this.f332314v + ", totalAssemblyTime=" + this.f332315w + ", pauseCount=" + this.f332316x + ", freezeCount=" + this.f332317y + ", jitter=" + this.f332318z + ", jitterBufferDelay=" + this.f332276A + ", minPlayoutDelay=" + this.f332277B + ", totalSquaredInterFrameDelay=" + this.f332278C + ", totalProcessingDelay=" + this.f332279D + ", totalDecodeTime=" + this.f332280E + ", totalInterFrameDelay=" + this.f332281F + ", totalPausesDuration=" + this.f332282G + ", totalFreezesDuration=" + this.f332283H + ", decoderImplementation=" + this.f332284I + ", qpSum=" + this.f332285J + ", jitterBufferEmittedCount=" + this.f332286K + ", fecPacketsReceived=" + this.f332287L + ", fecBytesReceived=" + this.f332288M + ", fecPacketsDiscarded=" + this.f332289N + ", fecSsrc=" + this.f332290O + ", powerEfficientDecoder=" + this.f332291P + ", remote=" + this.f332292Q + ')';
        }

        public InboundRtpVideoStats(Codec codec, w0 w0Var, w0 w0Var2, w0 w0Var3, Double d12, w0 w0Var4, w0 w0Var5, w0 w0Var6, w0 w0Var7, w0 w0Var8, w0 w0Var9, w0 w0Var10, w0 w0Var11, w0 w0Var12, w0 w0Var13, Long l12, w0 w0Var14, w0 w0Var15, w0 w0Var16, w0 w0Var17, w0 w0Var18, w0 w0Var19, Double d13, w0 w0Var20, w0 w0Var21, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d22, Double d23, Double d24, String str, w0 w0Var22, w0 w0Var23, w0 w0Var24, w0 w0Var25, w0 w0Var26, w0 w0Var27, Boolean bool, RemoteOutboundRtpStats remoteOutboundRtpStats, C42822w c42822w) {
            this.f332293a = codec;
            this.f332294b = w0Var;
            this.f332295c = w0Var2;
            this.f332296d = w0Var3;
            this.f332297e = d12;
            this.f332298f = w0Var4;
            this.f332299g = w0Var5;
            this.f332300h = w0Var6;
            this.f332301i = w0Var7;
            this.f332302j = w0Var8;
            this.f332303k = w0Var9;
            this.f332304l = w0Var10;
            this.f332305m = w0Var11;
            this.f332306n = w0Var12;
            this.f332307o = w0Var13;
            this.f332308p = l12;
            this.f332309q = w0Var14;
            this.f332310r = w0Var15;
            this.f332311s = w0Var16;
            this.f332312t = w0Var17;
            this.f332313u = w0Var18;
            this.f332314v = w0Var19;
            this.f332315w = d13;
            this.f332316x = w0Var20;
            this.f332317y = w0Var21;
            this.f332318z = d14;
            this.f332276A = d15;
            this.f332277B = d16;
            this.f332278C = d17;
            this.f332279D = d18;
            this.f332280E = d19;
            this.f332281F = d22;
            this.f332282G = d23;
            this.f332283H = d24;
            this.f332284I = str;
            this.f332285J = w0Var22;
            this.f332286K = w0Var23;
            this.f332287L = w0Var24;
            this.f332288M = w0Var25;
            this.f332289N = w0Var26;
            this.f332290O = w0Var27;
            this.f332291P = bool;
            this.f332292Q = remoteOutboundRtpStats;
        }
    }

    /* compiled from: StatsReport.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u000eBM\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/avito/avcalls/android/stats/StatsReport$OutboundRtpAudioSourceStats;", "", "", "seen1", "", "audioLevel", "totalAudioEnergy", "totalSamplesDuration", "echoReturnLoss", "echoReturnLossEnhancement", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @w
    public static final /* data */ class OutboundRtpAudioSourceStats {

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Double f332319a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Double f332320b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Double f332321c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Double f332322d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Double f332323e;

        /* compiled from: StatsReport.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/android/stats/StatsReport$OutboundRtpAudioSourceStats$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/android/stats/StatsReport$OutboundRtpAudioSourceStats;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
            this.f332319a = d12;
            this.f332320b = d13;
            this.f332321c = d14;
            this.f332322d = d15;
            this.f332323e = d16;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OutboundRtpAudioSourceStats)) {
                return false;
            }
            OutboundRtpAudioSourceStats outboundRtpAudioSourceStats = (OutboundRtpAudioSourceStats) obj;
            return L.f(this.f332319a, outboundRtpAudioSourceStats.f332319a) && L.f(this.f332320b, outboundRtpAudioSourceStats.f332320b) && L.f(this.f332321c, outboundRtpAudioSourceStats.f332321c) && L.f(this.f332322d, outboundRtpAudioSourceStats.f332322d) && L.f(this.f332323e, outboundRtpAudioSourceStats.f332323e);
        }

        public final int hashCode() {
            Double d12 = this.f332319a;
            int iHashCode = (d12 == null ? 0 : d12.hashCode()) * 31;
            Double d13 = this.f332320b;
            int iHashCode2 = (iHashCode + (d13 == null ? 0 : d13.hashCode())) * 31;
            Double d14 = this.f332321c;
            int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
            Double d15 = this.f332322d;
            int iHashCode4 = (iHashCode3 + (d15 == null ? 0 : d15.hashCode())) * 31;
            Double d16 = this.f332323e;
            return iHashCode4 + (d16 != null ? d16.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OutboundRtpAudioSourceStats(audioLevel=");
            sb2.append(this.f332319a);
            sb2.append(", totalAudioEnergy=");
            sb2.append(this.f332320b);
            sb2.append(", totalSamplesDuration=");
            sb2.append(this.f332321c);
            sb2.append(", echoReturnLoss=");
            sb2.append(this.f332322d);
            sb2.append(", echoReturnLossEnhancement=");
            return com.avito.android.authorization.auto_recovery.phone_confirm.b.h(sb2, this.f332323e, ')');
        }

        public OutboundRtpAudioSourceStats(@l Double d12, @l Double d13, @l Double d14, @l Double d15, @l Double d16) {
            this.f332319a = d12;
            this.f332320b = d13;
            this.f332321c = d14;
            this.f332322d = d15;
            this.f332323e = d16;
        }
    }

    /* compiled from: StatsReport.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001bB\u0089\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u009d\u0001\b\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/avito/avcalls/android/stats/StatsReport$OutboundRtpAudioStats;", "", "Lcom/avito/avcalls/android/stats/StatsReport$Codec;", "codec", "Lcom/avito/avcalls/android/stats/StatsReport$OutboundRtpAudioSourceStats;", SearchParamsConverterKt.SOURCE, "Lkotlin/w0;", "ssrc", "packetsSent", "rtxSsrc", "retransmittedPacketsSent", "bytesSent", "headerBytesSent", "retransmittedBytesSent", "", "targetBitrate", "nackCount", "totalPacketSendDelay", "Lcom/avito/avcalls/android/stats/StatsReport$RemoteInboundRtpStats;", "remote", "<init>", "(Lcom/avito/avcalls/android/stats/StatsReport$Codec;Lcom/avito/avcalls/android/stats/StatsReport$OutboundRtpAudioSourceStats;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Lkotlin/w0;Ljava/lang/Double;Lcom/avito/avcalls/android/stats/StatsReport$RemoteInboundRtpStats;Lkotlin/jvm/internal/w;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILcom/avito/avcalls/android/stats/StatsReport$Codec;Lcom/avito/avcalls/android/stats/StatsReport$OutboundRtpAudioSourceStats;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Lkotlin/w0;Ljava/lang/Double;Lcom/avito/avcalls/android/stats/StatsReport$RemoteInboundRtpStats;Lkotlinx/serialization/internal/P0;Lkotlin/jvm/internal/w;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @w
    public static final /* data */ class OutboundRtpAudioStats {

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Codec f332324a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final OutboundRtpAudioSourceStats f332325b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final w0 f332326c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final w0 f332327d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final w0 f332328e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final w0 f332329f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final w0 f332330g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final w0 f332331h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final w0 f332332i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final Double f332333j;

        /* renamed from: k, reason: collision with root package name */
        @l
        public final w0 f332334k;

        /* renamed from: l, reason: collision with root package name */
        @l
        public final Double f332335l;

        /* renamed from: m, reason: collision with root package name */
        @l
        public final RemoteInboundRtpStats f332336m;

        /* compiled from: StatsReport.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/android/stats/StatsReport$OutboundRtpAudioStats$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/android/stats/StatsReport$OutboundRtpAudioStats;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
            this.f332324a = codec;
            this.f332325b = outboundRtpAudioSourceStats;
            this.f332326c = w0Var;
            this.f332327d = w0Var2;
            this.f332328e = w0Var3;
            this.f332329f = w0Var4;
            this.f332330g = w0Var5;
            this.f332331h = w0Var6;
            this.f332332i = w0Var7;
            this.f332333j = d12;
            this.f332334k = w0Var8;
            this.f332335l = d13;
            this.f332336m = remoteInboundRtpStats;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OutboundRtpAudioStats)) {
                return false;
            }
            OutboundRtpAudioStats outboundRtpAudioStats = (OutboundRtpAudioStats) obj;
            return L.f(this.f332324a, outboundRtpAudioStats.f332324a) && L.f(this.f332325b, outboundRtpAudioStats.f332325b) && L.f(this.f332326c, outboundRtpAudioStats.f332326c) && L.f(this.f332327d, outboundRtpAudioStats.f332327d) && L.f(this.f332328e, outboundRtpAudioStats.f332328e) && L.f(this.f332329f, outboundRtpAudioStats.f332329f) && L.f(this.f332330g, outboundRtpAudioStats.f332330g) && L.f(this.f332331h, outboundRtpAudioStats.f332331h) && L.f(this.f332332i, outboundRtpAudioStats.f332332i) && L.f(this.f332333j, outboundRtpAudioStats.f332333j) && L.f(this.f332334k, outboundRtpAudioStats.f332334k) && L.f(this.f332335l, outboundRtpAudioStats.f332335l) && L.f(this.f332336m, outboundRtpAudioStats.f332336m);
        }

        public final int hashCode() {
            Codec codec = this.f332324a;
            int iHashCode = (codec == null ? 0 : codec.hashCode()) * 31;
            OutboundRtpAudioSourceStats outboundRtpAudioSourceStats = this.f332325b;
            int iHashCode2 = (iHashCode + (outboundRtpAudioSourceStats == null ? 0 : outboundRtpAudioSourceStats.hashCode())) * 31;
            w0 w0Var = this.f332326c;
            int iHashCode3 = (iHashCode2 + (w0Var == null ? 0 : Long.hashCode(w0Var.f410663b))) * 31;
            w0 w0Var2 = this.f332327d;
            int iHashCode4 = (iHashCode3 + (w0Var2 == null ? 0 : Long.hashCode(w0Var2.f410663b))) * 31;
            w0 w0Var3 = this.f332328e;
            int iHashCode5 = (iHashCode4 + (w0Var3 == null ? 0 : Long.hashCode(w0Var3.f410663b))) * 31;
            w0 w0Var4 = this.f332329f;
            int iHashCode6 = (iHashCode5 + (w0Var4 == null ? 0 : Long.hashCode(w0Var4.f410663b))) * 31;
            w0 w0Var5 = this.f332330g;
            int iHashCode7 = (iHashCode6 + (w0Var5 == null ? 0 : Long.hashCode(w0Var5.f410663b))) * 31;
            w0 w0Var6 = this.f332331h;
            int iHashCode8 = (iHashCode7 + (w0Var6 == null ? 0 : Long.hashCode(w0Var6.f410663b))) * 31;
            w0 w0Var7 = this.f332332i;
            int iHashCode9 = (iHashCode8 + (w0Var7 == null ? 0 : Long.hashCode(w0Var7.f410663b))) * 31;
            Double d12 = this.f332333j;
            int iHashCode10 = (iHashCode9 + (d12 == null ? 0 : d12.hashCode())) * 31;
            w0 w0Var8 = this.f332334k;
            int iHashCode11 = (iHashCode10 + (w0Var8 == null ? 0 : Long.hashCode(w0Var8.f410663b))) * 31;
            Double d13 = this.f332335l;
            int iHashCode12 = (iHashCode11 + (d13 == null ? 0 : d13.hashCode())) * 31;
            RemoteInboundRtpStats remoteInboundRtpStats = this.f332336m;
            return iHashCode12 + (remoteInboundRtpStats != null ? remoteInboundRtpStats.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "OutboundRtpAudioStats(codec=" + this.f332324a + ", source=" + this.f332325b + ", ssrc=" + this.f332326c + ", packetsSent=" + this.f332327d + ", rtxSsrc=" + this.f332328e + ", retransmittedPacketsSent=" + this.f332329f + ", bytesSent=" + this.f332330g + ", headerBytesSent=" + this.f332331h + ", retransmittedBytesSent=" + this.f332332i + ", targetBitrate=" + this.f332333j + ", nackCount=" + this.f332334k + ", totalPacketSendDelay=" + this.f332335l + ", remote=" + this.f332336m + ')';
        }

        public OutboundRtpAudioStats(Codec codec, OutboundRtpAudioSourceStats outboundRtpAudioSourceStats, w0 w0Var, w0 w0Var2, w0 w0Var3, w0 w0Var4, w0 w0Var5, w0 w0Var6, w0 w0Var7, Double d12, w0 w0Var8, Double d13, RemoteInboundRtpStats remoteInboundRtpStats, C42822w c42822w) {
            this.f332324a = codec;
            this.f332325b = outboundRtpAudioSourceStats;
            this.f332326c = w0Var;
            this.f332327d = w0Var2;
            this.f332328e = w0Var3;
            this.f332329f = w0Var4;
            this.f332330g = w0Var5;
            this.f332331h = w0Var6;
            this.f332332i = w0Var7;
            this.f332333j = d12;
            this.f332334k = w0Var8;
            this.f332335l = d13;
            this.f332336m = remoteInboundRtpStats;
        }
    }

    /* compiled from: StatsReport.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u000fB/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/avito/avcalls/android/stats/StatsReport$OutboundRtpVideoSourceStats;", "", "Lkotlin/w0;", "width", "height", "", "framesPerSecond", "frames", "<init>", "(Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Lkotlin/w0;Lkotlin/jvm/internal/w;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Lkotlin/w0;Lkotlinx/serialization/internal/P0;Lkotlin/jvm/internal/w;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @w
    public static final /* data */ class OutboundRtpVideoSourceStats {

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        @l
        public final w0 f332337a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final w0 f332338b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Double f332339c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final w0 f332340d;

        /* compiled from: StatsReport.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/android/stats/StatsReport$OutboundRtpVideoSourceStats$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/android/stats/StatsReport$OutboundRtpVideoSourceStats;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
            this.f332337a = w0Var;
            this.f332338b = w0Var2;
            this.f332339c = d12;
            this.f332340d = w0Var3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OutboundRtpVideoSourceStats)) {
                return false;
            }
            OutboundRtpVideoSourceStats outboundRtpVideoSourceStats = (OutboundRtpVideoSourceStats) obj;
            return L.f(this.f332337a, outboundRtpVideoSourceStats.f332337a) && L.f(this.f332338b, outboundRtpVideoSourceStats.f332338b) && L.f(this.f332339c, outboundRtpVideoSourceStats.f332339c) && L.f(this.f332340d, outboundRtpVideoSourceStats.f332340d);
        }

        public final int hashCode() {
            w0 w0Var = this.f332337a;
            int iHashCode = (w0Var == null ? 0 : Long.hashCode(w0Var.f410663b)) * 31;
            w0 w0Var2 = this.f332338b;
            int iHashCode2 = (iHashCode + (w0Var2 == null ? 0 : Long.hashCode(w0Var2.f410663b))) * 31;
            Double d12 = this.f332339c;
            int iHashCode3 = (iHashCode2 + (d12 == null ? 0 : d12.hashCode())) * 31;
            w0 w0Var3 = this.f332340d;
            return iHashCode3 + (w0Var3 != null ? Long.hashCode(w0Var3.f410663b) : 0);
        }

        @k
        public final String toString() {
            return "OutboundRtpVideoSourceStats(width=" + this.f332337a + ", height=" + this.f332338b + ", framesPerSecond=" + this.f332339c + ", frames=" + this.f332340d + ')';
        }

        public OutboundRtpVideoSourceStats(w0 w0Var, w0 w0Var2, Double d12, w0 w0Var3, C42822w c42822w) {
            this.f332337a = w0Var;
            this.f332338b = w0Var2;
            this.f332339c = d12;
            this.f332340d = w0Var3;
        }
    }

    /* compiled from: StatsReport.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 /2\u00020\u0001:\u00020/B½\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010 \u001a\u0004\u0018\u00010\b\u0012\b\u0010!\u001a\u0004\u0018\u00010\b\u0012\b\u0010\"\u001a\u0004\u0018\u00010\r\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010%\u001a\u0004\u0018\u00010\b\u0012\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)BÑ\u0002\b\u0011\u0012\u0006\u0010+\u001a\u00020*\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010 \u001a\u0004\u0018\u00010\b\u0012\b\u0010!\u001a\u0004\u0018\u00010\b\u0012\b\u0010\"\u001a\u0004\u0018\u00010\r\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010%\u001a\u0004\u0018\u00010\b\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b(\u0010.¨\u00061"}, d2 = {"Lcom/avito/avcalls/android/stats/StatsReport$OutboundRtpVideoStats;", "", "Lcom/avito/avcalls/android/stats/StatsReport$OutboundRtpVideoSourceStats;", SearchParamsConverterKt.SOURCE, "Lcom/avito/avcalls/android/stats/StatsReport$Codec;", "codec", "Lkotlin/w0;", "ssrc", "", "rid", "framesSent", "frameWidth", "frameHeight", "", "framesPerSecond", "framesEncoded", "keyFramesEncoded", "pliCount", "firCount", "hugeFramesSent", "totalEncodeTime", "nackCount", "packetsSent", "bytesSent", "retransmittedPacketsSent", "retransmittedBytesSent", "rtxSsrc", "headerBytesSent", "targetBitrate", "totalEncodedBytesTarget", "qpSum", "qualityLimitationResolutionChanges", "qualityLimitationReason", "encoderImplementation", "totalPacketSendDelay", "", "powerEfficientEncoder", "scalabilityMode", "Lcom/avito/avcalls/android/stats/StatsReport$RemoteInboundRtpStats;", "remote", "<init>", "(Lcom/avito/avcalls/android/stats/StatsReport$OutboundRtpVideoSourceStats;Lcom/avito/avcalls/android/stats/StatsReport$Codec;Lkotlin/w0;Ljava/lang/String;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/avcalls/android/stats/StatsReport$RemoteInboundRtpStats;Lkotlin/jvm/internal/w;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILcom/avito/avcalls/android/stats/StatsReport$OutboundRtpVideoSourceStats;Lcom/avito/avcalls/android/stats/StatsReport$Codec;Lkotlin/w0;Ljava/lang/String;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/avcalls/android/stats/StatsReport$RemoteInboundRtpStats;Lkotlinx/serialization/internal/P0;Lkotlin/jvm/internal/w;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @w
    public static final /* data */ class OutboundRtpVideoStats {

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: A, reason: collision with root package name */
        @l
        public final String f332341A;

        /* renamed from: B, reason: collision with root package name */
        @l
        public final Double f332342B;

        /* renamed from: C, reason: collision with root package name */
        @l
        public final Boolean f332343C;

        /* renamed from: D, reason: collision with root package name */
        @l
        public final String f332344D;

        /* renamed from: E, reason: collision with root package name */
        @l
        public final RemoteInboundRtpStats f332345E;

        /* renamed from: a, reason: collision with root package name */
        @l
        public final OutboundRtpVideoSourceStats f332346a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Codec f332347b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final w0 f332348c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f332349d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final w0 f332350e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final w0 f332351f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final w0 f332352g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final Double f332353h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final w0 f332354i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final w0 f332355j;

        /* renamed from: k, reason: collision with root package name */
        @l
        public final w0 f332356k;

        /* renamed from: l, reason: collision with root package name */
        @l
        public final w0 f332357l;

        /* renamed from: m, reason: collision with root package name */
        @l
        public final w0 f332358m;

        /* renamed from: n, reason: collision with root package name */
        @l
        public final Double f332359n;

        /* renamed from: o, reason: collision with root package name */
        @l
        public final w0 f332360o;

        /* renamed from: p, reason: collision with root package name */
        @l
        public final w0 f332361p;

        /* renamed from: q, reason: collision with root package name */
        @l
        public final w0 f332362q;

        /* renamed from: r, reason: collision with root package name */
        @l
        public final w0 f332363r;

        /* renamed from: s, reason: collision with root package name */
        @l
        public final w0 f332364s;

        /* renamed from: t, reason: collision with root package name */
        @l
        public final w0 f332365t;

        /* renamed from: u, reason: collision with root package name */
        @l
        public final w0 f332366u;

        /* renamed from: v, reason: collision with root package name */
        @l
        public final Double f332367v;

        /* renamed from: w, reason: collision with root package name */
        @l
        public final w0 f332368w;

        /* renamed from: x, reason: collision with root package name */
        @l
        public final w0 f332369x;

        /* renamed from: y, reason: collision with root package name */
        @l
        public final w0 f332370y;

        /* renamed from: z, reason: collision with root package name */
        @l
        public final String f332371z;

        /* compiled from: StatsReport.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/android/stats/StatsReport$OutboundRtpVideoStats$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/android/stats/StatsReport$OutboundRtpVideoStats;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
            this.f332346a = outboundRtpVideoSourceStats;
            this.f332347b = codec;
            this.f332348c = w0Var;
            this.f332349d = str;
            this.f332350e = w0Var2;
            this.f332351f = w0Var3;
            this.f332352g = w0Var4;
            this.f332353h = d12;
            this.f332354i = w0Var5;
            this.f332355j = w0Var6;
            this.f332356k = w0Var7;
            this.f332357l = w0Var8;
            this.f332358m = w0Var9;
            this.f332359n = d13;
            this.f332360o = w0Var10;
            this.f332361p = w0Var11;
            this.f332362q = w0Var12;
            this.f332363r = w0Var13;
            this.f332364s = w0Var14;
            this.f332365t = w0Var15;
            this.f332366u = w0Var16;
            this.f332367v = d14;
            this.f332368w = w0Var17;
            this.f332369x = w0Var18;
            this.f332370y = w0Var19;
            this.f332371z = str2;
            this.f332341A = str3;
            this.f332342B = d15;
            this.f332343C = bool;
            this.f332344D = str4;
            this.f332345E = remoteInboundRtpStats;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OutboundRtpVideoStats)) {
                return false;
            }
            OutboundRtpVideoStats outboundRtpVideoStats = (OutboundRtpVideoStats) obj;
            return L.f(this.f332346a, outboundRtpVideoStats.f332346a) && L.f(this.f332347b, outboundRtpVideoStats.f332347b) && L.f(this.f332348c, outboundRtpVideoStats.f332348c) && L.f(this.f332349d, outboundRtpVideoStats.f332349d) && L.f(this.f332350e, outboundRtpVideoStats.f332350e) && L.f(this.f332351f, outboundRtpVideoStats.f332351f) && L.f(this.f332352g, outboundRtpVideoStats.f332352g) && L.f(this.f332353h, outboundRtpVideoStats.f332353h) && L.f(this.f332354i, outboundRtpVideoStats.f332354i) && L.f(this.f332355j, outboundRtpVideoStats.f332355j) && L.f(this.f332356k, outboundRtpVideoStats.f332356k) && L.f(this.f332357l, outboundRtpVideoStats.f332357l) && L.f(this.f332358m, outboundRtpVideoStats.f332358m) && L.f(this.f332359n, outboundRtpVideoStats.f332359n) && L.f(this.f332360o, outboundRtpVideoStats.f332360o) && L.f(this.f332361p, outboundRtpVideoStats.f332361p) && L.f(this.f332362q, outboundRtpVideoStats.f332362q) && L.f(this.f332363r, outboundRtpVideoStats.f332363r) && L.f(this.f332364s, outboundRtpVideoStats.f332364s) && L.f(this.f332365t, outboundRtpVideoStats.f332365t) && L.f(this.f332366u, outboundRtpVideoStats.f332366u) && L.f(this.f332367v, outboundRtpVideoStats.f332367v) && L.f(this.f332368w, outboundRtpVideoStats.f332368w) && L.f(this.f332369x, outboundRtpVideoStats.f332369x) && L.f(this.f332370y, outboundRtpVideoStats.f332370y) && L.f(this.f332371z, outboundRtpVideoStats.f332371z) && L.f(this.f332341A, outboundRtpVideoStats.f332341A) && L.f(this.f332342B, outboundRtpVideoStats.f332342B) && L.f(this.f332343C, outboundRtpVideoStats.f332343C) && L.f(this.f332344D, outboundRtpVideoStats.f332344D) && L.f(this.f332345E, outboundRtpVideoStats.f332345E);
        }

        public final int hashCode() {
            OutboundRtpVideoSourceStats outboundRtpVideoSourceStats = this.f332346a;
            int iHashCode = (outboundRtpVideoSourceStats == null ? 0 : outboundRtpVideoSourceStats.hashCode()) * 31;
            Codec codec = this.f332347b;
            int iHashCode2 = (iHashCode + (codec == null ? 0 : codec.hashCode())) * 31;
            w0 w0Var = this.f332348c;
            int iHashCode3 = (iHashCode2 + (w0Var == null ? 0 : Long.hashCode(w0Var.f410663b))) * 31;
            String str = this.f332349d;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            w0 w0Var2 = this.f332350e;
            int iHashCode5 = (iHashCode4 + (w0Var2 == null ? 0 : Long.hashCode(w0Var2.f410663b))) * 31;
            w0 w0Var3 = this.f332351f;
            int iHashCode6 = (iHashCode5 + (w0Var3 == null ? 0 : Long.hashCode(w0Var3.f410663b))) * 31;
            w0 w0Var4 = this.f332352g;
            int iHashCode7 = (iHashCode6 + (w0Var4 == null ? 0 : Long.hashCode(w0Var4.f410663b))) * 31;
            Double d12 = this.f332353h;
            int iHashCode8 = (iHashCode7 + (d12 == null ? 0 : d12.hashCode())) * 31;
            w0 w0Var5 = this.f332354i;
            int iHashCode9 = (iHashCode8 + (w0Var5 == null ? 0 : Long.hashCode(w0Var5.f410663b))) * 31;
            w0 w0Var6 = this.f332355j;
            int iHashCode10 = (iHashCode9 + (w0Var6 == null ? 0 : Long.hashCode(w0Var6.f410663b))) * 31;
            w0 w0Var7 = this.f332356k;
            int iHashCode11 = (iHashCode10 + (w0Var7 == null ? 0 : Long.hashCode(w0Var7.f410663b))) * 31;
            w0 w0Var8 = this.f332357l;
            int iHashCode12 = (iHashCode11 + (w0Var8 == null ? 0 : Long.hashCode(w0Var8.f410663b))) * 31;
            w0 w0Var9 = this.f332358m;
            int iHashCode13 = (iHashCode12 + (w0Var9 == null ? 0 : Long.hashCode(w0Var9.f410663b))) * 31;
            Double d13 = this.f332359n;
            int iHashCode14 = (iHashCode13 + (d13 == null ? 0 : d13.hashCode())) * 31;
            w0 w0Var10 = this.f332360o;
            int iHashCode15 = (iHashCode14 + (w0Var10 == null ? 0 : Long.hashCode(w0Var10.f410663b))) * 31;
            w0 w0Var11 = this.f332361p;
            int iHashCode16 = (iHashCode15 + (w0Var11 == null ? 0 : Long.hashCode(w0Var11.f410663b))) * 31;
            w0 w0Var12 = this.f332362q;
            int iHashCode17 = (iHashCode16 + (w0Var12 == null ? 0 : Long.hashCode(w0Var12.f410663b))) * 31;
            w0 w0Var13 = this.f332363r;
            int iHashCode18 = (iHashCode17 + (w0Var13 == null ? 0 : Long.hashCode(w0Var13.f410663b))) * 31;
            w0 w0Var14 = this.f332364s;
            int iHashCode19 = (iHashCode18 + (w0Var14 == null ? 0 : Long.hashCode(w0Var14.f410663b))) * 31;
            w0 w0Var15 = this.f332365t;
            int iHashCode20 = (iHashCode19 + (w0Var15 == null ? 0 : Long.hashCode(w0Var15.f410663b))) * 31;
            w0 w0Var16 = this.f332366u;
            int iHashCode21 = (iHashCode20 + (w0Var16 == null ? 0 : Long.hashCode(w0Var16.f410663b))) * 31;
            Double d14 = this.f332367v;
            int iHashCode22 = (iHashCode21 + (d14 == null ? 0 : d14.hashCode())) * 31;
            w0 w0Var17 = this.f332368w;
            int iHashCode23 = (iHashCode22 + (w0Var17 == null ? 0 : Long.hashCode(w0Var17.f410663b))) * 31;
            w0 w0Var18 = this.f332369x;
            int iHashCode24 = (iHashCode23 + (w0Var18 == null ? 0 : Long.hashCode(w0Var18.f410663b))) * 31;
            w0 w0Var19 = this.f332370y;
            int iHashCode25 = (iHashCode24 + (w0Var19 == null ? 0 : Long.hashCode(w0Var19.f410663b))) * 31;
            String str2 = this.f332371z;
            int iHashCode26 = (iHashCode25 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f332341A;
            int iHashCode27 = (iHashCode26 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Double d15 = this.f332342B;
            int iHashCode28 = (iHashCode27 + (d15 == null ? 0 : d15.hashCode())) * 31;
            Boolean bool = this.f332343C;
            int iHashCode29 = (iHashCode28 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str4 = this.f332344D;
            int iHashCode30 = (iHashCode29 + (str4 == null ? 0 : str4.hashCode())) * 31;
            RemoteInboundRtpStats remoteInboundRtpStats = this.f332345E;
            return iHashCode30 + (remoteInboundRtpStats != null ? remoteInboundRtpStats.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "OutboundRtpVideoStats(source=" + this.f332346a + ", codec=" + this.f332347b + ", ssrc=" + this.f332348c + ", rid=" + this.f332349d + ", framesSent=" + this.f332350e + ", frameWidth=" + this.f332351f + ", frameHeight=" + this.f332352g + ", framesPerSecond=" + this.f332353h + ", framesEncoded=" + this.f332354i + ", keyFramesEncoded=" + this.f332355j + ", pliCount=" + this.f332356k + ", firCount=" + this.f332357l + ", hugeFramesSent=" + this.f332358m + ", totalEncodeTime=" + this.f332359n + ", nackCount=" + this.f332360o + ", packetsSent=" + this.f332361p + ", bytesSent=" + this.f332362q + ", retransmittedPacketsSent=" + this.f332363r + ", retransmittedBytesSent=" + this.f332364s + ", rtxSsrc=" + this.f332365t + ", headerBytesSent=" + this.f332366u + ", targetBitrate=" + this.f332367v + ", totalEncodedBytesTarget=" + this.f332368w + ", qpSum=" + this.f332369x + ", qualityLimitationResolutionChanges=" + this.f332370y + ", qualityLimitationReason=" + this.f332371z + ", encoderImplementation=" + this.f332341A + ", totalPacketSendDelay=" + this.f332342B + ", powerEfficientEncoder=" + this.f332343C + ", scalabilityMode=" + this.f332344D + ", remote=" + this.f332345E + ')';
        }

        public OutboundRtpVideoStats(OutboundRtpVideoSourceStats outboundRtpVideoSourceStats, Codec codec, w0 w0Var, String str, w0 w0Var2, w0 w0Var3, w0 w0Var4, Double d12, w0 w0Var5, w0 w0Var6, w0 w0Var7, w0 w0Var8, w0 w0Var9, Double d13, w0 w0Var10, w0 w0Var11, w0 w0Var12, w0 w0Var13, w0 w0Var14, w0 w0Var15, w0 w0Var16, Double d14, w0 w0Var17, w0 w0Var18, w0 w0Var19, String str2, String str3, Double d15, Boolean bool, String str4, RemoteInboundRtpStats remoteInboundRtpStats, C42822w c42822w) {
            this.f332346a = outboundRtpVideoSourceStats;
            this.f332347b = codec;
            this.f332348c = w0Var;
            this.f332349d = str;
            this.f332350e = w0Var2;
            this.f332351f = w0Var3;
            this.f332352g = w0Var4;
            this.f332353h = d12;
            this.f332354i = w0Var5;
            this.f332355j = w0Var6;
            this.f332356k = w0Var7;
            this.f332357l = w0Var8;
            this.f332358m = w0Var9;
            this.f332359n = d13;
            this.f332360o = w0Var10;
            this.f332361p = w0Var11;
            this.f332362q = w0Var12;
            this.f332363r = w0Var13;
            this.f332364s = w0Var14;
            this.f332365t = w0Var15;
            this.f332366u = w0Var16;
            this.f332367v = d14;
            this.f332368w = w0Var17;
            this.f332369x = w0Var18;
            this.f332370y = w0Var19;
            this.f332371z = str2;
            this.f332341A = str3;
            this.f332342B = d15;
            this.f332343C = bool;
            this.f332344D = str4;
            this.f332345E = remoteInboundRtpStats;
        }
    }

    /* compiled from: StatsReport.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0012BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBW\b\u0011\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/avito/avcalls/android/stats/StatsReport$RemoteInboundRtpStats;", "", "", "jitter", "", "packetsLost", "roundTripTime", "fractionLost", "totalRoundTripTime", "Lkotlin/w0;", "roundTripTimeMeasurements", "<init>", "(Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/w0;Lkotlin/jvm/internal/w;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/w0;Lkotlinx/serialization/internal/P0;Lkotlin/jvm/internal/w;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @w
    public static final /* data */ class RemoteInboundRtpStats {

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Double f332372a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Long f332373b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Double f332374c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Double f332375d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Double f332376e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final w0 f332377f;

        /* compiled from: StatsReport.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/android/stats/StatsReport$RemoteInboundRtpStats$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/android/stats/StatsReport$RemoteInboundRtpStats;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
            this.f332372a = d12;
            this.f332373b = l12;
            this.f332374c = d13;
            this.f332375d = d14;
            this.f332376e = d15;
            this.f332377f = w0Var;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoteInboundRtpStats)) {
                return false;
            }
            RemoteInboundRtpStats remoteInboundRtpStats = (RemoteInboundRtpStats) obj;
            return L.f(this.f332372a, remoteInboundRtpStats.f332372a) && L.f(this.f332373b, remoteInboundRtpStats.f332373b) && L.f(this.f332374c, remoteInboundRtpStats.f332374c) && L.f(this.f332375d, remoteInboundRtpStats.f332375d) && L.f(this.f332376e, remoteInboundRtpStats.f332376e) && L.f(this.f332377f, remoteInboundRtpStats.f332377f);
        }

        public final int hashCode() {
            Double d12 = this.f332372a;
            int iHashCode = (d12 == null ? 0 : d12.hashCode()) * 31;
            Long l12 = this.f332373b;
            int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
            Double d13 = this.f332374c;
            int iHashCode3 = (iHashCode2 + (d13 == null ? 0 : d13.hashCode())) * 31;
            Double d14 = this.f332375d;
            int iHashCode4 = (iHashCode3 + (d14 == null ? 0 : d14.hashCode())) * 31;
            Double d15 = this.f332376e;
            int iHashCode5 = (iHashCode4 + (d15 == null ? 0 : d15.hashCode())) * 31;
            w0 w0Var = this.f332377f;
            return iHashCode5 + (w0Var != null ? Long.hashCode(w0Var.f410663b) : 0);
        }

        @k
        public final String toString() {
            return "RemoteInboundRtpStats(jitter=" + this.f332372a + ", packetsLost=" + this.f332373b + ", roundTripTime=" + this.f332374c + ", fractionLost=" + this.f332375d + ", totalRoundTripTime=" + this.f332376e + ", roundTripTimeMeasurements=" + this.f332377f + ')';
        }

        public RemoteInboundRtpStats(Double d12, Long l12, Double d13, Double d14, Double d15, w0 w0Var, C42822w c42822w) {
            this.f332372a = d12;
            this.f332373b = l12;
            this.f332374c = d13;
            this.f332375d = d14;
            this.f332376e = d15;
            this.f332377f = w0Var;
        }
    }

    /* compiled from: StatsReport.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0011BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bBW\b\u0011\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/avito/avcalls/android/stats/StatsReport$RemoteOutboundRtpStats;", "", "Lkotlin/w0;", "packetsSent", "bytesSent", "reportsSent", "", "roundTripTime", "roundTripTimeMeasurements", "totalRoundTripTime", "<init>", "(Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Lkotlin/w0;Ljava/lang/Double;Lkotlin/jvm/internal/w;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Lkotlin/w0;Ljava/lang/Double;Lkotlinx/serialization/internal/P0;Lkotlin/jvm/internal/w;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @w
    public static final /* data */ class RemoteOutboundRtpStats {

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        @l
        public final w0 f332378a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final w0 f332379b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final w0 f332380c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Double f332381d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final w0 f332382e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final Double f332383f;

        /* compiled from: StatsReport.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/android/stats/StatsReport$RemoteOutboundRtpStats$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/android/stats/StatsReport$RemoteOutboundRtpStats;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
            this.f332378a = w0Var;
            this.f332379b = w0Var2;
            this.f332380c = w0Var3;
            this.f332381d = d12;
            this.f332382e = w0Var4;
            this.f332383f = d13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoteOutboundRtpStats)) {
                return false;
            }
            RemoteOutboundRtpStats remoteOutboundRtpStats = (RemoteOutboundRtpStats) obj;
            return L.f(this.f332378a, remoteOutboundRtpStats.f332378a) && L.f(this.f332379b, remoteOutboundRtpStats.f332379b) && L.f(this.f332380c, remoteOutboundRtpStats.f332380c) && L.f(this.f332381d, remoteOutboundRtpStats.f332381d) && L.f(this.f332382e, remoteOutboundRtpStats.f332382e) && L.f(this.f332383f, remoteOutboundRtpStats.f332383f);
        }

        public final int hashCode() {
            w0 w0Var = this.f332378a;
            int iHashCode = (w0Var == null ? 0 : Long.hashCode(w0Var.f410663b)) * 31;
            w0 w0Var2 = this.f332379b;
            int iHashCode2 = (iHashCode + (w0Var2 == null ? 0 : Long.hashCode(w0Var2.f410663b))) * 31;
            w0 w0Var3 = this.f332380c;
            int iHashCode3 = (iHashCode2 + (w0Var3 == null ? 0 : Long.hashCode(w0Var3.f410663b))) * 31;
            Double d12 = this.f332381d;
            int iHashCode4 = (iHashCode3 + (d12 == null ? 0 : d12.hashCode())) * 31;
            w0 w0Var4 = this.f332382e;
            int iHashCode5 = (iHashCode4 + (w0Var4 == null ? 0 : Long.hashCode(w0Var4.f410663b))) * 31;
            Double d13 = this.f332383f;
            return iHashCode5 + (d13 != null ? d13.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RemoteOutboundRtpStats(packetsSent=");
            sb2.append(this.f332378a);
            sb2.append(", bytesSent=");
            sb2.append(this.f332379b);
            sb2.append(", reportsSent=");
            sb2.append(this.f332380c);
            sb2.append(", roundTripTime=");
            sb2.append(this.f332381d);
            sb2.append(", roundTripTimeMeasurements=");
            sb2.append(this.f332382e);
            sb2.append(", totalRoundTripTime=");
            return com.avito.android.authorization.auto_recovery.phone_confirm.b.h(sb2, this.f332383f, ')');
        }

        public RemoteOutboundRtpStats(w0 w0Var, w0 w0Var2, w0 w0Var3, Double d12, w0 w0Var4, Double d13, C42822w c42822w) {
            this.f332378a = w0Var;
            this.f332379b = w0Var2;
            this.f332380c = w0Var3;
            this.f332381d = d12;
            this.f332382e = w0Var4;
            this.f332383f = d13;
        }
    }

    /* compiled from: StatsReport.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 !2\u00020\u0001:\u0002\"!BÅ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001a\u0010\u001bBÙ\u0001\b\u0011\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001a\u0010 ¨\u0006#"}, d2 = {"Lcom/avito/avcalls/android/stats/StatsReport$SelectedCandidatePairStats;", "", "Lcom/avito/avcalls/android/stats/StatsReport$IceCandidateStats;", "localCandidate", "remoteCandidate", "", VoiceInfo.STATE, "", "writable", "Lkotlin/w0;", "packetsSent", "packetsReceived", "bytesSent", "bytesReceived", "", "totalRoundTripTime", "currentRoundTripTime", "availableOutgoingBitrate", "availableIncomingBitrate", "requestsReceived", "requestsSent", "responsesReceived", "responsesSent", "consentRequestsSent", "packetsDiscardedOnSend", "bytesDiscardedOnSend", "<init>", "(Lcom/avito/avcalls/android/stats/StatsReport$IceCandidateStats;Lcom/avito/avcalls/android/stats/StatsReport$IceCandidateStats;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/jvm/internal/w;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILcom/avito/avcalls/android/stats/StatsReport$IceCandidateStats;Lcom/avito/avcalls/android/stats/StatsReport$IceCandidateStats;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlinx/serialization/internal/P0;Lkotlin/jvm/internal/w;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @w
    public static final /* data */ class SelectedCandidatePairStats {

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        @l
        public final IceCandidateStats f332384a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final IceCandidateStats f332385b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f332386c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Boolean f332387d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final w0 f332388e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final w0 f332389f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final w0 f332390g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final w0 f332391h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final Double f332392i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final Double f332393j;

        /* renamed from: k, reason: collision with root package name */
        @l
        public final Double f332394k;

        /* renamed from: l, reason: collision with root package name */
        @l
        public final Double f332395l;

        /* renamed from: m, reason: collision with root package name */
        @l
        public final w0 f332396m;

        /* renamed from: n, reason: collision with root package name */
        @l
        public final w0 f332397n;

        /* renamed from: o, reason: collision with root package name */
        @l
        public final w0 f332398o;

        /* renamed from: p, reason: collision with root package name */
        @l
        public final w0 f332399p;

        /* renamed from: q, reason: collision with root package name */
        @l
        public final w0 f332400q;

        /* renamed from: r, reason: collision with root package name */
        @l
        public final w0 f332401r;

        /* renamed from: s, reason: collision with root package name */
        @l
        public final w0 f332402s;

        /* compiled from: StatsReport.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/android/stats/StatsReport$SelectedCandidatePairStats$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/android/stats/StatsReport$SelectedCandidatePairStats;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
            this.f332384a = iceCandidateStats;
            this.f332385b = iceCandidateStats2;
            this.f332386c = str;
            this.f332387d = bool;
            this.f332388e = w0Var;
            this.f332389f = w0Var2;
            this.f332390g = w0Var3;
            this.f332391h = w0Var4;
            this.f332392i = d12;
            this.f332393j = d13;
            this.f332394k = d14;
            this.f332395l = d15;
            this.f332396m = w0Var5;
            this.f332397n = w0Var6;
            this.f332398o = w0Var7;
            this.f332399p = w0Var8;
            this.f332400q = w0Var9;
            this.f332401r = w0Var10;
            this.f332402s = w0Var11;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectedCandidatePairStats)) {
                return false;
            }
            SelectedCandidatePairStats selectedCandidatePairStats = (SelectedCandidatePairStats) obj;
            return L.f(this.f332384a, selectedCandidatePairStats.f332384a) && L.f(this.f332385b, selectedCandidatePairStats.f332385b) && L.f(this.f332386c, selectedCandidatePairStats.f332386c) && L.f(this.f332387d, selectedCandidatePairStats.f332387d) && L.f(this.f332388e, selectedCandidatePairStats.f332388e) && L.f(this.f332389f, selectedCandidatePairStats.f332389f) && L.f(this.f332390g, selectedCandidatePairStats.f332390g) && L.f(this.f332391h, selectedCandidatePairStats.f332391h) && L.f(this.f332392i, selectedCandidatePairStats.f332392i) && L.f(this.f332393j, selectedCandidatePairStats.f332393j) && L.f(this.f332394k, selectedCandidatePairStats.f332394k) && L.f(this.f332395l, selectedCandidatePairStats.f332395l) && L.f(this.f332396m, selectedCandidatePairStats.f332396m) && L.f(this.f332397n, selectedCandidatePairStats.f332397n) && L.f(this.f332398o, selectedCandidatePairStats.f332398o) && L.f(this.f332399p, selectedCandidatePairStats.f332399p) && L.f(this.f332400q, selectedCandidatePairStats.f332400q) && L.f(this.f332401r, selectedCandidatePairStats.f332401r) && L.f(this.f332402s, selectedCandidatePairStats.f332402s);
        }

        public final int hashCode() {
            IceCandidateStats iceCandidateStats = this.f332384a;
            int iHashCode = (iceCandidateStats == null ? 0 : iceCandidateStats.hashCode()) * 31;
            IceCandidateStats iceCandidateStats2 = this.f332385b;
            int iHashCode2 = (iHashCode + (iceCandidateStats2 == null ? 0 : iceCandidateStats2.hashCode())) * 31;
            String str = this.f332386c;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.f332387d;
            int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            w0 w0Var = this.f332388e;
            int iHashCode5 = (iHashCode4 + (w0Var == null ? 0 : Long.hashCode(w0Var.f410663b))) * 31;
            w0 w0Var2 = this.f332389f;
            int iHashCode6 = (iHashCode5 + (w0Var2 == null ? 0 : Long.hashCode(w0Var2.f410663b))) * 31;
            w0 w0Var3 = this.f332390g;
            int iHashCode7 = (iHashCode6 + (w0Var3 == null ? 0 : Long.hashCode(w0Var3.f410663b))) * 31;
            w0 w0Var4 = this.f332391h;
            int iHashCode8 = (iHashCode7 + (w0Var4 == null ? 0 : Long.hashCode(w0Var4.f410663b))) * 31;
            Double d12 = this.f332392i;
            int iHashCode9 = (iHashCode8 + (d12 == null ? 0 : d12.hashCode())) * 31;
            Double d13 = this.f332393j;
            int iHashCode10 = (iHashCode9 + (d13 == null ? 0 : d13.hashCode())) * 31;
            Double d14 = this.f332394k;
            int iHashCode11 = (iHashCode10 + (d14 == null ? 0 : d14.hashCode())) * 31;
            Double d15 = this.f332395l;
            int iHashCode12 = (iHashCode11 + (d15 == null ? 0 : d15.hashCode())) * 31;
            w0 w0Var5 = this.f332396m;
            int iHashCode13 = (iHashCode12 + (w0Var5 == null ? 0 : Long.hashCode(w0Var5.f410663b))) * 31;
            w0 w0Var6 = this.f332397n;
            int iHashCode14 = (iHashCode13 + (w0Var6 == null ? 0 : Long.hashCode(w0Var6.f410663b))) * 31;
            w0 w0Var7 = this.f332398o;
            int iHashCode15 = (iHashCode14 + (w0Var7 == null ? 0 : Long.hashCode(w0Var7.f410663b))) * 31;
            w0 w0Var8 = this.f332399p;
            int iHashCode16 = (iHashCode15 + (w0Var8 == null ? 0 : Long.hashCode(w0Var8.f410663b))) * 31;
            w0 w0Var9 = this.f332400q;
            int iHashCode17 = (iHashCode16 + (w0Var9 == null ? 0 : Long.hashCode(w0Var9.f410663b))) * 31;
            w0 w0Var10 = this.f332401r;
            int iHashCode18 = (iHashCode17 + (w0Var10 == null ? 0 : Long.hashCode(w0Var10.f410663b))) * 31;
            w0 w0Var11 = this.f332402s;
            return iHashCode18 + (w0Var11 != null ? Long.hashCode(w0Var11.f410663b) : 0);
        }

        @k
        public final String toString() {
            return "SelectedCandidatePairStats(localCandidate=" + this.f332384a + ", remoteCandidate=" + this.f332385b + ", state=" + this.f332386c + ", writable=" + this.f332387d + ", packetsSent=" + this.f332388e + ", packetsReceived=" + this.f332389f + ", bytesSent=" + this.f332390g + ", bytesReceived=" + this.f332391h + ", totalRoundTripTime=" + this.f332392i + ", currentRoundTripTime=" + this.f332393j + ", availableOutgoingBitrate=" + this.f332394k + ", availableIncomingBitrate=" + this.f332395l + ", requestsReceived=" + this.f332396m + ", requestsSent=" + this.f332397n + ", responsesReceived=" + this.f332398o + ", responsesSent=" + this.f332399p + ", consentRequestsSent=" + this.f332400q + ", packetsDiscardedOnSend=" + this.f332401r + ", bytesDiscardedOnSend=" + this.f332402s + ')';
        }

        public SelectedCandidatePairStats(IceCandidateStats iceCandidateStats, IceCandidateStats iceCandidateStats2, String str, Boolean bool, w0 w0Var, w0 w0Var2, w0 w0Var3, w0 w0Var4, Double d12, Double d13, Double d14, Double d15, w0 w0Var5, w0 w0Var6, w0 w0Var7, w0 w0Var8, w0 w0Var9, w0 w0Var10, w0 w0Var11, C42822w c42822w) {
            this.f332384a = iceCandidateStats;
            this.f332385b = iceCandidateStats2;
            this.f332386c = str;
            this.f332387d = bool;
            this.f332388e = w0Var;
            this.f332389f = w0Var2;
            this.f332390g = w0Var3;
            this.f332391h = w0Var4;
            this.f332392i = d12;
            this.f332393j = d13;
            this.f332394k = d14;
            this.f332395l = d15;
            this.f332396m = w0Var5;
            this.f332397n = w0Var6;
            this.f332398o = w0Var7;
            this.f332399p = w0Var8;
            this.f332400q = w0Var9;
            this.f332401r = w0Var10;
            this.f332402s = w0Var11;
        }
    }

    /* compiled from: StatsReport.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0016Bk\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B\u007f\b\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/avito/avcalls/android/stats/StatsReport$TransportStats;", "", "Lkotlin/w0;", "bytesSent", "packetsSent", "bytesReceived", "packetsReceived", "selectedCandidatePairChanges", "", "dtlsState", "dtlsRole", "iceState", "iceRole", "Lcom/avito/avcalls/android/stats/StatsReport$SelectedCandidatePairStats;", "selectedCandidatePair", "<init>", "(Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/avcalls/android/stats/StatsReport$SelectedCandidatePairStats;Lkotlin/jvm/internal/w;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Lkotlin/w0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/avcalls/android/stats/StatsReport$SelectedCandidatePairStats;Lkotlinx/serialization/internal/P0;Lkotlin/jvm/internal/w;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @w
    public static final /* data */ class TransportStats {

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        @l
        public final w0 f332403a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final w0 f332404b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final w0 f332405c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final w0 f332406d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final w0 f332407e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f332408f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final String f332409g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final String f332410h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final String f332411i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final SelectedCandidatePairStats f332412j;

        /* compiled from: StatsReport.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/android/stats/StatsReport$TransportStats$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/android/stats/StatsReport$TransportStats;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
            this.f332403a = w0Var;
            this.f332404b = w0Var2;
            this.f332405c = w0Var3;
            this.f332406d = w0Var4;
            this.f332407e = w0Var5;
            this.f332408f = str;
            this.f332409g = str2;
            this.f332410h = str3;
            this.f332411i = str4;
            this.f332412j = selectedCandidatePairStats;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TransportStats)) {
                return false;
            }
            TransportStats transportStats = (TransportStats) obj;
            return L.f(this.f332403a, transportStats.f332403a) && L.f(this.f332404b, transportStats.f332404b) && L.f(this.f332405c, transportStats.f332405c) && L.f(this.f332406d, transportStats.f332406d) && L.f(this.f332407e, transportStats.f332407e) && L.f(this.f332408f, transportStats.f332408f) && L.f(this.f332409g, transportStats.f332409g) && L.f(this.f332410h, transportStats.f332410h) && L.f(this.f332411i, transportStats.f332411i) && L.f(this.f332412j, transportStats.f332412j);
        }

        public final int hashCode() {
            w0 w0Var = this.f332403a;
            int iHashCode = (w0Var == null ? 0 : Long.hashCode(w0Var.f410663b)) * 31;
            w0 w0Var2 = this.f332404b;
            int iHashCode2 = (iHashCode + (w0Var2 == null ? 0 : Long.hashCode(w0Var2.f410663b))) * 31;
            w0 w0Var3 = this.f332405c;
            int iHashCode3 = (iHashCode2 + (w0Var3 == null ? 0 : Long.hashCode(w0Var3.f410663b))) * 31;
            w0 w0Var4 = this.f332406d;
            int iHashCode4 = (iHashCode3 + (w0Var4 == null ? 0 : Long.hashCode(w0Var4.f410663b))) * 31;
            w0 w0Var5 = this.f332407e;
            int iHashCode5 = (iHashCode4 + (w0Var5 == null ? 0 : Long.hashCode(w0Var5.f410663b))) * 31;
            String str = this.f332408f;
            int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f332409g;
            int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f332410h;
            int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f332411i;
            int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
            SelectedCandidatePairStats selectedCandidatePairStats = this.f332412j;
            return iHashCode9 + (selectedCandidatePairStats != null ? selectedCandidatePairStats.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "TransportStats(bytesSent=" + this.f332403a + ", packetsSent=" + this.f332404b + ", bytesReceived=" + this.f332405c + ", packetsReceived=" + this.f332406d + ", selectedCandidatePairChanges=" + this.f332407e + ", dtlsState=" + this.f332408f + ", dtlsRole=" + this.f332409g + ", iceState=" + this.f332410h + ", iceRole=" + this.f332411i + ", selectedCandidatePair=" + this.f332412j + ')';
        }

        public TransportStats(w0 w0Var, w0 w0Var2, w0 w0Var3, w0 w0Var4, w0 w0Var5, String str, String str2, String str3, String str4, SelectedCandidatePairStats selectedCandidatePairStats, C42822w c42822w) {
            this.f332403a = w0Var;
            this.f332404b = w0Var2;
            this.f332405c = w0Var3;
            this.f332406d = w0Var4;
            this.f332407e = w0Var5;
            this.f332408f = str;
            this.f332409g = str2;
            this.f332410h = str3;
            this.f332411i = str4;
            this.f332412j = selectedCandidatePairStats;
        }
    }

    @InterfaceC42830m
    public /* synthetic */ StatsReport(int i12, Double d12, Double d13, TransportStats transportStats, OutboundRtpAudioStats outboundRtpAudioStats, InboundRtpAudioStats inboundRtpAudioStats, OutboundRtpVideoStats outboundRtpVideoStats, InboundRtpVideoStats inboundRtpVideoStats, P0 p02) {
        if (127 != (i12 & 127)) {
            E0.b(i12, 127, StatsReport$$serializer.INSTANCE.getF412706c());
            throw null;
        }
        this.f332216a = d12;
        this.f332217b = d13;
        this.f332218c = transportStats;
        this.f332219d = outboundRtpAudioStats;
        this.f332220e = inboundRtpAudioStats;
        this.f332221f = outboundRtpVideoStats;
        this.f332222g = inboundRtpVideoStats;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsReport)) {
            return false;
        }
        StatsReport statsReport = (StatsReport) obj;
        return L.f(this.f332216a, statsReport.f332216a) && L.f(this.f332217b, statsReport.f332217b) && L.f(this.f332218c, statsReport.f332218c) && L.f(this.f332219d, statsReport.f332219d) && L.f(this.f332220e, statsReport.f332220e) && L.f(this.f332221f, statsReport.f332221f) && L.f(this.f332222g, statsReport.f332222g);
    }

    public final int hashCode() {
        Double d12 = this.f332216a;
        int iHashCode = (d12 == null ? 0 : d12.hashCode()) * 31;
        Double d13 = this.f332217b;
        int iHashCode2 = (iHashCode + (d13 == null ? 0 : d13.hashCode())) * 31;
        TransportStats transportStats = this.f332218c;
        int iHashCode3 = (iHashCode2 + (transportStats == null ? 0 : transportStats.hashCode())) * 31;
        OutboundRtpAudioStats outboundRtpAudioStats = this.f332219d;
        int iHashCode4 = (iHashCode3 + (outboundRtpAudioStats == null ? 0 : outboundRtpAudioStats.hashCode())) * 31;
        InboundRtpAudioStats inboundRtpAudioStats = this.f332220e;
        int iHashCode5 = (iHashCode4 + (inboundRtpAudioStats == null ? 0 : inboundRtpAudioStats.hashCode())) * 31;
        OutboundRtpVideoStats outboundRtpVideoStats = this.f332221f;
        int iHashCode6 = (iHashCode5 + (outboundRtpVideoStats == null ? 0 : outboundRtpVideoStats.hashCode())) * 31;
        InboundRtpVideoStats inboundRtpVideoStats = this.f332222g;
        return iHashCode6 + (inboundRtpVideoStats != null ? inboundRtpVideoStats.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "StatsReport(callDuration=" + this.f332216a + ", activeDuration=" + this.f332217b + ", transport=" + this.f332218c + ", outboundRtpAudio=" + this.f332219d + ", inboundRtpAudio=" + this.f332220e + ", outboundRtpVideo=" + this.f332221f + ", inboundRtpVideo=" + this.f332222g + ')';
    }

    public StatsReport(@l Double d12, @l Double d13, @l TransportStats transportStats, @l OutboundRtpAudioStats outboundRtpAudioStats, @l InboundRtpAudioStats inboundRtpAudioStats, @l OutboundRtpVideoStats outboundRtpVideoStats, @l InboundRtpVideoStats inboundRtpVideoStats) {
        this.f332216a = d12;
        this.f332217b = d13;
        this.f332218c = transportStats;
        this.f332219d = outboundRtpAudioStats;
        this.f332220e = inboundRtpAudioStats;
        this.f332221f = outboundRtpVideoStats;
        this.f332222g = inboundRtpVideoStats;
    }
}
