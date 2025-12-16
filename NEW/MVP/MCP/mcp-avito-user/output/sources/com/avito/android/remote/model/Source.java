package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Source.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/Source;", "", "(Ljava/lang/String;I)V", "RECOMMENDATIONS", "FAVOURITES", "DEVELOPMENTS", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Source {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Source[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE;

    @c("recommendations")
    public static final Source RECOMMENDATIONS = new Source("RECOMMENDATIONS", 0);

    @c("favourites")
    public static final Source FAVOURITES = new Source("FAVOURITES", 1);

    @c("developments")
    public static final Source DEVELOPMENTS = new Source("DEVELOPMENTS", 2);

    /* compiled from: Source.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/Source$Companion;", "", "()V", "fromString", "Lcom/avito/android/remote/model/Source;", "value", "", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @l
        public final Source fromString(@l String value) {
            if (value != null) {
                int iHashCode = value.hashCode();
                if (iHashCode != -1822967846) {
                    if (iHashCode != 586052842) {
                        if (iHashCode == 1620707992 && value.equals("developments")) {
                            return Source.DEVELOPMENTS;
                        }
                    } else if (value.equals("favourites")) {
                        return Source.FAVOURITES;
                    }
                } else if (value.equals("recommendations")) {
                    return Source.RECOMMENDATIONS;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ Source[] $values() {
        return new Source[]{RECOMMENDATIONS, FAVOURITES, DEVELOPMENTS};
    }

    static {
        Source[] sourceArr$values = $values();
        $VALUES = sourceArr$values;
        $ENTRIES = kotlin.enums.c.a(sourceArr$values);
        INSTANCE = new Companion(null);
    }

    private Source(String str, int i12) {
    }

    @k
    public static a<Source> getEntries() {
        return $ENTRIES;
    }

    public static Source valueOf(String str) {
        return (Source) Enum.valueOf(Source.class, str);
    }

    public static Source[] values() {
        return (Source[]) $VALUES.clone();
    }
}
