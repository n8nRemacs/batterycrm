package com.avito.android.deeplink_handler.handler.composite;

import X41.n;
import Y61.k;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.w;
import gv.InterfaceC40741c;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import pv.C47150c;

/* compiled from: CompositeDeeplinkHandlerStorageImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/handler/composite/f;", "Ldagger/internal/h;", "Lcom/avito/android/deeplink_handler/handler/composite/d;", "a", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements h<d> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f134541d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<com.avito.android.deeplink_handler.handler.registry.a> f134542a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C47150c f134543b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l f134544c;

    /* compiled from: CompositeDeeplinkHandlerStorageImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/handler/composite/f$a;", "", "<init>", "()V", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public f(@k Provider provider, @k C47150c c47150c, @k l lVar) {
        this.f134542a = provider;
        this.f134543b = c47150c;
        this.f134544c = lVar;
    }

    @n
    @k
    public static final f a(@k Provider provider, @k C47150c c47150c, @k l lVar) {
        f134541d.getClass();
        return new f(provider, c47150c, lVar);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = g.b(this.f134542a);
        h31.e eVarA = g.a(w.a(this.f134543b));
        InterfaceC40741c interfaceC40741c = (InterfaceC40741c) this.f134544c.f393949a;
        f134541d.getClass();
        return new d(eVarB, eVarA, interfaceC40741c);
    }
}
