package com.avito.avcalls.config;

import androidx.appcompat.app.r;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.v;
import kotlinx.serialization.w;

/* compiled from: Config.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001c2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\u001d\u001cB\u009d\u0001\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u000b\u001a\u00020\b\u0012\b\b\u0001\u0010\f\u001a\u00020\b\u0012\b\b\u0001\u0010\r\u001a\u00020\b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\b\u0012\b\b\u0001\u0010\u000f\u001a\u00020\b\u0012\b\b\u0001\u0010\u0010\u001a\u00020\b\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0013\u001a\u00020\b\u0012\b\b\u0001\u0010\u0014\u001a\u00020\b\u0012\b\b\u0001\u0010\u0015\u001a\u00020\b\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/avito/avcalls/config/Config;", "Lcom/avito/avcalls/config/j;", "Lcom/avito/avcalls/config/a;", "Lcom/avito/avcalls/config/h;", "Lcom/avito/avcalls/config/l;", "Lcom/avito/avcalls/d;", "", "seen1", "", "sendTimeout", "sendAttemptNumber", "sendAttemptDelay", "outgoingStartTimeout", "outgoingAcceptTimeout", "afterRingingAcceptTimeout", "incomingAcceptTimeout", "connectTimeout", "", "enableStatsReport", "iceCandidatesGatheringTimeout", "dtmfDuration", "dtmfInterToneGap", "", "frameRateLimit", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(IJIJJJJJJZJJJDLkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* loaded from: classes5.dex */
public final /* data */ class Config implements j, a, h, l, com.avito.avcalls.d {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f332850a;

    /* renamed from: b, reason: collision with root package name */
    public final int f332851b;

    /* renamed from: c, reason: collision with root package name */
    public final long f332852c;

    /* renamed from: d, reason: collision with root package name */
    public final long f332853d;

    /* renamed from: e, reason: collision with root package name */
    public final long f332854e;

    /* renamed from: f, reason: collision with root package name */
    public final long f332855f;

    /* renamed from: g, reason: collision with root package name */
    public final long f332856g;

    /* renamed from: h, reason: collision with root package name */
    public final long f332857h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f332858i;

    /* renamed from: j, reason: collision with root package name */
    public final long f332859j;

    /* renamed from: k, reason: collision with root package name */
    public final long f332860k;

    /* renamed from: l, reason: collision with root package name */
    public final long f332861l;

    /* renamed from: m, reason: collision with root package name */
    public final double f332862m;

    /* compiled from: Config.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/config/Config$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/config/Config;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public final KSerializer<Config> serializer() {
            return Config$$serializer.INSTANCE;
        }

        public Companion() {
        }
    }

    public Config() {
        this(0L, 0, 0L, 0L, 0L, 0L, 0L, 0L, false, 0L, 0L, 0L, 0.0d, 8191, (C42822w) null);
    }

    @Override // com.avito.avcalls.config.a
    /* renamed from: a, reason: from getter */
    public final boolean getF332858i() {
        return this.f332858i;
    }

    @Override // com.avito.avcalls.config.a
    /* renamed from: b, reason: from getter */
    public final long getF332853d() {
        return this.f332853d;
    }

    @Override // com.avito.avcalls.config.h
    /* renamed from: c, reason: from getter */
    public final long getF332860k() {
        return this.f332860k;
    }

    @Override // com.avito.avcalls.config.a
    /* renamed from: d, reason: from getter */
    public final long getF332856g() {
        return this.f332856g;
    }

    @Override // com.avito.avcalls.config.a
    /* renamed from: e, reason: from getter */
    public final long getF332857h() {
        return this.f332857h;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Config)) {
            return false;
        }
        Config config = (Config) obj;
        return this.f332850a == config.f332850a && this.f332851b == config.f332851b && this.f332852c == config.f332852c && this.f332853d == config.f332853d && this.f332854e == config.f332854e && this.f332855f == config.f332855f && this.f332856g == config.f332856g && this.f332857h == config.f332857h && this.f332858i == config.f332858i && this.f332859j == config.f332859j && this.f332860k == config.f332860k && this.f332861l == config.f332861l && Double.compare(this.f332862m, config.f332862m) == 0;
    }

    @Override // com.avito.avcalls.config.a
    /* renamed from: f, reason: from getter */
    public final long getF332854e() {
        return this.f332854e;
    }

    @Override // com.avito.avcalls.config.h
    /* renamed from: g, reason: from getter */
    public final long getF332861l() {
        return this.f332861l;
    }

    @Override // com.avito.avcalls.config.a
    /* renamed from: h, reason: from getter */
    public final long getF332855f() {
        return this.f332855f;
    }

    public final int hashCode() {
        return Double.hashCode(this.f332862m) + r.g(r.g(r.g(r.i(r.g(r.g(r.g(r.g(r.g(r.g(r.e(this.f332851b, Long.hashCode(this.f332850a) * 31, 31), 31, this.f332852c), 31, this.f332853d), 31, this.f332854e), 31, this.f332855f), 31, this.f332856g), 31, this.f332857h), 31, this.f332858i), 31, this.f332859j), 31, this.f332860k), 31, this.f332861l);
    }

    @Override // com.avito.avcalls.config.h
    /* renamed from: i, reason: from getter */
    public final long getF332859j() {
        return this.f332859j;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Config(sendTimeout=");
        sb2.append(this.f332850a);
        sb2.append(", sendAttemptNumber=");
        sb2.append(this.f332851b);
        sb2.append(", sendAttemptDelay=");
        sb2.append(this.f332852c);
        sb2.append(", outgoingStartTimeout=");
        sb2.append(this.f332853d);
        sb2.append(", outgoingAcceptTimeout=");
        sb2.append(this.f332854e);
        sb2.append(", afterRingingAcceptTimeout=");
        sb2.append(this.f332855f);
        sb2.append(", incomingAcceptTimeout=");
        sb2.append(this.f332856g);
        sb2.append(", connectTimeout=");
        sb2.append(this.f332857h);
        sb2.append(", enableStatsReport=");
        sb2.append(this.f332858i);
        sb2.append(", iceCandidatesGatheringTimeout=");
        sb2.append(this.f332859j);
        sb2.append(", dtmfDuration=");
        sb2.append(this.f332860k);
        sb2.append(", dtmfInterToneGap=");
        sb2.append(this.f332861l);
        sb2.append(", frameRateLimit=");
        return androidx.compose.ui.graphics.colorspace.e.o(sb2, this.f332862m, ')');
    }

    @InterfaceC42830m
    public /* synthetic */ Config(int i12, @v long j12, @v int i13, @v long j13, @v long j14, @v long j15, @v long j16, @v long j17, @v long j18, @v boolean z12, @v long j19, @v long j22, @v long j23, @v double d12, P0 p02) {
        this.f332850a = (i12 & 1) == 0 ? 15000L : j12;
        this.f332851b = (i12 & 2) == 0 ? 30 : i13;
        this.f332852c = (i12 & 4) == 0 ? 1000L : j13;
        if ((i12 & 8) == 0) {
            this.f332853d = 60000L;
        } else {
            this.f332853d = j14;
        }
        this.f332854e = (i12 & 16) == 0 ? 40000L : j15;
        if ((i12 & 32) == 0) {
            this.f332855f = 60000L;
        } else {
            this.f332855f = j16;
        }
        this.f332856g = (i12 & 64) == 0 ? 59000L : j17;
        this.f332857h = (i12 & 128) == 0 ? 30000L : j18;
        this.f332858i = (i12 & 256) == 0 ? true : z12;
        this.f332859j = (i12 & 512) == 0 ? 500L : j19;
        this.f332860k = (i12 & 1024) == 0 ? 250L : j22;
        this.f332861l = (i12 & 2048) == 0 ? 100L : j23;
        this.f332862m = (i12 & 4096) == 0 ? 30.0d : d12;
    }

    public Config(long j12, int i12, long j13, long j14, long j15, long j16, long j17, long j18, boolean z12, long j19, long j22, long j23, double d12, int i13, C42822w c42822w) {
        long j24 = (i13 & 1) != 0 ? 15000L : j12;
        int i14 = (i13 & 2) != 0 ? 30 : i12;
        long j25 = (i13 & 4) != 0 ? 1000L : j13;
        long j26 = (i13 & 8) != 0 ? 60000L : j14;
        long j27 = (i13 & 16) != 0 ? 40000L : j15;
        long j28 = (i13 & 32) == 0 ? j16 : 60000L;
        long j29 = (i13 & 64) != 0 ? 59000L : j17;
        long j32 = (i13 & 128) != 0 ? 30000L : j18;
        boolean z13 = (i13 & 256) != 0 ? true : z12;
        long j33 = (i13 & 512) != 0 ? 500L : j19;
        long j34 = (i13 & 1024) != 0 ? 250L : j22;
        long j35 = (i13 & 2048) != 0 ? 100L : j23;
        double d13 = (i13 & 4096) != 0 ? 30.0d : d12;
        this.f332850a = j24;
        this.f332851b = i14;
        this.f332852c = j25;
        this.f332853d = j26;
        this.f332854e = j27;
        this.f332855f = j28;
        this.f332856g = j29;
        this.f332857h = j32;
        this.f332858i = z13;
        this.f332859j = j33;
        this.f332860k = j34;
        this.f332861l = j35;
        this.f332862m = d13;
    }
}
