package com.avito.android.remote.error;

import com.avito.android.P;
import com.avito.android.S;
import com.avito.android.remote.C34383q;
import com.avito.android.remote.InterfaceC34332n;
import com.avito.android.util.C;
import com.google.gson.Gson;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ApiErrorConverter_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/error/e;", "Ldagger/internal/h;", "Lcom/avito/android/remote/error/a;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class e implements dagger.internal.h<com.avito.android.remote.error.a> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f253419e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<Gson> f253420a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<C> f253421b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final S f253422c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C34383q f253423d;

    /* compiled from: ApiErrorConverter_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/error/e$a;", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k S s5, @Y61.k C34383q c34383q) {
        this.f253420a = provider;
        this.f253421b = provider2;
        this.f253422c = s5;
        this.f253423d = c34383q;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Gson gson = this.f253420a.get();
        C c12 = this.f253421b.get();
        P p12 = (P) this.f253422c.get();
        InterfaceC34332n interfaceC34332n = (InterfaceC34332n) this.f253423d.get();
        f253419e.getClass();
        return new com.avito.android.remote.error.a(gson, c12, p12, interfaceC34332n);
    }
}
