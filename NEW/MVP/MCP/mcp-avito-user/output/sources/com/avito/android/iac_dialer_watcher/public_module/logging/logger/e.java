package com.avito.android.iac_dialer_watcher.public_module.logging.logger;

import Y61.k;
import com.avito.android.util.C2;
import com.google.gson.i;
import com.google.gson.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import p91.InterfaceC46925b;

/* compiled from: IacLogsWebSocketReporter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/public_module/logging/logger/e;", "Lp91/b;", "<init>", "()V", "a", "_avito_iac-dialer-watcher_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements InterfaceC46925b {

    /* compiled from: IacLogsWebSocketReporter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/public_module/logging/logger/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_iac-dialer-watcher_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Override // p91.InterfaceC46925b
    public final void a(@k String str) {
        String str2;
        String string;
        try {
            com.google.gson.k kVarI = l.b(str).i();
            Long lB2 = C2.b(kVarI, "id");
            String strC = C2.c(kVarI, "method");
            i iVarD = kVarI.D("params");
            str2 = "id=" + lB2 + ", method=" + strC + ", params.length=" + ((iVarD == null || (string = iVarD.toString()) == null) ? null : Integer.valueOf(string.length()));
        } catch (Exception unused) {
            str2 = "logger parsing error";
        }
        b.f168184a.getClass();
        b.c().a("Messenger", "WS: --> " + str2, null);
    }

    @Override // p91.InterfaceC46925b
    public final void b(@k String str) {
        String str2;
        String string;
        try {
            com.google.gson.k kVarI = l.b(str).i();
            Long lB2 = C2.b(kVarI, "id");
            i iVarD = kVarI.D("result");
            str2 = "id=" + lB2 + ", result.length=" + ((iVarD == null || (string = iVarD.toString()) == null) ? null : Integer.valueOf(string.length()));
        } catch (Exception unused) {
            str2 = "logger parsing error";
        }
        b.f168184a.getClass();
        b.c().a("Messenger", "WS: <-- " + str2, null);
    }

    @Override // p91.InterfaceC46925b
    public final void c(@k String str) {
        b.f168184a.getClass();
        b.c().a("Messenger", "WS: on open: ".concat(str), null);
    }

    @Override // p91.InterfaceC46925b
    public final void onError(@k String str) {
        b.f168184a.getClass();
        b.c().a("Messenger", "WS: on failure: message = ".concat(str), null);
    }

    @Override // p91.InterfaceC46925b
    public final void t0() {
        b.f168184a.getClass();
        b.c().a("Messenger", "WS: on closed", null);
    }
}
