package com.avito.android.external_apps.deep_linking;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lv.C43834a;

/* compiled from: ExternalAppLinkHandlerModule_ProvideExternalAppLinkMappingFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/external_apps/deep_linking/d;", "Ldagger/internal/h;", "Llv/a;", "a", "_avito_external-apps_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<C43834a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f155035b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final g f155036a;

    /* compiled from: ExternalAppLinkHandlerModule_ProvideExternalAppLinkMappingFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/external_apps/deep_linking/d$a;", "", "<init>", "()V", "_avito_external-apps_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@Y61.k g gVar) {
        this.f155036a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = this.f155036a;
        f155035b.getClass();
        c.f155034a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ExternalAppLink.class, new h(), new C43834a.b.C11809b(gVar));
    }
}
