package org.webrtc;

import j.P;
import java.util.List;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes9.dex */
public class RtpParameters {
    public final List<Codec> codecs;

    @P
    public DegradationPreference degradationPreference;
    public final List<Encoding> encodings;
    private final List<HeaderExtension> headerExtensions;
    private final Rtcp rtcp;
    public final String transactionId;

    public static class Codec {
        public Integer clockRate;
        MediaStreamTrack.MediaType kind;
        public String name;
        public Integer numChannels;
        public Map<String, String> parameters;
        public int payloadType;

        @CalledByNative("Codec")
        public Codec(int i12, String str, MediaStreamTrack.MediaType mediaType, Integer num, Integer num2, Map<String, String> map) {
            this.payloadType = i12;
            this.name = str;
            this.kind = mediaType;
            this.clockRate = num;
            this.numChannels = num2;
            this.parameters = map;
        }

        @CalledByNative("Codec")
        public Integer getClockRate() {
            return this.clockRate;
        }

        @CalledByNative("Codec")
        public MediaStreamTrack.MediaType getKind() {
            return this.kind;
        }

        @CalledByNative("Codec")
        public String getName() {
            return this.name;
        }

        @CalledByNative("Codec")
        public Integer getNumChannels() {
            return this.numChannels;
        }

        @CalledByNative("Codec")
        public Map getParameters() {
            return this.parameters;
        }

        @CalledByNative("Codec")
        public int getPayloadType() {
            return this.payloadType;
        }
    }

    public enum DegradationPreference {
        DISABLED,
        MAINTAIN_FRAMERATE,
        MAINTAIN_RESOLUTION,
        BALANCED;

        @CalledByNative("DegradationPreference")
        public static DegradationPreference fromNativeIndex(int i12) {
            return values()[i12];
        }
    }

    public static class HeaderExtension {
        private final boolean encrypted;

        /* renamed from: id, reason: collision with root package name */
        private final int f422264id;
        private final String uri;

        @CalledByNative("HeaderExtension")
        public HeaderExtension(String str, int i12, boolean z12) {
            this.uri = str;
            this.f422264id = i12;
            this.encrypted = z12;
        }

        @CalledByNative("HeaderExtension")
        public boolean getEncrypted() {
            return this.encrypted;
        }

        @CalledByNative("HeaderExtension")
        public int getId() {
            return this.f422264id;
        }

        @CalledByNative("HeaderExtension")
        public String getUri() {
            return this.uri;
        }
    }

    public static class Rtcp {
        private final String cname;
        private final boolean reducedSize;

        @CalledByNative("Rtcp")
        public Rtcp(String str, boolean z12) {
            this.cname = str;
            this.reducedSize = z12;
        }

        @CalledByNative("Rtcp")
        public String getCname() {
            return this.cname;
        }

        @CalledByNative("Rtcp")
        public boolean getReducedSize() {
            return this.reducedSize;
        }
    }

    @CalledByNative
    public RtpParameters(String str, DegradationPreference degradationPreference, Rtcp rtcp, List<HeaderExtension> list, List<Encoding> list2, List<Codec> list3) {
        this.transactionId = str;
        this.degradationPreference = degradationPreference;
        this.rtcp = rtcp;
        this.headerExtensions = list;
        this.encodings = list2;
        this.codecs = list3;
    }

    @CalledByNative
    public List<Codec> getCodecs() {
        return this.codecs;
    }

    @CalledByNative
    public DegradationPreference getDegradationPreference() {
        return this.degradationPreference;
    }

    @CalledByNative
    public List<Encoding> getEncodings() {
        return this.encodings;
    }

    @CalledByNative
    public List<HeaderExtension> getHeaderExtensions() {
        return this.headerExtensions;
    }

    @CalledByNative
    public Rtcp getRtcp() {
        return this.rtcp;
    }

    @CalledByNative
    public String getTransactionId() {
        return this.transactionId;
    }

    public static class Encoding {
        public boolean active;
        public boolean adaptiveAudioPacketTime;
        public double bitratePriority;

        @P
        public Integer maxBitrateBps;

        @P
        public Integer maxFramerate;

        @P
        public Integer minBitrateBps;
        public int networkPriority;

        @P
        public Integer numTemporalLayers;

        @P
        public String rid;

        @P
        public Double scaleResolutionDownBy;
        public Long ssrc;

        public Encoding(String str, boolean z12, Double d12) {
            this.bitratePriority = 1.0d;
            this.networkPriority = 1;
            this.rid = str;
            this.active = z12;
            this.scaleResolutionDownBy = d12;
        }

        @CalledByNative("Encoding")
        public boolean getActive() {
            return this.active;
        }

        @CalledByNative("Encoding")
        public boolean getAdaptivePTime() {
            return this.adaptiveAudioPacketTime;
        }

        @CalledByNative("Encoding")
        public double getBitratePriority() {
            return this.bitratePriority;
        }

        @CalledByNative("Encoding")
        @P
        public Integer getMaxBitrateBps() {
            return this.maxBitrateBps;
        }

        @CalledByNative("Encoding")
        @P
        public Integer getMaxFramerate() {
            return this.maxFramerate;
        }

        @CalledByNative("Encoding")
        @P
        public Integer getMinBitrateBps() {
            return this.minBitrateBps;
        }

        @CalledByNative("Encoding")
        public int getNetworkPriority() {
            return this.networkPriority;
        }

        @CalledByNative("Encoding")
        @P
        public Integer getNumTemporalLayers() {
            return this.numTemporalLayers;
        }

        @CalledByNative("Encoding")
        @P
        public String getRid() {
            return this.rid;
        }

        @CalledByNative("Encoding")
        @P
        public Double getScaleResolutionDownBy() {
            return this.scaleResolutionDownBy;
        }

        @CalledByNative("Encoding")
        public Long getSsrc() {
            return this.ssrc;
        }

        @CalledByNative("Encoding")
        public Encoding(String str, boolean z12, double d12, int i12, Integer num, Integer num2, Integer num3, Integer num4, Double d13, Long l12, boolean z13) {
            this.rid = str;
            this.active = z12;
            this.bitratePriority = d12;
            this.networkPriority = i12;
            this.maxBitrateBps = num;
            this.minBitrateBps = num2;
            this.maxFramerate = num3;
            this.numTemporalLayers = num4;
            this.scaleResolutionDownBy = d13;
            this.ssrc = l12;
            this.adaptiveAudioPacketTime = z13;
        }
    }
}
