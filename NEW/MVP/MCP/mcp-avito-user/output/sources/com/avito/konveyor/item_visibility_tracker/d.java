package com.avito.konveyor.item_visibility_tracker;

import Y61.k;
import Y61.l;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.V2;
import com.avito.konveyor.item_visibility_tracker.b;
import com.jakewharton.rxbinding4.recyclerview.n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.ranges.j;
import kotlin.ranges.s;

/* compiled from: ItemVisibilityTracker.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/konveyor/item_visibility_tracker/d;", "Lcom/avito/konveyor/item_visibility_tracker/b;", "a", "_common_konveyor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements com.avito.konveyor.item_visibility_tracker.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<WV0.a> f338537a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f338538b;

    /* renamed from: d, reason: collision with root package name */
    @l
    public N f338540d;

    /* renamed from: f, reason: collision with root package name */
    @l
    public UV0.a<?> f338542f;

    /* renamed from: h, reason: collision with root package name */
    @l
    public com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.f f338544h;

    /* renamed from: j, reason: collision with root package name */
    @l
    public e f338546j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public f f338547k;

    /* renamed from: m, reason: collision with root package name */
    @l
    public WeakReference<RecyclerView> f338549m;

    /* renamed from: c, reason: collision with root package name */
    @k
    public Rect f338539c = new Rect();

    /* renamed from: e, reason: collision with root package name */
    @k
    public final HashMap<TrackKey, TrackedInfo> f338541e = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Handler f338543g = new Handler();

    /* renamed from: i, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f338545i = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: l, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.subjects.b<G0> f338548l = io.reactivex.rxjava3.subjects.b.N0();

    /* renamed from: n, reason: collision with root package name */
    @k
    public final HashSet<TrackKey> f338550n = new HashSet<>();

    /* renamed from: o, reason: collision with root package name */
    @k
    public final Rect f338551o = new Rect();

    /* renamed from: p, reason: collision with root package name */
    @k
    public final Rect f338552p = new Rect();

    /* compiled from: ItemVisibilityTracker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/konveyor/item_visibility_tracker/d$a;", "", "_common_konveyor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f338553a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Bundle f338554b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ArrayList f338555c = new ArrayList();

        public a(@l Bundle bundle, boolean z12) {
            this.f338553a = z12;
            this.f338554b = bundle;
        }

        @k
        public final void a(@k WV0.a aVar) {
            this.f338555c.add(aVar);
        }

        @k
        public final d b() {
            ArrayList parcelableArrayList;
            Object next;
            d dVar = new d(this.f338555c, this.f338553a);
            Bundle bundle = this.f338554b;
            if (bundle != null && (parcelableArrayList = bundle.getParcelableArrayList("key_tracked_info_list")) != null) {
                j jVarP = s.p(s.r(0, parcelableArrayList.size()), 2);
                int i12 = jVarP.f406905b;
                int i13 = jVarP.f406906c;
                int i14 = jVarP.f406907d;
                if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                    while (true) {
                        TrackKey trackKey = (TrackKey) parcelableArrayList.get(i12);
                        TrackedInfo trackedInfo = (TrackedInfo) parcelableArrayList.get(i12 + 1);
                        Iterator<T> it = dVar.f338537a.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (((WV0.a) next).getClass().equals(trackedInfo.f338525b)) {
                                break;
                            }
                        }
                        WV0.a aVar = (WV0.a) next;
                        if (aVar != null) {
                            HashMap<TrackKey, TrackedInfo> map = dVar.f338541e;
                            trackedInfo.f338528e = aVar;
                            map.put(trackKey, trackedInfo);
                        }
                        if (i12 == i13) {
                            break;
                        }
                        i12 += i14;
                    }
                }
            }
            return dVar;
        }
    }

    /* compiled from: ItemVisibilityTracker.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/recyclerview/k;", "it", "Lkotlin/G0;", "accept", "(Lcom/jakewharton/rxbinding4/recyclerview/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ RecyclerView f338557c;

        public b(RecyclerView recyclerView) {
            this.f338557c = recyclerView;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            d.this.m(this.f338557c, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k List<? extends WV0.a> list, boolean z12) {
        this.f338537a = list;
        this.f338538b = z12;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b
    public final void a(@k RecyclerView recyclerView, @l Rect rect) {
        this.f338545i.b(n.a(recyclerView).n0(200L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new b(recyclerView)));
        if (rect != null) {
            this.f338539c = rect;
        }
        this.f338549m = new WeakReference<>(recyclerView);
        this.f338544h = new com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.f(this, 7);
        e eVar = new e(this, recyclerView);
        this.f338546j = eVar;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(eVar);
        }
        f fVar = new f(this, recyclerView);
        this.f338547k = fVar;
        recyclerView.addOnAttachStateChangeListener(fVar);
        m(recyclerView, false);
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b
    public final void b(int i12, int i13, int i14, int i15) {
        Rect rect = new Rect(i12, i13, i14, i15);
        if (L.f(this.f338539c, rect)) {
            return;
        }
        this.f338539c = rect;
        n();
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b
    public final void c(@k UV0.a<?> aVar) {
        this.f338542f = aVar;
        if (this.f338538b || this.f338541e.isEmpty()) {
            return;
        }
        Iterator<T> it = com.avito.konveyor.util.g.b(aVar).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            HashSet<TrackKey> hashSet = this.f338550n;
            if (!zHasNext) {
                k(hashSet, true);
                hashSet.clear();
                return;
            }
            Object next = it.next();
            Iterator<T> it2 = j(next).iterator();
            while (it2.hasNext()) {
                b.InterfaceC10495b interfaceC10495b = (b.InterfaceC10495b) next;
                hashSet.add(new TrackKey(interfaceC10495b.getClass(), interfaceC10495b.getF270103g(), ((WV0.a) it2.next()).getClass()));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.konveyor.item_visibility_tracker.b
    public final void d(@l Y41.a<Rect> aVar) {
        this.f338540d = (N) aVar;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b
    @k
    public final Bundle d0() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (Map.Entry<TrackKey, TrackedInfo> entry : this.f338541e.entrySet()) {
            arrayList.add(entry.getKey());
            arrayList.add(entry.getValue());
        }
        bundle.putParcelableArrayList("key_tracked_info_list", arrayList);
        return bundle;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b
    @k
    public final io.reactivex.rxjava3.subjects.b<G0> e() {
        return this.f338548l;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b
    public final boolean f() {
        return this.f338545i.g() > 0;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b
    public final void g(@k RecyclerView recyclerView) {
        f fVar = this.f338547k;
        if (fVar != null) {
            recyclerView.removeOnAttachStateChangeListener(fVar);
            this.f338547k = null;
        }
        e eVar = this.f338546j;
        if (eVar != null) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter != null) {
                adapter.unregisterAdapterDataObserver(eVar);
            }
            this.f338546j = null;
        }
        this.f338543g.removeCallbacksAndMessages(null);
        this.f338545i.e();
        this.f338542f = null;
        this.f338544h = null;
        k(B0.f406639b, false);
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b
    @k
    public final List<WV0.a> getFilters() {
        return this.f338537a;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b
    public final void h() {
        RecyclerView recyclerView;
        WeakReference<RecyclerView> weakReference = this.f338549m;
        if (weakReference == null || (recyclerView = weakReference.get()) == null) {
            return;
        }
        m(recyclerView, false);
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b
    @k
    /* renamed from: i, reason: from getter */
    public final Rect getF338539c() {
        return this.f338539c;
    }

    public final List<WV0.a> j(Object obj) {
        if (!(obj instanceof b.InterfaceC10495b)) {
            return C42784z0.f406748b;
        }
        List<WV0.a> list = this.f338537a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((WV0.a) obj2).a((b.InterfaceC10495b) obj)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public final void k(Set<TrackKey> set, boolean z12) {
        Iterator<Map.Entry<TrackKey, TrackedInfo>> it = this.f338541e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<TrackKey, TrackedInfo> next = it.next();
            if (!set.contains(next.getKey())) {
                TrackKey key = next.getKey();
                TrackedInfo value = next.getValue();
                WV0.a aVar = value.f338528e;
                if (aVar != null) {
                    z = z12 || !((aVar.f17931b && value.d()) || (aVar.f17930a && !value.d()));
                    c cVar = value.f338529f;
                    if (cVar != null) {
                        value.e(null);
                        this.f338543g.removeCallbacks(cVar);
                        if (!z) {
                            V2.f318762a.c("ItemVisibilityTracker", "Paused Tracking with left duration: " + value.c() + ", " + key.f338523c + ' ' + key.f338522b, null);
                        }
                        if (value.d()) {
                            l(key, value);
                        }
                    }
                }
                if (z) {
                    V2.f318762a.c("ItemVisibilityTracker", "Removed from Tracking with left duration: " + next.getValue().c() + ", " + next.getKey().f338523c + ' ' + next.getKey().f338522b, null);
                    it.remove();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(com.avito.konveyor.item_visibility_tracker.TrackKey r8, com.avito.konveyor.item_visibility_tracker.TrackedInfo r9) {
        /*
            r7 = this;
            r0 = 0
            r9.e(r0)
            WV0.a r1 = r9.f338528e
            if (r1 == 0) goto Lb
            long r1 = r1.f17933d
            goto Ld
        Lb:
            r1 = 0
        Ld:
            r9.f338526c = r1
            UV0.a<?> r1 = r7.f338542f
            if (r1 == 0) goto L61
            UV0.b r1 = com.avito.konveyor.util.g.b(r1)
            kotlin.collections.I0 r1 = kotlin.collections.C42745f0.S0(r1)
            java.util.Iterator r1 = r1.iterator()
        L1f:
            r2 = r1
            kotlin.collections.J0 r2 = (kotlin.collections.J0) r2
            java.util.Iterator<T> r3 = r2.f406646b
            boolean r3 = r3.hasNext()
            if (r3 == 0) goto L50
            java.lang.Object r2 = r2.next()
            r3 = r2
            kotlin.collections.H0 r3 = (kotlin.collections.H0) r3
            T r3 = r3.f406644b
            boolean r4 = r3 instanceof com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
            if (r4 == 0) goto L1f
            java.lang.Class<?> r4 = r8.f338522b
            java.lang.Class r5 = r3.getClass()
            boolean r4 = kotlin.jvm.internal.L.f(r4, r5)
            if (r4 == 0) goto L1f
            com.avito.konveyor.item_visibility_tracker.b$b r3 = (com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b) r3
            long r3 = r3.getF270103g()
            long r5 = r8.f338523c
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L1f
            goto L51
        L50:
            r2 = r0
        L51:
            kotlin.collections.H0 r2 = (kotlin.collections.H0) r2
            if (r2 == 0) goto L61
            T r1 = r2.f406644b
            com.avito.konveyor.item_visibility_tracker.b$b r1 = (com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b) r1
            com.avito.konveyor.item_visibility_tracker.a r3 = new com.avito.konveyor.item_visibility_tracker.a
            int r2 = r2.f406643a
            r3.<init>(r2, r1)
            goto L62
        L61:
            r3 = r0
        L62:
            if (r3 == 0) goto L90
            com.avito.android.util.V2 r1 = com.avito.android.util.V2.f318762a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Tracked: "
            r2.<init>(r4)
            long r4 = r8.f338523c
            r2.append(r4)
            r4 = 32
            r2.append(r4)
            java.lang.Class<?> r8 = r8.f338522b
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            java.lang.String r2 = "ItemVisibilityTracker"
            r1.c(r2, r8, r0)
            WV0.a r8 = r9.f338528e
            if (r8 == 0) goto L90
            com.avito.konveyor.item_visibility_tracker.b$b r9 = r3.f338531b
            int r0 = r3.f338530a
            r8.b(r0, r9)
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.konveyor.item_visibility_tracker.d.l(com.avito.konveyor.item_visibility_tracker.TrackKey, com.avito.konveyor.item_visibility_tracker.TrackedInfo):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0153  */
    /* JADX WARN: Type inference failed for: r2v0, types: [Y41.a, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r7v12, types: [T, com.avito.konveyor.item_visibility_tracker.TrackedInfo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [T, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(androidx.recyclerview.widget.RecyclerView r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.konveyor.item_visibility_tracker.d.m(androidx.recyclerview.widget.RecyclerView, boolean):void");
    }

    public final void n() {
        com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.f fVar = this.f338544h;
        if (fVar != null) {
            Handler handler = this.f338543g;
            handler.removeCallbacks(fVar);
            handler.postDelayed(fVar, 200L);
        }
    }
}
