package com.avito.android.vacancy_publish.deeplink;

import Y61.k;
import bv.C25719a;
import bv.C25721c;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: VacancyPublishDeeplinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vacancy_publish/deeplink/d;", "Ldagger/internal/h;", "Lcom/avito/android/vacancy_publish/deeplink/b;", "a", "_avito_job_vacancy-publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements h<b> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f319236c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final dagger.internal.f f319237a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C25721c f319238b;

    /* compiled from: VacancyPublishDeeplinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vacancy_publish/deeplink/d$a;", "", "<init>", "()V", "_avito_job_vacancy-publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k dagger.internal.f fVar, @k C25721c c25721c) {
        this.f319237a = fVar;
        this.f319238b = c25721c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) this.f319237a.get();
        C25719a c25719a = (C25719a) this.f319238b.get();
        f319236c.getClass();
        return new b(aVar, c25719a);
    }
}
