package shark;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LeakNodeStatus.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lshark/LeakNodeStatus;", "", "shark"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class LeakNodeStatus {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ LeakNodeStatus[] f438098b = {new LeakNodeStatus("NOT_LEAKING", 0), new LeakNodeStatus("LEAKING", 1), new LeakNodeStatus(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2)};

    /* JADX INFO: Fake field, exist only in values array */
    LeakNodeStatus EF5;

    public LeakNodeStatus() {
        throw null;
    }

    public static LeakNodeStatus valueOf(String str) {
        return (LeakNodeStatus) Enum.valueOf(LeakNodeStatus.class, str);
    }

    public static LeakNodeStatus[] values() {
        return (LeakNodeStatus[]) f438098b.clone();
    }
}
