package com.avito.android.lib.beduin_v2.feature.cache;

import Y61.k;
import com.avito.android.I1;
import com.avito.android.K1;
import com.avito.android.offlinization.beduin.e;
import dagger.internal.h;
import dagger.internal.u;
import jT.InterfaceC42305a;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinRequestWithPatternCache_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/cache/d;", "Ldagger/internal/h;", "Lcom/avito/android/lib/beduin_v2/feature/cache/c;", "a", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements h<c> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f176005e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<InterfaceC42305a> f176006a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<e> f176007b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final u f176008c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final K1 f176009d;

    /* compiled from: BeduinRequestWithPatternCache_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/cache/d$a;", "", "<init>", "()V", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k Provider provider, @k Provider provider2, @k u uVar, @k K1 k12) {
        this.f176006a = provider;
        this.f176007b = provider2;
        this.f176008c = uVar;
        this.f176009d = k12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC42305a interfaceC42305a = this.f176006a.get();
        e eVar = this.f176007b.get();
        Set set = (Set) this.f176008c.get();
        I1 i12 = (I1) this.f176009d.get();
        f176005e.getClass();
        return new c(interfaceC42305a, eVar, set, i12);
    }
}
