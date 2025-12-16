package com.avito.android.util.rx3.concurrent;

import Y61.k;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.disposables.d;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.g;

/* compiled from: RxExecutor.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/util/rx3/concurrent/a;", "Ljava/util/concurrent/Executor;", "Lio/reactivex/rxjava3/disposables/d;", "_common_rx_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements Executor, d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final y f319018b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.d<Runnable> f319019c;

    public a(@k H h12) {
        com.jakewharton.rxrelay3.d<Runnable> dVarM = C31685o.m();
        this.f319019c = dVarM;
        this.f319018b = (y) dVarM.j0(h12).t0(new g() { // from class: com.avito.android.util.rx3.concurrent.a.a
            @Override // l41.g
            public final void accept(Object obj) {
                ((Runnable) obj).run();
            }
        });
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        y yVar = this.f319018b;
        yVar.getClass();
        DisposableHelper.a(yVar);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@k Runnable runnable) {
        this.f319019c.accept(runnable);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    /* renamed from: i */
    public final boolean getF318621e() {
        return this.f319018b.getF318621e();
    }
}
