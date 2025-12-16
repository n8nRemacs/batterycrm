package com.avito.android.beduin.v2.page.impl;

import android.os.Bundle;
import android.view.Window;
import androidx.compose.runtime.internal.P;
import androidx.core.view.L0;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23057q;
import androidx.view.Lifecycle;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: BeduinV2SystemBarsUpdatesHandler.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/B;", "", "<init>", "()V", "a", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public boolean f104823a;

    /* compiled from: BeduinV2SystemBarsUpdatesHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/B$a;", "", "<init>", "()V", "", "KEY_SCENARIO_STATUS_BAR_APPEARANCE_LIGHT", "Ljava/lang/String;", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BeduinV2SystemBarsUpdatesHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "Lkotlin/G0;", "action", "invoke", "(LY41/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Y41.a<? extends G0>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f104824l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f104825m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z12, boolean z13) {
            super(1);
            this.f104824l = z12;
            this.f104825m = z13;
        }

        @Override // Y41.l
        public final G0 invoke(Y41.a<? extends G0> aVar) {
            Y41.a<? extends G0> aVar2 = aVar;
            if (!this.f104824l && this.f104825m) {
                aVar2.invoke();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinV2SystemBarsUpdatesHandler.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/beduin/v2/page/impl/B$c", "Landroidx/lifecycle/q;", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC23057q {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Y41.a<G0>, G0> f104826b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ B f104827c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ L0 f104828d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f104829e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f104830f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Window f104831g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f104832h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f104833i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Lifecycle f104834j;

        /* compiled from: BeduinV2SystemBarsUpdatesHandler.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a extends N implements Y41.a<G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ Window f104835l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ int f104836m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ int f104837n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Window window, int i12, int i13) {
                super(0);
                this.f104835l = window;
                this.f104836m = i12;
                this.f104837n = i13;
            }

            @Override // Y41.a
            public final G0 invoke() {
                int i12 = this.f104836m;
                Window window = this.f104835l;
                window.setStatusBarColor(i12);
                window.setNavigationBarColor(this.f104837n);
                return G0.f406611a;
            }
        }

        /* compiled from: BeduinV2SystemBarsUpdatesHandler.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class b extends N implements Y41.a<G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ Window f104838l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Window window) {
                super(0);
                this.f104838l = window;
            }

            @Override // Y41.a
            public final G0 invoke() {
                Window window = this.f104838l;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(0);
                return G0.f406611a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(Y41.l<? super Y41.a<G0>, G0> lVar, B b12, L0 l02, boolean z12, boolean z13, Window window, int i12, int i13, Lifecycle lifecycle) {
            this.f104826b = lVar;
            this.f104827c = b12;
            this.f104828d = l02;
            this.f104829e = z12;
            this.f104830f = z13;
            this.f104831g = window;
            this.f104832h = i12;
            this.f104833i = i13;
            this.f104834j = lifecycle;
        }

        @Override // androidx.view.InterfaceC23057q
        public final void onDestroy(@Y61.k InterfaceC22983P interfaceC22983P) {
            this.f104834j.c(this);
        }

        @Override // androidx.view.InterfaceC23057q
        public final void onPause(@Y61.k InterfaceC22983P interfaceC22983P) {
            ((b) this.f104826b).invoke(new a(this.f104831g, this.f104832h, this.f104833i));
            L0 l02 = this.f104828d;
            this.f104827c.f104823a = l02.c();
            l02.e(this.f104829e);
            l02.d(this.f104830f);
        }

        @Override // androidx.view.InterfaceC23057q
        public final void onResume(@Y61.k InterfaceC22983P interfaceC22983P) {
            ((b) this.f104826b).invoke(new b(this.f104831g));
            this.f104828d.e(this.f104827c.f104823a);
        }
    }

    static {
        new a(null);
    }

    public final void a(@Y61.l Bundle bundle, @Y61.k InterfaceC22983P interfaceC22983P, @Y61.k Window window, boolean z12, boolean z13) {
        b bVar = new b(z12, z13);
        L0 l02 = new L0(window, window.getDecorView());
        int statusBarColor = window.getStatusBarColor();
        int navigationBarColor = window.getNavigationBarColor();
        boolean zC2 = l02.c();
        boolean zB2 = l02.b();
        this.f104823a = (!z13 || bundle == null) ? zC2 : bundle.getBoolean("scenario_status_bar_appearance_light");
        Lifecycle lifecycle = interfaceC22983P.getLifecycle();
        lifecycle.a(new c(bVar, this, l02, zC2, zB2, window, statusBarColor, navigationBarColor, lifecycle));
    }
}
