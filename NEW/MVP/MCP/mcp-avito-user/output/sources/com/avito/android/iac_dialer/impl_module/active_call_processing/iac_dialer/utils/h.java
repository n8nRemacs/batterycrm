package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils;

import androidx.camera.camera2.internal.G;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionEffect;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionProcessingInfo;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareEffect;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.squareup.anvil.annotations.ContributesBinding;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42833p;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: IacDialerLogger.kt */
@P
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/utils/h;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/utils/g;", "a", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.i f165628a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public IacState f165629b;

    /* compiled from: IacDialerLogger.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/utils/h$a;", "", "<init>", "()V", "", "ERROR_SEPARATOR", "Ljava/lang/String;", "TAB_0", "TAB_1", "TAB_2", "TAB_3", "TAB_ACCEPTING", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: IacDialerLogger.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.l<String, CharSequence> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f165630l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.f165630l = str;
        }

        @Override // Y41.l
        public final CharSequence invoke(String str) {
            return G.g(new StringBuilder(), this.f165630l, " trace: ", str);
        }
    }

    /* compiled from: IacDialerLogger.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<String> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f165631l = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Event";
        }
    }

    static {
        new a(null);
    }

    @Inject
    public h(@Y61.k com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.i iVar) {
        this.f165628a = iVar;
        this.f165629b = iVar.a();
    }

    public static void c(StringBuilder sb2, String str, o oVar) {
        if (oVar instanceof p) {
            StringBuilder sbZ = androidx.appcompat.app.r.z(str, " log: ");
            sbZ.append(((p) oVar).f165634a);
            sb2.append(sbZ.toString());
            sb2.append('\n');
            return;
        }
        if (oVar instanceof r) {
            StringBuilder sbZ2 = androidx.appcompat.app.r.z(str, " log: WARNING: ");
            sbZ2.append(((r) oVar).f165637a);
            sb2.append(sbZ2.toString());
            sb2.append('\n');
            return;
        }
        if (!(oVar instanceof q)) {
            if (oVar instanceof s) {
                StringBuilder sbZ3 = androidx.appcompat.app.r.z(str, " log: WRONG_STATE: ");
                sbZ3.append(((s) oVar).f165639b);
                sb2.append(sbZ3.toString());
                sb2.append('\n');
                return;
            }
            return;
        }
        StringBuilder sbZ4 = androidx.appcompat.app.r.z(str, " log: ERROR: ");
        sbZ4.append(((q) oVar).f165635a);
        sb2.append(sbZ4.toString());
        sb2.append('\n');
        Throwable th2 = ((q) oVar).f165636b;
        String strB = th2 != null ? C42833p.b(th2) : null;
        if (strB == null) {
            strB = "";
        }
        sb2.append(C42745f0.O(C43066x.f0(strB, new String[]{"\n"}, 0, 6), "\n", null, null, new b(str), 30));
        sb2.append('\n');
    }

    public static void d(StringBuilder sb2, String str, Throwable th2) {
        sb2.append("------------------------------------------------------------------------");
        sb2.append('\n');
        sb2.append("Unhandled error in " + str + " processing");
        sb2.append('\n');
        StringWriter stringWriter = new StringWriter(256);
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        sb2.append(stringWriter.toString());
        sb2.append('\n');
        sb2.append("------------------------------------------------------------------------");
        sb2.append('\n');
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String e(com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent r9) {
        /*
            com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.h$c r0 = com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.h.c.f165631l
            java.lang.Class r1 = r9.getClass()
            kotlin.jvm.internal.n0 r2 = kotlin.jvm.internal.m0.f406844a
            kotlin.reflect.d r1 = r2.b(r1)
            java.lang.Class<com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent> r3 = com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent.class
            kotlin.reflect.d r2 = r2.b(r3)
            java.lang.String r2 = r2.p0()
            r3 = 0
            if (r2 == 0) goto L79
            int r4 = r2.length()
            r5 = -1
            int r4 = r4 + r5
            r6 = 46
            if (r4 < 0) goto L31
        L23:
            int r7 = r4 + (-1)
            char r8 = r2.charAt(r4)
            if (r8 != r6) goto L2c
            goto L32
        L2c:
            if (r7 >= 0) goto L2f
            goto L31
        L2f:
            r4 = r7
            goto L23
        L31:
            r4 = r5
        L32:
            java.lang.String r1 = r1.p0()
            if (r1 != 0) goto L39
            goto L79
        L39:
            int r2 = r1.length()
            int r2 = r2 + (-1)
        L3f:
            java.lang.String r3 = ""
            r7 = 0
            if (r5 >= r2) goto L54
            char r8 = r1.charAt(r2)
            if (r8 == r6) goto L4d
            int r2 = r2 + (-1)
            goto L3f
        L4d:
            int r2 = r2 + 1
            java.lang.String r1 = r1.substring(r7, r2)
            goto L55
        L54:
            r1 = r3
        L55:
            int r4 = r4 + 1
            java.lang.String r1 = kotlin.text.C43066x.x(r4, r1)
            if (r0 != 0) goto L5f
            r3 = r1
            goto L79
        L5f:
            int r0 = r1.length()
        L63:
            if (r7 >= r0) goto L72
            char r2 = r1.charAt(r7)
            if (r2 == r6) goto L6e
            int r7 = r7 + 1
            goto L63
        L6e:
            java.lang.String r3 = r1.substring(r7)
        L72:
            java.lang.String r0 = "Event"
            java.lang.String r0 = androidx.camera.camera2.internal.G.f(r0, r3)
            r3 = r0
        L79:
            if (r3 != 0) goto L7f
            java.lang.String r3 = r9.toString()
        L7f:
            java.lang.String r9 = r9.toString()
            java.lang.String r9 = androidx.appcompat.app.r.q(r3, r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.h.e(com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent):java.lang.String");
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.g
    public final void a(@Y61.k IacActionProcessing iacActionProcessing) {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b bVar = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("===> " + iacActionProcessing.getProcessingInfo().getIndex() + "_Action." + iacActionProcessing.getProcessingInfo().getActionWithParams());
        sb2.append('\n');
        List<IacActionEffect> effects = iacActionProcessing.getOut().getEffects();
        if (effects != null) {
            for (IacActionEffect iacActionEffect : effects) {
                if (iacActionEffect instanceof IacActionEffect.WriteLog) {
                    c(sb2, "........", ((IacActionEffect.WriteLog) iacActionEffect).getLog());
                } else if (iacActionEffect instanceof IacActionEffect.EmitAction) {
                    sb2.append("........ Action." + ((IacActionEffect.EmitAction) iacActionEffect).getAction());
                    sb2.append('\n');
                } else if (iacActionEffect instanceof IacActionEffect.EmitEvent) {
                    sb2.append("........ ".concat(e(((IacActionEffect.EmitEvent) iacActionEffect).getEvent())));
                    sb2.append('\n');
                } else if (iacActionEffect instanceof IacActionEffect.EmitState) {
                    IacActionEffect.EmitState emitState = (IacActionEffect.EmitState) iacActionEffect;
                    if (emitState.getState().getIndex() != this.f165629b.getIndex()) {
                        sb2.append("........ ".concat(com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.ext.k.a(emitState.getState())));
                        sb2.append('\n');
                        StringBuilder sb3 = new StringBuilder();
                        com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.ext.d dVar = com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.ext.d.f165585b;
                        IacState iacState = this.f165629b;
                        IacState state = emitState.getState();
                        dVar.getClass();
                        com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.ext.d.d(sb3, null, iacState, state);
                        if (sb3.length() > 0) {
                            sb2.append("........ State.diff: " + ((Object) sb3));
                            sb2.append('\n');
                        }
                        this.f165629b = emitState.getState();
                    } else {
                        sb2.append("........ State - not changed");
                        sb2.append('\n');
                    }
                    for (IacMiddlewareProcessing iacMiddlewareProcessing : emitState.getAllMiddlewaresProcessings()) {
                        List<IacMiddlewareEffect> effects2 = iacMiddlewareProcessing.getOut().getEffects();
                        if (effects2 != null) {
                            if (effects2.isEmpty()) {
                                effects2 = null;
                            }
                            if (effects2 != null) {
                                sb2.append("............ " + iacMiddlewareProcessing.getProcessingInfo().getMiddlewareName());
                                sb2.append('\n');
                                for (IacMiddlewareEffect iacMiddlewareEffect : effects2) {
                                    if (iacMiddlewareEffect instanceof IacMiddlewareEffect.WriteLog) {
                                        c(sb2, "................", ((IacMiddlewareEffect.WriteLog) iacMiddlewareEffect).getLog());
                                    } else if (iacMiddlewareEffect instanceof IacMiddlewareEffect.EmitAction) {
                                        sb2.append("................ Action." + ((IacMiddlewareEffect.EmitAction) iacMiddlewareEffect).getAction());
                                        sb2.append('\n');
                                    } else if (iacMiddlewareEffect instanceof IacMiddlewareEffect.EmitEvent) {
                                        sb2.append("................ ".concat(e(((IacMiddlewareEffect.EmitEvent) iacMiddlewareEffect).getEvent())));
                                        sb2.append('\n');
                                    } else if (iacMiddlewareEffect instanceof IacMiddlewareEffect.UnhandledError) {
                                        d(sb2, iacMiddlewareProcessing.getProcessingInfo().getMiddlewareName(), ((IacMiddlewareEffect.UnhandledError) iacMiddlewareEffect).getT());
                                    }
                                }
                            }
                        }
                    }
                } else if (iacActionEffect instanceof IacActionEffect.UnhandledError) {
                    d(sb2, iacActionProcessing.getProcessingInfo().getActionName(), ((IacActionEffect.UnhandledError) iacActionEffect).getT());
                }
            }
        }
        IacActionProcessingInfo processingInfo = iacActionProcessing.getProcessingInfo();
        long processingStartedAt = processingInfo.getProcessingStartedAt() - processingInfo.getScheduledAt();
        IacActionProcessingInfo processingInfo2 = iacActionProcessing.getProcessingInfo();
        long calculatingFinishedAt = processingInfo2.getCalculatingFinishedAt() - processingInfo2.getProcessingStartedAt();
        if (processingStartedAt + calculatingFinishedAt > 200) {
            StringBuilder sbQ = H.q(processingStartedAt, "........ PERF_WARNING: scheduled=", "ms, calculating=");
            sbQ.append(calculatingFinishedAt);
            sbQ.append("ms");
            sb2.append(sbQ.toString());
            sb2.append('\n');
        }
        bVar.a("IacDialer", sb2.toString(), null);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.g
    public final void b(@Y61.k IacAction iacAction, @Y61.k String str) {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacDialer", "---+ Action." + iacAction + " from " + str, null);
    }
}
