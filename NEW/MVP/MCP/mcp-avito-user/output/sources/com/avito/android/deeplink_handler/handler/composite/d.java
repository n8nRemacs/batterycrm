package com.avito.android.deeplink_handler.handler.composite;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.view.M0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import gv.InterfaceC40741c;
import io.reactivex.rxjava3.core.B;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C;
import io.reactivex.rxjava3.internal.operators.observable.W;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kv.C43501a;
import l41.o;
import pv.C47149b;
import pv.InterfaceC47148a;

/* compiled from: CompositeDeeplinkHandlerStorageImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_handler/handler/composite/d;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/deeplink_handler/handler/composite/c;", "a", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d extends M0 implements com.avito.android.deeplink_handler.handler.composite.c {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final h31.e<com.avito.android.deeplink_handler.handler.registry.a> f134525E;

    /* renamed from: J, reason: collision with root package name */
    @k
    public final h31.e<C47149b> f134526J;

    /* renamed from: K, reason: collision with root package name */
    @k
    public final AtomicBoolean f134527K = new AtomicBoolean(false);

    /* renamed from: L, reason: collision with root package name */
    @l
    public volatile InterfaceC40741c f134528L;

    /* renamed from: M, reason: collision with root package name */
    public volatile boolean f134529M;

    /* compiled from: CompositeDeeplinkHandlerStorageImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/deeplink_handler/handler/composite/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CompositeDeeplinkHandlerStorageImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "com/avito/android/deeplink_handler/handler/composite/e", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f134531m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.f134531m = str;
        }

        @Override // Y41.a
        public final G0 invoke() {
            d.this.f134525E.get().h(this.f134531m);
            return G0.f406611a;
        }
    }

    /* compiled from: CompositeDeeplinkHandlerStorageImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "com/avito/android/deeplink_handler/handler/composite/e", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ DeepLink f134533m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f134534n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Bundle f134535o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(DeepLink deepLink, String str, Bundle bundle) {
            super(0);
            this.f134533m = deepLink;
            this.f134534n = str;
            this.f134535o = bundle;
        }

        @Override // Y41.a
        public final G0 invoke() {
            d.this.f134525E.get().r6(this.f134535o, this.f134533m, this.f134534n);
            return G0.f406611a;
        }
    }

    /* compiled from: CompositeDeeplinkHandlerStorageImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.deeplink_handler.handler.composite.d$d, reason: collision with other inner class name */
    public static final class C4047d extends N implements Y41.a<G0> {
        public C4047d() {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
        @Override // Y41.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke() {
            /*
                r5 = this;
                com.avito.android.deeplink_handler.handler.composite.d r0 = com.avito.android.deeplink_handler.handler.composite.d.this
                h31.e<com.avito.android.deeplink_handler.handler.registry.a> r0 = r0.f134525E
                java.lang.Object r0 = r0.get()
                com.avito.android.deeplink_handler.handler.registry.a r0 = (com.avito.android.deeplink_handler.handler.registry.a) r0
                r0.wc()
                com.avito.android.deeplink_handler.handler.composite.d r0 = com.avito.android.deeplink_handler.handler.composite.d.this
                h31.e<pv.b> r0 = r0.f134526J
                r0.get()
                com.avito.android.deeplink_handler.handler.composite.d r0 = com.avito.android.deeplink_handler.handler.composite.d.this
                gv.c r0 = r0.f134528L
                r1 = 0
                if (r0 == 0) goto L28
                androidx.savedstate.e r0 = r0.a()     // Catch: java.lang.IllegalStateException -> L26
                if (r0 == 0) goto L28
                androidx.savedstate.c r0 = r0.getSavedStateRegistry()     // Catch: java.lang.IllegalStateException -> L26
                goto L29
            L26:
                r0 = move-exception
                goto L31
            L28:
                r0 = r1
            L29:
                if (r0 == 0) goto L3a
                java.lang.Class<com.avito.android.deeplink_handler.handler.registry.lifecycle.a> r2 = com.avito.android.deeplink_handler.handler.registry.lifecycle.a.class
                r0.d(r2)     // Catch: java.lang.IllegalStateException -> L26
                goto L3a
            L31:
                com.avito.android.util.V2 r2 = com.avito.android.util.V2.f318762a
                java.lang.String r3 = "CompositeDeeplinkHandler"
                java.lang.String r4 = "RegisterRecreation called after stop"
                r2.a(r3, r4, r0)
            L3a:
                com.avito.android.deeplink_handler.handler.composite.d r0 = com.avito.android.deeplink_handler.handler.composite.d.this
                r2 = 1
                r0.f134529M = r2
                com.avito.android.deeplink_handler.handler.composite.d r0 = com.avito.android.deeplink_handler.handler.composite.d.this
                r0.f134528L = r1
                kotlin.G0 r0 = kotlin.G0.f406611a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.deeplink_handler.handler.composite.d.C4047d.invoke():java.lang.Object");
        }
    }

    /* compiled from: CompositeDeeplinkHandlerStorageImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/G0;", "it", "Lio/reactivex/rxjava3/core/E;", "Lkv/a;", "apply", "(Lkotlin/G0;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T, R> implements o {
        public e() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return d.this.f134525E.get().V9();
        }
    }

    /* compiled from: CompositeDeeplinkHandlerStorageImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "com/avito/android/deeplink_handler/handler/composite/e", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ B f134538l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(B b12) {
            super(0);
            this.f134538l = b12;
        }

        @Override // Y41.a
        public final G0 invoke() {
            G0 g02 = G0.f406611a;
            this.f134538l.onNext(g02);
            return g02;
        }
    }

    /* compiled from: CompositeDeeplinkHandlerStorageImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "com/avito/android/deeplink_handler/handler/composite/e", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Bundle f134540m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Bundle bundle) {
            super(0);
            this.f134540m = bundle;
        }

        @Override // Y41.a
        public final G0 invoke() {
            d.this.f134525E.get().Qb(this.f134540m);
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public d(@k h31.e<com.avito.android.deeplink_handler.handler.registry.a> eVar, @k h31.e<C47149b> eVar2, @k InterfaceC40741c interfaceC40741c) {
        this.f134525E = eVar;
        this.f134526J = eVar2;
        this.f134528L = interfaceC40741c;
    }

    @Override // com.avito.android.deeplink_handler.handler.composite.a
    public final void Qb(@k Bundle bundle) {
        if (this.f134529M) {
            this.f134525E.get().Qb(bundle);
        } else {
            new com.avito.android.deeplink_handler.handler.lifecycle.b(le().b(), new g(bundle));
        }
    }

    @Override // com.avito.android.deeplink_handler.handler.b
    @k
    public final z<C43501a> V9() {
        return new C(new com.avito.android.beduin.ui.screen.fragment.bottom_sheet.c(this, 10)).T(new e(), Integer.MAX_VALUE);
    }

    @Override // com.avito.android.deeplink_handler.handler.b
    @k
    public final W d9() {
        return b.a.b(this);
    }

    @Override // com.avito.android.deeplink_handler.handler.composite.a
    public final void h(@k String str) {
        if (this.f134529M) {
            this.f134525E.get().h(str);
        } else {
            new com.avito.android.deeplink_handler.handler.lifecycle.b(le().b(), new b(str));
        }
    }

    public final void ke() {
        this.f134527K.set(true);
        new com.avito.android.deeplink_handler.handler.lifecycle.b(le().b(), new C4047d());
    }

    public final InterfaceC40741c le() {
        InterfaceC40741c interfaceC40741c = this.f134528L;
        if (interfaceC40741c != null) {
            return interfaceC40741c;
        }
        throw new IllegalArgumentException("Parent must be present until the initialize process is completed");
    }

    @Override // com.avito.android.deeplink_handler.handler.b
    public final void r6(@l Bundle bundle, @k DeepLink deepLink, @l String str) {
        if (this.f134529M) {
            this.f134525E.get().r6(bundle, deepLink, str);
        } else {
            new com.avito.android.deeplink_handler.handler.lifecycle.b(le().b(), new c(deepLink, str, bundle));
        }
    }

    @Override // pv.InterfaceC47151d
    @k
    public final InterfaceC47148a v2() {
        return this.f134526J.get();
    }
}
