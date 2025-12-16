package com.avito.android.imv_similiar_adverts;

import com.avito.android.deeplink_handler.view.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ImvSimilarAdvertsDeeplinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_similiar_adverts/g;", "Ldagger/internal/h;", "Lcom/avito/android/imv_similiar_adverts/f;", "a", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f170857c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final l f170858a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dv.b f170859b;

    /* compiled from: ImvSimilarAdvertsDeeplinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_similiar_adverts/g$a;", "", "<init>", "()V", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public g(@Y61.k l lVar, @Y61.k dv.b bVar) {
        this.f170858a = lVar;
        this.f170859b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        j jVar = (j) this.f170858a.get();
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f170859b.get();
        f170857c.getClass();
        return new f(jVar, interfaceC4053a);
    }
}
