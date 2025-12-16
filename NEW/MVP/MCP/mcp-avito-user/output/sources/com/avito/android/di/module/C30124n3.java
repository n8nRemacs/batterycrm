package com.avito.android.di.module;

import android.app.Application;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CoreModule_ProvideDefaultSharedPreferencesFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/n3;", "Ldagger/internal/h;", "Landroid/content/SharedPreferences;", "a", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.di.module.n3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30124n3 implements dagger.internal.h<SharedPreferences> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f144472b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f144473a;

    /* compiled from: CoreModule_ProvideDefaultSharedPreferencesFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/n3$a;", "", "<init>", "()V", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.di.module.n3$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C30124n3(@Y61.k C30080j3 c30080j3, @Y61.k dagger.internal.l lVar) {
        this.f144473a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f144473a.f393949a;
        f144472b.getClass();
        return application.getSharedPreferences(androidx.preference.s.a(application), 0);
    }
}
