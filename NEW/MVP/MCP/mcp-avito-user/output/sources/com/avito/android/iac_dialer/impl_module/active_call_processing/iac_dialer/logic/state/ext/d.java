package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.ext;

import Y41.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.Appearance;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.r;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.CallState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.t;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.params.CallParams;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.preconditions.IncomingPreconditions;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.preconditions.OutgoingPreconditions;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: IacStateDiffPrinter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/ext/d;", "LJK/f;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class d extends JK.f<IacState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final d f165585b = new d();

    /* compiled from: IacStateDiffPrinter.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements l<IacState, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f165586l = new a();

        public a() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
        @Override // Y41.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String invoke(com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState r11) {
            /*
                r10 = this;
                com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState r11 = (com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState) r11
                com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.ext.c r0 = com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.ext.c.f165584l
                java.lang.Class r1 = r11.getClass()
                kotlin.jvm.internal.n0 r2 = kotlin.jvm.internal.m0.f406844a
                kotlin.reflect.d r1 = r2.b(r1)
                java.lang.Class<com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState> r3 = com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.class
                kotlin.reflect.d r2 = r2.b(r3)
                java.lang.String r2 = r2.p0()
                r3 = -1
                r4 = 0
                r5 = 0
                if (r2 == 0) goto L7c
                int r6 = r2.length()
                int r6 = r6 + r3
                r7 = 46
                if (r6 < 0) goto L34
            L26:
                int r8 = r6 + (-1)
                char r9 = r2.charAt(r6)
                if (r9 != r7) goto L2f
                goto L35
            L2f:
                if (r8 >= 0) goto L32
                goto L34
            L32:
                r6 = r8
                goto L26
            L34:
                r6 = r3
            L35:
                java.lang.String r1 = r1.p0()
                if (r1 != 0) goto L3c
                goto L7c
            L3c:
                int r2 = r1.length()
                int r2 = r2 + (-1)
            L42:
                java.lang.String r4 = ""
                if (r3 >= r2) goto L56
                char r8 = r1.charAt(r2)
                if (r8 == r7) goto L4f
                int r2 = r2 + (-1)
                goto L42
            L4f:
                int r2 = r2 + 1
                java.lang.String r1 = r1.substring(r5, r2)
                goto L57
            L56:
                r1 = r4
            L57:
                int r6 = r6 + 1
                java.lang.String r1 = kotlin.text.C43066x.x(r6, r1)
                if (r0 != 0) goto L61
                r4 = r1
                goto L7c
            L61:
                int r0 = r1.length()
                r2 = r5
            L66:
                if (r2 >= r0) goto L75
                char r6 = r1.charAt(r2)
                if (r6 == r7) goto L71
                int r2 = r2 + 1
                goto L66
            L71:
                java.lang.String r4 = r1.substring(r2)
            L75:
                java.lang.String r0 = "State"
                java.lang.String r0 = androidx.camera.camera2.internal.G.f(r0, r4)
                r4 = r0
            L7c:
                if (r4 != 0) goto L82
                java.lang.String r4 = r11.toString()
            L82:
                java.lang.String r11 = r11.toString()
                int r0 = r11.length()
            L8a:
                if (r5 >= r0) goto L98
                char r1 = r11.charAt(r5)
                r2 = 40
                if (r1 != r2) goto L95
                goto L99
            L95:
                int r5 = r5 + 1
                goto L8a
            L98:
                r5 = r3
            L99:
                if (r5 != r3) goto La0
                java.lang.String r11 = androidx.appcompat.app.r.q(r4, r11)
                goto Laf
            La0:
                java.lang.StringBuilder r0 = androidx.compose.foundation.H.r(r4)
                java.lang.String r11 = kotlin.text.C43066x.t0(r5, r11)
                r0.append(r11)
                java.lang.String r11 = r0.toString()
            Laf:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.ext.d.a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: IacStateDiffPrinter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/a;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "invoke", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/a;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.a, CallState> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f165587l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final CallState invoke(com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.a aVar) {
            return aVar.getCall();
        }
    }

    /* compiled from: IacStateDiffPrinter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/a;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/params/CallParams;", "invoke", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/a;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/params/CallParams;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.a, CallParams> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f165588l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final CallParams invoke(com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.a aVar) {
            return aVar.getParams();
        }
    }

    /* compiled from: IacStateDiffPrinter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Appearance;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.ext.d$d, reason: collision with other inner class name */
    public static final class C4906d extends N implements l<IacState, Appearance> {

        /* renamed from: l, reason: collision with root package name */
        public static final C4906d f165589l = new C4906d();

        public C4906d() {
            super(1);
        }

        @Override // Y41.l
        public final Appearance invoke(IacState iacState) {
            return iacState.getAppearance();
        }
    }

    /* compiled from: IacStateDiffPrinter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/preconditions/OutgoingPreconditions;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Alive$Outgoing$Resolving;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements l<IacState.InUse.Alive.Outgoing.Resolving, OutgoingPreconditions> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f165590l = new e();

        public e() {
            super(1);
        }

        @Override // Y41.l
        public final OutgoingPreconditions invoke(IacState.InUse.Alive.Outgoing.Resolving resolving) {
            return resolving.getPreconditions();
        }
    }

    /* compiled from: IacStateDiffPrinter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/preconditions/IncomingPreconditions;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Alive$Incoming$Resolving;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends N implements l<IacState.InUse.Alive.Incoming.Resolving, IncomingPreconditions> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f165591l = new f();

        public f() {
            super(1);
        }

        @Override // Y41.l
        public final IncomingPreconditions invoke(IacState.InUse.Alive.Incoming.Resolving resolving) {
            return resolving.getPreconditions();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(@Y61.k StringBuilder sb2, @Y61.l String str, @Y61.k IacState iacState, @Y61.k IacState iacState2) {
        JK.f.b(sb2, str, iacState, iacState2, "subType", a.f165586l);
        if ((iacState instanceof com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.a) && (iacState2 instanceof com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.a)) {
            com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.a aVar = (com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.a) iacState2;
            com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.a aVar2 = (com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.a) iacState;
            JK.f.c(sb2, str, t.f165565b, aVar2, aVar, "call", b.f165587l);
            JK.f.c(sb2, str, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.params.i.f165613b, aVar2, aVar, "params", c.f165588l);
        }
        JK.f.c(sb2, str, r.f165536b, iacState, iacState2, "appearance", C4906d.f165589l);
        if ((iacState instanceof IacState.InUse.Alive.Outgoing.Resolving) && (iacState2 instanceof IacState.InUse.Alive.Outgoing.Resolving)) {
            com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.preconditions.f fVar = com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.preconditions.f.f165626b;
            JK.f.c(sb2, str, fVar, (IacState.InUse.Alive.Outgoing.Resolving) iacState, (IacState.InUse.Alive.Outgoing.Resolving) iacState2, "preconditions", e.f165590l);
        }
        if ((iacState instanceof IacState.InUse.Alive.Incoming.Resolving) && (iacState2 instanceof IacState.InUse.Alive.Incoming.Resolving)) {
            com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.preconditions.c cVar = com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.preconditions.c.f165623b;
            JK.f.c(sb2, str, cVar, (IacState.InUse.Alive.Incoming.Resolving) iacState, (IacState.InUse.Alive.Incoming.Resolving) iacState2, "preconditions", f.f165591l);
        }
    }

    @Override // JK.f
    public final /* bridge */ /* synthetic */ void a(StringBuilder sb2, String str, IacState iacState, IacState iacState2) {
        d(sb2, str, iacState, iacState2);
    }

    public final boolean equals(@Y61.l Object obj) {
        return this == obj || (obj instanceof d);
    }

    public final int hashCode() {
        return -378379338;
    }

    @Y61.k
    public final String toString() {
        return "IacStateDiffPrinter";
    }
}
