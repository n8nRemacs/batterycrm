package com.avito.avcalls.android.network_test;

import com.avito.android.remote.model.Navigation;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.P0;

/* compiled from: NetworkTestResultReport.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0081\b\u0018\u0000 \f2\u00020\u0001:\u0006\r\f\u000e\u000f\u0010\u0011B/\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/avito/avcalls/android/network_test/NetworkTestResultReport;", "", "", "seen1", "Lcom/avito/avcalls/android/network_test/NetworkTestResultReport$Config;", Navigation.CONFIG, "Lcom/avito/avcalls/android/network_test/NetworkTestResultReport$PacketsStat;", "packets", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILcom/avito/avcalls/android/network_test/NetworkTestResultReport$Config;Lcom/avito/avcalls/android/network_test/NetworkTestResultReport$PacketsStat;Lkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "Config", "IntWithPercent", "PacketsStat", "Stats", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlinx.serialization.w
/* loaded from: classes5.dex */
public final /* data */ class NetworkTestResultReport {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Config f331761a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PacketsStat f331762b;

    /* compiled from: NetworkTestResultReport.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/android/network_test/NetworkTestResultReport$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/android/network_test/NetworkTestResultReport;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\u000bB/\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/avito/avcalls/android/network_test/NetworkTestResultReport$IntWithPercent;", "", "", "seen1", "num", "", "perc", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Integer;Ljava/lang/Double;Lkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlinx.serialization.w
    public static final /* data */ class IntWithPercent {

        /* renamed from: Companion, reason: from kotlin metadata */
        @Y61.k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Integer f331767a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Double f331768b;

        /* compiled from: NetworkTestResultReport.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/android/network_test/NetworkTestResultReport$IntWithPercent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/android/network_test/NetworkTestResultReport$IntWithPercent;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
            this.f331767a = num;
            this.f331768b = d12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IntWithPercent)) {
                return false;
            }
            IntWithPercent intWithPercent = (IntWithPercent) obj;
            return L.f(this.f331767a, intWithPercent.f331767a) && L.f(this.f331768b, intWithPercent.f331768b);
        }

        public final int hashCode() {
            Integer num = this.f331767a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Double d12 = this.f331768b;
            return iHashCode + (d12 != null ? d12.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("IntWithPercent(num=");
            sb2.append(this.f331767a);
            sb2.append(", perc=");
            return com.avito.android.authorization.auto_recovery.phone_confirm.b.h(sb2, this.f331768b, ')');
        }

        public IntWithPercent(@Y61.l Integer num, @Y61.l Double d12) {
            this.f331767a = num;
            this.f331768b = d12;
        }
    }

    /* compiled from: NetworkTestResultReport.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0011B_\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/avito/avcalls/android/network_test/NetworkTestResultReport$PacketsStat;", "", "", "seen1", "sent", "Lcom/avito/avcalls/android/network_test/NetworkTestResultReport$IntWithPercent;", "lost", "outOfOrder", "duplicates", "Lcom/avito/avcalls/android/network_test/NetworkTestResultReport$Stats;", "rtt", "jitter", "burstLoss", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(IILcom/avito/avcalls/android/network_test/NetworkTestResultReport$IntWithPercent;Lcom/avito/avcalls/android/network_test/NetworkTestResultReport$IntWithPercent;Lcom/avito/avcalls/android/network_test/NetworkTestResultReport$IntWithPercent;Lcom/avito/avcalls/android/network_test/NetworkTestResultReport$Stats;Lcom/avito/avcalls/android/network_test/NetworkTestResultReport$Stats;Lcom/avito/avcalls/android/network_test/NetworkTestResultReport$Stats;Lkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlinx.serialization.w
    public static final /* data */ class PacketsStat {

        /* renamed from: Companion, reason: from kotlin metadata */
        @Y61.k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        public final int f331769a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final IntWithPercent f331770b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final IntWithPercent f331771c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final IntWithPercent f331772d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final Stats f331773e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final Stats f331774f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final Stats f331775g;

        /* compiled from: NetworkTestResultReport.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/android/network_test/NetworkTestResultReport$PacketsStat$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/android/network_test/NetworkTestResultReport$PacketsStat;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
            this.f331769a = i13;
            this.f331770b = intWithPercent;
            this.f331771c = intWithPercent2;
            this.f331772d = intWithPercent3;
            this.f331773e = stats;
            this.f331774f = stats2;
            this.f331775g = stats3;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PacketsStat)) {
                return false;
            }
            PacketsStat packetsStat = (PacketsStat) obj;
            return this.f331769a == packetsStat.f331769a && L.f(this.f331770b, packetsStat.f331770b) && L.f(this.f331771c, packetsStat.f331771c) && L.f(this.f331772d, packetsStat.f331772d) && L.f(this.f331773e, packetsStat.f331773e) && L.f(this.f331774f, packetsStat.f331774f) && L.f(this.f331775g, packetsStat.f331775g);
        }

        public final int hashCode() {
            return this.f331775g.hashCode() + ((this.f331774f.hashCode() + ((this.f331773e.hashCode() + ((this.f331772d.hashCode() + ((this.f331771c.hashCode() + ((this.f331770b.hashCode() + (Integer.hashCode(this.f331769a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            return "PacketsStat(sent=" + this.f331769a + ", lost=" + this.f331770b + ", outOfOrder=" + this.f331771c + ", duplicates=" + this.f331772d + ", rtt=" + this.f331773e + ", jitter=" + this.f331774f + ", burstLoss=" + this.f331775g + ')';
        }

        public PacketsStat(int i12, @Y61.k IntWithPercent intWithPercent, @Y61.k IntWithPercent intWithPercent2, @Y61.k IntWithPercent intWithPercent3, @Y61.k Stats stats, @Y61.k Stats stats2, @Y61.k Stats stats3) {
            this.f331769a = i12;
            this.f331770b = intWithPercent;
            this.f331771c = intWithPercent2;
            this.f331772d = intWithPercent3;
            this.f331773e = stats;
            this.f331774f = stats2;
            this.f331775g = stats3;
        }
    }

    /* compiled from: NetworkTestResultReport.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0010B_\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/avito/avcalls/android/network_test/NetworkTestResultReport$Stats;", "", "", "seen1", "count", "", "max", "min", "avg", "p99", "p90", "p50", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(IILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlinx.serialization.w
    public static final /* data */ class Stats {

        /* renamed from: Companion, reason: from kotlin metadata */
        @Y61.k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        public final int f331776a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Double f331777b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Double f331778c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final Double f331779d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final Double f331780e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final Double f331781f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final Double f331782g;

        /* compiled from: NetworkTestResultReport.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/android/network_test/NetworkTestResultReport$Stats$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/android/network_test/NetworkTestResultReport$Stats;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
            this.f331776a = i13;
            if ((i12 & 2) == 0) {
                this.f331777b = null;
            } else {
                this.f331777b = d12;
            }
            if ((i12 & 4) == 0) {
                this.f331778c = null;
            } else {
                this.f331778c = d13;
            }
            if ((i12 & 8) == 0) {
                this.f331779d = null;
            } else {
                this.f331779d = d14;
            }
            if ((i12 & 16) == 0) {
                this.f331780e = null;
            } else {
                this.f331780e = d15;
            }
            if ((i12 & 32) == 0) {
                this.f331781f = null;
            } else {
                this.f331781f = d16;
            }
            if ((i12 & 64) == 0) {
                this.f331782g = null;
            } else {
                this.f331782g = d17;
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
            return this.f331776a == stats.f331776a && L.f(this.f331777b, stats.f331777b) && L.f(this.f331778c, stats.f331778c) && L.f(this.f331779d, stats.f331779d) && L.f(this.f331780e, stats.f331780e) && L.f(this.f331781f, stats.f331781f) && L.f(this.f331782g, stats.f331782g);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f331776a) * 31;
            Double d12 = this.f331777b;
            int iHashCode2 = (iHashCode + (d12 == null ? 0 : d12.hashCode())) * 31;
            Double d13 = this.f331778c;
            int iHashCode3 = (iHashCode2 + (d13 == null ? 0 : d13.hashCode())) * 31;
            Double d14 = this.f331779d;
            int iHashCode4 = (iHashCode3 + (d14 == null ? 0 : d14.hashCode())) * 31;
            Double d15 = this.f331780e;
            int iHashCode5 = (iHashCode4 + (d15 == null ? 0 : d15.hashCode())) * 31;
            Double d16 = this.f331781f;
            int iHashCode6 = (iHashCode5 + (d16 == null ? 0 : d16.hashCode())) * 31;
            Double d17 = this.f331782g;
            return iHashCode6 + (d17 != null ? d17.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Stats(count=");
            sb2.append(this.f331776a);
            sb2.append(", max=");
            sb2.append(this.f331777b);
            sb2.append(", min=");
            sb2.append(this.f331778c);
            sb2.append(", avg=");
            sb2.append(this.f331779d);
            sb2.append(", p99=");
            sb2.append(this.f331780e);
            sb2.append(", p90=");
            sb2.append(this.f331781f);
            sb2.append(", p50=");
            return com.avito.android.authorization.auto_recovery.phone_confirm.b.h(sb2, this.f331782g, ')');
        }

        public Stats(int i12, @Y61.l Double d12, @Y61.l Double d13, @Y61.l Double d14, @Y61.l Double d15, @Y61.l Double d16, @Y61.l Double d17) {
            this.f331776a = i12;
            this.f331777b = d12;
            this.f331778c = d13;
            this.f331779d = d14;
            this.f331780e = d15;
            this.f331781f = d16;
            this.f331782g = d17;
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
        this.f331761a = config;
        this.f331762b = packetsStat;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkTestResultReport)) {
            return false;
        }
        NetworkTestResultReport networkTestResultReport = (NetworkTestResultReport) obj;
        return L.f(this.f331761a, networkTestResultReport.f331761a) && L.f(this.f331762b, networkTestResultReport.f331762b);
    }

    public final int hashCode() {
        return this.f331762b.hashCode() + (this.f331761a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "NetworkTestResultReport(config=" + this.f331761a + ", packets=" + this.f331762b + ')';
    }

    public NetworkTestResultReport(@Y61.k Config config, @Y61.k PacketsStat packetsStat) {
        this.f331761a = config;
        this.f331762b = packetsStat;
    }

    /* compiled from: NetworkTestResultReport.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u000eB=\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/avito/avcalls/android/network_test/NetworkTestResultReport$Config;", "", "", "seen1", "", "addr", "", "configFetchTime", "packetsSendPeriod", "packetSize", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;DIILkotlinx/serialization/internal/P0;)V", "Companion", "$serializer", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlinx.serialization.w
    public static final /* data */ class Config {

        /* renamed from: Companion, reason: from kotlin metadata */
        @Y61.k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f331763a;

        /* renamed from: b, reason: collision with root package name */
        public final double f331764b;

        /* renamed from: c, reason: collision with root package name */
        public final int f331765c;

        /* renamed from: d, reason: collision with root package name */
        public final int f331766d;

        /* compiled from: NetworkTestResultReport.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/android/network_test/NetworkTestResultReport$Config$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/avito/avcalls/android/network_test/NetworkTestResultReport$Config;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
            this.f331763a = str;
            this.f331764b = d12;
            this.f331765c = i12;
            this.f331766d = i13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return L.f(this.f331763a, config.f331763a) && Double.compare(this.f331764b, config.f331764b) == 0 && this.f331765c == config.f331765c && this.f331766d == config.f331766d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f331766d) + androidx.appcompat.app.r.e(this.f331765c, androidx.compose.ui.graphics.colorspace.e.d(this.f331763a.hashCode() * 31, 31, this.f331764b), 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Config(addr=");
            sb2.append(this.f331763a);
            sb2.append(", configFetchTime=");
            sb2.append(this.f331764b);
            sb2.append(", packetsSendPeriod=");
            sb2.append(this.f331765c);
            sb2.append(", packetSize=");
            return androidx.appcompat.app.r.t(sb2, this.f331766d, ')');
        }

        @InterfaceC42830m
        public /* synthetic */ Config(int i12, String str, double d12, int i13, int i14, P0 p02) {
            if (15 != (i12 & 15)) {
                E0.b(i12, 15, NetworkTestResultReport$Config$$serializer.INSTANCE.getF412706c());
                throw null;
            }
            this.f331763a = str;
            this.f331764b = d12;
            this.f331765c = i13;
            this.f331766d = i14;
        }
    }
}
