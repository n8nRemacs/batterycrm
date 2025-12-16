package com.avito.android.advert_core.item_showed_observer;

import Y61.k;
import Y61.l;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.g;

/* compiled from: ItemShowedObserver.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/item_showed_observer/c;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final RecyclerView f83707a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public y f83708b;

    /* renamed from: d, reason: collision with root package name */
    @l
    public a f83710d;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.subjects.e f83709c = new io.reactivex.rxjava3.subjects.e();

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ArrayList f83711e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.advert_core.item_showed_observer.b f83712f = new g() { // from class: com.avito.android.advert_core.item_showed_observer.b
        /* JADX WARN: Type inference failed for: r1v3, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // l41.g
        public final void accept(Object obj) {
            boolean z12;
            e eVar = (e) obj;
            Iterator it = this.f83706b.f83711e.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                aVar.getClass();
                boolean z13 = aVar.f83705c;
                List<Integer> list = aVar.f83703a;
                if ((list instanceof Collection) && list.isEmpty()) {
                    z12 = true;
                } else {
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        int iIntValue = ((Number) it2.next()).intValue();
                        if (eVar.f83716a > iIntValue || iIntValue > eVar.f83717b) {
                            z12 = false;
                            break;
                        }
                    }
                    z12 = true;
                }
                if (!z13 && z12) {
                    aVar.f83705c = true;
                    aVar.f83704b.invoke();
                }
            }
        }
    };

    /* compiled from: ItemShowedObserver.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/advert_core/item_showed_observer/c$a", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.r {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LinearLayoutManager f83713b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f83714c;

        public a(LinearLayoutManager linearLayoutManager, c cVar) {
            this.f83713b = linearLayoutManager;
            this.f83714c = cVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void k(@k RecyclerView recyclerView, int i12, int i13) {
            LinearLayoutManager linearLayoutManager = this.f83713b;
            this.f83714c.f83709c.onNext(new e(linearLayoutManager.H1(), linearLayoutManager.L1()));
        }
    }

    /* compiled from: ItemShowedObserver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements g {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f83715b = new b<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "Error during background tasks invocation", (Throwable) obj);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.avito.android.advert_core.item_showed_observer.b] */
    public c(@k RecyclerView recyclerView) {
        this.f83707a = recyclerView;
    }

    public final void a(int i12, @k Y41.a aVar) {
        ArrayList arrayList = this.f83711e;
        if (arrayList.isEmpty()) {
            c();
        }
        arrayList.add(new com.avito.android.advert_core.item_showed_observer.a(aVar, Collections.singletonList(Integer.valueOf(i12))));
    }

    public final void b(@k ArrayList arrayList, @k Y41.a aVar) {
        ArrayList arrayList2 = this.f83711e;
        if (arrayList2.isEmpty()) {
            c();
        }
        arrayList2.add(new com.avito.android.advert_core.item_showed_observer.a(aVar, arrayList));
    }

    public final void c() {
        RecyclerView recyclerView = this.f83707a;
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        a aVar = this.f83710d;
        if (aVar != null) {
            recyclerView.v0(aVar);
        }
        a aVar2 = new a(linearLayoutManager, this);
        recyclerView.o(aVar2);
        this.f83710d = aVar2;
        y yVar = this.f83708b;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        io.reactivex.rxjava3.subjects.e eVar = this.f83709c;
        eVar.getClass();
        this.f83708b = (y) eVar.D(io.reactivex.rxjava3.internal.functions.a.f401991a).y(250L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).v0(this.f83712f, b.f83715b, io.reactivex.rxjava3.internal.functions.a.f401993c);
    }
}
