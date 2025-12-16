package com.avito.android.retrofit;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.Call;

/* compiled from: CompositeCallFactory_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/retrofit/x;", "Ldagger/internal/h;", "Lcom/avito/android/retrofit/w;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class x implements dagger.internal.h<w> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f255199e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u f255200a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C34426s f255201b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C34425q f255202c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f255203d;

    /* compiled from: CompositeCallFactory_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/retrofit/x$a;", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public x(@Y61.k u uVar, @Y61.k C34426s c34426s, @Y61.k C34425q c34425q, @Y61.k dagger.internal.f fVar) {
        this.f255200a = uVar;
        this.f255201b = c34426s;
        this.f255202c = c34425q;
        this.f255203d = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C34427t c34427t = (C34427t) this.f255200a.get();
        r rVar = (r) this.f255201b.get();
        C34423o c34423o = (C34423o) this.f255202c.get();
        Call.Factory factory = (Call.Factory) this.f255203d.get();
        f255199e.getClass();
        return new w(c34427t, rVar, c34423o, factory);
    }
}
