package defpackage;

import ru.ok.android.externcalls.sdk.stat.negotiation.NegotiationErrorStat;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class te7 {
    public static final /* synthetic */ te7[] a = {new te7("UNKNOWN", 0), new te7("REQUESTED", 1), new te7("INTERMEDIATE_AVAILABLE", 2), new te7("SUCCESS", 3), new te7("ERROR", 4), new te7("EMPTY_EVENT", 5), new te7("RELEASED", 6)};

    /* JADX INFO: Fake field, exist only in values array */
    te7 EF5;

    static {
        values();
    }

    public static te7 valueOf(String str) {
        return (te7) Enum.valueOf(te7.class, str);
    }

    public static te7[] values() {
        return (te7[]) a.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int i = se7.$EnumSwitchMapping$0[ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "unknown" : "released" : NegotiationErrorStat.KEY_ERROR : "intermediate_available" : "success" : "requested";
    }
}
