package com.avito.android.iac_dialer_finished.public_module.screens.finished_fallback_screen;

import Y61.k;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AutomaticGsmClickSource.kt */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_fallback_screen/AutomaticGsmClickSource;", "", "(Ljava/lang/String;I)V", "WaitGsmFallback", "ActiveFallback", "_avito_iac-dialer-finished_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AutomaticGsmClickSource {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AutomaticGsmClickSource[] $VALUES;
    public static final AutomaticGsmClickSource WaitGsmFallback = new AutomaticGsmClickSource("WaitGsmFallback", 0);
    public static final AutomaticGsmClickSource ActiveFallback = new AutomaticGsmClickSource("ActiveFallback", 1);

    private static final /* synthetic */ AutomaticGsmClickSource[] $values() {
        return new AutomaticGsmClickSource[]{WaitGsmFallback, ActiveFallback};
    }

    static {
        AutomaticGsmClickSource[] automaticGsmClickSourceArr$values = $values();
        $VALUES = automaticGsmClickSourceArr$values;
        $ENTRIES = c.a(automaticGsmClickSourceArr$values);
    }

    private AutomaticGsmClickSource(String str, int i12) {
    }

    @k
    public static a<AutomaticGsmClickSource> getEntries() {
        return $ENTRIES;
    }

    public static AutomaticGsmClickSource valueOf(String str) {
        return (AutomaticGsmClickSource) Enum.valueOf(AutomaticGsmClickSource.class, str);
    }

    public static AutomaticGsmClickSource[] values() {
        return (AutomaticGsmClickSource[]) $VALUES.clone();
    }
}
