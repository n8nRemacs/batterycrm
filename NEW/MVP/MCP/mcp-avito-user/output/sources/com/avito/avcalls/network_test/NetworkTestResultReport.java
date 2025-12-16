package com.avito.avcalls.network_test;

import com.avito.android.remote.model.Navigation;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.P0;

/* compiled from: NetworkTestResultReport.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0081\b\u0018\u0000 \f2\u00020\u0001:\u0006\r\f\u000e\u000f\u0010\u0011B/\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/avito/avcalls/network_test/NetworkTestResultReport;", "", "", "seen1", "Lcom/avito/avcalls/network_test/NetworkTestResultReport$Config;", Navigation.CONFIG, "Lcom/avito/avcalls/network_test/NetworkTestResultReport$PacketsStat;", "packets", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILcom/avito/avcalls/network_test/NetworkTestResultReport$Config;Lcom/avito/avcalls/network_test/NetworkTestResultReport$PacketsStat;Lkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "Config", "IntWithPercent", "PacketsStat", "Stats", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlinx.serialization.w
/* loaded from: classes5.dex */
public final /* data */ class NetworkTestResultReport {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Config f332961a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PacketsStat f332962b;

    /* compiled from: NetworkTestResultReport.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/network_test/NetworkTestResultReport$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/network_test/NetworkTestResultReport;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public final KSerializer<NetworkTestResultReport> serializer() {
            return NetworkTestResultReport$$serializer.INSTANCE;
        }

        public Companion() {
        }
    }

    /* compiled from: NetworkTestResultReport.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\u000bB/\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/avito/avcalls/network_test/NetworkTestResultReport$IntWithPercent;", "", "", "seen1", "num", "", "perc", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Integer;Ljava/lang/Double;Lkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlinx.serialization.w
    public static final /* data */ class IntWithPercent {

        /* renamed from: Companion, reason: from kotlin metadata */
        @Y61.k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Integer f332967a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Double f332968b;

        /* compiled from: NetworkTestResultReport.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/network_test/NetworkTestResultReport$IntWithPercent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/network_test/NetworkTestResultReport$IntWithPercent;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @Y61.k
            public final KSerializer<IntWithPercent> serializer() {
                return NetworkTestResultReport$IntWithPercent$$serializer.INSTANCE;
            }

            public Companion() {
            }
        }

        @InterfaceC42830m
        public /* synthetic */ IntWithPercent(int i12, Integer num, Double d12, P0 p02) {
            if (3 != (i12 & 3)) {
                E0.b(i12, 3, NetworkTestResultReport$IntWithPercent$$serializer.INSTANCE.getF412706c());
                throw null;
            }
            this.f332967a = num;
            this.f332968b = d12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IntWithPercent)) {
                return false;
            }
            IntWithPercent intWithPercent = (IntWithPercent) obj;
            return L.f(this.f332967a, intWithPercent.f332967a) && L.f(this.f332968b, intWithPercent.f332968b);
        }

        public final int hashCode() {
            Integer num = this.f332967a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Double d12 = this.f332968b;
            return iHashCode + (d12 != null ? d12.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("IntWithPercent(num=");
            sb2.append(this.f332967a);
            sb2.append(", perc=");
            return com.avito.android.authorization.auto_recovery.phone_confirm.b.h(sb2, this.f332968b, ')');
        }

        public IntWithPercent(@Y61.l Integer num, @Y61.l Double d12) {
            this.f332967a = num;
            this.f332968b = d12;
        }
    }

    /* compiled from: NetworkTestResultReport.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0011B_\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/avito/avcalls/network_test/NetworkTestResultReport$PacketsStat;", "", "", "seen1", "sent", "Lcom/avito/avcalls/network_test/NetworkTestResultReport$IntWithPercent;", "lost", "outOfOrder", "duplicates", "Lcom/avito/avcalls/network_test/NetworkTestResultReport$Stats;", "rtt", "jitter", "burstLoss", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(IILcom/avito/avcalls/network_test/NetworkTestResultReport$IntWithPercent;Lcom/avito/avcalls/network_test/NetworkTestResultReport$IntWithPercent;Lcom/avito/avcalls/network_test/NetworkTestResultReport$IntWithPercent;Lcom/avito/avcalls/network_test/NetworkTestResultReport$Stats;Lcom/avito/avcalls/network_test/NetworkTestResultReport$Stats;Lcom/avito/avcalls/network_test/NetworkTestResultReport$Stats;Lkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlinx.serialization.w
    public static final /* data */ class PacketsStat {

        /* renamed from: Companion, reason: from kotlin metadata */
        @Y61.k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        public final int f332969a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final IntWithPercent f332970b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final IntWithPercent f332971c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final IntWithPercent f332972d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final Stats f332973e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final Stats f332974f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final Stats f332975g;

        /* compiled from: NetworkTestResultReport.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/network_test/NetworkTestResultReport$PacketsStat$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/network_test/NetworkTestResultReport$PacketsStat;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @Y61.k
            public final KSerializer<PacketsStat> serializer() {
                return NetworkTestResultReport$PacketsStat$$serializer.INSTANCE;
            }

            public Companion() {
            }
        }

        @InterfaceC42830m
        public /* synthetic */ PacketsStat(int i12, int i13, IntWithPercent intWithPercent, IntWithPercent intWithPercent2, IntWithPercent intWithPercent3, Stats stats, Stats stats2, Stats stats3, P0 p02) {
            if (127 != (i12 & 127)) {
                E0.b(i12, 127, NetworkTestResultReport$PacketsStat$$serializer.INSTANCE.getF412706c());
                throw null;
            }
            this.f332969a = i13;
            this.f332970b = intWithPercent;
            this.f332971c = intWithPercent2;
            this.f332972d = intWithPercent3;
            this.f332973e = stats;
            this.f332974f = stats2;
            this.f332975g = stats3;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PacketsStat)) {
                return false;
            }
            PacketsStat packetsStat = (PacketsStat) obj;
            return this.f332969a == packetsStat.f332969a && L.f(this.f332970b, packetsStat.f332970b) && L.f(this.f332971c, packetsStat.f332971c) && L.f(this.f332972d, packetsStat.f332972d) && L.f(this.f332973e, packetsStat.f332973e) && L.f(this.f332974f, packetsStat.f332974f) && L.f(this.f332975g, packetsStat.f332975g);
        }

        public final int hashCode() {
            return this.f332975g.hashCode() + ((this.f332974f.hashCode() + ((this.f332973e.hashCode() + ((this.f332972d.hashCode() + ((this.f332971c.hashCode() + ((this.f332970b.hashCode() + (Integer.hashCode(this.f332969a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            return "PacketsStat(sent=" + this.f332969a + ", lost=" + this.f332970b + ", outOfOrder=" + this.f332971c + ", duplicates=" + this.f332972d + ", rtt=" + this.f332973e + ", jitter=" + this.f332974f + ", burstLoss=" + this.f332975g + ')';
        }

        public PacketsStat(int i12, @Y61.k IntWithPercent intWithPercent, @Y61.k IntWithPercent intWithPercent2, @Y61.k IntWithPercent intWithPercent3, @Y61.k Stats stats, @Y61.k Stats stats2, @Y61.k Stats stats3) {
            this.f332969a = i12;
            this.f332970b = intWithPercent;
            this.f332971c = intWithPercent2;
            this.f332972d = intWithPercent3;
            this.f332973e = stats;
            this.f332974f = stats2;
            this.f332975g = stats3;
        }
    }

    /* compiled from: NetworkTestResultReport.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0010B_\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/avito/avcalls/network_test/NetworkTestResultReport$Stats;", "", "", "seen1", "count", "", "max", "min", "avg", "p99", "p90", "p50", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(IILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlinx.serialization.w
    public static final /* data */ class Stats {

        /* renamed from: Companion, reason: from kotlin metadata */
        @Y61.k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        public final int f332976a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Double f332977b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Double f332978c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final Double f332979d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final Double f332980e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final Double f332981f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final Double f332982g;

        /* compiled from: NetworkTestResultReport.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/network_test/NetworkTestResultReport$Stats$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/network_test/NetworkTestResultReport$Stats;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @Y61.k
            public final KSerializer<Stats> serializer() {
                return NetworkTestResultReport$Stats$$serializer.INSTANCE;
            }

            public Companion() {
            }
        }

        @InterfaceC42830m
        public /* synthetic */ Stats(int i12, int i13, Double d12, Double d13, Double d14, Double d15, Double d16, Double d17, P0 p02) {
            if (1 != (i12 & 1)) {
                E0.b(i12, 1, NetworkTestResultReport$Stats$$serializer.INSTANCE.getF412706c());
                throw null;
            }
            this.f332976a = i13;
            if ((i12 & 2) == 0) {
                this.f332977b = null;
            } else {
                this.f332977b = d12;
            }
            if ((i12 & 4) == 0) {
                this.f332978c = null;
            } else {
                this.f332978c = d13;
            }
            if ((i12 & 8) == 0) {
                this.f332979d = null;
            } else {
                this.f332979d = d14;
            }
            if ((i12 & 16) == 0) {
                this.f332980e = null;
            } else {
                this.f332980e = d15;
            }
            if ((i12 & 32) == 0) {
                this.f332981f = null;
            } else {
                this.f332981f = d16;
            }
            if ((i12 & 64) == 0) {
                this.f332982g = null;
            } else {
                this.f332982g = d17;
            }
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Stats)) {
                return false;
            }
            Stats stats = (Stats) obj;
            return this.f332976a == stats.f332976a && L.f(this.f332977b, stats.f332977b) && L.f(this.f332978c, stats.f332978c) && L.f(this.f332979d, stats.f332979d) && L.f(this.f332980e, stats.f332980e) && L.f(this.f332981f, stats.f332981f) && L.f(this.f332982g, stats.f332982g);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f332976a) * 31;
            Double d12 = this.f332977b;
            int iHashCode2 = (iHashCode + (d12 == null ? 0 : d12.hashCode())) * 31;
            Double d13 = this.f332978c;
            int iHashCode3 = (iHashCode2 + (d13 == null ? 0 : d13.hashCode())) * 31;
            Double d14 = this.f332979d;
            int iHashCode4 = (iHashCode3 + (d14 == null ? 0 : d14.hashCode())) * 31;
            Double d15 = this.f332980e;
            int iHashCode5 = (iHashCode4 + (d15 == null ? 0 : d15.hashCode())) * 31;
            Double d16 = this.f332981f;
            int iHashCode6 = (iHashCode5 + (d16 == null ? 0 : d16.hashCode())) * 31;
            Double d17 = this.f332982g;
            return iHashCode6 + (d17 != null ? d17.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Stats(count=");
            sb2.append(this.f332976a);
            sb2.append(", max=");
            sb2.append(this.f332977b);
            sb2.append(", min=");
            sb2.append(this.f332978c);
            sb2.append(", avg=");
            sb2.append(this.f332979d);
            sb2.append(", p99=");
            sb2.append(this.f332980e);
            sb2.append(", p90=");
            sb2.append(this.f332981f);
            sb2.append(", p50=");
            return com.avito.android.authorization.auto_recovery.phone_confirm.b.h(sb2, this.f332982g, ')');
        }

        public Stats(int i12, @Y61.l Double d12, @Y61.l Double d13, @Y61.l Double d14, @Y61.l Double d15, @Y61.l Double d16, @Y61.l Double d17) {
            this.f332976a = i12;
            this.f332977b = d12;
            this.f332978c = d13;
            this.f332979d = d14;
            this.f332980e = d15;
            this.f332981f = d16;
            this.f332982g = d17;
        }

        public /* synthetic */ Stats(int i12, Double d12, Double d13, Double d14, Double d15, Double d16, Double d17, int i13, C42822w c42822w) {
            this(i12, (i13 & 2) != 0 ? null : d12, (i13 & 4) != 0 ? null : d13, (i13 & 8) != 0 ? null : d14, (i13 & 16) != 0 ? null : d15, (i13 & 32) != 0 ? null : d16, (i13 & 64) == 0 ? d17 : null);
        }
    }

    @InterfaceC42830m
    public /* synthetic */ NetworkTestResultReport(int i12, Config config, PacketsStat packetsStat, P0 p02) {
        if (3 != (i12 & 3)) {
            E0.b(i12, 3, NetworkTestResultReport$$serializer.INSTANCE.getF412706c());
            throw null;
        }
        this.f332961a = config;
        this.f332962b = packetsStat;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkTestResultReport)) {
            return false;
        }
        NetworkTestResultReport networkTestResultReport = (NetworkTestResultReport) obj;
        return L.f(this.f332961a, networkTestResultReport.f332961a) && L.f(this.f332962b, networkTestResultReport.f332962b);
    }

    public final int hashCode() {
        return this.f332962b.hashCode() + (this.f332961a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "NetworkTestResultReport(config=" + this.f332961a + ", packets=" + this.f332962b + ')';
    }

    public NetworkTestResultReport(@Y61.k Config config, @Y61.k PacketsStat packetsStat) {
        this.f332961a = config;
        this.f332962b = packetsStat;
    }

    /* compiled from: NetworkTestResultReport.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u000eB=\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/avito/avcalls/network_test/NetworkTestResultReport$Config;", "", "", "seen1", "", "addr", "", "configFetchTime", "packetsSendPeriod", "packetSize", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;DIILkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlinx.serialization.w
    public static final /* data */ class Config {

        /* renamed from: Companion, reason: from kotlin metadata */
        @Y61.k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f332963a;

        /* renamed from: b, reason: collision with root package name */
        public final double f332964b;

        /* renamed from: c, reason: collision with root package name */
        public final int f332965c;

        /* renamed from: d, reason: collision with root package name */
        public final int f332966d;

        /* compiled from: NetworkTestResultReport.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/network_test/NetworkTestResultReport$Config$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/network_test/NetworkTestResultReport$Config;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @Y61.k
            public final KSerializer<Config> serializer() {
                return NetworkTestResultReport$Config$$serializer.INSTANCE;
            }

            public Companion() {
            }
        }

        public Config(int i12, int i13, double d12, @Y61.k String str) {
            this.f332963a = str;
            this.f332964b = d12;
            this.f332965c = i12;
            this.f332966d = i13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return L.f(this.f332963a, config.f332963a) && Double.compare(this.f332964b, config.f332964b) == 0 && this.f332965c == config.f332965c && this.f332966d == config.f332966d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f332966d) + androidx.appcompat.app.r.e(this.f332965c, androidx.compose.ui.graphics.colorspace.e.d(this.f332963a.hashCode() * 31, 31, this.f332964b), 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Config(addr=");
            sb2.append(this.f332963a);
            sb2.append(", configFetchTime=");
            sb2.append(this.f332964b);
            sb2.append(", packetsSendPeriod=");
            sb2.append(this.f332965c);
            sb2.append(", packetSize=");
            return androidx.appcompat.app.r.t(sb2, this.f332966d, ')');
        }

        @InterfaceC42830m
        public /* synthetic */ Config(int i12, String str, double d12, int i13, int i14, P0 p02) {
            if (15 != (i12 & 15)) {
                E0.b(i12, 15, NetworkTestResultReport$Config$$serializer.INSTANCE.getF412706c());
                throw null;
            }
            this.f332963a = str;
            this.f332964b = d12;
            this.f332965c = i13;
            this.f332966d = i14;
        }
    }
}
