package com.avito.android.iac_dialer_ui.pub.call_screen.control_buttons.talking;

import androidx.compose.runtime.H0;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IacUIControlButtonsToggleMic.kt */
@H0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_dialer_ui/pub/call_screen/control_buttons/talking/IacUIControlButtonsToggleMicState;", "", "LdL/d;", "<init>", "(Ljava/lang/String;I)V", "MicEnabled", "MicDisabled", "_avito_iac-dialer-ui_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IacUIControlButtonsToggleMicState implements dL.d {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ IacUIControlButtonsToggleMicState[] $VALUES;
    public static final IacUIControlButtonsToggleMicState MicEnabled = new IacUIControlButtonsToggleMicState("MicEnabled", 0);
    public static final IacUIControlButtonsToggleMicState MicDisabled = new IacUIControlButtonsToggleMicState("MicDisabled", 1);

    private static final /* synthetic */ IacUIControlButtonsToggleMicState[] $values() {
        return new IacUIControlButtonsToggleMicState[]{MicEnabled, MicDisabled};
    }

    static {
        IacUIControlButtonsToggleMicState[] iacUIControlButtonsToggleMicStateArr$values = $values();
        $VALUES = iacUIControlButtonsToggleMicStateArr$values;
        $ENTRIES = kotlin.enums.c.a(iacUIControlButtonsToggleMicStateArr$values);
    }

    private IacUIControlButtonsToggleMicState(String str, int i12) {
    }

    @Y61.k
    public static kotlin.enums.a<IacUIControlButtonsToggleMicState> getEntries() {
        return $ENTRIES;
    }

    public static IacUIControlButtonsToggleMicState valueOf(String str) {
        return (IacUIControlButtonsToggleMicState) Enum.valueOf(IacUIControlButtonsToggleMicState.class, str);
    }

    public static IacUIControlButtonsToggleMicState[] values() {
        return (IacUIControlButtonsToggleMicState[]) $VALUES.clone();
    }
}
