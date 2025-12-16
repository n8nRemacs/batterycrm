package com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls;

import androidx.camera.camera2.internal.G;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.F;
import com.avito.android.analytics.statsd.y;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.util.V2;
import com.avito.avcalls.android.a;
import com.avito.avcalls.android.logger.AvCallsLoggingConfiguration;
import com.avito.avcalls.android.logger.a;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: AvCallsLogListenerImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform_v1/avcalls/p;", "Lcom/avito/avcalls/android/a$f;", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes13.dex */
public final class p implements a.f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f164570a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final F f164571b;

    /* compiled from: AvCallsLogListenerImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[AvCallsLoggingConfiguration.RtcSeverity.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AvCallsLoggingConfiguration.RtcSeverity rtcSeverity = AvCallsLoggingConfiguration.RtcSeverity.f331722b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AvCallsLoggingConfiguration.RtcSeverity rtcSeverity2 = AvCallsLoggingConfiguration.RtcSeverity.f331722b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AvCallsLoggingConfiguration.RtcSeverity rtcSeverity3 = AvCallsLoggingConfiguration.RtcSeverity.f331722b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AvCallsLoggingConfiguration.RtcSeverity rtcSeverity4 = AvCallsLoggingConfiguration.RtcSeverity.f331722b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Inject
    public p(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k F f12) {
        this.f164570a = interfaceC28373a;
        this.f164571b = f12;
    }

    public static String b(com.avito.avcalls.android.logger.a aVar) {
        int i12 = 0;
        List listF0 = C43066x.f0(aVar.f331734c, new String[]{"\n"}, 0, 6);
        String str = (String) C42745f0.S(listF0);
        if (str != null && C43066x.K(str)) {
            listF0 = C42745f0.x(listF0);
        }
        List list = listF0;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            String strF = (String) obj;
            if (i12 != 0) {
                strF = G.f("                                      ", strF);
            }
            arrayList.add(strF);
            i12 = i13;
        }
        return C42745f0.O(arrayList, "\n", null, null, null, 62);
    }

    @Override // com.avito.avcalls.android.a.f
    public final void a(@Y61.k com.avito.avcalls.android.logger.a aVar) {
        a.AbstractC10309a abstractC10309a = aVar.f331733b;
        boolean z12 = abstractC10309a instanceof a.AbstractC10309a.b;
        String str = aVar.f331732a;
        if (z12) {
            String strF = G.f("AvCalls: ", str);
            a.AbstractC10309a.b.AbstractC10311a abstractC10311a = ((a.AbstractC10309a.b) abstractC10309a).f331736a;
            if (abstractC10311a instanceof a.AbstractC10309a.b.AbstractC10311a.C10312a) {
                com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a(strF, b(aVar), null);
                return;
            }
            if (abstractC10311a instanceof a.AbstractC10309a.b.AbstractC10311a.c) {
                com.avito.android.iac_dialer_watcher.public_module.logging.logger.b bVar = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a;
                String strB = b(aVar);
                bVar.getClass();
                com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.c().c(strF, strB);
                V2.f318762a.g(strF, strB);
                return;
            }
            if (abstractC10311a instanceof a.AbstractC10309a.b.AbstractC10311a.C10313b) {
                Exception exc = ((a.AbstractC10309a.b.AbstractC10311a.C10313b) abstractC10311a).f331738a;
                if (exc == null) {
                    com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.d(strF, b(aVar), null);
                    return;
                }
                com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.b(strF, b(aVar), exc);
                NonFatalErrorEvent nonFatalErrorEvent = new NonFatalErrorEvent("Unhandled error in avcalls: " + exc.getLocalizedMessage(), new AvcallsLogListenerError(exc), null, NonFatalErrorEvent.a.C4323a.f147930a, 4, null);
                InterfaceC28373a interfaceC28373a = this.f164570a;
                interfaceC28373a.c(nonFatalErrorEvent);
                interfaceC28373a.c(new y.a(this.f164571b.a("calls", "{{%app_ver%}}", "avcalls_log_listener_error").f91030a, 1L));
                return;
            }
            return;
        }
        if (abstractC10309a instanceof a.AbstractC10309a.C10310a) {
            String strF2 = G.f("WebRtc: ", str);
            int iOrdinal = ((a.AbstractC10309a.C10310a) abstractC10309a).f331735a.ordinal();
            if (iOrdinal == 0) {
                com.avito.android.iac_dialer_watcher.public_module.logging.logger.b bVar2 = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a;
                String strB2 = b(aVar);
                bVar2.getClass();
                com.avito.android.iac_dialer_watcher.public_module.logging.logger.a aVarB = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.c().b();
                if (aVarB != null) {
                    aVarB.a(2, strF2, strB2, null);
                }
                V2.f318762a.i(strF2, strB2, null);
                return;
            }
            if (iOrdinal == 1) {
                com.avito.android.iac_dialer_watcher.public_module.logging.logger.b bVar3 = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a;
                String strB3 = b(aVar);
                bVar3.getClass();
                com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.c().c(strF2, strB3);
                V2.f318762a.g(strF2, strB3);
                return;
            }
            if (iOrdinal == 2) {
                com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.d(strF2, b(aVar), null);
            } else if (iOrdinal == 3) {
                com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.b(strF2, "Error: ".concat(b(aVar)), null);
            } else {
                if (iOrdinal != 4) {
                    return;
                }
                com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a(strF2, b(aVar), null);
            }
        }
    }
}
