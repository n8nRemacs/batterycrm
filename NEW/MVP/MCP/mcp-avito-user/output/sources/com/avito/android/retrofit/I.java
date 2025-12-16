package com.avito.android.retrofit;

import com.avito.android.util.C35743a3;
import com.avito.android.util.V2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: NetworkOnMainThreadCheckerOnDebug.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/retrofit/I;", "Lcom/avito/android/retrofit/H;", "a", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class I implements H {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f255094c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<Class<?>> f255095a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Gs.c f255096b;

    /* compiled from: NetworkOnMainThreadCheckerOnDebug.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/retrofit/I$a;", "", "<init>", "()V", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public I() {
        this(null, null, 3, null);
    }

    @Override // com.avito.android.retrofit.H
    public final void a() throws NetworkInitOnMainThreadException {
        if (C35743a3.a()) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            ArrayList arrayList = new ArrayList(stackTrace.length);
            for (StackTraceElement stackTraceElement : stackTrace) {
                arrayList.add(Class.forName(stackTraceElement.getClassName()));
            }
            List<Class<?>> list = this.f255095a;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (arrayList.contains((Class) it.next())) {
                        return;
                    }
                }
            }
            this.f255096b.getClass();
            if (!Gs.c.f6755b.isEmpty()) {
                throw new NetworkInitOnMainThreadException("Network service (Retrofit/Okhttp/Gson) should not be created on main thread. You may want to inject your retrofit service using dagger.Lazy and defer initialization to worker thread using Observable.defer(). See http://links.k.avito.ru/ne for an example.NOTE: This check can be disabled with per_checkNetworkOnMainThread feature.");
            }
            V2 v22 = V2.f318762a;
            f255094c.getClass();
            v22.e("Network service (Retrofit/Okhttp/Gson) should not be created on main thread. You may want to inject your retrofit service using dagger.Lazy and defer initialization to worker thread using Observable.defer(). See http://links.k.avito.ru/ne for an example.NOTE: This check can be disabled with per_checkNetworkOnMainThread feature.\n".concat(C43066x.t0(1500, Arrays.toString(stackTrace).replace(',', '\n'))), null);
        }
    }

    @Override // com.avito.android.retrofit.H
    public final void b() {
        if (C35743a3.a()) {
            throw new IllegalStateException("Initializing network layer on the main thread");
        }
    }

    public I(List list, Gs.c cVar, int i12, C42822w c42822w) {
        list = (i12 & 1) != 0 ? C42784z0.f406748b : list;
        cVar = (i12 & 2) != 0 ? Gs.c.f6754a : cVar;
        this.f255095a = list;
        this.f255096b = cVar;
    }
}
