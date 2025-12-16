package com.avito.android.iac_dialer_ui.pub.call_screen.control_buttons.talking;

import androidx.compose.runtime.H0;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IacUIControlButtonsAudioDevice.kt */
@H0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/iac_dialer_ui/pub/call_screen/control_buttons/talking/IacUIControlButtonsAudioDeviceState;", "", "LdL/d;", "<init>", "(Ljava/lang/String;I)V", "EarpieceOrWireHeadset", "Speaker", "Bluetooth", "_avito_iac-dialer-ui_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IacUIControlButtonsAudioDeviceState implements dL.d {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ IacUIControlButtonsAudioDeviceState[] $VALUES;
    public static final IacUIControlButtonsAudioDeviceState EarpieceOrWireHeadset = new IacUIControlButtonsAudioDeviceState("EarpieceOrWireHeadset", 0);
    public static final IacUIControlButtonsAudioDeviceState Speaker = new IacUIControlButtonsAudioDeviceState("Speaker", 1);
    public static final IacUIControlButtonsAudioDeviceState Bluetooth = new IacUIControlButtonsAudioDeviceState("Bluetooth", 2);

    private static final /* synthetic */ IacUIControlButtonsAudioDeviceState[] $values() {
        return new IacUIControlButtonsAudioDeviceState[]{EarpieceOrWireHeadset, Speaker, Bluetooth};
    }

    static {
        IacUIControlButtonsAudioDeviceState[] iacUIControlButtonsAudioDeviceStateArr$values = $values();
        $VALUES = iacUIControlButtonsAudioDeviceStateArr$values;
        $ENTRIES = kotlin.enums.c.a(iacUIControlButtonsAudioDeviceStateArr$values);
    }

    private IacUIControlButtonsAudioDeviceState(String str, int i12) {
    }

    @Y61.k
    public static kotlin.enums.a<IacUIControlButtonsAudioDeviceState> getEntries() {
        return $ENTRIES;
    }

    public static IacUIControlButtonsAudioDeviceState valueOf(String str) {
        return (IacUIControlButtonsAudioDeviceState) Enum.valueOf(IacUIControlButtonsAudioDeviceState.class, str);
    }

    public static IacUIControlButtonsAudioDeviceState[] values() {
        return (IacUIControlButtonsAudioDeviceState[]) $VALUES.clone();
    }
}
