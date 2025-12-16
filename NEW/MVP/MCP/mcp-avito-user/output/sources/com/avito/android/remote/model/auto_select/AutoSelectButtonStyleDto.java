package com.avito.android.remote.model.auto_select;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AutoSelectButtonStyleDto.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/auto_select/AutoSelectButtonStyleDto;", "", "(Ljava/lang/String;I)V", "PRIMARY", "SECONDARY", "OVERLAY_PRIMARY", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AutoSelectButtonStyleDto {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AutoSelectButtonStyleDto[] $VALUES;

    @c("primary")
    public static final AutoSelectButtonStyleDto PRIMARY = new AutoSelectButtonStyleDto("PRIMARY", 0);

    @c("secondary")
    public static final AutoSelectButtonStyleDto SECONDARY = new AutoSelectButtonStyleDto("SECONDARY", 1);

    @c("overlay_primary")
    public static final AutoSelectButtonStyleDto OVERLAY_PRIMARY = new AutoSelectButtonStyleDto("OVERLAY_PRIMARY", 2);

    private static final /* synthetic */ AutoSelectButtonStyleDto[] $values() {
        return new AutoSelectButtonStyleDto[]{PRIMARY, SECONDARY, OVERLAY_PRIMARY};
    }

    static {
        AutoSelectButtonStyleDto[] autoSelectButtonStyleDtoArr$values = $values();
        $VALUES = autoSelectButtonStyleDtoArr$values;
        $ENTRIES = kotlin.enums.c.a(autoSelectButtonStyleDtoArr$values);
    }

    private AutoSelectButtonStyleDto(String str, int i12) {
    }

    @k
    public static a<AutoSelectButtonStyleDto> getEntries() {
        return $ENTRIES;
    }

    public static AutoSelectButtonStyleDto valueOf(String str) {
        return (AutoSelectButtonStyleDto) Enum.valueOf(AutoSelectButtonStyleDto.class, str);
    }

    public static AutoSelectButtonStyleDto[] values() {
        return (AutoSelectButtonStyleDto[]) $VALUES.clone();
    }
}
