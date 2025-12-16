package kotlinx.datetime.format;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LocalTimeFormat.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/datetime/format/AmPmMarker;", "", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AmPmMarker {

    /* renamed from: b, reason: collision with root package name */
    public static final AmPmMarker f412324b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AmPmMarker[] f412325c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f412326d;

    static {
        AmPmMarker amPmMarker = new AmPmMarker("AM", 0);
        AmPmMarker amPmMarker2 = new AmPmMarker("PM", 1);
        f412324b = amPmMarker2;
        AmPmMarker[] amPmMarkerArr = {amPmMarker, amPmMarker2};
        f412325c = amPmMarkerArr;
        f412326d = kotlin.enums.c.a(amPmMarkerArr);
    }

    public AmPmMarker() {
        throw null;
    }

    public static AmPmMarker valueOf(String str) {
        return (AmPmMarker) Enum.valueOf(AmPmMarker.class, str);
    }

    public static AmPmMarker[] values() {
        return (AmPmMarker[]) f412325c.clone();
    }
}
