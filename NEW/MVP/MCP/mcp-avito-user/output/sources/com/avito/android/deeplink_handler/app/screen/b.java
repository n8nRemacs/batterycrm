package com.avito.android.deeplink_handler.app.screen;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.view.M0;
import com.avito.android.CalledFrom;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.H;
import com.avito.android.util.V2;
import com.avito.android.util.architecture_components.D;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kv.C43501a;
import l41.g;
import l41.r;

/* compiled from: DeeplinkHandlerActivityViewModel.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/app/screen/b;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/deeplink_handler/app/screen/a;", "c", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b extends M0 implements com.avito.android.deeplink_handler.app.screen.a {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f134483E;

    /* renamed from: J, reason: collision with root package name */
    @l
    public final CalledFrom f134484J;

    /* renamed from: K, reason: collision with root package name */
    @k
    public final D<G0> f134485K = new D<>();

    /* compiled from: DeeplinkHandlerActivityViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "", "test", "(Lkv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T> f134486b = new a<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return L.f(((C43501a) obj).f413260a.f134521b, "default_deeplink_handler");
        }
    }

    /* compiled from: DeeplinkHandlerActivityViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.deeplink_handler.app.screen.b$b, reason: collision with other inner class name */
    public static final class C4044b<T> implements g {
        public C4044b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            b.this.f134485K.postValue(G0.f406611a);
        }
    }

    /* compiled from: DeeplinkHandlerActivityViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/deeplink_handler/app/screen/b$c;", "", "<init>", "()V", "", "REQUEST_KEY", "Ljava/lang/String;", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    static {
        new c(null);
    }

    @Inject
    public b(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @l CalledFrom calledFrom) {
        this.f134483E = aVar;
        this.f134484J = calledFrom;
        V2.f318762a.c("DeeplinkHandlerActivityViewModelImpl", "init", null);
        aVar.d9().N(a.f134486b).t0(new C4044b());
    }

    @Override // com.avito.android.deeplink_handler.app.screen.a
    /* renamed from: Z0, reason: from getter */
    public final D getF134485K() {
        return this.f134485K;
    }

    @Override // com.avito.android.deeplink_handler.app.screen.a
    public final void g(@k DeepLink deepLink) {
        V2.f318762a.c("DeeplinkHandlerActivityViewModelImpl", "handleDeeplink " + deepLink, null);
        Bundle bundle = new Bundle(1);
        H.c(bundle, this.f134484J);
        this.f134483E.r6(bundle, deepLink, "default_deeplink_handler");
    }
}
