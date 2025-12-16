package com.avito.android.remote.model.autotekateaser;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AutotekaTeaserItemResponse.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/model/autotekateaser/InsightType;", "", "(Ljava/lang/String;I)V", "SCROLL_TO_TEASER", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class InsightType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ InsightType[] $VALUES;

    @c("scrollToTeaser")
    public static final InsightType SCROLL_TO_TEASER = new InsightType("SCROLL_TO_TEASER", 0);

    private static final /* synthetic */ InsightType[] $values() {
        return new InsightType[]{SCROLL_TO_TEASER};
    }

    static {
        InsightType[] insightTypeArr$values = $values();
        $VALUES = insightTypeArr$values;
        $ENTRIES = kotlin.enums.c.a(insightTypeArr$values);
    }

    private InsightType(String str, int i12) {
    }

    @k
    public static a<InsightType> getEntries() {
        return $ENTRIES;
    }

    public static InsightType valueOf(String str) {
        return (InsightType) Enum.valueOf(InsightType.class, str);
    }

    public static InsightType[] values() {
        return (InsightType[]) $VALUES.clone();
    }
}
