package com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet;

import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet.IacUIAudioDevicesBottomSheetState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacUIAudioDevicesBottomSheet.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/iac_dialer_ui/pub/call_screen/audio_devices_bottom_sheet/IacUIAudioDevicesBottomSheetState$Device;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/iac_dialer_ui/pub/call_screen/audio_devices_bottom_sheet/IacUIAudioDevicesBottomSheetState$Device;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class u extends N implements Y41.l<IacUIAudioDevicesBottomSheetState.Device, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<IacUIAudioDevicesBottomSheetState> f167028l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(InterfaceC22204y1<IacUIAudioDevicesBottomSheetState> interfaceC22204y1) {
        super(1);
        this.f167028l = interfaceC22204y1;
    }

    @Override // Y41.l
    public final G0 invoke(IacUIAudioDevicesBottomSheetState.Device device) {
        IacUIAudioDevicesBottomSheetState iacUIAudioDevicesBottomSheetState = w.f167030a;
        InterfaceC22204y1<IacUIAudioDevicesBottomSheetState> interfaceC22204y1 = this.f167028l;
        interfaceC22204y1.setValue(IacUIAudioDevicesBottomSheetState.copy$default(interfaceC22204y1.getF42167b(), device, null, 2, null));
        return G0.f406611a;
    }
}
