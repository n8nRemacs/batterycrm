package com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet;

import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.A;
import com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet.IacUIAudioDevicesBottomSheetState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacUIAudioDevicesBottomSheet.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/J;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/J;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class f extends N implements Y41.q<J, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ IacUIAudioDevicesBottomSheetState f166990l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<IacUIAudioDevicesBottomSheetState.Device, G0> f166991m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(IacUIAudioDevicesBottomSheetState iacUIAudioDevicesBottomSheetState, Y41.l<? super IacUIAudioDevicesBottomSheetState.Device, G0> lVar) {
        super(3);
        this.f166990l = iacUIAudioDevicesBottomSheetState;
        this.f166991m = lVar;
    }

    @Override // Y41.q
    public final G0 invoke(J j12, A a12, Integer num) {
        J j13 = j12;
        A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.B(j13) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && a13.c()) {
            a13.f();
        } else {
            w.b(j13, this.f166990l, this.f166991m, a13, (iIntValue & 14) | 64);
        }
        return G0.f406611a;
    }
}
