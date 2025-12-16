package com.avito.android.deep_linking;

import android.net.Uri;
import android.os.Bundle;
import androidx.view.M0;
import com.avito.android.CalledFrom;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.C28414f0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.kotlin.A1;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kv.C43501a;

/* compiled from: AppShortcutsDeeplinkViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/v;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/deep_linking/u;", "_avito_deep-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.deep_linking.v, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29698v extends M0 implements InterfaceC29697u {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f134064E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final x f134065J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f134066K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.mapping.checker.c f134067L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<G0> f134068M = new com.avito.android.util.architecture_components.D<>();

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f134069N = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: AppShortcutsDeeplinkViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.deep_linking.v$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f134070l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            V2.f318762a.a("DEFAULT_TAG", "AppShortcutsDeeplinkViewModel", th2);
            return G0.f406611a;
        }
    }

    /* compiled from: AppShortcutsDeeplinkViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "invoke", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.deep_linking.v$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<C43501a, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C43501a c43501a) {
            com.avito.android.util.architecture_components.D<G0> d12 = C29698v.this.f134068M;
            G0 g02 = G0.f406611a;
            d12.setValue(g02);
            return g02;
        }
    }

    @Inject
    public C29698v(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k x xVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.deeplink_handler.mapping.checker.c cVar) {
        this.f134064E = interfaceC28373a;
        this.f134065J = xVar;
        this.f134066K = aVar;
        this.f134067L = cVar;
    }

    @Override // com.avito.android.deep_linking.InterfaceC29697u
    public final void E(@Y61.k Uri uri) {
        DeepLink deepLinkE = this.f134065J.e(uri);
        CalledFrom.AndroidShortcuts androidShortcuts = new CalledFrom.AndroidShortcuts(deepLinkE.getPath());
        boolean zA2 = this.f134067L.a(deepLinkE);
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f134066K;
        if (zA2) {
            Bundle bundle = new Bundle();
            com.avito.android.util.H.c(bundle, androidShortcuts);
            b.a.a(aVar, deepLinkE, null, bundle, 2);
            this.f134064E.c(new C28414f0(androidShortcuts.f67241b));
        } else {
            this.f134068M.setValue(G0.f406611a);
        }
        this.f134069N.b(A1.h(aVar.d9(), a.f134070l, new b(), 2));
    }

    @Override // com.avito.android.deep_linking.InterfaceC29697u
    /* renamed from: P7, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF134068M() {
        return this.f134068M;
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f134069N.e();
    }
}
