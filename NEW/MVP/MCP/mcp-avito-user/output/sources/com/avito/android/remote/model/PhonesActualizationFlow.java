package com.avito.android.remote.model;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ActualizePhonesScenarioResult.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/PhonesActualizationFlow;", "", "(Ljava/lang/String;I)V", "HAS_VERIFIED", "NO_VERIFIED", "ACTUALIZED", "NO_PHONES", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PhonesActualizationFlow {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PhonesActualizationFlow[] $VALUES;

    @c("has_verified")
    public static final PhonesActualizationFlow HAS_VERIFIED = new PhonesActualizationFlow("HAS_VERIFIED", 0);

    @c("no_verified")
    public static final PhonesActualizationFlow NO_VERIFIED = new PhonesActualizationFlow("NO_VERIFIED", 1);

    @c("actualized")
    public static final PhonesActualizationFlow ACTUALIZED = new PhonesActualizationFlow("ACTUALIZED", 2);

    @c("no_phones")
    public static final PhonesActualizationFlow NO_PHONES = new PhonesActualizationFlow("NO_PHONES", 3);

    private static final /* synthetic */ PhonesActualizationFlow[] $values() {
        return new PhonesActualizationFlow[]{HAS_VERIFIED, NO_VERIFIED, ACTUALIZED, NO_PHONES};
    }

    static {
        PhonesActualizationFlow[] phonesActualizationFlowArr$values = $values();
        $VALUES = phonesActualizationFlowArr$values;
        $ENTRIES = kotlin.enums.c.a(phonesActualizationFlowArr$values);
    }

    private PhonesActualizationFlow(String str, int i12) {
    }

    @k
    public static a<PhonesActualizationFlow> getEntries() {
        return $ENTRIES;
    }

    public static PhonesActualizationFlow valueOf(String str) {
        return (PhonesActualizationFlow) Enum.valueOf(PhonesActualizationFlow.class, str);
    }

    public static PhonesActualizationFlow[] values() {
        return (PhonesActualizationFlow[]) $VALUES.clone();
    }
}
