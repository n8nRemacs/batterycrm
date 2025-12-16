package com.avito.android.remote.model.search;

import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InlineFilters.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/model/search/Theme;", "", "resName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getResName", "()Ljava/lang/String;", "AVITO", "AVITO_LOOK_AND_FEEL", "AVITO_RE_23", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Theme {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Theme[] $VALUES;

    @c("avito")
    public static final Theme AVITO = new Theme("AVITO", 0, "avito");

    @c("avitoLookAndFeel")
    public static final Theme AVITO_LOOK_AND_FEEL = new Theme("AVITO_LOOK_AND_FEEL", 1, "avitoLookAndFeel");

    @c("avitoRe23")
    public static final Theme AVITO_RE_23 = new Theme("AVITO_RE_23", 2, "avitoRe23");

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE;

    @k
    private final String resName;

    /* compiled from: InlineFilters.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\u00020\u0004*\u0004\u0018\u00010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/search/Theme$Companion;", "", "()V", "isAvitoRe23", "", "Lcom/avito/android/remote/model/search/Theme;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public final boolean isAvitoRe23(@l Theme theme) {
            return theme == Theme.AVITO_RE_23;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ Theme[] $values() {
        return new Theme[]{AVITO, AVITO_LOOK_AND_FEEL, AVITO_RE_23};
    }

    static {
        Theme[] themeArr$values = $values();
        $VALUES = themeArr$values;
        $ENTRIES = kotlin.enums.c.a(themeArr$values);
        INSTANCE = new Companion(null);
    }

    private Theme(String str, int i12, String str2) {
        this.resName = str2;
    }

    @k
    public static a<Theme> getEntries() {
        return $ENTRIES;
    }

    public static Theme valueOf(String str) {
        return (Theme) Enum.valueOf(Theme.class, str);
    }

    public static Theme[] values() {
        return (Theme[]) $VALUES.clone();
    }

    @k
    public final String getResName() {
        return this.resName;
    }
}
