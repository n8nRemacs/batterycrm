package com.avito.android.iac_dialer_watcher.public_module.logging.logger;

import Y61.k;
import Y61.l;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* compiled from: IacLogs.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/public_module/logging/logger/d;", "Lcom/avito/android/iac_dialer_watcher/public_module/logging/logger/c;", "<init>", "()V", "_avito_iac-dialer-watcher_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @l
    public h31.e<a> f168187a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AtomicBoolean f168188b = new AtomicBoolean(false);

    public final void a(@k String str, @k String str2, @l Throwable th2) {
        a aVarB = b();
        if (aVarB != null) {
            aVarB.a(3, str, str2, th2);
        }
    }

    public final a b() {
        h31.e<a> eVar = this.f168187a;
        if (eVar != null) {
            return eVar.get();
        }
        return null;
    }

    public final void c(@k String str, @k String str2) {
        a aVarB = b();
        if (aVarB != null) {
            aVarB.a(4, str, str2, null);
        }
    }
}
