package com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet;

import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet.IacUIAudioDevicesBottomSheetState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacUIAudioDevicesBottomSheet.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class l extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ J f167005l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ IacUIAudioDevicesBottomSheetState f167006m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<IacUIAudioDevicesBottomSheetState.Device, G0> f167007n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f167008o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(J j12, IacUIAudioDevicesBottomSheetState iacUIAudioDevicesBottomSheetState, Y41.l<? super IacUIAudioDevicesBottomSheetState.Device, G0> lVar, int i12) {
        super(2);
        this.f167005l = j12;
        this.f167006m = iacUIAudioDevicesBottomSheetState;
        this.f167007n = lVar;
        this.f167008o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f167008o | 1);
        IacUIAudioDevicesBottomSheetState iacUIAudioDevicesBottomSheetState = this.f167006m;
        Y41.l<IacUIAudioDevicesBottomSheetState.Device, G0> lVar = this.f167007n;
        w.b(this.f167005l, iacUIAudioDevicesBottomSheetState, lVar, a12, iA2);
        return G0.f406611a;
    }
}
