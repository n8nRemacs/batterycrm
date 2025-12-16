package com.avito.android.remote.error;

import android.app.Application;
import com.avito.android.util.InterfaceC35741a1;
import dagger.internal.u;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ApiErrorThrowableConverterImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/error/i;", "Ldagger/internal/h;", "Lcom/avito/android/remote/error/g;", "a", "_avito-discouraged_api"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class i implements dagger.internal.h<g> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f253428d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f253429a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.remote.analytics.n> f253430b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final u f253431c;

    /* compiled from: ApiErrorThrowableConverterImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/error/i$a;", "", "<init>", "()V", "_avito-discouraged_api"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public i(@Y61.k dagger.internal.l lVar, @Y61.k u uVar, @Y61.k Provider provider) {
        this.f253429a = lVar;
        this.f253430b = provider;
        this.f253431c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f253429a.f393949a;
        com.avito.android.remote.analytics.n nVar = this.f253430b.get();
        InterfaceC35741a1 interfaceC35741a1 = (InterfaceC35741a1) this.f253431c.get();
        f253428d.getClass();
        return new g(application, nVar, interfaceC35741a1);
    }
}
