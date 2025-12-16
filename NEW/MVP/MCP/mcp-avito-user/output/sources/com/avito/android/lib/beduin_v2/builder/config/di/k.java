package com.avito.android.lib.beduin_v2.builder.config.di;

import com.avito.android.util.C;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinV2ConfigurationTask_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/builder/config/di/k;", "Ldagger/internal/h;", "Lcom/avito/android/lib/beduin_v2/builder/config/di/BeduinV2ConfigurationTask;", "a", "_design-modules_beduin-v2_config_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k implements dagger.internal.h<BeduinV2ConfigurationTask> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f175495b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<C> f175496a;

    /* compiled from: BeduinV2ConfigurationTask_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/builder/config/di/k$a;", "", "<init>", "()V", "_design-modules_beduin-v2_config_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public k(@Y61.k Provider<C> provider) {
        this.f175496a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C c12 = this.f175496a.get();
        f175495b.getClass();
        return new BeduinV2ConfigurationTask(c12);
    }
}
