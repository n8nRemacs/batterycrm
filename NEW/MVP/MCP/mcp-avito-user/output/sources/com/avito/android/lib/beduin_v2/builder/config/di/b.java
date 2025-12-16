package com.avito.android.lib.beduin_v2.builder.config.di;

import com.avito.android.P;
import com.avito.android.S;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;

/* compiled from: BeduinBaseUrlModule_ProvideBeduinBaseUrlFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/builder/config/di/b;", "Ldagger/internal/h;", "", "a", "_design-modules_beduin-v2_config_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements dagger.internal.h<String> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f175482b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final S f175483a;

    /* compiled from: BeduinBaseUrlModule_ProvideBeduinBaseUrlFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/builder/config/di/b$a;", "", "<init>", "()V", "_design-modules_beduin-v2_config_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public b(@Y61.k S s5) {
        this.f175483a = s5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        P p12 = (P) this.f175483a.get();
        f175482b.getClass();
        com.avito.android.lib.beduin_v2.builder.config.di.a.f175481a.getClass();
        String strA = p12.a();
        int iN2 = C43066x.N(6, strA, "/");
        return iN2 == -1 ? strA : strA.substring(0, iN2);
    }
}
