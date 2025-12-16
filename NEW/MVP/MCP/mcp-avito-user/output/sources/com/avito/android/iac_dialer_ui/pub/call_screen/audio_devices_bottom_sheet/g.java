package com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet.IacUIAudioDevicesBottomSheetState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.channels.C43108m;

/* compiled from: IacUIAudioDevicesBottomSheet.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class g extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ IacUIAudioDevicesBottomSheetState f166992l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C43108m f166993m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f166994n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<IacUIAudioDevicesBottomSheetState.Device, G0> f166995o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f166996p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(IacUIAudioDevicesBottomSheetState iacUIAudioDevicesBottomSheetState, C43108m c43108m, androidx.compose.ui.v vVar, Y41.l lVar, int i12) {
        super(2);
        this.f166992l = iacUIAudioDevicesBottomSheetState;
        this.f166993m = c43108m;
        this.f166994n = vVar;
        this.f166995o = lVar;
        this.f166996p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f166996p | 1);
        C43108m c43108m = this.f166993m;
        w.a(this.f166992l, c43108m, this.f166995o, a12, iA2);
        return G0.f406611a;
    }
}
