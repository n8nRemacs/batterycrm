package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state;

import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import com.avito.android.iac_dialer.impl_module.camera.IacCameraPosition;
import com.avito.android.iac_dialer_models.abstract_module.IacCallDirection;
import com.huawei.hms.api.FailedBinderCallBack;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CallState.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/t;", "LJK/f;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class t extends JK.f<CallState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final t f165565b = new t();

    /* compiled from: CallState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.l<CallState, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f165566l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final String invoke(CallState callState) {
            return callState.getPeerEndpointId();
        }
    }

    /* compiled from: CallState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.l<CallState, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f165567l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final String invoke(CallState callState) {
            return callState.getPeerUserId();
        }
    }

    /* compiled from: CallState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "invoke", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.l<CallState, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f165568l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(CallState callState) {
            return Boolean.valueOf(callState.getLocalConnected());
        }
    }

    /* compiled from: CallState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "invoke", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.l<CallState, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f165569l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(CallState callState) {
            return Boolean.valueOf(callState.getLocalSendingAudio());
        }
    }

    /* compiled from: CallState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "invoke", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.l<CallState, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f165570l = new e();

        public e() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(CallState callState) {
            return Boolean.valueOf(callState.getLocalSendingVideo());
        }
    }

    /* compiled from: CallState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends N implements Y41.l<CallState, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f165571l = new f();

        public f() {
            super(1);
        }

        @Override // Y41.l
        public final String invoke(CallState callState) {
            return callState.getLocalUserId();
        }
    }

    /* compiled from: CallState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/iac_dialer/impl_module/camera/IacCameraPosition;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class g extends N implements Y41.l<CallState, IacCameraPosition> {

        /* renamed from: l, reason: collision with root package name */
        public static final g f165572l = new g();

        public g() {
            super(1);
        }

        @Override // Y41.l
        public final IacCameraPosition invoke(CallState callState) {
            return callState.getDefaultCamera();
        }
    }

    /* compiled from: CallState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "invoke", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class h extends N implements Y41.l<CallState, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final h f165573l = new h();

        public h() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(CallState callState) {
            return Boolean.valueOf(callState.getDefaultCameraEnabled());
        }
    }

    /* compiled from: CallState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallMeta;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class i extends N implements Y41.l<CallState, CallMeta> {

        /* renamed from: l, reason: collision with root package name */
        public static final i f165574l = new i();

        public i() {
            super(1);
        }

        @Override // Y41.l
        public final CallMeta invoke(CallState callState) {
            return callState.getMeta();
        }
    }

    /* compiled from: CallState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class j extends N implements Y41.l<CallState, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final j f165575l = new j();

        public j() {
            super(1);
        }

        @Override // Y41.l
        public final String invoke(CallState callState) {
            return callState.getCallId();
        }
    }

    /* compiled from: CallState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/InvitingState;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class k extends N implements Y41.l<CallState, InvitingState> {

        /* renamed from: l, reason: collision with root package name */
        public static final k f165576l = new k();

        public k() {
            super(1);
        }

        @Override // Y41.l
        public final InvitingState invoke(CallState callState) {
            return callState.getInvitingState();
        }
    }

    /* compiled from: CallState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class l extends N implements Y41.l<CallState, IacCallDirection> {

        /* renamed from: l, reason: collision with root package name */
        public static final l f165577l = new l();

        public l() {
            super(1);
        }

        @Override // Y41.l
        public final IacCallDirection invoke(CallState callState) {
            return callState.getDirection();
        }
    }

    /* compiled from: CallState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "invoke", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class m extends N implements Y41.l<CallState, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final m f165578l = new m();

        public m() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(CallState callState) {
            return Boolean.valueOf(callState.isVideo());
        }
    }

    /* compiled from: CallState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "invoke", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class n extends N implements Y41.l<CallState, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final n f165579l = new n();

        public n() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(CallState callState) {
            return Boolean.valueOf(callState.getVideoTxAllowed());
        }
    }

    /* compiled from: CallState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "invoke", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class o extends N implements Y41.l<CallState, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final o f165580l = new o();

        public o() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(CallState callState) {
            return Boolean.valueOf(callState.getWasRingingReceived());
        }
    }

    /* compiled from: CallState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "invoke", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class p extends N implements Y41.l<CallState, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final p f165581l = new p();

        public p() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(CallState callState) {
            return Boolean.valueOf(callState.getPeerConnected());
        }
    }

    /* compiled from: CallState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "invoke", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class q extends N implements Y41.l<CallState, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final q f165582l = new q();

        public q() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(CallState callState) {
            return Boolean.valueOf(callState.getPeerSendingAudio());
        }
    }

    /* compiled from: CallState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "invoke", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class r extends N implements Y41.l<CallState, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final r f165583l = new r();

        public r() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(CallState callState) {
            return Boolean.valueOf(callState.getPeerSendingVideo());
        }
    }

    public static void d(@Y61.k StringBuilder sb2, @Y61.l String str, @Y61.k CallState callState, @Y61.k CallState callState2) {
        JK.f.b(sb2, str, callState, callState2, FailedBinderCallBack.CALLER_ID, j.f165575l);
        JK.f.b(sb2, str, callState, callState2, "invitingState", k.f165576l);
        JK.f.b(sb2, str, callState, callState2, "direction", l.f165577l);
        JK.f.b(sb2, str, callState, callState2, "isVideo", m.f165578l);
        JK.f.b(sb2, str, callState, callState2, "videoTxAllowed", n.f165579l);
        JK.f.b(sb2, str, callState, callState2, "wasRingingReceived", o.f165580l);
        JK.f.b(sb2, str, callState, callState2, "peerConnected", p.f165581l);
        JK.f.b(sb2, str, callState, callState2, "peerSendingAudio", q.f165582l);
        JK.f.b(sb2, str, callState, callState2, "peerSendingVideo", r.f165583l);
        JK.f.b(sb2, str, callState, callState2, "peerEndpointId", a.f165566l);
        JK.f.b(sb2, str, callState, callState2, "peerUserId", b.f165567l);
        JK.f.b(sb2, str, callState, callState2, "localConnected", c.f165568l);
        JK.f.b(sb2, str, callState, callState2, "localSendingAudio", d.f165569l);
        JK.f.b(sb2, str, callState, callState2, "localSendingVideo", e.f165570l);
        JK.f.b(sb2, str, callState, callState2, "localUserId", f.f165571l);
        JK.f.b(sb2, str, callState, callState2, "defaultCamera", g.f165572l);
        JK.f.b(sb2, str, callState, callState2, "defaultCameraEnabled", h.f165573l);
        JK.f.c(sb2, str, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.h.f165553b, callState, callState2, Constants.REFERRER_API_META, i.f165574l);
    }

    @Override // JK.f
    public final /* bridge */ /* synthetic */ void a(StringBuilder sb2, String str, CallState callState, CallState callState2) {
        d(sb2, str, callState, callState2);
    }

    public final boolean equals(@Y61.l Object obj) {
        return this == obj || (obj instanceof t);
    }

    public final int hashCode() {
        return -1928575724;
    }

    @Y61.k
    public final String toString() {
        return "CallStateDiffPrinter";
    }
}
