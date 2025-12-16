package com.avito.android.imv_similiar_adverts;

import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import tk0.InterfaceC48681a;

/* compiled from: ImvSimilarAdvertsInteractorImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_similiar_adverts/p;", "Ldagger/internal/h;", "Lcom/avito/android/imv_similiar_adverts/o;", "a", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f170934b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC48681a> f170935a;

    /* compiled from: ImvSimilarAdvertsInteractorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_similiar_adverts/p$a;", "", "<init>", "()V", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public p(@Y61.k Provider<InterfaceC48681a> provider) {
        this.f170935a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC48681a interfaceC48681a = this.f170935a.get();
        f170934b.getClass();
        return new o(interfaceC48681a);
    }
}
