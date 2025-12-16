package com.avito.android.remote.parse.adapter;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SearchDeviceResourcesProvider_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/parse/adapter/S;", "Ldagger/internal/h;", "Lcom/avito/android/remote/parse/adapter/Q;", "a", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class S implements dagger.internal.h<Q> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f254227b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f254228a;

    /* compiled from: SearchDeviceResourcesProvider_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/parse/adapter/S$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public S(@Y61.k dagger.internal.l lVar) {
        this.f254228a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f254228a.f393949a;
        f254227b.getClass();
        return new Q(application);
    }
}
