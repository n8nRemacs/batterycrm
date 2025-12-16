package com.avito.android.iac_avcalls.public_module.models;

import Y61.k;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AvCallsConnectionQuality.kt */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/models/AvCallsConnectionQuality;", "", "(Ljava/lang/String;I)V", "NO_DATA", "OK", "UNSTABLE", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AvCallsConnectionQuality {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AvCallsConnectionQuality[] $VALUES;

    @Keep
    public static final AvCallsConnectionQuality NO_DATA = new AvCallsConnectionQuality("NO_DATA", 0);

    /* renamed from: OK, reason: collision with root package name */
    @Keep
    public static final AvCallsConnectionQuality f164618OK = new AvCallsConnectionQuality("OK", 1);

    @Keep
    public static final AvCallsConnectionQuality UNSTABLE = new AvCallsConnectionQuality("UNSTABLE", 2);

    private static final /* synthetic */ AvCallsConnectionQuality[] $values() {
        return new AvCallsConnectionQuality[]{NO_DATA, f164618OK, UNSTABLE};
    }

    static {
        AvCallsConnectionQuality[] avCallsConnectionQualityArr$values = $values();
        $VALUES = avCallsConnectionQualityArr$values;
        $ENTRIES = c.a(avCallsConnectionQualityArr$values);
    }

    private AvCallsConnectionQuality(String str, int i12) {
    }

    @k
    public static a<AvCallsConnectionQuality> getEntries() {
        return $ENTRIES;
    }

    public static AvCallsConnectionQuality valueOf(String str) {
        return (AvCallsConnectionQuality) Enum.valueOf(AvCallsConnectionQuality.class, str);
    }

    public static AvCallsConnectionQuality[] values() {
        return (AvCallsConnectionQuality[]) $VALUES.clone();
    }
}
