package com.avito.android.lib.beduin_v2.network.di;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.t;
import dagger.internal.u;
import jT.InterfaceC42305a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinApiModule_ProvideBeduinApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/network/di/b;", "Ldagger/internal/h;", "LjT/a;", "a", "_design-modules_beduin-v2_network_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements dagger.internal.h<InterfaceC42305a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f176397b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final u f176398a;

    /* compiled from: BeduinApiModule_ProvideBeduinApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/network/di/b$a;", "", "<init>", "()V", "_design-modules_beduin-v2_network_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public b(@k u uVar) {
        this.f176398a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f176398a.get();
        f176397b.getClass();
        com.avito.android.lib.beduin_v2.network.di.a.f176396a.getClass();
        InterfaceC42305a interfaceC42305a = (InterfaceC42305a) r02.create(InterfaceC42305a.class);
        t.b(interfaceC42305a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC42305a;
    }
}
