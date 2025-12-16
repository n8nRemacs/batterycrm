package com.avito.android.offlinization;

import com.avito.android.I1;
import com.avito.android.ab_tests.configs.OfflinizationTestGroup;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: OfflinizationFeatureStrategyImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/offlinization/q;", "Lcom/avito/android/offlinization/p;", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class q implements p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final I1 f208591a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final OfflinizationTestGroup f208592b;

    @Inject
    public q(@Y61.k I1 i12, @Y61.k OfflinizationTestGroup offlinizationTestGroup) {
        this.f208591a = i12;
        this.f208592b = offlinizationTestGroup;
    }

    @Override // com.avito.android.offlinization.p
    public final boolean a() {
        if (f()) {
            I1 i12 = this.f208591a;
            i12.getClass();
            kotlin.reflect.n<Object> nVar = I1.f67278k0[55];
            if (((Boolean) i12.f67309c0.a().invoke()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.avito.android.offlinization.p
    public final boolean b() {
        if (f()) {
            I1 i12 = this.f208591a;
            i12.getClass();
            kotlin.reflect.n<Object> nVar = I1.f67278k0[56];
            if (((Boolean) i12.f67311d0.a().invoke()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.avito.android.offlinization.p
    public final boolean c() {
        I1 i12 = this.f208591a;
        i12.getClass();
        kotlin.reflect.n<Object> nVar = I1.f67278k0[58];
        return ((Boolean) i12.f67315f0.a().invoke()).booleanValue();
    }

    @Override // com.avito.android.offlinization.p
    public final boolean d() {
        if (f()) {
            I1 i12 = this.f208591a;
            i12.getClass();
            kotlin.reflect.n<Object> nVar = I1.f67278k0[57];
            if (((Boolean) i12.f67313e0.a().invoke()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.avito.android.offlinization.p
    public final boolean e() {
        if (this.f208592b != OfflinizationTestGroup.f67889e) {
            I1 i12 = this.f208591a;
            i12.getClass();
            kotlin.reflect.n<Object> nVar = I1.f67278k0[53];
            if (!((Boolean) i12.f67305a0.a().invoke()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.avito.android.offlinization.p
    public final boolean f() {
        if (!C42745f0.U(OfflinizationTestGroup.f67888d, OfflinizationTestGroup.f67889e).contains(this.f208592b)) {
            I1 i12 = this.f208591a;
            i12.getClass();
            kotlin.reflect.n<Object> nVar = I1.f67278k0[53];
            if (!((Boolean) i12.f67305a0.a().invoke()).booleanValue()) {
                return false;
            }
        }
        return true;
    }
}
