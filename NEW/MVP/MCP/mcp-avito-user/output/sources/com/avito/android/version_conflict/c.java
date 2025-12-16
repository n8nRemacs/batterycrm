package com.avito.android.version_conflict;

import com.avito.android.di.module.C30214v6;
import com.google.gson.Gson;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ConfigStorage_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/version_conflict/c;", "Ldagger/internal/h;", "Lcom/avito/android/version_conflict/b;", "a", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f325895c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C30214v6 f325896a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<Gson> f325897b;

    /* compiled from: ConfigStorage_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/version_conflict/c$a;", "", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@Y61.k C30214v6 c30214v6, @Y61.k Provider provider) {
        this.f325896a = c30214v6;
        this.f325897b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        AK0.l lVar = (AK0.l) this.f325896a.get();
        h31.e eVarB = dagger.internal.g.b(this.f325897b);
        f325895c.getClass();
        return new b(lVar, eVarB);
    }
}
