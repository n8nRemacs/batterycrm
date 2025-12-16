package com.avito.android.beduin.common.advert;

import androidx.view.InterfaceC22982O;
import androidx.view.InterfaceC23042i0;
import androidx.view.Lifecycle;
import cj.InterfaceC27207e;
import com.avito.android.beduin.common.utils.C28809e;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import lj.InterfaceC43779a;
import lj.d;

/* compiled from: BeduinViewedAdvertManagerImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/advert/s;", "Lcj/e;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class s implements InterfaceC27207e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.viewed.d f100567a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.viewed.a f100568b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f100569c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.m f100570d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f100571e = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f100572f = new LinkedHashSet();

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f100573g = new LinkedHashMap();

    /* compiled from: BeduinViewedAdvertManagerImpl.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u001c\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u00040\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lej/a;", "Lcom/avito/android/beduin_models/BeduinModel;", "Lej/e;", "Lcom/avito/android/beduin_shared/model/component/BeduinComponentItem;", "it", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            s.c(s.this);
        }
    }

    /* compiled from: BeduinViewedAdvertManagerImpl.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"com/avito/android/beduin/common/advert/s$c", "Landroidx/lifecycle/O;", "Lkotlin/G0;", "onResume", "()V", "onPause", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC22982O {
        public c() {
        }

        @InterfaceC23042i0(Lifecycle.Event.ON_RESUME)
        private final void onResume() {
            s sVar = s.this;
            Iterator it = sVar.f100573g.values().iterator();
            while (it.hasNext()) {
                sVar.e((InterfaceC43779a) it.next());
            }
            sVar.f100571e.b(sVar.f100568b.getF81002a().j0(sVar.f100569c.e()).t0(new u(sVar)));
            s.c(sVar);
        }

        @InterfaceC23042i0(Lifecycle.Event.ON_PAUSE)
        public final void onPause() {
            s sVar = s.this;
            io.reactivex.rxjava3.internal.observers.m mVar = sVar.f100570d;
            if (mVar != null) {
                DisposableHelper.a(mVar);
            }
            sVar.f100570d = null;
            sVar.f100571e.e();
        }
    }

    @Inject
    public s(@Y61.k com.avito.android.advert.viewed.d dVar, @Y61.k com.avito.android.advert.viewed.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f100567a = dVar;
        this.f100568b = aVar;
        this.f100569c = interfaceC35745a5;
    }

    public static final void c(s sVar) {
        io.reactivex.rxjava3.internal.observers.m mVar = sVar.f100570d;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
        sVar.f100570d = null;
        sVar.f100570d = (io.reactivex.rxjava3.internal.observers.m) I.C(150L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).s(sVar.f100569c.e()).x(new t(sVar), io.reactivex.rxjava3.internal.functions.a.f401996f);
    }

    @Override // cj.InterfaceC27207e
    public final void a(@Y61.k com.avito.android.beduin.common.form.c cVar) {
        this.f100573g.put(cVar.f103350r, cVar);
        e(cVar);
    }

    @Override // cj.InterfaceC27207e
    public final void b(@Y61.k Lifecycle lifecycle) {
        lifecycle.a(new c());
    }

    public final void d(Set<String> set, Y41.l<? super String, Boolean> lVar) {
        for (InterfaceC43779a interfaceC43779a : this.f100573g.values()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C28809e.d(new r(set, lVar, linkedHashMap), interfaceC43779a.a());
            interfaceC43779a.h(new d.e(linkedHashMap));
        }
    }

    public final void e(InterfaceC43779a interfaceC43779a) {
        C41981q0 f103348p = interfaceC43779a.getF103348p();
        a aVar = new a();
        final V2 v22 = V2.f318762a;
        l41.g<? super Throwable> gVar = new l41.g() { // from class: com.avito.android.beduin.common.advert.s.b
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        };
        f103348p.getClass();
        this.f100571e.b(f103348p.v0(aVar, gVar, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }
}
