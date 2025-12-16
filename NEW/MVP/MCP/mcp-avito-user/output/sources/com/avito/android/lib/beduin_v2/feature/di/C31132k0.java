package com.avito.android.lib.beduin_v2.feature.di;

import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.Y1;

/* compiled from: BeduinFeatureModule_ProviderImmutableInteractionsFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/k0;", "Ldagger/internal/h;", "Lkotlinx/coroutines/flow/i;", "LdU0/f;", "LX41/o;", "a", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.lib.beduin_v2.feature.di.k0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31132k0 implements dagger.internal.h<InterfaceC43160i<dU0.f>> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f176119b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<Y1<dU0.f>> f176120a;

    /* compiled from: BeduinFeatureModule_ProviderImmutableInteractionsFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/k0$a;", "", "<init>", "()V", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.feature.di.k0$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C31132k0(@Y61.k Provider<Y1<dU0.f>> provider) {
        this.f176120a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Y1<dU0.f> y12 = this.f176120a.get();
        f176119b.getClass();
        L.f176033a.getClass();
        return C43175k.a(y12);
    }
}
