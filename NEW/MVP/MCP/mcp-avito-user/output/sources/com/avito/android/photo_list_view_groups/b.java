package com.avito.android.photo_list_view_groups;

import android.view.ViewGroup;
import androidx.recyclerview.widget.C23424o;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.photo_list_view.AbstractC33209c;
import com.avito.android.photo_list_view.G;
import com.avito.android.photo_list_view.InterfaceC33208b;
import com.avito.android.photo_list_view_groups.q;
import com.avito.android.remote.model.category_parameters.ImageAction;
import com.avito.android.remote.model.category_parameters.ImageBadgeGroup;
import com.avito.android.remote.model.category_parameters.ImageGroup;
import com.avito.android.util.R0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: PhotoItemGroupsImageListAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_list_view_groups/b;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/avito/android/photo_list_view_groups/view_holders/m;", "b", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends RecyclerView.Adapter<com.avito.android.photo_list_view_groups.view_holders.m> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h f218477c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g80.d f218478d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final List<ImageGroup> f218479e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final List<ImageBadgeGroup> f218480f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final List<ImageAction> f218481g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final g f218482h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC6557b f218483i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C43238h f218484j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public RecyclerView f218485k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public Object f218486l;

    /* compiled from: PhotoItemGroupsImageListAdapter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Lcom/avito/android/photo_list_view_groups/q;", "result", "Lkotlin/G0;", "<anonymous>", "(Ljava/util/Map;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.photo_list_view_groups.PhotoItemGroupsImageListAdapter$1", f = "PhotoItemGroupsImageListAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<Map<String, ? extends q>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f218487q;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = b.this.new a(continuation);
            aVar.f218487q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(Map<String, ? extends q> map, Continuation<? super G0> continuation) {
            return ((a) create(map, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            q qVar;
            AbstractC33209c dVar;
            Object next;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Map map = (Map) this.f218487q;
            b bVar = b.this;
            ?? r12 = bVar.f218486l;
            Iterable<Object> iterable = (Iterable) r12;
            ArrayList arrayList = new ArrayList(C42745f0.q(iterable, 10));
            for (Object objC : iterable) {
                if ((objC instanceof G) && ((qVar = (q) map.get(((G) objC).f218068a)) != null || (qVar = (q) map.get(((G) objC).f218072e)) != null)) {
                    if (qVar instanceof q.b) {
                        dVar = AbstractC33209c.e.f218160a;
                    } else if (qVar instanceof q.c) {
                        Iterator<T> it = bVar.f218480f.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (L.f(((ImageBadgeGroup) next).getId(), ((q.c) qVar).f218642b)) {
                                break;
                            }
                        }
                        ImageBadgeGroup imageBadgeGroup = (ImageBadgeGroup) next;
                        dVar = imageBadgeGroup != null ? new AbstractC33209c.d(imageBadgeGroup.getTitle(), imageBadgeGroup.getAppearance()) : AbstractC33209c.b.f218156a;
                    } else {
                        if (!(qVar instanceof q.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        dVar = AbstractC33209c.b.f218156a;
                    }
                    objC = G.c((G) objC, null, dVar, null, 479);
                }
                arrayList.add(objC);
            }
            bVar.f218486l = arrayList;
            C23424o.a(new c(arrayList, r12), true).b(bVar);
            return G0.f406611a;
        }
    }

    /* compiled from: PhotoItemGroupsImageListAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view_groups/b$b;", "", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.photo_list_view_groups.b$b, reason: collision with other inner class name */
    public interface InterfaceC6557b {
        @Y61.k
        com.avito.android.photo_list_view_groups.view_holders.d a(@Y61.k Y41.l lVar, @Y61.k g gVar, @Y61.k g80.d dVar);

        @Y61.k
        com.avito.android.photo_list_view_groups.view_holders.a b(@Y61.k Y41.l lVar, @Y61.k g gVar, @Y61.k b bVar, @Y61.k List list, @Y61.k List list2, @Y61.k h hVar, @Y61.k g80.d dVar);

        @Y61.k
        com.avito.android.photo_list_view_groups.view_holders.f c(@Y61.k Y41.l lVar, @Y61.k g gVar, @Y61.k List list, @Y61.k List list2, @Y61.k h hVar, @Y61.k g80.d dVar);

        @Y61.k
        com.avito.android.photo_list_view_groups.view_holders.j d(@Y61.k Y41.l lVar, @Y61.k g gVar, @Y61.k h hVar);
    }

    public b(@Y61.k h hVar, @Y61.k g80.d dVar, @Y61.k List<ImageGroup> list, @Y61.k List<ImageBadgeGroup> list2, @Y61.k List<ImageAction> list3, @Y61.k g gVar, @Y61.k InterfaceC6557b interfaceC6557b, @Y61.k R0 r02) {
        this.f218477c = hVar;
        this.f218478d = dVar;
        this.f218479e = list;
        this.f218480f = list2;
        this.f218481g = list3;
        this.f218482h = gVar;
        this.f218483i = interfaceC6557b;
        C43238h c43238hA = U.a(r02.b());
        this.f218484j = c43238hA;
        this.f218486l = C42784z0.f406748b;
        C43175k.K(new C43197r1(new a(null), C43175k.n(hVar.getF218624R(), 500L)), c43238hA);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return ((Collection) this.f218486l).size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i12) {
        if (L.f(((InterfaceC33208b) this.f218486l.get(i12)).getF218092a(), "9223372036854775806")) {
            return 0;
        }
        if (((InterfaceC33208b) this.f218486l.get(i12)).getF218094c() instanceof InterfaceC33208b.InterfaceC6540b.C6541b) {
            return 3;
        }
        return !(((InterfaceC33208b) this.f218486l.get(i12)).getF218094c() instanceof InterfaceC33208b.InterfaceC6540b.a) ? 2 : 1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Y61.l
    public final Integer j(int i12) {
        InterfaceC33208b interfaceC33208b = (InterfaceC33208b) C42745f0.K(i12, this.f218486l);
        if (interfaceC33208b == null) {
            return null;
        }
        Iterable iterable = (Iterable) this.f218486l;
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj instanceof G) {
                arrayList.add(obj);
            }
        }
        return Integer.valueOf(arrayList.indexOf(interfaceC33208b));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(@Y61.k RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f218485k = recyclerView;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        ((com.avito.android.photo_list_view_groups.view_holders.m) c12).B80((InterfaceC33208b) this.f218486l.get(i12));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        d dVar = new d(viewGroup);
        g gVar = this.f218482h;
        InterfaceC6557b interfaceC6557b = this.f218483i;
        if (i12 == 0) {
            return interfaceC6557b.d(dVar, gVar, this.f218477c);
        }
        if (i12 == 2) {
            return interfaceC6557b.c(dVar, gVar, this.f218479e, this.f218481g, this.f218477c, this.f218478d);
        }
        if (i12 == 3) {
            return interfaceC6557b.a(dVar, gVar, this.f218478d);
        }
        return interfaceC6557b.b(dVar, gVar, this, this.f218479e, this.f218481g, this.f218477c, this.f218478d);
    }
}
