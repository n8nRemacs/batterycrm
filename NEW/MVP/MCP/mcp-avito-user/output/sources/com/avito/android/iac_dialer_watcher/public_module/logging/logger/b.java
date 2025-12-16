package com.avito.android.iac_dialer_watcher.public_module.logging.logger;

import Y61.k;
import Y61.l;
import com.avito.android.util.V2;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacLogs.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/public_module/logging/logger/b;", "Lcom/avito/android/iac_dialer_watcher/public_module/logging/logger/c;", "<init>", "()V", "_avito_iac-dialer-watcher_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f168184a = new b();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final Object f168185b = C42727D.b(LazyThreadSafetyMode.f406614b, a.f168186l);

    /* compiled from: IacLogs.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/public_module/logging/logger/d;", "invoke", "()Lcom/avito/android/iac_dialer_watcher/public_module/logging/logger/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<d> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f168186l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final d invoke() {
            return new d();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @k
    public static d c() {
        return (d) f168185b.getValue();
    }

    public final void a(@k String str, @k String str2, @l Throwable th2) {
        c().a(str, str2, th2);
        V2.f318762a.c(str, str2, th2);
    }

    public final void b(@k String str, @k String str2, @l Throwable th2) {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.a aVarB = c().b();
        if (aVarB != null) {
            aVarB.a(6, str, str2, th2);
        }
        V2 v22 = V2.f318762a;
        if (th2 == null) {
            th2 = new Exception(str2);
        }
        v22.a(str, str2, th2);
    }

    public final void d(@k String str, @k String str2, @l Exception exc) {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.a aVarB = c().b();
        if (aVarB != null) {
            aVarB.a(5, str, str2, exc);
        }
        V2.f318762a.j(str, str2, exc);
    }
}
