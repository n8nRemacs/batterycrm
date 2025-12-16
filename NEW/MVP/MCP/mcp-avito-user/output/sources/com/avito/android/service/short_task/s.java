package com.avito.android.service.short_task;

import android.content.Context;
import android.os.Bundle;
import androidx.work.BackoffPolicy;
import androidx.work.C23542f;
import androidx.work.C23544h;
import androidx.work.G;
import androidx.work.J;
import androidx.work.NetworkType;
import androidx.work.Q;
import androidx.work.WorkManager;
import androidx.work.c0;
import androidx.work.impl.Y;
import androidx.work.impl.model.H;
import androidx.work.impl.utils.C23593c;
import com.avito.android.service.short_task.ShortTask;
import com.avito.android.util.C;
import com.avito.android.util.V2;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.C43066x;

/* compiled from: WorkManagerScheduler.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service/short_task/s;", "Lcom/avito/android/service/short_task/j;", "_common_job-scheduler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class s implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f274114a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Map<Class<?>, Provider<ShortTask>> f274115b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C f274116c;

    @Inject
    public s(@Y61.k Context context, @Y61.k Map<Class<?>, Provider<ShortTask>> map, @Y61.k C c12) {
        this.f274114a = context;
        this.f274115b = map;
        this.f274116c = c12;
    }

    @Override // com.avito.android.service.short_task.j
    public final void a(@Y61.k Class<? extends ShortTask> cls, @Y61.k ShortTask.NetworkState networkState, boolean z12, boolean z13, boolean z14, boolean z15, long j12, long j13, long j14, boolean z16, @Y61.l Bundle bundle, @Y61.k ShortTask.BackoffPolicy backoffPolicy, long j15) throws Throwable {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Q.a aVar = new Q.a(ShortTaskWorker.class);
        H h12 = aVar.f55483c;
        long millis = timeUnit.toMillis(j12);
        long millis2 = timeUnit.toMillis(j13);
        H.a aVar2 = H.f55793y;
        if (millis < 900000) {
            h12.getClass();
            G.a().getClass();
        }
        h12.f55802h = kotlin.ranges.s.b(millis, 900000L);
        if (millis2 < 300000) {
            G.a().getClass();
        }
        if (millis2 > h12.f55802h) {
            G.a().getClass();
        }
        h12.f55803i = kotlin.ranges.s.i(millis2, 300000L, h12.f55802h);
        d(aVar, cls, networkState, z12, z13, z14, z15, j14, z16, bundle, backoffPolicy, j15);
    }

    @Override // com.avito.android.service.short_task.j
    public final void b(@Y61.k Class<? extends ShortTask> cls) {
        WorkManager.f55428a.getClass();
        C23593c.e(Y.f(this.f274114a), cls.getName());
    }

    @Override // com.avito.android.service.short_task.j
    public final void c(@Y61.k Class<? extends ShortTask> cls, @Y61.k ShortTask.NetworkState networkState, boolean z12, boolean z13, boolean z14, boolean z15, long j12, boolean z16, @Y61.l Bundle bundle, @Y61.k ShortTask.BackoffPolicy backoffPolicy, long j13) throws Throwable {
        d(new J.a(ShortTaskWorker.class), cls, networkState, z12, z13, z14, z15, j12, z16, bundle, backoffPolicy, j13);
    }

    public final void d(c0.a<?, ?> aVar, Class<? extends ShortTask> cls, ShortTask.NetworkState networkState, boolean z12, boolean z13, boolean z14, boolean z15, long j12, boolean z16, Bundle bundle, ShortTask.BackoffPolicy backoffPolicy, long j13) throws Throwable {
        NetworkType networkType;
        C23544h c23544hA;
        BackoffPolicy backoffPolicy2;
        boolean zContainsKey = this.f274115b.containsKey(cls);
        C c12 = this.f274116c;
        if (!zContainsKey) {
            V2.f318762a.m(new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.e.k(cls, "No task for class ")), !c12.l());
            return;
        }
        WorkManager.f55428a.getClass();
        Y yF2 = Y.f(this.f274114a);
        String name = cls.getName();
        if (z16) {
            b(cls);
        }
        C23542f.a aVar2 = new C23542f.a();
        int iOrdinal = networkState.ordinal();
        if (iOrdinal == 0) {
            networkType = NetworkType.f55395b;
        } else if (iOrdinal == 1) {
            networkType = NetworkType.f55396c;
        } else if (iOrdinal == 2) {
            networkType = NetworkType.f55397d;
        } else if (iOrdinal == 3) {
            networkType = NetworkType.f55398e;
        } else {
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
            networkType = NetworkType.f55399f;
        }
        aVar2.b(networkType);
        aVar2.f55501f = z12;
        aVar2.f55500e = z13;
        aVar2.f55496a = z14;
        aVar2.f55497b = z15;
        c0.a aVarF = aVar.a(name).g(j12, TimeUnit.MILLISECONDS).f(aVar2.a());
        if (bundle != null) {
            boolean z17 = !c12.l();
            C23544h.a aVar3 = new C23544h.a();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                boolean z18 = obj instanceof String;
                LinkedHashMap linkedHashMap = aVar3.f55511a;
                if (z18) {
                    linkedHashMap.put(str, (String) obj);
                } else if (obj instanceof Long) {
                    aVar3.c(str, ((Number) obj).longValue());
                } else if (obj instanceof Boolean) {
                    Boolean bool = (Boolean) obj;
                    bool.getClass();
                    linkedHashMap.put(str, bool);
                } else if (obj instanceof Integer) {
                    linkedHashMap.put(str, Integer.valueOf(((Number) obj).intValue()));
                } else {
                    V2 v22 = V2.f318762a;
                    StringBuilder sb2 = new StringBuilder("Error creating ");
                    androidx.appcompat.app.r.C(C23544h.class, sb2, " from Bundle due to unhandled ");
                    sb2.append(obj != null ? obj.getClass().getSimpleName() : null);
                    sb2.append(" extra value.\n                    Add corresponding 'is'-check in 'when' expression.\n                ");
                    v22.m(new IllegalArgumentException(C43066x.E0(sb2.toString())), z17);
                }
            }
            c23544hA = aVar3.a();
        } else {
            c23544hA = C23544h.f55509c;
        }
        c0.a aVarH = aVarF.h(c23544hA);
        int iOrdinal2 = backoffPolicy.ordinal();
        if (iOrdinal2 == 0) {
            backoffPolicy2 = BackoffPolicy.f55355b;
        } else {
            if (iOrdinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            backoffPolicy2 = BackoffPolicy.f55356c;
        }
        c0 c0VarB = aVarH.e(backoffPolicy2, j13, TimeUnit.MILLISECONDS).b();
        yF2.getClass();
        yF2.e(Collections.singletonList(c0VarB));
    }
}
