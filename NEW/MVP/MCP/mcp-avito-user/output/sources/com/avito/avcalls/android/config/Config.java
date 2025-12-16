package com.avito.avcalls.android.config;

import androidx.appcompat.app.r;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.v;
import kotlinx.serialization.w;

/* compiled from: Config.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u001d2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\u001e\u001dB§\u0001\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u000b\u001a\u00020\b\u0012\b\b\u0001\u0010\f\u001a\u00020\b\u0012\b\b\u0001\u0010\r\u001a\u00020\b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\b\u0012\b\b\u0001\u0010\u000f\u001a\u00020\b\u0012\b\b\u0001\u0010\u0010\u001a\u00020\b\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0014\u001a\u00020\b\u0012\b\b\u0001\u0010\u0015\u001a\u00020\b\u0012\b\b\u0001\u0010\u0016\u001a\u00020\b\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/avito/avcalls/android/config/Config;", "Lcom/avito/avcalls/android/config/j;", "Lcom/avito/avcalls/android/config/a;", "Lcom/avito/avcalls/android/config/h;", "Lcom/avito/avcalls/android/config/l;", "Lcom/avito/avcalls/android/f;", "", "seen1", "", "sendTimeout", "sendAttemptNumber", "sendAttemptDelay", "outgoingStartTimeout", "outgoingAcceptTimeout", "afterRingingAcceptTimeout", "incomingAcceptTimeout", "connectTimeout", "", "enableStatsReport", "enableManualAudioDeviceManaging", "iceCandidatesGatheringTimeout", "dtmfDuration", "dtmfInterToneGap", "", "frameRateLimit", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(IJIJJJJJJZZJJJDLkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* loaded from: classes5.dex */
public final /* data */ class Config implements j, a, h, l, com.avito.avcalls.android.f {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f331653a;

    /* renamed from: b, reason: collision with root package name */
    public final int f331654b;

    /* renamed from: c, reason: collision with root package name */
    public final long f331655c;

    /* renamed from: d, reason: collision with root package name */
    public final long f331656d;

    /* renamed from: e, reason: collision with root package name */
    public final long f331657e;

    /* renamed from: f, reason: collision with root package name */
    public final long f331658f;

    /* renamed from: g, reason: collision with root package name */
    public final long f331659g;

    /* renamed from: h, reason: collision with root package name */
    public final long f331660h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f331661i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f331662j;

    /* renamed from: k, reason: collision with root package name */
    public final long f331663k;

    /* renamed from: l, reason: collision with root package name */
    public final long f331664l;

    /* renamed from: m, reason: collision with root package name */
    public final long f331665m;

    /* renamed from: n, reason: collision with root package name */
    public final double f331666n;

    /* compiled from: Config.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/android/config/Config$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/android/config/Config;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
        this(0L, 0, 0L, 0L, 0L, 0L, 0L, 0L, false, false, 0L, 0L, 0L, 0.0d, 16383, (C42822w) null);
    }

    @Override // com.avito.avcalls.android.config.a
    /* renamed from: a, reason: from getter */
    public final boolean getF331661i() {
        return this.f331661i;
    }

    @Override // com.avito.avcalls.android.config.a
    /* renamed from: b, reason: from getter */
    public final long getF331656d() {
        return this.f331656d;
    }

    @Override // com.avito.avcalls.android.config.h
    /* renamed from: c, reason: from getter */
    public final long getF331664l() {
        return this.f331664l;
    }

    @Override // com.avito.avcalls.android.config.a
    /* renamed from: d, reason: from getter */
    public final long getF331659g() {
        return this.f331659g;
    }

    @Override // com.avito.avcalls.android.config.a
    /* renamed from: e, reason: from getter */
    public final long getF331660h() {
        return this.f331660h;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Config)) {
            return false;
        }
        Config config = (Config) obj;
        return this.f331653a == config.f331653a && this.f331654b == config.f331654b && this.f331655c == config.f331655c && this.f331656d == config.f331656d && this.f331657e == config.f331657e && this.f331658f == config.f331658f && this.f331659g == config.f331659g && this.f331660h == config.f331660h && this.f331661i == config.f331661i && this.f331662j == config.f331662j && this.f331663k == config.f331663k && this.f331664l == config.f331664l && this.f331665m == config.f331665m && Double.compare(this.f331666n, config.f331666n) == 0;
    }

    @Override // com.avito.avcalls.android.config.a
    /* renamed from: f, reason: from getter */
    public final long getF331657e() {
        return this.f331657e;
    }

    @Override // com.avito.avcalls.android.config.h
    /* renamed from: g, reason: from getter */
    public final long getF331665m() {
        return this.f331665m;
    }

    @Override // com.avito.avcalls.android.config.a
    /* renamed from: h, reason: from getter */
    public final long getF331658f() {
        return this.f331658f;
    }

    public final int hashCode() {
        return Double.hashCode(this.f331666n) + r.g(r.g(r.g(r.i(r.i(r.g(r.g(r.g(r.g(r.g(r.g(r.e(this.f331654b, Long.hashCode(this.f331653a) * 31, 31), 31, this.f331655c), 31, this.f331656d), 31, this.f331657e), 31, this.f331658f), 31, this.f331659g), 31, this.f331660h), 31, this.f331661i), 31, this.f331662j), 31, this.f331663k), 31, this.f331664l), 31, this.f331665m);
    }

    @Override // com.avito.avcalls.android.config.h
    /* renamed from: i, reason: from getter */
    public final long getF331663k() {
        return this.f331663k;
    }

    @Override // com.avito.avcalls.android.config.a
    /* renamed from: j, reason: from getter */
    public final boolean getF331662j() {
        return this.f331662j;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Config(sendTimeout=");
        sb2.append(this.f331653a);
        sb2.append(", sendAttemptNumber=");
        sb2.append(this.f331654b);
        sb2.append(", sendAttemptDelay=");
        sb2.append(this.f331655c);
        sb2.append(", outgoingStartTimeout=");
        sb2.append(this.f331656d);
        sb2.append(", outgoingAcceptTimeout=");
        sb2.append(this.f331657e);
        sb2.append(", afterRingingAcceptTimeout=");
        sb2.append(this.f331658f);
        sb2.append(", incomingAcceptTimeout=");
        sb2.append(this.f331659g);
        sb2.append(", connectTimeout=");
        sb2.append(this.f331660h);
        sb2.append(", enableStatsReport=");
        sb2.append(this.f331661i);
        sb2.append(", enableManualAudioDeviceManaging=");
        sb2.append(this.f331662j);
        sb2.append(", iceCandidatesGatheringTimeout=");
        sb2.append(this.f331663k);
        sb2.append(", dtmfDuration=");
        sb2.append(this.f331664l);
        sb2.append(", dtmfInterToneGap=");
        sb2.append(this.f331665m);
        sb2.append(", frameRateLimit=");
        return androidx.compose.ui.graphics.colorspace.e.o(sb2, this.f331666n, ')');
    }

    @InterfaceC42830m
    public /* synthetic */ Config(int i12, @v long j12, @v int i13, @v long j13, @v long j14, @v long j15, @v long j16, @v long j17, @v long j18, @v boolean z12, @v boolean z13, @v long j19, @v long j22, @v long j23, @v double d12, P0 p02) {
        this.f331653a = (i12 & 1) == 0 ? 15000L : j12;
        this.f331654b = (i12 & 2) == 0 ? 30 : i13;
        this.f331655c = (i12 & 4) == 0 ? 1000L : j13;
        if ((i12 & 8) == 0) {
            this.f331656d = 60000L;
        } else {
            this.f331656d = j14;
        }
        this.f331657e = (i12 & 16) == 0 ? 40000L : j15;
        if ((i12 & 32) == 0) {
            this.f331658f = 60000L;
        } else {
            this.f331658f = j16;
        }
        this.f331659g = (i12 & 64) == 0 ? 59000L : j17;
        this.f331660h = (i12 & 128) == 0 ? 30000L : j18;
        this.f331661i = (i12 & 256) == 0 ? true : z12;
        this.f331662j = (i12 & 512) == 0 ? false : z13;
        this.f331663k = (i12 & 1024) == 0 ? 500L : j19;
        this.f331664l = (i12 & 2048) == 0 ? 250L : j22;
        this.f331665m = (i12 & 4096) == 0 ? 100L : j23;
        this.f331666n = (i12 & 8192) == 0 ? 30.0d : d12;
    }

    public Config(long j12, int i12, long j13, long j14, long j15, long j16, long j17, long j18, boolean z12, boolean z13, long j19, long j22, long j23, double d12, int i13, C42822w c42822w) {
        long j24 = (i13 & 1) != 0 ? 15000L : j12;
        int i14 = (i13 & 2) != 0 ? 30 : i12;
        long j25 = (i13 & 4) != 0 ? 1000L : j13;
        long j26 = (i13 & 8) != 0 ? 60000L : j14;
        long j27 = (i13 & 16) != 0 ? 40000L : j15;
        long j28 = (i13 & 32) == 0 ? j16 : 60000L;
        long j29 = (i13 & 64) != 0 ? 59000L : j17;
        long j32 = (i13 & 128) != 0 ? 30000L : j18;
        boolean z14 = (i13 & 256) != 0 ? true : z12;
        boolean z15 = (i13 & 512) != 0 ? false : z13;
        long j33 = (i13 & 1024) != 0 ? 500L : j19;
        long j34 = (i13 & 2048) != 0 ? 250L : j22;
        long j35 = (i13 & 4096) != 0 ? 100L : j23;
        double d13 = (i13 & 8192) != 0 ? 30.0d : d12;
        this.f331653a = j24;
        this.f331654b = i14;
        this.f331655c = j25;
        this.f331656d = j26;
        this.f331657e = j27;
        this.f331658f = j28;
        this.f331659g = j29;
        this.f331660h = j32;
        this.f331661i = z14;
        this.f331662j = z15;
        this.f331663k = j33;
        this.f331664l = j34;
        this.f331665m = j35;
        this.f331666n = d13;
    }
}
