package com.avito.android.analytics_adjust;

import android.annotation.SuppressLint;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.app.task.ApplicationForegroundStartupTask;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.single.G;
import io.reactivex.rxjava3.internal.operators.single.O;
import io.reactivex.rxjava3.internal.operators.single.U;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import uc.InterfaceC49030e;

/* compiled from: SendAnalyticsIdsTask.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/analytics_adjust/SendAnalyticsIdsTask;", "Lcom/avito/android/app/task/ApplicationForegroundStartupTask;", "Lcom/avito/android/analytics/a;", "analytics", "Lcom/avito/android/analytics_adjust/a;", "adjust", "Luc/e;", "myTracker", "<init>", "(Lcom/avito/android/analytics/a;Lcom/avito/android/analytics_adjust/a;Luc/e;)V", "Lkotlin/G0;", "execute", "()V", "Lcom/avito/android/analytics/a;", "Lcom/avito/android/analytics_adjust/a;", "Luc/e;", "_common_analytics-adjust_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SendAnalyticsIdsTask implements ApplicationForegroundStartupTask {

    @Y61.k
    private final InterfaceC28533a adjust;

    @Y61.k
    private final InterfaceC28373a analytics;

    @Y61.k
    private final InterfaceC49030e myTracker;

    /* compiled from: SendAnalyticsIdsTask.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lcom/avito/android/analytics_adjust/y;", "apply-kkpG_O0", "(Ljava/lang/Throwable;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f91201b = new a<>();

        @Override // l41.o
        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            return y.a("");
        }
    }

    /* compiled from: SendAnalyticsIdsTask.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "Lcom/avito/android/analytics_adjust/B;", "apply-2ezRGrQ", "(Ljava/lang/String;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T, R> f91202b = new b<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return B.a((String) obj);
        }
    }

    /* compiled from: SendAnalyticsIdsTask.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lcom/avito/android/analytics_adjust/A;", "apply-sMWyWmA", "(Ljava/lang/Throwable;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T, R> f91203b = new c<>();

        @Override // l41.o
        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            return A.a("");
        }
    }

    /* compiled from: SendAnalyticsIdsTask.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/avito/android/analytics_adjust/y;", "googleAdsId", "Lcom/avito/android/analytics_adjust/B;", "mytrackerId", "Lcom/avito/android/analytics_adjust/h;", "adjustId", "Lcom/avito/android/analytics_adjust/A;", "huaweiId", "Lcom/avito/android/analytics_adjust/s;", "apply-l9VP8cY", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/analytics_adjust/s;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T1, T2, T3, T4, R> implements l41.i {

        /* renamed from: a, reason: collision with root package name */
        public static final d<T1, T2, T3, T4, R> f91204a = new d<>();

        @Override // l41.i
        public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
            return new s(((y) obj).f91253a, ((h) obj3).f91217a, ((A) obj4).f91120a, ((B) obj2).f91189a, null);
        }
    }

    /* compiled from: SendAnalyticsIdsTask.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/analytics_adjust/s;", "event", "Lkotlin/G0;", "accept", "(Lcom/avito/android/analytics_adjust/s;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {
        public e() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            SendAnalyticsIdsTask.this.analytics.c((s) obj);
        }
    }

    /* compiled from: SendAnalyticsIdsTask.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final f<T> f91206b = new f<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.f((Throwable) obj);
        }
    }

    @Inject
    public SendAnalyticsIdsTask(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC28533a interfaceC28533a, @Y61.k InterfaceC49030e interfaceC49030e) {
        this.analytics = interfaceC28373a;
        this.adjust = interfaceC28533a;
        this.myTracker = interfaceC49030e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String execute$lambda$0(SendAnalyticsIdsTask sendAnalyticsIdsTask) {
        return sendAnalyticsIdsTask.myTracker.j();
    }

    @Override // com.avito.android.app.task.ApplicationForegroundStartupTask
    @SuppressLint({"CheckResult"})
    public void execute() {
        U u12 = this.adjust.l().u(a.f91201b);
        O oR2 = new G(new VH0.c(this, 5)).r(b.f91202b);
        O oF2 = this.adjust.f();
        U u13 = this.adjust.getOaid().u(c.f91203b);
        l41.i iVar = d.f91204a;
        Objects.requireNonNull(iVar, "zipper is null");
        I.I(io.reactivex.rxjava3.internal.functions.a.o(iVar), u12, oR2, oF2, u13).x(new e(), f.f91206b);
    }
}
