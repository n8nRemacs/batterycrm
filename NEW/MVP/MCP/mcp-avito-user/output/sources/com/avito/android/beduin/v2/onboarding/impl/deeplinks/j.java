package com.avito.android.beduin.v2.onboarding.impl.deeplinks;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinV2OnboardingDeepLinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/v2/onboarding/impl/deeplinks/j;", "Ldagger/internal/h;", "Lcom/avito/android/beduin/v2/onboarding/impl/deeplinks/f;", "a", "_avito_beduin-v2-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j implements dagger.internal.h<f> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f104721c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e f104722a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final i f104723b;

    /* compiled from: BeduinV2OnboardingDeepLinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/v2/onboarding/impl/deeplinks/j$a;", "", "<init>", "()V", "_avito_beduin-v2-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public j(@Y61.k e eVar, @Y61.k i iVar) {
        this.f104722a = eVar;
        this.f104723b = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f104722a.get();
        h hVar = (h) this.f104723b.get();
        f104721c.getClass();
        return new f(dVar, hVar);
    }
}
