package com.avito.android.iac_dialer.impl_module.audio.ringtone;

import Y61.k;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IacRingingModeProvider.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u0004\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\u0005\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/ringtone/IacRingingMode;", "", "LdL/d;", "", "isVibrationAllowed", "isRingtoneAllowed", "<init>", "(Ljava/lang/String;IZZ)V", "Z", "()Z", "RINGTONE_AND_VIBRATION", "ONLY_VIBRATION", "ONLY_RINGTONE", "SILENCE", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IacRingingMode implements dL.d {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ IacRingingMode[] $VALUES;
    private final boolean isRingtoneAllowed;
    private final boolean isVibrationAllowed;
    public static final IacRingingMode RINGTONE_AND_VIBRATION = new IacRingingMode("RINGTONE_AND_VIBRATION", 0, true, true);
    public static final IacRingingMode ONLY_VIBRATION = new IacRingingMode("ONLY_VIBRATION", 1, true, false);
    public static final IacRingingMode ONLY_RINGTONE = new IacRingingMode("ONLY_RINGTONE", 2, false, true);
    public static final IacRingingMode SILENCE = new IacRingingMode("SILENCE", 3, false, false);

    private static final /* synthetic */ IacRingingMode[] $values() {
        return new IacRingingMode[]{RINGTONE_AND_VIBRATION, ONLY_VIBRATION, ONLY_RINGTONE, SILENCE};
    }

    static {
        IacRingingMode[] iacRingingModeArr$values = $values();
        $VALUES = iacRingingModeArr$values;
        $ENTRIES = kotlin.enums.c.a(iacRingingModeArr$values);
    }

    private IacRingingMode(String str, int i12, boolean z12, boolean z13) {
        this.isVibrationAllowed = z12;
        this.isRingtoneAllowed = z13;
    }

    @k
    public static kotlin.enums.a<IacRingingMode> getEntries() {
        return $ENTRIES;
    }

    public static IacRingingMode valueOf(String str) {
        return (IacRingingMode) Enum.valueOf(IacRingingMode.class, str);
    }

    public static IacRingingMode[] values() {
        return (IacRingingMode[]) $VALUES.clone();
    }

    /* renamed from: isRingtoneAllowed, reason: from getter */
    public final boolean getIsRingtoneAllowed() {
        return this.isRingtoneAllowed;
    }

    /* renamed from: isVibrationAllowed, reason: from getter */
    public final boolean getIsVibrationAllowed() {
        return this.isVibrationAllowed;
    }
}
