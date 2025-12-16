package ru.ok.tracer.nativebridge;

import android.content.Context;
import defpackage.qqg;
import defpackage.tl7;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import ru.ok.tracer.crash.report.CrashReportInitializer;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ok/tracer/nativebridge/NativeBridgeInitializer;", "Ltl7;", "Lqqg;", "<init>", "()V", "tracer-crash-report-native_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class NativeBridgeInitializer implements tl7 {
    @Override // defpackage.tl7
    public final List a() {
        return Collections.singletonList(CrashReportInitializer.class);
    }

    @Override // defpackage.tl7
    public final Object b(Context context) {
        try {
            NativeBridgeInstaller.a();
        } catch (Throwable unused) {
        }
        return qqg.a;
    }
}
