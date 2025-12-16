package com.avito.android.deeplink_handler.handler.registry.result;

import Ru.b;
import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_events.registry.d;
import com.avito.android.deeplink_handler.handler.bundle.DeeplinkBundleSaver;
import ev.AbstractC40161a;
import ev.AbstractC40162b;
import io.reactivex.rxjava3.internal.operators.observable.O;
import iv.C42114a;
import kotlin.Metadata;
import kv.C43501a;
import l41.g;

/* compiled from: DeeplinkHandlerCompositeResultsObserver.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink_handler/handler/registry/result/a;", "", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C42114a f134573a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DeeplinkBundleSaver f134574b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final d f134575c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final BK0.a<C43501a> f134576d = new BK0.a<>();

    /* renamed from: e, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f134577e = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: DeeplinkHandlerCompositeResultsObserver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "result", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.deeplink_handler.handler.registry.result.a$a, reason: collision with other inner class name */
    public static final class C4051a<T> implements g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f134579c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AbstractC40161a<DeepLink> f134580d;

        public C4051a(String str, AbstractC40161a<DeepLink> abstractC40161a) {
            this.f134579c = str;
            this.f134580d = abstractC40161a;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C43501a c43501a = (C43501a) obj;
            a aVar = a.this;
            aVar.getClass();
            com.avito.android.deeplink_handler.handler.bundle.a aVar2 = c43501a.f413260a;
            aVar.f134575c.b(new b.d(aVar2.f134520a, c43501a.f413261b, aVar2.f134521b, aVar2.f134522c));
            AbstractC40161a<DeepLink> abstractC40161a = this.f134580d;
            String str = abstractC40161a.f395444b;
            aVar.f134574b.a(this.f134579c, str);
            aVar.f134573a.f405355a.remove(abstractC40161a.f395444b);
            abstractC40161a.g();
            aVar.f134576d.onNext(c43501a);
        }
    }

    public a(@k C42114a c42114a, @k DeeplinkBundleSaver deeplinkBundleSaver, @k d dVar) {
        this.f134573a = c42114a;
        this.f134574b = deeplinkBundleSaver;
        this.f134575c = dVar;
    }

    public final void a(@k AbstractC40161a<DeepLink> abstractC40161a, @k String str) {
        this.f134577e.b(abstractC40161a.f395447e.t0(new C4051a(str, abstractC40161a)));
    }

    public final void b(@k AbstractC40162b<DeepLink> abstractC40162b) {
        O oK2 = abstractC40162b.f395449c.K(new g() { // from class: com.avito.android.deeplink_handler.handler.registry.result.a.b
            @Override // l41.g
            public final void accept(Object obj) {
                C43501a c43501a = (C43501a) obj;
                a aVar = a.this;
                aVar.getClass();
                com.avito.android.deeplink_handler.handler.bundle.a aVar2 = c43501a.f413260a;
                aVar.f134575c.b(new b.d(aVar2.f134520a, c43501a.f413261b, aVar2.f134521b, aVar2.f134522c));
            }
        });
        final BK0.a<C43501a> aVar = this.f134576d;
        this.f134577e.b(oK2.t0(new g() { // from class: com.avito.android.deeplink_handler.handler.registry.result.a.c
            @Override // l41.g
            public final void accept(Object obj) {
                aVar.onNext((C43501a) obj);
            }
        }));
    }
}
