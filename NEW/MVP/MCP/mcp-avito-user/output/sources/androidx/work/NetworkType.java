package androidx.work;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NetworkType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/NetworkType;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class NetworkType {

    /* renamed from: b, reason: collision with root package name */
    public static final NetworkType f55395b;

    /* renamed from: c, reason: collision with root package name */
    public static final NetworkType f55396c;

    /* renamed from: d, reason: collision with root package name */
    public static final NetworkType f55397d;

    /* renamed from: e, reason: collision with root package name */
    public static final NetworkType f55398e;

    /* renamed from: f, reason: collision with root package name */
    public static final NetworkType f55399f;

    /* renamed from: g, reason: collision with root package name */
    @j.X
    public static final NetworkType f55400g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ NetworkType[] f55401h;

    static {
        NetworkType networkType = new NetworkType("NOT_REQUIRED", 0);
        f55395b = networkType;
        NetworkType networkType2 = new NetworkType("CONNECTED", 1);
        f55396c = networkType2;
        NetworkType networkType3 = new NetworkType("UNMETERED", 2);
        f55397d = networkType3;
        NetworkType networkType4 = new NetworkType("NOT_ROAMING", 3);
        f55398e = networkType4;
        NetworkType networkType5 = new NetworkType("METERED", 4);
        f55399f = networkType5;
        NetworkType networkType6 = new NetworkType("TEMPORARILY_UNMETERED", 5);
        f55400g = networkType6;
        f55401h = new NetworkType[]{networkType, networkType2, networkType3, networkType4, networkType5, networkType6};
    }

    public NetworkType() {
        throw null;
    }

    public static NetworkType valueOf(String str) {
        return (NetworkType) Enum.valueOf(NetworkType.class, str);
    }

    public static NetworkType[] values() {
        return (NetworkType[]) f55401h.clone();
    }
}
