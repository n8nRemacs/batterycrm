package com.avito.android.error_reporting.error_reporter;

import Cz.C13376a;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.TransactionTooLargeException;
import com.avito.android.InterfaceC30741h0;
import com.avito.android.error_reporting.app_state.A;
import com.avito.android.error_reporting.app_state.C30371j;
import com.avito.android.error_reporting.app_state.D;
import com.avito.android.error_reporting.app_state.F;
import com.avito.android.error_reporting.app_state.H;
import com.avito.android.error_reporting.app_state.InterfaceC30362a;
import com.avito.android.error_reporting.app_state.L;
import com.avito.android.error_reporting.app_state.x;
import com.avito.android.util.C35743a3;
import com.avito.android.util.J5;
import com.avito.android.util.V2;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;

/* compiled from: ErrorReportUpdater.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/error_reporting/error_reporter/l;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "Lcom/avito/android/util/J5;", "_common_error-reporting_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l extends J5 implements Thread.UncaughtExceptionHandler {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30741h0 f147878c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a f147879d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final L f147880e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C30371j f147881f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final x f147882g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final h31.e<A> f147883h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.error_reporting.app_state.u> f147884i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.error_reporting.app_state.q> f147885j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final H f147886k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final h31.e<F> f147887l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final h31.e<D> f147888m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.error_reporting.app_state.o> f147889n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public Thread.UncaughtExceptionHandler f147890o;

    @Inject
    public l(@Y61.k InterfaceC30741h0 interfaceC30741h0, @Y61.k a aVar, @Y61.k L l12, @Y61.k C30371j c30371j, @Y61.k x xVar, @Y61.k h31.e<A> eVar, @Y61.k h31.e<com.avito.android.error_reporting.app_state.u> eVar2, @Y61.k h31.e<com.avito.android.error_reporting.app_state.q> eVar3, @Y61.k H h12, @Y61.k h31.e<F> eVar4, @Y61.k h31.e<D> eVar5, @Y61.k h31.e<com.avito.android.error_reporting.app_state.o> eVar6) {
        this.f147878c = interfaceC30741h0;
        this.f147879d = aVar;
        this.f147880e = l12;
        this.f147881f = c30371j;
        this.f147882g = xVar;
        this.f147883h = eVar;
        this.f147884i = eVar2;
        this.f147885j = eVar3;
        this.f147886k = h12;
        this.f147887l = eVar4;
        this.f147888m = eVar5;
        this.f147889n = eVar6;
    }

    @Override // com.avito.android.util.J5
    public final void o() {
        this.f147890o = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
        this.f147880e.a();
        this.f147882g.a();
        this.f147885j.get().a();
    }

    public final void p(Throwable th2) {
        L l12 = this.f147880e;
        l12.getClass();
        l12.f147796c.b("uptime_seconds", String.valueOf(TimeUnit.MILLISECONDS.toSeconds(SystemClock.uptimeMillis() - ((Number) l12.f147797d.getValue()).longValue())));
        C30371j c30371j = this.f147881f;
        c30371j.getClass();
        c30371j.f147817a.b("error_group", C13376a.a(th2));
        A a12 = this.f147883h.get();
        a12.getClass();
        StringBuilder sb2 = new StringBuilder("exception.");
        int iHashCode = Arrays.hashCode(th2.getStackTrace());
        Throwable cause = th2.getCause();
        int length = 0;
        sb2.append(iHashCode + (cause != null ? cause.hashCode() : 0));
        String string = sb2.toString();
        InterfaceC42726C interfaceC42726C = a12.f147777d;
        int i12 = ((SharedPreferences) interfaceC42726C.getValue()).getInt(string, 0) + 1;
        ((SharedPreferences) interfaceC42726C.getValue()).edit().putInt(string, i12).apply();
        a12.f147776c.b("exception.repeated", String.valueOf(i12));
        H h12 = this.f147886k;
        h12.getClass();
        while (true) {
            if (th2 == null) {
                break;
            }
            if (th2 instanceof TransactionTooLargeException) {
                StringBuilder sb3 = new StringBuilder();
                com.avito.android.large_transaction.d dVar = h12.f147787b;
                for (Map.Entry<String, Map<String, Bundle>> entry : dVar.f175047i.entrySet()) {
                    String key = entry.getKey();
                    for (Map.Entry<String, Bundle> entry2 : entry.getValue().entrySet()) {
                        sb3.append(dVar.f175042d.c(entry2.getValue(), androidx.compose.foundation.H.i('.', key, entry2.getKey())));
                    }
                }
                h12.f147786a.log(sb3.toString());
            } else {
                th2 = th2.getCause();
            }
        }
        F f12 = this.f147887l.get();
        f12.getClass();
        f12.f147784a.b("is_main_thread", String.valueOf(C35743a3.a()));
        D d12 = this.f147888m.get();
        d12.getClass();
        d12.f147782a.b("security_patch_level", Build.VERSION.SECURITY_PATCH);
        com.avito.android.error_reporting.app_state.o oVar = this.f147889n.get();
        oVar.f147824b.getClass();
        com.avito.android.error_reporting.memory.a aVarA = com.avito.android.error_reporting.memory.b.a();
        String strValueOf = String.valueOf(aVarA.f147918a);
        InterfaceC30362a.InterfaceC4322a interfaceC4322a = oVar.f147823a;
        interfaceC4322a.b("memory.heap.used", strValueOf);
        interfaceC4322a.b("memory.heap.free", String.valueOf(aVarA.f147919b));
        interfaceC4322a.b("memory.heap.max", String.valueOf(aVarA.f147920c));
        interfaceC4322a.b("memory.native.used", String.valueOf(aVarA.f147921d));
        interfaceC4322a.b("memory.native.free", String.valueOf(aVarA.f147922e));
        interfaceC4322a.b("memory.native.max", String.valueOf(aVarA.f147923f));
        InterfaceC30741h0 interfaceC30741h0 = this.f147878c;
        if (interfaceC30741h0.k().invoke().booleanValue()) {
            this.f147885j.get().p();
            return;
        }
        if (interfaceC30741h0.r().invoke().booleanValue()) {
            com.avito.android.error_reporting.app_state.u uVar = this.f147884i.get();
            ArrayList arrayListA = uVar.f147842b.a();
            int size = arrayListA.size();
            while (true) {
                size--;
                if (size < 0 || length >= 26624) {
                    break;
                } else {
                    length += ((String) arrayListA.get(size)).length();
                }
            }
            if (length > 26624) {
                size++;
            }
            List listSubList = arrayListA.subList(size + 1, arrayListA.size());
            InterfaceC30362a.InterfaceC4322a interfaceC4322a2 = uVar.f147841a;
            interfaceC4322a2.log("====== LOG DUMP STARTED: ======");
            Iterator it = listSubList.iterator();
            while (it.hasNext()) {
                interfaceC4322a2.log((String) it.next());
            }
            interfaceC4322a2.log("====== LOG DUMP FINISHED: ======");
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(@Y61.k Thread thread, @Y61.k Throwable th2) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        try {
            try {
                p(th2);
                this.f147879d.c();
                if (this.f147878c.s().invoke().booleanValue()) {
                    Thread.sleep(300L);
                }
                uncaughtExceptionHandler = this.f147890o;
                if (uncaughtExceptionHandler == null) {
                    return;
                }
            } catch (Exception e12) {
                V2.f318762a.a("DEFAULT_TAG", "Unexcpected exception while collecting dump", e12);
                uncaughtExceptionHandler = this.f147890o;
                if (uncaughtExceptionHandler == null) {
                    return;
                }
            }
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        } catch (Throwable th3) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f147890o;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th2);
            }
            throw th3;
        }
    }
}
