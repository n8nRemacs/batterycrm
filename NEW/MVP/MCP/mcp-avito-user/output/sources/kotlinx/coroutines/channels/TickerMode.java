package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlinx.coroutines.InterfaceC43230i1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TickerChannels.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/channels/TickerMode;", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC43230i1
/* loaded from: classes8.dex */
public final class TickerMode {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ TickerMode[] f410837b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f410838c;

    static {
        TickerMode[] tickerModeArr = {new TickerMode("FIXED_PERIOD", 0), new TickerMode("FIXED_DELAY", 1)};
        f410837b = tickerModeArr;
        f410838c = kotlin.enums.c.a(tickerModeArr);
    }

    public TickerMode() {
        throw null;
    }

    public static TickerMode valueOf(String str) {
        return (TickerMode) Enum.valueOf(TickerMode.class, str);
    }

    public static TickerMode[] values() {
        return (TickerMode[]) f410837b.clone();
    }
}
