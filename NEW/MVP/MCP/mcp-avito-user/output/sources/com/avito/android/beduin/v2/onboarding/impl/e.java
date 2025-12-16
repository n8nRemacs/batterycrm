package com.avito.android.beduin.v2.onboarding.impl;

import Y61.k;
import android.app.Application;
import dagger.internal.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinV2OnboardingIntentFactoryImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/v2/onboarding/impl/e;", "Ldagger/internal/h;", "Lcom/avito/android/beduin/v2/onboarding/impl/c;", "a", "_avito_beduin-v2-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements dagger.internal.h<c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f104724b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f104725a;

    /* compiled from: BeduinV2OnboardingIntentFactoryImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/v2/onboarding/impl/e$a;", "", "<init>", "()V", "_avito_beduin-v2-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@k l lVar) {
        this.f104725a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f104725a.f393949a;
        f104724b.getClass();
        return new c(application);
    }
}
