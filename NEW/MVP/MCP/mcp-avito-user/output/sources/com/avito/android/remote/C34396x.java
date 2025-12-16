package com.avito.android.remote;

import Uj0.InterfaceC15529a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ConfigApiRepository_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/x;", "Ldagger/internal/h;", "Lcom/avito/android/remote/u;", "a", "_avito-discouraged_avito-api_config"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.remote.x, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C34396x implements dagger.internal.h<C34390u> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f254406b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f254407a;

    /* compiled from: ConfigApiRepository_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/x$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_config"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.remote.x$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C34396x(@Y61.k dagger.internal.u uVar) {
        this.f254407a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC15529a interfaceC15529a = (InterfaceC15529a) this.f254407a.get();
        f254406b.getClass();
        return new C34390u(interfaceC15529a);
    }
}
