package com.avito.android.external_apps.deep_linking;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lv.C43834a;

/* compiled from: ExternalAppLinkHandlerModule_ProvideSendEmailLinkMappingFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/external_apps/deep_linking/f;", "Ldagger/internal/h;", "Llv/a;", "a", "_avito_external-apps_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<C43834a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f155039b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final o f155040a;

    /* compiled from: ExternalAppLinkHandlerModule_ProvideSendEmailLinkMappingFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/external_apps/deep_linking/f$a;", "", "<init>", "()V", "_avito_external-apps_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public f(@Y61.k o oVar) {
        this.f155040a = oVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        o oVar = this.f155040a;
        f155039b.getClass();
        c.f155034a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(SendEmailLink.class, new p(), new C43834a.b.C11809b(oVar));
    }
}
