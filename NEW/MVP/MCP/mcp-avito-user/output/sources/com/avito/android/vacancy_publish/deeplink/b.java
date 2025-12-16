package com.avito.android.vacancy_publish.deeplink;

import Y61.k;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.AdvertPublicationLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Navigation;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: VacancyPublishDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vacancy_publish/deeplink/b;", "Lev/a;", "Lcom/avito/android/vacancy_publish/deeplink/VacancyPublishLink;", "a", "_avito_job_vacancy-publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b extends AbstractC40161a<VacancyPublishLink> {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final Object f319230i;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f319231f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final C25719a f319232g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final AdvertPublicationLink.Public f319233h = new AdvertPublicationLink.Public(new Navigation(null, Integer.valueOf(Integer.parseInt("111")), null, null, f319230i, null, null, null, null, 493, null), null, false, null, false, null, null, null, null, null, 1022, null);

    /* compiled from: VacancyPublishDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/vacancy_publish/deeplink/b$a;", "", "<init>", "()V", "", "", "CONFIG", "Ljava/util/Map;", "_avito_job_vacancy-publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f319230i = P0.g(new Q("tree", "android"), new Q("layout", "android_add"));
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    @Inject
    public b(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k C25719a c25719a) {
        this.f319231f = aVar;
        this.f319232g = c25719a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        AuthSource authSource = AuthSource.f92703g0;
        c cVar = new c(this, str);
        this.f319232g.a((VacancyPublishLink) deepLink, this, authSource, cVar);
    }
}
