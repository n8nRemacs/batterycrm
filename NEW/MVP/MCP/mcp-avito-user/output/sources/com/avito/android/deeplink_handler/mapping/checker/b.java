package com.avito.android.deeplink_handler.mapping.checker;

import Y61.k;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import mv.C44139a;
import mv.C44140b;

/* compiled from: AppDeeplinkMappingRegistrationChecker_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/mapping/checker/b;", "Ldagger/internal/h;", "Lcom/avito/android/deeplink_handler/mapping/checker/a;", "a", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements h<com.avito.android.deeplink_handler.mapping.checker.a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f134586b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C44140b f134587a;

    /* compiled from: AppDeeplinkMappingRegistrationChecker_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/mapping/checker/b$a;", "", "<init>", "()V", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public b(@k C44140b c44140b) {
        this.f134587a = c44140b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C44139a c44139a = (C44139a) this.f134587a.get();
        f134586b.getClass();
        return new com.avito.android.deeplink_handler.mapping.checker.a(c44139a);
    }
}
