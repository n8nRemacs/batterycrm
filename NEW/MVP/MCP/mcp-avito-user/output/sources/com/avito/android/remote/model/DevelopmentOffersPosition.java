package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DevelopmentOffers.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/DevelopmentOffersPosition;", "", "(Ljava/lang/String;I)V", "BEFORE_ALL_PARAMETERS", "AFTER_ADDITIONAL_PARAMETERS", "Companion", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DevelopmentOffersPosition {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DevelopmentOffersPosition[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE;
    public static final DevelopmentOffersPosition BEFORE_ALL_PARAMETERS = new DevelopmentOffersPosition("BEFORE_ALL_PARAMETERS", 0);
    public static final DevelopmentOffersPosition AFTER_ADDITIONAL_PARAMETERS = new DevelopmentOffersPosition("AFTER_ADDITIONAL_PARAMETERS", 1);

    /* compiled from: DevelopmentOffers.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/DevelopmentOffersPosition$Companion;", "", "()V", "fromString", "Lcom/avito/android/remote/model/DevelopmentOffersPosition;", "string", "", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @l
        public final DevelopmentOffersPosition fromString(@l String string) {
            if (L.f(string, "beforeAllParameters")) {
                return DevelopmentOffersPosition.BEFORE_ALL_PARAMETERS;
            }
            if (L.f(string, "afterAdditionalParameters")) {
                return DevelopmentOffersPosition.AFTER_ADDITIONAL_PARAMETERS;
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ DevelopmentOffersPosition[] $values() {
        return new DevelopmentOffersPosition[]{BEFORE_ALL_PARAMETERS, AFTER_ADDITIONAL_PARAMETERS};
    }

    static {
        DevelopmentOffersPosition[] developmentOffersPositionArr$values = $values();
        $VALUES = developmentOffersPositionArr$values;
        $ENTRIES = c.a(developmentOffersPositionArr$values);
        INSTANCE = new Companion(null);
    }

    private DevelopmentOffersPosition(String str, int i12) {
    }

    @k
    public static a<DevelopmentOffersPosition> getEntries() {
        return $ENTRIES;
    }

    public static DevelopmentOffersPosition valueOf(String str) {
        return (DevelopmentOffersPosition) Enum.valueOf(DevelopmentOffersPosition.class, str);
    }

    public static DevelopmentOffersPosition[] values() {
        return (DevelopmentOffersPosition[]) $VALUES.clone();
    }
}
