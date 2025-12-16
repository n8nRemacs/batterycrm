package com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet;

import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.v;
import com.akita.compose.component.bottom_sheet.H;
import com.akita.compose.component.bottom_sheet.I;
import com.akita.compose.component.bottom_sheet.N;
import com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet.IacUIAudioDevicesBottomSheetState;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.channels.C43108m;

/* compiled from: IacUIAudioDevicesBottomSheet.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0004²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"", "addBottomSheetInComposition", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/audio_devices_bottom_sheet/IacUIAudioDevicesBottomSheetState;", "audioState", "_avito_iac-dialer-ui_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final IacUIAudioDevicesBottomSheetState f167030a = new IacUIAudioDevicesBottomSheetState(new IacUIAudioDevicesBottomSheetState.Device("Device 1", "1"), C42745f0.U(new IacUIAudioDevicesBottomSheetState.Device("Device 1", "1"), new IacUIAudioDevicesBottomSheetState.Device("Device 2", "2"), new IacUIAudioDevicesBottomSheetState.Device("Device 3", "3"), new IacUIAudioDevicesBottomSheetState.Device("Device 4", "4")));

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k IacUIAudioDevicesBottomSheetState iacUIAudioDevicesBottomSheetState, @Y61.k C43108m c43108m, @Y61.k Y41.l lVar, @Y61.l A a12, int i12) {
        B bE2 = a12.E(-1289334326);
        v.a aVar = androidx.compose.ui.v.f42878y1;
        bE2.C(570943711);
        Object objT = bE2.t();
        A.f37866a.getClass();
        Object obj = A.a.f37868b;
        if (objT == obj) {
            objT = C22126m3.g(Boolean.FALSE);
            bE2.H(objT);
        }
        InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
        bE2.X(false);
        Object objT2 = bE2.t();
        if (objT2 == obj) {
            objT2 = C22187u0.h(EmptyCoroutineContext.INSTANCE, bE2);
            bE2.H(objT2);
        }
        T t12 = (T) objT2;
        I iA2 = N.a(false, 0.0f, bE2, 0, 7);
        bE2.C(570949231);
        boolean zB2 = bE2.B(t12) | bE2.B(iA2);
        Object objT3 = bE2.t();
        if (zB2 || objT3 == obj) {
            objT3 = new i(iA2, t12);
            bE2.H(objT3);
        }
        Y41.a aVar2 = (Y41.a) objT3;
        bE2.X(false);
        C22187u0.d(new c(c43108m, iA2, interfaceC22204y1, null), bE2, c43108m);
        if (!((Boolean) interfaceC22204y1.getF42167b()).booleanValue()) {
            C22039c2 c22039c2Z = bE2.Z();
            if (c22039c2Z != null) {
                c22039c2Z.f38184d = new d(iacUIAudioDevicesBottomSheetState, c43108m, aVar, lVar, i12);
                return;
            }
            return;
        }
        bE2.C(570976670);
        boolean z12 = (((i12 & 7168) ^ 3072) > 2048 && bE2.B(lVar)) || (i12 & 3072) == 2048;
        Object objT4 = bE2.t();
        if (z12 || objT4 == obj) {
            objT4 = new j(aVar2, lVar);
            bE2.H(objT4);
        }
        Y41.l lVar2 = (Y41.l) objT4;
        Object objI = com.akita.compose.component.accordion.s.i(570984420, bE2, false);
        if (objI == obj) {
            objI = new e(interfaceC22204y1);
            bE2.H(objI);
        }
        bE2.X(false);
        H.a((Y41.a) objI, aVar, iA2, null, null, null, null, false, false, null, null, null, androidx.compose.runtime.internal.r.c(-27290902, new f(iacUIAudioDevicesBottomSheetState, lVar2), bE2), bE2, 6, 384, 4088);
        C22039c2 c22039c2Z2 = bE2.Z();
        if (c22039c2Z2 != null) {
            c22039c2Z2.f38184d = new g(iacUIAudioDevicesBottomSheetState, c43108m, aVar, lVar, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(androidx.compose.foundation.layout.J r21, com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet.IacUIAudioDevicesBottomSheetState r22, Y41.l r23, androidx.compose.runtime.A r24, int r25) {
        /*
            r0 = r23
            r1 = r25
            r2 = -2144828720(0xffffffff802882d0, float:-3.720347E-39)
            r3 = r24
            androidx.compose.runtime.B r2 = r3.E(r2)
            r3 = 24
            float r3 = (float) r3
            androidx.compose.ui.unit.h$a r4 = androidx.compose.ui.unit.h.f42849c
            r12 = 0
            r13 = 6
            com.akita.compose.foundation.ui.g.a(r3, r12, r2, r13)
            r3 = 1710998453(0x65fbc3b5, float:1.4861552E23)
            r2.C(r3)
            java.util.List r3 = r22.getAvailable()
            if (r3 != 0) goto L25
            kotlin.collections.z0 r3 = kotlin.collections.C42784z0.f406748b
        L25:
            java.util.Iterator r14 = r3.iterator()
        L29:
            boolean r3 = r14.hasNext()
            r4 = 0
            r5 = 16
            if (r3 == 0) goto Lb8
            java.lang.Object r3 = r14.next()
            com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet.IacUIAudioDevicesBottomSheetState$Device r3 = (com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet.IacUIAudioDevicesBottomSheetState.Device) r3
            androidx.compose.ui.v$a r6 = androidx.compose.ui.v.f42878y1
            float r5 = (float) r5
            r7 = 0
            r8 = 2
            androidx.compose.ui.v r15 = androidx.compose.foundation.layout.R1.k(r5, r7, r8, r6)
            r5 = 1711003716(0x65fbd844, float:1.4866292E23)
            r2.C(r5)
            r5 = r1 & 896(0x380, float:1.256E-42)
            r5 = r5 ^ 384(0x180, float:5.38E-43)
            r6 = 256(0x100, float:3.59E-43)
            if (r5 <= r6) goto L55
            boolean r5 = r2.B(r0)
            if (r5 != 0) goto L59
        L55:
            r5 = r1 & 384(0x180, float:5.38E-43)
            if (r5 != r6) goto L5b
        L59:
            r5 = 1
            goto L5c
        L5b:
            r5 = r4
        L5c:
            boolean r6 = r2.B(r3)
            r5 = r5 | r6
            java.lang.Object r6 = r2.t()
            if (r5 != 0) goto L70
            androidx.compose.runtime.A$a r5 = androidx.compose.runtime.A.f37866a
            r5.getClass()
            androidx.compose.runtime.A$a$a r5 = androidx.compose.runtime.A.a.f37868b
            if (r6 != r5) goto L78
        L70:
            com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet.k r6 = new com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet.k
            r6.<init>(r0, r3)
            r2.H(r6)
        L78:
            r19 = r6
            Y41.a r19 = (Y41.a) r19
            r2.X(r4)
            r16 = 0
            r20 = 7
            r17 = 0
            r18 = 0
            androidx.compose.ui.v r6 = androidx.compose.foundation.C21086w0.c(r15, r16, r17, r18, r19, r20)
            com.akita.compose.theme.re23.b r4 = com.akita.compose.theme.re23.b.f63983a
            com.akita.compose.component.list_item.s r5 = com.avito.android.bxcontent.mvi.entity.f.g(r4, r2)
            java.lang.String r4 = r3.getName()
            com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet.IacUIAudioDevicesBottomSheetState$Device r7 = r22.getCurrent()
            if (r7 == 0) goto La0
            java.lang.String r7 = r7.getId()
            goto La1
        La0:
            r7 = r12
        La1:
            java.lang.String r3 = r3.getId()
            boolean r7 = kotlin.jvm.internal.L.f(r7, r3)
            r10 = 0
            r11 = 48
            r8 = 0
            r9 = 0
            r3 = r4
            r4 = r7
            r7 = r8
            r8 = r9
            r9 = r2
            com.akita.compose.component.list_item.h.b(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L29
        Lb8:
            r2.X(r4)
            float r3 = (float) r5
            com.akita.compose.foundation.ui.g.a(r3, r12, r2, r13)
            androidx.compose.runtime.c2 r2 = r2.Z()
            if (r2 == 0) goto Ld0
            com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet.l r3 = new com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet.l
            r4 = r21
            r5 = r22
            r3.<init>(r4, r5, r0, r1)
            r2.f38184d = r3
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet.w.b(androidx.compose.foundation.layout.J, com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet.IacUIAudioDevicesBottomSheetState, Y41.l, androidx.compose.runtime.A, int):void");
    }
}
