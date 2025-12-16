package com.avito.android.brandspace.interactor;

import Y61.k;
import Y61.l;
import android.os.SystemClock;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.brandspace.interactor.BrandspaceAnalyticsInteractor;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import gj.InterfaceC40691b;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.m;
import io.reactivex.rxjava3.internal.operators.single.W;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import l41.g;

/* compiled from: BrandspaceAnalyticsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/brandspace/interactor/a;", "Lcom/avito/android/brandspace/interactor/BrandspaceAnalyticsInteractor;", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements BrandspaceAnalyticsInteractor {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f107738a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC40691b f107739b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public m f107740c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f107741d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f107742e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public List<? extends BeduinAction> f107743f = C42784z0.f406748b;

    /* renamed from: g, reason: collision with root package name */
    public long f107744g = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f107745h = -1;

    /* compiled from: BrandspaceAnalyticsInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.brandspace.interactor.a$a, reason: collision with other inner class name */
    public static final class C3223a<T> implements g {
        public C3223a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            a aVar = a.this;
            aVar.f107744g = -1L;
            aVar.f107740c = null;
            aVar.f();
        }
    }

    @Inject
    public a(@k InterfaceC35745a5 interfaceC35745a5, @k InterfaceC40691b interfaceC40691b) {
        this.f107738a = interfaceC35745a5;
        this.f107739b = interfaceC40691b;
    }

    @Override // com.avito.android.brandspace.interactor.BrandspaceAnalyticsInteractor
    @k
    public final BrandspaceAnalyticsInteractor.State H() {
        return new BrandspaceAnalyticsInteractor.State(this.f107745h, this.f107741d, this.f107742e);
    }

    @Override // com.avito.android.brandspace.interactor.BrandspaceAnalyticsInteractor
    public final void a() {
        if (this.f107745h == -1 || this.f107742e || this.f107740c != null) {
            return;
        }
        this.f107744g = SystemClock.elapsedRealtime();
        W wZ2 = I.q(G0.f406611a).g(this.f107745h, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).z(this.f107738a.e());
        C3223a c3223a = new C3223a();
        final V2 v22 = V2.f318762a;
        this.f107740c = (m) wZ2.x(c3223a, new g() { // from class: com.avito.android.brandspace.interactor.a.b
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        });
    }

    @Override // com.avito.android.brandspace.interactor.BrandspaceAnalyticsInteractor
    public final void b(@k List<? extends BeduinAction> list) {
        if (this.f107741d) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.f107739b.o((BeduinAction) it.next());
        }
        this.f107741d = true;
    }

    @Override // com.avito.android.brandspace.interactor.BrandspaceAnalyticsInteractor
    public final void c(@k BrandspaceAnalyticsInteractor.State state) {
        this.f107745h = state.f107735b;
        this.f107741d = state.f107736c;
        this.f107742e = state.f107737d;
    }

    @Override // com.avito.android.brandspace.interactor.BrandspaceAnalyticsInteractor
    public final void d() {
        m mVar = this.f107740c;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
        this.f107740c = null;
        if (this.f107744g != -1) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f107744g;
            this.f107745h = jElapsedRealtime;
            this.f107744g = -1L;
            if (jElapsedRealtime <= 0) {
                f();
            }
        }
    }

    @Override // com.avito.android.brandspace.interactor.BrandspaceAnalyticsInteractor
    public final void e(long j12, @k List<? extends BeduinAction> list) {
        this.f107745h = TimeUnit.SECONDS.toMillis(j12);
        this.f107743f = list;
        a();
    }

    public final void f() {
        if (this.f107742e) {
            return;
        }
        Iterator<T> it = this.f107743f.iterator();
        while (it.hasNext()) {
            this.f107739b.o((BeduinAction) it.next());
        }
        this.f107742e = true;
    }
}
