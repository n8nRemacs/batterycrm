package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PresentationType.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u0004j\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/PresentationType;", "", "(Ljava/lang/String;I)V", "isFullMap", "", "isMain", "isMap", "isMapWithoutSerp", "isPush", "isRegularMap", "isSearch", "isSerp", "isSimpleMap", "FULL_MAP", "SERP", "MAIN", "PUSH", "SIMPLE_MAP", "REGULAR_MAP", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PresentationType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PresentationType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE;

    @c("fullMap")
    public static final PresentationType FULL_MAP = new PresentationType("FULL_MAP", 0);

    @c("serp")
    public static final PresentationType SERP = new PresentationType("SERP", 1);

    @c("main")
    public static final PresentationType MAIN = new PresentationType("MAIN", 2);

    @c("push")
    public static final PresentationType PUSH = new PresentationType("PUSH", 3);

    @c("simpleMap")
    public static final PresentationType SIMPLE_MAP = new PresentationType("SIMPLE_MAP", 4);

    @c("regularMap")
    public static final PresentationType REGULAR_MAP = new PresentationType("REGULAR_MAP", 5);

    /* compiled from: PresentationType.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/PresentationType$Companion;", "", "()V", "defaultValue", "Lcom/avito/android/remote/model/PresentationType;", "fromString", "value", "", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final PresentationType defaultValue() {
            return PresentationType.SERP;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @k
        public final PresentationType fromString(@l String value) {
            if (value != null) {
                switch (value.hashCode()) {
                    case -2124396982:
                        if (value.equals("simpleMap")) {
                            return PresentationType.SIMPLE_MAP;
                        }
                        break;
                    case -511259571:
                        if (value.equals("fullMap")) {
                            return PresentationType.FULL_MAP;
                        }
                        break;
                    case -27420640:
                        if (value.equals("regularMap")) {
                            return PresentationType.REGULAR_MAP;
                        }
                        break;
                    case 3343801:
                        if (value.equals("main")) {
                            return PresentationType.MAIN;
                        }
                        break;
                    case 3452698:
                        if (value.equals("push")) {
                            return PresentationType.PUSH;
                        }
                        break;
                    case 3526672:
                        if (value.equals("serp")) {
                            return PresentationType.SERP;
                        }
                        break;
                }
            }
            return defaultValue();
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ PresentationType[] $values() {
        return new PresentationType[]{FULL_MAP, SERP, MAIN, PUSH, SIMPLE_MAP, REGULAR_MAP};
    }

    static {
        PresentationType[] presentationTypeArr$values = $values();
        $VALUES = presentationTypeArr$values;
        $ENTRIES = kotlin.enums.c.a(presentationTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private PresentationType(String str, int i12) {
    }

    @k
    public static a<PresentationType> getEntries() {
        return $ENTRIES;
    }

    public static PresentationType valueOf(String str) {
        return (PresentationType) Enum.valueOf(PresentationType.class, str);
    }

    public static PresentationType[] values() {
        return (PresentationType[]) $VALUES.clone();
    }

    public final boolean isFullMap() {
        return this == FULL_MAP;
    }

    public final boolean isMain() {
        return this == MAIN;
    }

    public final boolean isMap() {
        return isSimpleMap() || isFullMap() || isRegularMap();
    }

    public final boolean isMapWithoutSerp() {
        return isSimpleMap() || isRegularMap();
    }

    public final boolean isPush() {
        return this == PUSH;
    }

    public final boolean isRegularMap() {
        return this == REGULAR_MAP;
    }

    public final boolean isSearch() {
        return isSerp() || isMap();
    }

    public final boolean isSerp() {
        return this == SERP;
    }

    public final boolean isSimpleMap() {
        return this == SIMPLE_MAP;
    }
}
