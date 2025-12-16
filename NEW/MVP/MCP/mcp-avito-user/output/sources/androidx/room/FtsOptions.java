package androidx.room;

import kotlin.Metadata;

/* compiled from: FtsOptions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/room/FtsOptions;", "", "<init>", "()V", "MatchInfo", "Order", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FtsOptions {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FtsOptions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/FtsOptions$MatchInfo;", "", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class MatchInfo {

        /* renamed from: b, reason: collision with root package name */
        public static final MatchInfo f54265b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ MatchInfo[] f54266c;

        /* JADX INFO: Fake field, exist only in values array */
        MatchInfo EF0;

        static {
            MatchInfo matchInfo = new MatchInfo("FTS3", 0);
            MatchInfo matchInfo2 = new MatchInfo("FTS4", 1);
            f54265b = matchInfo2;
            f54266c = new MatchInfo[]{matchInfo, matchInfo2};
        }

        public MatchInfo() {
            throw null;
        }

        public static MatchInfo valueOf(String str) {
            return (MatchInfo) Enum.valueOf(MatchInfo.class, str);
        }

        public static MatchInfo[] values() {
            return (MatchInfo[]) f54266c.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FtsOptions.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/FtsOptions$Order;", "", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Order {

        /* renamed from: b, reason: collision with root package name */
        public static final Order f54267b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Order[] f54268c;

        static {
            Order order = new Order("ASC", 0);
            f54267b = order;
            f54268c = new Order[]{order, new Order("DESC", 1)};
        }

        public Order() {
            throw null;
        }

        public static Order valueOf(String str) {
            return (Order) Enum.valueOf(Order.class, str);
        }

        public static Order[] values() {
            return (Order[]) f54268c.clone();
        }
    }

    static {
        new FtsOptions();
    }
}
