package com.avito.android.iac_api_utils.util_module;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.F;
import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: IacApiTrackerImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_api_utils/util_module/i;", "Ldagger/internal/h;", "Lcom/avito/android/iac_api_utils/util_module/b;", "a", "_avito_iac-api-utils_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i implements dagger.internal.h<b> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f164321c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f164322a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u f164323b;

    /* compiled from: IacApiTrackerImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_api_utils/util_module/i$a;", "", "<init>", "()V", "_avito_iac-api-utils_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public i(@Y61.k dagger.internal.f fVar, @Y61.k u uVar) {
        this.f164322a = fVar;
        this.f164323b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f164322a.get();
        F f12 = (F) this.f164323b.get();
        f164321c.getClass();
        return new b(interfaceC28373a, f12);
    }
}
