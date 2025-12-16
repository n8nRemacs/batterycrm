package com.avito.android.iac_dialer.impl_module.screens.call_screen.view;

import com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet.IacUIAudioDevicesBottomSheetState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import xK.InterfaceC49852b;

/* compiled from: IacCallScreenViewFactory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/iac_dialer_ui/pub/call_screen/audio_devices_bottom_sheet/IacUIAudioDevicesBottomSheetState$Device;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/iac_dialer_ui/pub/call_screen/audio_devices_bottom_sheet/IacUIAudioDevicesBottomSheetState$Device;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class h extends N implements Y41.l<IacUIAudioDevicesBottomSheetState.Device, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC49852b, G0> f166333l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(Y41.l<? super InterfaceC49852b, G0> lVar) {
        super(1);
        this.f166333l = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(IacUIAudioDevicesBottomSheetState.Device device) {
        IacUIAudioDevicesBottomSheetState.Device device2 = device;
        ((e) this.f166333l).invoke(new InterfaceC49852b.C12860b(device2.getName(), device2.getId()));
        return G0.f406611a;
    }
}
