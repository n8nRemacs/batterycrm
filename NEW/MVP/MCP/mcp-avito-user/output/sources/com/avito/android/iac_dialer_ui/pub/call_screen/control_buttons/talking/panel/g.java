package com.avito.android.iac_dialer_ui.pub.call_screen.control_buttons.talking.panel;

import Y41.p;
import Y61.k;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.iac_dialer_ui.pub.call_screen.control_buttons.talking.IacUIControlButtonsAudioDeviceState;
import com.avito.android.iac_dialer_ui.pub.call_screen.control_buttons.talking.IacUIControlButtonsToggleCameraState;
import com.avito.android.iac_dialer_ui.pub.call_screen.control_buttons.talking.IacUIControlButtonsToggleMicState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: IacUIControlButtonsPanelTalking.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-dialer-ui_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final IacUIControlButtonsPanelTalkingState f167233a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final IacUIControlButtonsPanelTalkingState f167234b;

    /* compiled from: IacUIControlButtonsPanelTalking.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ IacUIControlButtonsPanelTalkingState f167235l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ N f167236m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ N f167237n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ N f167238o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ N f167239p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ N f167240q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ v f167241r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f167242s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f167243t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(IacUIControlButtonsPanelTalkingState iacUIControlButtonsPanelTalkingState, Y41.a<G0> aVar, Y41.a<G0> aVar2, Y41.a<G0> aVar3, Y41.a<G0> aVar4, Y41.a<G0> aVar5, v vVar, int i12, int i13) {
            super(2);
            this.f167235l = iacUIControlButtonsPanelTalkingState;
            this.f167236m = (N) aVar;
            this.f167237n = (N) aVar2;
            this.f167238o = (N) aVar3;
            this.f167239p = (N) aVar4;
            this.f167240q = (N) aVar5;
            this.f167241r = vVar;
            this.f167242s = i12;
            this.f167243t = i13;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.a, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r2v0, types: [Y41.a, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r3v0, types: [Y41.a, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r4v0, types: [Y41.a, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r5v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f167242s | 1);
            ?? r52 = this.f167240q;
            ?? r12 = this.f167236m;
            ?? r22 = this.f167237n;
            ?? r32 = this.f167238o;
            ?? r42 = this.f167239p;
            g.a(this.f167235l, r12, r22, r32, r42, r52, this.f167241r, a12, iA2, this.f167243t);
            return G0.f406611a;
        }
    }

    static {
        IacUIControlButtonsAudioDeviceState iacUIControlButtonsAudioDeviceState = IacUIControlButtonsAudioDeviceState.EarpieceOrWireHeadset;
        IacUIControlButtonsToggleMicState iacUIControlButtonsToggleMicState = IacUIControlButtonsToggleMicState.MicEnabled;
        f167233a = new IacUIControlButtonsPanelTalkingState(iacUIControlButtonsAudioDeviceState, iacUIControlButtonsToggleMicState, IacUIControlButtonsToggleCameraState.CameraEnabled, G0.f406611a);
        f167234b = new IacUIControlButtonsPanelTalkingState(iacUIControlButtonsAudioDeviceState, iacUIControlButtonsToggleMicState, IacUIControlButtonsToggleCameraState.CameraDisabled, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k com.avito.android.iac_dialer_ui.pub.call_screen.control_buttons.talking.panel.IacUIControlButtonsPanelTalkingState r17, @Y61.k Y41.a<kotlin.G0> r18, @Y61.k Y41.a<kotlin.G0> r19, @Y61.k Y41.a<kotlin.G0> r20, @Y61.k Y41.a<kotlin.G0> r21, @Y61.k Y41.a<kotlin.G0> r22, @Y61.l androidx.compose.ui.v r23, @Y61.l androidx.compose.runtime.A r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer_ui.pub.call_screen.control_buttons.talking.panel.g.a(com.avito.android.iac_dialer_ui.pub.call_screen.control_buttons.talking.panel.IacUIControlButtonsPanelTalkingState, Y41.a, Y41.a, Y41.a, Y41.a, Y41.a, androidx.compose.ui.v, androidx.compose.runtime.A, int, int):void");
    }
}
