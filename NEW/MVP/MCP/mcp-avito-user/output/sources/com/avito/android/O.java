package com.avito.android;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ur.InterfaceC49101b;

/* compiled from: CoreActivityIntentFactoryImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/O;", "Ldagger/internal/h;", "Lcom/avito/android/M;", "a", "_avito_intent-factories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class O implements dagger.internal.h<M> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f67364c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f67365a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ur.e f67366b;

    /* compiled from: CoreActivityIntentFactoryImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/O$a;", "", "<init>", "()V", "_avito_intent-factories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public O(@Y61.k dagger.internal.l lVar, @Y61.k ur.e eVar) {
        this.f67365a = lVar;
        this.f67366b = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f67365a.f393949a;
        InterfaceC49101b interfaceC49101b = (InterfaceC49101b) this.f67366b.get();
        f67364c.getClass();
        return new M(application, interfaceC49101b);
    }
}
