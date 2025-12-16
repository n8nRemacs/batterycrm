package com.avito.android.iac_dialer_watcher.impl_module.splitter.features;

import Y61.k;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;

/* compiled from: IacDialerWatcherFeatures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/splitter/features/a;", "Lcom/avito/android/A0;", "<init>", "()V", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public class a extends A0 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f168141e;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final A0.a f168142b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final A0.a f168143c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final A0.a f168144d;

    static {
        h0 h0Var = new h0(a.class, "logPrinting", "getLogPrinting()Lcom/avito/android/toggle/Feature;", 0);
        n0 n0Var = m0.f406844a;
        f168141e = new n[]{n0Var.i(h0Var), C0.k(a.class, "crashRegisterWatcherListener", "getCrashRegisterWatcherListener()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(a.class, "logSendingShortTask", "getLogSendingShortTask()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public a() {
        Owners owners = Owners.f210442S;
        this.f168142b = A0.u(this, "Iac. Print saving logs in LogCat", "iac_log_printing", Boolean.FALSE, false, 0, owners, 40);
        Boolean bool = Boolean.TRUE;
        this.f168143c = A0.u(this, "Отслеживать краши во время iac звонка", "iac_crash_register_watcher_listener", bool, false, 0, owners, 56);
        this.f168144d = A0.u(this, "Перевести на shortTask механизм отправки логов после звонка", "iac_logSendingShortTask", bool, false, 0, owners, 56);
    }
}
