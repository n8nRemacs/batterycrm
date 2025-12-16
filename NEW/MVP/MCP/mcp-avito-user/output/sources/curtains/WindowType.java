package curtains;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WindowType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcurtains/WindowType;", "", "curtains_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class WindowType {

    /* renamed from: b, reason: collision with root package name */
    public static final WindowType f392989b;

    /* renamed from: c, reason: collision with root package name */
    public static final WindowType f392990c;

    /* renamed from: d, reason: collision with root package name */
    public static final WindowType f392991d;

    /* renamed from: e, reason: collision with root package name */
    public static final WindowType f392992e;

    /* renamed from: f, reason: collision with root package name */
    public static final WindowType f392993f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ WindowType[] f392994g;

    static {
        WindowType windowType = new WindowType("PHONE_WINDOW", 0);
        f392989b = windowType;
        WindowType windowType2 = new WindowType("POPUP_WINDOW", 1);
        f392990c = windowType2;
        WindowType windowType3 = new WindowType("TOOLTIP", 2);
        f392991d = windowType3;
        WindowType windowType4 = new WindowType("TOAST", 3);
        f392992e = windowType4;
        WindowType windowType5 = new WindowType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4);
        f392993f = windowType5;
        f392994g = new WindowType[]{windowType, windowType2, windowType3, windowType4, windowType5};
    }

    public WindowType() {
        throw null;
    }

    public static WindowType valueOf(String str) {
        return (WindowType) Enum.valueOf(WindowType.class, str);
    }

    public static WindowType[] values() {
        return (WindowType[]) f392994g.clone();
    }
}
